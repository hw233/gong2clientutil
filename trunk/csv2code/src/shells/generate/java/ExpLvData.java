package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 主角升级表.csv
 * 等级 = lv
 * 升级所需经验 = upExp
 * 仆从升级经验 = upServantExp
 * 体力上限 = energy
 * 对应上阵人数 = upCz
 * 升级引导ID = ydbz
 * 升级奖励银两 = rewardMoney
 * 升级奖励道具 = item
 * 道具数量 = num
 * 换铜钱 = vowtype
 * 换铜钱的数量 = vownum
 * 产出倍率 = vowmul
 * 倍率概率 = vowpor
 */
public class ExpLvData extends LData {
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
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    1, map("lv", 1, "upExp", 100, "upServantExp", 400, "energy", 80, "upCz", 3, "vowtype", list(10000), "vownum", list(1400), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.3f)),
    2, map("lv", 2, "upExp", 200, "upServantExp", 400, "energy", 81, "upCz", 3, "vowtype", list(10000), "vownum", list(1440), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.4f)),
    3, map("lv", 3, "upExp", 300, "upServantExp", 400, "energy", 82, "upCz", 3, "vowtype", list(10000), "vownum", list(1480), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    4, map("lv", 4, "upExp", 400, "upServantExp", 400, "energy", 83, "upCz", 3, "ydbz", 10022, "vowtype", list(10000), "vownum", list(1520), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    5, map("lv", 5, "upExp", 400, "upServantExp", 400, "energy", 84, "upCz", 3, "vowtype", list(10000), "vownum", list(1560), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f))
);
    }

    private static void init1() {
data.map(
    6, map("lv", 6, "upExp", 500, "upServantExp", 500, "energy", 85, "upCz", 3, "vowtype", list(10000), "vownum", list(1600), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    7, map("lv", 7, "upExp", 600, "upServantExp", 600, "energy", 86, "upCz", 3, "ydbz", 10010, "vowtype", list(10000), "vownum", list(1640), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    8, map("lv", 8, "upExp", 700, "upServantExp", 700, "energy", 87, "upCz", 3, "vowtype", list(10000), "vownum", list(1680), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    9, map("lv", 9, "upExp", 800, "upServantExp", 800, "energy", 88, "upCz", 3, "vowtype", list(10000), "vownum", list(1720), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    10, map("lv", 10, "upExp", 900, "upServantExp", 900, "energy", 89, "upCz", 4, "ydbz", 10009, "vowtype", list(10000), "vownum", list(1760), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f))
);
    }

    private static void init2() {
data.map(
    11, map("lv", 11, "upExp", 1000, "upServantExp", 1000, "energy", 90, "upCz", 4, "ydbz", 10025, "vowtype", list(10000), "vownum", list(1800), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    12, map("lv", 12, "upExp", 1100, "upServantExp", 1100, "energy", 91, "upCz", 4, "ydbz", 10008, "vowtype", list(10000), "vownum", list(1840), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    13, map("lv", 13, "upExp", 1300, "upServantExp", 1300, "energy", 92, "upCz", 4, "ydbz", 10012, "vowtype", list(10000), "vownum", list(1880), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    14, map("lv", 14, "upExp", 1400, "upServantExp", 1400, "energy", 93, "upCz", 4, "ydbz", 10015, "vowtype", list(10000), "vownum", list(1920), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    15, map("lv", 15, "upExp", 1600, "upServantExp", 1600, "energy", 94, "upCz", 5, "ydbz", 10026, "vowtype", list(10000), "vownum", list(1960), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f))
);
    }

    private static void init3() {
data.map(
    16, map("lv", 16, "upExp", 1800, "upServantExp", 1800, "energy", 95, "upCz", 5, "ydbz", 10023, "vowtype", list(10000), "vownum", list(2000), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    17, map("lv", 17, "upExp", 2000, "upServantExp", 2000, "energy", 96, "upCz", 5, "vowtype", list(10000), "vownum", list(2040), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    18, map("lv", 18, "upExp", 2300, "upServantExp", 2300, "energy", 97, "upCz", 5, "ydbz", 10016, "vowtype", list(10000), "vownum", list(2080), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    19, map("lv", 19, "upExp", 2500, "upServantExp", 2500, "energy", 98, "upCz", 5, "vowtype", list(10000), "vownum", list(2120), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    20, map("lv", 20, "upExp", 2700, "upServantExp", 2700, "energy", 99, "upCz", 6, "ydbz", 10017, "vowtype", list(10000), "vownum", list(2160), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f))
);
    }

    private static void init4() {
data.map(
    21, map("lv", 21, "upExp", 3000, "upServantExp", 3000, "energy", 100, "upCz", 6, "vowtype", list(10000), "vownum", list(2200), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    22, map("lv", 22, "upExp", 3300, "upServantExp", 3300, "energy", 101, "upCz", 6, "vowtype", list(10000), "vownum", list(2240), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    23, map("lv", 23, "upExp", 3600, "upServantExp", 3600, "energy", 102, "upCz", 6, "vowtype", list(10000), "vownum", list(2280), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    24, map("lv", 24, "upExp", 3900, "upServantExp", 3900, "energy", 103, "upCz", 6, "vowtype", list(10000), "vownum", list(2320), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    25, map("lv", 25, "upExp", 4200, "upServantExp", 4200, "energy", 104, "upCz", 6, "ydbz", 10018, "vowtype", list(10000), "vownum", list(2360), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f))
);
    }

    private static void init5() {
data.map(
    26, map("lv", 26, "upExp", 4600, "upServantExp", 4600, "energy", 105, "upCz", 6, "vowtype", list(10000), "vownum", list(2400), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    27, map("lv", 27, "upExp", 4900, "upServantExp", 4900, "energy", 106, "upCz", 6, "vowtype", list(10000), "vownum", list(2440), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    28, map("lv", 28, "upExp", 5300, "upServantExp", 5300, "energy", 107, "upCz", 6, "vowtype", list(10000), "vownum", list(2480), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    29, map("lv", 29, "upExp", 5600, "upServantExp", 5600, "energy", 108, "upCz", 6, "vowtype", list(10000), "vownum", list(2520), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    30, map("lv", 30, "upExp", 6000, "upServantExp", 6000, "energy", 109, "upCz", 6, "vowtype", list(10000), "vownum", list(2560), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f))
);
    }

    private static void init6() {
data.map(
    31, map("lv", 31, "upExp", 6400, "upServantExp", 6400, "energy", 110, "upCz", 6, "vowtype", list(10000), "vownum", list(2600), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    32, map("lv", 32, "upExp", 6900, "upServantExp", 6900, "energy", 111, "upCz", 6, "vowtype", list(10000), "vownum", list(2640), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    33, map("lv", 33, "upExp", 7300, "upServantExp", 7300, "energy", 112, "upCz", 6, "vowtype", list(10000), "vownum", list(2680), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    34, map("lv", 34, "upExp", 7800, "upServantExp", 7800, "energy", 113, "upCz", 6, "vowtype", list(10000), "vownum", list(2720), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    35, map("lv", 35, "upExp", 8200, "upServantExp", 8200, "energy", 114, "upCz", 6, "vowtype", list(10000), "vownum", list(2760), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f))
);
    }

    private static void init7() {
data.map(
    36, map("lv", 36, "upExp", 8700, "upServantExp", 8700, "energy", 115, "upCz", 6, "vowtype", list(10000), "vownum", list(2800), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    37, map("lv", 37, "upExp", 9200, "upServantExp", 9200, "energy", 116, "upCz", 6, "vowtype", list(10000), "vownum", list(2840), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    38, map("lv", 38, "upExp", 9700, "upServantExp", 9700, "energy", 117, "upCz", 6, "vowtype", list(10000), "vownum", list(2880), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    39, map("lv", 39, "upExp", 10200, "upServantExp", 10200, "energy", 118, "upCz", 6, "vowtype", list(10000), "vownum", list(2920), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    40, map("lv", 40, "upExp", 10800, "upServantExp", 10800, "energy", 119, "upCz", 6, "vowtype", list(10000), "vownum", list(2960), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f))
);
    }

    private static void init8() {
data.map(
    41, map("lv", 41, "upExp", 11300, "upServantExp", 11300, "energy", 120, "upCz", 6, "vowtype", list(10000), "vownum", list(3000), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    42, map("lv", 42, "upExp", 11900, "upServantExp", 11900, "energy", 121, "upCz", 6, "vowtype", list(10000), "vownum", list(3040), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    43, map("lv", 43, "upExp", 12400, "upServantExp", 12400, "energy", 122, "upCz", 6, "vowtype", list(10000), "vownum", list(3080), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    44, map("lv", 44, "upExp", 13100, "upServantExp", 13100, "energy", 123, "upCz", 6, "vowtype", list(10000), "vownum", list(3120), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    45, map("lv", 45, "upExp", 13700, "upServantExp", 13700, "energy", 124, "upCz", 6, "vowtype", list(10000), "vownum", list(3160), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f))
);
    }

    private static void init9() {
data.map(
    46, map("lv", 46, "upExp", 14300, "upServantExp", 14300, "energy", 125, "upCz", 6, "vowtype", list(10000), "vownum", list(3200), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    47, map("lv", 47, "upExp", 14900, "upServantExp", 14900, "energy", 126, "upCz", 6, "vowtype", list(10000), "vownum", list(3240), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    48, map("lv", 48, "upExp", 15500, "upServantExp", 15500, "energy", 127, "upCz", 6, "vowtype", list(10000), "vownum", list(3280), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    49, map("lv", 49, "upExp", 16200, "upServantExp", 16200, "energy", 128, "upCz", 6, "vowtype", list(10000), "vownum", list(3320), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    50, map("lv", 50, "upExp", 16900, "upServantExp", 16900, "energy", 129, "upCz", 6, "vowtype", list(10000), "vownum", list(3360), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f))
);
    }

    private static void init10() {
data.map(
    51, map("lv", 51, "upExp", 17600, "upServantExp", 17600, "energy", 130, "upCz", 6, "vowtype", list(10000), "vownum", list(3400), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    52, map("lv", 52, "upExp", 18300, "upServantExp", 18300, "energy", 131, "upCz", 6, "vowtype", list(10000), "vownum", list(3440), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    53, map("lv", 53, "upExp", 19000, "upServantExp", 19000, "energy", 132, "upCz", 6, "vowtype", list(10000), "vownum", list(3480), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    54, map("lv", 54, "upExp", 19700, "upServantExp", 19700, "energy", 133, "upCz", 6, "vowtype", list(10000), "vownum", list(3520), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    55, map("lv", 55, "upExp", 20500, "upServantExp", 20500, "energy", 134, "upCz", 6, "vowtype", list(10000), "vownum", list(3560), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f))
);
    }

    private static void init11() {
data.map(
    56, map("lv", 56, "upExp", 21200, "upServantExp", 21200, "energy", 135, "upCz", 6, "vowtype", list(10000), "vownum", list(3600), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    57, map("lv", 57, "upExp", 22000, "upServantExp", 22000, "energy", 136, "upCz", 6, "vowtype", list(10000), "vownum", list(3640), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    58, map("lv", 58, "upExp", 22800, "upServantExp", 22800, "energy", 137, "upCz", 6, "vowtype", list(10000), "vownum", list(3680), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    59, map("lv", 59, "upExp", 23600, "upServantExp", 23600, "energy", 138, "upCz", 6, "vowtype", list(10000), "vownum", list(3720), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    60, map("lv", 60, "upExp", 24400, "upServantExp", 24400, "energy", 139, "upCz", 6, "vowtype", list(10000), "vownum", list(3760), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f))
);
    }

    private static void init12() {
data.map(
    61, map("lv", 61, "upExp", 25200, "upServantExp", 25200, "energy", 140, "upCz", 6, "vowtype", list(10000), "vownum", list(3800), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    62, map("lv", 62, "upExp", 26100, "upServantExp", 26100, "energy", 141, "upCz", 6, "vowtype", list(10000), "vownum", list(3840), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    63, map("lv", 63, "upExp", 26900, "upServantExp", 26900, "energy", 142, "upCz", 6, "vowtype", list(10000), "vownum", list(3880), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    64, map("lv", 64, "upExp", 27800, "upServantExp", 27800, "energy", 143, "upCz", 6, "vowtype", list(10000), "vownum", list(3920), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    65, map("lv", 65, "upExp", 28700, "upServantExp", 28700, "energy", 144, "upCz", 6, "vowtype", list(10000), "vownum", list(3960), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f))
);
    }

    private static void init13() {
data.map(
    66, map("lv", 66, "upExp", 29600, "upServantExp", 29600, "energy", 145, "upCz", 6, "vowtype", list(10000), "vownum", list(4000), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    67, map("lv", 67, "upExp", 30500, "upServantExp", 30500, "energy", 146, "upCz", 6, "vowtype", list(10000), "vownum", list(4040), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    68, map("lv", 68, "upExp", 31400, "upServantExp", 31400, "energy", 147, "upCz", 6, "vowtype", list(10000), "vownum", list(4080), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    69, map("lv", 69, "upExp", 32400, "upServantExp", 32400, "energy", 148, "upCz", 6, "vowtype", list(10000), "vownum", list(4120), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    70, map("lv", 70, "upExp", 33400, "upServantExp", 33400, "energy", 149, "upCz", 6, "vowtype", list(10000), "vownum", list(4160), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f))
);
    }

    private static void init14() {
data.map(
    71, map("lv", 71, "upExp", 34300, "upServantExp", 34300, "energy", 150, "upCz", 6, "vowtype", list(10000), "vownum", list(4200), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    72, map("lv", 72, "upExp", 35300, "upServantExp", 35300, "energy", 151, "upCz", 6, "vowtype", list(10000), "vownum", list(4240), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    73, map("lv", 73, "upExp", 36300, "upServantExp", 36300, "energy", 152, "upCz", 6, "vowtype", list(10000), "vownum", list(4280), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    74, map("lv", 74, "upExp", 37300, "upServantExp", 37300, "energy", 153, "upCz", 6, "vowtype", list(10000), "vownum", list(4320), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    75, map("lv", 75, "upExp", 38300, "upServantExp", 38300, "energy", 154, "upCz", 6, "vowtype", list(10000), "vownum", list(4360), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f))
);
    }

    private static void init15() {
data.map(
    76, map("lv", 76, "upExp", 39400, "upServantExp", 39400, "energy", 155, "upCz", 6, "vowtype", list(10000), "vownum", list(4400), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    77, map("lv", 77, "upExp", 40400, "upServantExp", 40400, "energy", 156, "upCz", 6, "vowtype", list(10000), "vownum", list(4440), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    78, map("lv", 78, "upExp", 41500, "upServantExp", 41500, "energy", 157, "upCz", 6, "vowtype", list(10000), "vownum", list(4480), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    79, map("lv", 79, "upExp", 42600, "upServantExp", 42600, "energy", 158, "upCz", 6, "vowtype", list(10000), "vownum", list(4520), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    80, map("lv", 80, "upExp", 43700, "upServantExp", 43700, "energy", 159, "upCz", 6, "vowtype", list(10000), "vownum", list(4560), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f))
);
    }

    private static void init16() {
data.map(
    81, map("lv", 81, "upExp", 44800, "upServantExp", 44800, "energy", 160, "upCz", 6, "vowtype", list(10000), "vownum", list(4600), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    82, map("lv", 82, "upExp", 45900, "upServantExp", 45900, "energy", 161, "upCz", 6, "vowtype", list(10000), "vownum", list(4640), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    83, map("lv", 83, "upExp", 47100, "upServantExp", 47100, "energy", 162, "upCz", 6, "vowtype", list(10000), "vownum", list(4680), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    84, map("lv", 84, "upExp", 48200, "upServantExp", 48200, "energy", 163, "upCz", 6, "vowtype", list(10000), "vownum", list(4720), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    85, map("lv", 85, "upExp", 49400, "upServantExp", 49400, "energy", 164, "upCz", 6, "vowtype", list(10000), "vownum", list(4760), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f))
);
    }

    private static void init17() {
data.map(
    86, map("lv", 86, "upExp", 50600, "upServantExp", 50600, "energy", 165, "upCz", 6, "vowtype", list(10000), "vownum", list(4800), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    87, map("lv", 87, "upExp", 51800, "upServantExp", 51800, "energy", 166, "upCz", 6, "vowtype", list(10000), "vownum", list(4840), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    88, map("lv", 88, "upExp", 53000, "upServantExp", 53000, "energy", 167, "upCz", 6, "vowtype", list(10000), "vownum", list(4880), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    89, map("lv", 89, "upExp", 54200, "upServantExp", 54200, "energy", 168, "upCz", 6, "vowtype", list(10000), "vownum", list(4920), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    90, map("lv", 90, "upExp", 55500, "upServantExp", 55500, "energy", 169, "upCz", 6, "vowtype", list(10000), "vownum", list(4960), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f))
);
    }

    private static void init18() {
data.map(
    91, map("lv", 91, "upExp", 56700, "upServantExp", 56700, "energy", 170, "upCz", 6, "vowtype", list(10000), "vownum", list(5000), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    92, map("lv", 92, "upExp", 58000, "upServantExp", 58000, "energy", 171, "upCz", 6, "vowtype", list(10000), "vownum", list(5040), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    93, map("lv", 93, "upExp", 59300, "upServantExp", 59300, "energy", 172, "upCz", 6, "vowtype", list(10000), "vownum", list(5080), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    94, map("lv", 94, "upExp", 60600, "upServantExp", 60600, "energy", 173, "upCz", 6, "vowtype", list(10000), "vownum", list(5120), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    95, map("lv", 95, "upExp", 61900, "upServantExp", 61900, "energy", 174, "upCz", 6, "vowtype", list(10000), "vownum", list(5160), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f))
);
    }

    private static void init19() {
data.map(
    96, map("lv", 96, "upExp", 63200, "upServantExp", 63200, "energy", 175, "upCz", 6, "vowtype", list(10000), "vownum", list(5200), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    97, map("lv", 97, "upExp", 64500, "upServantExp", 64500, "energy", 176, "upCz", 6, "vowtype", list(10000), "vownum", list(5240), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    98, map("lv", 98, "upExp", 65900, "upServantExp", 65900, "energy", 177, "upCz", 6, "vowtype", list(10000), "vownum", list(5280), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    99, map("lv", 99, "upExp", 67300, "upServantExp", 67300, "energy", 178, "upCz", 6, "vowtype", list(10000), "vownum", list(5320), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    100, map("lv", 100, "upExp", 68600, "upServantExp", 68600, "energy", 179, "upCz", 6, "vowtype", list(10000), "vownum", list(5360), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f))
);
    }

    private static void init20() {
data.map(
    101, map("lv", 101, "upExp", 70000, "upServantExp", 70000, "energy", 180, "upCz", 6, "vowtype", list(10000), "vownum", list(5400), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    102, map("lv", 102, "upExp", 71400, "upServantExp", 71400, "energy", 181, "upCz", 6, "vowtype", list(10000), "vownum", list(5440), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    103, map("lv", 103, "upExp", 72900, "upServantExp", 72900, "energy", 182, "upCz", 6, "vowtype", list(10000), "vownum", list(5480), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    104, map("lv", 104, "upExp", 74300, "upServantExp", 74300, "energy", 183, "upCz", 6, "vowtype", list(10000), "vownum", list(5520), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    105, map("lv", 105, "upExp", 75700, "upServantExp", 75700, "energy", 184, "upCz", 6, "vowtype", list(10000), "vownum", list(5560), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f))
);
    }

    private static void init21() {
data.map(
    106, map("lv", 106, "upExp", 77200, "upServantExp", 77200, "energy", 185, "upCz", 6, "vowtype", list(10000), "vownum", list(5600), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    107, map("lv", 107, "upExp", 78700, "upServantExp", 78700, "energy", 186, "upCz", 6, "vowtype", list(10000), "vownum", list(5640), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    108, map("lv", 108, "upExp", 80200, "upServantExp", 80200, "energy", 187, "upCz", 6, "vowtype", list(10000), "vownum", list(5680), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    109, map("lv", 109, "upExp", 81700, "upServantExp", 81700, "energy", 188, "upCz", 6, "vowtype", list(10000), "vownum", list(5720), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    110, map("lv", 110, "upExp", 83200, "upServantExp", 83200, "energy", 189, "upCz", 6, "vowtype", list(10000), "vownum", list(5760), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f))
);
    }

    private static void init22() {
data.map(
    111, map("lv", 111, "upExp", 84700, "upServantExp", 84700, "energy", 190, "upCz", 6, "vowtype", list(10000), "vownum", list(5800), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    112, map("lv", 112, "upExp", 86300, "upServantExp", 86300, "energy", 191, "upCz", 6, "vowtype", list(10000), "vownum", list(5840), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    113, map("lv", 113, "upExp", 87900, "upServantExp", 87900, "energy", 192, "upCz", 6, "vowtype", list(10000), "vownum", list(5880), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    114, map("lv", 114, "upExp", 89400, "upServantExp", 89400, "energy", 193, "upCz", 6, "vowtype", list(10000), "vownum", list(5920), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    115, map("lv", 115, "upExp", 91000, "upServantExp", 91000, "energy", 194, "upCz", 6, "vowtype", list(10000), "vownum", list(5960), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f))
);
    }

    private static void init23() {
data.map(
    116, map("lv", 116, "upExp", 92600, "upServantExp", 92600, "energy", 195, "upCz", 6, "vowtype", list(10000), "vownum", list(6000), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    117, map("lv", 117, "upExp", 94300, "upServantExp", 94300, "energy", 196, "upCz", 6, "vowtype", list(10000), "vownum", list(6040), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    118, map("lv", 118, "upExp", 95900, "upServantExp", 95900, "energy", 197, "upCz", 6, "vowtype", list(10000), "vownum", list(6080), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    119, map("lv", 119, "upExp", 97500, "upServantExp", 97500, "energy", 198, "upCz", 6, "vowtype", list(10000), "vownum", list(6120), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    120, map("lv", 120, "upExp", 99200, "upServantExp", 99200, "energy", 199, "upCz", 6, "vowtype", list(10000), "vownum", list(6160), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f))
);
    }

    private static void init24() {
data.map(
    121, map("lv", 121, "upExp", 100900, "upServantExp", 100900, "energy", 200, "upCz", 6, "vowtype", list(10000), "vownum", list(6200), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    122, map("lv", 122, "upExp", 102600, "upServantExp", 102600, "energy", 201, "upCz", 6, "vowtype", list(10000), "vownum", list(6240), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    123, map("lv", 123, "upExp", 104300, "upServantExp", 104300, "energy", 202, "upCz", 6, "vowtype", list(10000), "vownum", list(6280), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    124, map("lv", 124, "upExp", 106000, "upServantExp", 106000, "energy", 203, "upCz", 6, "vowtype", list(10000), "vownum", list(6320), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    125, map("lv", 125, "upExp", 107700, "upServantExp", 107700, "energy", 204, "upCz", 6, "vowtype", list(10000), "vownum", list(6360), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f))
);
    }

    private static void init25() {
data.map(
    126, map("lv", 126, "upExp", 109500, "upServantExp", 109500, "energy", 205, "upCz", 6, "vowtype", list(10000), "vownum", list(6400), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    127, map("lv", 127, "upExp", 111200, "upServantExp", 111200, "energy", 206, "upCz", 6, "vowtype", list(10000), "vownum", list(6440), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    128, map("lv", 128, "upExp", 113000, "upServantExp", 113000, "energy", 207, "upCz", 6, "vowtype", list(10000), "vownum", list(6480), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    129, map("lv", 129, "upExp", 114800, "upServantExp", 114800, "energy", 208, "upCz", 6, "vowtype", list(10000), "vownum", list(6520), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    130, map("lv", 130, "upExp", 116600, "upServantExp", 116600, "energy", 209, "upCz", 6, "vowtype", list(10000), "vownum", list(6560), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f))
);
    }

    private static void init26() {
data.map(
    131, map("lv", 131, "upExp", 118400, "upServantExp", 118400, "energy", 210, "upCz", 6, "vowtype", list(10000), "vownum", list(6600), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    132, map("lv", 132, "upExp", 120300, "upServantExp", 120300, "energy", 211, "upCz", 6, "vowtype", list(10000), "vownum", list(6640), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    133, map("lv", 133, "upExp", 122100, "upServantExp", 122100, "energy", 212, "upCz", 6, "vowtype", list(10000), "vownum", list(6680), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    134, map("lv", 134, "upExp", 124000, "upServantExp", 124000, "energy", 213, "upCz", 6, "vowtype", list(10000), "vownum", list(6720), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    135, map("lv", 135, "upExp", 125900, "upServantExp", 125900, "energy", 214, "upCz", 6, "vowtype", list(10000), "vownum", list(6760), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f))
);
    }

    private static void init27() {
data.map(
    136, map("lv", 136, "upExp", 127700, "upServantExp", 127700, "energy", 215, "upCz", 6, "vowtype", list(10000), "vownum", list(6800), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    137, map("lv", 137, "upExp", 129700, "upServantExp", 129700, "energy", 216, "upCz", 6, "vowtype", list(10000), "vownum", list(6840), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    138, map("lv", 138, "upExp", 131600, "upServantExp", 131600, "energy", 217, "upCz", 6, "vowtype", list(10000), "vownum", list(6880), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    139, map("lv", 139, "upExp", 133500, "upServantExp", 133500, "energy", 218, "upCz", 6, "vowtype", list(10000), "vownum", list(6920), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    140, map("lv", 140, "upExp", 135400, "upServantExp", 135400, "energy", 219, "upCz", 6, "vowtype", list(10000), "vownum", list(6960), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f))
);
    }

    private static void init28() {
data.map(
    141, map("lv", 141, "upExp", 137400, "upServantExp", 137400, "energy", 220, "upCz", 6, "vowtype", list(10000), "vownum", list(7000), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    142, map("lv", 142, "upExp", 139400, "upServantExp", 139400, "energy", 221, "upCz", 6, "vowtype", list(10000), "vownum", list(7040), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    143, map("lv", 143, "upExp", 141300, "upServantExp", 141300, "energy", 222, "upCz", 6, "vowtype", list(10000), "vownum", list(7080), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    144, map("lv", 144, "upExp", 143300, "upServantExp", 143300, "energy", 223, "upCz", 6, "vowtype", list(10000), "vownum", list(7120), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    145, map("lv", 145, "upExp", 145400, "upServantExp", 145400, "energy", 224, "upCz", 6, "vowtype", list(10000), "vownum", list(7160), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f))
);
    }

    private static void init29() {
data.map(
    146, map("lv", 146, "upExp", 147400, "upServantExp", 147400, "energy", 225, "upCz", 6, "vowtype", list(10000), "vownum", list(7200), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    147, map("lv", 147, "upExp", 149400, "upServantExp", 149400, "energy", 226, "upCz", 6, "vowtype", list(10000), "vownum", list(7240), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    148, map("lv", 148, "upExp", 151500, "upServantExp", 151500, "energy", 227, "upCz", 6, "vowtype", list(10000), "vownum", list(7280), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    149, map("lv", 149, "upExp", 153600, "upServantExp", 153600, "energy", 228, "upCz", 6, "vowtype", list(10000), "vownum", list(7320), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f)),
    150, map("lv", 150, "upExp", 155600, "upServantExp", 155600, "energy", 229, "upCz", 6, "vowtype", list(10000), "vownum", list(7360), "vowmul", list(list(1, 3), list(4, 8), list(8, 10)), "vowpor", list(0.5f, 0.4f, 0.5f))
);
    }

}