using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.IO;
using System.Text.RegularExpressions;
using System.Windows.Forms;
using System.Data;
using System.Xml;
using System.Text;

namespace TableEditor
{
    public partial class MainForm : Form
    {

        private const int SAVE_ONE_CSV = 0;
        private const int SAVE_MODIFY_CSV = 1;
        private const int SAVE_ALL_CSV = 2;

        private int m_MouseClicks = 0; //记录鼠标在treeView控件上按下的次数
        private LogMessageDialog logDialog;

        private List<Node> tableNodeList;
        private List<string> modifyNodeList = new List<string>();

        private string cur_filename;     //当前选中的Excel文件完整路径
        private string cur_tablename;    //当前选中的Excel文件文件名
        private string cur_sheetname;    //当前选中的sheet

        private int csv_save_mode;

        public MainForm()
        {
            InitializeComponent();
            ConfigUtils.init();
            //读取设置文件
            XMLController.ReadConfigXML();
            XMLController.ReadTableSearchXML();
        }

        private void MainForm_Load(object sender, EventArgs e)
        {
            initSearchControl();
            //
            SvnDiffExcel();
            //
            if (Setting.needSetConfigFirst)
            {
                SettingDialog SF = new SettingDialog();
                SF.ShowDialog();
            }
        }

        //运行CMD命令, 返回cmd窗口所有输出
        private static string CMD(params string[] cmds)
        {
            System.Diagnostics.Process p = createCMD(null, cmds);

            string strLog = p.StandardOutput.ReadToEnd();
            strLog += "\n" + p.StandardError.ReadToEnd();
            p.WaitForExit();
            p.Close();
            return strLog;
        }

        private static System.Diagnostics.Process createCMD(String WorkingDirectory, params String[] cmds)
        {
            System.Diagnostics.Process p = new System.Diagnostics.Process();
            p.StartInfo.FileName = "cmd.exe";//要执行的程序名称
            p.StartInfo.UseShellExecute = false;
            p.StartInfo.RedirectStandardInput = true;//可能接受来自调用程序的输入信息
            p.StartInfo.RedirectStandardOutput = true;//由调用程序获取输出信息
            p.StartInfo.RedirectStandardError = true; //重定向错误输出
            p.StartInfo.CreateNoWindow = true;//不显示程序窗口
            if (WorkingDirectory != null)
            {
                p.StartInfo.WorkingDirectory = WorkingDirectory;
            }
            p.Start();
            string path = string.Format(@"set path=%path%;{0};{1};", Setting.tortoiseSvnPath, Setting.svnPath);
            p.StandardInput.WriteLine(path);
            foreach (string cmd in cmds)
            {
                p.StandardInput.WriteLine(cmd);
            }
            p.StandardInput.WriteLine("exit");
            return p;       
        }

        private void initSearchControl()
        {
            ToolStripButton btn;
            for (int i = 0; i < Setting.searchTables.Count; ++i)
            {
                btn = new ToolStripButton();
                btn.Image = global::TableEditor.Properties.Resources.search;
                btn.ImageTransparentColor = System.Drawing.Color.Magenta;
                btn.Name = "Search_" + i;
                btn.Text = Setting.searchTables[i].name;
                btn.Click += new System.EventHandler(this.btn_SearchTable_Click);
                this.toolStrip1.Items.Add(btn);
            }
        }

        #region table_event

        //防止双击node改变节点的展开/折叠状态
        private void tv_table_BeforeCollapse(object sender, TreeViewCancelEventArgs e)
        {
            e.Cancel = (m_MouseClicks > 1);
        }
        private void tv_table_BeforeExpand(object sender, TreeViewCancelEventArgs e)
        {
            e.Cancel = (m_MouseClicks > 1);
        }
        private void tv_table_MouseDown(object sender, MouseEventArgs e)
        {
            m_MouseClicks = e.Clicks;
        }

        //右键点击treeview事件
        private void tv_table_NodeMouseClick(object sender, TreeNodeMouseClickEventArgs e)
        {
            if (e.Button == MouseButtons.Right)
            {
                tv_table.SelectedNode = e.Node;
                cms_TableTree.Show(tv_table, e.X, e.Y);
            }
        }

