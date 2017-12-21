using System.IO;
using System;

namespace TableEditor
{
    class ConfigUtils
    {
        public static void init()
        {
            if (!System.IO.Directory.Exists(Setting.LOG_PATH))
            {
                System.IO.Directory.CreateDirectory(Setting.LOG_PATH);
            }
            if (!System.IO.Directory.Exists(Setting.scriptPath))
            {
                System.IO.Directory.CreateDirectory(Setting.scriptPath);
            }
        }

        public static void Log(params string[] messages)
        {
            if (!System.IO.Directory.Exists(Setting.LOG_PATH))
            {
                System.IO.Directory.CreateDirectory(Setting.LOG_PATH);
            }
            string fileName = Setting.LOG_PATH + string.Format("log_{0}.log", System.DateTime.Now.ToString("yyyyMMdd"));
            string log = string.Format("[Log] {0}{1}{2}{3}", System.DateTime.Now.ToString("yyyy-MM-dd HH:mm:ss"), Environment.NewLine, String.Join(Environment.NewLine, messages), Environment.NewLine);
            using (StreamWriter sw = File.AppendText(fileName))
            {
                sw.WriteLine(log);
                sw.Flush();
                sw.Close();
            }
        }

        public static void Error(params string[] messages)
        {
            if (!System.IO.Directory.Exists(Setting.LOG_PATH))
            {
                System.IO.Directory.CreateDirectory(Setting.LOG_PATH);
            }
            string fileName = Setting.LOG_PATH + string.Format("error_{0}.log", System.DateTime.Now.ToString("yyyyMMdd"));
            string log = string.Format("[Error] {0}{1}{2}{3}", System.DateTime.Now.ToString("yyyy-MM-dd HH:mm:ss"), Environment.NewLine, String.Join(Environment.NewLine, messages), Environment.NewLine);
            using (StreamWriter sw = File.AppendText(fileName))
            {
                sw.WriteLine(log);
                sw.Flush();
                sw.Close();
            }
        }

        //如果config.xml文件不存在, 就创建一个
        public static void CreateConfigXML()
        {
            if (!System.IO.File.Exists(Setting.CONFIG_FILE))
            {
                Setting.needSetConfigFirst = true;
                string context = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n<root></root>";
                using (StreamWriter sw = new StreamWriter(Setting.CONFIG_FILE))
                {
                    sw.WriteLine(context);
                    sw.Flush();
                    sw.Close();
                }
            }
        }

        public static void CreateTableTreeXML()
        {
            if (!System.IO.File.Exists(Setting.TREE_FILE))
            {
                string context = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n<root></root>";
                using (StreamWriter sw = new StreamWriter(Setting.TREE_FILE))
                {
                    sw.WriteLine(context);
                    sw.Flush();
                    sw.Close();
                }
            }            
        }

        public static void CreateTableSearchXML()
        {
            if (!System.IO.File.Exists(Setting.SEARCH_FILE))
            {
                string context = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n<root></root>";
                using (StreamWriter sw = new StreamWriter(Setting.SEARCH_FILE))
                {
                    sw.WriteLine(context);
                    sw.Flush();
                    sw.Close();
                }
            }
        }

    }
}
