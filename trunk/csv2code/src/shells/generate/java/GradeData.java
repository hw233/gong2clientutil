package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 官品定义表.csv
 * 官品编号 = id
 * 官品名称 = name
 * 男的 = maleName
 * 女的 = femaleName
 * 官品人数限制 = numpeople
 * 考核方式 = examination
 * 战斗怪物组 = fight
 * 播放剧情ID = tale
 * 每次入围人数 = numup
 * 每次降品人数 = numdown
 * 报名时间类型 = timetype
 * 报名日期 = timedate
 * 报名时间点 = timepoint
 * 报名持续时间 = timelast
 * 报名玩家等级条件 = lvrestrict
 * 家园繁荣度条件 = boomrestrict
 * 派系影响力条件 = forcerestrict
 * 官品权利 = droit
 * 官品特赐掉落库 = droplargess
 * 所属官场 = officialdom
 * 家园产出加成 = homeeffect
 * 剧情对话ID = talkId
 */
public class GradeData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        init1();
        init2();
        init3();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    1, map("id", 1, "name", "初窥门径", "maleName", "新秀", "femaleName", "新秀", "examination", 1, "fight", 401, "tale", 1, "numup", 0, "numdown", 0, "timetype", 1, "lvrestrict", 12, "boomrestrict", 0, "droplargess", list(78), "homeeffect", 0.05f, "talkId", 1),
    2, map("id", 2, "name", "粗通皮毛", "maleName", "侠者", "femaleName", "侠女", "examination", 1, "fight", 402, "tale", 1, "numup", 0, "numdown", 0, "timetype", 1, "lvrestrict", 14, "boomrestrict", 200, "droit", list(8), "droplargess", list(79), "homeeffect", 0.08f, "talkId", 1),
    3, map("id", 3, "name", "略有小成", "maleName", "忠勇大侠", "femaleName", "忠勇大侠", "examination", 1, "fight", 403, "tale", 1, "numup", 0, "numdown", 0, "timetype", 1, "lvrestrict", 16, "boomrestrict", 300, "droit", list(8), "droplargess", list(80), "homeeffect", 0.11f, "talkId", 1),
    4, map("id", 4, "name", "登堂入室", "maleName", "任勇豪侠", "femaleName", "任勇豪侠", "examination", 1, "fight", 404, "tale", 1, "numup", 0, "numdown", 0, "timetype", 1, "lvrestrict", 18, "boomrestrict", 400, "droit", list(8, 9), "droplargess", list(81), "homeeffect", 0.14f, "talkId", 1),
    5, map("id", 5, "name", "崭露头角", "maleName", "宣度大侠", "femaleName", "宣度大侠", "examination", 1, "fight", 405, "tale", 1, "numup", 0, "numdown", 0, "timetype", 1, "lvrestrict", 20, "boomrestrict", 500, "droit", list(8, 9), "droplargess", list(82), "homeeffect", 0.17f, "talkId", 1)
);
    }

    private static void init1() {
data.map(
    6, map("id", 6, "name", "鹤立鸡群", "maleName", "宣节豪侠", "femaleName", "宣节豪侠", "examination", 1, "fight", 406, "tale", 1, "numup", 0, "numdown", 0, "timetype", 1, "lvrestrict", 22, "boomrestrict", 600, "droit", list(8, 9), "droplargess", list(83), "officialdom", 1, "homeeffect", 0.2f, "talkId", 1),
    7, map("id", 7, "name", "心领神会", "maleName", "翊麾大侠", "femaleName", "翊麾大侠", "numpeople", 2000, "examination", 2, "tale", 1, "numup", 200, "numdown", 200, "timetype", 2, "timepoint", "9:00,10:00,12:00,14:00,18:00,19:00,21:00", "timelast", 10, "lvrestrict", 24, "boomrestrict", 700, "droit", list(8, 9, 5), "droplargess", list(84), "officialdom", 2, "homeeffect", 0.23f, "talkId", 1),
    8, map("id", 8, "name", "出类拔萃", "maleName", "翊站豪侠", "femaleName", "翊站豪侠", "numpeople", 1500, "examination", 2, "tale", 1, "numup", 150, "numdown", 150, "timetype", 2, "timepoint", "9:30,10:30,12:30,18:30,19:30,21:30", "timelast", 10, "lvrestrict", 26, "boomrestrict", 800, "droit", list(8, 9, 5, 4), "droplargess", list(85), "officialdom", 3, "homeeffect", 0.26f, "talkId", 1),
    9, map("id", 9, "name", "炉火纯青", "maleName", "昭武大侠", "femaleName", "昭武大侠", "numpeople", 1000, "examination", 2, "tale", 1, "numup", 100, "numdown", 100, "timetype", 2, "timepoint", "10:00,13:00,14:00,19:00,20:00,22:00", "timelast", 10, "lvrestrict", 28, "boomrestrict", 1000, "droit", list(8, 9, 5, 6, 4), "droplargess", list(86), "officialdom", 4, "homeeffect", 0.29f, "talkId", 1),
    10, map("id", 10, "name", "已有大成", "maleName", "绝武豪侠", "femaleName", "绝武豪侠", "numpeople", 800, "examination", 2, "tale", 1, "numup", 80, "numdown", 80, "timetype", 2, "timepoint", "10:30,12:00,13:45,19:45,22:15", "timelast", 10, "lvrestrict", 30, "boomrestrict", 1500, "droit", list(8, 9, 5, 6, 4), "droplargess", list(87), "officialdom", 5, "homeeffect", 0.32f, "talkId", 1)
);
    }

    private static void init2() {
data.map(
    11, map("id", 11, "name", "技冠群雄", "maleName", "宁远大侠", "femaleName", "宁远大侠", "numpeople", 500, "examination", 2, "tale", 1, "numup", 50, "numdown", 50, "timetype", 2, "timepoint", "11:00,14:00,20:00,22:15", "timelast", 10, "lvrestrict", 32, "boomrestrict", 2000, "droit", list(8, 9, 5, 6, 7, 4), "droplargess", list(88), "officialdom", 6, "homeeffect", 0.35f, "talkId", 1),
    12, map("id", 12, "name", "神乎其技", "maleName", "定远豪侠", "femaleName", "定远豪侠", "numpeople", 400, "examination", 2, "tale", 1, "numup", 40, "numdown", 40, "timetype", 2, "timepoint", "11:30,14:30,20:30", "timelast", 10, "lvrestrict", 34, "boomrestrict", 2500, "droit", list(8, 9, 5, 6, 7, 4), "droplargess", list(89), "officialdom", 7, "homeeffect", 0.38f, "talkId", 1),
    13, map("id", 13, "name", "所向披靡", "maleName", "名威大侠", "femaleName", "名威大侠", "numpeople", 300, "examination", 2, "tale", 1, "numup", 30, "numdown", 30, "timetype", 2, "timepoint", "12:15,15:45,21:15", "timelast", 10, "lvrestrict", 36, "boomrestrict", 3000, "forcerestrict", 120000, "droit", list(8, 9, 5, 6, 7, 1, 4), "droplargess", list(90), "officialdom", 8, "homeeffect", 0.41f, "talkId", 1),
    14, map("id", 14, "name", "登峰造极", "maleName", "宣威豪侠", "femaleName", "宣威豪侠", "numpeople", 200, "examination", 2, "tale", 1, "numup", 20, "numdown", 20, "timetype", 2, "timepoint", "12:30,19:00", "timelast", 10, "lvrestrict", 38, "boomrestrict", 3500, "forcerestrict", 150000, "droit", list(8, 9, 5, 6, 7, 1, 4), "droplargess", list(91), "officialdom", 9, "homeeffect", 0.44f, "talkId", 1),
    15, map("id", 15, "name", "傲视群雄", "maleName", "云麾豪侠", "femaleName", "云麾豪侠", "numpeople", 100, "examination", 2, "tale", 1, "numup", 10, "numdown", 10, "timetype", 2, "timepoint", "11:00,15:00", "timelast", 10, "lvrestrict", 40, "boomrestrict", 4000, "forcerestrict", 180000, "droit", list(8, 9, 5, 6, 7, 1, 4), "droplargess", list(92), "officialdom", 10, "homeeffect", 0.47f, "talkId", 1)
);
    }

    private static void init3() {
data.map(
    16, map("id", 16, "name", "举世无双", "maleName", "环化侠公", "femaleName", "环化侠公", "numpeople", 60, "examination", 2, "tale", 1, "numup", 6, "numdown", 6, "timetype", 2, "timepoint", "10:00,12:00", "timelast", 10, "lvrestrict", 42, "boomrestrict", 4500, "forcerestrict", 210000, "droit", list(8, 9, 5, 6, 7, 1, 4), "droplargess", list(93), "officialdom", 11, "homeeffect", 0.5f, "talkId", 1),
    17, map("id", 17, "name", "一代宗师", "maleName", "镇国侠宗", "femaleName", "镇国侠宗", "numpeople", 20, "examination", 2, "tale", 1, "numup", 2, "numdown", 2, "timetype", 2, "timepoint", "9:00,13:00", "timelast", 10, "lvrestrict", 44, "boomrestrict", 5000, "forcerestrict", 240000, "droit", list(8, 9, 5, 6, 7, 1, 4, 3), "droplargess", list(94), "officialdom", 12, "homeeffect", 0.53f, "talkId", 1),
    18, map("id", 18, "name", "超凡入圣", "maleName", "辅国侠尊", "femaleName", "辅国侠尊", "numpeople", 5, "examination", 3, "tale", 1, "numup", 7, "numdown", 0, "timetype", 2, "timepoint", "18:00", "timelast", 10, "lvrestrict", 46, "boomrestrict", 5500, "forcerestrict", 270000, "droit", list(8, 9, 5, 6, 7, 1, 4, 3), "droplargess", list(95), "officialdom", 13, "homeeffect", 0.56f, "talkId", 1),
    19, map("id", 19, "name", "威震寰宇", "maleName", "顺天侠圣", "femaleName", "顺天侠圣", "numpeople", 1, "examination", 3, "tale", 1, "numup", 3, "numdown", 0, "timetype", 2, "timepoint", "20:00", "timelast", 10, "lvrestrict", 48, "boomrestrict", 6000, "forcerestrict", 300000, "droit", list(8, 9, 5, 6, 7, 1, 4, 3), "droplargess", list(96), "officialdom", 13, "homeeffect", 0.59f, "talkId", 1)
);
    }

}