        //根据tv_table选中项得到excel和sheet 若知道excel层, sheet = 0
        private void tv_table_AfterSelect(object sender, TreeViewEventArgs e)
        {
            int dep = tv_table.SelectedNode.Level;//深度

            if (dep == 0)
            {
                cur_filename = Setting.tablePath + Setting.EXCEL + tv_table.SelectedNode.Text;
                cur_tablename = tv_table.SelectedNode.Text;
                cur_sheetname = null;
            }
            else
            {
                cur_filename = Setting.tablePath + Setting.EXCEL + tv_table.SelectedNode.Parent.Text;
                cur_tablename = tv_table.SelectedNode.Parent.Text;
                cur_sheetname = tv_table.SelectedNode.Text;
            }
        }

        #endregion

        #region 排列子窗口选项

        private void tsmi_Cascade_Click(object sender, EventArgs e)
        {
            this.LayoutMdi(MdiLayout.Cascade);
        }
        private void tsmi_TileHorizontal_Click(object sender, EventArgs e)
        {
            this.LayoutMdi(MdiLayout.TileHorizontal);
        }
        private void tsmi_TileVertical_Click(object sender, EventArgs e)
        {
            this.LayoutMdi(MdiLayout.TileVertical);
        }
        private void tsmi_AllMinimized_Click(object sender, EventArgs e)
        {
            foreach (Form form in this.MdiChildren)
            {
                form.WindowState = FormWindowState.Minimized;
            }
        }
        #endregion

        //查询按钮事件
        private void btn_seachTable_Click(object sender, EventArgs e)
        {
            if (tableNodeList == null)
            {
                return;
            }
            string str = @".*" + tb_SearchName.Text + @".*";
            tv_table.BeginUpdate();
            tv_table.Nodes.Clear();
            foreach (Node node in tableNodeList)
            {
                if (Regex.Match(node.bookname, str).Success)
                {
                    TreeNode tnode = new TreeNode(node.bookname);
                    tnode.ContextMenuStrip = cms_TableNode;
                    if (modifyNodeList.Contains(node.bookname))
                    {
                        tnode.ForeColor = System.Drawing.Color.Red;
                    }
                    foreach (string sheet in node.sheetname)
                    {
                        TreeNode sNode = new TreeNode(sheet);
                        sNode.ContextMenuStrip = cms_TableNode;
                        tnode.Nodes.Add(sNode);
                    }

                    tv_table.Nodes.Add(tnode);
                }
                else
                {
                    TreeNode tnode = new TreeNode(node.bookname);
                    tnode.ContextMenuStrip = cms_TableNode;
                    bool success = false;
                    foreach (string sheet in node.sheetname)
                    {
                        if (Regex.Match(sheet, str).Success)
                        {
                            if (modifyNodeList.Contains(node.bookname))
                            {
                                tnode.ForeColor = System.Drawing.Color.Red;
                            }
                            success = true;
                            TreeNode sNode = new TreeNode(sheet);
                            sNode.ContextMenuStrip = cms_TableNode;
                            tnode.Nodes.Add(sNode);
                        }
                    }
                    if (success)
                    {
                        tv_table.Nodes.Add(tnode);
                    }
                }
            }
            tv_table.EndUpdate();
            if (tv_table.Nodes.Count == 0)
            {
                MessageBox.Show("没有找到" + tb_SearchName.Text);
            }

        }

        private void tb_SearchName_KeyDown(object sender, KeyEventArgs e)
        {
            if (e.KeyCode == Keys.Enter)
            {
                btn_seachTable.PerformClick();
            }
        }

        //根据ID或名称查找道具
        private void btn_SearchTable_Click(object sender, EventArgs e)
        {
            ToolStripItem item = sender as ToolStripItem;
            if (item.Name.StartsWith("Search_"))
            {
                int idx = int.Parse(item.Name.Replace("Search_", ""));
                SearchTableForm sf = new SearchTableForm(Setting.searchTables[idx]);
                sf.TopLevel = false;
                sf.MdiParent = this;
                sf.Show();
            }
        }

        //双击TreeView某一项事件
        private void TreeView_DoubleClick(object sender, EventArgs e)
        {
            OpenExcel2();
        }

        //打开一个Excel[监听事件]
        private void OpenExcel()
        {
            //打开一个新的Excel
            try
            {
                ExcelEdit EEdit = new ExcelEdit();
                EEdit.Open(cur_filename, cur_sheetname);
            }
            catch (Exception ex)
            {
                ConfigUtils.Error(ex.Message, ex.StackTrace);
                MessageBox.Show("Error: " + ex.Message + "\n请刷新下列表");
            }
        }

        //直接打开Excel文件
        private void OpenExcel2()
        {
            try
            {
                System.Diagnostics.Process.Start(cur_filename);
            }
            catch (Exception ex)
            {
                ConfigUtils.Error(ex.Message, ex.StackTrace);
                MessageBox.Show("Error: " + ex.Message + "\n请刷新下列表");
            }
        }

