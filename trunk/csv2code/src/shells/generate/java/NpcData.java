package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * npc定义表.csv
 * id = id
 * 名称 = name
 * 男女主线区分 = difference
 * NPC类型0）普通1）任务 2）悬赏 = type
 * Q版模型 = model
 * NPC显示1）自己2）全服 = display
 * 地图 = map
 * 模型放大比例 = proportion
 * 头像 = head
 * 坐标 = coordinate
 * 出现条件类型0永驻1任务2等级3悬赏任务4答题 = appearType
 * 类型值 = appearNum
 * 删除条件类型0无1任务2交互3悬赏任务完成 = disappearType
 * 出现数组 = taskendid
 * 是否显示名称 = lookname
 * NPC对话ID = dialogue
 * 任务对话对应的任务ID = taskID
 * 任务对话 = taskdialogue
 * npc战斗阵容 = fight
 * npc收取道具类型 = propID
 * npc收取道具数量 = propNum
 */
public class NpcData extends LData {
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
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    1, map("id", 1, "name", "张三", "difference", 0, "type", 0, "model", 40008, "display", 1, "map", 1, "proportion", "1", "head", "40008", "coordinate", "11,11", "appearType", 0, "disappearType", 0, "dialogue", list(7, 8), "taskID", list(1, 2), "taskdialogue", list(7, 8)),
    2, map("id", 2, "name", "李四", "difference", 0, "type", 0, "model", 40009, "display", 1, "map", 2, "proportion", "1", "head", "40009", "coordinate", "11,11", "appearType", 1, "appearNum", 1, "disappearType", 1, "disappearNum", 1, "dialogue", list(7, 8), "fight", 10119),
    3, map("id", 3, "name", "王五", "difference", 0, "type", 0, "model", 40010, "display", 1, "map", 3, "proportion", "1", "head", "40010", "coordinate", "11,11", "appearType", 2, "appearNum", 2, "disappearType", 2, "dialogue", list(7, 8), "propID", 10000, "propNum", 1),
    101, map("id", 101, "name", "游侠", "difference", 0, "type", 2, "model", 40016, "display", 1, "map", 1, "proportion", "1", "head", "40016", "coordinate", "995,922", "appearType", 3, "appearNum", 1, "disappearType", 3, "dialogue", list(44), "fight", 21),
    102, map("id", 102, "name", "杜浪", "difference", 0, "type", 2, "model", 40026, "display", 1, "map", 2, "proportion", "1", "head", "40026", "coordinate", "995,922", "appearType", 3, "appearNum", 2, "disappearType", 3, "dialogue", list(45), "fight", 22)
);
    }

    private static void init1() {
data.map(
    103, map("id", 103, "name", "张碧君", "difference", 0, "type", 2, "model", 40028, "display", 1, "map", 3, "proportion", "1", "head", "40028", "coordinate", "995,922", "appearType", 3, "appearNum", 3, "disappearType", 3, "dialogue", list(46), "fight", 23),
    104, map("id", 104, "name", "穆云梳", "difference", 0, "type", 2, "model", 40015, "display", 1, "map", 1, "proportion", "1", "head", "40015", "coordinate", "2776,952", "appearType", 3, "appearNum", 4, "disappearType", 3, "dialogue", list(47), "fight", 24),
    105, map("id", 105, "name", "逍遥", "difference", 0, "type", 2, "model", 40016, "display", 1, "map", 2, "proportion", "1", "head", "40016", "coordinate", "2776,952", "appearType", 3, "appearNum", 5, "disappearType", 3, "dialogue", list(48), "fight", 25),
    106, map("id", 106, "name", "玄机散人", "difference", 0, "type", 2, "model", 40017, "display", 1, "map", 3, "proportion", "1", "head", "40017", "coordinate", "2776,952", "appearType", 3, "appearNum", 6, "disappearType", 3, "dialogue", list(49), "fight", 26),
    107, map("id", 107, "name", "霍曼曼", "difference", 0, "type", 2, "model", 40009, "display", 1, "map", 1, "proportion", "1", "head", "40009", "coordinate", "3064,567", "appearType", 3, "appearNum", 7, "disappearType", 3, "dialogue", list(50), "fight", 27)
);
    }

    private static void init2() {
data.map(
    108, map("id", 108, "name", "公子尘来", "difference", 0, "type", 2, "model", 40010, "display", 1, "map", 2, "proportion", "1", "head", "40010", "coordinate", "3064,567", "appearType", 3, "appearNum", 8, "disappearType", 3, "dialogue", list(51), "fight", 28),
    109, map("id", 109, "name", "窦夫人", "difference", 0, "type", 2, "model", 40012, "display", 1, "map", 3, "proportion", "1", "head", "40012", "coordinate", "3064,567", "appearType", 3, "appearNum", 9, "disappearType", 3, "dialogue", list(52), "fight", 29),
    110, map("id", 110, "name", "胡不归", "difference", 0, "type", 2, "model", 40013, "display", 1, "map", 1, "proportion", "1", "head", "40013", "coordinate", "772,516", "appearType", 3, "appearNum", 1, "disappearType", 3, "dialogue", list(53), "fight", 30),
    111, map("id", 111, "name", "武照", "difference", 0, "type", 2, "model", 40014, "display", 1, "map", 2, "proportion", "1", "head", "40014", "coordinate", "772,516", "appearType", 3, "appearNum", 2, "disappearType", 3, "dialogue", list(54), "fight", 31),
    112, map("id", 112, "name", "姬重华", "difference", 0, "type", 2, "model", 40006, "display", 1, "map", 3, "proportion", "1", "head", "40006", "coordinate", "772,516", "appearType", 3, "appearNum", 3, "disappearType", 3, "dialogue", list(55), "fight", 32)
);
    }

    private static void init3() {
data.map(
    10000, map("id", 10000, "name", "春雨", "difference", 2, "type", 1, "model", 5012, "display", 2, "map", 1001, "proportion", "1", "head", "40018", "coordinate", "698,214", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35000, 35001, 35002, 35003, 35004, 35005, 35006, 35007, 35008), "lookname", 1, "dialogue", list(4), "taskID", list(35000, 35002), "taskdialogue", list(4, 6)),
    10001, map("id", 10001, "name", "青湖", "difference", 2, "type", 1, "model", 5006, "display", 2, "map", 1001, "proportion", "1", "head", "40021", "coordinate", "1619,338", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35000, 35001, 35002, 35003, 35004, 35005, 35006, 35007), "lookname", 1, "dialogue", list(5, 6), "taskID", list(35004, 35006), "taskdialogue", list(8, 10)),
    10002, map("id", 10002, "name", "秋花", "difference", 2, "type", 0, "model", 5008, "display", 2, "map", 1001, "proportion", "1", "head", "5008", "coordinate", "2467,267", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35000, 35001, 35002, 35003, 35004, 35005, 35006, 35007, 35008, 35009, 35010), "lookname", 1, "dialogue", list(3)),
    10003, map("id", 10003, "name", "南府仆人", "difference", 2, "type", 0, "model", 5008, "display", 2, "map", 1001, "proportion", "1", "head", "5008", "coordinate", "1689,342", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35005), "lookname", 1, "taskID", list(35005), "taskdialogue", list(9), "fight", 4002),
    10004, map("id", 10004, "name", "夏侍卫", "difference", 2, "type", 0, "model", 5015, "display", 2, "map", 1001, "proportion", "1", "head", "5015", "coordinate", "2584,284", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35000, 35001, 35002, 35003, 35004, 35005, 35006, 35007, 35008, 35009, 35010), "lookname", 1, "dialogue", list(3))
);
    }

    private static void init4() {
data.map(
    10005, map("id", 10005, "name", "小石块", "difference", 2, "type", 1, "model", 6000, "display", 2, "map", 1001, "proportion", "0.5", "head", "6000", "coordinate", "2320,167", "appearType", 1, "appearNum", 0, "disappearType", 2, "taskendid", list(35003), "lookname", 2, "taskID", list(35003), "taskdialogue", list(7), "fight", 4001),
    10006, map("id", 10006, "name", "石头会变成盒子", "difference", 2, "type", 1, "model", 6001, "display", 2, "map", 1001, "proportion", "0.5", "head", "6001", "coordinate", "2055,333", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35010), "lookname", 2, "taskID", list(35010), "taskdialogue", list(14)),
    10007, map("id", 10007, "name", "王伯", "difference", 2, "type", 1, "model", 5025, "display", 2, "map", 1001, "proportion", "1", "head", "40028", "coordinate", "958,147", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35009), "lookname", 1, "dialogue", list(10, 11), "taskID", list(35009), "taskdialogue", list(13)),
    10008, map("id", 10008, "name", "柳氏", "difference", 2, "type", 1, "model", 40012, "display", 2, "map", 1001, "proportion", "1", "head", "40018", "coordinate", "1140,239", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35000, 35001, 35002, 35003, 35004, 35005, 35006, 35008, 35009, 35010), "lookname", 1, "dialogue", list(12, 13), "taskID", list(35001), "taskdialogue", list(5)),
    10009, map("id", 10009, "name", "杏华", "difference", 2, "type", 1, "model", 5011, "display", 2, "map", 1001, "proportion", "1", "head", "5011", "coordinate", "1946,372", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35000, 35001, 35002, 35003, 35004, 35005, 35006, 35007, 35008, 35009, 35010), "lookname", 1, "dialogue", list(9))
);
    }

    private static void init5() {
data.map(
    10010, map("id", 10010, "name", "青湖", "difference", 2, "type", 1, "model", 5006, "display", 2, "map", 1001, "proportion", "1", "head", "40021", "coordinate", "1275,239", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35008, 35009, 35010), "lookname", 1, "dialogue", list(5, 6), "taskID", list(35008), "taskdialogue", list(12)),
    10011, map("id", 10011, "name", "柳氏", "difference", 2, "type", 1, "model", 40012, "display", 2, "map", 1001, "proportion", "1", "head", "40018", "coordinate", "1140,239", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35007), "lookname", 1, "taskID", list(35007), "taskdialogue", list(11), "fight", 4003),
    35011, map("id", 35011, "name", "王伯", "difference", 2, "type", 1, "model", 5025, "display", 2, "map", 1002, "proportion", "1", "head", "40028", "coordinate", "698,214", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35011), "lookname", 1, "taskID", list(35011), "taskdialogue", list(17)),
    35012, map("id", 35012, "name", "枫山守卫", "difference", 2, "type", 1, "model", 5019, "display", 2, "map", 1002, "proportion", "1", "head", "5019", "coordinate", "1548,248", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35012), "lookname", 1, "taskID", list(35012), "taskdialogue", list(18), "fight", 4004),
    35013, map("id", 35013, "name", "游侠儿", "difference", 2, "type", 1, "model", 5029, "display", 2, "map", 1002, "proportion", "1", "head", "5029", "coordinate", "2467,267", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35013), "lookname", 1, "taskID", list(35013), "taskdialogue", list(19), "fight", 4005)
);
    }

    private static void init6() {
data.map(
    35014, map("id", 35014, "name", "南府侍卫", "difference", 2, "type", 1, "model", 40014, "display", 2, "map", 1002, "proportion", "1", "head", "40033", "coordinate", "2037,215", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35014, 35015, 35016), "lookname", 1, "taskID", list(35014, 35015, 35016), "taskdialogue", list(20, 21, 22)),
    35017, map("id", 35017, "name", "侍卫", "difference", 2, "type", 1, "model", 40014, "display", 2, "map", 1002, "proportion", "1", "head", "40033", "coordinate", "2416,232", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35017), "lookname", 1, "taskID", list(35017), "taskdialogue", list(23)),
    35018, map("id", 35018, "name", "雁北归", "difference", 2, "type", 1, "model", 40010, "display", 2, "map", 1002, "proportion", "1", "head", "40010", "coordinate", "2284,228", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35018), "lookname", 1, "taskID", list(35018), "taskdialogue", list(24)),
    35019, map("id", 35019, "name", "承影", "difference", 2, "type", 1, "model", 5029, "display", 2, "map", 1002, "proportion", "1", "head", "40008", "coordinate", "2249,218", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35019), "lookname", 1, "taskID", list(35019), "taskdialogue", list(25)),
    35020, map("id", 35020, "name", "玄衣男子", "difference", 2, "type", 1, "model", 40010, "display", 2, "map", 1002, "proportion", "1", "head", "40010", "coordinate", "1697,205", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35020), "lookname", 1, "taskID", list(35020), "taskdialogue", list(26), "fight", 4006)
);
    }

    private static void init7() {
data.map(
    35021, map("id", 35021, "name", "青湖", "difference", 2, "type", 1, "model", 5006, "display", 2, "map", 1001, "proportion", "1", "head", "40021", "coordinate", "449,210", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35021, 35022), "lookname", 1, "taskID", list(35021, 35022), "taskdialogue", list(27, 28)),
    35023, map("id", 35023, "name", "青湖", "difference", 2, "type", 1, "model", 5006, "display", 2, "map", 1003, "proportion", "1", "head", "40021", "coordinate", "554,196", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35023), "lookname", 1, "taskID", list(35023), "taskdialogue", list(29)),
    35024, map("id", 35024, "name", "神秘男子", "difference", 2, "type", 1, "model", 40025, "display", 2, "map", 1003, "proportion", "1", "head", "40025", "coordinate", "1073,235", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35023, 35024, 35025, 35026), "lookname", 1, "taskID", list(35024), "taskdialogue", list(30)),
    35025, map("id", 35025, "name", "姬重华", "difference", 2, "type", 1, "model", 40006, "display", 2, "map", 1003, "proportion", "1", "head", "40006", "coordinate", "1261,216", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35025, 35026), "lookname", 1, "taskID", list(35025), "taskdialogue", list(31)),
    35026, map("id", 35026, "name", "香客", "difference", 2, "type", 1, "model", 5024, "display", 2, "map", 1003, "proportion", "1", "head", "5024", "coordinate", "1689,154", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35021, 35022, 35023, 35024, 35025, 35026, 35027, 35028, 35029, 35030), "lookname", 1, "taskID", list(35026), "taskdialogue", list(32))
);
    }

    private static void init8() {
data.map(
    35027, map("id", 35027, "name", "霍曼曼", "difference", 2, "type", 1, "model", 40009, "display", 2, "map", 1003, "proportion", "1", "head", "40009", "coordinate", "2320,167", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35027), "lookname", 1, "taskID", list(35027), "taskdialogue", list(33)),
    35028, map("id", 35028, "name", "王伯", "difference", 2, "type", 1, "model", 5025, "display", 2, "map", 1000, "proportion", "1", "head", "40028", "coordinate", "668,194", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35028), "lookname", 1, "taskID", list(35028), "taskdialogue", list(34)),
    35029, map("id", 35029, "name", "南鹤", "difference", 2, "type", 1, "model", 5025, "display", 2, "map", 1000, "proportion", "1", "head", "40032", "coordinate", "441,177", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35029), "lookname", 1, "taskID", list(35029), "taskdialogue", list(35)),
    35030, map("id", 35030, "name", "朱尚宫", "difference", 2, "type", 1, "model", 5013, "display", 2, "map", 1005, "proportion", "1", "head", "5013", "coordinate", "698,214", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35030), "lookname", 1, "taskID", list(35030), "taskdialogue", list(36)),
    35031, map("id", 35031, "name", "荀学士", "difference", 2, "type", 1, "model", 5027, "display", 2, "map", 1005, "proportion", "1", "head", "5027", "coordinate", "870,133", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35031), "lookname", 1, "taskID", list(35031), "taskdialogue", list(37), "fight", 4010)
);
    }

    private static void init9() {
data.map(
    35032, map("id", 35032, "name", "长雍君", "difference", 2, "type", 1, "model", 40001, "display", 2, "map", 1005, "proportion", "1", "head", "40001", "coordinate", "1321,143", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35032), "lookname", 1, "taskID", list(35032), "taskdialogue", list(38)),
    35033, map("id", 35033, "name", "荀学士", "difference", 2, "type", 1, "model", 5027, "display", 2, "map", 1005, "proportion", "1", "head", "5027", "coordinate", "1619,338", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35033), "lookname", 1, "taskID", list(35033), "taskdialogue", list(39), "fight", 4011),
    35034, map("id", 35034, "name", "青湖", "difference", 2, "type", 1, "model", 5006, "display", 2, "map", 1005, "proportion", "1", "head", "40021", "coordinate", "2320,167", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35034), "lookname", 1, "taskID", list(35034), "taskdialogue", list(40), "fight", 4012),
    35035, map("id", 35035, "name", "王嬷嬷", "difference", 2, "type", 1, "model", 5014, "display", 2, "map", 1005, "proportion", "1", "head", "5014", "coordinate", "2584,284", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35035), "lookname", 1, "taskID", list(35035), "taskdialogue", list(41)),
    35036, map("id", 35036, "name", "长雍君", "difference", 2, "type", 1, "model", 40010, "display", 2, "map", 1005, "proportion", "1", "head", "40001", "coordinate", "1143,179", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35036), "lookname", 1, "taskID", list(35036), "taskdialogue", list(42))
);
    }

    private static void init10() {
data.map(
    35037, map("id", 35037, "name", "穆云梳", "difference", 2, "type", 1, "model", 40015, "display", 2, "map", 1005, "proportion", "1", "head", "40015", "coordinate", "958,147", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35037), "lookname", 1, "taskID", list(35037), "taskdialogue", list(43)),
    35038, map("id", 35038, "name", "长雍君", "difference", 2, "type", 1, "model", 40010, "display", 2, "map", 1005, "proportion", "1", "head", "40001", "coordinate", "1525,296", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35038), "lookname", 1, "taskID", list(35038), "taskdialogue", list(44)),
    35039, map("id", 35039, "name", "北斗", "difference", 2, "type", 1, "model", 40014, "display", 2, "map", 1005, "proportion", "1", "head", "40014", "coordinate", "698,214", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35039), "lookname", 1, "taskID", list(35039), "taskdialogue", list(45)),
    35040, map("id", 35040, "name", "莺莺", "difference", 2, "type", 1, "model", 5027, "display", 2, "map", 1006, "proportion", "1", "head", "5027", "coordinate", "1674,211", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35040), "lookname", 1, "taskID", list(35040), "taskdialogue", list(46), "fight", 4014),
    35041, map("id", 35041, "name", "青湖", "difference", 2, "type", 1, "model", 5006, "display", 2, "map", 1006, "proportion", "1", "head", "40021", "coordinate", "2115,146", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35041), "lookname", 1, "taskID", list(35041), "taskdialogue", list(47))
);
    }

    private static void init11() {
data.map(
    35042, map("id", 35042, "name", "穷酸书生", "difference", 2, "type", 1, "model", 5025, "display", 2, "map", 1006, "proportion", "1", "head", "5025", "coordinate", "1557,206", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35042), "lookname", 1, "taskID", list(35042), "taskdialogue", list(48), "fight", 4015),
    35043, map("id", 35043, "name", "雁玉京", "difference", 2, "type", 1, "model", 5030, "display", 2, "map", 1006, "proportion", "1", "head", "40000", "coordinate", "2320,167", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35043), "lookname", 1, "taskID", list(35043), "taskdialogue", list(49)),
    35044, map("id", 35044, "name", "雁玉京", "difference", 2, "type", 1, "model", 5030, "display", 2, "map", 1006, "proportion", "1", "head", "40000", "coordinate", "2320,167", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35044), "lookname", 1, "taskID", list(35044), "taskdialogue", list(50)),
    35045, map("id", 35045, "name", "柳氏", "difference", 2, "type", 1, "model", 40012, "display", 2, "map", 1006, "proportion", "1", "head", "40012", "coordinate", "2055,333", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35045), "lookname", 1, "taskID", list(35045), "taskdialogue", list(51)),
    35046, map("id", 35046, "name", "长雍君", "difference", 2, "type", 1, "model", 40010, "display", 2, "map", 1005, "proportion", "1", "head", "40001", "coordinate", "1140,239", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35046), "lookname", 1, "taskID", list(35046), "taskdialogue", list(52))
);
    }

    private static void init12() {
data.map(
    35047, map("id", 35047, "name", "青湖", "difference", 2, "type", 1, "model", 5006, "display", 2, "map", 1005, "proportion", "1", "head", "40021", "coordinate", "2115,146", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35047), "lookname", 1, "taskID", list(35047), "taskdialogue", list(53)),
    35048, map("id", 35048, "name", "穆云梳", "difference", 2, "type", 1, "model", 40015, "display", 2, "map", 1005, "proportion", "1", "head", "40015", "coordinate", "1275,239", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35048), "lookname", 1, "taskID", list(35048), "taskdialogue", list(54)),
    35049, map("id", 35049, "name", "姬长生", "difference", 2, "type", 1, "model", 5030, "display", 2, "map", 1005, "proportion", "1", "head", "40000", "coordinate", "958,147", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35049), "lookname", 1, "taskID", list(35049), "taskdialogue", list(55)),
    35050, map("id", 35050, "name", "北斗", "difference", 2, "type", 1, "model", 40014, "display", 2, "map", 1005, "proportion", "1", "head", "40014", "coordinate", "698,214", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35050), "lookname", 1, "taskID", list(35050), "taskdialogue", list(56)),
    35051, map("id", 35051, "name", "刘嬷嬷", "difference", 2, "type", 1, "model", 5014, "display", 2, "map", 1004, "proportion", "1", "head", "5014", "coordinate", "577,154", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35051), "lookname", 1, "taskID", list(35051), "taskdialogue", list(57), "fight", 4019)
);
    }

    private static void init13() {
data.map(
    35052, map("id", 35052, "name", "长琴", "difference", 2, "type", 1, "model", 5010, "display", 2, "map", 1004, "proportion", "1", "head", "5010", "coordinate", "1194,188", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35052), "lookname", 1, "taskID", list(35052), "taskdialogue", list(58)),
    35053, map("id", 35053, "name", "卡萨", "difference", 2, "type", 1, "model", 5029, "display", 2, "map", 1004, "proportion", "1", "head", "40005", "coordinate", "2133,217", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35053), "lookname", 1, "taskID", list(35053), "taskdialogue", list(59)),
    35054, map("id", 35054, "name", "姬燕来", "difference", 2, "type", 1, "model", 5030, "display", 2, "map", 1004, "proportion", "1", "head", "40024", "coordinate", "2320,167", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35054), "lookname", 1, "taskID", list(35054), "taskdialogue", list(60)),
    35055, map("id", 35055, "name", "姬燕来", "difference", 2, "type", 1, "model", 5030, "display", 2, "map", 1004, "proportion", "1", "head", "40024", "coordinate", "2320,167", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35055), "lookname", 1, "taskID", list(35055), "taskdialogue", list(61)),
    35056, map("id", 35056, "name", "青湖", "difference", 2, "type", 1, "model", 5006, "display", 2, "map", 1005, "proportion", "1", "head", "40021", "coordinate", "1140,239", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(35056), "lookname", 1, "taskID", list(35056), "taskdialogue", list(62))
);
    }

    private static void init14() {
data.map(
    37000, map("id", 37000, "name", "小石块", "difference", 1, "type", 1, "model", 6000, "display", 2, "map", 1001, "proportion", "0.5", "head", "6000", "coordinate", "177,150", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37000), "lookname", 2, "taskID", list(37000), "taskdialogue", list(2)),
    37001, map("id", 37001, "name", "路人", "difference", 1, "type", 1, "model", 5028, "display", 2, "map", 1001, "proportion", "1", "head", "5028", "coordinate", "404,194", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37001), "lookname", 1, "taskID", list(37001), "taskdialogue", list(3)),
    37002, map("id", 37002, "name", "侍卫", "difference", 1, "type", 1, "model", 5015, "display", 2, "map", 1001, "proportion", "1", "head", "40033", "coordinate", "675,77", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37002), "lookname", 1, "taskID", list(37002), "taskdialogue", list(4), "fight", 4021),
    37003, map("id", 37003, "name", "南府门人", "difference", 1, "type", 0, "model", 5016, "display", 2, "map", 1001, "proportion", "1", "head", "40029", "coordinate", "1038,273", "appearType", 0, "appearNum", 0, "disappearType", 1, "taskendid", list(37003), "lookname", 1, "dialogue", list(14), "taskID", list(37003), "taskdialogue", list(5)),
    37004, map("id", 37004, "name", "南府仆人", "difference", 1, "type", 0, "model", 40012, "display", 2, "map", 1001, "proportion", "1", "head", "40018", "coordinate", "1339,223", "appearType", 0, "appearNum", 0, "disappearType", 1, "taskendid", list(37004), "lookname", 1, "dialogue", list(16, 15), "taskID", list(37004), "taskdialogue", list(6))
);
    }

    private static void init15() {
data.map(
    37005, map("id", 37005, "name", "南府侍女", "difference", 1, "type", 1, "model", 40012, "display", 2, "map", 1001, "proportion", "1", "head", "40018", "coordinate", "1518,276", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37005), "lookname", 1, "taskID", list(37005), "taskdialogue", list(7), "fight", 4022),
    37006, map("id", 37006, "name", "南府仆人", "difference", 1, "type", 1, "model", 5006, "display", 2, "map", 1001, "proportion", "1", "head", "40018", "coordinate", "1702,195", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37006), "lookname", 1, "dialogue", list(17, 18), "taskID", list(37006), "taskdialogue", list(8), "fight", 4023),
    37007, map("id", 37007, "name", "青湖", "difference", 1, "type", 0, "model", 40021, "display", 2, "map", 1001, "proportion", "1", "head", "40021", "coordinate", "2247,320", "appearType", 0, "appearNum", 0, "disappearType", 1, "taskendid", list(37007), "lookname", 1, "dialogue", list(19, 20), "taskID", list(37007), "taskdialogue", list(9)),
    37008, map("id", 37008, "name", "南府主管", "difference", 1, "type", 1, "model", 40028, "display", 2, "map", 1001, "proportion", "1", "head", "40028", "coordinate", "924,119", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37008), "lookname", 1, "taskID", list(37008), "taskdialogue", list(11)),
    37009, map("id", 37009, "name", "青湖", "difference", 1, "type", 1, "model", 40021, "display", 2, "map", 1001, "proportion", "1", "head", "40021", "coordinate", "1566,288", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37009), "lookname", 1, "taskID", list(37009), "taskdialogue", list(12))
);
    }

    private static void init16() {
data.map(
    37010, map("id", 37010, "name", "承影", "difference", 1, "type", 1, "model", 40008, "display", 2, "map", 1002, "proportion", "1", "head", "40008", "coordinate", "489,168", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37010), "lookname", 1, "taskID", list(37010), "taskdialogue", list(13)),
    37011, map("id", 37011, "name", "承影", "difference", 1, "type", 1, "model", 40008, "display", 2, "map", 1002, "proportion", "1", "head", "40008", "coordinate", "1111,259", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37011), "lookname", 1, "taskID", list(37011), "taskdialogue", list(14), "fight", 4024),
    37012, map("id", 37012, "name", "枫山守卫", "difference", 1, "type", 1, "model", 40014, "display", 2, "map", 1002, "proportion", "1", "head", "40033", "coordinate", "1548,248", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37012), "lookname", 1, "taskID", list(37012), "taskdialogue", list(15), "fight", 4024),
    37013, map("id", 37013, "name", "枫山守卫", "difference", 1, "type", 1, "model", 40014, "display", 2, "map", 1002, "proportion", "1", "head", "40033", "coordinate", "1266,171", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37013), "lookname", 1, "taskID", list(37013), "taskdialogue", list(16)),
    37014, map("id", 37014, "name", "洗砚", "difference", 1, "type", 1, "model", 40020, "display", 2, "map", 1002, "proportion", "1", "head", "40020", "coordinate", "1950,208", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37014), "lookname", 1, "taskID", list(37014), "taskdialogue", list(17))
);
    }

    private static void init17() {
data.map(
    37015, map("id", 37015, "name", "承影", "difference", 1, "type", 1, "model", 40008, "display", 2, "map", 1002, "proportion", "1", "head", "40008", "coordinate", "2125,231", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37015), "lookname", 1, "taskID", list(37015), "taskdialogue", list(18)),
    37016, map("id", 37016, "name", "华服男子", "difference", 1, "type", 1, "model", 40010, "display", 2, "map", 1002, "proportion", "1", "head", "40001", "coordinate", "1579,227", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37016), "lookname", 1, "taskID", list(37016), "taskdialogue", list(19), "fight", 4025),
    37017, map("id", 37017, "name", "华服男子", "difference", 1, "type", 1, "model", 40010, "display", 2, "map", 1002, "proportion", "1", "head", "40020", "coordinate", "1192,263", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37017), "lookname", 1, "taskID", list(37017), "taskdialogue", list(20)),
    37018, map("id", 37018, "name", "洗砚", "difference", 1, "type", 1, "model", 40020, "display", 2, "map", 1002, "proportion", "1", "head", "40008", "coordinate", "1074,198", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37018), "lookname", 1, "taskID", list(37018), "taskdialogue", list(21)),
    37019, map("id", 37019, "name", "玄衣男子", "difference", 1, "type", 1, "model", 40010, "display", 2, "map", 1002, "proportion", "1", "head", "40010", "coordinate", "800,247", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37019), "lookname", 1, "taskID", list(37019), "taskdialogue", list(22), "fight", 4026)
);
    }

    private static void init18() {
data.map(
    37020, map("id", 37020, "name", "玄衣男子", "difference", 1, "type", 1, "model", 40014, "display", 2, "map", 1002, "proportion", "1", "head", "40033", "coordinate", "1411,124", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37020), "lookname", 1, "dialogue", list(28, 29), "taskID", list(37020), "taskdialogue", list(23)),
    37021, map("id", 37021, "name", "洗砚", "difference", 1, "type", 1, "model", 5028, "display", 2, "map", 1003, "proportion", "1", "head", "40020", "coordinate", "1533,160", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37021), "lookname", 1, "taskID", list(37021), "taskdialogue", list(24)),
    37022, map("id", 37022, "name", "洗砚", "difference", 1, "type", 1, "model", 5028, "display", 2, "map", 1003, "proportion", "1", "head", "40020", "coordinate", "1533,160", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37022), "lookname", 1, "taskID", list(37022), "taskdialogue", list(25)),
    37023, map("id", 37023, "name", "无赖", "difference", 1, "type", 1, "model", 5016, "display", 2, "map", 1003, "proportion", "1", "head", "40029", "coordinate", "771,257", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37023), "lookname", 1, "taskID", list(37023), "taskdialogue", list(26), "fight", 4027),
    37024, map("id", 37024, "name", "无赖", "difference", 1, "type", 1, "model", 5016, "display", 2, "map", 1003, "proportion", "1", "head", "40029", "coordinate", "771,257", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37024), "lookname", 1, "dialogue", list(30, 31), "taskID", list(37024), "taskdialogue", list(27))
);
    }

    private static void init19() {
data.map(
    37025, map("id", 37025, "name", "霍曼曼", "difference", 1, "type", 1, "model", 40009, "display", 2, "map", 1003, "proportion", "1", "head", "40009", "coordinate", "901,186", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37025), "lookname", 1, "dialogue", list(33, 32), "taskID", list(37025), "taskdialogue", list(28)),
    37026, map("id", 37026, "name", "姬重华", "difference", 1, "type", 1, "model", 40006, "display", 2, "map", 1003, "proportion", "1", "head", "40006", "coordinate", "1120,108", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37026), "lookname", 1, "taskID", list(37026), "taskdialogue", list(29), "fight", 4028),
    37027, map("id", 37027, "name", "姬重华", "difference", 1, "type", 1, "model", 40006, "display", 2, "map", 1003, "proportion", "1", "head", "40006", "coordinate", "1120,108", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37027), "lookname", 1, "taskID", list(37027), "taskdialogue", list(30)),
    37028, map("id", 37028, "name", "洗砚", "difference", 1, "type", 1, "model", 5028, "display", 2, "map", 1003, "proportion", "1", "head", "40020", "coordinate", "1018,210", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37028), "lookname", 1, "taskID", list(37028), "taskdialogue", list(31)),
    37029, map("id", 37029, "name", "洗砚", "difference", 1, "type", 1, "model", 5028, "display", 2, "map", 1003, "proportion", "1", "head", "40020", "coordinate", "1018,210", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37029), "lookname", 1, "taskID", list(37029), "taskdialogue", list(32), "fight", 4029)
);
    }

    private static void init20() {
data.map(
    37030, map("id", 37030, "name", "无赖", "difference", 1, "type", 1, "model", 5016, "display", 2, "map", 1003, "proportion", "1", "head", "40029", "coordinate", "1919,147", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37030), "lookname", 1, "taskID", list(37030), "taskdialogue", list(33)),
    37031, map("id", 37031, "name", "要离", "difference", 1, "type", 1, "model", 40016, "display", 2, "map", 1004, "proportion", "1", "head", "40030", "coordinate", "552,180", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37031), "lookname", 1, "taskID", list(37031), "taskdialogue", list(34)),
    37032, map("id", 37032, "name", "要离", "difference", 1, "type", 1, "model", 40016, "display", 2, "map", 1004, "proportion", "1", "head", "40030", "coordinate", "1831,203", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37032, 37033), "lookname", 1, "taskID", list(37032), "taskdialogue", list(35)),
    37033, map("id", 37033, "name", "洗砚", "difference", 1, "type", 1, "model", 5028, "display", 2, "map", 1004, "proportion", "1", "head", "40020", "coordinate", "1930,134", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37032, 37033), "lookname", 1, "taskID", list(37033), "taskdialogue", list(36)),
    37034, map("id", 37034, "name", "要离", "difference", 1, "type", 1, "model", 40016, "display", 2, "map", 1004, "proportion", "1", "head", "40030", "coordinate", "545,196", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37034, 37035, 37036, 37037), "lookname", 1, "taskID", list(37034), "taskdialogue", list(37))
);
    }

    private static void init21() {
data.map(
    37035, map("id", 37035, "name", "侍女", "difference", 1, "type", 1, "model", 40012, "display", 2, "map", 1004, "proportion", "1", "head", "40018", "coordinate", "701,103", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37035), "lookname", 1, "taskID", list(37035), "taskdialogue", list(38)),
    37036, map("id", 37036, "name", "侍女", "difference", 1, "type", 1, "model", 40012, "display", 2, "map", 1004, "proportion", "1", "head", "40018", "coordinate", "967,143", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37034, 37036, 37037), "lookname", 1, "taskID", list(37036), "taskdialogue", list(39)),
    37037, map("id", 37037, "name", "陌生男子", "difference", 1, "type", 1, "model", 5030, "display", 2, "map", 1004, "proportion", "1", "head", "40000", "coordinate", "1349,146", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37037), "lookname", 1, "taskID", list(37037), "taskdialogue", list(40)),
    37038, map("id", 37038, "name", "姬长生", "difference", 1, "type", 1, "model", 5030, "display", 2, "map", 1004, "proportion", "1", "head", "40000", "coordinate", "1896,213", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37038), "lookname", 1, "taskID", list(37038), "taskdialogue", list(41)),
    37039, map("id", 37039, "name", "洗砚", "difference", 1, "type", 1, "model", 5028, "display", 2, "map", 1004, "proportion", "1", "head", "40020", "coordinate", "1930,134", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37039), "lookname", 1, "taskID", list(37039), "taskdialogue", list(42))
);
    }

    private static void init22() {
data.map(
    37040, map("id", 37040, "name", "要离", "difference", 1, "type", 1, "model", 40016, "display", 2, "map", 1006, "proportion", "1", "head", "40030", "coordinate", "263,194", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37040), "lookname", 1, "taskID", list(37040), "taskdialogue", list(43)),
    37041, map("id", 37041, "name", "美貌女子", "difference", 1, "type", 1, "model", 5027, "display", 2, "map", 1006, "proportion", "1", "head", "5027", "coordinate", "879,216", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37041), "lookname", 1, "taskID", list(37041), "taskdialogue", list(44)),
    37042, map("id", 37042, "name", "美貌女子", "difference", 1, "type", 1, "model", 5027, "display", 2, "map", 1006, "proportion", "1", "head", "5027", "coordinate", "1112,240", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37042, 37043, 37044, 37045), "lookname", 1, "taskID", list(37042), "taskdialogue", list(45), "fight", 4034),
    37043, map("id", 37043, "name", "纨绔少年", "difference", 1, "type", 1, "model", 5028, "display", 2, "map", 1006, "proportion", "1", "head", "5028", "coordinate", "1486,182", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37043), "lookname", 1, "taskID", list(37043), "taskdialogue", list(46), "fight", 4035),
    37044, map("id", 37044, "name", "纨绔少年", "difference", 1, "type", 1, "model", 5028, "display", 2, "map", 1006, "proportion", "1", "head", "5028", "coordinate", "1486,182", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37042, 37044), "lookname", 1, "taskID", list(37044), "taskdialogue", list(47))
);
    }

    private static void init23() {
data.map(
    37045, map("id", 37045, "name", "紫衣人", "difference", 1, "type", 1, "model", 5025, "display", 2, "map", 1006, "proportion", "1", "head", "40036", "coordinate", "1642,234", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37045), "lookname", 1, "taskID", list(37045), "taskdialogue", list(48)),
    37046, map("id", 37046, "name", "美貌女子", "difference", 1, "type", 1, "model", 5027, "display", 2, "map", 1006, "proportion", "1", "head", "5027", "coordinate", "1891,199", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37046), "lookname", 1, "taskID", list(37046), "taskdialogue", list(49)),
    37047, map("id", 37047, "name", "诡异马夫", "difference", 1, "type", 1, "model", 5016, "display", 2, "map", 1006, "proportion", "1", "head", "40029", "coordinate", "2064,147", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37047), "lookname", 1, "taskID", list(37047), "taskdialogue", list(50), "fight", 4036),
    37048, map("id", 37048, "name", "诡异马夫", "difference", 1, "type", 1, "model", 5016, "display", 2, "map", 1006, "proportion", "1", "head", "40029", "coordinate", "2368,240", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37048), "lookname", 1, "taskID", list(37048), "taskdialogue", list(51), "fight", 4037),
    37049, map("id", 37049, "name", "诡异马夫", "difference", 1, "type", 1, "model", 5029, "display", 2, "map", 1006, "proportion", "1", "head", "40005", "coordinate", "2368,240", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37049), "lookname", 1, "taskID", list(37049), "taskdialogue", list(52))
);
    }

    private static void init24() {
data.map(
    37050, map("id", 37050, "name", "刘长喜", "difference", 1, "type", 1, "model", 5005, "display", 2, "map", 1005, "proportion", "1", "head", "5005", "coordinate", "1223,259", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37050, 37051), "lookname", 1, "taskID", list(37050, 37051), "taskdialogue", list(53, 54)),
    37052, map("id", 37052, "name", "无理嬷嬷", "difference", 1, "type", 1, "model", 5014, "display", 2, "map", 1004, "proportion", "1", "head", "5014", "coordinate", "1450,190", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37052, 37053), "lookname", 1, "taskID", list(37052), "taskdialogue", list(55), "fight", 4038),
    37053, map("id", 37053, "name", "要离", "difference", 1, "type", 1, "model", 40016, "display", 2, "map", 1004, "proportion", "1", "head", "40030", "coordinate", "1310,164", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37053), "lookname", 1, "taskID", list(37053), "taskdialogue", list(56)),
    37054, map("id", 37054, "name", "刘大麻子", "difference", 1, "type", 1, "model", 5019, "display", 2, "map", 1001, "proportion", "1", "head", "5015", "coordinate", "934,218", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37054, 37055, 37057), "lookname", 1, "taskID", list(37054), "taskdialogue", list(57), "fight", 4039),
    37055, map("id", 37055, "name", "银甲卫", "difference", 1, "type", 1, "model", 5017, "display", 2, "map", 1001, "proportion", "1", "head", "5017", "coordinate", "543,244", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37054, 37055), "lookname", 1, "taskID", list(37055), "taskdialogue", list(58))
);
    }

    private static void init25() {
data.map(
    37056, map("id", 37056, "name", "刘大麻子", "difference", 1, "type", 1, "model", 5019, "display", 2, "map", 1001, "proportion", "1", "head", "5015", "coordinate", "934,218", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37056), "lookname", 1, "taskID", list(37056), "taskdialogue", list(59), "fight", 4040),
    37057, map("id", 37057, "name", "承影", "difference", 1, "type", 1, "model", 5029, "display", 2, "map", 1001, "proportion", "1", "head", "40008", "coordinate", "1116,154", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37057), "lookname", 1, "taskID", list(37057), "taskdialogue", list(60)),
    40000, map("id", 40000, "name", "烛影", "difference", 1, "type", 1, "model", 40017, "display", 2, "map", 1104, "proportion", "1", "head", "40017", "coordinate", "1227,199", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37040, 37041, 37042, 37043, 37044, 37045, 37046, 37047, 37048, 37049, 37050, 37053, 37054, 37055, 37056, 37057), "lookname", 1, "dialogue", list(34)),
    40001, map("id", 40001, "name", "云华", "difference", 1, "type", 1, "model", 40009, "display", 2, "map", 1104, "proportion", "1", "head", "40009", "coordinate", "2415,140", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37040, 37041, 37042, 37043, 37044, 37045, 37046, 37047, 37048, 37049, 37050, 37053, 37054, 37055, 37056, 37057), "lookname", 1, "dialogue", list(35)),
    40002, map("id", 40002, "name", "霜轻", "difference", 1, "type", 1, "model", 40013, "display", 2, "map", 1104, "proportion", "1", "head", "40013", "coordinate", "1812,99", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37040, 37041, 37042, 37043, 37044, 37045, 37046, 37047, 37048, 37049, 37050, 37053, 37054, 37055, 37056, 37057), "lookname", 1, "dialogue", list(40))
);
    }

    private static void init26() {
data.map(
    40003, map("id", 40003, "name", "长琴", "difference", 1, "type", 1, "model", 40013, "display", 2, "map", 1104, "proportion", "1", "head", "40013", "coordinate", "2226,136", "appearType", 1, "appearNum", 0, "disappearType", 1, "taskendid", list(37040, 37041, 37042, 37043, 37044, 37045, 37046, 37047, 37048, 37049, 37050, 37053, 37054, 37055, 37056, 37057), "lookname", 1, "dialogue", list(36)),
    40004, map("id", 40004, "name", "长琴", "difference", 0, "type", 0, "model", 40017, "display", 2, "map", 1103, "proportion", "1", "head", "40013", "coordinate", "1812,99", "appearType", 0, "appearNum", 0, "disappearType", 0, "lookname", 1, "dialogue", list(36)),
    40005, map("id", 40005, "name", "贪狼", "difference", 0, "type", 0, "model", 5028, "display", 2, "map", 1103, "proportion", "1", "head", "40014", "coordinate", "2226,136", "appearType", 0, "appearNum", 0, "disappearType", 0, "lookname", 1, "dialogue", list(37)),
    40006, map("id", 40006, "name", "重华", "difference", 0, "type", 0, "model", 40006, "display", 2, "map", 1105, "proportion", "1", "head", "40006", "coordinate", "2299,245", "appearType", 0, "appearNum", 0, "disappearType", 0, "lookname", 1, "dialogue", list(42)),
    40007, map("id", 40007, "name", "古韵", "difference", 0, "type", 0, "model", 40009, "display", 2, "map", 1105, "proportion", "1", "head", "40009", "coordinate", "1745,264", "appearType", 0, "appearNum", 0, "disappearType", 0, "lookname", 1, "dialogue", list(43))
);
    }

    private static void init27() {
data.map(
    40008, map("id", 40008, "name", "妄士", "difference", 0, "type", 0, "model", 40023, "display", 2, "map", 1102, "proportion", "1", "head", "40023", "coordinate", "2519,134", "appearType", 0, "appearNum", 0, "disappearType", 0, "lookname", 1, "dialogue", list(38)),
    40009, map("id", 40009, "name", "王氏", "difference", 0, "type", 0, "model", 40015, "display", 2, "map", 1102, "proportion", "1", "head", "40015", "coordinate", "1796,137", "appearType", 0, "appearNum", 0, "disappearType", 0, "lookname", 1, "dialogue", list(39)),
    40010, map("id", 40010, "name", "逍遥", "difference", 0, "type", 0, "model", 40016, "display", 2, "map", 1105, "proportion", "1", "head", "40016", "coordinate", "969,256", "appearType", 0, "appearNum", 0, "disappearType", 0, "lookname", 1, "dialogue", list(41)),
    40011, map("id", 40011, "name", "烛影", "difference", 0, "type", 0, "model", 40017, "display", 2, "map", 1104, "proportion", "1", "head", "40017", "coordinate", "495,242", "appearType", 0, "appearNum", 0, "disappearType", 0, "lookname", 1, "dialogue", list(34)),
    40012, map("id", 40012, "name", "云华", "difference", 0, "type", 0, "model", 40015, "display", 2, "map", 1104, "proportion", "1", "head", "40015", "coordinate", "618,271", "appearType", 0, "appearNum", 0, "disappearType", 0, "lookname", 1, "dialogue", list(35))
);
    }

    private static void init28() {
data.map(
    40013, map("id", 40013, "name", "霜轻", "difference", 0, "type", 0, "model", 40016, "display", 2, "map", 1104, "proportion", "1", "head", "40016", "coordinate", "1494,325", "appearType", 0, "appearNum", 0, "disappearType", 0, "lookname", 1, "dialogue", list(40)),
    60000, map("id", 60000, "name", "喵喵问答", "difference", 0, "type", 0, "model", 5029, "display", 2, "map", 1, "proportion", "1", "head", "40008", "coordinate", "2087,992", "appearType", 4, "appearNum", 0, "disappearType", 1, "lookname", 1)
);
    }

}