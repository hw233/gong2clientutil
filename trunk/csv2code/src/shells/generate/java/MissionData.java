package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 任务表.csv
 * 编号 = id
 * 任务类型 = type
 * 版本号 = rewardVersion
 * 任务说明 = describe
 * 子顺序 = order
 * 男女主线区分 = difference
 * 主线章节区分 = chapter
 * 任务图标 = icon
 * 任务npc = tasknpc
 * 对应对话组 = plot_group
 * 开启等级 = openLv
 * 派系等级对
应任务等级 = openPaixiLevel
 * 拾取物品 = res
 * 显示开始时间 = beginTime
 * 显示结束时间 = endTime
 * 实际开始时间 = beginNotifyTime
 * 实际结束时间 = endNotifyTime
 * 自动接任务 = AutomatictaskOpen
 * 自动交任务 = AutomatictaskEnd
 * 剧情怪物组id = mosterid
 * 达成条件组 = targetIds
 * 掉落库的ID = dropID
 * 掉落次数 = dropNum
 * 任务领取前物品 = topAward
 * 任务领取前物品数量 = topNum
 * 称号ID = chenghao
 * 活跃度 = vitality
 * 对应引导 = guide
 * 成就点 = achievement
 */
public class MissionData extends LData {
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
        init20();
        init21();
        init22();
        init23();
        init24();
        init25();
        init26();
        init27();
        init28();
        init29();
        init30();
        init31();
        init32();
        init33();
        init34();
        init35();
        init36();
        init37();
        init38();
        init39();
        init40();
        init41();
        init42();
        init43();
        init44();
        init45();
        init46();
        init47();
        init48();
        init49();
        init50();
        init51();
        init52();
        init53();
        init54();
        init55();
        init56();
        init57();
        init58();
        init59();
        init60();
        init61();
        init62();
        init63();
        init64();
        init65();
        init66();
        init67();
        init68();
        init69();
        init70();
        init71();
        init72();
        init73();
        init74();
        init75();
        init76();
        init77();
        init78();
        init79();
        init80();
        init81();
        init82();
        init83();
        init84();
        init85();
        init86();
        init87();
        init88();
        init89();
        init90();
        init91();
        init92();
        init93();
        init94();
        init95();
        init96();
        init97();
        init98();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    10000, map("id", 10000, "type", 1, "order", 1, "icon", 12000, "openLv", 1, "targetIds", list(10000), "achievement", 10),
    10001, map("id", 10001, "type", 1, "order", 2, "icon", 12000, "openLv", 1, "targetIds", list(10001), "achievement", 10),
    10002, map("id", 10002, "type", 1, "order", 3, "icon", 12000, "openLv", 1, "targetIds", list(10002), "achievement", 10),
    10003, map("id", 10003, "type", 1, "order", 4, "icon", 12000, "openLv", 1, "targetIds", list(10003), "achievement", 10),
    10004, map("id", 10004, "type", 1, "order", 5, "icon", 12000, "openLv", 1, "targetIds", list(10004), "achievement", 10)
);
    }

    private static void init1() {
data.map(
    10005, map("id", 10005, "type", 1, "order", 6, "icon", 12000, "openLv", 1, "targetIds", list(10005), "achievement", 10),
    10006, map("id", 10006, "type", 1, "order", 7, "icon", 12000, "openLv", 1, "targetIds", list(10006), "achievement", 10),
    10007, map("id", 10007, "type", 1, "order", 8, "icon", 12000, "openLv", 1, "targetIds", list(10007), "achievement", 10),
    10008, map("id", 10008, "type", 1, "order", 9, "icon", 12000, "openLv", 1, "targetIds", list(10008), "achievement", 10),
    10009, map("id", 10009, "type", 1, "order", 10, "icon", 12000, "openLv", 1, "targetIds", list(10009), "achievement", 10)
);
    }

    private static void init2() {
data.map(
    10010, map("id", 10010, "type", 1, "order", 11, "icon", 12000, "openLv", 1, "targetIds", list(10010), "achievement", 10),
    10011, map("id", 10011, "type", 1, "order", 12, "icon", 12000, "openLv", 1, "targetIds", list(10011), "achievement", 10),
    10012, map("id", 10012, "type", 1, "order", 13, "icon", 12000, "openLv", 1, "targetIds", list(10012), "achievement", 10),
    10013, map("id", 10013, "type", 1, "order", 14, "icon", 12000, "openLv", 1, "targetIds", list(10013), "achievement", 10),
    10014, map("id", 10014, "type", 1, "order", 15, "icon", 12000, "openLv", 1, "targetIds", list(10014), "achievement", 10)
);
    }

    private static void init3() {
data.map(
    10015, map("id", 10015, "type", 1, "order", 16, "icon", 12000, "openLv", 1, "targetIds", list(10015), "achievement", 10),
    10016, map("id", 10016, "type", 1, "order", 17, "icon", 12000, "openLv", 1, "targetIds", list(10016), "achievement", 10),
    10017, map("id", 10017, "type", 1, "order", 18, "icon", 12000, "openLv", 1, "targetIds", list(10017), "achievement", 10),
    10018, map("id", 10018, "type", 1, "order", 19, "icon", 12000, "openLv", 1, "targetIds", list(10018), "achievement", 10),
    10019, map("id", 10019, "type", 1, "order", 20, "icon", 12000, "openLv", 1, "targetIds", list(10019), "achievement", 10)
);
    }

    private static void init4() {
data.map(
    10050, map("id", 10050, "type", 1, "order", 1, "icon", 987, "openLv", 1, "targetIds", list(10050), "achievement", 10),
    10051, map("id", 10051, "type", 1, "order", 2, "icon", 987, "openLv", 1, "targetIds", list(10051), "achievement", 10),
    10052, map("id", 10052, "type", 1, "order", 3, "icon", 987, "openLv", 1, "targetIds", list(10052), "achievement", 10),
    10053, map("id", 10053, "type", 1, "order", 4, "icon", 987, "openLv", 1, "targetIds", list(10053), "achievement", 10),
    10054, map("id", 10054, "type", 1, "order", 5, "icon", 987, "openLv", 1, "targetIds", list(10054), "achievement", 10)
);
    }

    private static void init5() {
data.map(
    10055, map("id", 10055, "type", 1, "order", 6, "icon", 987, "openLv", 1, "targetIds", list(10055), "achievement", 10),
    10056, map("id", 10056, "type", 1, "order", 7, "icon", 987, "openLv", 1, "targetIds", list(10056), "achievement", 10),
    10057, map("id", 10057, "type", 1, "order", 8, "icon", 987, "openLv", 1, "targetIds", list(10057), "achievement", 10),
    10058, map("id", 10058, "type", 1, "order", 9, "icon", 987, "openLv", 1, "targetIds", list(10058), "achievement", 10),
    10059, map("id", 10059, "type", 1, "order", 10, "icon", 987, "openLv", 1, "targetIds", list(10059), "achievement", 10)
);
    }

    private static void init6() {
data.map(
    10060, map("id", 10060, "type", 1, "order", 11, "icon", 987, "openLv", 1, "targetIds", list(10060), "achievement", 10),
    10061, map("id", 10061, "type", 1, "order", 12, "icon", 987, "openLv", 1, "targetIds", list(10061), "achievement", 10),
    10062, map("id", 10062, "type", 1, "order", 13, "icon", 987, "openLv", 1, "targetIds", list(10062), "achievement", 10),
    10063, map("id", 10063, "type", 1, "order", 14, "icon", 987, "openLv", 1, "targetIds", list(10063), "achievement", 10),
    10064, map("id", 10064, "type", 1, "order", 15, "icon", 987, "openLv", 1, "targetIds", list(10064), "achievement", 10)
);
    }

    private static void init7() {
data.map(
    10065, map("id", 10065, "type", 1, "order", 16, "icon", 987, "openLv", 1, "targetIds", list(10065), "achievement", 10),
    10066, map("id", 10066, "type", 1, "order", 17, "icon", 987, "openLv", 1, "targetIds", list(10066), "achievement", 10),
    10067, map("id", 10067, "type", 1, "order", 18, "icon", 987, "openLv", 1, "targetIds", list(10067), "achievement", 10),
    10068, map("id", 10068, "type", 1, "order", 19, "icon", 987, "openLv", 1, "targetIds", list(10068), "achievement", 10),
    10069, map("id", 10069, "type", 1, "order", 20, "icon", 987, "openLv", 1, "targetIds", list(10069), "achievement", 10)
);
    }

    private static void init8() {
data.map(
    10070, map("id", 10070, "type", 1, "order", 21, "icon", 987, "openLv", 1, "targetIds", list(10070), "achievement", 10),
    10071, map("id", 10071, "type", 1, "order", 22, "icon", 987, "openLv", 1, "targetIds", list(10071), "achievement", 10),
    10072, map("id", 10072, "type", 1, "order", 23, "icon", 987, "openLv", 1, "targetIds", list(10072), "achievement", 10),
    10073, map("id", 10073, "type", 1, "order", 24, "icon", 987, "openLv", 1, "targetIds", list(10073), "achievement", 10),
    10074, map("id", 10074, "type", 1, "order", 25, "icon", 987, "openLv", 1, "targetIds", list(10074), "achievement", 10)
);
    }

    private static void init9() {
data.map(
    10075, map("id", 10075, "type", 1, "order", 26, "icon", 987, "openLv", 1, "targetIds", list(10075), "achievement", 10),
    10076, map("id", 10076, "type", 1, "order", 27, "icon", 987, "openLv", 1, "targetIds", list(10076), "achievement", 10),
    10077, map("id", 10077, "type", 1, "order", 28, "icon", 987, "openLv", 1, "targetIds", list(10077), "achievement", 10),
    10078, map("id", 10078, "type", 1, "order", 29, "icon", 987, "openLv", 1, "targetIds", list(10078), "achievement", 10),
    10079, map("id", 10079, "type", 1, "order", 30, "icon", 987, "openLv", 1, "targetIds", list(10079), "achievement", 10)
);
    }

    private static void init10() {
data.map(
    10080, map("id", 10080, "type", 1, "order", 31, "icon", 987, "openLv", 1, "targetIds", list(10080), "achievement", 10),
    10100, map("id", 10100, "type", 1, "order", 1, "icon", 996, "openLv", 1, "targetIds", list(10100), "achievement", 10),
    10101, map("id", 10101, "type", 1, "order", 2, "icon", 996, "openLv", 1, "targetIds", list(10101), "achievement", 10),
    10102, map("id", 10102, "type", 1, "order", 3, "icon", 996, "openLv", 1, "targetIds", list(10102), "achievement", 10),
    10103, map("id", 10103, "type", 1, "order", 4, "icon", 996, "openLv", 1, "targetIds", list(10103), "achievement", 10)
);
    }

    private static void init11() {
data.map(
    10104, map("id", 10104, "type", 1, "order", 5, "icon", 996, "openLv", 1, "targetIds", list(10104), "achievement", 10),
    10105, map("id", 10105, "type", 1, "order", 6, "icon", 996, "openLv", 1, "targetIds", list(10105), "achievement", 10),
    10106, map("id", 10106, "type", 1, "order", 7, "icon", 996, "openLv", 1, "targetIds", list(10106), "achievement", 10),
    10107, map("id", 10107, "type", 1, "order", 8, "icon", 996, "openLv", 1, "targetIds", list(10107), "achievement", 10),
    10108, map("id", 10108, "type", 1, "order", 9, "icon", 996, "openLv", 1, "targetIds", list(10108), "achievement", 10)
);
    }

    private static void init12() {
data.map(
    10109, map("id", 10109, "type", 1, "order", 10, "icon", 996, "openLv", 1, "targetIds", list(10109), "achievement", 10),
    10110, map("id", 10110, "type", 1, "order", 11, "icon", 996, "openLv", 1, "targetIds", list(10110), "achievement", 10),
    10111, map("id", 10111, "type", 1, "order", 12, "icon", 996, "openLv", 1, "targetIds", list(10111), "achievement", 10),
    10112, map("id", 10112, "type", 1, "order", 13, "icon", 996, "openLv", 1, "targetIds", list(10112), "achievement", 10),
    10113, map("id", 10113, "type", 1, "order", 14, "icon", 996, "openLv", 1, "targetIds", list(10113), "achievement", 10)
);
    }

    private static void init13() {
data.map(
    10114, map("id", 10114, "type", 1, "order", 15, "icon", 996, "openLv", 1, "targetIds", list(10114), "achievement", 10),
    10115, map("id", 10115, "type", 1, "order", 16, "icon", 996, "openLv", 1, "targetIds", list(10115), "achievement", 10),
    10116, map("id", 10116, "type", 1, "order", 17, "icon", 996, "openLv", 1, "targetIds", list(10116), "achievement", 10),
    10117, map("id", 10117, "type", 1, "order", 18, "icon", 996, "openLv", 1, "targetIds", list(10117), "achievement", 10),
    10118, map("id", 10118, "type", 1, "order", 19, "icon", 996, "openLv", 1, "targetIds", list(10118), "achievement", 10)
);
    }

    private static void init14() {
data.map(
    10150, map("id", 10150, "type", 1, "order", 1, "icon", 985, "openLv", 1, "targetIds", list(10150), "achievement", 10),
    10151, map("id", 10151, "type", 1, "order", 2, "icon", 985, "openLv", 1, "targetIds", list(10151), "achievement", 10),
    10152, map("id", 10152, "type", 1, "order", 3, "icon", 985, "openLv", 1, "targetIds", list(10152), "achievement", 10),
    10153, map("id", 10153, "type", 1, "order", 4, "icon", 985, "openLv", 1, "targetIds", list(10153), "achievement", 10),
    10154, map("id", 10154, "type", 1, "order", 5, "icon", 985, "openLv", 1, "targetIds", list(10154), "achievement", 10)
);
    }

    private static void init15() {
data.map(
    10155, map("id", 10155, "type", 1, "order", 6, "icon", 985, "openLv", 1, "targetIds", list(10155), "achievement", 10),
    10156, map("id", 10156, "type", 1, "order", 7, "icon", 985, "openLv", 1, "targetIds", list(10156), "achievement", 10),
    10157, map("id", 10157, "type", 1, "order", 8, "icon", 985, "openLv", 1, "targetIds", list(10157), "achievement", 10),
    10158, map("id", 10158, "type", 1, "order", 9, "icon", 985, "openLv", 1, "targetIds", list(10158), "achievement", 10),
    10159, map("id", 10159, "type", 1, "order", 10, "icon", 985, "openLv", 1, "targetIds", list(10159), "achievement", 10)
);
    }

    private static void init16() {
data.map(
    10160, map("id", 10160, "type", 1, "order", 11, "icon", 985, "openLv", 1, "targetIds", list(10160), "achievement", 10),
    10161, map("id", 10161, "type", 1, "order", 12, "icon", 985, "openLv", 1, "targetIds", list(10161), "achievement", 10),
    10162, map("id", 10162, "type", 1, "order", 13, "icon", 985, "openLv", 1, "targetIds", list(10162), "achievement", 10),
    10163, map("id", 10163, "type", 1, "order", 14, "icon", 985, "openLv", 1, "targetIds", list(10163), "achievement", 10),
    10164, map("id", 10164, "type", 1, "order", 15, "icon", 985, "openLv", 1, "targetIds", list(10164), "achievement", 10)
);
    }

    private static void init17() {
data.map(
    10165, map("id", 10165, "type", 1, "order", 16, "icon", 985, "openLv", 1, "targetIds", list(10165), "achievement", 10),
    10166, map("id", 10166, "type", 1, "order", 17, "icon", 985, "openLv", 1, "targetIds", list(10166), "achievement", 10),
    10167, map("id", 10167, "type", 1, "order", 18, "icon", 985, "openLv", 1, "targetIds", list(10167), "achievement", 10),
    10168, map("id", 10168, "type", 1, "order", 19, "icon", 985, "openLv", 1, "targetIds", list(10168), "achievement", 10),
    10169, map("id", 10169, "type", 1, "order", 20, "icon", 985, "openLv", 1, "targetIds", list(10169), "achievement", 10)
);
    }

    private static void init18() {
data.map(
    10170, map("id", 10170, "type", 1, "order", 21, "icon", 985, "openLv", 1, "targetIds", list(10170), "achievement", 10),
    10171, map("id", 10171, "type", 1, "order", 22, "icon", 985, "openLv", 1, "targetIds", list(10171), "achievement", 10),
    10172, map("id", 10172, "type", 1, "order", 23, "icon", 985, "openLv", 1, "targetIds", list(10172), "achievement", 10),
    10173, map("id", 10173, "type", 1, "order", 24, "icon", 985, "openLv", 1, "targetIds", list(10173), "achievement", 10),
    10174, map("id", 10174, "type", 1, "order", 25, "icon", 985, "openLv", 1, "targetIds", list(10174), "achievement", 10)
);
    }

    private static void init19() {
data.map(
    10175, map("id", 10175, "type", 1, "order", 26, "icon", 985, "openLv", 1, "targetIds", list(10175), "achievement", 10),
    10176, map("id", 10176, "type", 1, "order", 27, "icon", 985, "openLv", 1, "targetIds", list(10176), "achievement", 10),
    10177, map("id", 10177, "type", 1, "order", 28, "icon", 985, "openLv", 1, "targetIds", list(10177), "achievement", 10),
    10178, map("id", 10178, "type", 1, "order", 29, "icon", 985, "openLv", 1, "targetIds", list(10178), "achievement", 10),
    10179, map("id", 10179, "type", 1, "order", 30, "icon", 985, "openLv", 1, "targetIds", list(10179), "achievement", 10)
);
    }

    private static void init20() {
data.map(
    10200, map("id", 10200, "type", 1, "order", 1, "icon", 996, "openLv", 1, "targetIds", list(10200), "achievement", 10),
    10201, map("id", 10201, "type", 1, "order", 2, "icon", 996, "openLv", 1, "targetIds", list(10201), "achievement", 10),
    10202, map("id", 10202, "type", 1, "order", 3, "icon", 996, "openLv", 1, "targetIds", list(10202), "achievement", 10),
    10203, map("id", 10203, "type", 1, "order", 4, "icon", 996, "openLv", 1, "targetIds", list(10203), "achievement", 10),
    10204, map("id", 10204, "type", 1, "order", 5, "icon", 996, "openLv", 1, "targetIds", list(10204), "achievement", 10)
);
    }

    private static void init21() {
data.map(
    10205, map("id", 10205, "type", 1, "order", 6, "icon", 996, "openLv", 1, "targetIds", list(10205), "achievement", 10),
    10206, map("id", 10206, "type", 1, "order", 7, "icon", 996, "openLv", 1, "targetIds", list(10206), "achievement", 10),
    10207, map("id", 10207, "type", 1, "order", 8, "icon", 996, "openLv", 1, "targetIds", list(10207), "achievement", 10),
    10208, map("id", 10208, "type", 1, "order", 9, "icon", 996, "openLv", 1, "targetIds", list(10208), "achievement", 10),
    10209, map("id", 10209, "type", 1, "order", 10, "icon", 996, "openLv", 1, "targetIds", list(10209), "achievement", 10)
);
    }

    private static void init22() {
data.map(
    10210, map("id", 10210, "type", 1, "order", 11, "icon", 996, "openLv", 1, "targetIds", list(10210), "achievement", 10),
    10211, map("id", 10211, "type", 1, "order", 12, "icon", 996, "openLv", 1, "targetIds", list(10211), "achievement", 10),
    10212, map("id", 10212, "type", 1, "order", 13, "icon", 996, "openLv", 1, "targetIds", list(10212), "achievement", 10),
    10213, map("id", 10213, "type", 1, "order", 14, "icon", 996, "openLv", 1, "targetIds", list(10213), "achievement", 10),
    10214, map("id", 10214, "type", 1, "order", 15, "icon", 996, "openLv", 1, "targetIds", list(10214), "achievement", 10)
);
    }

    private static void init23() {
data.map(
    10215, map("id", 10215, "type", 1, "order", 16, "icon", 996, "openLv", 1, "targetIds", list(10215), "achievement", 10),
    10216, map("id", 10216, "type", 1, "order", 17, "icon", 996, "openLv", 1, "targetIds", list(10216), "achievement", 10),
    10217, map("id", 10217, "type", 1, "order", 18, "icon", 996, "openLv", 1, "targetIds", list(10217), "achievement", 10),
    10218, map("id", 10218, "type", 1, "order", 19, "icon", 996, "openLv", 1, "targetIds", list(10218), "achievement", 10),
    10219, map("id", 10219, "type", 1, "order", 20, "icon", 996, "openLv", 1, "targetIds", list(10219), "achievement", 10)
);
    }

    private static void init24() {
data.map(
    10220, map("id", 10220, "type", 1, "order", 21, "icon", 996, "openLv", 1, "targetIds", list(10220), "achievement", 10),
    10221, map("id", 10221, "type", 1, "order", 22, "icon", 996, "openLv", 1, "targetIds", list(10221), "achievement", 10),
    10222, map("id", 10222, "type", 1, "order", 23, "icon", 996, "openLv", 1, "targetIds", list(10222), "achievement", 10),
    10223, map("id", 10223, "type", 1, "order", 24, "icon", 996, "openLv", 1, "targetIds", list(10223), "achievement", 10),
    10224, map("id", 10224, "type", 1, "order", 25, "icon", 996, "openLv", 1, "targetIds", list(10224), "achievement", 10)
);
    }

    private static void init25() {
data.map(
    10250, map("id", 10250, "type", 1, "order", 1, "icon", 984, "openLv", 1, "targetIds", list(10250), "achievement", 10),
    10251, map("id", 10251, "type", 1, "order", 2, "icon", 984, "openLv", 1, "targetIds", list(10251), "achievement", 10),
    10252, map("id", 10252, "type", 1, "order", 3, "icon", 984, "openLv", 1, "targetIds", list(10252), "achievement", 10),
    10253, map("id", 10253, "type", 1, "order", 4, "icon", 984, "openLv", 1, "targetIds", list(10253), "achievement", 10),
    10254, map("id", 10254, "type", 1, "order", 5, "icon", 984, "openLv", 1, "targetIds", list(10254), "achievement", 10)
);
    }

    private static void init26() {
data.map(
    10255, map("id", 10255, "type", 1, "order", 6, "icon", 984, "openLv", 1, "targetIds", list(10255), "achievement", 10),
    10256, map("id", 10256, "type", 1, "order", 7, "icon", 984, "openLv", 1, "targetIds", list(10256), "achievement", 10),
    10257, map("id", 10257, "type", 1, "order", 8, "icon", 984, "openLv", 1, "targetIds", list(10257), "achievement", 10),
    10258, map("id", 10258, "type", 1, "order", 9, "icon", 984, "openLv", 1, "targetIds", list(10258), "achievement", 10),
    10259, map("id", 10259, "type", 1, "order", 10, "icon", 984, "openLv", 1, "targetIds", list(10259), "achievement", 10)
);
    }

    private static void init27() {
data.map(
    10260, map("id", 10260, "type", 1, "order", 11, "icon", 984, "openLv", 1, "targetIds", list(10260), "achievement", 10),
    10261, map("id", 10261, "type", 1, "order", 12, "icon", 984, "openLv", 1, "targetIds", list(10261), "achievement", 10),
    10262, map("id", 10262, "type", 1, "order", 13, "icon", 984, "openLv", 1, "targetIds", list(10262), "achievement", 10),
    10263, map("id", 10263, "type", 1, "order", 14, "icon", 984, "openLv", 1, "targetIds", list(10263), "achievement", 10),
    10264, map("id", 10264, "type", 1, "order", 15, "icon", 984, "openLv", 1, "targetIds", list(10264), "achievement", 10)
);
    }

    private static void init28() {
data.map(
    10265, map("id", 10265, "type", 1, "order", 16, "icon", 984, "openLv", 1, "targetIds", list(10265), "achievement", 10),
    10266, map("id", 10266, "type", 1, "order", 17, "icon", 984, "openLv", 1, "targetIds", list(10266), "achievement", 10),
    10267, map("id", 10267, "type", 1, "order", 18, "icon", 984, "openLv", 1, "targetIds", list(10267), "achievement", 10),
    10268, map("id", 10268, "type", 1, "order", 19, "icon", 984, "openLv", 1, "targetIds", list(10268), "achievement", 10),
    10269, map("id", 10269, "type", 1, "order", 20, "icon", 984, "openLv", 1, "targetIds", list(10269), "achievement", 10)
);
    }

    private static void init29() {
data.map(
    10270, map("id", 10270, "type", 1, "order", 21, "icon", 984, "openLv", 1, "targetIds", list(10270), "achievement", 10),
    10271, map("id", 10271, "type", 1, "order", 22, "icon", 984, "openLv", 1, "targetIds", list(10271), "achievement", 10),
    10272, map("id", 10272, "type", 1, "order", 23, "icon", 984, "openLv", 1, "targetIds", list(10272), "achievement", 10),
    10273, map("id", 10273, "type", 1, "order", 24, "icon", 984, "openLv", 1, "targetIds", list(10273), "achievement", 10),
    10300, map("id", 10300, "type", 1, "order", 1, "icon", 987, "openLv", 1, "targetIds", list(10300), "achievement", 10)
);
    }

    private static void init30() {
data.map(
    10301, map("id", 10301, "type", 1, "order", 2, "icon", 987, "openLv", 1, "targetIds", list(10301), "achievement", 10),
    10302, map("id", 10302, "type", 1, "order", 3, "icon", 987, "openLv", 1, "targetIds", list(10302), "achievement", 10),
    10303, map("id", 10303, "type", 1, "order", 4, "icon", 987, "openLv", 1, "targetIds", list(10303), "achievement", 10),
    10304, map("id", 10304, "type", 1, "order", 5, "icon", 987, "openLv", 1, "targetIds", list(10304), "achievement", 10),
    10305, map("id", 10305, "type", 1, "order", 6, "icon", 987, "openLv", 1, "targetIds", list(10305), "achievement", 10)
);
    }

    private static void init31() {
data.map(
    10306, map("id", 10306, "type", 1, "order", 7, "icon", 987, "openLv", 1, "targetIds", list(10306), "achievement", 10),
    10307, map("id", 10307, "type", 1, "order", 8, "icon", 987, "openLv", 1, "targetIds", list(10307), "achievement", 10),
    10308, map("id", 10308, "type", 1, "order", 9, "icon", 987, "openLv", 1, "targetIds", list(10308), "achievement", 10),
    10309, map("id", 10309, "type", 1, "order", 10, "icon", 987, "openLv", 1, "targetIds", list(10309), "achievement", 10),
    10310, map("id", 10310, "type", 1, "order", 11, "icon", 987, "openLv", 1, "targetIds", list(10310), "achievement", 10)
);
    }

    private static void init32() {
data.map(
    10311, map("id", 10311, "type", 1, "order", 12, "icon", 987, "openLv", 1, "targetIds", list(10311), "achievement", 10),
    10312, map("id", 10312, "type", 1, "order", 13, "icon", 987, "openLv", 1, "targetIds", list(10312), "achievement", 10),
    10313, map("id", 10313, "type", 1, "order", 14, "icon", 987, "openLv", 1, "targetIds", list(10313), "achievement", 10),
    10314, map("id", 10314, "type", 1, "order", 15, "icon", 987, "openLv", 1, "targetIds", list(10314), "achievement", 10),
    10350, map("id", 10350, "type", 1, "order", 1, "icon", 991, "openLv", 1, "targetIds", list(10350), "achievement", 10)
);
    }

    private static void init33() {
data.map(
    10351, map("id", 10351, "type", 1, "order", 2, "icon", 991, "openLv", 1, "targetIds", list(10351), "achievement", 10),
    10352, map("id", 10352, "type", 1, "order", 3, "icon", 991, "openLv", 1, "targetIds", list(10352), "achievement", 10),
    10353, map("id", 10353, "type", 1, "order", 4, "icon", 991, "openLv", 1, "targetIds", list(10353), "achievement", 10),
    10354, map("id", 10354, "type", 1, "order", 5, "icon", 991, "openLv", 1, "targetIds", list(10354), "achievement", 10),
    10355, map("id", 10355, "type", 1, "order", 6, "icon", 991, "openLv", 1, "targetIds", list(10355), "achievement", 10)
);
    }

    private static void init34() {
data.map(
    10356, map("id", 10356, "type", 1, "order", 7, "icon", 991, "openLv", 1, "targetIds", list(10356), "achievement", 10),
    10357, map("id", 10357, "type", 1, "order", 8, "icon", 991, "openLv", 1, "targetIds", list(10357), "achievement", 10),
    10358, map("id", 10358, "type", 1, "order", 9, "icon", 991, "openLv", 1, "targetIds", list(10358), "achievement", 10),
    10359, map("id", 10359, "type", 1, "order", 10, "icon", 991, "openLv", 1, "targetIds", list(10359), "achievement", 10),
    10360, map("id", 10360, "type", 1, "order", 11, "icon", 991, "openLv", 1, "targetIds", list(10360), "achievement", 10)
);
    }

    private static void init35() {
data.map(
    10361, map("id", 10361, "type", 1, "order", 12, "icon", 991, "openLv", 1, "targetIds", list(10361), "achievement", 10),
    10362, map("id", 10362, "type", 1, "order", 13, "icon", 991, "openLv", 1, "targetIds", list(10362), "achievement", 10),
    10363, map("id", 10363, "type", 1, "order", 14, "icon", 991, "openLv", 1, "targetIds", list(10363), "achievement", 10),
    10364, map("id", 10364, "type", 1, "order", 15, "icon", 991, "openLv", 1, "targetIds", list(10364), "achievement", 10),
    10365, map("id", 10365, "type", 1, "order", 16, "icon", 991, "openLv", 1, "targetIds", list(10365), "achievement", 10)
);
    }

    private static void init36() {
data.map(
    10366, map("id", 10366, "type", 1, "order", 17, "icon", 991, "openLv", 1, "targetIds", list(10366), "achievement", 10),
    10367, map("id", 10367, "type", 1, "order", 18, "icon", 991, "openLv", 1, "targetIds", list(10367), "achievement", 10),
    10368, map("id", 10368, "type", 1, "order", 19, "icon", 991, "openLv", 1, "targetIds", list(10368), "achievement", 10),
    10369, map("id", 10369, "type", 1, "order", 20, "icon", 991, "openLv", 1, "targetIds", list(10369), "achievement", 10),
    10370, map("id", 10370, "type", 1, "order", 21, "icon", 991, "openLv", 1, "targetIds", list(10370), "achievement", 10)
);
    }

    private static void init37() {
data.map(
    10371, map("id", 10371, "type", 1, "order", 22, "icon", 991, "openLv", 1, "targetIds", list(10371), "achievement", 10),
    10372, map("id", 10372, "type", 1, "order", 23, "icon", 991, "openLv", 1, "targetIds", list(10372), "achievement", 10),
    10373, map("id", 10373, "type", 1, "order", 24, "icon", 991, "openLv", 1, "targetIds", list(10373), "achievement", 10),
    10374, map("id", 10374, "type", 1, "order", 25, "icon", 991, "openLv", 1, "targetIds", list(10374), "achievement", 10),
    10375, map("id", 10375, "type", 1, "order", 26, "icon", 991, "openLv", 1, "targetIds", list(10375), "achievement", 10)
);
    }

    private static void init38() {
data.map(
    10376, map("id", 10376, "type", 1, "order", 27, "icon", 991, "openLv", 1, "targetIds", list(10376), "achievement", 10),
    10377, map("id", 10377, "type", 1, "order", 28, "icon", 991, "openLv", 1, "targetIds", list(10377), "achievement", 10),
    10378, map("id", 10378, "type", 1, "order", 29, "icon", 991, "openLv", 1, "targetIds", list(10378), "achievement", 10),
    10379, map("id", 10379, "type", 1, "order", 30, "icon", 991, "openLv", 1, "targetIds", list(10379), "achievement", 10),
    10400, map("id", 10400, "type", 1, "order", 1, "icon", 987, "openLv", 1, "targetIds", list(10400), "achievement", 10)
);
    }

    private static void init39() {
data.map(
    10401, map("id", 10401, "type", 1, "order", 2, "icon", 987, "openLv", 1, "targetIds", list(10401), "achievement", 10),
    10402, map("id", 10402, "type", 1, "order", 3, "icon", 987, "openLv", 1, "targetIds", list(10402), "achievement", 10),
    10403, map("id", 10403, "type", 1, "order", 4, "icon", 987, "openLv", 1, "targetIds", list(10403), "achievement", 10),
    10404, map("id", 10404, "type", 1, "order", 5, "icon", 987, "openLv", 1, "targetIds", list(10404), "achievement", 10),
    10405, map("id", 10405, "type", 1, "order", 6, "icon", 987, "openLv", 1, "targetIds", list(10405), "achievement", 10)
);
    }

    private static void init40() {
data.map(
    10406, map("id", 10406, "type", 1, "order", 7, "icon", 987, "openLv", 1, "targetIds", list(10406), "achievement", 10),
    10407, map("id", 10407, "type", 1, "order", 8, "icon", 987, "openLv", 1, "targetIds", list(10407), "achievement", 10),
    10408, map("id", 10408, "type", 1, "order", 9, "icon", 987, "openLv", 1, "targetIds", list(10408), "achievement", 10),
    10409, map("id", 10409, "type", 1, "order", 10, "icon", 987, "openLv", 1, "targetIds", list(10409), "achievement", 10),
    10410, map("id", 10410, "type", 1, "order", 11, "icon", 987, "openLv", 1, "targetIds", list(10410), "achievement", 10)
);
    }

    private static void init41() {
data.map(
    10411, map("id", 10411, "type", 1, "order", 12, "icon", 987, "openLv", 1, "targetIds", list(10411), "achievement", 10),
    10412, map("id", 10412, "type", 1, "order", 13, "icon", 987, "openLv", 1, "targetIds", list(10412), "achievement", 10),
    10413, map("id", 10413, "type", 1, "order", 14, "icon", 987, "openLv", 1, "targetIds", list(10413), "achievement", 10),
    10414, map("id", 10414, "type", 1, "order", 15, "icon", 987, "openLv", 1, "targetIds", list(10414), "achievement", 10),
    10415, map("id", 10415, "type", 1, "order", 16, "icon", 987, "openLv", 1, "targetIds", list(10415), "achievement", 10)
);
    }

    private static void init42() {
data.map(
    10416, map("id", 10416, "type", 1, "order", 17, "icon", 987, "openLv", 1, "targetIds", list(10416), "achievement", 10),
    10417, map("id", 10417, "type", 1, "order", 18, "icon", 987, "openLv", 1, "targetIds", list(10417), "achievement", 10),
    10418, map("id", 10418, "type", 1, "order", 19, "icon", 987, "openLv", 1, "targetIds", list(10418), "achievement", 10),
    10419, map("id", 10419, "type", 1, "order", 20, "icon", 987, "openLv", 1, "targetIds", list(10419), "achievement", 10),
    10420, map("id", 10420, "type", 1, "order", 21, "icon", 987, "openLv", 1, "targetIds", list(10420), "achievement", 10)
);
    }

    private static void init43() {
data.map(
    10421, map("id", 10421, "type", 1, "order", 22, "icon", 987, "openLv", 1, "targetIds", list(10421), "achievement", 10),
    10422, map("id", 10422, "type", 1, "order", 23, "icon", 987, "openLv", 1, "targetIds", list(10422), "achievement", 10),
    10423, map("id", 10423, "type", 1, "order", 24, "icon", 987, "openLv", 1, "targetIds", list(10423), "achievement", 10),
    10424, map("id", 10424, "type", 1, "order", 25, "icon", 987, "openLv", 1, "targetIds", list(10424), "achievement", 10),
    10425, map("id", 10425, "type", 1, "order", 26, "icon", 987, "openLv", 1, "targetIds", list(10425), "achievement", 10)
);
    }

    private static void init44() {
data.map(
    10426, map("id", 10426, "type", 1, "order", 27, "icon", 987, "openLv", 1, "targetIds", list(10426), "achievement", 10),
    10427, map("id", 10427, "type", 1, "order", 28, "icon", 987, "openLv", 1, "targetIds", list(10427), "achievement", 10),
    10428, map("id", 10428, "type", 1, "order", 29, "icon", 987, "openLv", 1, "targetIds", list(10428), "achievement", 10),
    10429, map("id", 10429, "type", 1, "order", 30, "icon", 987, "openLv", 1, "targetIds", list(10429), "achievement", 10),
    10450, map("id", 10450, "type", 1, "order", 1, "icon", 12085, "openLv", 1, "targetIds", list(10450), "achievement", 10)
);
    }

    private static void init45() {
data.map(
    10451, map("id", 10451, "type", 1, "order", 2, "icon", 12085, "openLv", 1, "targetIds", list(10451), "achievement", 10),
    10452, map("id", 10452, "type", 1, "order", 3, "icon", 12085, "openLv", 1, "targetIds", list(10452), "achievement", 10),
    10453, map("id", 10453, "type", 1, "order", 4, "icon", 12085, "openLv", 1, "targetIds", list(10453), "achievement", 10),
    10454, map("id", 10454, "type", 1, "order", 5, "icon", 12085, "openLv", 1, "targetIds", list(10454), "achievement", 10),
    10455, map("id", 10455, "type", 1, "order", 6, "icon", 12085, "openLv", 1, "targetIds", list(10455), "achievement", 10)
);
    }

    private static void init46() {
data.map(
    10456, map("id", 10456, "type", 1, "order", 7, "icon", 12085, "openLv", 1, "targetIds", list(10456), "achievement", 10),
    10457, map("id", 10457, "type", 1, "order", 8, "icon", 12085, "openLv", 1, "targetIds", list(10457), "achievement", 10),
    10458, map("id", 10458, "type", 1, "order", 9, "icon", 12085, "openLv", 1, "targetIds", list(10458), "achievement", 10),
    10459, map("id", 10459, "type", 1, "order", 10, "icon", 12085, "openLv", 1, "targetIds", list(10459), "achievement", 10),
    10460, map("id", 10460, "type", 1, "order", 11, "icon", 12085, "openLv", 1, "targetIds", list(10460), "achievement", 10)
);
    }

    private static void init47() {
data.map(
    10461, map("id", 10461, "type", 1, "order", 12, "icon", 12085, "openLv", 1, "targetIds", list(10461), "achievement", 10),
    10462, map("id", 10462, "type", 1, "order", 13, "icon", 12085, "openLv", 1, "targetIds", list(10462), "achievement", 10),
    10463, map("id", 10463, "type", 1, "order", 14, "icon", 12085, "openLv", 1, "targetIds", list(10463), "achievement", 10),
    10464, map("id", 10464, "type", 1, "order", 15, "icon", 12085, "openLv", 1, "targetIds", list(10464), "achievement", 10),
    10465, map("id", 10465, "type", 1, "order", 16, "icon", 12085, "openLv", 1, "targetIds", list(10465), "achievement", 10)
);
    }

    private static void init48() {
data.map(
    10466, map("id", 10466, "type", 1, "order", 17, "icon", 12085, "openLv", 1, "targetIds", list(10466), "achievement", 10),
    10467, map("id", 10467, "type", 1, "order", 18, "icon", 12085, "openLv", 1, "targetIds", list(10467), "achievement", 10),
    10468, map("id", 10468, "type", 1, "order", 19, "icon", 12085, "openLv", 1, "targetIds", list(10468), "achievement", 10),
    10469, map("id", 10469, "type", 1, "order", 20, "icon", 12085, "openLv", 1, "targetIds", list(10469), "achievement", 10),
    10500, map("id", 10500, "type", 1, "order", 1, "icon", 12000, "openLv", 1, "targetIds", list(10500), "achievement", 10)
);
    }

    private static void init49() {
data.map(
    10501, map("id", 10501, "type", 1, "order", 2, "icon", 12000, "openLv", 1, "targetIds", list(10501), "achievement", 10),
    10502, map("id", 10502, "type", 1, "order", 3, "icon", 12000, "openLv", 1, "targetIds", list(10502), "achievement", 10),
    10503, map("id", 10503, "type", 1, "order", 4, "icon", 12000, "openLv", 1, "targetIds", list(10503), "achievement", 10),
    10504, map("id", 10504, "type", 1, "order", 5, "icon", 12000, "openLv", 1, "targetIds", list(10504), "achievement", 10),
    10505, map("id", 10505, "type", 1, "order", 6, "icon", 12000, "openLv", 1, "targetIds", list(10505), "achievement", 10)
);
    }

    private static void init50() {
data.map(
    10506, map("id", 10506, "type", 1, "order", 7, "icon", 12000, "openLv", 1, "targetIds", list(10506), "achievement", 10),
    10507, map("id", 10507, "type", 1, "order", 8, "icon", 12000, "openLv", 1, "targetIds", list(10507), "achievement", 10),
    10508, map("id", 10508, "type", 1, "order", 9, "icon", 12000, "openLv", 1, "targetIds", list(10508), "achievement", 10),
    10509, map("id", 10509, "type", 1, "order", 10, "icon", 12000, "openLv", 1, "targetIds", list(10509), "achievement", 10),
    10510, map("id", 10510, "type", 1, "order", 11, "icon", 12000, "openLv", 1, "targetIds", list(10510), "achievement", 10)
);
    }

    private static void init51() {
data.map(
    10511, map("id", 10511, "type", 1, "order", 12, "icon", 12000, "openLv", 1, "targetIds", list(10511), "achievement", 10),
    10550, map("id", 10550, "type", 1, "order", 1, "icon", 12000, "openLv", 1, "targetIds", list(10550), "achievement", 10),
    10551, map("id", 10551, "type", 1, "order", 2, "icon", 12000, "openLv", 1, "targetIds", list(10551), "achievement", 10),
    10552, map("id", 10552, "type", 1, "order", 3, "icon", 12000, "openLv", 1, "targetIds", list(10552), "achievement", 10),
    10553, map("id", 10553, "type", 1, "order", 4, "icon", 12000, "openLv", 1, "targetIds", list(10553), "achievement", 10)
);
    }

    private static void init52() {
data.map(
    10554, map("id", 10554, "type", 1, "order", 5, "icon", 12000, "openLv", 1, "targetIds", list(10554), "achievement", 10),
    10555, map("id", 10555, "type", 1, "order", 6, "icon", 12000, "openLv", 1, "targetIds", list(10555), "achievement", 10),
    10556, map("id", 10556, "type", 1, "order", 7, "icon", 12000, "openLv", 1, "targetIds", list(10556), "achievement", 10),
    10557, map("id", 10557, "type", 1, "order", 8, "icon", 12000, "openLv", 1, "targetIds", list(10557), "achievement", 10),
    10558, map("id", 10558, "type", 1, "order", 9, "icon", 12000, "openLv", 1, "targetIds", list(10558), "achievement", 10)
);
    }

    private static void init53() {
data.map(
    10559, map("id", 10559, "type", 1, "order", 10, "icon", 12000, "openLv", 1, "targetIds", list(10559), "achievement", 10),
    10560, map("id", 10560, "type", 1, "order", 11, "icon", 12000, "openLv", 1, "targetIds", list(10560), "achievement", 10),
    10561, map("id", 10561, "type", 1, "order", 12, "icon", 12000, "openLv", 1, "targetIds", list(10561), "achievement", 10),
    10600, map("id", 10600, "type", 1, "order", 1, "icon", 12001, "openLv", 1, "targetIds", list(10600), "achievement", 10),
    10601, map("id", 10601, "type", 1, "order", 2, "icon", 12001, "openLv", 1, "targetIds", list(10601), "achievement", 10)
);
    }

    private static void init54() {
data.map(
    10602, map("id", 10602, "type", 1, "order", 3, "icon", 12001, "openLv", 1, "targetIds", list(10602), "achievement", 10),
    10603, map("id", 10603, "type", 1, "order", 4, "icon", 12001, "openLv", 1, "targetIds", list(10603), "achievement", 10),
    10604, map("id", 10604, "type", 1, "order", 5, "icon", 12001, "openLv", 1, "targetIds", list(10604), "achievement", 10),
    10605, map("id", 10605, "type", 1, "order", 6, "icon", 12001, "openLv", 1, "targetIds", list(10605), "achievement", 10),
    10606, map("id", 10606, "type", 1, "order", 7, "icon", 12001, "openLv", 1, "targetIds", list(10606), "achievement", 10)
);
    }

    private static void init55() {
data.map(
    10607, map("id", 10607, "type", 1, "order", 8, "icon", 12001, "openLv", 1, "targetIds", list(10607), "achievement", 10),
    10608, map("id", 10608, "type", 1, "order", 9, "icon", 12001, "openLv", 1, "targetIds", list(10608), "achievement", 10),
    10609, map("id", 10609, "type", 1, "order", 10, "icon", 12001, "openLv", 1, "targetIds", list(10609), "achievement", 10),
    10610, map("id", 10610, "type", 1, "order", 11, "icon", 12001, "openLv", 1, "targetIds", list(10610), "achievement", 10),
    10611, map("id", 10611, "type", 1, "order", 12, "icon", 12001, "openLv", 1, "targetIds", list(10611), "achievement", 10)
);
    }

    private static void init56() {
data.map(
    10612, map("id", 10612, "type", 1, "order", 13, "icon", 12001, "openLv", 1, "targetIds", list(10612), "achievement", 10),
    10613, map("id", 10613, "type", 1, "order", 14, "icon", 12001, "openLv", 1, "targetIds", list(10613), "achievement", 10),
    10614, map("id", 10614, "type", 1, "order", 15, "icon", 12001, "openLv", 1, "targetIds", list(10614), "achievement", 10),
    10615, map("id", 10615, "type", 1, "order", 16, "icon", 12001, "openLv", 1, "targetIds", list(10615), "achievement", 10),
    10616, map("id", 10616, "type", 1, "order", 17, "icon", 12001, "openLv", 1, "targetIds", list(10616), "achievement", 10)
);
    }

    private static void init57() {
data.map(
    10617, map("id", 10617, "type", 1, "order", 18, "icon", 12001, "openLv", 1, "targetIds", list(10617), "achievement", 10),
    10618, map("id", 10618, "type", 1, "order", 19, "icon", 12001, "openLv", 1, "targetIds", list(10618), "achievement", 10),
    10619, map("id", 10619, "type", 1, "order", 20, "icon", 12001, "openLv", 1, "targetIds", list(10619), "achievement", 10),
    10620, map("id", 10620, "type", 1, "order", 21, "icon", 12001, "openLv", 1, "targetIds", list(10620), "achievement", 10),
    10621, map("id", 10621, "type", 1, "order", 22, "icon", 12001, "openLv", 1, "targetIds", list(10621), "achievement", 10)
);
    }

    private static void init58() {
data.map(
    10622, map("id", 10622, "type", 1, "order", 23, "icon", 12001, "openLv", 1, "targetIds", list(10622), "achievement", 10),
    10623, map("id", 10623, "type", 1, "order", 24, "icon", 12001, "openLv", 1, "targetIds", list(10623), "achievement", 10),
    10624, map("id", 10624, "type", 1, "order", 25, "icon", 12001, "openLv", 1, "targetIds", list(10624), "achievement", 10),
    10650, map("id", 10650, "type", 1, "order", 1, "icon", 990, "openLv", 1, "targetIds", list(10650), "achievement", 10),
    10651, map("id", 10651, "type", 1, "order", 2, "icon", 990, "openLv", 1, "targetIds", list(10651), "achievement", 10)
);
    }

    private static void init59() {
data.map(
    10652, map("id", 10652, "type", 1, "order", 3, "icon", 990, "openLv", 1, "targetIds", list(10652), "achievement", 10),
    10653, map("id", 10653, "type", 1, "order", 4, "icon", 990, "openLv", 1, "targetIds", list(10653), "achievement", 10),
    10654, map("id", 10654, "type", 1, "order", 5, "icon", 990, "openLv", 1, "targetIds", list(10654), "achievement", 10),
    10655, map("id", 10655, "type", 1, "order", 6, "icon", 990, "openLv", 1, "targetIds", list(10655), "achievement", 10),
    10656, map("id", 10656, "type", 1, "order", 7, "icon", 990, "openLv", 1, "targetIds", list(10656), "achievement", 10)
);
    }

    private static void init60() {
data.map(
    10657, map("id", 10657, "type", 1, "order", 8, "icon", 990, "openLv", 1, "targetIds", list(10657), "achievement", 10),
    10658, map("id", 10658, "type", 1, "order", 9, "icon", 990, "openLv", 1, "targetIds", list(10658), "achievement", 10),
    10659, map("id", 10659, "type", 1, "order", 10, "icon", 990, "openLv", 1, "targetIds", list(10659), "achievement", 10),
    10660, map("id", 10660, "type", 1, "order", 11, "icon", 990, "openLv", 1, "targetIds", list(10660), "achievement", 10),
    10661, map("id", 10661, "type", 1, "order", 12, "icon", 990, "openLv", 1, "targetIds", list(10661), "achievement", 10)
);
    }

    private static void init61() {
data.map(
    10662, map("id", 10662, "type", 1, "order", 13, "icon", 990, "openLv", 1, "targetIds", list(10662), "achievement", 10),
    10663, map("id", 10663, "type", 1, "order", 14, "icon", 990, "openLv", 1, "targetIds", list(10663), "achievement", 10),
    10664, map("id", 10664, "type", 1, "order", 15, "icon", 990, "openLv", 1, "targetIds", list(10664), "achievement", 10),
    10665, map("id", 10665, "type", 1, "order", 16, "icon", 990, "openLv", 1, "targetIds", list(10665), "achievement", 10),
    10666, map("id", 10666, "type", 1, "order", 17, "icon", 990, "openLv", 1, "targetIds", list(10666), "achievement", 10)
);
    }

    private static void init62() {
data.map(
    10667, map("id", 10667, "type", 1, "order", 18, "icon", 990, "openLv", 1, "targetIds", list(10667), "achievement", 10),
    10668, map("id", 10668, "type", 1, "order", 19, "icon", 990, "openLv", 1, "targetIds", list(10668), "achievement", 10),
    10669, map("id", 10669, "type", 1, "order", 20, "icon", 990, "openLv", 1, "targetIds", list(10669), "achievement", 10),
    10670, map("id", 10670, "type", 1, "order", 21, "icon", 990, "openLv", 1, "targetIds", list(10670), "achievement", 10),
    10671, map("id", 10671, "type", 1, "order", 22, "icon", 990, "openLv", 1, "targetIds", list(10671), "achievement", 10)
);
    }

    private static void init63() {
data.map(
    10672, map("id", 10672, "type", 1, "order", 23, "icon", 990, "openLv", 1, "targetIds", list(10672), "achievement", 10),
    10673, map("id", 10673, "type", 1, "order", 24, "icon", 990, "openLv", 1, "targetIds", list(10673), "achievement", 10),
    10674, map("id", 10674, "type", 1, "order", 25, "icon", 990, "openLv", 1, "targetIds", list(10674), "achievement", 10),
    10675, map("id", 10675, "type", 1, "order", 26, "icon", 990, "openLv", 1, "targetIds", list(10675), "achievement", 10),
    10676, map("id", 10676, "type", 1, "order", 27, "icon", 990, "openLv", 1, "targetIds", list(10676), "achievement", 10)
);
    }

    private static void init64() {
data.map(
    10677, map("id", 10677, "type", 1, "order", 28, "icon", 990, "openLv", 1, "targetIds", list(10677), "achievement", 10),
    10678, map("id", 10678, "type", 1, "order", 29, "icon", 990, "openLv", 1, "targetIds", list(10678), "achievement", 10),
    20000, map("id", 20000, "type", 2, "order", 1, "icon", 12000, "openLv", 1, "targetIds", list(20000), "dropID", list(842), "dropNum", list(1), "vitality", 10),
    20001, map("id", 20001, "type", 2, "order", 1, "icon", 12001, "openLv", 1, "targetIds", list(20001), "dropID", list(843), "dropNum", list(1), "vitality", 10),
    20002, map("id", 20002, "type", 2, "order", 1, "icon", 100, "openLv", 1, "targetIds", list(20002), "dropID", list(844), "dropNum", list(1), "vitality", 10)
);
    }

    private static void init65() {
data.map(
    20003, map("id", 20003, "type", 2, "order", 1, "icon", 984, "openLv", 1, "targetIds", list(20003), "dropID", list(845), "dropNum", list(1), "vitality", 10),
    20004, map("id", 20004, "type", 2, "order", 1, "icon", 200, "openLv", 1, "targetIds", list(20004), "dropID", list(846), "dropNum", list(1), "vitality", 10),
    20005, map("id", 20005, "type", 2, "order", 1, "icon", 992, "openLv", 1, "targetIds", list(20005), "dropID", list(847), "dropNum", list(1), "vitality", 10),
    20006, map("id", 20006, "type", 2, "order", 1, "icon", 991, "openLv", 1, "targetIds", list(20006), "dropID", list(848), "dropNum", list(1), "vitality", 10),
    20007, map("id", 20007, "type", 2, "order", 1, "icon", 987, "openLv", 1, "targetIds", list(20007), "dropID", list(849), "dropNum", list(1), "vitality", 10)
);
    }

    private static void init66() {
data.map(
    20008, map("id", 20008, "type", 2, "order", 1, "icon", 996, "openLv", 1, "targetIds", list(20008), "dropID", list(850), "dropNum", list(1), "vitality", 10),
    20009, map("id", 20009, "type", 2, "order", 1, "icon", 987, "openLv", 1, "targetIds", list(20009), "dropID", list(851), "dropNum", list(1), "vitality", 10),
    20011, map("id", 20011, "type", 2, "order", 1, "icon", 991, "openLv", 1, "targetIds", list(20011), "dropID", list(852), "dropNum", list(1), "vitality", 10),
    20012, map("id", 20012, "type", 2, "order", 1, "icon", 26001, "openLv", 1, "targetIds", list(20012), "dropID", list(853), "dropNum", list(1), "vitality", 10),
    20013, map("id", 20013, "type", 2, "order", 1, "icon", 990, "openLv", 1, "targetIds", list(20013), "dropID", list(854), "dropNum", list(1), "vitality", 10)
);
    }

    private static void init67() {
data.map(
    20014, map("id", 20014, "type", 2, "order", 1, "icon", 986, "openLv", 1, "targetIds", list(20014), "dropID", list(855), "dropNum", list(1), "vitality", 10),
    20015, map("id", 20015, "type", 2, "order", 1, "icon", 11123, "openLv", 1, "targetIds", list(20015), "dropID", list(856), "dropNum", list(1), "vitality", 10),
    20016, map("id", 20016, "type", 2, "order", 1, "icon", 31026, "openLv", 1, "targetIds", list(20016), "dropID", list(857), "dropNum", list(1), "vitality", 10),
    20017, map("id", 20017, "type", 2, "order", 1, "icon", 26003, "openLv", 1, "targetIds", list(20017), "dropID", list(858), "dropNum", list(1), "vitality", 10),
    20018, map("id", 20018, "type", 2, "order", 1, "icon", 12000, "openLv", 1, "targetIds", list(20018), "dropID", list(859), "dropNum", list(1), "vitality", 10)
);
    }

    private static void init68() {
data.map(
    35000, map("id", 35000, "type", 3, "order", 1, "difference", 2, "chapter", 1, "tasknpc", 10000, "plot_group", 4, "openLv", 1, "AutomatictaskOpen", 2, "AutomatictaskEnd", 1, "targetIds", list(35000), "dropID", list(98), "dropNum", list(1)),
    35001, map("id", 35001, "type", 3, "order", 2, "difference", 2, "chapter", 1, "tasknpc", 10008, "plot_group", 5, "openLv", 1, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(35001), "dropID", list(98), "dropNum", list(1)),
    35002, map("id", 35002, "type", 3, "order", 3, "difference", 2, "chapter", 1, "tasknpc", 10000, "plot_group", 6, "openLv", 1, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(35002), "dropID", list(98), "dropNum", list(1)),
    35003, map("id", 35003, "type", 3, "order", 4, "difference", 2, "chapter", 1, "tasknpc", 10005, "plot_group", 7, "openLv", 1, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "mosterid", 4001, "targetIds", list(35003), "dropID", list(98), "dropNum", list(1)),
    35004, map("id", 35004, "type", 3, "order", 5, "difference", 2, "chapter", 1, "tasknpc", 10001, "plot_group", 8, "openLv", 1, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(35004), "dropID", list(98), "dropNum", list(1))
);
    }

    private static void init69() {
data.map(
    35005, map("id", 35005, "type", 3, "order", 6, "difference", 2, "chapter", 1, "tasknpc", 10003, "plot_group", 9, "openLv", 1, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "mosterid", 4002, "targetIds", list(35005), "dropID", list(98), "dropNum", list(1), "guide", 10004),
    35006, map("id", 35006, "type", 3, "order", 7, "difference", 2, "chapter", 1, "tasknpc", 10001, "plot_group", 10, "openLv", 1, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(35006), "dropID", list(98), "dropNum", list(1)),
    35007, map("id", 35007, "type", 3, "order", 8, "difference", 2, "chapter", 1, "tasknpc", 10011, "plot_group", 11, "openLv", 1, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "mosterid", 4003, "targetIds", list(35007), "dropID", list(98), "dropNum", list(1)),
    35008, map("id", 35008, "type", 3, "order", 9, "difference", 2, "chapter", 1, "tasknpc", 10010, "plot_group", 12, "openLv", 1, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(35008), "dropID", list(98), "dropNum", list(1)),
    35009, map("id", 35009, "type", 3, "order", 10, "difference", 2, "chapter", 1, "tasknpc", 10007, "plot_group", 13, "openLv", 1, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(35009), "dropID", list(98), "dropNum", list(1))
);
    }

    private static void init70() {
data.map(
    35010, map("id", 35010, "type", 3, "order", 11, "difference", 2, "chapter", 1, "tasknpc", 10006, "plot_group", 14, "openLv", 1, "res", 26171, "AutomatictaskOpen", 1, "AutomatictaskEnd", 2, "targetIds", list(35010), "dropID", list(98, 800), "dropNum", list(1, 1), "guide", 10028),
    35011, map("id", 35011, "type", 3, "order", 12, "difference", 2, "chapter", 2, "tasknpc", 35011, "plot_group", 17, "openLv", 5, "AutomatictaskOpen", 2, "AutomatictaskEnd", 1, "targetIds", list(35011), "dropID", list(100), "dropNum", list(1)),
    35012, map("id", 35012, "type", 3, "order", 13, "difference", 2, "chapter", 2, "tasknpc", 35012, "plot_group", 18, "openLv", 5, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "mosterid", 4004, "targetIds", list(35012), "dropID", list(100), "dropNum", list(1)),
    35013, map("id", 35013, "type", 3, "order", 14, "difference", 2, "chapter", 2, "tasknpc", 35013, "plot_group", 19, "openLv", 5, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "mosterid", 4005, "targetIds", list(35013), "dropID", list(100), "dropNum", list(1)),
    35014, map("id", 35014, "type", 3, "order", 15, "difference", 2, "chapter", 2, "tasknpc", 35014, "plot_group", 20, "openLv", 5, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(35014), "dropID", list(100), "dropNum", list(1))
);
    }

    private static void init71() {
data.map(
    35015, map("id", 35015, "type", 3, "order", 16, "difference", 2, "chapter", 2, "tasknpc", 35014, "plot_group", 21, "openLv", 5, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(35015), "dropID", list(100), "dropNum", list(1)),
    35016, map("id", 35016, "type", 3, "order", 17, "difference", 2, "chapter", 2, "tasknpc", 35014, "plot_group", 22, "openLv", 5, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(35016), "dropID", list(100), "dropNum", list(1)),
    35017, map("id", 35017, "type", 3, "order", 18, "difference", 2, "chapter", 2, "tasknpc", 35017, "plot_group", 23, "openLv", 5, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(35017), "dropID", list(100), "dropNum", list(1)),
    35018, map("id", 35018, "type", 3, "order", 19, "difference", 2, "chapter", 2, "tasknpc", 35018, "plot_group", 24, "openLv", 5, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(35018), "dropID", list(100), "dropNum", list(1)),
    35019, map("id", 35019, "type", 3, "order", 20, "difference", 2, "chapter", 2, "tasknpc", 35019, "plot_group", 25, "openLv", 5, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(35019), "dropID", list(100), "dropNum", list(1))
);
    }

    private static void init72() {
data.map(
    35020, map("id", 35020, "type", 3, "order", 21, "difference", 2, "chapter", 2, "tasknpc", 35020, "plot_group", 26, "openLv", 5, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "mosterid", 4006, "targetIds", list(35020), "dropID", list(100), "dropNum", list(1)),
    35021, map("id", 35021, "type", 3, "order", 22, "difference", 2, "chapter", 2, "tasknpc", 35021, "plot_group", 27, "openLv", 5, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(35021), "dropID", list(100), "dropNum", list(1)),
    35022, map("id", 35022, "type", 3, "order", 23, "difference", 2, "chapter", 2, "tasknpc", 35021, "plot_group", 28, "openLv", 5, "AutomatictaskOpen", 1, "AutomatictaskEnd", 2, "targetIds", list(35022), "dropID", list(100, 801), "dropNum", list(1, 1)),
    35023, map("id", 35023, "type", 3, "order", 24, "difference", 2, "chapter", 3, "tasknpc", 35023, "plot_group", 29, "openLv", 11, "AutomatictaskOpen", 2, "AutomatictaskEnd", 1, "targetIds", list(35023), "dropID", list(99), "dropNum", list(1)),
    35024, map("id", 35024, "type", 3, "order", 25, "difference", 2, "chapter", 3, "tasknpc", 35024, "plot_group", 30, "openLv", 11, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(35024), "dropID", list(99), "dropNum", list(1))
);
    }

    private static void init73() {
data.map(
    35025, map("id", 35025, "type", 3, "order", 26, "difference", 2, "chapter", 3, "tasknpc", 35025, "plot_group", 31, "openLv", 11, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(35025), "dropID", list(99), "dropNum", list(1)),
    35026, map("id", 35026, "type", 3, "order", 27, "difference", 2, "chapter", 3, "tasknpc", 35026, "plot_group", 32, "openLv", 11, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(35026), "dropID", list(99), "dropNum", list(1)),
    35027, map("id", 35027, "type", 3, "order", 28, "difference", 2, "chapter", 3, "tasknpc", 35027, "plot_group", 33, "openLv", 11, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(35027), "dropID", list(99), "dropNum", list(1)),
    35028, map("id", 35028, "type", 3, "order", 29, "difference", 2, "chapter", 3, "tasknpc", 35028, "plot_group", 34, "openLv", 11, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(35028), "dropID", list(99), "dropNum", list(1)),
    35029, map("id", 35029, "type", 3, "order", 30, "difference", 2, "chapter", 3, "tasknpc", 35029, "plot_group", 35, "openLv", 11, "AutomatictaskOpen", 1, "AutomatictaskEnd", 2, "targetIds", list(35029), "dropID", list(99, 802), "dropNum", list(1, 1))
);
    }

    private static void init74() {
data.map(
    35030, map("id", 35030, "type", 3, "order", 31, "difference", 2, "chapter", 4, "tasknpc", 35030, "plot_group", 36, "openLv", 22, "AutomatictaskOpen", 2, "AutomatictaskEnd", 1, "targetIds", list(35030), "dropID", list(100), "dropNum", list(1)),
    35031, map("id", 35031, "type", 3, "order", 32, "difference", 2, "chapter", 4, "tasknpc", 35031, "plot_group", 37, "openLv", 22, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "mosterid", 4010, "targetIds", list(35031), "dropID", list(100), "dropNum", list(1)),
    35032, map("id", 35032, "type", 3, "order", 33, "difference", 2, "chapter", 4, "tasknpc", 35032, "plot_group", 38, "openLv", 22, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(35032), "dropID", list(100), "dropNum", list(1)),
    35033, map("id", 35033, "type", 3, "order", 34, "difference", 2, "chapter", 4, "tasknpc", 35033, "plot_group", 39, "openLv", 22, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "mosterid", 4011, "targetIds", list(35033), "dropID", list(100), "dropNum", list(1)),
    35034, map("id", 35034, "type", 3, "order", 35, "difference", 2, "chapter", 4, "tasknpc", 35034, "plot_group", 40, "openLv", 22, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "mosterid", 4012, "targetIds", list(35034), "dropID", list(100), "dropNum", list(1))
);
    }

    private static void init75() {
data.map(
    35035, map("id", 35035, "type", 3, "order", 36, "difference", 2, "chapter", 4, "tasknpc", 35035, "plot_group", 41, "openLv", 22, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(35035), "dropID", list(100), "dropNum", list(1)),
    35036, map("id", 35036, "type", 3, "order", 37, "difference", 2, "chapter", 4, "tasknpc", 35036, "plot_group", 42, "openLv", 22, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(35036), "dropID", list(100), "dropNum", list(1)),
    35037, map("id", 35037, "type", 3, "order", 38, "difference", 2, "chapter", 4, "tasknpc", 35037, "plot_group", 43, "openLv", 22, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(35037), "dropID", list(100), "dropNum", list(1)),
    35038, map("id", 35038, "type", 3, "order", 39, "difference", 2, "chapter", 4, "tasknpc", 35038, "plot_group", 44, "openLv", 22, "AutomatictaskOpen", 1, "AutomatictaskEnd", 2, "targetIds", list(35038), "dropID", list(100, 830), "dropNum", list(1, 1)),
    35039, map("id", 35039, "type", 3, "order", 40, "difference", 2, "chapter", 5, "tasknpc", 35039, "plot_group", 45, "openLv", 25, "AutomatictaskOpen", 2, "AutomatictaskEnd", 1, "targetIds", list(35039), "dropID", list(100), "dropNum", list(1))
);
    }

    private static void init76() {
data.map(
    35040, map("id", 35040, "type", 3, "order", 41, "difference", 2, "chapter", 5, "tasknpc", 35040, "plot_group", 46, "openLv", 25, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "mosterid", 4014, "targetIds", list(35040), "dropID", list(100), "dropNum", list(1)),
    35041, map("id", 35041, "type", 3, "order", 42, "difference", 2, "chapter", 5, "tasknpc", 35041, "plot_group", 47, "openLv", 25, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(35041), "dropID", list(100), "dropNum", list(1)),
    35042, map("id", 35042, "type", 3, "order", 43, "difference", 2, "chapter", 5, "tasknpc", 35042, "plot_group", 48, "openLv", 25, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "mosterid", 4015, "targetIds", list(35042), "dropID", list(100), "dropNum", list(1)),
    35043, map("id", 35043, "type", 3, "order", 44, "difference", 2, "chapter", 5, "tasknpc", 35043, "plot_group", 49, "openLv", 25, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(35043), "dropID", list(100), "dropNum", list(1)),
    35044, map("id", 35044, "type", 3, "order", 45, "difference", 2, "chapter", 5, "tasknpc", 35044, "plot_group", 50, "openLv", 25, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(35044), "dropID", list(100), "dropNum", list(1))
);
    }

    private static void init77() {
data.map(
    35045, map("id", 35045, "type", 3, "order", 46, "difference", 2, "chapter", 5, "tasknpc", 35045, "plot_group", 51, "openLv", 25, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(35045), "dropID", list(100), "dropNum", list(1)),
    35046, map("id", 35046, "type", 3, "order", 47, "difference", 2, "chapter", 5, "tasknpc", 35046, "plot_group", 52, "openLv", 25, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(35046), "dropID", list(100), "dropNum", list(1)),
    35047, map("id", 35047, "type", 3, "order", 48, "difference", 2, "chapter", 5, "tasknpc", 35047, "plot_group", 53, "openLv", 25, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(35047), "dropID", list(100), "dropNum", list(1)),
    35048, map("id", 35048, "type", 3, "order", 49, "difference", 2, "chapter", 5, "tasknpc", 35048, "plot_group", 54, "openLv", 25, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(35048), "dropID", list(100), "dropNum", list(1)),
    35049, map("id", 35049, "type", 3, "order", 50, "difference", 2, "chapter", 5, "tasknpc", 35049, "plot_group", 55, "openLv", 25, "AutomatictaskOpen", 1, "AutomatictaskEnd", 2, "targetIds", list(35049), "dropID", list(100, 831), "dropNum", list(1, 1))
);
    }

    private static void init78() {
data.map(
    35050, map("id", 35050, "type", 3, "order", 51, "difference", 2, "chapter", 6, "tasknpc", 35050, "plot_group", 56, "openLv", 30, "AutomatictaskOpen", 2, "AutomatictaskEnd", 1, "targetIds", list(35050), "dropID", list(100), "dropNum", list(1)),
    35051, map("id", 35051, "type", 3, "order", 52, "difference", 2, "chapter", 6, "tasknpc", 35051, "plot_group", 57, "openLv", 30, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "mosterid", 4019, "targetIds", list(35051), "dropID", list(100), "dropNum", list(1)),
    35052, map("id", 35052, "type", 3, "order", 53, "difference", 2, "chapter", 6, "tasknpc", 35052, "plot_group", 58, "openLv", 30, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(35052), "dropID", list(100), "dropNum", list(1)),
    35053, map("id", 35053, "type", 3, "order", 54, "difference", 2, "chapter", 6, "tasknpc", 35053, "plot_group", 59, "openLv", 30, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(35053), "dropID", list(100), "dropNum", list(1)),
    35054, map("id", 35054, "type", 3, "order", 55, "difference", 2, "chapter", 6, "tasknpc", 35054, "plot_group", 60, "openLv", 30, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(35054), "dropID", list(100), "dropNum", list(1))
);
    }

    private static void init79() {
data.map(
    35055, map("id", 35055, "type", 3, "order", 56, "difference", 2, "chapter", 6, "tasknpc", 35055, "plot_group", 61, "openLv", 30, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(35055), "dropID", list(100), "dropNum", list(1)),
    35056, map("id", 35056, "type", 3, "order", 57, "difference", 2, "chapter", 6, "tasknpc", 35056, "plot_group", 62, "openLv", 30, "AutomatictaskOpen", 1, "AutomatictaskEnd", 2, "targetIds", list(35056), "dropID", list(100, 832), "dropNum", list(1, 1)),
    37000, map("id", 37000, "type", 3, "order", 1, "difference", 1, "chapter", 1, "tasknpc", 37000, "plot_group", 2, "openLv", 1, "AutomatictaskOpen", 2, "AutomatictaskEnd", 1, "targetIds", list(37000), "dropID", list(100), "dropNum", list(1)),
    37001, map("id", 37001, "type", 3, "order", 2, "difference", 1, "chapter", 1, "tasknpc", 37001, "plot_group", 3, "openLv", 1, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(37001), "dropID", list(100), "dropNum", list(1)),
    37002, map("id", 37002, "type", 3, "order", 3, "difference", 1, "chapter", 1, "tasknpc", 37002, "plot_group", 4, "openLv", 1, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "mosterid", 4021, "targetIds", list(37002), "dropID", list(100), "dropNum", list(1), "guide", 10005)
);
    }

    private static void init80() {
data.map(
    37003, map("id", 37003, "type", 3, "order", 4, "difference", 1, "chapter", 1, "tasknpc", 37003, "plot_group", 5, "openLv", 1, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(37003), "dropID", list(100), "dropNum", list(1)),
    37004, map("id", 37004, "type", 3, "order", 5, "difference", 1, "chapter", 1, "tasknpc", 37004, "plot_group", 6, "openLv", 1, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(37004), "dropID", list(100), "dropNum", list(1)),
    37005, map("id", 37005, "type", 3, "order", 6, "difference", 1, "chapter", 1, "tasknpc", 37005, "plot_group", 7, "openLv", 1, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "mosterid", 4022, "targetIds", list(37005), "dropID", list(100), "dropNum", list(1), "guide", 10004),
    37006, map("id", 37006, "type", 3, "order", 7, "difference", 1, "chapter", 1, "tasknpc", 37006, "plot_group", 8, "openLv", 1, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "mosterid", 4023, "targetIds", list(37006), "dropID", list(100), "dropNum", list(1)),
    37007, map("id", 37007, "type", 3, "order", 8, "difference", 1, "chapter", 1, "tasknpc", 37007, "plot_group", 9, "openLv", 1, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(37007), "dropID", list(100), "dropNum", list(1))
);
    }

    private static void init81() {
data.map(
    37008, map("id", 37008, "type", 3, "order", 9, "difference", 1, "chapter", 1, "tasknpc", 37008, "plot_group", 11, "openLv", 1, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(37008), "dropID", list(100), "dropNum", list(1)),
    37009, map("id", 37009, "type", 3, "order", 10, "difference", 1, "chapter", 1, "tasknpc", 37009, "plot_group", 12, "openLv", 1, "AutomatictaskOpen", 1, "AutomatictaskEnd", 2, "targetIds", list(37009), "dropID", list(100), "dropNum", list(1), "guide", 10028),
    37010, map("id", 37010, "type", 3, "order", 11, "difference", 1, "chapter", 2, "tasknpc", 37010, "plot_group", 13, "openLv", 5, "AutomatictaskOpen", 2, "AutomatictaskEnd", 1, "targetIds", list(37010), "dropID", list(100), "dropNum", list(1)),
    37011, map("id", 37011, "type", 3, "order", 12, "difference", 1, "chapter", 2, "tasknpc", 37011, "plot_group", 14, "openLv", 5, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "mosterid", 4024, "targetIds", list(37011), "dropID", list(100), "dropNum", list(1)),
    37012, map("id", 37012, "type", 3, "order", 13, "difference", 1, "chapter", 2, "tasknpc", 37012, "plot_group", 15, "openLv", 5, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "mosterid", 4024, "targetIds", list(37012), "dropID", list(100), "dropNum", list(1))
);
    }

    private static void init82() {
data.map(
    37013, map("id", 37013, "type", 3, "order", 14, "difference", 1, "chapter", 2, "tasknpc", 37013, "plot_group", 16, "openLv", 5, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(37013), "dropID", list(100), "dropNum", list(1)),
    37014, map("id", 37014, "type", 3, "order", 15, "difference", 1, "chapter", 2, "tasknpc", 37014, "plot_group", 17, "openLv", 5, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(37014), "dropID", list(100), "dropNum", list(1)),
    37015, map("id", 37015, "type", 3, "order", 16, "difference", 1, "chapter", 2, "tasknpc", 37015, "plot_group", 18, "openLv", 5, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(37015), "dropID", list(100), "dropNum", list(1)),
    37016, map("id", 37016, "type", 3, "order", 17, "difference", 1, "chapter", 2, "tasknpc", 37016, "plot_group", 19, "openLv", 5, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "mosterid", 4025, "targetIds", list(37016), "dropID", list(100), "dropNum", list(1)),
    37017, map("id", 37017, "type", 3, "order", 18, "difference", 1, "chapter", 2, "tasknpc", 37017, "plot_group", 20, "openLv", 5, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(37017), "dropID", list(100), "dropNum", list(1))
);
    }

    private static void init83() {
data.map(
    37018, map("id", 37018, "type", 3, "order", 19, "difference", 1, "chapter", 2, "tasknpc", 37018, "plot_group", 21, "openLv", 5, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(37018), "dropID", list(100), "dropNum", list(1)),
    37019, map("id", 37019, "type", 3, "order", 20, "difference", 1, "chapter", 2, "tasknpc", 37019, "plot_group", 22, "openLv", 5, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "mosterid", 4026, "targetIds", list(37019), "dropID", list(100), "dropNum", list(1)),
    37020, map("id", 37020, "type", 3, "order", 21, "difference", 1, "chapter", 2, "tasknpc", 37020, "plot_group", 23, "openLv", 5, "AutomatictaskOpen", 1, "AutomatictaskEnd", 2, "targetIds", list(37020), "dropID", list(100), "dropNum", list(1)),
    37021, map("id", 37021, "type", 3, "order", 22, "difference", 1, "chapter", 3, "tasknpc", 37021, "plot_group", 24, "openLv", 11, "AutomatictaskOpen", 2, "AutomatictaskEnd", 1, "targetIds", list(37021), "dropID", list(100), "dropNum", list(1)),
    37022, map("id", 37022, "type", 3, "order", 23, "difference", 1, "chapter", 3, "tasknpc", 37022, "plot_group", 25, "openLv", 11, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(37022), "dropID", list(100), "dropNum", list(1))
);
    }

    private static void init84() {
data.map(
    37023, map("id", 37023, "type", 3, "order", 24, "difference", 1, "chapter", 3, "tasknpc", 37023, "plot_group", 26, "openLv", 11, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "mosterid", 4027, "targetIds", list(37023), "dropID", list(100), "dropNum", list(1)),
    37024, map("id", 37024, "type", 3, "order", 25, "difference", 1, "chapter", 3, "tasknpc", 37024, "plot_group", 27, "openLv", 11, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(37024), "dropID", list(100), "dropNum", list(1)),
    37025, map("id", 37025, "type", 3, "order", 26, "difference", 1, "chapter", 3, "tasknpc", 37025, "plot_group", 28, "openLv", 11, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(37025), "dropID", list(100), "dropNum", list(1)),
    37026, map("id", 37026, "type", 3, "order", 27, "difference", 1, "chapter", 3, "tasknpc", 37026, "plot_group", 29, "openLv", 11, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "mosterid", 4028, "targetIds", list(37026), "dropID", list(100), "dropNum", list(1)),
    37027, map("id", 37027, "type", 3, "order", 28, "difference", 1, "chapter", 3, "tasknpc", 37027, "plot_group", 30, "openLv", 11, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(37027), "dropID", list(100), "dropNum", list(1))
);
    }

    private static void init85() {
data.map(
    37028, map("id", 37028, "type", 3, "order", 29, "difference", 1, "chapter", 3, "tasknpc", 37028, "plot_group", 31, "openLv", 11, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(37028), "dropID", list(100), "dropNum", list(1)),
    37029, map("id", 37029, "type", 3, "order", 30, "difference", 1, "chapter", 3, "tasknpc", 37029, "plot_group", 32, "openLv", 11, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "mosterid", 4029, "targetIds", list(37029), "dropID", list(100), "dropNum", list(1)),
    37030, map("id", 37030, "type", 3, "order", 31, "difference", 1, "chapter", 3, "tasknpc", 37030, "plot_group", 33, "openLv", 11, "AutomatictaskOpen", 1, "AutomatictaskEnd", 2, "targetIds", list(37030), "dropID", list(100, 802), "dropNum", list(1, 1)),
    37031, map("id", 37031, "type", 3, "order", 32, "difference", 1, "chapter", 4, "tasknpc", 37031, "plot_group", 34, "openLv", 22, "AutomatictaskOpen", 2, "AutomatictaskEnd", 1, "targetIds", list(37031), "dropID", list(100), "dropNum", list(1)),
    37032, map("id", 37032, "type", 3, "order", 33, "difference", 1, "chapter", 4, "tasknpc", 37032, "plot_group", 35, "openLv", 22, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(37032), "dropID", list(100), "dropNum", list(1))
);
    }

    private static void init86() {
data.map(
    37033, map("id", 37033, "type", 3, "order", 34, "difference", 1, "chapter", 4, "tasknpc", 37033, "plot_group", 36, "openLv", 22, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(37033), "dropID", list(100), "dropNum", list(1)),
    37034, map("id", 37034, "type", 3, "order", 35, "difference", 1, "chapter", 4, "tasknpc", 37034, "plot_group", 37, "openLv", 22, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(37034), "dropID", list(100), "dropNum", list(1)),
    37035, map("id", 37035, "type", 3, "order", 36, "difference", 1, "chapter", 4, "tasknpc", 37035, "plot_group", 38, "openLv", 22, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(37035), "dropID", list(100), "dropNum", list(1)),
    37036, map("id", 37036, "type", 3, "order", 37, "difference", 1, "chapter", 4, "tasknpc", 37036, "plot_group", 39, "openLv", 22, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(37036), "dropID", list(100), "dropNum", list(1)),
    37037, map("id", 37037, "type", 3, "order", 38, "difference", 1, "chapter", 4, "tasknpc", 37037, "plot_group", 40, "openLv", 22, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(37037), "dropID", list(100), "dropNum", list(1))
);
    }

    private static void init87() {
data.map(
    37038, map("id", 37038, "type", 3, "order", 39, "difference", 1, "chapter", 4, "tasknpc", 37038, "plot_group", 41, "openLv", 22, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(37038), "dropID", list(100), "dropNum", list(1)),
    37039, map("id", 37039, "type", 3, "order", 40, "difference", 1, "chapter", 4, "tasknpc", 37039, "plot_group", 42, "openLv", 22, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(37039), "dropID", list(100), "dropNum", list(1)),
    37040, map("id", 37040, "type", 3, "order", 41, "difference", 1, "chapter", 4, "tasknpc", 37040, "plot_group", 43, "openLv", 22, "AutomatictaskOpen", 1, "AutomatictaskEnd", 2, "targetIds", list(37040), "dropID", list(100, 830), "dropNum", list(1, 1)),
    37041, map("id", 37041, "type", 3, "order", 42, "difference", 1, "chapter", 5, "tasknpc", 37041, "plot_group", 44, "openLv", 25, "AutomatictaskOpen", 2, "AutomatictaskEnd", 1, "targetIds", list(37041), "dropID", list(100), "dropNum", list(1)),
    37042, map("id", 37042, "type", 3, "order", 43, "difference", 1, "chapter", 5, "tasknpc", 37042, "plot_group", 45, "openLv", 25, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "mosterid", 4034, "targetIds", list(37042), "dropID", list(100), "dropNum", list(1))
);
    }

    private static void init88() {
data.map(
    37043, map("id", 37043, "type", 3, "order", 44, "difference", 1, "chapter", 5, "tasknpc", 37043, "plot_group", 46, "openLv", 25, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "mosterid", 4035, "targetIds", list(37043), "dropID", list(100), "dropNum", list(1)),
    37044, map("id", 37044, "type", 3, "order", 45, "difference", 1, "chapter", 5, "tasknpc", 37044, "plot_group", 47, "openLv", 25, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(37044), "dropID", list(100), "dropNum", list(1)),
    37045, map("id", 37045, "type", 3, "order", 46, "difference", 1, "chapter", 5, "tasknpc", 37045, "plot_group", 48, "openLv", 25, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(37045), "dropID", list(100), "dropNum", list(1)),
    37046, map("id", 37046, "type", 3, "order", 47, "difference", 1, "chapter", 5, "tasknpc", 37046, "plot_group", 49, "openLv", 25, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(37046), "dropID", list(100), "dropNum", list(1)),
    37047, map("id", 37047, "type", 3, "order", 48, "difference", 1, "chapter", 5, "tasknpc", 37047, "plot_group", 50, "openLv", 25, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "mosterid", 4036, "targetIds", list(37047), "dropID", list(100), "dropNum", list(1))
);
    }

    private static void init89() {
data.map(
    37048, map("id", 37048, "type", 3, "order", 49, "difference", 1, "chapter", 5, "tasknpc", 37048, "plot_group", 51, "openLv", 25, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "mosterid", 4037, "targetIds", list(37048), "dropID", list(100), "dropNum", list(1)),
    37049, map("id", 37049, "type", 3, "order", 50, "difference", 1, "chapter", 5, "tasknpc", 37049, "plot_group", 52, "openLv", 25, "AutomatictaskOpen", 1, "AutomatictaskEnd", 2, "targetIds", list(37049), "dropID", list(100, 831), "dropNum", list(1, 1)),
    37050, map("id", 37050, "type", 3, "order", 51, "difference", 1, "chapter", 6, "tasknpc", 37050, "plot_group", 53, "openLv", 30, "AutomatictaskOpen", 2, "AutomatictaskEnd", 1, "targetIds", list(37050), "dropID", list(100), "dropNum", list(1)),
    37051, map("id", 37051, "type", 3, "order", 52, "difference", 1, "chapter", 6, "tasknpc", 37050, "plot_group", 54, "openLv", 30, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(37051), "dropID", list(100), "dropNum", list(1)),
    37052, map("id", 37052, "type", 3, "order", 53, "difference", 1, "chapter", 6, "tasknpc", 37052, "plot_group", 55, "openLv", 30, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "mosterid", 4038, "targetIds", list(37052), "dropID", list(100), "dropNum", list(1))
);
    }

    private static void init90() {
data.map(
    37053, map("id", 37053, "type", 3, "order", 54, "difference", 1, "chapter", 6, "tasknpc", 37053, "plot_group", 56, "openLv", 30, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(37053), "dropID", list(100), "dropNum", list(1)),
    37054, map("id", 37054, "type", 3, "order", 55, "difference", 1, "chapter", 6, "tasknpc", 37054, "plot_group", 57, "openLv", 30, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "mosterid", 4039, "targetIds", list(37054), "dropID", list(100), "dropNum", list(1)),
    37055, map("id", 37055, "type", 3, "order", 56, "difference", 1, "chapter", 6, "tasknpc", 37055, "plot_group", 58, "openLv", 30, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "targetIds", list(37055), "dropID", list(100), "dropNum", list(1)),
    37056, map("id", 37056, "type", 3, "order", 57, "difference", 1, "chapter", 6, "tasknpc", 37056, "plot_group", 59, "openLv", 30, "AutomatictaskOpen", 1, "AutomatictaskEnd", 1, "mosterid", 4040, "targetIds", list(37056), "dropID", list(100), "dropNum", list(1)),
    37057, map("id", 37057, "type", 3, "order", 58, "difference", 1, "chapter", 6, "tasknpc", 37057, "plot_group", 60, "openLv", 30, "AutomatictaskOpen", 1, "AutomatictaskEnd", 2, "targetIds", list(37057), "dropID", list(100, 832), "dropNum", list(1, 1))
);
    }

    private static void init91() {
data.map(
    40000, map("id", 40000, "type", 4, "order", 1, "openLv", 4, "targetIds", list(40000), "dropID", list(100), "dropNum", list(1)),
    40001, map("id", 40001, "type", 4, "order", 2, "openLv", 4, "targetIds", list(40001), "dropID", list(100, 713), "dropNum", list(1, 1), "guide", 10011),
    40002, map("id", 40002, "type", 4, "order", 3, "openLv", 4, "targetIds", list(40002), "dropID", list(100), "dropNum", list(1)),
    40003, map("id", 40003, "type", 4, "order", 4, "openLv", 4, "targetIds", list(40003), "dropID", list(100), "dropNum", list(1)),
    40004, map("id", 40004, "type", 4, "order", 5, "openLv", 4, "targetIds", list(40004), "dropID", list(100), "dropNum", list(1))
);
    }

    private static void init92() {
data.map(
    40005, map("id", 40005, "type", 4, "order", 6, "openLv", 4, "targetIds", list(40005), "dropID", list(100), "dropNum", list(1)),
    40006, map("id", 40006, "type", 4, "order", 7, "openLv", 4, "targetIds", list(40006), "dropID", list(100), "dropNum", list(1)),
    40007, map("id", 40007, "type", 4, "order", 8, "openLv", 4, "targetIds", list(40007), "dropID", list(100), "dropNum", list(1)),
    40008, map("id", 40008, "type", 4, "order", 1, "openLv", 15, "targetIds", list(40008), "dropID", list(715), "dropNum", list(1), "guide", 10020),
    40009, map("id", 40009, "type", 4, "order", 1, "icon", 996, "openLv", 13, "targetIds", list(40009), "dropID", list(714), "dropNum", list(1), "guide", 10014)
);
    }

    private static void init93() {
data.map(
    40010, map("id", 40010, "type", 4, "order", 2, "icon", 996, "openLv", 13, "targetIds", list(40010), "dropID", list(500), "dropNum", list(3)),
    50000, map("id", 50000, "type", 5, "order", 1, "openLv", 1, "targetIds", list(50000), "dropID", list(101), "dropNum", list(1)),
    50001, map("id", 50001, "type", 5, "order", 1, "openLv", 1, "targetIds", list(50001), "dropID", list(101), "dropNum", list(1)),
    50002, map("id", 50002, "type", 5, "order", 1, "openLv", 1, "targetIds", list(50002), "dropID", list(101), "dropNum", list(1)),
    50003, map("id", 50003, "type", 5, "order", 1, "openLv", 1, "targetIds", list(50003), "dropID", list(101), "dropNum", list(1))
);
    }

    private static void init94() {
data.map(
    50004, map("id", 50004, "type", 5, "order", 1, "openLv", 1, "targetIds", list(50004), "dropID", list(101), "dropNum", list(1)),
    50005, map("id", 50005, "type", 5, "order", 1, "openLv", 1, "targetIds", list(50005), "dropID", list(101), "dropNum", list(1)),
    50006, map("id", 50006, "type", 5, "order", 1, "openLv", 1, "targetIds", list(50006), "dropID", list(101), "dropNum", list(1)),
    50007, map("id", 50007, "type", 5, "order", 1, "openLv", 1, "targetIds", list(50007), "dropID", list(101), "dropNum", list(1)),
    50008, map("id", 50008, "type", 5, "order", 1, "openLv", 1, "targetIds", list(50008), "dropID", list(101), "dropNum", list(1))
);
    }

    private static void init95() {
data.map(
    90002, map("id", 90002, "type", 9, "order", 1, "openLv", 1, "targetIds", list(90002), "chenghao", 90002),
    90009, map("id", 90009, "type", 9, "order", 1, "openLv", 1, "targetIds", list(90009), "chenghao", 90009),
    90014, map("id", 90014, "type", 9, "order", 1, "openLv", 1, "targetIds", list(90014), "chenghao", 90014),
    90050, map("id", 90050, "type", 9, "order", 1, "openLv", 1, "targetIds", list(90050), "chenghao", 90050),
    90051, map("id", 90051, "type", 9, "order", 1, "openLv", 1, "targetIds", list(90051), "chenghao", 90051)
);
    }

    private static void init96() {
data.map(
    90052, map("id", 90052, "type", 9, "order", 1, "openLv", 1, "targetIds", list(90052), "chenghao", 90052),
    90053, map("id", 90053, "type", 9, "order", 1, "openLv", 1, "targetIds", list(90053), "chenghao", 90053),
    90100, map("id", 90100, "type", 11, "order", 1, "openLv", 1, "targetIds", list(90100), "dropID", list(610), "dropNum", list(1)),
    90101, map("id", 90101, "type", 11, "order", 1, "openLv", 1, "targetIds", list(90101), "dropID", list(611), "dropNum", list(1)),
    90102, map("id", 90102, "type", 11, "order", 1, "openLv", 1, "targetIds", list(90102), "dropID", list(612), "dropNum", list(1))
);
    }

    private static void init97() {
data.map(
    100001, map("id", 100001, "type", 10, "order", 1, "openLv", 1, "targetIds", list(100001), "chenghao", 100001),
    100002, map("id", 100002, "type", 10, "order", 1, "openLv", 1, "targetIds", list(100002), "chenghao", 100002),
    200001, map("id", 200001, "type", 12, "order", 1, "openLv", 4, "targetIds", list(200001), "dropID", list(100), "dropNum", list(1)),
    200002, map("id", 200002, "type", 12, "order", 1, "openLv", 4, "targetIds", list(200002), "dropID", list(100, 713), "dropNum", list(1, 1), "guide", 10011),
    200003, map("id", 200003, "type", 12, "order", 1, "openLv", 4, "targetIds", list(200003), "dropID", list(100), "dropNum", list(1))
);
    }

    private static void init98() {
data.map(
    200004, map("id", 200004, "type", 12, "order", 1, "openLv", 4, "targetIds", list(200004), "dropID", list(100), "dropNum", list(1)),
    200005, map("id", 200005, "type", 12, "order", 5, "openLv", 4, "targetIds", list(200005), "dropID", list(100), "dropNum", list(1)),
    200006, map("id", 200006, "type", 12, "order", 6, "openLv", 4, "targetIds", list(200006), "dropID", list(100), "dropNum", list(1)),
    200007, map("id", 200007, "type", 12, "order", 7, "openLv", 4, "targetIds", list(200007), "dropID", list(100), "dropNum", list(1))
);
    }

}