        //打开设置窗口
        private void tsmi_OpenSet_Click(object sender, EventArgs e)
        {
            SettingDialog dialog = new SettingDialog();
            dialog.ShowDialog();
        }

        //打开在线导表
        private void tsmi_OpenSite_Click(object sender, EventArgs e)
        {
            System.Diagnostics.Process.Start(Setting.siteUrl);
        }

        //重新加载EXCEL目录
        private void tsmi_ReloadTableXML_Click(object sender, EventArgs e)
        {
            logDialog = new LogMessageDialog("搜索文件中...");
            logDialog.Text = "更新数据";
            logDialog.SetButtonState(ButtonState.CANCEL);
            logDialog.SetBackgroundWorker(bw_ReloadTableXML);
            bw_ReloadTableXML.RunWorkerAsync();
            logDialog.ShowDialog();
        }

        #region ReloadTableXML

        //刷新列表
        private void bw_ReloadTableXML_DoWork(object sender, System.ComponentModel.DoWorkEventArgs e)
        {
            BackgroundWorker bw = sender as BackgroundWorker;

            if (XMLController.WriteTableTreeXML(Setting.tablePath + Setting.EXCEL, bw) == false)
            {
                e.Cancel = true;
            }
        }
        private void bw_ReloadTableXML_RunWorkerCompleted(object sender, RunWorkerCompletedEventArgs e)
        {
            if (e.Cancelled == true)
            {
                MessageBox.Show("您取消了刷新, 数据未更新!");
            }
            else if (e.Error != null)
            {
                ConfigUtils.Error(e.Error.Message, e.Error.StackTrace);
                MessageBox.Show("Error: " + e.Error.Message);
            }
            else
            {
                logDialog.SetButtonState(ButtonState.OK);
                SvnDiffExcel();
            }
        }
        private void bw_ReloadTableXML_ProgressChanged(object sender, ProgressChangedEventArgs e)
        {
            logDialog.SetText(string.Format("文件搜索可能需要几分钟,请稍等...\n\n{0}\n-----------------------\n已完成:{1}%",
                e.UserState.ToString(), e.ProgressPercentage.ToString()));

        }

        #endregion

        //保存单个xlsx 或 sheet To CSV
        private void tnmi_OneSaveCsv_Click(object sender, EventArgs e)
        {
            if (bw_SaveCsv.IsBusy)
            {
                MessageBox.Show("系统繁忙, 请稍后再试");
                return;
            }
            csv_save_mode = SAVE_ONE_CSV;
            logDialog = new LogMessageDialog("搜索文件中...");
            logDialog.Text = "保存文件中...";
            logDialog.SetButtonState(ButtonState.CANCEL);
            logDialog.SetBackgroundWorker(bw_SaveCsv);
            bw_SaveCsv.RunWorkerAsync();
            logDialog.ShowDialog();
        }

        //批量保存CSV
        private void tsmi_ModifySaveCsv_Click(object sender, EventArgs e)
        {
            if (bw_SaveCsv.IsBusy)
            {
                MessageBox.Show("系统繁忙, 请稍后再试");
                return;
            }
            //Diff Excel 只保存修改过的Excel
            SvnDiffExcel();
            //保存CSV
            csv_save_mode = SAVE_MODIFY_CSV;

            logDialog = new LogMessageDialog("搜索文件中...");
            logDialog.Text = "保存文件中...";
            logDialog.SetButtonState(ButtonState.CANCEL);
            logDialog.SetBackgroundWorker(bw_SaveCsv);
            bw_SaveCsv.RunWorkerAsync();
            logDialog.ShowDialog();
        }

        //批量保存CSV
        private void tsmi_AllSaveCsv_Click(object sender, EventArgs e)
        {
            if (bw_SaveCsv.IsBusy)
            {
                MessageBox.Show("系统繁忙, 请稍后再试");
                return;
            }
            //Diff Excel 只保存修改过的Excel
            SvnDiffExcel();
            //保存CSV
            csv_save_mode = SAVE_ALL_CSV;

            logDialog = new LogMessageDialog("搜索文件中...");
            logDialog.Text = "保存文件中...";
            logDialog.SetButtonState(ButtonState.CANCEL);
            logDialog.SetBackgroundWorker(bw_SaveCsv);
            bw_SaveCsv.RunWorkerAsync();
            logDialog.ShowDialog();
        }

        #region SaveCsv

