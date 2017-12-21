using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.Xml;

namespace TableEditor
{
    public class SearchTableArgs
    {
        public string name;
        public string filename;
        public string sheetname;
        public string column_id, column_name;
        public string columns;
        public string start_id, end_id;
        
        public void FromXmlNode(XmlNode node)
        {
            name = node.SelectSingleNode("name").InnerText;
            filename = node.SelectSingleNode("filename").InnerText;
            sheetname = node.SelectSingleNode("sheetname").InnerText;
            column_id = node.SelectSingleNode("column_id").InnerText;
            column_name = node.SelectSingleNode("column_name").InnerText;
            columns = node.SelectSingleNode("columns").InnerText;
            start_id = node.SelectSingleNode("start_id").InnerText;
            end_id = node.SelectSingleNode("end_id").InnerText;
        }

        public void ToXmlNode(XmlDocument doc, XmlNode node)
        {
            XmlNode tmp = node.SelectSingleNode("name");
            if (tmp == null)
            {
                tmp = doc.CreateElement("name");
                node.AppendChild(tmp);
            }
            tmp.InnerText = name;

            tmp = node.SelectSingleNode("filename");
            if (tmp == null)
            {
                tmp = doc.CreateElement("filename");
                node.AppendChild(tmp);
            }
            tmp.InnerText = filename;

            tmp = node.SelectSingleNode("sheetname");
            if (tmp == null)
            {
                tmp = doc.CreateElement("sheetname");
                node.AppendChild(tmp);
            }
            tmp.InnerText = sheetname;

            tmp = node.SelectSingleNode("column_id");
            if (tmp == null)
            {
                tmp = doc.CreateElement("column_id");
                node.AppendChild(tmp);
            }
            tmp.InnerText = column_id;

            tmp = node.SelectSingleNode("column_name");
            if (tmp == null)
            {
                tmp = doc.CreateElement("column_name");
                node.AppendChild(tmp);
            }
            tmp.InnerText = column_name;

            tmp = node.SelectSingleNode("columns");
            if (tmp == null)
            {
                tmp = doc.CreateElement("columns");
                node.AppendChild(tmp);
            }
            tmp.InnerText = columns;

            tmp = node.SelectSingleNode("start_id");
            if (tmp == null)
            {
                tmp = doc.CreateElement("start_id");
                node.AppendChild(tmp);
            }
            tmp.InnerText = start_id;

            tmp = node.SelectSingleNode("end_id");
            if (tmp == null)
            {
                tmp = doc.CreateElement("end_id");
                node.AppendChild(tmp);
            }
            tmp.InnerText = end_id;
        }

    }
}
