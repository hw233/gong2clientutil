using System;
using System.Collections.Generic;
using System.Xml;
using System.IO;
using System.Data.OleDb;
using System.Data;
using System.ComponentModel;

namespace TableEditor
{
    class Node
    {
        public List<string> sheetname;
        public string bookname;
    }
    class XMLController
    {
        //配置文件config的读写
        public static void WriteConfigXML()
        {
            ConfigUtils.CreateConfigXML();
            XmlDocument doc = new XmlDocument();
            try
            {
                doc.Load(Setting.CONFIG_FILE);
                XmlNode root = doc.SelectSingleNode("root");

                XmlNode node = root.SelectSingleNode("tablePath");
                if (node == null)
                {
                    node = doc.CreateElement("tablePath");
                    root.AppendChild(node);
                }
                node.InnerText = Setting.tablePath;

                node = root.SelectSingleNode("tortoiseSvnPath");
                if (node == null)
                {
                    node = doc.CreateElement("tortoiseSvnPath");
                    root.AppendChild(node);
                }
                node.InnerText = Setting.tortoiseSvnPath;

                node = root.SelectSingleNode("svnPath");
                if (node == null)
                {
                    node = doc.CreateElement("svnPath");
                    root.AppendChild(node);
                }
                node.InnerText = Setting.svnPath;

                node = root.SelectSingleNode("pythonPath");
                if (node == null)
                {
                    node = doc.CreateElement("pythonPath");
                    root.AppendChild(node);
                }
                node.InnerText = Setting.pythonPath;

                node = root.SelectSingleNode("siteUrl");
                if (node == null)
                {
                    node = doc.CreateElement("siteUrl");
                    root.AppendChild(node);
                }
                node.InnerText = Setting.siteUrl;

                doc.Save(Setting.CONFIG_FILE);                
            }
            catch (System.Exception ex)
            {
                ConfigUtils.Error(ex.Message, ex.StackTrace);
            }
        }

        public static void ReadConfigXML()
        {
            ConfigUtils.CreateConfigXML();
            XmlDocument doc = new XmlDocument();
            try
            {
                doc.Load(Setting.CONFIG_FILE);
                XmlNode root = doc.SelectSingleNode("root");

                XmlNode node = root.SelectSingleNode("tablePath");
                if (node != null)
                {
                    Setting.tablePath = node.InnerText;
                }

                node = root.SelectSingleNode("tortoiseSvnPath");
                if (node != null)
                {
                    Setting.tortoiseSvnPath = node.InnerText;
                }

                node = root.SelectSingleNode("svnPath");
                if (node != null)
                {
                    Setting.svnPath = node.InnerText;
                }

                node = root.SelectSingleNode("pythonPath");
                if (node != null)
                {
                    Setting.pythonPath = node.InnerText;
                }

                node = root.SelectSingleNode("siteUrl");
                if (node != null)
                {
                    Setting.siteUrl = node.InnerText;
                }
            }
            catch (System.Exception ex)
            {
                ConfigUtils.Error(ex.Message, ex.StackTrace);
            }
        }

        //tree.xml读写
        public static List<Node> ReadTableTreeXML()
        {
            ConfigUtils.CreateTableTreeXML();
            XmlDocument doc = new XmlDocument();
            List<Node> list = new List<Node>();
            try
            {
                doc.Load(Setting.TREE_FILE);
                XmlNode root = doc.SelectSingleNode("root");
                foreach (XmlNode node in root.ChildNodes)
                {
                    Node nd = new Node();
                    nd.sheetname = new List<string>();
                    XmlElement ele = (XmlElement)node;
                    nd.bookname = ele.GetAttribute("name");
                    foreach (XmlNode subNode in ele.ChildNodes)
                    {
                        nd.sheetname.Add(subNode.InnerText);
                    }
                    list.Add(nd);
                }
            }
            catch (System.Exception ex)
            {
                ConfigUtils.Error(ex.Message, ex.StackTrace);
            }  
            return list;
        }

        public static bool WriteTableTreeXML(string excelDirectory, BackgroundWorker bw)
        {
            ConfigUtils.CreateTableTreeXML();
            XmlDocument doc = new XmlDocument();
            try
            {
                doc.Load(Setting.TREE_FILE);
                XmlNode root = doc.SelectSingleNode("root");
                root.InnerText = null;
                DirectoryInfo baseDir = new DirectoryInfo(excelDirectory);
                FileInfo[] files = baseDir.GetFiles("*.xls*");
                int size = files.GetLength(0);
                int cur = 0;
                foreach (FileInfo file in files)
                {
                    if (bw.CancellationPending)
                    {
                        return false;
                    }
                    if (file.Name.StartsWith("~$"))
                    {
                        continue;
                    }
                    bw.ReportProgress((int)(cur * 100.0f / size), "正在搜索: " + file.Name);
                    XmlElement xmlElm = doc.CreateElement("excel");
                    xmlElm.SetAttribute("name", file.Name);

                    List<string> sheetNames = ExcelUtils.ImportSheetName(file.FullName);
                    foreach (string sheetName in sheetNames)
                    {
                        XmlElement xmlSubElm = doc.CreateElement("sheet");
                        xmlSubElm.InnerText = sheetName;
                        xmlElm.AppendChild(xmlSubElm);
                    }
                    root.AppendChild(xmlElm);
                    ++cur;                
                }
                doc.Save(Setting.TREE_FILE);

                bw.ReportProgress(100, string.Format("共搜索到{0}个文件", size));
            }
            catch (System.Exception ex)
            {
                ConfigUtils.Error(ex.Message, ex.StackTrace);
                return false;
            }

            return true;
        }
       
       
        //搜索定制表格tableSearch.xml的读写
        public static void ReadTableSearchXML()
        {
            ConfigUtils.CreateTableSearchXML();
            XmlDocument doc = new XmlDocument();
            try
            {
                doc.Load(Setting.SEARCH_FILE);
                XmlNode root = doc.SelectSingleNode("root");
                XmlNodeList nodes = root.SelectNodes("node");
                Setting.searchTables.Clear();
                foreach (XmlNode node in nodes)
                {
                    SearchTableArgs args = new SearchTableArgs();
                    args.FromXmlNode(node);
                    Setting.searchTables.Add(args);
                }
            }
            catch (Exception ex)
            {
                ConfigUtils.Error(ex.Message, ex.StackTrace);
            }
        }

        public static void WriteTableSearchXML()
        {
            ConfigUtils.CreateTableSearchXML();
            XmlDocument doc = new XmlDocument();
            try
            {
                doc.Load(Setting.SEARCH_FILE);
                XmlNode root = doc.SelectSingleNode("root");
                XmlNodeList nodes = root.SelectNodes("node");

                if (nodes.Count < Setting.searchTables.Count)
                {
                    for (int i = nodes.Count; i < Setting.searchTables.Count; ++i)
                    {
                        XmlNode node = doc.CreateElement("node");
                        root.AppendChild(node);
                    }
                }
                else
                {
                    for (int i = Setting.searchTables.Count; i < nodes.Count; ++i)
                    {
                        root.RemoveChild(nodes[i]);
                    }
                }
                nodes = root.SelectNodes("node");
                for (int i = 0; i < nodes.Count; ++i)
                {
                    Setting.searchTables[i].ToXmlNode(doc, nodes[i]);
                }
                doc.Save(Setting.SEARCH_FILE);
            }
            catch (Exception ex)
            {
                ConfigUtils.Error(ex.Message, ex.StackTrace);
            }
        }

    }
}