        //保存Csv
        private void bw_SaveCsv_DoWork(object sender, DoWorkEventArgs e)
        {
            BackgroundWorker bw = sender as BackgroundWorker;
            bw.ReportProgress(0, "\n保存文件可能需要几分钟,请稍等...\n");
            if (csv_save_mode == SAVE_ONE_CSV)
            {
                if (!ExcelUtils.XlsxToCsv(bw_SaveCsv, cur_filename, cur_sheetname))
                {
                    e.Cancel = true;
                }
            }
            else if (csv_save_mode == SAVE_MODIFY_CSV)
            {
                if (!ExcelUtils.XlsxToCsv(bw, modifyNodeList))
                {
                    e.Cancel = true;
                }
            }
            else if (csv_save_mode == SAVE_ALL_CSV)
            {
                if (!ExcelUtils.XlsxToCsv(bw))
                {
                    e.Cancel = true;
                }
            }
        }

        private void bw_SaveCsv_ProgressChanged(object sender, ProgressChangedEventArgs e)
        {
            logDialog.AppendText(e.UserState.ToString() + Environment.NewLine);
        }

        private void bw_SaveCsv_RunWorkerCompleted(object sender, RunWorkerCompletedEventArgs e)
        {
            if (e.Cancelled == true)
            {
                MessageBox.Show("您取消了操作,数据未完全保存");
            }
            else if (e.Error != null)
            {
                ConfigUtils.Error(e.Error.Message, e.Error.StackTrace);
                MessageBox.Show("Error: " + e.Error.Message);
            }
            else
            {
                logDialog.AppendText("操作完成！");
                logDialog.SetButtonState(ButtonState.OK);
            }
        }

        #endregion

        private void tsmi_Csv2Code_Click(object sender, EventArgs e)
        {
            if (bw_Csv2Code.IsBusy)
            {
                MessageBox.Show("正在取消导表操作,请稍等...");
            }
            else
            {
                logDialog = new LogMessageDialog("测试导表...");
                logDialog.Text = "测试导表";
                logDialog.SetBackgroundWorker(bw_Csv2Code);
                logDialog.SetButtonState(ButtonState.CANCEL);
                bw_Csv2Code.RunWorkerAsync();
                logDialog.ShowDialog();
            }
        }

        #region Csv2Code

        private void bw_Csv2Code_DoWork(object sender, DoWorkEventArgs e)
        {
            BackgroundWorker bw = sender as BackgroundWorker;
            bw.ReportProgress(0, "\n测试导表可能需要几分钟,请稍等...\n");

            System.Diagnostics.Process p = new System.Diagnostics.Process();
            p.StartInfo.FileName = Setting.pythonPath + @"\python.exe";//要执行的程序名称
            string pyc = "csv2code.pyc";
            if (File.Exists(Setting.scriptPath + @"\csv2code.py"))
            {
                pyc = "csv2code.py";                    
            }
            string args = String.Format("{0} \"{1}{2}\" \"{3}\"", pyc, Setting.tablePath, Setting.CSV, Setting.tablePath + Setting.genPath);
            args = args.Replace("\\", "/");
            p.StartInfo.Arguments = args;
            p.StartInfo.UseShellExecute = false;
            p.StartInfo.RedirectStandardInput = true;//可能接受来自调用程序的输入信息
            p.StartInfo.RedirectStandardOutput = true;//由调用程序获取输出信息
            p.StartInfo.RedirectStandardError = true; //重定向错误输出
            p.StartInfo.CreateNoWindow = true;//不显示程序窗口
            p.StartInfo.StandardOutputEncoding = Encoding.UTF8;
            p.StartInfo.StandardErrorEncoding = Encoding.UTF8;
            p.StartInfo.WorkingDirectory = Setting.scriptPath;
            p.Start();

            StreamReader reader = p.StandardOutput;
            string line;
            while (!reader.EndOfStream)
            {
                if (bw.CancellationPending)
                {
                    e.Cancel = true;
                    p.Close();
                    return;
                }
                line = reader.ReadLine();
                bw.ReportProgress(0,line);
            }
            line = p.StandardError.ReadToEnd();
            if (line.Length > 0)
            {
                bw.ReportProgress(0, line);
            }
            p.WaitForExit();
            if (p.ExitCode == 0)
            {
                bw.ReportProgress(0, "测试导表成功，可以提交SVN！");
            }
            else
            {
                bw.ReportProgress(0, "测试导表出错，请检查数据表！");
            }
            p.Close();
        }

