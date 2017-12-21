using System;
using System.Collections.Generic;
using System.Windows.Forms;
using System.IO;

using Excel = Microsoft.Office.Interop.Excel;

namespace TableEditor
{
    /// <SUMMARY> 
    /// ExcelEdit 的摘要说明 
    /// 
    /// </SUMMARY> 
    public class ExcelEdit
    {
        public string mFilename;
        public Excel.Application app;
        public Excel.Workbooks wbs;
        public Excel.Workbook wb;
        public Excel.Worksheets wss;
        public Excel.Worksheet ws;

        //Excel event delegate variables:
        Excel.AppEvents_WorkbookBeforeCloseEventHandler EventDel_BeforeBookClose;
        Excel.DocEvents_ChangeEventHandler EventDel_CellsChange;
        Excel.DocEvents_SelectionChangeEventHandler EventDel_SelectionChange;

        Dictionary<string, string> foreignKey;
        public ExcelEdit()
        {
            // 
            // TODO: 在此处添加构造函数逻辑 
            // 
            //设置关闭事件
            EventDel_BeforeBookClose =
             new Excel.AppEvents_WorkbookBeforeCloseEventHandler(BeforeBookClose);
            EventDel_SelectionChange = new Excel.DocEvents_SelectionChangeEventHandler(RangeSelected);
            EventDel_CellsChange = new Excel.DocEvents_ChangeEventHandler(CellsChange);
            foreignKey = new Dictionary<string, string>();
        }

        public void Create()//创建一个 Excel 对象 
        {
            app = new Excel.Application();
            wbs = app.Workbooks; wb = wbs.Add(true);
            wb.Worksheets[1].Activate();

            //设置关闭事件
            app.WorkbookBeforeClose += EventDel_BeforeBookClose;
            //用户控制
            app.UserControl = true;
            //app.Visible = true;
        }

        public void Open(string FileName, string sheet = null)//打开一个 Excel 文件 
        {
            app = new Excel.Application();
            wbs = app.Workbooks;
            wb = wbs.Open(FileName);
            //wb = wbs.Open(FileName, 0, true, 5,"", "", true, Excel.XlPlatform.xlWindows, "t", false, false, 0, true,Type.Missing,Type.Missing);
            //wb = wbs.Open(FileName,Type.Missing,Type.Missing,Type.Missing,Type.Missing,Type.Missing,Type. Missing,Excel.XlPlatform.xlWindows,Type.Missing,Type.Missing,Type.Missing,Type.Missing,Ty pe.Missing,Type.Missing,Type.Missing);
            mFilename = FileName;
            if (sheet != null)
            {
                wb.Worksheets[sheet].Activate();
            }

            foreach (Excel.Worksheet isheet in wb.Worksheets)
            {
                isheet.SelectionChange += EventDel_SelectionChange;
                isheet.Change += EventDel_CellsChange;
                
            }

            //设置关闭事件
          //  app.WorkbookBeforeClose += EventDel_BeforeBookClose;

            //Make Excel visible and give the user control.
            app.Visible = true;
            app.UserControl = false;
            
        }
        
        //获取一个已知workbook
        public void Open(object workbook)
        { 
            wb = (Excel.Workbook)workbook;
            app = wb.Application;

            app.Worksheets[1].Activate();

            app.WorkbookBeforeClose += EventDel_BeforeBookClose;
            
            foreach (Excel.Worksheet sheet in wb.Worksheets)
            {
                sheet.SelectionChange += EventDel_SelectionChange;
                sheet.Change += EventDel_CellsChange;
            }

            //Make Excel visible and give the user control.
            app.UserControl = true;

        }        

        //单元格修改事件
        private void CellsChange(Excel.Range Target)
        {
           // MessageBox.Show("Delegate: You Changed Cells " + Target.Address +  " on " + Target.Worksheet.Name + "\nvalue: " + Target.Value);
            return;
        }

        //单元格选择事件
        void RangeSelected(Microsoft.Office.Interop.Excel.Range Target)
        {
           // string selectedRange = Target.get_Address(Type.Missing, Type.Missing, Excel.XlReferenceStyle.xlA1, Type.Missing, Type.Missing);
          //  MessageBox.Show(this.wb.Name + ": " + selectedRange +  " was selected.");
             
        }

