namespace TableEditor
{
    partial class MainForm
    {
        /// <summary>
        /// 必需的设计器变量。
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// 清理所有正在使用的资源。
        /// </summary>
        /// <param name="disposing">如果应释放托管资源，为 true；否则为 false。</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows 窗体设计器生成的代码

        /// <summary>
        /// 设计器支持所需的方法 - 不要
        /// 使用代码编辑器修改此方法的内容。
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(MainForm));
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.tsmi_OpenSet = new System.Windows.Forms.ToolStripMenuItem();
            this.tmsi_Action = new System.Windows.Forms.ToolStripMenuItem();
            this.tsmi_RefreshTable = new System.Windows.Forms.ToolStripMenuItem();
            this.tsmi_ModifySaveCsv = new System.Windows.Forms.ToolStripMenuItem();
            this.toolStripSeparator4 = new System.Windows.Forms.ToolStripSeparator();
            this.tsmi_ReloadTableXML = new System.Windows.Forms.ToolStripMenuItem();
            this.tsmi_AllSaveCsv = new System.Windows.Forms.ToolStripMenuItem();
            this.toolStripSeparator6 = new System.Windows.Forms.ToolStripSeparator();
            this.tsmi_Csv2Code = new System.Windows.Forms.ToolStripMenuItem();
            this.tsmi_OpenSite = new System.Windows.Forms.ToolStripMenuItem();
            this.toolStrip1 = new System.Windows.Forms.ToolStrip();
            this.tsb_RefreshTable = new System.Windows.Forms.ToolStripButton();
            this.tsb_ModifyToCsv = new System.Windows.Forms.ToolStripButton();
            this.toolStripSeparator5 = new System.Windows.Forms.ToolStripSeparator();
            this.tsb_Csv2Code = new System.Windows.Forms.ToolStripButton();
            this.toolStripSeparator3 = new System.Windows.Forms.ToolStripSeparator();
            this.btn_seachTable = new System.Windows.Forms.Button();
            this.tb_SearchName = new System.Windows.Forms.TextBox();
            this.tv_table = new System.Windows.Forms.TreeView();
            this.cms_TableTree = new System.Windows.Forms.ContextMenuStrip(this.components);
            this.ttmi_Refresh = new System.Windows.Forms.ToolStripMenuItem();
            this.toolStripSeparator1 = new System.Windows.Forms.ToolStripSeparator();
            this.ttmi_UpdateAll = new System.Windows.Forms.ToolStripMenuItem();
            this.ttmi_CommitAll = new System.Windows.Forms.ToolStripMenuItem();
            this.ttmi_RevertAll = new System.Windows.Forms.ToolStripMenuItem();
            this.cms_form = new System.Windows.Forms.ContextMenuStrip(this.components);
            this.tsmi_Cascade = new System.Windows.Forms.ToolStripMenuItem();
            this.tsmi_TileHorizontal = new System.Windows.Forms.ToolStripMenuItem();
            this.tsmi_TileVertical = new System.Windows.Forms.ToolStripMenuItem();
            this.tsmi_AllMinimized = new System.Windows.Forms.ToolStripMenuItem();
            this.bw_ReloadTableXML = new System.ComponentModel.BackgroundWorker();
            this.bw_SaveCsv = new System.ComponentModel.BackgroundWorker();
            this.cms_TableNode = new System.Windows.Forms.ContextMenuStrip(this.components);
            this.tnmi_OneSaveCsv = new System.Windows.Forms.ToolStripMenuItem();
            this.tnmi_Update = new System.Windows.Forms.ToolStripMenuItem();
            this.tnmi_Commit = new System.Windows.Forms.ToolStripMenuItem();
            this.tnmi_Revert = new System.Windows.Forms.ToolStripMenuItem();
            this.toolStripSeparator2 = new System.Windows.Forms.ToolStripSeparator();
            this.tnmi_Refresh = new System.Windows.Forms.ToolStripMenuItem();
            this.tnmi_UpdateAll = new System.Windows.Forms.ToolStripMenuItem();
            this.tnmi_CommitAll = new System.Windows.Forms.ToolStripMenuItem();
            this.tnmi_RevertAll = new System.Windows.Forms.ToolStripMenuItem();
            this.bw_Csv2Code = new System.ComponentModel.BackgroundWorker();
            this.panel1 = new System.Windows.Forms.Panel();
            this.splitter1 = new System.Windows.Forms.Splitter();
            this.toolStripSeparator7 = new System.Windows.Forms.ToolStripSeparator();
            this.tnmi_OpenFile = new System.Windows.Forms.ToolStripMenuItem();
            this.tnmi_OpenDirectory = new System.Windows.Forms.ToolStripMenuItem();
            this.menuStrip1.SuspendLayout();
            this.toolStrip1.SuspendLayout();
            this.cms_TableTree.SuspendLayout();
            this.cms_form.SuspendLayout();
            this.cms_TableNode.SuspendLayout();
            this.panel1.SuspendLayout();
            this.SuspendLayout();
            // 
            // menuStrip1
            // 
            this.menuStrip1.GripStyle = System.Windows.Forms.ToolStripGripStyle.Visible;
            this.menuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.tsmi_OpenSet,
            this.tmsi_Action,
            this.tsmi_OpenSite});
            this.menuStrip1.Location = new System.Drawing.Point(0, 0);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.Size = new System.Drawing.Size(984, 25);
            this.menuStrip1.TabIndex = 1;
            this.menuStrip1.Text = "menuStrip1";
            // 
            // tsmi_OpenSet
            // 
            this.tsmi_OpenSet.Name = "tsmi_OpenSet";
            this.tsmi_OpenSet.ShortcutKeys = ((System.Windows.Forms.Keys)((System.Windows.Forms.Keys.Alt | System.Windows.Forms.Keys.S)));
            this.tsmi_OpenSet.Size = new System.Drawing.Size(59, 21);
            this.tsmi_OpenSet.Text = "设置(S)";
            this.tsmi_OpenSet.Click += new System.EventHandler(this.tsmi_OpenSet_Click);
            // 
            // tmsi_Action
            // 
            this.tmsi_Action.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.tsmi_RefreshTable,
            this.tsmi_ModifySaveCsv,
            this.toolStripSeparator4,
            this.tsmi_ReloadTableXML,
            this.tsmi_AllSaveCsv,
            this.toolStripSeparator6,
            this.tsmi_Csv2Code});
            this.tmsi_Action.Name = "tmsi_Action";
            this.tmsi_Action.Size = new System.Drawing.Size(44, 21);
            this.tmsi_Action.Text = "操作";
            // 
            // tsmi_RefreshTable
            // 
            this.tsmi_RefreshTable.Name = "tsmi_RefreshTable";
            this.tsmi_RefreshTable.ShortcutKeys = System.Windows.Forms.Keys.F5;
            this.tsmi_RefreshTable.Size = new System.Drawing.Size(175, 22);
            this.tsmi_RefreshTable.Text = "刷新修改Excel";
            this.tsmi_RefreshTable.Click += new System.EventHandler(this.tsmi_RefreshTable_Click);
            // 
            // tsmi_ModifySaveCsv
            // 
            this.tsmi_ModifySaveCsv.Name = "tsmi_ModifySaveCsv";
            this.tsmi_ModifySaveCsv.ShortcutKeys = System.Windows.Forms.Keys.F6;
            this.tsmi_ModifySaveCsv.Size = new System.Drawing.Size(175, 22);
            this.tsmi_ModifySaveCsv.Text = "导出修改CSV";
            this.tsmi_ModifySaveCsv.Click += new System.EventHandler(this.tsmi_ModifySaveCsv_Click);
            // 
            // toolStripSeparator4
            // 
            this.toolStripSeparator4.Name = "toolStripSeparator4";
            this.toolStripSeparator4.Size = new System.Drawing.Size(172, 6);
            // 
            // tsmi_ReloadTableXML
            // 
            this.tsmi_ReloadTableXML.Name = "tsmi_ReloadTableXML";
            this.tsmi_ReloadTableXML.ShortcutKeyDisplayString = "";
            this.tsmi_ReloadTableXML.ShortcutKeys = System.Windows.Forms.Keys.F9;
            this.tsmi_ReloadTableXML.Size = new System.Drawing.Size(175, 22);
            this.tsmi_ReloadTableXML.Text = "加载Excel目录";
            this.tsmi_ReloadTableXML.Click += new System.EventHandler(this.tsmi_ReloadTableXML_Click);
            // 
            // tsmi_AllSaveCsv
            // 
            this.tsmi_AllSaveCsv.Name = "tsmi_AllSaveCsv";
            this.tsmi_AllSaveCsv.ShortcutKeys = System.Windows.Forms.Keys.F10;
            this.tsmi_AllSaveCsv.Size = new System.Drawing.Size(175, 22);
            this.tsmi_AllSaveCsv.Text = "导出所有CSV";
            this.tsmi_AllSaveCsv.Click += new System.EventHandler(this.tsmi_AllSaveCsv_Click);
            // 
            // toolStripSeparator6
            // 
            this.toolStripSeparator6.Name = "toolStripSeparator6";
            this.toolStripSeparator6.Size = new System.Drawing.Size(172, 6);
            // 
            // tsmi_Csv2Code
            // 
            this.tsmi_Csv2Code.Name = "tsmi_Csv2Code";
            this.tsmi_Csv2Code.ShortcutKeys = System.Windows.Forms.Keys.F12;
            this.tsmi_Csv2Code.Size = new System.Drawing.Size(175, 22);
            this.tsmi_Csv2Code.Text = "测试导表";
            this.tsmi_Csv2Code.Click += new System.EventHandler(this.tsmi_Csv2Code_Click);
            // 
            // tsmi_OpenSite
            // 
            this.tsmi_OpenSite.Name = "tsmi_OpenSite";
            this.tsmi_OpenSite.ShortcutKeys = ((System.Windows.Forms.Keys)((System.Windows.Forms.Keys.Alt | System.Windows.Forms.Keys.O)));
            this.tsmi_OpenSite.Size = new System.Drawing.Size(86, 21);
            this.tsmi_OpenSite.Text = "在线导表(O)";
            this.tsmi_OpenSite.Click += new System.EventHandler(this.tsmi_OpenSite_Click);
            // 
            // toolStrip1
            // 
            this.toolStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.tsb_RefreshTable,
            this.tsb_ModifyToCsv,
            this.toolStripSeparator5,
            this.tsb_Csv2Code,
            this.toolStripSeparator3});
            this.toolStrip1.Location = new System.Drawing.Point(0, 25);
            this.toolStrip1.Name = "toolStrip1";
            this.toolStrip1.Size = new System.Drawing.Size(984, 25);
            this.toolStrip1.TabIndex = 5;
            this.toolStrip1.Text = "toolStrip1";
            // 
            // tsb_RefreshTable
            // 
            this.tsb_RefreshTable.Image = global::TableEditor.Properties.Resources.refresh;
            this.tsb_RefreshTable.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.tsb_RefreshTable.Name = "tsb_RefreshTable";
            this.tsb_RefreshTable.Size = new System.Drawing.Size(105, 22);
            this.tsb_RefreshTable.Text = "刷新修改Excel";
            this.tsb_RefreshTable.Click += new System.EventHandler(this.tsmi_RefreshTable_Click);
            // 
            // tsb_ModifyToCsv
            // 
            this.tsb_ModifyToCsv.Image = global::TableEditor.Properties.Resources.csv_text;
            this.tsb_ModifyToCsv.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.tsb_ModifyToCsv.Name = "tsb_ModifyToCsv";
            this.tsb_ModifyToCsv.Size = new System.Drawing.Size(99, 22);
            this.tsb_ModifyToCsv.Text = "导出修改CSV";
            this.tsb_ModifyToCsv.ToolTipText = "导出修改CSV";
            this.tsb_ModifyToCsv.Click += new System.EventHandler(this.tsmi_ModifySaveCsv_Click);
            // 
            // toolStripSeparator5
            // 
            this.toolStripSeparator5.Name = "toolStripSeparator5";
            this.toolStripSeparator5.Size = new System.Drawing.Size(6, 25);
            // 
            // tsb_Csv2Code
            // 
            this.tsb_Csv2Code.Image = global::TableEditor.Properties.Resources.table_go;
            this.tsb_Csv2Code.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.tsb_Csv2Code.Name = "tsb_Csv2Code";
            this.tsb_Csv2Code.Size = new System.Drawing.Size(76, 22);
            this.tsb_Csv2Code.Text = "测试导表";
            this.tsb_Csv2Code.Click += new System.EventHandler(this.tsmi_Csv2Code_Click);
            // 
            // toolStripSeparator3
            // 
            this.toolStripSeparator3.Name = "toolStripSeparator3";
            this.toolStripSeparator3.Size = new System.Drawing.Size(6, 25);
            // 
            // btn_seachTable
            // 
            this.btn_seachTable.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Right)));
            this.btn_seachTable.Location = new System.Drawing.Point(185, 8);
            this.btn_seachTable.Margin = new System.Windows.Forms.Padding(0);
            this.btn_seachTable.MaximumSize = new System.Drawing.Size(60, 25);
            this.btn_seachTable.MinimumSize = new System.Drawing.Size(60, 25);
            this.btn_seachTable.Name = "btn_seachTable";
            this.btn_seachTable.Size = new System.Drawing.Size(60, 25);
            this.btn_seachTable.TabIndex = 1;
            this.btn_seachTable.Text = "查 找";
            this.btn_seachTable.UseVisualStyleBackColor = true;
            this.btn_seachTable.Click += new System.EventHandler(this.btn_seachTable_Click);
            // 
            // tb_SearchName
            // 
            this.tb_SearchName.Anchor = ((System.Windows.Forms.AnchorStyles)(((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.tb_SearchName.Location = new System.Drawing.Point(3, 10);
            this.tb_SearchName.Margin = new System.Windows.Forms.Padding(0);
            this.tb_SearchName.Name = "tb_SearchName";
            this.tb_SearchName.Size = new System.Drawing.Size(180, 21);
            this.tb_SearchName.TabIndex = 0;
            this.tb_SearchName.KeyDown += new System.Windows.Forms.KeyEventHandler(this.tb_SearchName_KeyDown);
            // 
            // tv_table
            // 
            this.tv_table.Anchor = ((System.Windows.Forms.AnchorStyles)((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom) 
            | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.tv_table.ContextMenuStrip = this.cms_TableTree;
            this.tv_table.HideSelection = false;
            this.tv_table.Location = new System.Drawing.Point(0, 40);
            this.tv_table.MinimumSize = new System.Drawing.Size(148, 4);
            this.tv_table.Name = "tv_table";
            this.tv_table.ShowNodeToolTips = true;
            this.tv_table.Size = new System.Drawing.Size(246, 618);
            this.tv_table.TabIndex = 0;
            this.tv_table.BeforeCollapse += new System.Windows.Forms.TreeViewCancelEventHandler(this.tv_table_BeforeCollapse);
            this.tv_table.BeforeExpand += new System.Windows.Forms.TreeViewCancelEventHandler(this.tv_table_BeforeExpand);
            this.tv_table.AfterSelect += new System.Windows.Forms.TreeViewEventHandler(this.tv_table_AfterSelect);
            this.tv_table.NodeMouseClick += new System.Windows.Forms.TreeNodeMouseClickEventHandler(this.tv_table_NodeMouseClick);
            this.tv_table.DoubleClick += new System.EventHandler(this.TreeView_DoubleClick);
            this.tv_table.MouseDown += new System.Windows.Forms.MouseEventHandler(this.tv_table_MouseDown);
            // 
            // cms_TableTree
            // 
            this.cms_TableTree.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.ttmi_Refresh,
            this.toolStripSeparator1,
            this.ttmi_UpdateAll,
            this.ttmi_CommitAll,
            this.ttmi_RevertAll});
            this.cms_TableTree.Name = "cms_TableTree";
            this.cms_TableTree.Size = new System.Drawing.Size(169, 98);
            // 
            // ttmi_Refresh
            // 
            this.ttmi_Refresh.Name = "ttmi_Refresh";
            this.ttmi_Refresh.Size = new System.Drawing.Size(168, 22);
            this.ttmi_Refresh.Text = "刷 新";
            this.ttmi_Refresh.Click += new System.EventHandler(this.tsmi_RefreshTable_Click);
            // 
            // toolStripSeparator1
            // 
            this.toolStripSeparator1.Name = "toolStripSeparator1";
            this.toolStripSeparator1.Size = new System.Drawing.Size(165, 6);
            // 
            // ttmi_UpdateAll
            // 
            this.ttmi_UpdateAll.Name = "ttmi_UpdateAll";
            this.ttmi_UpdateAll.Size = new System.Drawing.Size(168, 22);
            this.ttmi_UpdateAll.Text = "SVN Update All";
            this.ttmi_UpdateAll.Click += new System.EventHandler(this.tnmi_UpdateAll_Click);
            // 
            // ttmi_CommitAll
            // 
            this.ttmi_CommitAll.Name = "ttmi_CommitAll";
            this.ttmi_CommitAll.Size = new System.Drawing.Size(168, 22);
            this.ttmi_CommitAll.Text = "SVN Commit All";
            this.ttmi_CommitAll.Click += new System.EventHandler(this.tnmi_CommitAll_Click);
            // 
            // ttmi_RevertAll
            // 
            this.ttmi_RevertAll.Name = "ttmi_RevertAll";
            this.ttmi_RevertAll.Size = new System.Drawing.Size(168, 22);
            this.ttmi_RevertAll.Text = "SVN Revert All";
            this.ttmi_RevertAll.Click += new System.EventHandler(this.tnmi_RevertAll_Click);
            // 
            // cms_form
            // 
            this.cms_form.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.tsmi_Cascade,
            this.tsmi_TileHorizontal,
            this.tsmi_TileVertical,
            this.tsmi_AllMinimized});
            this.cms_form.Name = "cms_form";
            this.cms_form.Size = new System.Drawing.Size(171, 92);
            // 
            // tsmi_Cascade
            // 
            this.tsmi_Cascade.Name = "tsmi_Cascade";
            this.tsmi_Cascade.ShortcutKeys = ((System.Windows.Forms.Keys)((System.Windows.Forms.Keys.Control | System.Windows.Forms.Keys.D)));
            this.tsmi_Cascade.Size = new System.Drawing.Size(170, 22);
            this.tsmi_Cascade.Text = "层叠窗口";
            this.tsmi_Cascade.Click += new System.EventHandler(this.tsmi_Cascade_Click);
            // 
            // tsmi_TileHorizontal
            // 
            this.tsmi_TileHorizontal.Name = "tsmi_TileHorizontal";
            this.tsmi_TileHorizontal.Size = new System.Drawing.Size(170, 22);
            this.tsmi_TileHorizontal.Text = "堆叠显示窗口";
            this.tsmi_TileHorizontal.Click += new System.EventHandler(this.tsmi_TileHorizontal_Click);
            // 
            // tsmi_TileVertical
            // 
            this.tsmi_TileVertical.Name = "tsmi_TileVertical";
            this.tsmi_TileVertical.Size = new System.Drawing.Size(170, 22);
            this.tsmi_TileVertical.Text = "并排显示窗口";
            this.tsmi_TileVertical.Click += new System.EventHandler(this.tsmi_TileVertical_Click);
            // 
            // tsmi_AllMinimized
            // 
            this.tsmi_AllMinimized.Name = "tsmi_AllMinimized";
            this.tsmi_AllMinimized.Size = new System.Drawing.Size(170, 22);
            this.tsmi_AllMinimized.Text = "全部最小化";
            this.tsmi_AllMinimized.Click += new System.EventHandler(this.tsmi_AllMinimized_Click);
            // 
            // bw_ReloadTableXML
            // 
            this.bw_ReloadTableXML.WorkerReportsProgress = true;
            this.bw_ReloadTableXML.WorkerSupportsCancellation = true;
            this.bw_ReloadTableXML.DoWork += new System.ComponentModel.DoWorkEventHandler(this.bw_ReloadTableXML_DoWork);
            this.bw_ReloadTableXML.ProgressChanged += new System.ComponentModel.ProgressChangedEventHandler(this.bw_ReloadTableXML_ProgressChanged);
            this.bw_ReloadTableXML.RunWorkerCompleted += new System.ComponentModel.RunWorkerCompletedEventHandler(this.bw_ReloadTableXML_RunWorkerCompleted);
            // 
            // bw_SaveCsv
            // 
            this.bw_SaveCsv.WorkerReportsProgress = true;
            this.bw_SaveCsv.WorkerSupportsCancellation = true;
            this.bw_SaveCsv.DoWork += new System.ComponentModel.DoWorkEventHandler(this.bw_SaveCsv_DoWork);
            this.bw_SaveCsv.ProgressChanged += new System.ComponentModel.ProgressChangedEventHandler(this.bw_SaveCsv_ProgressChanged);
            this.bw_SaveCsv.RunWorkerCompleted += new System.ComponentModel.RunWorkerCompletedEventHandler(this.bw_SaveCsv_RunWorkerCompleted);
            // 
            // cms_TableNode
            // 
            this.cms_TableNode.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.tnmi_OneSaveCsv,
            this.tnmi_Update,
            this.tnmi_Commit,
            this.tnmi_Revert,
            this.toolStripSeparator2,
            this.tnmi_Refresh,
            this.tnmi_UpdateAll,
            this.tnmi_CommitAll,
            this.tnmi_RevertAll,
            this.toolStripSeparator7,
            this.tnmi_OpenFile,
            this.tnmi_OpenDirectory});
            this.cms_TableNode.Name = "cms_TableNode";
            this.cms_TableNode.Size = new System.Drawing.Size(169, 258);
            // 
            // tnmi_OneSaveCsv
            // 
            this.tnmi_OneSaveCsv.Name = "tnmi_OneSaveCsv";
            this.tnmi_OneSaveCsv.Size = new System.Drawing.Size(168, 22);
            this.tnmi_OneSaveCsv.Text = "导成csv";
            this.tnmi_OneSaveCsv.Click += new System.EventHandler(this.tnmi_OneSaveCsv_Click);
            // 
            // tnmi_Update
            // 
            this.tnmi_Update.Name = "tnmi_Update";
            this.tnmi_Update.Size = new System.Drawing.Size(168, 22);
            this.tnmi_Update.Text = "SVN Update";
            this.tnmi_Update.Click += new System.EventHandler(this.tnmi_Update_Click);
            // 
            // tnmi_Commit
            // 
            this.tnmi_Commit.Name = "tnmi_Commit";
            this.tnmi_Commit.Size = new System.Drawing.Size(168, 22);
            this.tnmi_Commit.Text = "SVN Commit..";
            this.tnmi_Commit.Click += new System.EventHandler(this.tnmi_Commit_Click);
            // 
            // tnmi_Revert
            // 
            this.tnmi_Revert.Name = "tnmi_Revert";
            this.tnmi_Revert.Size = new System.Drawing.Size(168, 22);
            this.tnmi_Revert.Text = "SVN Revert";
            this.tnmi_Revert.Click += new System.EventHandler(this.tnmi_Revert_Click);
            // 
            // toolStripSeparator2
            // 
            this.toolStripSeparator2.Name = "toolStripSeparator2";
            this.toolStripSeparator2.Size = new System.Drawing.Size(165, 6);
            // 
            // tnmi_Refresh
            // 
            this.tnmi_Refresh.Name = "tnmi_Refresh";
            this.tnmi_Refresh.Size = new System.Drawing.Size(168, 22);
            this.tnmi_Refresh.Text = "刷 新";
            this.tnmi_Refresh.Click += new System.EventHandler(this.tsmi_RefreshTable_Click);
            // 
            // tnmi_UpdateAll
            // 
            this.tnmi_UpdateAll.Name = "tnmi_UpdateAll";
            this.tnmi_UpdateAll.Size = new System.Drawing.Size(168, 22);
            this.tnmi_UpdateAll.Text = "SVN Update All";
            this.tnmi_UpdateAll.Click += new System.EventHandler(this.tnmi_UpdateAll_Click);
            // 
            // tnmi_CommitAll
            // 
            this.tnmi_CommitAll.Name = "tnmi_CommitAll";
            this.tnmi_CommitAll.Size = new System.Drawing.Size(168, 22);
            this.tnmi_CommitAll.Text = "SVN Commit All";
            this.tnmi_CommitAll.Click += new System.EventHandler(this.tnmi_CommitAll_Click);
            // 
            // tnmi_RevertAll
            // 
            this.tnmi_RevertAll.Name = "tnmi_RevertAll";
            this.tnmi_RevertAll.Size = new System.Drawing.Size(168, 22);
            this.tnmi_RevertAll.Text = "SVN Revert All";
            this.tnmi_RevertAll.Click += new System.EventHandler(this.tnmi_RevertAll_Click);
            // 
            // bw_Csv2Code
            // 
            this.bw_Csv2Code.WorkerReportsProgress = true;
            this.bw_Csv2Code.WorkerSupportsCancellation = true;
            this.bw_Csv2Code.DoWork += new System.ComponentModel.DoWorkEventHandler(this.bw_Csv2Code_DoWork);
            this.bw_Csv2Code.ProgressChanged += new System.ComponentModel.ProgressChangedEventHandler(this.bw_Csv2Code_ProgressChanged);
            this.bw_Csv2Code.RunWorkerCompleted += new System.ComponentModel.RunWorkerCompletedEventHandler(this.bw_Csv2Code_RunWorkerCompleted);
            // 
            // panel1
            // 
            this.panel1.BackColor = System.Drawing.SystemColors.Control;
            this.panel1.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D;
            this.panel1.Controls.Add(this.tv_table);
            this.panel1.Controls.Add(this.tb_SearchName);
            this.panel1.Controls.Add(this.btn_seachTable);
            this.panel1.Dock = System.Windows.Forms.DockStyle.Left;
            this.panel1.Location = new System.Drawing.Point(0, 50);
            this.panel1.MinimumSize = new System.Drawing.Size(25, 4);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(250, 662);
            this.panel1.TabIndex = 11;
            // 
            // splitter1
            // 
            this.splitter1.BackColor = System.Drawing.SystemColors.Control;
            this.splitter1.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D;
            this.splitter1.Location = new System.Drawing.Point(250, 50);
            this.splitter1.Name = "splitter1";
            this.splitter1.Size = new System.Drawing.Size(3, 662);
            this.splitter1.TabIndex = 12;
            this.splitter1.TabStop = false;
            // 
            // toolStripSeparator7
            // 
            this.toolStripSeparator7.Name = "toolStripSeparator7";
            this.toolStripSeparator7.Size = new System.Drawing.Size(165, 6);
            // 
            // tnmi_OpenFile
            // 
            this.tnmi_OpenFile.Name = "tnmi_OpenFile";
            this.tnmi_OpenFile.Size = new System.Drawing.Size(168, 22);
            this.tnmi_OpenFile.Text = "打开文件";
            this.tnmi_OpenFile.Click += new System.EventHandler(this.tnmi_OpenFile_Click);
            // 
            // tnmi_OpenDirectory
            // 
            this.tnmi_OpenDirectory.Name = "tnmi_OpenDirectory";
            this.tnmi_OpenDirectory.Size = new System.Drawing.Size(168, 22);
            this.tnmi_OpenDirectory.Text = "打开所在文件夹";
            this.tnmi_OpenDirectory.Click += new System.EventHandler(this.tnmi_OpenDirectory_Click);
            // 
            // MainForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.AppWorkspace;
            this.ClientSize = new System.Drawing.Size(984, 712);
            this.ContextMenuStrip = this.cms_form;
            this.Controls.Add(this.splitter1);
            this.Controls.Add(this.panel1);
            this.Controls.Add(this.toolStrip1);
            this.Controls.Add(this.menuStrip1);
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.IsMdiContainer = true;
            this.MainMenuStrip = this.menuStrip1;
            this.Name = "MainForm";
            this.Text = "表格编辑器";
            this.Load += new System.EventHandler(this.MainForm_Load);
            this.menuStrip1.ResumeLayout(false);
            this.menuStrip1.PerformLayout();
            this.toolStrip1.ResumeLayout(false);
            this.toolStrip1.PerformLayout();
            this.cms_TableTree.ResumeLayout(false);
            this.cms_form.ResumeLayout(false);
            this.cms_TableNode.ResumeLayout(false);
            this.panel1.ResumeLayout(false);
            this.panel1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem tsmi_OpenSet;
        private System.Windows.Forms.ToolStrip toolStrip1;
        private System.Windows.Forms.Button btn_seachTable;
        private System.Windows.Forms.TextBox tb_SearchName;
        private System.Windows.Forms.ToolStripMenuItem tsmi_ReloadTableXML;
        private System.Windows.Forms.TreeView tv_table;
        private System.Windows.Forms.ContextMenuStrip cms_TableTree;
        private System.Windows.Forms.ToolStripMenuItem tsmi_Csv2Code;
        private System.Windows.Forms.ContextMenuStrip cms_form;
        private System.Windows.Forms.ToolStripMenuItem tsmi_Cascade;
        private System.Windows.Forms.ToolStripMenuItem tsmi_TileHorizontal;
        private System.Windows.Forms.ToolStripMenuItem tsmi_TileVertical;
        private System.Windows.Forms.ToolStripMenuItem tsmi_AllMinimized;
        private System.ComponentModel.BackgroundWorker bw_ReloadTableXML;
        private System.ComponentModel.BackgroundWorker bw_SaveCsv;
        private System.Windows.Forms.ToolStripMenuItem tsmi_AllSaveCsv;
        private System.Windows.Forms.ToolStripMenuItem ttmi_UpdateAll;
        private System.Windows.Forms.ToolStripMenuItem ttmi_CommitAll;
        private System.Windows.Forms.ContextMenuStrip cms_TableNode;
        private System.Windows.Forms.ToolStripMenuItem tnmi_OneSaveCsv;
        private System.Windows.Forms.ToolStripMenuItem tnmi_Update;
        private System.Windows.Forms.ToolStripMenuItem tnmi_Commit;
        private System.Windows.Forms.ToolStripMenuItem ttmi_Refresh;
        private System.Windows.Forms.ToolStripSeparator toolStripSeparator1;
        private System.Windows.Forms.ToolStripMenuItem tnmi_Refresh;
        private System.Windows.Forms.ToolStripSeparator toolStripSeparator2;
        private System.Windows.Forms.ToolStripMenuItem tmsi_Action;
        private System.Windows.Forms.ToolStripSeparator toolStripSeparator4;
        private System.Windows.Forms.ToolStripSeparator toolStripSeparator5;
        private System.Windows.Forms.ToolStripButton tsb_Csv2Code;
        private System.Windows.Forms.ToolStripButton tsb_ModifyToCsv;
        private System.Windows.Forms.ToolStripMenuItem tnmi_UpdateAll;
        private System.Windows.Forms.ToolStripMenuItem tnmi_CommitAll;
        private System.ComponentModel.BackgroundWorker bw_Csv2Code;
        private System.Windows.Forms.ToolStripButton tsb_RefreshTable;
        private System.Windows.Forms.ToolStripMenuItem tsmi_RefreshTable;
        private System.Windows.Forms.ToolStripMenuItem tsmi_ModifySaveCsv;
        private System.Windows.Forms.ToolStripSeparator toolStripSeparator6;
        private System.Windows.Forms.ToolStripMenuItem ttmi_RevertAll;
        private System.Windows.Forms.ToolStripMenuItem tnmi_RevertAll;
        private System.Windows.Forms.ToolStripMenuItem tnmi_Revert;
        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Splitter splitter1;
        private System.Windows.Forms.ToolStripSeparator toolStripSeparator3;
        private System.Windows.Forms.ToolStripMenuItem tsmi_OpenSite;
        private System.Windows.Forms.ToolStripSeparator toolStripSeparator7;
        private System.Windows.Forms.ToolStripMenuItem tnmi_OpenFile;
        private System.Windows.Forms.ToolStripMenuItem tnmi_OpenDirectory;
        
        

    }
}