        private void bw_Csv2Code_ProgressChanged(object sender, ProgressChangedEventArgs e)
        {
            logDialog.AppendText(e.UserState + Environment.NewLine);
        }

        private void bw_Csv2Code_RunWorkerCompleted(object sender, RunWorkerCompletedEventArgs e)
        {
            if (e.Error != null)
            {
                ConfigUtils.Error(e.Error.Message, e.Error.StackTrace);
                logDialog.AppendText(e.Error.Message + Environment.NewLine);
            }
            else if (e.Cancelled)
            {
                MessageBox.Show("您取消了导表, 操作未完成");
            }
            else
            {
                ConfigUtils.Log(logDialog.GetText().Replace("\n", Environment.NewLine));
                logDialog.AppendText(string.Format("日志已被保存到 {0}{1}",
                    Setting.LOG_PATH, Environment.NewLine));
            }
            logDialog.SetButtonState(ButtonState.OK);
        }
      
        #endregion
 
        //svn st 判断修改
        private void tsmi_RefreshTable_Click(object sender, EventArgs e)
        {
            SvnDiffExcel();
        }

        //diff Excel
        private void SvnDiffExcel()
        {
            modifyNodeList.Clear();
            string[] result = CMD("cd /d " + Setting.tablePath + Setting.EXCEL, "svn st").Split(new char[] { '\r', '\n' }, StringSplitOptions.RemoveEmptyEntries);
            foreach (string r in result)
            {
                if (Regex.Match(r, @"^[M\?A]\s{7}.+$").Success)
                {
                    string name = Regex.Replace(r, @"^([M\?A]\s{7})(.+)$", "$2");
                    modifyNodeList.Add(name);
                }
            }
            refreshTreeView();
        }

        //更新TreeView
        private void refreshTreeView()
        {
            try
            {
                tv_table.BeginUpdate();
                tv_table.Nodes.Clear();
                tableNodeList = XMLController.ReadTableTreeXML();
                foreach (Node node in tableNodeList)
                {
                    TreeNode tnode = new TreeNode(node.bookname);
                    tnode.ContextMenuStrip = cms_TableNode;
                    if (modifyNodeList.Contains(node.bookname))
                    {
                        tnode.ForeColor = System.Drawing.Color.Red;
                    }
                    foreach (string name in node.sheetname)
                    {
                        TreeNode sNode = new TreeNode(name);
                        sNode.ContextMenuStrip = cms_TableNode;
                        tnode.Nodes.Add(sNode);
                    }
                    tv_table.Nodes.Add(tnode);
                }
                tv_table.EndUpdate();

            }
            catch (Exception ex)
            {
                ConfigUtils.Error(ex.Message, ex.StackTrace);
                MessageBox.Show("Error: " + ex.Message);
            }
        }

        //SVN Update
        private void tnmi_Update_Click(object sender, EventArgs e)
        {
            CMD("TortoiseProc /command:update /path:\"" + cur_filename + "\" /closeoend:0");
        }

        //SVN Commit
        private void tnmi_Commit_Click(object sender, EventArgs e)
        {
            CMD("TortoiseProc /command:commit /path:\"" + cur_filename + "\" /closeoend:0");
        }

        //SVN Revert
        private void tnmi_Revert_Click(object sender, EventArgs e)
        {
            CMD("TortoiseProc /command:revert /path:\"" + cur_filename + "\" /closeoend:0");
        }

        //SVN Update All
        private void tnmi_UpdateAll_Click(object sender, EventArgs e)
        {
            CMD("TortoiseProc /command:update /path:\"" + Setting.tablePath + "\" /closeoend:0");
        }

        //SVN Commit All
        private void tnmi_CommitAll_Click(object sender, EventArgs e)
        {
            CMD("TortoiseProc /command:commit /path:\"" + Setting.tablePath + "\" /closeoend:0");
        }

        //SVN Revert All
        private void tnmi_RevertAll_Click(object sender, EventArgs e)
        {
            CMD("TortoiseProc /command:revert /path:\"" + Setting.tablePath + "\" /closeoend:0");
        }

        private void tnmi_OpenFile_Click(object sender, EventArgs e)
        {
            OpenExcel2();
        }

        private void tnmi_OpenDirectory_Click(object sender, EventArgs e)
        {
            try
            {
                System.Diagnostics.Process.Start("Explorer.exe", "/select," + cur_filename);
            }
            catch (Exception ex)
            {
                ConfigUtils.Error(ex.Message, ex.StackTrace);
                MessageBox.Show("Error: " + ex.Message + "\n请刷新下列表");
            }
        }
        
    }
}
