using System;
using System.Data;
using System.Windows.Forms;
using System.Data.OleDb;

namespace TableEditor
{
    public partial class SearchTableForm : Form
    {
        private SearchTableArgs args;

        //分页数据
        private const int pageSize = 50;     //每页显示行数
        private int nMax = 0;                //总记录数
        private int pageCount = 0;           //页数＝总记录数/每页显示行数
        private int cur_page = 0;            //当前页号
        private int cur_row = 0;            //当前记录行
        private DataView cur_dataView;
        private string filter;
        private string filename;

        public SearchTableForm(SearchTableArgs args)
        {
            InitializeComponent();
            this.args = args;
            this.filename = string.Format("{0}{1}{2}", Setting.tablePath, Setting.EXCEL, args.filename);
            this.Text = string.Format("查询 - {0}({1})", args.sheetname, args.filename);
            tb_StartId.Text = args.start_id;
            tb_EndId.Text = args.end_id;
            dgv_table.AutoGenerateColumns = true;
        }
        
        private void SearchForm_Load(object sender, EventArgs e)
        {
            bw_LoadData.RunWorkerAsync();
            timer.Start();
        }


        private void SearchForm_FormClosing(object sender, FormClosingEventArgs e)
        {
            timer.Stop();
            bw_LoadData.Dispose();
            bw_Refresh.Dispose();
        }

        private void timer_Tick(object sender, EventArgs e)
        {
            if (!bw_Refresh.IsBusy)
            {
                bw_Refresh.RunWorkerAsync();
            }
        }

        #region excel数据相关

        //加载数据表
        private void TableLoad()
        {
            try
            {
                DataTable table = ExcelUtils.ImportExcel(this.filename, args.sheetname, args.columns, null, null, false);
                if (table == null)
                {
                    return;
                }
                for (int i = 0; i < table.Rows.Count; ++i)
                {
                    if (table.Rows[i].RowState == DataRowState.Detached
                        || table.Rows[i].RowState == DataRowState.Deleted) continue;
                    string cell = table.Rows[i][0].ToString().Trim();
                    if ("表头".Equals(cell))
                    {
                        int j = 0;
                        foreach (DataColumn col in table.Columns)
                        {
                            col.ColumnName = table.Rows[i][j++].ToString();
                        }
                    }
                    table.Rows[i].Delete();
                    if ("BEGIN".Equals(cell))
                    {
                        break;
                    }
                }
                cur_dataView = table.DefaultView;
            }
            catch (Exception ex)
            {
                ConfigUtils.Error(ex.Message, ex.StackTrace);
                MessageBox.Show("Error: " + ex.Message);
            }
        }
        
        //初始化分页信息,并显示表格
        private void InitTable()
        {
            if (cur_dataView == null)
            {
                return;
            }
            nMax = cur_dataView.Count;
            pageCount = (nMax / pageSize);    //计算出总页数
            if ((nMax % pageSize) > 0) pageCount++;
            cur_page = 1;    //当前页数从1开始
            cur_row = 0;       //当前记录数从0开始
            LoadPageData();
        }

        //显示分页表格
        private void LoadPageData()
        {
            if (cur_dataView == null)
            {
                return;
            }
            int nStartPos = 0;   //当前页面开始记录行
            int nEndPos = 0;     //当前页面结束记录行
            DataTable dt_tmp = cur_dataView.Table.Clone();   //克隆DataTable结构框架

            if (cur_page >= pageCount)
            {
                nEndPos = nMax;
            }
            else
            {
                nEndPos = pageSize * cur_page;
            }
            if (cur_row > 0)
            {
                nStartPos = cur_row;
            }
            tsl_PageSize.Text = pageCount.ToString();
            tstb_CurPage.Text = Convert.ToString(cur_page);

            //从元数据源复制记录行
            for (int i = nStartPos; i < nEndPos; i++)
            {
                dt_tmp.ImportRow(cur_dataView[i].Row);
                cur_row++;
            }
            bs_table.DataSource = dt_tmp;
        }
        
