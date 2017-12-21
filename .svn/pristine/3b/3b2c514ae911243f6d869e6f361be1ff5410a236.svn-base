
using System.Collections.Generic;
namespace TableEditor
{
    public class Setting
    {
        public static readonly string ROOT_PATH = System.Windows.Forms.Application.StartupPath.ToString(); //软件所在目录
        //相对exe文件路径
        public static readonly string CONFIG_FILE = ROOT_PATH + @"\config.xml";  //软件一些文件读取路径
        public static readonly string TREE_FILE = ROOT_PATH + @"\tree.xml"; //目录树
        public static readonly string SEARCH_FILE = ROOT_PATH + @"\search.xml";//定制查询表格的相关信息
        public static readonly string LOG_PATH = ROOT_PATH + @"\log\"; //日志所在路径
        public const string EXCEL = @"\excel\";
        public const string CSV = @"\csv\";
        public const string GEN = @"\gen\";

        public static string tablePath = ROOT_PATH + @"\table"; //表格所在路径,下有 excel 和 csv 两个文件夹
        public static string svnPath = @"C:\Program Files\TortoiseSVN\bin";
        public static string tortoiseSvnPath = @"C:\Program Files\TortoiseSVN\bin";
        public static string pythonPath = @"C:\Python27"; //python安装所在路径
        public static string siteUrl = @"http://tools.hadoit.com:8090/gametools/design/index"; //在线导表站点

        public static string scriptPath = ROOT_PATH + @"\script"; //导表工具所在路径
        public static string genPath = @"\gen"; //生成代码所在路径

        //定制查询表格的 xlsx 和 sheet
      //  public static string[] table = new string[] { EXCEL + @"系统_物品数据表输出.xlsx", EXCEL + @"系统_功能NPC表.xlsx", EXCEL + @"闲人NPC表.xlsx", EXCEL + @"称号数据表.xlsx", EXCEL + @"任务表.xlsx", EXCEL + @"任务表表头.xlsx" };
     //   public static string[] xmlTableNode = new string[] { "tableItems", "tableFunctionNpc", "tableDawlerNpc", "tableTitle", "tableQuest_person", "tableQuest_header" };
       // public static string[] sheet = new string[] { @"道具_数据表", @"功能NPC表", @"闲人NPC表", @"称号数据表", @"任务_内容", @"任务_对白",@"NPC_任务NPC" };
      //  public static string[] xmlSheetNode = new string[] { "tableItemsSheet", "tableFunctionNpcSheet", "tableDawlerNpcSheet", "tableTitleSheet", "tableQuestSheet_person",  "tableQuestDialogSheet_person", "tableQuestNpcState_person" };

        public static bool needSetConfigFirst = false;
        //定制的查询表格
        public static List<SearchTableArgs> searchTables = new List<SearchTableArgs>();
    }
}
