package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 立绘资源定义表.csv
 * 资源编号 = id
 * 资源名称 = name
 * 武将名称 = servant_name
 * 抬高高度 = height
 * 缩放比例 = scaling
 */
public class CharactersData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        init1();
        init2();
        init3();
        init4();
        init5();
        init6();
        init7();
        init8();
        init9();
        init10();
        init11();
        init12();
        init13();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    1000, map("id", 1000, "name", 1000, "servant_name", "女主角", "height", 0, "scaling", 1),
    1001, map("id", 1001, "name", 1001, "servant_name", "男主角", "height", 0, "scaling", 1),
    5001, map("id", 5001, "name", 5001, "servant_name", "小太监", "height", 0, "scaling", 1),
    5002, map("id", 5002, "name", 5002, "servant_name", "低级太监", "height", 0, "scaling", 1),
    5003, map("id", 5003, "name", 5003, "servant_name", "中级太监", "height", 0, "scaling", 1)
);
    }

    private static void init1() {
data.map(
    5004, map("id", 5004, "name", 5004, "servant_name", "高级太监", "height", 0, "scaling", 1),
    5005, map("id", 5005, "name", 40028, "servant_name", "太监总管", "height", 0, "scaling", 1),
    5006, map("id", 5006, "name", 40021, "servant_name", "小宫女", "height", 0, "scaling", 1),
    5007, map("id", 5007, "name", 40009, "servant_name", "低等宫女", "height", 0, "scaling", 1),
    5008, map("id", 5008, "name", 40013, "servant_name", "中级宫女", "height", 0, "scaling", 1)
);
    }

    private static void init2() {
data.map(
    5010, map("id", 5010, "name", 40017, "servant_name", "宫女总管", "height", 0, "scaling", 1),
    5011, map("id", 5011, "name", 40012, "servant_name", "低级嬷嬷", "height", 0, "scaling", 1),
    5012, map("id", 5012, "name", 5012, "servant_name", "中级嬷嬷", "height", 0, "scaling", 1),
    5013, map("id", 5013, "name", 40015, "servant_name", "高级嬷嬷", "height", 0, "scaling", 1),
    5014, map("id", 5014, "name", 40012, "servant_name", "总管嬷嬷", "height", 0, "scaling", 1)
);
    }

    private static void init3() {
data.map(
    5015, map("id", 5015, "name", 40026, "servant_name", "低级侍卫", "height", 0, "scaling", 1),
    5016, map("id", 5016, "name", 40016, "servant_name", "中级侍卫", "height", 0, "scaling", 1),
    5017, map("id", 5017, "name", 40026, "servant_name", "高级侍卫", "height", 0, "scaling", 1),
    5018, map("id", 5018, "name", 40023, "servant_name", "总管侍卫", "height", 0, "scaling", 1),
    5019, map("id", 5019, "name", 40023, "servant_name", "低等武将", "height", 0, "scaling", 1)
);
    }

    private static void init4() {
data.map(
    5020, map("id", 5020, "name", 40016, "servant_name", "中等武将", "height", 0, "scaling", 1),
    5021, map("id", 5021, "name", 40014, "servant_name", "高等武将", "height", 0, "scaling", 1),
    5022, map("id", 5022, "name", 5022, "servant_name", "低等贵妇", "height", 0, "scaling", 1),
    5023, map("id", 5023, "name", 5023, "servant_name", "中等贵妇", "height", 0, "scaling", 1),
    5024, map("id", 5024, "name", 40017, "servant_name", "高等贵妇", "height", 0, "scaling", 1)
);
    }

    private static void init5() {
data.map(
    5025, map("id", 5025, "name", 40028, "servant_name", "青年文官", "height", 0, "scaling", 1),
    5026, map("id", 5026, "name", 5026, "servant_name", "老年文官", "height", 0, "scaling", 1),
    5027, map("id", 5027, "name", 40013, "servant_name", "美貌少女", "height", 0, "scaling", 1),
    5028, map("id", 5028, "name", 40010, "servant_name", "少年", "height", 0, "scaling", 1),
    5029, map("id", 5029, "name", 40016, "servant_name", "游侠", "height", 0, "scaling", 1)
);
    }

    private static void init6() {
data.map(
    5030, map("id", 5030, "name", 5030, "servant_name", "皇子", "height", 0, "scaling", 1),
    6000, map("id", 6000, "name", 6000, "servant_name", "石头", "height", 0, "scaling", 1),
    6001, map("id", 6001, "name", 6001, "servant_name", "会变成盒子的石头", "height", 0, "scaling", 1),
    40000, map("id", 40000, "name", 40004, "servant_name", "姬长生", "height", 0, "scaling", 1),
    40001, map("id", 40001, "name", 40001, "servant_name", "长雍君", "height", 0, "scaling", 1)
);
    }

    private static void init7() {
data.map(
    40002, map("id", 40002, "name", 40002, "servant_name", "闻仲", "height", 0, "scaling", 1),
    40003, map("id", 40003, "name", 40003, "servant_name", "李耳", "height", 0, "scaling", 1),
    40004, map("id", 40004, "name", 40004, "servant_name", "李青莲", "height", 0, "scaling", 1),
    40005, map("id", 40005, "name", 40005, "servant_name", "卡萨", "height", 0, "scaling", 1),
    40006, map("id", 40006, "name", 40006, "servant_name", "姬重华", "height", 0, "scaling", 1)
);
    }

    private static void init8() {
data.map(
    40007, map("id", 40007, "name", 40007, "servant_name", "安倍晴明", "height", 0, "scaling", 1),
    40008, map("id", 40008, "name", 40008, "servant_name", "承影", "height", 0, "scaling", 1),
    40009, map("id", 40009, "name", 40009, "servant_name", "霍曼曼", "height", 0, "scaling", 1),
    40010, map("id", 40010, "name", 40010, "servant_name", "公子尘来", "height", 0, "scaling", 1),
    40011, map("id", 40011, "name", 40011, "servant_name", "南歌", "height", 0, "scaling", 1)
);
    }

    private static void init9() {
data.map(
    40012, map("id", 40012, "name", 40012, "servant_name", "窦夫人", "height", 0, "scaling", 1),
    40013, map("id", 40013, "name", 40013, "servant_name", "胡不归", "height", 0, "scaling", 1),
    40014, map("id", 40014, "name", 40014, "servant_name", "武照", "height", 0, "scaling", 1),
    40015, map("id", 40015, "name", 40015, "servant_name", "穆云梳", "height", 0, "scaling", 1),
    40016, map("id", 40016, "name", 40016, "servant_name", "逍遥", "height", 0, "scaling", 1)
);
    }

    private static void init10() {
data.map(
    40017, map("id", 40017, "name", 40017, "servant_name", "玄机散人", "height", 0, "scaling", 1),
    40018, map("id", 40018, "name", 40012, "servant_name", "合德", "height", 0, "scaling", 1),
    40019, map("id", 40019, "name", 40015, "servant_name", "飞燕", "height", 0, "scaling", 1),
    40020, map("id", 40020, "name", 40020, "servant_name", "洗砚", "height", 0, "scaling", 1),
    40021, map("id", 40021, "name", 40021, "servant_name", "青湖", "height", 0, "scaling", 1)
);
    }

    private static void init11() {
data.map(
    40022, map("id", 40022, "name", 40022, "servant_name", "艳客", "height", 0, "scaling", 1),
    40023, map("id", 40023, "name", 40023, "servant_name", "离原", "height", 0, "scaling", 1),
    40024, map("id", 40024, "name", 40025, "servant_name", "姬燕来", "height", 0, "scaling", 1),
    40025, map("id", 40025, "name", 40025, "servant_name", "药王", "height", 0, "scaling", 1),
    40026, map("id", 40026, "name", 40026, "servant_name", "杜浪", "height", 0, "scaling", 1)
);
    }

    private static void init12() {
data.map(
    40027, map("id", 40027, "name", 40027, "servant_name", "柳如是", "height", 0, "scaling", 1),
    40028, map("id", 40028, "name", 40028, "servant_name", "张碧君", "height", 200, "scaling", 1),
    40029, map("id", 40029, "name", 40023, "servant_name", "燕小青", "height", 0, "scaling", 1),
    40030, map("id", 40030, "name", 40016, "servant_name", "要离", "height", 0, "scaling", 1),
    40031, map("id", 40031, "name", 40026, "servant_name", "荆轲", "height", 0, "scaling", 1)
);
    }

    private static void init13() {
data.map(
    40032, map("id", 40032, "name", 40032, "servant_name", "南鹤", "height", 0, "scaling", 1),
    40033, map("id", 40033, "name", 40014, "servant_name", "狄青剑", "height", 0, "scaling", 1),
    40034, map("id", 40034, "name", 40034, "servant_name", "公孙大娘", "height", 0, "scaling", 1),
    40035, map("id", 40035, "name", 40035, "servant_name", "张江陵", "height", 0, "scaling", 1),
    40036, map("id", 40036, "name", 40036, "servant_name", "杜少陵", "height", 0, "scaling", 1)
);
    }

}