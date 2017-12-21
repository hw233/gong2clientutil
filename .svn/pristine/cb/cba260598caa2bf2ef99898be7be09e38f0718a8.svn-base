using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.IO;
using System.Data;
using System.Data.OleDb;
using System.ComponentModel;
using System.Runtime.InteropServices;

using Excel = Microsoft.Office.Interop.Excel;


namespace TableEditor
{
    class ExcelUtils
    {
        //xlsx to csv 批量导出
        public static bool XlsxToCsv(BackgroundWorker bw, List<string> modify = null)
        {
            Excel.Application elapp = new Excel.Application();
            Excel.Workbooks elwbs;
            Excel.Workbook elwb;
            int sheetcount = 0;
            try
            {
                elwbs = elapp.Workbooks;
                DirectoryInfo baseDir = new DirectoryInfo(Setting.tablePath + Setting.EXCEL);
                FileInfo[] files = baseDir.GetFiles("*.xls*");
                double size = files.Length;
                double cnt = 0;
                elapp.DisplayAlerts = false;
                foreach (FileInfo file in files)
                {
                    if (bw.CancellationPending)
                    {
                        return false;
                    }
                    if (file.Name.StartsWith("~$")) continue;
                    if (modify != null && !modify.Contains(file.Name)) continue;
                    elwb = (Excel.Workbook)elwbs.Open(file.FullName);

                    foreach (Excel.Worksheet elsheet in elwb.Worksheets)
                    {
                        Excel.Range range = elsheet.Cells.Find("BEGIN", Type.Missing, Type.Missing, Excel.XlLookAt.xlWhole, Excel.XlSearchOrder.xlByColumns);
                        if (range == null) continue;
                        int rowid = range.Row;
                        string name = elsheet.Cells[rowid, 2].Value as string;
                        if (name == null || name == "") continue;
                        bw.ReportProgress((int)(cnt / size * 100), "正在保存: " + name + "(" + file.Name + ")");
                        elsheet.SaveAs(Setting.tablePath + Setting.CSV + name, Excel.XlFileFormat.xlCSV);
                        ++sheetcount;
                    }
                    elwb.Close();
                    ++cnt;
                }

                elapp.DisplayAlerts = true;
            }
            catch (Exception ex)
            {
                ConfigUtils.Error(ex.Message, ex.StackTrace);
                return false;
            }
            finally
            {
                bw.ReportProgress(100, string.Format("共保存{0}个文件", sheetcount));
                Close(elapp);
            }
            return true;
        }

        //单个Excel或SheetToCsv
        public static bool XlsxToCsv(BackgroundWorker bw, string filename, string sheetName = null)
        {

            Excel.Application elapp = new Excel.Application();
            Excel.Workbook elwb;
            double cnt = 0;
            try
            {
                elwb = (Excel.Workbook)elapp.Workbooks.Open(filename);
                elapp.DisplayAlerts = false;

                if (sheetName == null)
                {
                    double size = elwb.Worksheets.Count;

                    foreach (Excel.Worksheet elsheet in elwb.Worksheets)
                    {
                        if (bw.CancellationPending)
                        {
                            return false;
                        }

                        Excel.Range range = elsheet.Cells.Find("BEGIN", Type.Missing, Type.Missing, Excel.XlLookAt.xlWhole, Excel.XlSearchOrder.xlByColumns);
                        if (range == null) continue;
                        int rowid = range.Row;
                        string name = elsheet.Cells[rowid, 2].Value as string;
                        if (name == null || name == "") continue;
                        elsheet.SaveAs(Setting.tablePath + Setting.CSV + name, Excel.XlFileFormat.xlCSV);
                        bw.ReportProgress((int)(cnt / size * 100), "已保存: " + elsheet.Name);
                        ++cnt;
                    }
                }
                else
                {
                    Excel.Worksheet sheet = elwb.Worksheets[sheetName];
                    Excel.Range range = sheet.Cells.Find("BEGIN", Type.Missing, Type.Missing, Excel.XlLookAt.xlWhole, Excel.XlSearchOrder.xlByColumns);
                    if (range != null)
                    {
                        int rowid = range.Row;
                        string name = sheet.Cells[rowid, 2].Value as string;
                        if (name != null && name != "")
                        {
                            sheet.SaveAs(Setting.tablePath + Setting.CSV + name, Excel.XlFileFormat.xlCSV);
                            ++cnt;
                        }
                    }
                }
                elapp.DisplayAlerts = true;
            }
            catch (Exception ex)
            {
                ConfigUtils.Error(ex.Message, ex.StackTrace);
                return false;
            }
            finally
            {
                bw.ReportProgress(100, string.Format("共保存{0}个文件", cnt));
                Close(elapp);
            }
            return true;
        }

