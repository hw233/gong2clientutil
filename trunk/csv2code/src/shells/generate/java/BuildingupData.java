package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 建筑升级表.csv
 * 建筑编号编号 = id
 * 建筑名 = name
 * 升级后建筑ID = upgradeId
 * 主城标识 = sign
 * 升级建筑需要繁荣度 = glory
 * 升级建筑需要官品 = officerProduct
 * 升级建筑所需材料 = needmater
 * 升级建筑所需数量 = neednum
 * 升级耗时 = time
 * 产出类型 = outputtype
 * 产出时间 = outputtime
 * 产出数量 = outputnum
 * 工作类型 = worktype
 * 开启阵位 = vowopenloc
 * 阵位人数 = locpeople
 * 许愿产出货币类型 = vowtype
 * 许愿产出货币数量 = vownum
 * 产出倍率 = vowmul
 * 倍率概率 = vowpor
 */
public class BuildingupData extends LData {
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
        init14();
        init15();
        init16();
        init17();
        init18();
        init19();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    1000, map("id", 1000, "name", "主城", "upgradeId", 1001, "sign", 1, "glory", 4000, "officerProduct", 1, "needmater", list(10009), "neednum", list(2000), "time", 300),
    1001, map("id", 1001, "name", "主城", "upgradeId", 1002, "sign", 1, "glory", 6000, "officerProduct", 2, "needmater", list(10009), "neednum", list(3600), "time", 600),
    1002, map("id", 1002, "name", "主城", "upgradeId", 1003, "sign", 1, "glory", 8000, "officerProduct", 3, "needmater", list(10009), "neednum", list(9000), "time", 900),
    1003, map("id", 1003, "name", "主城", "upgradeId", 1004, "sign", 1, "glory", 10000, "officerProduct", 4, "needmater", list(10009), "neednum", list(16800), "time", 1500),
    1004, map("id", 1004, "name", "主城", "upgradeId", 1005, "sign", 1, "glory", 12000, "officerProduct", 5, "needmater", list(10009), "neednum", list(33000), "time", 2000)
);
    }

    private static void init1() {
data.map(
    1005, map("id", 1005, "name", "主城", "upgradeId", 1006, "sign", 1, "glory", 14000, "officerProduct", 6, "needmater", list(10009), "neednum", list(54000), "time", 2500),
    1006, map("id", 1006, "name", "主城", "upgradeId", 1007, "sign", 1, "glory", 16000, "officerProduct", 7, "needmater", list(10009), "neednum", list(79800), "time", 3000),
    1007, map("id", 1007, "name", "主城", "upgradeId", 1008, "sign", 1, "glory", 18000, "officerProduct", 8, "needmater", list(10009), "neednum", list(120000), "time", 4000),
    1008, map("id", 1008, "name", "主城", "upgradeId", 1009, "sign", 1, "glory", 20000, "officerProduct", 9, "needmater", list(10009), "neednum", list(167400), "time", 5000),
    1009, map("id", 1009, "name", "主城", "upgradeId", 1010, "sign", 1, "glory", 22000, "officerProduct", 10, "needmater", list(10009), "neednum", list(186000), "time", 6000)
);
    }

    private static void init2() {
data.map(
    1010, map("id", 1010, "name", "主城", "upgradeId", 1011, "sign", 1, "glory", 24000, "officerProduct", 11, "needmater", list(10009), "neednum", list(204600), "time", 7000),
    1011, map("id", 1011, "name", "主城", "upgradeId", 1012, "sign", 1, "glory", 26000, "officerProduct", 12, "needmater", list(10009), "neednum", list(223200), "time", 8000),
    1012, map("id", 1012, "name", "主城", "upgradeId", 1013, "sign", 1, "glory", 28000, "officerProduct", 13, "needmater", list(10009), "neednum", list(241800), "time", 9000),
    1013, map("id", 1013, "name", "主城", "upgradeId", 1014, "sign", 1, "glory", 30000, "officerProduct", 14, "needmater", list(10009), "neednum", list(260400), "time", 10000),
    1014, map("id", 1014, "name", "主城", "upgradeId", 1015, "sign", 1, "glory", 32000, "officerProduct", 15, "needmater", list(10009), "neednum", list(279000), "time", 11000)
);
    }

    private static void init3() {
data.map(
    1015, map("id", 1015, "name", "主城", "upgradeId", 1016, "sign", 1, "glory", 34000, "officerProduct", 16, "needmater", list(10009), "neednum", list(297600), "time", 12000),
    1016, map("id", 1016, "name", "主城", "upgradeId", 1017, "sign", 1, "glory", 36000, "officerProduct", 17, "needmater", list(10009), "neednum", list(316200), "time", 13000),
    1017, map("id", 1017, "name", "主城", "upgradeId", 1018, "sign", 1, "glory", 38000, "officerProduct", 18, "needmater", list(10009), "neednum", list(334800), "time", 14000),
    1018, map("id", 1018, "name", "主城", "upgradeId", 1019, "sign", 1, "glory", 40000, "officerProduct", 19, "needmater", list(10009), "neednum", list(353400), "time", 15000),
    1019, map("id", 1019, "name", "主城", "sign", 1, "officerProduct", 20, "needmater", list(10009), "neednum", list(372000), "time", 16000)
);
    }

    private static void init4() {
data.map(
    1100, map("id", 1100, "name", "鲜花地", "upgradeId", 1101, "sign", 2, "glory", 4000, "officerProduct", 1, "needmater", list(10009), "neednum", list(2000), "time", 300),
    1101, map("id", 1101, "name", "鲜花地", "upgradeId", 1102, "sign", 2, "glory", 6000, "officerProduct", 2, "needmater", list(10009), "neednum", list(3600), "time", 600),
    1102, map("id", 1102, "name", "鲜花地", "upgradeId", 1103, "sign", 2, "glory", 8000, "officerProduct", 3, "needmater", list(10009), "neednum", list(9000), "time", 900),
    1103, map("id", 1103, "name", "鲜花地", "upgradeId", 1104, "sign", 2, "glory", 10000, "officerProduct", 4, "needmater", list(10009), "neednum", list(16800), "time", 1500),
    1104, map("id", 1104, "name", "鲜花地", "upgradeId", 1105, "sign", 2, "glory", 12000, "officerProduct", 5, "needmater", list(10009), "neednum", list(33000), "time", 2000)
);
    }

    private static void init5() {
data.map(
    1105, map("id", 1105, "name", "鲜花地", "upgradeId", 1106, "sign", 2, "glory", 14000, "officerProduct", 6, "needmater", list(10009), "neednum", list(54000), "time", 2500),
    1106, map("id", 1106, "name", "鲜花地", "upgradeId", 1107, "sign", 2, "glory", 16000, "officerProduct", 7, "needmater", list(10009), "neednum", list(79800), "time", 3000),
    1107, map("id", 1107, "name", "鲜花地", "upgradeId", 1108, "sign", 2, "glory", 18000, "officerProduct", 8, "needmater", list(10009), "neednum", list(120000), "time", 4000),
    1108, map("id", 1108, "name", "鲜花地", "upgradeId", 1109, "sign", 2, "glory", 20000, "officerProduct", 9, "needmater", list(10009), "neednum", list(167400), "time", 5000),
    1109, map("id", 1109, "name", "鲜花地", "upgradeId", 1110, "sign", 2, "glory", 22000, "officerProduct", 10, "needmater", list(10009), "neednum", list(186000), "time", 6000)
);
    }

    private static void init6() {
data.map(
    1110, map("id", 1110, "name", "鲜花地", "upgradeId", 1111, "sign", 2, "glory", 24000, "officerProduct", 11, "needmater", list(10009), "neednum", list(204600), "time", 7000),
    1111, map("id", 1111, "name", "鲜花地", "upgradeId", 1112, "sign", 2, "glory", 26000, "officerProduct", 12, "needmater", list(10009), "neednum", list(223200), "time", 8000),
    1112, map("id", 1112, "name", "鲜花地", "upgradeId", 1113, "sign", 2, "glory", 28000, "officerProduct", 13, "needmater", list(10009), "neednum", list(241800), "time", 9000),
    1113, map("id", 1113, "name", "鲜花地", "upgradeId", 1114, "sign", 2, "glory", 30000, "officerProduct", 14, "needmater", list(10009), "neednum", list(260400), "time", 10000),
    1114, map("id", 1114, "name", "鲜花地", "upgradeId", 1115, "sign", 2, "glory", 32000, "officerProduct", 15, "needmater", list(10009), "neednum", list(279000), "time", 11000)
);
    }

    private static void init7() {
data.map(
    1115, map("id", 1115, "name", "鲜花地", "upgradeId", 1116, "sign", 2, "glory", 34000, "officerProduct", 16, "needmater", list(10009), "neednum", list(297600), "time", 12000),
    1116, map("id", 1116, "name", "鲜花地", "upgradeId", 1117, "sign", 2, "glory", 36000, "officerProduct", 17, "needmater", list(10009), "neednum", list(316200), "time", 13000),
    1117, map("id", 1117, "name", "鲜花地", "upgradeId", 1118, "sign", 2, "glory", 38000, "officerProduct", 18, "needmater", list(10009), "neednum", list(334800), "time", 14000),
    1118, map("id", 1118, "name", "鲜花地", "upgradeId", 1119, "sign", 2, "glory", 40000, "officerProduct", 19, "needmater", list(10009), "neednum", list(353400), "time", 15000),
    1119, map("id", 1119, "name", "鲜花地", "sign", 2, "officerProduct", 20, "needmater", list(10009), "neednum", list(372000), "time", 16000)
);
    }

    private static void init8() {
data.map(
    1200, map("id", 1200, "name", "许愿池", "upgradeId", 1201, "sign", 2, "glory", 4000, "officerProduct", 1, "needmater", list(10009), "neednum", list(2000), "time", 300, "outputtype", list(10000), "outputtime", 1800, "outputnum", list(600), "worktype", 1, "vowopenloc", 1, "locpeople", 1, "vowtype", list(10000), "vownum", list(1320), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.1f)),
    1201, map("id", 1201, "name", "许愿池", "upgradeId", 1202, "sign", 2, "glory", 6000, "officerProduct", 2, "needmater", list(10009), "neednum", list(3600), "time", 600, "outputtype", list(10000), "outputtime", 1800, "outputnum", list(660), "worktype", 1, "vowopenloc", 1, "locpeople", 2, "vowtype", list(10000), "vownum", list(1360), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.2f)),
    1202, map("id", 1202, "name", "许愿池", "upgradeId", 1203, "sign", 2, "glory", 8000, "officerProduct", 3, "needmater", list(10009), "neednum", list(9000), "time", 900, "outputtype", list(10000), "outputtime", 1800, "outputnum", list(720), "worktype", 1, "vowopenloc", 1, "locpeople", 3, "vowtype", list(10000), "vownum", list(1400), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.3f)),
    1203, map("id", 1203, "name", "许愿池", "upgradeId", 1204, "sign", 2, "glory", 10000, "officerProduct", 4, "needmater", list(10009), "neednum", list(16800), "time", 1500, "outputtype", list(10000), "outputtime", 1800, "outputnum", list(780), "worktype", 1, "vowopenloc", 1, "locpeople", 4, "vowtype", list(10000), "vownum", list(1440), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.4f)),
    1204, map("id", 1204, "name", "许愿池", "upgradeId", 1205, "sign", 2, "glory", 12000, "officerProduct", 5, "needmater", list(10009), "neednum", list(33000), "time", 2000, "outputtype", list(10000), "outputtime", 1800, "outputnum", list(840), "worktype", 1, "vowopenloc", 1, "locpeople", 4, "vowtype", list(10000), "vownum", list(1480), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f))
);
    }

    private static void init9() {
data.map(
    1205, map("id", 1205, "name", "许愿池", "upgradeId", 1206, "sign", 2, "glory", 14000, "officerProduct", 6, "needmater", list(10009), "neednum", list(54000), "time", 2500, "outputtype", list(10000), "outputtime", 1800, "outputnum", list(900), "worktype", 1, "vowopenloc", 1, "locpeople", 4, "vowtype", list(10000), "vownum", list(1520), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    1206, map("id", 1206, "name", "许愿池", "upgradeId", 1207, "sign", 2, "glory", 16000, "officerProduct", 7, "needmater", list(10009), "neednum", list(79800), "time", 3000, "outputtype", list(10000), "outputtime", 1800, "outputnum", list(960), "worktype", 1, "vowopenloc", 1, "locpeople", 4, "vowtype", list(10000), "vownum", list(1560), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    1207, map("id", 1207, "name", "许愿池", "upgradeId", 1208, "sign", 2, "glory", 18000, "officerProduct", 8, "needmater", list(10009), "neednum", list(120000), "time", 4000, "outputtype", list(10000), "outputtime", 1800, "outputnum", list(1020), "worktype", 1, "vowopenloc", 1, "locpeople", 4, "vowtype", list(10000), "vownum", list(1600), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    1208, map("id", 1208, "name", "许愿池", "upgradeId", 1209, "sign", 2, "glory", 20000, "officerProduct", 9, "needmater", list(10009), "neednum", list(167400), "time", 5000, "outputtype", list(10000), "outputtime", 1800, "outputnum", list(1080), "worktype", 1, "vowopenloc", 1, "locpeople", 4, "vowtype", list(10000), "vownum", list(1640), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    1209, map("id", 1209, "name", "许愿池", "upgradeId", 1210, "sign", 2, "glory", 22000, "officerProduct", 10, "needmater", list(10009), "neednum", list(186000), "time", 6000, "outputtype", list(10000), "outputtime", 1800, "outputnum", list(1140), "worktype", 1, "vowopenloc", 1, "locpeople", 4, "vowtype", list(10000), "vownum", list(1680), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f))
);
    }

    private static void init10() {
data.map(
    1210, map("id", 1210, "name", "许愿池", "upgradeId", 1211, "sign", 2, "glory", 24000, "officerProduct", 11, "needmater", list(10009), "neednum", list(204600), "time", 7000, "outputtype", list(10000), "outputtime", 1800, "outputnum", list(1200), "worktype", 1, "vowopenloc", 1, "locpeople", 4, "vowtype", list(10000), "vownum", list(1720), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    1211, map("id", 1211, "name", "许愿池", "upgradeId", 1212, "sign", 2, "glory", 26000, "officerProduct", 12, "needmater", list(10009), "neednum", list(223200), "time", 8000, "outputtype", list(10000), "outputtime", 1800, "outputnum", list(1260), "worktype", 1, "vowopenloc", 1, "locpeople", 4, "vowtype", list(10000), "vownum", list(1760), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    1212, map("id", 1212, "name", "许愿池", "upgradeId", 1213, "sign", 2, "glory", 28000, "officerProduct", 13, "needmater", list(10009), "neednum", list(241800), "time", 9000, "outputtype", list(10000), "outputtime", 1800, "outputnum", list(1320), "worktype", 1, "vowopenloc", 1, "locpeople", 4, "vowtype", list(10000), "vownum", list(1800), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    1213, map("id", 1213, "name", "许愿池", "upgradeId", 1214, "sign", 2, "glory", 30000, "officerProduct", 14, "needmater", list(10009), "neednum", list(260400), "time", 10000, "outputtype", list(10000), "outputtime", 1800, "outputnum", list(1380), "worktype", 1, "vowopenloc", 1, "locpeople", 4, "vowtype", list(10000), "vownum", list(1840), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    1214, map("id", 1214, "name", "许愿池", "upgradeId", 1215, "sign", 2, "glory", 32000, "officerProduct", 15, "needmater", list(10009), "neednum", list(279000), "time", 11000, "outputtype", list(10000), "outputtime", 1800, "outputnum", list(1440), "worktype", 1, "vowopenloc", 1, "locpeople", 4, "vowtype", list(10000), "vownum", list(1880), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f))
);
    }

    private static void init11() {
data.map(
    1215, map("id", 1215, "name", "许愿池", "upgradeId", 1216, "sign", 2, "glory", 34000, "officerProduct", 16, "needmater", list(10009), "neednum", list(297600), "time", 12000, "outputtype", list(10000), "outputtime", 1800, "outputnum", list(1500), "worktype", 1, "vowopenloc", 1, "locpeople", 4, "vowtype", list(10000), "vownum", list(1920), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    1216, map("id", 1216, "name", "许愿池", "upgradeId", 1217, "sign", 2, "glory", 36000, "officerProduct", 17, "needmater", list(10009), "neednum", list(316200), "time", 13000, "outputtype", list(10000), "outputtime", 1800, "outputnum", list(1560), "worktype", 1, "vowopenloc", 1, "locpeople", 4, "vowtype", list(10000), "vownum", list(1960), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    1217, map("id", 1217, "name", "许愿池", "upgradeId", 1218, "sign", 2, "glory", 38000, "officerProduct", 18, "needmater", list(10009), "neednum", list(334800), "time", 14000, "outputtype", list(10000), "outputtime", 1800, "outputnum", list(1620), "worktype", 1, "vowopenloc", 1, "locpeople", 4, "vowtype", list(10000), "vownum", list(2000), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    1218, map("id", 1218, "name", "许愿池", "upgradeId", 1219, "sign", 2, "glory", 40000, "officerProduct", 19, "needmater", list(10009), "neednum", list(353400), "time", 15000, "outputtype", list(10000), "outputtime", 1800, "outputnum", list(1680), "worktype", 1, "vowopenloc", 1, "locpeople", 4, "vowtype", list(10000), "vownum", list(2040), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    1219, map("id", 1219, "name", "许愿池", "sign", 2, "officerProduct", 20, "needmater", list(10009), "neednum", list(372000), "time", 16000, "outputtype", list(10000), "outputtime", 1800, "outputnum", list(1740), "worktype", 1, "vowopenloc", 1, "locpeople", 4, "vowtype", list(10000), "vownum", list(2080), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f))
);
    }

    private static void init12() {
data.map(
    1300, map("id", 1300, "name", "采石场", "upgradeId", 1301, "sign", 2, "glory", 4000, "officerProduct", 1, "needmater", list(10009), "neednum", list(2000), "time", 300, "outputtype", list(10010), "outputtime", 600, "outputnum", list(10), "worktype", 2, "vowopenloc", 1, "locpeople", 3),
    1301, map("id", 1301, "name", "采石场", "upgradeId", 1302, "sign", 2, "glory", 6000, "officerProduct", 2, "needmater", list(10009), "neednum", list(3600), "time", 600, "outputtype", list(10010), "outputtime", 600, "outputnum", list(10), "worktype", 2, "vowopenloc", 1, "locpeople", 3),
    1302, map("id", 1302, "name", "采石场", "upgradeId", 1303, "sign", 2, "glory", 8000, "officerProduct", 3, "needmater", list(10009), "neednum", list(9000), "time", 900, "outputtype", list(10010), "outputtime", 600, "outputnum", list(10), "worktype", 2, "vowopenloc", 1, "locpeople", 3),
    1303, map("id", 1303, "name", "采石场", "upgradeId", 1304, "sign", 2, "glory", 10000, "officerProduct", 4, "needmater", list(10009), "neednum", list(16800), "time", 1500, "outputtype", list(10010), "outputtime", 600, "outputnum", list(10), "worktype", 2, "vowopenloc", 1, "locpeople", 3),
    1304, map("id", 1304, "name", "采石场", "upgradeId", 1305, "sign", 2, "glory", 12000, "officerProduct", 5, "needmater", list(10009), "neednum", list(33000), "time", 2000, "outputtype", list(10010), "outputtime", 600, "outputnum", list(10), "worktype", 2, "vowopenloc", 1, "locpeople", 3)
);
    }

    private static void init13() {
data.map(
    1305, map("id", 1305, "name", "采石场", "upgradeId", 1306, "sign", 2, "glory", 14000, "officerProduct", 6, "needmater", list(10009), "neednum", list(54000), "time", 2500, "outputtype", list(10010), "outputtime", 600, "outputnum", list(10), "worktype", 2, "vowopenloc", 1, "locpeople", 3),
    1306, map("id", 1306, "name", "采石场", "upgradeId", 1307, "sign", 2, "glory", 16000, "officerProduct", 7, "needmater", list(10009), "neednum", list(79800), "time", 3000, "outputtype", list(10010), "outputtime", 600, "outputnum", list(10), "worktype", 2, "vowopenloc", 1, "locpeople", 3),
    1307, map("id", 1307, "name", "采石场", "upgradeId", 1308, "sign", 2, "glory", 18000, "officerProduct", 8, "needmater", list(10009), "neednum", list(120000), "time", 4000, "outputtype", list(10010), "outputtime", 600, "outputnum", list(10), "worktype", 2, "vowopenloc", 2, "locpeople", 3),
    1308, map("id", 1308, "name", "采石场", "upgradeId", 1309, "sign", 2, "glory", 20000, "officerProduct", 9, "needmater", list(10009), "neednum", list(167400), "time", 5000, "outputtype", list(10010), "outputtime", 600, "outputnum", list(10), "worktype", 2, "vowopenloc", 2, "locpeople", 3),
    1309, map("id", 1309, "name", "采石场", "upgradeId", 1310, "sign", 2, "glory", 22000, "officerProduct", 10, "needmater", list(10009), "neednum", list(186000), "time", 6000, "outputtype", list(10010), "outputtime", 600, "outputnum", list(10), "worktype", 2, "vowopenloc", 2, "locpeople", 3)
);
    }

    private static void init14() {
data.map(
    1310, map("id", 1310, "name", "采石场", "upgradeId", 1311, "sign", 2, "glory", 24000, "officerProduct", 11, "needmater", list(10009), "neednum", list(204600), "time", 7000, "outputtype", list(10010), "outputtime", 600, "outputnum", list(10), "worktype", 2, "vowopenloc", 2, "locpeople", 3),
    1311, map("id", 1311, "name", "采石场", "upgradeId", 1312, "sign", 2, "glory", 26000, "officerProduct", 12, "needmater", list(10009), "neednum", list(223200), "time", 8000, "outputtype", list(10010), "outputtime", 600, "outputnum", list(10), "worktype", 2, "vowopenloc", 2, "locpeople", 3),
    1312, map("id", 1312, "name", "采石场", "upgradeId", 1313, "sign", 2, "glory", 28000, "officerProduct", 13, "needmater", list(10009), "neednum", list(241800), "time", 9000, "outputtype", list(10010), "outputtime", 600, "outputnum", list(10), "worktype", 2, "vowopenloc", 2, "locpeople", 3),
    1313, map("id", 1313, "name", "采石场", "upgradeId", 1314, "sign", 2, "glory", 30000, "officerProduct", 14, "needmater", list(10009), "neednum", list(260400), "time", 10000, "outputtype", list(10010), "outputtime", 600, "outputnum", list(10), "worktype", 2, "vowopenloc", 2, "locpeople", 3),
    1314, map("id", 1314, "name", "采石场", "upgradeId", 1315, "sign", 2, "glory", 32000, "officerProduct", 15, "needmater", list(10009), "neednum", list(279000), "time", 11000, "outputtype", list(10010), "outputtime", 600, "outputnum", list(10), "worktype", 2, "vowopenloc", 2, "locpeople", 3)
);
    }

    private static void init15() {
data.map(
    1315, map("id", 1315, "name", "采石场", "upgradeId", 1316, "sign", 2, "glory", 34000, "officerProduct", 16, "needmater", list(10009), "neednum", list(297600), "time", 12000, "outputtype", list(10010), "outputtime", 600, "outputnum", list(10), "worktype", 2, "vowopenloc", 3, "locpeople", 3),
    1316, map("id", 1316, "name", "采石场", "upgradeId", 1317, "sign", 2, "glory", 36000, "officerProduct", 17, "needmater", list(10009), "neednum", list(316200), "time", 13000, "outputtype", list(10010), "outputtime", 600, "outputnum", list(10), "worktype", 2, "vowopenloc", 3, "locpeople", 3),
    1317, map("id", 1317, "name", "采石场", "upgradeId", 1318, "sign", 2, "glory", 38000, "officerProduct", 18, "needmater", list(10009), "neednum", list(334800), "time", 14000, "outputtype", list(10010), "outputtime", 600, "outputnum", list(10), "worktype", 2, "vowopenloc", 2, "locpeople", 3),
    1318, map("id", 1318, "name", "采石场", "upgradeId", 1319, "sign", 2, "glory", 40000, "officerProduct", 19, "needmater", list(10009), "neednum", list(353400), "time", 15000, "outputtype", list(10010), "outputtime", 600, "outputnum", list(10), "worktype", 2, "vowopenloc", 3, "locpeople", 3),
    1319, map("id", 1319, "name", "采石场", "sign", 2, "officerProduct", 20, "needmater", list(10009), "neednum", list(372000), "time", 16000, "outputtype", list(10010), "outputtime", 600, "outputnum", list(10), "worktype", 2, "vowopenloc", 3, "locpeople", 3)
);
    }

    private static void init16() {
data.map(
    1400, map("id", 1400, "name", "伐木场", "upgradeId", 1401, "sign", 2, "glory", 4000, "officerProduct", 1, "needmater", list(10009), "neednum", list(2000), "time", 300, "outputtype", list(10009), "outputtime", 600, "outputnum", list(10), "worktype", 5, "vowopenloc", 1, "locpeople", 3),
    1401, map("id", 1401, "name", "伐木场", "upgradeId", 1402, "sign", 2, "glory", 6000, "officerProduct", 2, "needmater", list(10009), "neednum", list(3600), "time", 600, "outputtype", list(10009), "outputtime", 600, "outputnum", list(10), "worktype", 5, "vowopenloc", 1, "locpeople", 3),
    1402, map("id", 1402, "name", "伐木场", "upgradeId", 1403, "sign", 2, "glory", 8000, "officerProduct", 3, "needmater", list(10009), "neednum", list(9000), "time", 900, "outputtype", list(10009), "outputtime", 600, "outputnum", list(10), "worktype", 5, "vowopenloc", 2, "locpeople", 3),
    1403, map("id", 1403, "name", "伐木场", "upgradeId", 1404, "sign", 2, "glory", 10000, "officerProduct", 4, "needmater", list(10009), "neednum", list(16800), "time", 1500, "outputtype", list(10009), "outputtime", 600, "outputnum", list(10), "worktype", 5, "vowopenloc", 3, "locpeople", 3),
    1404, map("id", 1404, "name", "伐木场", "upgradeId", 1405, "sign", 2, "glory", 12000, "officerProduct", 5, "needmater", list(10009), "neednum", list(33000), "time", 2000, "outputtype", list(10009), "outputtime", 600, "outputnum", list(10), "worktype", 5, "vowopenloc", 3, "locpeople", 3)
);
    }

    private static void init17() {
data.map(
    1405, map("id", 1405, "name", "伐木场", "upgradeId", 1406, "sign", 2, "glory", 14000, "officerProduct", 6, "needmater", list(10009), "neednum", list(54000), "time", 2500, "outputtype", list(10009), "outputtime", 600, "outputnum", list(10), "worktype", 5, "vowopenloc", 1, "locpeople", 3),
    1406, map("id", 1406, "name", "伐木场", "upgradeId", 1407, "sign", 2, "glory", 16000, "officerProduct", 7, "needmater", list(10009), "neednum", list(79800), "time", 3000, "outputtype", list(10009), "outputtime", 600, "outputnum", list(10), "worktype", 5, "vowopenloc", 1, "locpeople", 3),
    1407, map("id", 1407, "name", "伐木场", "upgradeId", 1408, "sign", 2, "glory", 18000, "officerProduct", 8, "needmater", list(10009), "neednum", list(120000), "time", 4000, "outputtype", list(10009), "outputtime", 600, "outputnum", list(10), "worktype", 5, "vowopenloc", 2, "locpeople", 3),
    1408, map("id", 1408, "name", "伐木场", "upgradeId", 1409, "sign", 2, "glory", 20000, "officerProduct", 9, "needmater", list(10009), "neednum", list(167400), "time", 5000, "outputtype", list(10009), "outputtime", 600, "outputnum", list(10), "worktype", 5, "vowopenloc", 3, "locpeople", 3),
    1409, map("id", 1409, "name", "伐木场", "upgradeId", 1410, "sign", 2, "glory", 22000, "officerProduct", 10, "needmater", list(10009), "neednum", list(186000), "time", 6000, "outputtype", list(10009), "outputtime", 600, "outputnum", list(10), "worktype", 5, "vowopenloc", 3, "locpeople", 3)
);
    }

    private static void init18() {
data.map(
    1410, map("id", 1410, "name", "伐木场", "upgradeId", 1411, "sign", 2, "glory", 24000, "officerProduct", 11, "needmater", list(10009), "neednum", list(204600), "time", 7000, "outputtype", list(10009), "outputtime", 600, "outputnum", list(10), "worktype", 5, "vowopenloc", 1, "locpeople", 3),
    1411, map("id", 1411, "name", "伐木场", "upgradeId", 1412, "sign", 2, "glory", 26000, "officerProduct", 12, "needmater", list(10009), "neednum", list(223200), "time", 8000, "outputtype", list(10009), "outputtime", 600, "outputnum", list(10), "worktype", 5, "vowopenloc", 1, "locpeople", 3),
    1412, map("id", 1412, "name", "伐木场", "upgradeId", 1413, "sign", 2, "glory", 28000, "officerProduct", 13, "needmater", list(10009), "neednum", list(241800), "time", 9000, "outputtype", list(10009), "outputtime", 600, "outputnum", list(10), "worktype", 5, "vowopenloc", 2, "locpeople", 3),
    1413, map("id", 1413, "name", "伐木场", "upgradeId", 1414, "sign", 2, "glory", 30000, "officerProduct", 14, "needmater", list(10009), "neednum", list(260400), "time", 10000, "outputtype", list(10009), "outputtime", 600, "outputnum", list(10), "worktype", 5, "vowopenloc", 3, "locpeople", 3),
    1414, map("id", 1414, "name", "伐木场", "upgradeId", 1415, "sign", 2, "glory", 32000, "officerProduct", 15, "needmater", list(10009), "neednum", list(279000), "time", 11000, "outputtype", list(10009), "outputtime", 600, "outputnum", list(10), "worktype", 5, "vowopenloc", 3, "locpeople", 3)
);
    }

    private static void init19() {
data.map(
    1415, map("id", 1415, "name", "伐木场", "upgradeId", 1416, "sign", 2, "glory", 34000, "officerProduct", 16, "needmater", list(10009), "neednum", list(297600), "time", 12000, "outputtype", list(10009), "outputtime", 600, "outputnum", list(10), "worktype", 5, "vowopenloc", 1, "locpeople", 3),
    1416, map("id", 1416, "name", "伐木场", "upgradeId", 1417, "sign", 2, "glory", 36000, "officerProduct", 17, "needmater", list(10009), "neednum", list(316200), "time", 13000, "outputtype", list(10009), "outputtime", 600, "outputnum", list(10), "worktype", 5, "vowopenloc", 1, "locpeople", 3),
    1417, map("id", 1417, "name", "伐木场", "upgradeId", 1418, "sign", 2, "glory", 38000, "officerProduct", 18, "needmater", list(10009), "neednum", list(334800), "time", 14000, "outputtype", list(10009), "outputtime", 600, "outputnum", list(10), "worktype", 5, "vowopenloc", 2, "locpeople", 3),
    1418, map("id", 1418, "name", "伐木场", "upgradeId", 1419, "sign", 2, "glory", 40000, "officerProduct", 19, "needmater", list(10009), "neednum", list(353400), "time", 15000, "outputtype", list(10009), "outputtime", 600, "outputnum", list(10), "worktype", 5, "vowopenloc", 3, "locpeople", 3),
    1419, map("id", 1419, "name", "伐木场", "sign", 2, "officerProduct", 20, "needmater", list(10009), "neednum", list(372000), "time", 16000, "outputtype", list(10009), "outputtime", 600, "outputnum", list(10), "worktype", 5, "vowopenloc", 3, "locpeople", 3)
);
    }

}