        private void bn_nav_ItemClicked(object sender, ToolStripItemClickedEventArgs e)
        {
            if (e.ClickedItem.Text == "上一页")
            {
                cur_page--;
                if (cur_page <= 0)
                {
                    MessageBox.Show("已经是第一页，请点击“下一页”查看！");
                    return;
                }
                else
                {
                    cur_row = pageSize * (cur_page - 1);
                }
                LoadPageData();
            }
            if (e.ClickedItem.Text == "下一页")
            {
                cur_page++;
                if (cur_page > pageCount)
                {
                    MessageBox.Show("已经是最后一页，请点击“上一页”查看！");
                    return;
                }
                else
                {
                    cur_row = pageSize * (cur_page - 1);
                }
                LoadPageData();
            }
        }
        #endregion

        private void btn_Search_Click(object sender, EventArgs e)
        {
            try
            {
                int start, end;
                if (!int.TryParse(tb_StartId.Text, out start))
                {
                    start = 0;
                }
                if (!int.TryParse(tb_EndId.Text, out end))
                {
                    end = 100000000;
                }
                filter = string.Format("{0} >= {1} AND {0} <= {2} AND ({0} LIKE '%{4}%' OR {3} LIKE '%{4}%')",
                    args.column_id, start, end, args.column_name, tb_Keyword.Text);
                cur_dataView.RowFilter = filter;
                args.start_id = tb_StartId.Text;
                args.end_id = tb_EndId.Text;
                XMLController.WriteTableSearchXML();
                InitTable();
            }
            catch (Exception ex)
            {
                ConfigUtils.Error(ex.Message, ex.StackTrace);
                if (ex.InnerException != null)
                {
                    ConfigUtils.Error(ex.InnerException.Message, ex.InnerException.StackTrace);
                }
            }
        }

        private void tb_Keyword_KeyDown(object sender, KeyEventArgs e)
        {
            if (e.KeyCode == Keys.Enter)
            {
                btn_Search.PerformClick();
            }
        }

        private void tstb_CurPage_KeyDown(object sender, KeyEventArgs e)
        {
            if (e.KeyCode == Keys.Enter)
            {
                int page = cur_page;
                if (!int.TryParse(tstb_CurPage.Text, out page) || page <= 0 || page > pageSize)
                {
                    MessageBox.Show("无效的页码!");
                    return;
                }
                else
                {
                    cur_page = page;
                    cur_row = pageSize * (cur_page - 1);
                }
                LoadPageData();
            }
        }

        private void dgv_table_CellMouseDoubleClick(object sender, DataGridViewCellMouseEventArgs e)
        {
                if (e.RowIndex < 0 || e.ColumnIndex < 0) return;
                string text = dgv_table.Rows[e.RowIndex].Cells[e.ColumnIndex].Value.ToString();
                try
                {
                    Clipboard.Clear();
                    if (!String.IsNullOrWhiteSpace(text))
                    {
                        try
                        {
                            Clipboard.SetText(text);
                        }
                        catch
                        {
                            Clipboard.SetText(text);
                        }
                    }
                }
                catch
                {                    
                }            
        }

        private void bw_LoadData_DoWork(object sender, System.ComponentModel.DoWorkEventArgs e)
        {
            TableLoad();
        }

        private void bw_LoadData_RunWorkerCompleted(object sender, System.ComponentModel.RunWorkerCompletedEventArgs e)
        {
            if (e.Error != null)
            {
                ConfigUtils.Error(e.Error.Message, e.Error.StackTrace);
            }
            else
            {
                btn_Search.PerformClick();
            }
        }

        private void bw_refresh_DoWork(object sender, System.ComponentModel.DoWorkEventArgs e)
        {
            TableLoad();
            if (cur_dataView != null && this.filter != null)
            {
                cur_dataView.RowFilter = this.filter;
            }
        }

        private void bw_refresh_RunWorkerCompleted(object sender, System.ComponentModel.RunWorkerCompletedEventArgs e)
        {
            if (e.Error != null)
            {
                ConfigUtils.Error(e.Error.Message, e.Error.StackTrace);
            }
            else
            {
                try
                {
                    int curIndex = dgv_table.FirstDisplayedScrollingRowIndex;
                    this.cur_row = pageSize * (cur_page - 1);
                    LoadPageData();
                    dgv_table.FirstDisplayedScrollingRowIndex = curIndex;
                }
                catch (Exception ex)
                {
                    ConfigUtils.Error(ex.Message, ex.StackTrace);
                }
            }
        }


    }
}