        //销毁进程
        [DllImport("User32.dll", CharSet = CharSet.Auto)]
        public static extern int GetWindowThreadProcessId(IntPtr hwnd, out int ID);
        public static void Close(Excel.Application app)
        {
            if (app != null)
            {
                IntPtr t = new IntPtr(app.Hwnd);//得到这个句柄，具体作用是得到这块内存入口   
                int k = 0;
                GetWindowThreadProcessId(t, out k); //得到本进程唯一标志k
                System.Diagnostics.Process p = System.Diagnostics.Process.GetProcessById(k);   //得到对进程k的引用          
                p.Kill();     //关闭进程k
                p.Dispose();
            }
        }

        //读取所有sheet的名字
        public static List<string> ImportSheetName(string table)
        {
            try
            {
                List<string> result = new List<string>();
                string strConn = "Provider=Microsoft.ACE.OLEDB.12.0;" + "Data Source=" + table + ";" + ";Extended Properties=\"Excel 12.0;HDR=YES;IMEX=1\"";
                OleDbConnection conn = new OleDbConnection(strConn);
                conn.Open();
                DataTable sheetNames = conn.GetOleDbSchemaTable(System.Data.OleDb.OleDbSchemaGuid.Tables, new object[] { null, null, null, "TABLE" });
                conn.Close();
                for (int i = 0; i < sheetNames.Rows.Count; ++i)
                {
                    string tmp = sheetNames.Rows[i]["TABLE_NAME"].ToString();
                    if (tmp.EndsWith("$") || tmp.EndsWith("$'"))
                    {
                        result.Add(tmp.Replace("$", ""));
                    }
                }
                return result;
            }
            catch (Exception ex)
            {
                throw ex;
            }

        }

        //读取Excel表数据到内存
        public static DataTable ImportExcel(string table, string sheet, string columns, string cell_start, string cell_end, bool hasHeader = true, string sql = null)
        {
            DataSet tmp = new DataSet();
            string strConn = null;
            if (hasHeader)
            {
                strConn = "Provider=Microsoft.ACE.OLEDB.12.0;" + "Data Source=" + table + ";" + ";Extended Properties=\"Excel 12.0;HDR=YES;IMEX=1\"";
            }
            else
            {
                strConn = "Provider=Microsoft.ACE.OLEDB.12.0;" + "Data Source=" + table + ";" + ";Extended Properties=\"Excel 12.0;HDR=NO;IMEX=1\"";
            }
            if (sql == null)
            {
                if (String.IsNullOrWhiteSpace(columns))
                {
                    columns = "*";
                }
                if (String.IsNullOrWhiteSpace(cell_start) || String.IsNullOrWhiteSpace(cell_end))
                {
                    sql = string.Format("Select {1} From [{0}$]", sheet, columns);
                }
                else
                {
                    sql = string.Format("Select {1} From [{0}${2}:{3}]", sheet, columns, cell_start, cell_end);
                }
            }
            try
            {
                OleDbConnection conn = new OleDbConnection(strConn);
                conn.Open();
                OleDbDataAdapter com = new OleDbDataAdapter(sql, strConn);
                com.Fill(tmp);
                conn.Close();
            }
            catch (Exception ex)
            {
                throw ex;
            }
            return tmp.Tables[0];
        }

        //把DataSet内容写入到Excel中
        public static bool ExportExcel(string table, int startRow, int startCol, DataSet ds)
        {
            Excel.Application exapp = null;
            Excel.Workbook exwb = null;
            try
            {
                exapp = new Excel.Application();

                exwb = exapp.Workbooks.Open(table);
                foreach (DataTable dt in ds.Tables)
                {
                    Excel.Worksheet exws = exwb.Worksheets[dt.TableName];
                    int endRow = startRow + dt.Rows.Count - 1;
                    int endCol = startCol + dt.Columns.Count - 1;
                    Excel.Range range = exws.Range[exws.Cells[startRow, startCol], exws.Cells[endRow, endCol]];

                    object[,] value = new object[dt.Rows.Count, dt.Columns.Count];
                    exapp.DisplayAlerts = false;

                    for (int i = 0; i < dt.Rows.Count; ++i)
                    {
                        if (dt.Rows[i].RowState == DataRowState.Deleted) continue;
                        for (int j = 0; j < dt.Columns.Count; ++j)
                        {
                            value[i, j] = dt.Rows[i][j];
                        }
                    }
                    range.Value = value;
                }
                exwb.Save();
                return true;
            }
            catch (Exception ex)
            {
                throw ex;
            }
            finally
            {
                Close(exapp);
            }

        }

    }
}
