using System;
using System.Windows.Forms;

namespace TableEditor
{
    public partial class SettingDialog : Form
    {
        public SettingDialog()
        {
            InitializeComponent();
            fbd.SelectedPath = Setting.ROOT_PATH;
            tb_table.Text = Setting.tablePath;
            tb_tortoise_svn.Text = Setting.tortoiseSvnPath;
            tb_svn.Text = Setting.svnPath;
            tb_python.Text = Setting.pythonPath;            
        }

        private void btn_Click(object sender, EventArgs e)
        {
            Button tmp = (Button)sender;

            if (fbd.ShowDialog() == DialogResult.OK)
            {
                switch (tmp.Name)
                {
                    case "btn_table":
                        tb_table.Text = fbd.SelectedPath;                        
                        break;
                    case "btn_tortoise_svn":
                        tb_tortoise_svn.Text = fbd.SelectedPath;
                        break;
                    case "btn_svn":
                        tb_svn.Text = fbd.SelectedPath;
                        break;
                    case "btn_python":
                        tb_python.Text = fbd.SelectedPath;
                        break;
                    default: break;
                }
            }

        }

        private void btn_Ok_Click(object sender, EventArgs e)
        {
            Setting.tablePath = tb_table.Text;
            Setting.tortoiseSvnPath = tb_tortoise_svn.Text;
            Setting.svnPath = tb_svn.Text;
            Setting.pythonPath = tb_python.Text;
            XMLController.WriteConfigXML();
            this.Close();
        }

    }
}