        //关闭事件
        private void BeforeBookClose(Excel.Workbook Wb, ref bool Cancel)
        {
            //This is called when you choose to close the workbook in Excel.
            //The event handlers are removed, and then the workbook is closed 
            // 是否保存
            //Wb.Saved = true;
            
            //事件移除
            try
            {
                if (!Wb.Saved)
                {
                    //switch (MessageBox.Show("你还没保存,是否要保存?", "提醒", MessageBoxButtons.YesNoCancel))
                    //{
                    //    case DialogResult.Yes:
                    //foreach (Excel.Worksheet sheet in wb.Worksheets)
                    //{
                    //    sheet.SelectionChange -= EventDel_SelectionChange;
                    //    sheet.Change -= EventDel_CellsChange;
                    //}
                    //app.WorkbookBeforeClose -= EventDel_BeforeBookClose;
                    //Wb.SaveAs();
                    //Wb.Close();
                    ////关闭进程
                    ////  Close();
                    //Close(app);
                    //        break;
                    //    case DialogResult.No:
                    //        foreach (Excel.Worksheet sheet in wb.Worksheets)
                    //        {
                    //            sheet.SelectionChange -= EventDel_SelectionChange;
                    //            sheet.Change -= EventDel_CellsChange;
                    //        }
                    //        app.WorkbookBeforeClose -= EventDel_BeforeBookClose;
                    //        Wb.Close();
                    //        //关闭进程
                    //        //  Close();
                    //        Close(app);
                    //        break;
                    //    case DialogResult.Cancel:
                    //        Cancel = true;
                    //        break;
                    //    default: break;
                    //}
                }
                else
                {
                    ExcelUtils.Close(app);
                }
                
            }
            catch(Exception ex)
            {
                ConfigUtils.Error("Error: " + ex.Message);
                ExcelUtils.Close(app);
            }
                
            //xlSheet1.Change -= EventDel_CellsChange;
            //xlSheet2.Change -= EventDel_CellsChange;
            //xlSheet3.Change -= EventDel_CellsChange;            
        }

        public Excel.Worksheet GetSheet(string SheetName) //获取一个工作表 
        {
            Excel.Worksheet s = (Excel.Worksheet)wb.Worksheets[SheetName];
            return s;
        }

        public Excel.Worksheet AddSheet(string SheetName) //添加一个工作表 
        {
            Excel.Worksheet s = (Excel.Worksheet)wb.Worksheets.Add(Type.Missing, Type.Missing, Type.Missing, Type.Missing);
            s.Name = SheetName;
            return s;
        }

        public void DelSheet(string SheetName)//删除一个工作表 
        {
            ((Excel.Worksheet)wb.Worksheets[SheetName]).Delete();
        }

        //激活某个sheet,index从1开始
        public void setActiveSheet(int index)
        {
            if (index >= 1 && index <= wb.Worksheets.Count)
            {
                wb.Worksheets[index].Activate();
            }
        }

        public void setActiveSheet(string sheetName)
        {
            wb.Worksheets[sheetName].Activate();
        }


        //关闭进程
        public void Close()
        {
            if (app != null)
            {
                try
                {
                    if (wb.Saved)
                    {
                        
                        wb.Close();
                        app.Quit();
                        ExcelUtils.Close(app);                        
                    }
                    else
                    {
                        switch (MessageBox.Show("你还没保存,是否要保存?", "提醒", MessageBoxButtons.YesNo))
                        {
                            case DialogResult.Yes:
                                
                                try
                                {
                                    wb.SaveAs();

                                }
                                catch (System.Exception ex)
                                {
                                    ConfigUtils.Error(ex.Message, ex.StackTrace);
                                    if (ex.InnerException != null)
                                    {
                                        ConfigUtils.Error(ex.InnerException.Message, ex.InnerException.StackTrace);
                                    }
                                  //  MessageBox.Show("Error: " + ex.Message);
                                }
                                finally
                                {
                                    wb.Close();
                                    app.Quit();
                                    ExcelUtils.Close(app);
                                }
                                break;
                            case DialogResult.No:
                                wb.Close();
                                app.Quit();
                                ExcelUtils.Close(app);
                                break;
                        }
                    }
                    
                }
                catch (Exception ex)
                {
                    ConfigUtils.Error(ex.Message, ex.StackTrace);
                    MessageBox.Show("Error: " + ex.Message);
                }
                
            }
        }

    }
}
