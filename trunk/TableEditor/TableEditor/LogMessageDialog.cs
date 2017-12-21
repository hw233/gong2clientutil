using System;
using System.Windows.Forms;
using System.ComponentModel;

namespace TableEditor
{
    public enum ButtonState
    {
        OK = 0,
        CANCEL
    }
    public partial class LogMessageDialog : Form
    {
        const string BUTTON_OK = "确 定";
        const string BUTTON_CANCEL = "取 消";
        
        BackgroundWorker bw; 
        public LogMessageDialog(string msg)
        {
            InitializeComponent();
            rtb_log.Text = msg;
            bw = null;
        }
        public void SetBackgroundWorker(BackgroundWorker bw)
        {
            this.bw = bw;
        }
        public void SetText(string s)
        {
            rtb_log.Text = s;
        }
        public void AppendText(string s)
        {
            rtb_log.AppendText(s);
        }
        public string GetText()
        {
            return rtb_log.Text;
        }
        public void SetButtonState(ButtonState bs)
        {
            btn_ok.Tag = bs;
            if (bs == ButtonState.OK)
            {
                btn_ok.Text = BUTTON_OK;
            }
            else if (bs == ButtonState.CANCEL)
            {
                btn_ok.Text = BUTTON_CANCEL;
            }
        }
        private void btn_ok_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void rtb_log_TextChanged(object sender, EventArgs e)
        {
            rtb_log.SelectionStart = rtb_log.GetFirstCharIndexFromLine(rtb_log.GetLineFromCharIndex(rtb_log.Text.Length));
        }

        private void LogMessageDialog_FormClosing(object sender, FormClosingEventArgs e)
        {
            ButtonState bs = (ButtonState)btn_ok.Tag;
            if (bs == ButtonState.CANCEL)
            {
                bw.CancelAsync();
            }
        }
    }
}
