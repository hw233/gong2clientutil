package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 建筑表.csv
 * 建筑编号编号 = id
 * 建筑名 = name
 * 建筑类型 = type
 * 建筑类别区分 = classify
 * 建筑2级类型 = kind
 * 等级 = lv
 * 建造需要角色等级 = needLv
 * 点击音效 = music
 * 占地面积 = size
 * 购买价格 = needMoney
 * 价格类型 = needType
 * 繁荣度 = prosperity
 * 建筑最大数量 = maxCount
 * 是否可拆除 = delete
 * 是否可建造 = canBuild
 * 是否可移动 = canMoveBuild
 * 建筑信息 = buildFuncitonId
 * 生产类型 = typesOfManufacturing
 * 新手ID = xsId
 * 是否可旋转 = canFlip
 * 是否是障碍 = barrier
 */
public class BuildingData extends LData {
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
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    1000, map("id", 1000, "name", "宅邸", "type", 1, "classify", 1, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(4, 4), "needMoney", 0, "needType", 1, "prosperity", 200, "maxCount", 1, "delete", false, "canBuild", true, "canMoveBuild", true, "buildFuncitonId", list(101), "canFlip", true),
    1001, map("id", 1001, "name", "宅邸", "type", 1, "classify", 1, "kind", 1, "lv", 2, "needLv", 1, "music", 1055, "size", list(4, 4), "needMoney", 0, "needType", 1, "prosperity", 600, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101), "canFlip", true),
    1002, map("id", 1002, "name", "宅邸", "type", 1, "classify", 1, "kind", 1, "lv", 3, "needLv", 1, "music", 1055, "size", list(4, 4), "needMoney", 0, "needType", 1, "prosperity", 1200, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101), "canFlip", true),
    1003, map("id", 1003, "name", "宅邸", "type", 1, "classify", 1, "kind", 1, "lv", 4, "needLv", 1, "music", 1055, "size", list(4, 4), "needMoney", 0, "needType", 1, "prosperity", 2000, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101), "canFlip", true),
    1004, map("id", 1004, "name", "宅邸", "type", 1, "classify", 1, "kind", 1, "lv", 5, "needLv", 1, "music", 1055, "size", list(4, 4), "needMoney", 0, "needType", 1, "prosperity", 3000, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101), "canFlip", true)
);
    }

    private static void init1() {
data.map(
    1005, map("id", 1005, "name", "宅邸", "type", 1, "classify", 1, "kind", 1, "lv", 6, "needLv", 1, "music", 1055, "size", list(4, 4), "needMoney", 0, "needType", 1, "prosperity", 4200, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101), "canFlip", true),
    1006, map("id", 1006, "name", "宅邸", "type", 1, "classify", 1, "kind", 1, "lv", 7, "needLv", 1, "music", 1055, "size", list(4, 4), "needMoney", 0, "needType", 1, "prosperity", 5600, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101), "canFlip", true),
    1007, map("id", 1007, "name", "宅邸", "type", 1, "classify", 1, "kind", 1, "lv", 8, "needLv", 1, "music", 1055, "size", list(4, 4), "needMoney", 0, "needType", 1, "prosperity", 7200, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101), "canFlip", true),
    1008, map("id", 1008, "name", "宅邸", "type", 1, "classify", 1, "kind", 1, "lv", 9, "needLv", 1, "music", 1055, "size", list(4, 4), "needMoney", 0, "needType", 1, "prosperity", 9000, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101), "canFlip", true),
    1009, map("id", 1009, "name", "宅邸", "type", 1, "classify", 1, "kind", 1, "lv", 10, "needLv", 1, "music", 1055, "size", list(4, 4), "needMoney", 0, "needType", 1, "prosperity", 11000, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101), "canFlip", true)
);
    }

    private static void init2() {
data.map(
    1010, map("id", 1010, "name", "宅邸", "type", 1, "classify", 1, "kind", 1, "lv", 11, "needLv", 1, "music", 1055, "size", list(4, 4), "needMoney", 0, "needType", 1, "prosperity", 13200, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101), "canFlip", true),
    1011, map("id", 1011, "name", "宅邸", "type", 1, "classify", 1, "kind", 1, "lv", 12, "needLv", 1, "music", 1055, "size", list(4, 4), "needMoney", 0, "needType", 1, "prosperity", 15600, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101), "canFlip", true),
    1012, map("id", 1012, "name", "宅邸", "type", 1, "classify", 1, "kind", 1, "lv", 13, "needLv", 1, "music", 1055, "size", list(4, 4), "needMoney", 0, "needType", 1, "prosperity", 18200, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101), "canFlip", true),
    1013, map("id", 1013, "name", "宅邸", "type", 1, "classify", 1, "kind", 1, "lv", 14, "needLv", 1, "music", 1055, "size", list(4, 4), "needMoney", 0, "needType", 1, "prosperity", 21000, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101), "canFlip", true),
    1014, map("id", 1014, "name", "宅邸", "type", 1, "classify", 1, "kind", 1, "lv", 15, "needLv", 1, "music", 1055, "size", list(4, 4), "needMoney", 0, "needType", 1, "prosperity", 24000, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101), "canFlip", true)
);
    }

    private static void init3() {
data.map(
    1015, map("id", 1015, "name", "宅邸", "type", 1, "classify", 1, "kind", 1, "lv", 16, "needLv", 1, "music", 1055, "size", list(4, 4), "needMoney", 0, "needType", 1, "prosperity", 27200, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101), "canFlip", true),
    1016, map("id", 1016, "name", "宅邸", "type", 1, "classify", 1, "kind", 1, "lv", 17, "needLv", 1, "music", 1055, "size", list(4, 4), "needMoney", 0, "needType", 1, "prosperity", 30600, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101), "canFlip", true),
    1017, map("id", 1017, "name", "宅邸", "type", 1, "classify", 1, "kind", 1, "lv", 18, "needLv", 1, "music", 1055, "size", list(4, 4), "needMoney", 0, "needType", 1, "prosperity", 34200, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101), "canFlip", true),
    1018, map("id", 1018, "name", "宅邸", "type", 1, "classify", 1, "kind", 1, "lv", 19, "needLv", 1, "music", 1055, "size", list(4, 4), "needMoney", 0, "needType", 1, "prosperity", 38000, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101), "canFlip", true),
    1019, map("id", 1019, "name", "宅邸", "type", 1, "classify", 1, "kind", 1, "lv", 20, "needLv", 1, "music", 1055, "size", list(4, 4), "needMoney", 0, "needType", 1, "prosperity", 42000, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101), "canFlip", true)
);
    }

    private static void init4() {
data.map(
    1100, map("id", 1100, "name", "鲜花房", "type", 2, "classify", 1, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 200, "maxCount", 1, "delete", false, "canBuild", true, "canMoveBuild", true, "buildFuncitonId", list(101, 131), "canFlip", true),
    1101, map("id", 1101, "name", "鲜花房", "type", 2, "classify", 1, "kind", 1, "lv", 2, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 600, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 131), "canFlip", true),
    1102, map("id", 1102, "name", "鲜花房", "type", 2, "classify", 1, "kind", 1, "lv", 3, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 1200, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 131), "canFlip", true),
    1103, map("id", 1103, "name", "鲜花房", "type", 2, "classify", 1, "kind", 1, "lv", 4, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 2000, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 131), "canFlip", true),
    1104, map("id", 1104, "name", "鲜花房", "type", 2, "classify", 1, "kind", 1, "lv", 5, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 3000, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 131), "canFlip", true)
);
    }

    private static void init5() {
data.map(
    1105, map("id", 1105, "name", "鲜花房", "type", 2, "classify", 1, "kind", 1, "lv", 6, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 4200, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 131), "canFlip", true),
    1106, map("id", 1106, "name", "鲜花房", "type", 2, "classify", 1, "kind", 1, "lv", 7, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 5600, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 131), "canFlip", true),
    1107, map("id", 1107, "name", "鲜花房", "type", 2, "classify", 1, "kind", 1, "lv", 8, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 7200, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 131), "canFlip", true),
    1108, map("id", 1108, "name", "鲜花房", "type", 2, "classify", 1, "kind", 1, "lv", 9, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 9000, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 131), "canFlip", true),
    1109, map("id", 1109, "name", "鲜花房", "type", 2, "classify", 1, "kind", 1, "lv", 10, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 11000, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 131), "canFlip", true)
);
    }

    private static void init6() {
data.map(
    1110, map("id", 1110, "name", "鲜花房", "type", 2, "classify", 1, "kind", 1, "lv", 11, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 13200, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 131), "canFlip", true),
    1111, map("id", 1111, "name", "鲜花房", "type", 2, "classify", 1, "kind", 1, "lv", 12, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 15600, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 131), "canFlip", true),
    1112, map("id", 1112, "name", "鲜花房", "type", 2, "classify", 1, "kind", 1, "lv", 13, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 18200, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 131), "canFlip", true),
    1113, map("id", 1113, "name", "鲜花房", "type", 2, "classify", 1, "kind", 1, "lv", 14, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 21000, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 131), "canFlip", true),
    1114, map("id", 1114, "name", "鲜花房", "type", 2, "classify", 1, "kind", 1, "lv", 15, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 24000, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 131), "canFlip", true)
);
    }

    private static void init7() {
data.map(
    1115, map("id", 1115, "name", "鲜花房", "type", 2, "classify", 1, "kind", 1, "lv", 16, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 27200, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 131), "canFlip", true),
    1116, map("id", 1116, "name", "鲜花房", "type", 2, "classify", 1, "kind", 1, "lv", 17, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 30600, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 131), "canFlip", true),
    1117, map("id", 1117, "name", "鲜花房", "type", 2, "classify", 1, "kind", 1, "lv", 18, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 34200, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 131), "canFlip", true),
    1118, map("id", 1118, "name", "鲜花房", "type", 2, "classify", 1, "kind", 1, "lv", 19, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 38000, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 131), "canFlip", true),
    1119, map("id", 1119, "name", "鲜花房", "type", 2, "classify", 1, "kind", 1, "lv", 20, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 42000, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 131), "canFlip", true)
);
    }

    private static void init8() {
data.map(
    1200, map("id", 1200, "name", "许愿池", "type", 3, "classify", 1, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 200, "maxCount", 1, "delete", false, "canBuild", true, "canMoveBuild", true, "buildFuncitonId", list(101, 132), "typesOfManufacturing", 1, "canFlip", true),
    1201, map("id", 1201, "name", "许愿池", "type", 3, "classify", 1, "kind", 1, "lv", 2, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 600, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 132), "typesOfManufacturing", 1, "canFlip", true),
    1202, map("id", 1202, "name", "许愿池", "type", 3, "classify", 1, "kind", 1, "lv", 3, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 1200, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 132), "typesOfManufacturing", 1, "canFlip", true),
    1203, map("id", 1203, "name", "许愿池", "type", 3, "classify", 1, "kind", 1, "lv", 4, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 2000, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 132), "typesOfManufacturing", 1, "canFlip", true),
    1204, map("id", 1204, "name", "许愿池", "type", 3, "classify", 1, "kind", 1, "lv", 5, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 3000, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 132), "typesOfManufacturing", 1, "canFlip", true)
);
    }

    private static void init9() {
data.map(
    1205, map("id", 1205, "name", "许愿池", "type", 3, "classify", 1, "kind", 1, "lv", 6, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 4200, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 132), "typesOfManufacturing", 1, "canFlip", true),
    1206, map("id", 1206, "name", "许愿池", "type", 3, "classify", 1, "kind", 1, "lv", 7, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 5600, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 132), "typesOfManufacturing", 1, "canFlip", true),
    1207, map("id", 1207, "name", "许愿池", "type", 3, "classify", 1, "kind", 1, "lv", 8, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 7200, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 132), "typesOfManufacturing", 1, "canFlip", true),
    1208, map("id", 1208, "name", "许愿池", "type", 3, "classify", 1, "kind", 1, "lv", 9, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 9000, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 132), "typesOfManufacturing", 1, "canFlip", true),
    1209, map("id", 1209, "name", "许愿池", "type", 3, "classify", 1, "kind", 1, "lv", 10, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 11000, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 132), "typesOfManufacturing", 1, "canFlip", true)
);
    }

    private static void init10() {
data.map(
    1210, map("id", 1210, "name", "许愿池", "type", 3, "classify", 1, "kind", 1, "lv", 11, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 13200, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 132), "typesOfManufacturing", 1, "canFlip", true),
    1211, map("id", 1211, "name", "许愿池", "type", 3, "classify", 1, "kind", 1, "lv", 12, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 15600, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 132), "typesOfManufacturing", 1, "canFlip", true),
    1212, map("id", 1212, "name", "许愿池", "type", 3, "classify", 1, "kind", 1, "lv", 13, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 18200, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 132), "typesOfManufacturing", 1, "canFlip", true),
    1213, map("id", 1213, "name", "许愿池", "type", 3, "classify", 1, "kind", 1, "lv", 14, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 21000, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 132), "typesOfManufacturing", 1, "canFlip", true),
    1214, map("id", 1214, "name", "许愿池", "type", 3, "classify", 1, "kind", 1, "lv", 15, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 24000, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 132), "typesOfManufacturing", 1, "canFlip", true)
);
    }

    private static void init11() {
data.map(
    1215, map("id", 1215, "name", "许愿池", "type", 3, "classify", 1, "kind", 1, "lv", 16, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 27200, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 132), "typesOfManufacturing", 1, "canFlip", true),
    1216, map("id", 1216, "name", "许愿池", "type", 3, "classify", 1, "kind", 1, "lv", 17, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 30600, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 132), "typesOfManufacturing", 1, "canFlip", true),
    1217, map("id", 1217, "name", "许愿池", "type", 3, "classify", 1, "kind", 1, "lv", 18, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 34200, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 132), "typesOfManufacturing", 1, "canFlip", true),
    1218, map("id", 1218, "name", "许愿池", "type", 3, "classify", 1, "kind", 1, "lv", 19, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 38000, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 132), "typesOfManufacturing", 1, "canFlip", true),
    1219, map("id", 1219, "name", "许愿池", "type", 3, "classify", 1, "kind", 1, "lv", 20, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 42000, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 132), "typesOfManufacturing", 1, "canFlip", true)
);
    }

    private static void init12() {
data.map(
    1300, map("id", 1300, "name", "采石场", "type", 4, "classify", 1, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 200, "maxCount", 1, "delete", false, "canBuild", true, "canMoveBuild", true, "buildFuncitonId", list(101, 129), "typesOfManufacturing", 2, "canFlip", true),
    1301, map("id", 1301, "name", "采石场", "type", 4, "classify", 1, "kind", 1, "lv", 2, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 600, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 129), "typesOfManufacturing", 2, "canFlip", true),
    1302, map("id", 1302, "name", "采石场", "type", 4, "classify", 1, "kind", 1, "lv", 3, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 1200, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 129), "typesOfManufacturing", 2, "canFlip", true),
    1303, map("id", 1303, "name", "采石场", "type", 4, "classify", 1, "kind", 1, "lv", 4, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 2000, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 129), "typesOfManufacturing", 2, "canFlip", true),
    1304, map("id", 1304, "name", "采石场", "type", 4, "classify", 1, "kind", 1, "lv", 5, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 3000, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 129), "typesOfManufacturing", 2, "canFlip", true)
);
    }

    private static void init13() {
data.map(
    1305, map("id", 1305, "name", "采石场", "type", 4, "classify", 1, "kind", 1, "lv", 6, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 4200, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 129), "typesOfManufacturing", 2, "canFlip", true),
    1306, map("id", 1306, "name", "采石场", "type", 4, "classify", 1, "kind", 1, "lv", 7, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 5600, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 129), "typesOfManufacturing", 2, "canFlip", true),
    1307, map("id", 1307, "name", "采石场", "type", 4, "classify", 1, "kind", 1, "lv", 8, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 7200, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 129), "typesOfManufacturing", 2, "canFlip", true),
    1308, map("id", 1308, "name", "采石场", "type", 4, "classify", 1, "kind", 1, "lv", 9, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 9000, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 129), "typesOfManufacturing", 2, "canFlip", true),
    1309, map("id", 1309, "name", "采石场", "type", 4, "classify", 1, "kind", 1, "lv", 10, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 11000, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 129), "typesOfManufacturing", 2, "canFlip", true)
);
    }

    private static void init14() {
data.map(
    1310, map("id", 1310, "name", "采石场", "type", 4, "classify", 1, "kind", 1, "lv", 11, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 13200, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 129), "typesOfManufacturing", 2, "canFlip", true),
    1311, map("id", 1311, "name", "采石场", "type", 4, "classify", 1, "kind", 1, "lv", 12, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 15600, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 129), "typesOfManufacturing", 2, "canFlip", true),
    1312, map("id", 1312, "name", "采石场", "type", 4, "classify", 1, "kind", 1, "lv", 13, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 18200, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 129), "typesOfManufacturing", 2, "canFlip", true),
    1313, map("id", 1313, "name", "采石场", "type", 4, "classify", 1, "kind", 1, "lv", 14, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 21000, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 129), "typesOfManufacturing", 2, "canFlip", true),
    1314, map("id", 1314, "name", "采石场", "type", 4, "classify", 1, "kind", 1, "lv", 15, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 24000, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 129), "typesOfManufacturing", 2, "canFlip", true)
);
    }

    private static void init15() {
data.map(
    1315, map("id", 1315, "name", "采石场", "type", 4, "classify", 1, "kind", 1, "lv", 16, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 27200, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 129), "typesOfManufacturing", 2, "canFlip", true),
    1316, map("id", 1316, "name", "采石场", "type", 4, "classify", 1, "kind", 1, "lv", 17, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 30600, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 129), "typesOfManufacturing", 2, "canFlip", true),
    1317, map("id", 1317, "name", "采石场", "type", 4, "classify", 1, "kind", 1, "lv", 18, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 34200, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 129), "typesOfManufacturing", 2, "canFlip", true),
    1318, map("id", 1318, "name", "采石场", "type", 4, "classify", 1, "kind", 1, "lv", 19, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 38000, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 129), "typesOfManufacturing", 2, "canFlip", true),
    1319, map("id", 1319, "name", "采石场", "type", 4, "classify", 1, "kind", 1, "lv", 20, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 42000, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 129), "typesOfManufacturing", 2, "canFlip", true)
);
    }

    private static void init16() {
data.map(
    1400, map("id", 1400, "name", "伐木场", "type", 5, "classify", 1, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 200, "maxCount", 1, "delete", false, "canBuild", true, "canMoveBuild", true, "buildFuncitonId", list(101, 130), "typesOfManufacturing", 3, "canFlip", true),
    1401, map("id", 1401, "name", "伐木场", "type", 5, "classify", 1, "kind", 1, "lv", 2, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 600, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 130), "typesOfManufacturing", 3, "canFlip", true),
    1402, map("id", 1402, "name", "伐木场", "type", 5, "classify", 1, "kind", 1, "lv", 3, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 1200, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 130), "typesOfManufacturing", 3, "canFlip", true),
    1403, map("id", 1403, "name", "伐木场", "type", 5, "classify", 1, "kind", 1, "lv", 4, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 2000, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 130), "typesOfManufacturing", 3, "canFlip", true),
    1404, map("id", 1404, "name", "伐木场", "type", 5, "classify", 1, "kind", 1, "lv", 5, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 3000, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 130), "typesOfManufacturing", 3, "canFlip", true)
);
    }

    private static void init17() {
data.map(
    1405, map("id", 1405, "name", "伐木场", "type", 5, "classify", 1, "kind", 1, "lv", 6, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 4200, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 130), "typesOfManufacturing", 3, "canFlip", true),
    1406, map("id", 1406, "name", "伐木场", "type", 5, "classify", 1, "kind", 1, "lv", 7, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 5600, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 130), "typesOfManufacturing", 3, "canFlip", true),
    1407, map("id", 1407, "name", "伐木场", "type", 5, "classify", 1, "kind", 1, "lv", 8, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 7200, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 130), "typesOfManufacturing", 3, "canFlip", true),
    1408, map("id", 1408, "name", "伐木场", "type", 5, "classify", 1, "kind", 1, "lv", 9, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 9000, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 130), "typesOfManufacturing", 3, "canFlip", true),
    1409, map("id", 1409, "name", "伐木场", "type", 5, "classify", 1, "kind", 1, "lv", 10, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 11000, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 130), "typesOfManufacturing", 3, "canFlip", true)
);
    }

    private static void init18() {
data.map(
    1410, map("id", 1410, "name", "伐木场", "type", 5, "classify", 1, "kind", 1, "lv", 11, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 13200, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 130), "typesOfManufacturing", 3, "canFlip", true),
    1411, map("id", 1411, "name", "伐木场", "type", 5, "classify", 1, "kind", 1, "lv", 12, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 15600, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 130), "typesOfManufacturing", 3, "canFlip", true),
    1412, map("id", 1412, "name", "伐木场", "type", 5, "classify", 1, "kind", 1, "lv", 13, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 18200, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 130), "typesOfManufacturing", 3, "canFlip", true),
    1413, map("id", 1413, "name", "伐木场", "type", 5, "classify", 1, "kind", 1, "lv", 14, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 21000, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 130), "typesOfManufacturing", 3, "canFlip", true),
    1414, map("id", 1414, "name", "伐木场", "type", 5, "classify", 1, "kind", 1, "lv", 15, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 24000, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 130), "typesOfManufacturing", 3, "canFlip", true)
);
    }

    private static void init19() {
data.map(
    1415, map("id", 1415, "name", "伐木场", "type", 5, "classify", 1, "kind", 1, "lv", 16, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 27200, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 130), "typesOfManufacturing", 3, "canFlip", true),
    1416, map("id", 1416, "name", "伐木场", "type", 5, "classify", 1, "kind", 1, "lv", 17, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 30600, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 130), "typesOfManufacturing", 3, "canFlip", true),
    1417, map("id", 1417, "name", "伐木场", "type", 5, "classify", 1, "kind", 1, "lv", 18, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 34200, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 130), "typesOfManufacturing", 3, "canFlip", true),
    1418, map("id", 1418, "name", "伐木场", "type", 5, "classify", 1, "kind", 1, "lv", 19, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 38000, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 130), "typesOfManufacturing", 3, "canFlip", true),
    1419, map("id", 1419, "name", "伐木场", "type", 5, "classify", 1, "kind", 1, "lv", 20, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 42000, "maxCount", 1, "delete", false, "canBuild", false, "canMoveBuild", true, "buildFuncitonId", list(101, 130), "typesOfManufacturing", 3, "canFlip", true)
);
    }

    private static void init20() {
data.map(
    1500, map("id", 1500, "name", "宠物房", "classify", 1, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(2, 2), "needMoney", 0, "needType", 1, "prosperity", 400, "maxCount", 1, "delete", false, "canBuild", true, "canMoveBuild", true, "buildFuncitonId", list(100, 101), "canFlip", true),
    1501, map("id", 1501, "name", "高级宠物房", "classify", 1, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(2, 2), "needMoney", 0, "needType", 1, "prosperity", 400, "maxCount", 1, "delete", false, "canBuild", true, "canMoveBuild", true, "buildFuncitonId", list(100, 101), "canFlip", true),
    1502, map("id", 1502, "name", "江南小铺", "classify", 1, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(2, 2), "needMoney", 0, "needType", 1, "prosperity", 800, "maxCount", 1, "delete", false, "canBuild", true, "canMoveBuild", true, "buildFuncitonId", list(100, 101), "canFlip", true),
    1503, map("id", 1503, "name", "摘星阁", "classify", 1, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 1800, "maxCount", 1, "delete", false, "canBuild", true, "canMoveBuild", true, "buildFuncitonId", list(100, 101), "canFlip", true),
    1504, map("id", 1504, "name", "太液池", "classify", 1, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(5, 5), "needMoney", 0, "needType", 1, "prosperity", 10000, "maxCount", 1, "delete", false, "canBuild", true, "canMoveBuild", true, "buildFuncitonId", list(100, 101), "canFlip", true)
);
    }

    private static void init21() {
data.map(
    2000, map("id", 2000, "name", "小路", "classify", 2, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(1, 1), "needMoney", 0, "needType", 1, "prosperity", 100, "maxCount", 100, "delete", true, "canBuild", true, "canMoveBuild", true, "buildFuncitonId", list(100, 101), "canFlip", true),
    2001, map("id", 2001, "name", "地板", "classify", 2, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(2, 2), "needMoney", 0, "needType", 1, "prosperity", 100, "maxCount", 100, "delete", true, "canBuild", true, "canMoveBuild", true, "buildFuncitonId", list(100, 101), "canFlip", true),
    2201, map("id", 2201, "name", "露天雪温泉", "classify", 2, "kind", 2, "lv", 1, "needLv", 1, "music", 1055, "size", list(2, 2), "needMoney", 0, "needType", 1, "prosperity", 400, "maxCount", 10, "delete", true, "canBuild", true, "canMoveBuild", true, "buildFuncitonId", list(100, 101), "canFlip", true),
    2202, map("id", 2202, "name", "小假山", "classify", 2, "kind", 2, "lv", 1, "needLv", 1, "music", 1055, "size", list(2, 2), "needMoney", 0, "needType", 1, "prosperity", 800, "maxCount", 10, "delete", true, "canBuild", true, "canMoveBuild", true, "buildFuncitonId", list(100, 101), "canFlip", true),
    2203, map("id", 2203, "name", "烟波里假山", "classify", 2, "kind", 2, "lv", 1, "needLv", 1, "music", 1055, "size", list(1, 1), "needMoney", 0, "needType", 1, "prosperity", 400, "maxCount", 10, "delete", true, "canBuild", true, "canMoveBuild", true, "buildFuncitonId", list(100, 101), "canFlip", true)
);
    }

    private static void init22() {
data.map(
    2204, map("id", 2204, "name", "相思桥", "classify", 2, "kind", 2, "lv", 1, "needLv", 1, "music", 1055, "size", list(2, 3), "needMoney", 0, "needType", 1, "prosperity", 2400, "maxCount", 10, "delete", true, "canBuild", true, "canMoveBuild", true, "buildFuncitonId", list(100, 101), "canFlip", true),
    2300, map("id", 2300, "name", "松树", "classify", 4, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(1, 1), "needMoney", 0, "needType", 1, "prosperity", 0, "maxCount", 999, "delete", true, "canBuild", false, "canMoveBuild", false, "canFlip", true, "barrier", 1),
    2301, map("id", 2301, "name", "松树", "classify", 4, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(1, 1), "needMoney", 0, "needType", 1, "prosperity", 0, "maxCount", 999, "delete", true, "canBuild", false, "canMoveBuild", false, "canFlip", true, "barrier", 1),
    2302, map("id", 2302, "name", "松树", "classify", 4, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(1, 1), "needMoney", 0, "needType", 1, "prosperity", 0, "maxCount", 999, "delete", true, "canBuild", false, "canMoveBuild", false, "canFlip", true, "barrier", 1),
    2303, map("id", 2303, "name", "松树", "classify", 4, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(1, 1), "needMoney", 0, "needType", 1, "prosperity", 0, "maxCount", 999, "delete", true, "canBuild", false, "canMoveBuild", false, "canFlip", true, "barrier", 1)
);
    }

    private static void init23() {
data.map(
    2304, map("id", 2304, "name", "松树", "classify", 4, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(1, 1), "needMoney", 0, "needType", 1, "prosperity", 0, "maxCount", 999, "delete", true, "canBuild", false, "canMoveBuild", false, "canFlip", true, "barrier", 1),
    2305, map("id", 2305, "name", "松树", "classify", 4, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(1, 1), "needMoney", 0, "needType", 1, "prosperity", 0, "maxCount", 999, "delete", true, "canBuild", false, "canMoveBuild", false, "canFlip", true, "barrier", 1),
    2306, map("id", 2306, "name", "小石头", "classify", 4, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(1, 1), "needMoney", 0, "needType", 1, "prosperity", 0, "maxCount", 999, "delete", true, "canBuild", false, "canMoveBuild", false, "canFlip", true, "barrier", 1),
    2307, map("id", 2307, "name", "小石头", "classify", 4, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(1, 1), "needMoney", 0, "needType", 1, "prosperity", 0, "maxCount", 999, "delete", true, "canBuild", false, "canMoveBuild", false, "canFlip", true, "barrier", 1),
    2308, map("id", 2308, "name", "摆设大石头", "classify", 4, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(2, 2), "needMoney", 0, "needType", 1, "prosperity", 0, "maxCount", 999, "delete", true, "canBuild", false, "canMoveBuild", false, "canFlip", true, "barrier", 1)
);
    }

    private static void init24() {
data.map(
    2309, map("id", 2309, "name", "摆设大石头", "classify", 4, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(2, 2), "needMoney", 0, "needType", 1, "prosperity", 0, "maxCount", 999, "delete", true, "canBuild", false, "canMoveBuild", false, "canFlip", true, "barrier", 1),
    2310, map("id", 2310, "name", "摆设大石头", "classify", 4, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(2, 2), "needMoney", 0, "needType", 1, "prosperity", 0, "maxCount", 999, "delete", true, "canBuild", false, "canMoveBuild", false, "canFlip", true, "barrier", 1),
    2311, map("id", 2311, "name", "摆设大石头", "classify", 4, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(2, 2), "needMoney", 0, "needType", 1, "prosperity", 0, "maxCount", 999, "delete", true, "canBuild", false, "canMoveBuild", false, "canFlip", true, "barrier", 1),
    2312, map("id", 2312, "name", "小石头", "classify", 4, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(1, 1), "needMoney", 0, "needType", 1, "prosperity", 0, "maxCount", 999, "delete", true, "canBuild", false, "canMoveBuild", false, "canFlip", true, "barrier", 1),
    2313, map("id", 2313, "name", "杂草", "classify", 4, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(1, 1), "needMoney", 0, "needType", 1, "prosperity", 0, "maxCount", 999, "delete", true, "canBuild", false, "canMoveBuild", false, "canFlip", true, "barrier", 1)
);
    }

    private static void init25() {
data.map(
    2314, map("id", 2314, "name", "杂草", "classify", 4, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(1, 1), "needMoney", 0, "needType", 1, "prosperity", 0, "maxCount", 999, "delete", true, "canBuild", false, "canMoveBuild", false, "canFlip", true, "barrier", 1),
    2315, map("id", 2315, "name", "杂草", "classify", 4, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(1, 1), "needMoney", 0, "needType", 1, "prosperity", 0, "maxCount", 999, "delete", true, "canBuild", false, "canMoveBuild", false, "canFlip", true, "barrier", 1),
    2316, map("id", 2316, "name", "杂草", "classify", 4, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(1, 1), "needMoney", 0, "needType", 1, "prosperity", 0, "maxCount", 999, "delete", true, "canBuild", false, "canMoveBuild", false, "canFlip", true, "barrier", 1),
    2317, map("id", 2317, "name", "杂草", "classify", 4, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(1, 1), "needMoney", 0, "needType", 1, "prosperity", 0, "maxCount", 999, "delete", true, "canBuild", false, "canMoveBuild", false, "canFlip", true, "barrier", 1),
    2318, map("id", 2318, "name", "瀑布", "classify", 4, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(5, 5), "needMoney", 0, "needType", 1, "prosperity", 0, "maxCount", 999, "delete", true, "canBuild", false, "canMoveBuild", false, "canFlip", true, "barrier", 1)
);
    }

    private static void init26() {
data.map(
    2319, map("id", 2319, "name", "蘑菇", "classify", 4, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(1, 1), "needMoney", 0, "needType", 1, "prosperity", 0, "maxCount", 999, "delete", true, "canBuild", false, "canMoveBuild", false, "canFlip", true, "barrier", 1),
    2320, map("id", 2320, "name", "2乘2障碍", "classify", 4, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(2, 2), "needMoney", 0, "needType", 1, "prosperity", 0, "maxCount", 999, "delete", true, "canBuild", false, "canMoveBuild", false, "canFlip", true, "barrier", 1),
    2321, map("id", 2321, "name", "2乘2障碍", "classify", 4, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(2, 2), "needMoney", 0, "needType", 1, "prosperity", 0, "maxCount", 999, "delete", true, "canBuild", false, "canMoveBuild", false, "canFlip", true, "barrier", 1),
    2322, map("id", 2322, "name", "2乘2障碍", "classify", 4, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(2, 2), "needMoney", 0, "needType", 1, "prosperity", 0, "maxCount", 999, "delete", true, "canBuild", false, "canMoveBuild", false, "canFlip", true, "barrier", 1),
    2323, map("id", 2323, "name", "2乘2障碍", "classify", 4, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(2, 2), "needMoney", 0, "needType", 1, "prosperity", 0, "maxCount", 999, "delete", true, "canBuild", false, "canMoveBuild", false, "canFlip", true, "barrier", 1)
);
    }

    private static void init27() {
data.map(
    2324, map("id", 2324, "name", "2乘2障碍", "classify", 4, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(2, 2), "needMoney", 0, "needType", 1, "prosperity", 0, "maxCount", 999, "delete", true, "canBuild", false, "canMoveBuild", false, "canFlip", true, "barrier", 1),
    2325, map("id", 2325, "name", "3乘3障碍", "classify", 4, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 0, "maxCount", 999, "delete", true, "canBuild", false, "canMoveBuild", false, "canFlip", true, "barrier", 1),
    2326, map("id", 2326, "name", "樱花树", "classify", 2, "kind", 3, "lv", 1, "needLv", 1, "music", 1055, "size", list(1, 1), "needMoney", 0, "needType", 1, "prosperity", 200, "maxCount", 10, "delete", true, "canBuild", true, "canMoveBuild", true, "buildFuncitonId", list(100, 101), "canFlip", true),
    2327, map("id", 2327, "name", "三春泷樱树", "classify", 2, "kind", 3, "lv", 1, "needLv", 1, "music", 1055, "size", list(2, 2), "needMoney", 0, "needType", 1, "prosperity", 400, "maxCount", 10, "delete", true, "canBuild", true, "canMoveBuild", true, "buildFuncitonId", list(100, 101), "canFlip", true),
    2328, map("id", 2328, "name", "2乘2障碍", "classify", 4, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(2, 2), "needMoney", 0, "needType", 1, "prosperity", 0, "maxCount", 999, "delete", true, "canBuild", false, "canMoveBuild", false, "canFlip", true, "barrier", 1)
);
    }

    private static void init28() {
data.map(
    2329, map("id", 2329, "name", "2乘2障碍", "classify", 4, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(2, 2), "needMoney", 0, "needType", 1, "prosperity", 0, "maxCount", 999, "delete", true, "canBuild", false, "canMoveBuild", false, "canFlip", true, "barrier", 1),
    2330, map("id", 2330, "name", "2乘2障碍", "classify", 4, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(2, 2), "needMoney", 0, "needType", 1, "prosperity", 0, "maxCount", 999, "delete", true, "canBuild", false, "canMoveBuild", false, "canFlip", true, "barrier", 1),
    2331, map("id", 2331, "name", "3乘3障碍", "classify", 4, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 0, "maxCount", 999, "delete", true, "canBuild", false, "canMoveBuild", false, "canFlip", true, "barrier", 1),
    2332, map("id", 2332, "name", "3乘3障碍", "classify", 4, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 0, "maxCount", 999, "delete", true, "canBuild", false, "canMoveBuild", false, "canFlip", true, "barrier", 1),
    2333, map("id", 2333, "name", "3乘3障碍", "classify", 4, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 0, "maxCount", 999, "delete", true, "canBuild", false, "canMoveBuild", false, "canFlip", true, "barrier", 1)
);
    }

    private static void init29() {
data.map(
    2334, map("id", 2334, "name", "3乘3障碍", "classify", 4, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 0, "maxCount", 999, "delete", true, "canBuild", false, "canMoveBuild", false, "canFlip", true, "barrier", 1),
    2335, map("id", 2335, "name", "3乘3障碍", "classify", 4, "kind", 1, "lv", 1, "needLv", 1, "music", 1055, "size", list(3, 3), "needMoney", 0, "needType", 1, "prosperity", 0, "maxCount", 999, "delete", true, "canBuild", false, "canMoveBuild", false, "canFlip", true, "barrier", 1),
    2800, map("id", 2800, "name", "棋桌", "classify", 2, "kind", 4, "lv", 1, "needLv", 1, "music", 1055, "size", list(2, 2), "needMoney", 0, "needType", 1, "prosperity", 400, "maxCount", 10, "delete", true, "canBuild", true, "canMoveBuild", true, "buildFuncitonId", list(100, 101), "canFlip", true),
    2801, map("id", 2801, "name", "石凳", "classify", 2, "kind", 4, "lv", 1, "needLv", 1, "music", 1055, "size", list(1, 1), "needMoney", 0, "needType", 1, "prosperity", 200, "maxCount", 10, "delete", true, "canBuild", true, "canMoveBuild", true, "buildFuncitonId", list(100, 101), "canFlip", true),
    2802, map("id", 2802, "name", "石灯", "classify", 2, "kind", 4, "lv", 1, "needLv", 1, "music", 1055, "size", list(1, 1), "needMoney", 0, "needType", 1, "prosperity", 200, "maxCount", 10, "delete", true, "canBuild", true, "canMoveBuild", true, "buildFuncitonId", list(100, 101), "canFlip", true)
);
    }

    private static void init30() {
data.map(
    2803, map("id", 2803, "name", "花园路灯", "classify", 2, "kind", 4, "lv", 1, "needLv", 1, "music", 1055, "size", list(1, 1), "needMoney", 0, "needType", 1, "prosperity", 400, "maxCount", 10, "delete", true, "canBuild", true, "canMoveBuild", true, "buildFuncitonId", list(100, 101), "canFlip", true),
    2804, map("id", 2804, "name", "红木塔灯", "classify", 2, "kind", 4, "lv", 1, "needLv", 1, "music", 1055, "size", list(1, 1), "needMoney", 0, "needType", 1, "prosperity", 400, "maxCount", 10, "delete", true, "canBuild", true, "canMoveBuild", true, "buildFuncitonId", list(100, 101), "canFlip", true),
    2805, map("id", 2805, "name", "长相思亭宇", "classify", 2, "kind", 4, "lv", 1, "needLv", 1, "music", 1055, "size", list(2, 2), "needMoney", 0, "needType", 1, "prosperity", 1600, "maxCount", 10, "delete", true, "canBuild", true, "canMoveBuild", true, "buildFuncitonId", list(100, 101), "canFlip", true)
);
    }

}