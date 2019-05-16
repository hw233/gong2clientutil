package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 仆从进阶表.csv
 * id = id
 * 仆从编号 = servant
 * 进阶等级 = lv
 * 进阶属性类型 = propkind
 * 进阶属性值 = propnum
 * 进阶解锁属性类型 = propunlock
 * 进阶解锁属性值 = propunlocknum
 * 进阶所需道具类型 = item
 * 进阶所需道具值 = itemnum
 * 进阶消耗碎片数量 = piecenum
 * 进阶等级条件 = lvcondition
 * 副职业ID = joblv
 * 进阶描述 = servantShow
 */
public class ServantAdvanceData extends LData {
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
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    1, map("id", 1, "servant", 1000, "lv", 1, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(462, 335, 335, 841), "propunlock", list(10056, 10057, 10058, 10055), "propunlocknum", list(0.003f, 0.003f, 0, 0), "item", list(12004), "itemnum", list(100), "lvcondition", 1, "joblv", 1, "servantShow", "【进阶1】物理，法术防御+0.3%"),
    2, map("id", 2, "servant", 1000, "lv", 2, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(910, 660, 660, 1657), "propunlock", list(10056, 10057, 10058, 10055), "propunlocknum", list(0.003f, 0.003f, 0.008f, 0), "item", list(12004), "itemnum", list(300), "lvcondition", 9, "joblv", 2, "servantShow", "【进阶2】生命值+0.8%"),
    3, map("id", 3, "servant", 1000, "lv", 3, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1375, 997, 997, 2505), "propunlock", list(10056, 10057, 10058, 10055), "propunlocknum", list(0.003f, 0.003f, 0.008f, 0.005f), "item", list(12004), "itemnum", list(800), "lvcondition", 18, "joblv", 3, "servantShow", "【进阶3】攻击力+0.5%"),
    4, map("id", 4, "servant", 1000, "lv", 4, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1857, 1346, 1346, 3382), "propunlock", list(10056, 10057, 10058, 10055), "propunlocknum", list(0.008f, 0.008f, 0.008f, 0.005f), "item", list(12004), "itemnum", list(1800), "lvcondition", 27, "joblv", 4, "servantShow", "【进阶4】物理，法术防御+0.5%"),
    5, map("id", 5, "servant", 1000, "lv", 5, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2354, 1707, 1707, 4288), "propunlock", list(10056, 10057, 10058, 10055), "propunlocknum", list(0.008f, 0.008f, 0.018f, 0.005f), "item", list(12004), "itemnum", list(3800), "lvcondition", 36, "joblv", 5, "servantShow", "【进阶5】生命值+1%")
);
    }

    private static void init1() {
data.map(
    6, map("id", 6, "servant", 1000, "lv", 6, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2867, 2080, 2080, 5222), "propunlock", list(10056, 10057, 10058, 10055), "propunlocknum", list(0.008f, 0.008f, 0.018f, 0.013f), "item", list(12004), "itemnum", list(6800), "lvcondition", 45, "joblv", 6, "servantShow", "【进阶6】攻击力+0.8%"),
    7, map("id", 7, "servant", 1000, "lv", 7, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3395, 2463, 2463, 6185), "propunlock", list(10056, 10057, 10058, 10055), "propunlocknum", list(0.015f, 0.015f, 0.018f, 0.013f), "item", list(12004), "itemnum", list(11800), "lvcondition", 1, "joblv", 1, "servantShow", "【进阶7】物理，法术防御+0.7%"),
    8, map("id", 8, "servant", 1000, "lv", 8, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3938, 2857, 2857, 7174), "propunlock", list(10056, 10057, 10058, 10055), "propunlocknum", list(0.015f, 0.015f, 0.03f, 0.013f), "item", list(12004), "itemnum", list(19800), "lvcondition", 9, "joblv", 2, "servantShow", "【进阶8】生命值+1.2%"),
    9, map("id", 9, "servant", 1000, "lv", 9, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(4495, 3261, 3261, 8189), "propunlock", list(10056, 10057, 10058, 10055), "propunlocknum", list(0.015f, 0.015f, 0.03f, 0.023f), "item", list(12004), "itemnum", list(31800), "lvcondition", 18, "joblv", 3, "servantShow", "【进阶9】攻击力+1%"),
    10, map("id", 10, "servant", 1000, "lv", 10, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(5066, 3675, 3675, 9229), "propunlock", list(10056, 10057, 10058, 10055), "propunlocknum", list(0.025f, 0.025f, 0.03f, 0.023f), "item", list(12004), "itemnum", list(47800), "lvcondition", 27, "joblv", 4, "servantShow", "【进阶10】物理，法术防御+1%")
);
    }

    private static void init2() {
data.map(
    11, map("id", 11, "servant", 1000, "lv", 11, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(5650, 4099, 4099, 10294), "propunlock", list(10056, 10057, 10058, 10055), "propunlocknum", list(0.025f, 0.025f, 0.045f, 0.023f), "item", list(12004), "itemnum", list(67800), "lvcondition", 36, "joblv", 5, "servantShow", "【进阶11】生命值+1.5%"),
    12, map("id", 12, "servant", 1000, "lv", 12, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(6247, 4532, 4532, 11382), "propunlock", list(10056, 10057, 10058, 10055), "propunlocknum", list(0.025f, 0.025f, 0.045f, 0.035f), "item", list(12004), "itemnum", list(91800), "lvcondition", 45, "joblv", 6, "servantShow", "【进阶12】攻击力+1.2%"),
    13, map("id", 13, "servant", 1001, "lv", 1, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(462, 335, 335, 841), "propunlock", list(10056, 10057, 10058, 10055), "propunlocknum", list(0.003f, 0.003f, 0, 0), "item", list(12004), "itemnum", list(100), "lvcondition", 1, "joblv", 1, "servantShow", "【进阶1】物理，法术防御+0.3%"),
    14, map("id", 14, "servant", 1001, "lv", 2, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(910, 660, 660, 1657), "propunlock", list(10056, 10057, 10058, 10055), "propunlocknum", list(0.003f, 0.003f, 0.008f, 0), "item", list(12004), "itemnum", list(300), "lvcondition", 9, "joblv", 2, "servantShow", "【进阶2】生命值+0.8%"),
    15, map("id", 15, "servant", 1001, "lv", 3, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1375, 997, 997, 2505), "propunlock", list(10056, 10057, 10058, 10055), "propunlocknum", list(0.003f, 0.003f, 0.008f, 0.005f), "item", list(12004), "itemnum", list(800), "lvcondition", 18, "joblv", 3, "servantShow", "【进阶3】攻击力+0.5%")
);
    }

    private static void init3() {
data.map(
    16, map("id", 16, "servant", 1001, "lv", 4, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1857, 1346, 1346, 3382), "propunlock", list(10056, 10057, 10058, 10055), "propunlocknum", list(0.008f, 0.008f, 0.008f, 0.005f), "item", list(12004), "itemnum", list(1800), "lvcondition", 27, "joblv", 4, "servantShow", "【进阶4】物理，法术防御+0.5%"),
    17, map("id", 17, "servant", 1001, "lv", 5, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2354, 1707, 1707, 4288), "propunlock", list(10056, 10057, 10058, 10055), "propunlocknum", list(0.008f, 0.008f, 0.018f, 0.005f), "item", list(12004), "itemnum", list(3800), "lvcondition", 36, "joblv", 5, "servantShow", "【进阶5】生命值+1%"),
    18, map("id", 18, "servant", 1001, "lv", 6, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2867, 2080, 2080, 5222), "propunlock", list(10056, 10057, 10058, 10055), "propunlocknum", list(0.008f, 0.008f, 0.018f, 0.013f), "item", list(12004), "itemnum", list(6800), "lvcondition", 45, "joblv", 6, "servantShow", "【进阶6】攻击力+0.8%"),
    19, map("id", 19, "servant", 1001, "lv", 7, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3395, 2463, 2463, 6185), "propunlock", list(10056, 10057, 10058, 10055), "propunlocknum", list(0.015f, 0.015f, 0.018f, 0.013f), "item", list(12004), "itemnum", list(11800), "lvcondition", 1, "joblv", 1, "servantShow", "【进阶7】物理，法术防御+0.7%"),
    20, map("id", 20, "servant", 1001, "lv", 8, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3938, 2857, 2857, 7174), "propunlock", list(10056, 10057, 10058, 10055), "propunlocknum", list(0.015f, 0.015f, 0.03f, 0.013f), "item", list(12004), "itemnum", list(19800), "lvcondition", 9, "joblv", 2, "servantShow", "【进阶8】生命值+1.2%")
);
    }

    private static void init4() {
data.map(
    21, map("id", 21, "servant", 1001, "lv", 9, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(4495, 3261, 3261, 8189), "propunlock", list(10056, 10057, 10058, 10055), "propunlocknum", list(0.015f, 0.015f, 0.03f, 0.023f), "item", list(12004), "itemnum", list(31800), "lvcondition", 18, "joblv", 3, "servantShow", "【进阶9】攻击力+1%"),
    22, map("id", 22, "servant", 1001, "lv", 10, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(5066, 3675, 3675, 9229), "propunlock", list(10056, 10057, 10058, 10055), "propunlocknum", list(0.025f, 0.025f, 0.03f, 0.023f), "item", list(12004), "itemnum", list(47800), "lvcondition", 27, "joblv", 4, "servantShow", "【进阶10】物理，法术防御+1%"),
    23, map("id", 23, "servant", 1001, "lv", 11, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(5650, 4099, 4099, 10294), "propunlock", list(10056, 10057, 10058, 10055), "propunlocknum", list(0.025f, 0.025f, 0.045f, 0.023f), "item", list(12004), "itemnum", list(67800), "lvcondition", 36, "joblv", 5, "servantShow", "【进阶11】生命值+1.5%"),
    24, map("id", 24, "servant", 1001, "lv", 12, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(6247, 4532, 4532, 11382), "propunlock", list(10056, 10057, 10058, 10055), "propunlocknum", list(0.025f, 0.025f, 0.045f, 0.035f), "item", list(12004), "itemnum", list(91800), "lvcondition", 45, "joblv", 6, "servantShow", "【进阶12】攻击力+1.2%"),
    25, map("id", 25, "servant", 40000, "lv", 1, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(476, 345, 345, 867), "item", list(12004), "itemnum", list(100), "piecenum", 0, "lvcondition", 1, "joblv", 2, "servantShow", "【进阶1】伐木效率+12%")
);
    }

    private static void init5() {
data.map(
    26, map("id", 26, "servant", 40000, "lv", 2, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(952, 690, 690, 1734), "item", list(12004), "itemnum", list(300), "piecenum", 0, "lvcondition", 9, "joblv", 3, "servantShow", "【进阶2】伐木效率+20%"),
    27, map("id", 27, "servant", 40000, "lv", 3, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1460, 1058, 1058, 2659), "item", list(12004), "itemnum", list(800), "piecenum", 20, "lvcondition", 18, "joblv", 4, "servantShow", "【进阶3】伐木效率+28%"),
    28, map("id", 28, "servant", 40000, "lv", 4, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1999, 1449, 1449, 3641), "item", list(12004), "itemnum", list(1800), "piecenum", 40, "lvcondition", 27, "joblv", 5, "servantShow", "【进阶4】伐木效率+36%"),
    29, map("id", 29, "servant", 40000, "lv", 5, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2569, 1863, 1863, 4680), "item", list(12004), "itemnum", list(3800), "piecenum", 60, "lvcondition", 36, "joblv", 6, "servantShow", "【进阶5】伐木效率+44%"),
    30, map("id", 30, "servant", 40000, "lv", 6, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3171, 2300, 2300, 5776), "item", list(12004), "itemnum", list(6800), "piecenum", 100, "lvcondition", 45, "joblv", 7, "servantShow", "【进阶6】伐木效率+52%")
);
    }

    private static void init6() {
data.map(
    31, map("id", 31, "servant", 40000, "lv", 7, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3804, 2759, 2759, 6930), "item", list(12004), "itemnum", list(11800), "piecenum", 140, "lvcondition", 1, "joblv", 8, "servantShow", "【进阶7】伐木效率+60%"),
    32, map("id", 32, "servant", 40000, "lv", 8, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(4469, 3241, 3241, 8141), "item", list(12004), "itemnum", list(19800), "piecenum", 180, "lvcondition", 9, "joblv", 9, "servantShow", "【进阶8】伐木效率+68%"),
    33, map("id", 33, "servant", 40000, "lv", 9, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(5165, 3746, 3746, 9409), "item", list(12004), "itemnum", list(31800), "piecenum", 220, "lvcondition", 18, "joblv", 10, "servantShow", "【进阶9】伐木效率+76%"),
    34, map("id", 34, "servant", 40000, "lv", 10, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(5893, 4274, 4274, 10734), "item", list(12004), "itemnum", list(47800), "piecenum", 260, "lvcondition", 27, "joblv", 11, "servantShow", "【进阶10】伐木效率+84%"),
    35, map("id", 35, "servant", 40000, "lv", 11, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(6652, 4825, 4825, 12117), "item", list(12004), "itemnum", list(67800), "piecenum", 300, "lvcondition", 36, "joblv", 12, "servantShow", "【进阶11】伐木效率+92%")
);
    }

    private static void init7() {
data.map(
    36, map("id", 36, "servant", 40000, "lv", 12, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(7442, 5398, 5398, 13557), "item", list(12004), "itemnum", list(91800), "piecenum", 360, "lvcondition", 45, "joblv", 13, "servantShow", "【进阶12】伐木效率+100%"),
    37, map("id", 37, "servant", 40001, "lv", 1, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(476, 345, 345, 867), "item", list(12004), "itemnum", list(100), "piecenum", 0, "lvcondition", 1, "joblv", 15, "servantShow", "【进阶1】裁缝效率+12%"),
    38, map("id", 38, "servant", 40001, "lv", 2, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(952, 690, 690, 1734), "item", list(12004), "itemnum", list(300), "piecenum", 0, "lvcondition", 9, "joblv", 16, "servantShow", "【进阶2】裁缝效率+20%"),
    39, map("id", 39, "servant", 40001, "lv", 3, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1460, 1058, 1058, 2659), "item", list(12004), "itemnum", list(800), "piecenum", 20, "lvcondition", 18, "joblv", 17, "servantShow", "【进阶3】裁缝效率+28%"),
    40, map("id", 40, "servant", 40001, "lv", 4, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1999, 1449, 1449, 3641), "item", list(12004), "itemnum", list(1800), "piecenum", 40, "lvcondition", 27, "joblv", 18, "servantShow", "【进阶4】裁缝效率+36%")
);
    }

    private static void init8() {
data.map(
    41, map("id", 41, "servant", 40001, "lv", 5, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2569, 1863, 1863, 4680), "item", list(12004), "itemnum", list(3800), "piecenum", 60, "lvcondition", 36, "joblv", 19, "servantShow", "【进阶5】裁缝效率+44%"),
    42, map("id", 42, "servant", 40001, "lv", 6, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3171, 2300, 2300, 5776), "item", list(12004), "itemnum", list(6800), "piecenum", 100, "lvcondition", 45, "joblv", 20, "servantShow", "【进阶6】裁缝效率+52%"),
    43, map("id", 43, "servant", 40001, "lv", 7, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3804, 2759, 2759, 6930), "item", list(12004), "itemnum", list(11800), "piecenum", 140, "lvcondition", 1, "joblv", 21, "servantShow", "【进阶7】裁缝效率+60%"),
    44, map("id", 44, "servant", 40001, "lv", 8, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(4469, 3241, 3241, 8141), "item", list(12004), "itemnum", list(19800), "piecenum", 180, "lvcondition", 9, "joblv", 22, "servantShow", "【进阶8】裁缝效率+68%"),
    45, map("id", 45, "servant", 40001, "lv", 9, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(5165, 3746, 3746, 9409), "item", list(12004), "itemnum", list(31800), "piecenum", 220, "lvcondition", 18, "joblv", 23, "servantShow", "【进阶9】裁缝效率+76%")
);
    }

    private static void init9() {
data.map(
    46, map("id", 46, "servant", 40001, "lv", 10, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(5893, 4274, 4274, 10734), "item", list(12004), "itemnum", list(47800), "piecenum", 260, "lvcondition", 27, "joblv", 24, "servantShow", "【进阶10】裁缝效率+84%"),
    47, map("id", 47, "servant", 40001, "lv", 11, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(6652, 4825, 4825, 12117), "item", list(12004), "itemnum", list(67800), "piecenum", 300, "lvcondition", 36, "joblv", 25, "servantShow", "【进阶11】裁缝效率+92%"),
    48, map("id", 48, "servant", 40001, "lv", 12, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(7442, 5398, 5398, 13557), "item", list(12004), "itemnum", list(91800), "piecenum", 360, "lvcondition", 45, "joblv", 26, "servantShow", "【进阶12】裁缝效率+100%"),
    49, map("id", 49, "servant", 40002, "lv", 1, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(476, 345, 345, 867), "item", list(12004), "itemnum", list(100), "piecenum", 0, "lvcondition", 1, "joblv", 28, "servantShow", "【进阶1】诗人效率+12%"),
    50, map("id", 50, "servant", 40002, "lv", 2, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(952, 690, 690, 1734), "item", list(12004), "itemnum", list(300), "piecenum", 0, "lvcondition", 9, "joblv", 29, "servantShow", "【进阶2】诗人效率+20%")
);
    }

    private static void init10() {
data.map(
    51, map("id", 51, "servant", 40002, "lv", 3, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(984, 713, 713, 1792), "item", list(12004), "itemnum", list(800), "piecenum", 20, "lvcondition", 18, "joblv", 30, "servantShow", "【进阶3】诗人效率+28%"),
    52, map("id", 52, "servant", 40002, "lv", 4, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1015, 736, 736, 1849), "item", list(12004), "itemnum", list(1800), "piecenum", 40, "lvcondition", 27, "joblv", 31, "servantShow", "【进阶4】诗人效率+36%"),
    53, map("id", 53, "servant", 40002, "lv", 5, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1046, 759, 759, 1906), "item", list(12004), "itemnum", list(3800), "piecenum", 60, "lvcondition", 36, "joblv", 32, "servantShow", "【进阶5】诗人效率+44%"),
    54, map("id", 54, "servant", 40002, "lv", 6, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1078, 782, 782, 1963), "item", list(12004), "itemnum", list(6800), "piecenum", 100, "lvcondition", 45, "joblv", 33, "servantShow", "【进阶6】诗人效率+52%"),
    55, map("id", 55, "servant", 40002, "lv", 7, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1109, 804, 804, 2021), "item", list(12004), "itemnum", list(11800), "piecenum", 140, "lvcondition", 1, "joblv", 34, "servantShow", "【进阶7】诗人效率+60%")
);
    }

    private static void init11() {
data.map(
    56, map("id", 56, "servant", 40002, "lv", 8, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1141, 827, 827, 2078), "item", list(12004), "itemnum", list(19800), "piecenum", 180, "lvcondition", 9, "joblv", 35, "servantShow", "【进阶8】诗人效率+68%"),
    57, map("id", 57, "servant", 40002, "lv", 9, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1172, 850, 850, 2135), "item", list(12004), "itemnum", list(31800), "piecenum", 220, "lvcondition", 18, "joblv", 36, "servantShow", "【进阶9】诗人效率+76%"),
    58, map("id", 58, "servant", 40002, "lv", 10, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1204, 873, 873, 2192), "item", list(12004), "itemnum", list(47800), "piecenum", 260, "lvcondition", 27, "joblv", 37, "servantShow", "【进阶10】诗人效率+84%"),
    59, map("id", 59, "servant", 40002, "lv", 11, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1235, 896, 896, 2250), "item", list(12004), "itemnum", list(67800), "piecenum", 300, "lvcondition", 36, "joblv", 38, "servantShow", "【进阶11】诗人效率+92%"),
    60, map("id", 60, "servant", 40002, "lv", 12, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1266, 918, 918, 2307), "item", list(12004), "itemnum", list(91800), "piecenum", 360, "lvcondition", 45, "joblv", 39, "servantShow", "【进阶12】诗人效率+100%")
);
    }

    private static void init12() {
data.map(
    61, map("id", 61, "servant", 40003, "lv", 1, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(631, 221, 221, 9458), "item", list(12004), "itemnum", list(100), "piecenum", 0, "lvcondition", 1, "joblv", 2, "servantShow", "【进阶1】伐木效率+12%"),
    62, map("id", 62, "servant", 40003, "lv", 2, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1243, 436, 436, 18632), "item", list(12004), "itemnum", list(300), "piecenum", 0, "lvcondition", 9, "joblv", 3, "servantShow", "【进阶2】伐木效率+20%"),
    63, map("id", 63, "servant", 40003, "lv", 3, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1836, 644, 644, 27531), "item", list(12004), "itemnum", list(800), "piecenum", 20, "lvcondition", 18, "joblv", 4, "servantShow", "【进阶3】伐木效率+28%"),
    64, map("id", 64, "servant", 40003, "lv", 4, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2411, 846, 846, 36163), "item", list(12004), "itemnum", list(1800), "piecenum", 40, "lvcondition", 27, "joblv", 5, "servantShow", "【进阶4】伐木效率+36%"),
    65, map("id", 65, "servant", 40003, "lv", 5, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2969, 1042, 1042, 44536), "item", list(12004), "itemnum", list(3800), "piecenum", 60, "lvcondition", 36, "joblv", 6, "servantShow", "【进阶5】伐木效率+44%")
);
    }

    private static void init13() {
data.map(
    66, map("id", 66, "servant", 40003, "lv", 6, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3510, 1232, 1232, 52657), "item", list(12004), "itemnum", list(6800), "piecenum", 100, "lvcondition", 45, "joblv", 7, "servantShow", "【进阶6】伐木效率+52%"),
    67, map("id", 67, "servant", 40003, "lv", 7, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(631, 221, 221, 9458), "item", list(12004), "itemnum", list(11800), "piecenum", 140, "lvcondition", 1, "joblv", 8, "servantShow", "【进阶7】伐木效率+60%"),
    68, map("id", 68, "servant", 40003, "lv", 8, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1243, 436, 436, 18632), "item", list(12004), "itemnum", list(19800), "piecenum", 180, "lvcondition", 9, "joblv", 9, "servantShow", "【进阶8】伐木效率+68%"),
    69, map("id", 69, "servant", 40003, "lv", 9, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1836, 644, 644, 27531), "item", list(12004), "itemnum", list(31800), "piecenum", 220, "lvcondition", 18, "joblv", 10, "servantShow", "【进阶9】伐木效率+76%"),
    70, map("id", 70, "servant", 40003, "lv", 10, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2411, 846, 846, 36163), "item", list(12004), "itemnum", list(47800), "piecenum", 260, "lvcondition", 27, "joblv", 11, "servantShow", "【进阶10】伐木效率+84%")
);
    }

    private static void init14() {
data.map(
    71, map("id", 71, "servant", 40003, "lv", 11, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2969, 1042, 1042, 44536), "item", list(12004), "itemnum", list(67800), "piecenum", 300, "lvcondition", 36, "joblv", 12, "servantShow", "【进阶11】伐木效率+92%"),
    72, map("id", 72, "servant", 40003, "lv", 12, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3510, 1232, 1232, 52657), "item", list(12004), "itemnum", list(91800), "piecenum", 360, "lvcondition", 45, "joblv", 13, "servantShow", "【进阶12】伐木效率+100%"),
    73, map("id", 73, "servant", 40004, "lv", 1, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(476, 345, 345, 867), "item", list(12004), "itemnum", list(100), "piecenum", 0, "lvcondition", 1, "joblv", 15, "servantShow", "【进阶1】裁缝效率+12%"),
    74, map("id", 74, "servant", 40004, "lv", 2, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(952, 690, 690, 1734), "item", list(12004), "itemnum", list(300), "piecenum", 0, "lvcondition", 9, "joblv", 16, "servantShow", "【进阶2】裁缝效率+20%"),
    75, map("id", 75, "servant", 40004, "lv", 3, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1460, 1058, 1058, 2659), "item", list(12004), "itemnum", list(800), "piecenum", 20, "lvcondition", 18, "joblv", 17, "servantShow", "【进阶3】裁缝效率+28%")
);
    }

    private static void init15() {
data.map(
    76, map("id", 76, "servant", 40004, "lv", 4, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1999, 1449, 1449, 3641), "item", list(12004), "itemnum", list(1800), "piecenum", 40, "lvcondition", 27, "joblv", 18, "servantShow", "【进阶4】裁缝效率+36%"),
    77, map("id", 77, "servant", 40004, "lv", 5, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2569, 1863, 1863, 4680), "item", list(12004), "itemnum", list(3800), "piecenum", 60, "lvcondition", 36, "joblv", 19, "servantShow", "【进阶5】裁缝效率+44%"),
    78, map("id", 78, "servant", 40004, "lv", 6, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3171, 2300, 2300, 5776), "item", list(12004), "itemnum", list(6800), "piecenum", 100, "lvcondition", 45, "joblv", 20, "servantShow", "【进阶6】裁缝效率+52%"),
    79, map("id", 79, "servant", 40004, "lv", 7, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3804, 2759, 2759, 6930), "item", list(12004), "itemnum", list(11800), "piecenum", 140, "lvcondition", 1, "joblv", 21, "servantShow", "【进阶7】裁缝效率+60%"),
    80, map("id", 80, "servant", 40004, "lv", 8, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(4469, 3241, 3241, 8141), "item", list(12004), "itemnum", list(19800), "piecenum", 180, "lvcondition", 9, "joblv", 22, "servantShow", "【进阶8】裁缝效率+68%")
);
    }

    private static void init16() {
data.map(
    81, map("id", 81, "servant", 40004, "lv", 9, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(5165, 3746, 3746, 9409), "item", list(12004), "itemnum", list(31800), "piecenum", 220, "lvcondition", 18, "joblv", 23, "servantShow", "【进阶9】裁缝效率+76%"),
    82, map("id", 82, "servant", 40004, "lv", 10, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(5893, 4274, 4274, 10734), "item", list(12004), "itemnum", list(47800), "piecenum", 260, "lvcondition", 27, "joblv", 24, "servantShow", "【进阶10】裁缝效率+84%"),
    83, map("id", 83, "servant", 40004, "lv", 11, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(6652, 4825, 4825, 12117), "item", list(12004), "itemnum", list(67800), "piecenum", 300, "lvcondition", 36, "joblv", 25, "servantShow", "【进阶11】裁缝效率+92%"),
    84, map("id", 84, "servant", 40004, "lv", 12, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(7442, 5398, 5398, 13557), "item", list(12004), "itemnum", list(91800), "piecenum", 360, "lvcondition", 45, "joblv", 26, "servantShow", "【进阶12】裁缝效率+100%"),
    85, map("id", 85, "servant", 40005, "lv", 1, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(462, 335, 335, 841), "item", list(12004), "itemnum", list(100), "piecenum", 0, "lvcondition", 1, "joblv", 28, "servantShow", "【进阶1】诗人效率+12%")
);
    }

    private static void init17() {
data.map(
    86, map("id", 86, "servant", 40005, "lv", 2, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(910, 660, 660, 1657), "item", list(12004), "itemnum", list(300), "piecenum", 0, "lvcondition", 9, "joblv", 29, "servantShow", "【进阶2】诗人效率+20%"),
    87, map("id", 87, "servant", 40005, "lv", 3, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1375, 997, 997, 2505), "item", list(12004), "itemnum", list(800), "piecenum", 20, "lvcondition", 18, "joblv", 30, "servantShow", "【进阶3】诗人效率+28%"),
    88, map("id", 88, "servant", 40005, "lv", 4, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1857, 1346, 1346, 3382), "item", list(12004), "itemnum", list(1800), "piecenum", 40, "lvcondition", 27, "joblv", 31, "servantShow", "【进阶4】诗人效率+36%"),
    89, map("id", 89, "servant", 40005, "lv", 5, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2354, 1707, 1707, 4288), "item", list(12004), "itemnum", list(3800), "piecenum", 60, "lvcondition", 36, "joblv", 32, "servantShow", "【进阶5】诗人效率+44%"),
    90, map("id", 90, "servant", 40005, "lv", 6, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2867, 2080, 2080, 5222), "item", list(12004), "itemnum", list(6800), "piecenum", 100, "lvcondition", 45, "joblv", 33, "servantShow", "【进阶6】诗人效率+52%")
);
    }

    private static void init18() {
data.map(
    91, map("id", 91, "servant", 40005, "lv", 7, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3395, 2463, 2463, 6185), "item", list(12004), "itemnum", list(11800), "piecenum", 140, "lvcondition", 1, "joblv", 34, "servantShow", "【进阶7】诗人效率+60%"),
    92, map("id", 92, "servant", 40005, "lv", 8, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3938, 2857, 2857, 7174), "item", list(12004), "itemnum", list(19800), "piecenum", 180, "lvcondition", 9, "joblv", 35, "servantShow", "【进阶8】诗人效率+68%"),
    93, map("id", 93, "servant", 40005, "lv", 9, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(4495, 3261, 3261, 8189), "item", list(12004), "itemnum", list(31800), "piecenum", 220, "lvcondition", 18, "joblv", 36, "servantShow", "【进阶9】诗人效率+76%"),
    94, map("id", 94, "servant", 40005, "lv", 10, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(5066, 3675, 3675, 9229), "item", list(12004), "itemnum", list(47800), "piecenum", 260, "lvcondition", 27, "joblv", 37, "servantShow", "【进阶10】诗人效率+84%"),
    95, map("id", 95, "servant", 40005, "lv", 11, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(5650, 4099, 4099, 10294), "item", list(12004), "itemnum", list(67800), "piecenum", 300, "lvcondition", 36, "joblv", 38, "servantShow", "【进阶11】诗人效率+92%")
);
    }

    private static void init19() {
data.map(
    96, map("id", 96, "servant", 40005, "lv", 12, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(6247, 4532, 4532, 11382), "item", list(12004), "itemnum", list(91800), "piecenum", 360, "lvcondition", 45, "joblv", 39, "servantShow", "【进阶12】诗人效率+100%"),
    97, map("id", 97, "servant", 40006, "lv", 1, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(462, 335, 335, 841), "item", list(12004), "itemnum", list(100), "piecenum", 0, "lvcondition", 1, "joblv", 2, "servantShow", "【进阶1】伐木效率+12%"),
    98, map("id", 98, "servant", 40006, "lv", 2, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(910, 660, 660, 1657), "item", list(12004), "itemnum", list(300), "piecenum", 0, "lvcondition", 9, "joblv", 3, "servantShow", "【进阶2】伐木效率+20%"),
    99, map("id", 99, "servant", 40006, "lv", 3, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1375, 997, 997, 2505), "item", list(12004), "itemnum", list(800), "piecenum", 20, "lvcondition", 18, "joblv", 4, "servantShow", "【进阶3】伐木效率+28%"),
    100, map("id", 100, "servant", 40006, "lv", 4, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1857, 1346, 1346, 3382), "item", list(12004), "itemnum", list(1800), "piecenum", 40, "lvcondition", 27, "joblv", 5, "servantShow", "【进阶4】伐木效率+36%")
);
    }

    private static void init20() {
data.map(
    101, map("id", 101, "servant", 40006, "lv", 5, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2354, 1707, 1707, 4288), "item", list(12004), "itemnum", list(3800), "piecenum", 60, "lvcondition", 36, "joblv", 6, "servantShow", "【进阶5】伐木效率+44%"),
    102, map("id", 102, "servant", 40006, "lv", 6, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2867, 2080, 2080, 5222), "item", list(12004), "itemnum", list(6800), "piecenum", 100, "lvcondition", 45, "joblv", 7, "servantShow", "【进阶6】伐木效率+52%"),
    103, map("id", 103, "servant", 40006, "lv", 7, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3395, 2463, 2463, 6185), "item", list(12004), "itemnum", list(11800), "piecenum", 140, "lvcondition", 1, "joblv", 8, "servantShow", "【进阶7】伐木效率+60%"),
    104, map("id", 104, "servant", 40006, "lv", 8, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3938, 2857, 2857, 7174), "item", list(12004), "itemnum", list(19800), "piecenum", 180, "lvcondition", 9, "joblv", 9, "servantShow", "【进阶8】伐木效率+68%"),
    105, map("id", 105, "servant", 40006, "lv", 9, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(4495, 3261, 3261, 8189), "item", list(12004), "itemnum", list(31800), "piecenum", 220, "lvcondition", 18, "joblv", 10, "servantShow", "【进阶9】伐木效率+76%")
);
    }

    private static void init21() {
data.map(
    106, map("id", 106, "servant", 40006, "lv", 10, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(5066, 3675, 3675, 9229), "item", list(12004), "itemnum", list(47800), "piecenum", 260, "lvcondition", 27, "joblv", 11, "servantShow", "【进阶10】伐木效率+84%"),
    107, map("id", 107, "servant", 40006, "lv", 11, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(5650, 4099, 4099, 10294), "item", list(12004), "itemnum", list(67800), "piecenum", 300, "lvcondition", 36, "joblv", 12, "servantShow", "【进阶11】伐木效率+92%"),
    108, map("id", 108, "servant", 40006, "lv", 12, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(6247, 4532, 4532, 11382), "item", list(12004), "itemnum", list(91800), "piecenum", 360, "lvcondition", 45, "joblv", 13, "servantShow", "【进阶12】伐木效率+100%"),
    109, map("id", 109, "servant", 40007, "lv", 1, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(631, 221, 221, 9458), "item", list(12004), "itemnum", list(100), "piecenum", 0, "lvcondition", 1, "joblv", 15, "servantShow", "【进阶1】裁缝效率+12%"),
    110, map("id", 110, "servant", 40007, "lv", 2, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1243, 436, 436, 18632), "item", list(12004), "itemnum", list(300), "piecenum", 0, "lvcondition", 9, "joblv", 16, "servantShow", "【进阶2】裁缝效率+20%")
);
    }

    private static void init22() {
data.map(
    111, map("id", 111, "servant", 40007, "lv", 3, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1836, 644, 644, 27531), "item", list(12004), "itemnum", list(800), "piecenum", 20, "lvcondition", 18, "joblv", 17, "servantShow", "【进阶3】裁缝效率+28%"),
    112, map("id", 112, "servant", 40007, "lv", 4, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2411, 846, 846, 36163), "item", list(12004), "itemnum", list(1800), "piecenum", 40, "lvcondition", 27, "joblv", 18, "servantShow", "【进阶4】裁缝效率+36%"),
    113, map("id", 113, "servant", 40007, "lv", 5, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2969, 1042, 1042, 44536), "item", list(12004), "itemnum", list(3800), "piecenum", 60, "lvcondition", 36, "joblv", 19, "servantShow", "【进阶5】裁缝效率+44%"),
    114, map("id", 114, "servant", 40007, "lv", 6, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3510, 1232, 1232, 52657), "item", list(12004), "itemnum", list(6800), "piecenum", 100, "lvcondition", 45, "joblv", 20, "servantShow", "【进阶6】裁缝效率+52%"),
    115, map("id", 115, "servant", 40007, "lv", 7, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(631, 221, 221, 9458), "item", list(12004), "itemnum", list(11800), "piecenum", 140, "lvcondition", 1, "joblv", 21, "servantShow", "【进阶7】裁缝效率+60%")
);
    }

    private static void init23() {
data.map(
    116, map("id", 116, "servant", 40007, "lv", 8, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1243, 436, 436, 18632), "item", list(12004), "itemnum", list(19800), "piecenum", 180, "lvcondition", 9, "joblv", 22, "servantShow", "【进阶8】裁缝效率+68%"),
    117, map("id", 117, "servant", 40007, "lv", 9, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1836, 644, 644, 27531), "item", list(12004), "itemnum", list(31800), "piecenum", 220, "lvcondition", 18, "joblv", 23, "servantShow", "【进阶9】裁缝效率+76%"),
    118, map("id", 118, "servant", 40007, "lv", 10, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2411, 846, 846, 36163), "item", list(12004), "itemnum", list(47800), "piecenum", 260, "lvcondition", 27, "joblv", 24, "servantShow", "【进阶10】裁缝效率+84%"),
    119, map("id", 119, "servant", 40007, "lv", 11, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2969, 1042, 1042, 44536), "item", list(12004), "itemnum", list(67800), "piecenum", 300, "lvcondition", 36, "joblv", 25, "servantShow", "【进阶11】裁缝效率+92%"),
    120, map("id", 120, "servant", 40007, "lv", 12, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3510, 1232, 1232, 52657), "item", list(12004), "itemnum", list(91800), "piecenum", 360, "lvcondition", 45, "joblv", 26, "servantShow", "【进阶12】裁缝效率+100%")
);
    }

    private static void init24() {
data.map(
    121, map("id", 121, "servant", 40008, "lv", 1, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(462, 335, 335, 841), "item", list(12004), "itemnum", list(100), "piecenum", 0, "lvcondition", 1, "joblv", 28, "servantShow", "【进阶1】诗人效率+12%"),
    122, map("id", 122, "servant", 40008, "lv", 2, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(910, 660, 660, 1657), "item", list(12004), "itemnum", list(300), "piecenum", 0, "lvcondition", 9, "joblv", 29, "servantShow", "【进阶2】诗人效率+20%"),
    123, map("id", 123, "servant", 40008, "lv", 3, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1375, 997, 997, 2505), "item", list(12004), "itemnum", list(800), "piecenum", 20, "lvcondition", 18, "joblv", 30, "servantShow", "【进阶3】诗人效率+28%"),
    124, map("id", 124, "servant", 40008, "lv", 4, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1857, 1346, 1346, 3382), "item", list(12004), "itemnum", list(1800), "piecenum", 40, "lvcondition", 27, "joblv", 31, "servantShow", "【进阶4】诗人效率+36%"),
    125, map("id", 125, "servant", 40008, "lv", 5, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2354, 1707, 1707, 4288), "item", list(12004), "itemnum", list(3800), "piecenum", 60, "lvcondition", 36, "joblv", 32, "servantShow", "【进阶5】诗人效率+44%")
);
    }

    private static void init25() {
data.map(
    126, map("id", 126, "servant", 40008, "lv", 6, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2867, 2080, 2080, 5222), "item", list(12004), "itemnum", list(6800), "piecenum", 100, "lvcondition", 45, "joblv", 33, "servantShow", "【进阶6】诗人效率+52%"),
    127, map("id", 127, "servant", 40008, "lv", 7, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3395, 2463, 2463, 6185), "item", list(12004), "itemnum", list(11800), "piecenum", 140, "lvcondition", 1, "joblv", 34, "servantShow", "【进阶7】诗人效率+60%"),
    128, map("id", 128, "servant", 40008, "lv", 8, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3938, 2857, 2857, 7174), "item", list(12004), "itemnum", list(19800), "piecenum", 180, "lvcondition", 9, "joblv", 35, "servantShow", "【进阶8】诗人效率+68%"),
    129, map("id", 129, "servant", 40008, "lv", 9, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(4495, 3261, 3261, 8189), "item", list(12004), "itemnum", list(31800), "piecenum", 220, "lvcondition", 18, "joblv", 36, "servantShow", "【进阶9】诗人效率+76%"),
    130, map("id", 130, "servant", 40008, "lv", 10, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(5066, 3675, 3675, 9229), "item", list(12004), "itemnum", list(47800), "piecenum", 260, "lvcondition", 27, "joblv", 37, "servantShow", "【进阶10】诗人效率+84%")
);
    }

    private static void init26() {
data.map(
    131, map("id", 131, "servant", 40008, "lv", 11, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(5650, 4099, 4099, 10294), "item", list(12004), "itemnum", list(67800), "piecenum", 300, "lvcondition", 36, "joblv", 38, "servantShow", "【进阶11】诗人效率+92%"),
    132, map("id", 132, "servant", 40008, "lv", 12, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(6247, 4532, 4532, 11382), "item", list(12004), "itemnum", list(91800), "piecenum", 360, "lvcondition", 45, "joblv", 39, "servantShow", "【进阶12】诗人效率+100%"),
    133, map("id", 133, "servant", 40009, "lv", 1, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(447, 324, 324, 815), "item", list(12004), "itemnum", list(100), "piecenum", 0, "lvcondition", 1, "joblv", 2, "servantShow", "【进阶1】伐木效率+12%"),
    134, map("id", 134, "servant", 40009, "lv", 2, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(868, 629, 629, 1581), "item", list(12004), "itemnum", list(300), "piecenum", 0, "lvcondition", 9, "joblv", 3, "servantShow", "【进阶2】伐木效率+20%"),
    135, map("id", 135, "servant", 40009, "lv", 3, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1293, 937, 937, 2356), "item", list(12004), "itemnum", list(800), "piecenum", 20, "lvcondition", 18, "joblv", 4, "servantShow", "【进阶3】伐木效率+28%")
);
    }

    private static void init27() {
data.map(
    136, map("id", 136, "servant", 40009, "lv", 4, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1722, 1248, 1248, 3138), "item", list(12004), "itemnum", list(1800), "piecenum", 40, "lvcondition", 27, "joblv", 5, "servantShow", "【进阶4】伐木效率+36%"),
    137, map("id", 137, "servant", 40009, "lv", 5, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2154, 1562, 1562, 3926), "item", list(12004), "itemnum", list(3800), "piecenum", 60, "lvcondition", 36, "joblv", 6, "servantShow", "【进阶5】伐木效率+44%"),
    138, map("id", 138, "servant", 40009, "lv", 6, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2591, 1879, 1879, 4721), "item", list(12004), "itemnum", list(6800), "piecenum", 100, "lvcondition", 45, "joblv", 7, "servantShow", "【进阶6】伐木效率+52%"),
    139, map("id", 139, "servant", 40009, "lv", 7, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3031, 2198, 2198, 5523), "item", list(12004), "itemnum", list(11800), "piecenum", 140, "lvcondition", 1, "joblv", 8, "servantShow", "【进阶7】伐木效率+60%"),
    140, map("id", 140, "servant", 40009, "lv", 8, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3474, 2519, 2519, 6330), "item", list(12004), "itemnum", list(19800), "piecenum", 180, "lvcondition", 9, "joblv", 9, "servantShow", "【进阶8】伐木效率+68%")
);
    }

    private static void init28() {
data.map(
    141, map("id", 141, "servant", 40009, "lv", 9, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3920, 2843, 2843, 7142), "item", list(12004), "itemnum", list(31800), "piecenum", 220, "lvcondition", 18, "joblv", 10, "servantShow", "【进阶9】伐木效率+76%"),
    142, map("id", 142, "servant", 40009, "lv", 10, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(4369, 3169, 3169, 7959), "item", list(12004), "itemnum", list(47800), "piecenum", 260, "lvcondition", 27, "joblv", 11, "servantShow", "【进阶10】伐木效率+84%"),
    143, map("id", 143, "servant", 40009, "lv", 11, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(4820, 3497, 3497, 8781), "item", list(12004), "itemnum", list(67800), "piecenum", 300, "lvcondition", 36, "joblv", 12, "servantShow", "【进阶11】伐木效率+92%"),
    144, map("id", 144, "servant", 40009, "lv", 12, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(5273, 3826, 3826, 9608), "item", list(12004), "itemnum", list(91800), "piecenum", 360, "lvcondition", 45, "joblv", 13, "servantShow", "【进阶12】伐木效率+100%"),
    145, map("id", 145, "servant", 40010, "lv", 1, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(462, 335, 335, 841), "item", list(12004), "itemnum", list(100), "piecenum", 0, "lvcondition", 1, "joblv", 15, "servantShow", "【进阶1】裁缝效率+12%")
);
    }

    private static void init29() {
data.map(
    146, map("id", 146, "servant", 40010, "lv", 2, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(910, 660, 660, 1657), "item", list(12004), "itemnum", list(300), "piecenum", 0, "lvcondition", 9, "joblv", 16, "servantShow", "【进阶2】裁缝效率+20%"),
    147, map("id", 147, "servant", 40010, "lv", 3, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1375, 997, 997, 2505), "item", list(12004), "itemnum", list(800), "piecenum", 20, "lvcondition", 18, "joblv", 17, "servantShow", "【进阶3】裁缝效率+28%"),
    148, map("id", 148, "servant", 40010, "lv", 4, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1857, 1346, 1346, 3382), "item", list(12004), "itemnum", list(1800), "piecenum", 40, "lvcondition", 27, "joblv", 18, "servantShow", "【进阶4】裁缝效率+36%"),
    149, map("id", 149, "servant", 40010, "lv", 5, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2354, 1707, 1707, 4288), "item", list(12004), "itemnum", list(3800), "piecenum", 60, "lvcondition", 36, "joblv", 19, "servantShow", "【进阶5】裁缝效率+44%"),
    150, map("id", 150, "servant", 40010, "lv", 6, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2867, 2080, 2080, 5222), "item", list(12004), "itemnum", list(6800), "piecenum", 100, "lvcondition", 45, "joblv", 20, "servantShow", "【进阶6】裁缝效率+52%")
);
    }

    private static void init30() {
data.map(
    151, map("id", 151, "servant", 40010, "lv", 7, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3395, 2463, 2463, 6185), "item", list(12004), "itemnum", list(11800), "piecenum", 140, "lvcondition", 1, "joblv", 21, "servantShow", "【进阶7】裁缝效率+60%"),
    152, map("id", 152, "servant", 40010, "lv", 8, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3938, 2857, 2857, 7174), "item", list(12004), "itemnum", list(19800), "piecenum", 180, "lvcondition", 9, "joblv", 22, "servantShow", "【进阶8】裁缝效率+68%"),
    153, map("id", 153, "servant", 40010, "lv", 9, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(4495, 3261, 3261, 8189), "item", list(12004), "itemnum", list(31800), "piecenum", 220, "lvcondition", 18, "joblv", 23, "servantShow", "【进阶9】裁缝效率+76%"),
    154, map("id", 154, "servant", 40010, "lv", 10, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(5066, 3675, 3675, 9229), "item", list(12004), "itemnum", list(47800), "piecenum", 260, "lvcondition", 27, "joblv", 24, "servantShow", "【进阶10】裁缝效率+84%"),
    155, map("id", 155, "servant", 40010, "lv", 11, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(5650, 4099, 4099, 10294), "item", list(12004), "itemnum", list(67800), "piecenum", 300, "lvcondition", 36, "joblv", 25, "servantShow", "【进阶11】裁缝效率+92%")
);
    }

    private static void init31() {
data.map(
    156, map("id", 156, "servant", 40010, "lv", 12, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(6247, 4532, 4532, 11382), "item", list(12004), "itemnum", list(91800), "piecenum", 360, "lvcondition", 45, "joblv", 26, "servantShow", "【进阶12】裁缝效率+100%"),
    157, map("id", 157, "servant", 40011, "lv", 1, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(447, 324, 324, 815), "item", list(12004), "itemnum", list(100), "piecenum", 0, "lvcondition", 1, "joblv", 28, "servantShow", "【进阶1】诗人效率+12%"),
    158, map("id", 158, "servant", 40011, "lv", 2, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(868, 629, 629, 1581), "item", list(12004), "itemnum", list(300), "piecenum", 0, "lvcondition", 9, "joblv", 29, "servantShow", "【进阶2】诗人效率+20%"),
    159, map("id", 159, "servant", 40011, "lv", 3, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1293, 937, 937, 2356), "item", list(12004), "itemnum", list(800), "piecenum", 20, "lvcondition", 18, "joblv", 30, "servantShow", "【进阶3】诗人效率+28%"),
    160, map("id", 160, "servant", 40011, "lv", 4, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1722, 1248, 1248, 3138), "item", list(12004), "itemnum", list(1800), "piecenum", 40, "lvcondition", 27, "joblv", 31, "servantShow", "【进阶4】诗人效率+36%")
);
    }

    private static void init32() {
data.map(
    161, map("id", 161, "servant", 40011, "lv", 5, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2154, 1562, 1562, 3926), "item", list(12004), "itemnum", list(3800), "piecenum", 60, "lvcondition", 36, "joblv", 32, "servantShow", "【进阶5】诗人效率+44%"),
    162, map("id", 162, "servant", 40011, "lv", 6, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2591, 1879, 1879, 4721), "item", list(12004), "itemnum", list(6800), "piecenum", 100, "lvcondition", 45, "joblv", 33, "servantShow", "【进阶6】诗人效率+52%"),
    163, map("id", 163, "servant", 40011, "lv", 7, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3031, 2198, 2198, 5523), "item", list(12004), "itemnum", list(11800), "piecenum", 140, "lvcondition", 1, "joblv", 34, "servantShow", "【进阶7】诗人效率+60%"),
    164, map("id", 164, "servant", 40011, "lv", 8, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3474, 2519, 2519, 6330), "item", list(12004), "itemnum", list(19800), "piecenum", 180, "lvcondition", 9, "joblv", 35, "servantShow", "【进阶8】诗人效率+68%"),
    165, map("id", 165, "servant", 40011, "lv", 9, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3920, 2843, 2843, 7142), "item", list(12004), "itemnum", list(31800), "piecenum", 220, "lvcondition", 18, "joblv", 36, "servantShow", "【进阶9】诗人效率+76%")
);
    }

    private static void init33() {
data.map(
    166, map("id", 166, "servant", 40011, "lv", 10, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(4369, 3169, 3169, 7959), "item", list(12004), "itemnum", list(47800), "piecenum", 260, "lvcondition", 27, "joblv", 37, "servantShow", "【进阶10】诗人效率+84%"),
    167, map("id", 167, "servant", 40011, "lv", 11, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(4820, 3497, 3497, 8781), "item", list(12004), "itemnum", list(67800), "piecenum", 300, "lvcondition", 36, "joblv", 38, "servantShow", "【进阶11】诗人效率+92%"),
    168, map("id", 168, "servant", 40011, "lv", 12, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(5273, 3826, 3826, 9608), "item", list(12004), "itemnum", list(91800), "piecenum", 360, "lvcondition", 45, "joblv", 39, "servantShow", "【进阶12】诗人效率+100%"),
    169, map("id", 169, "servant", 40012, "lv", 1, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(433, 314, 314, 789), "item", list(12004), "itemnum", list(100), "piecenum", 0, "lvcondition", 1, "joblv", 2, "servantShow", "【进阶1】伐木效率+12%"),
    170, map("id", 170, "servant", 40012, "lv", 2, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(827, 600, 600, 1507), "item", list(12004), "itemnum", list(300), "piecenum", 0, "lvcondition", 9, "joblv", 3, "servantShow", "【进阶2】伐木效率+20%")
);
    }

    private static void init34() {
data.map(
    171, map("id", 171, "servant", 40012, "lv", 3, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1215, 881, 881, 2213), "item", list(12004), "itemnum", list(800), "piecenum", 20, "lvcondition", 18, "joblv", 4, "servantShow", "【进阶3】伐木效率+28%"),
    172, map("id", 172, "servant", 40012, "lv", 4, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1596, 1158, 1158, 2907), "item", list(12004), "itemnum", list(1800), "piecenum", 40, "lvcondition", 27, "joblv", 5, "servantShow", "【进阶4】伐木效率+36%"),
    173, map("id", 173, "servant", 40012, "lv", 5, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1971, 1431, 1431, 3591), "item", list(12004), "itemnum", list(3800), "piecenum", 60, "lvcondition", 36, "joblv", 6, "servantShow", "【进阶5】伐木效率+44%"),
    174, map("id", 174, "servant", 40012, "lv", 6, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2341, 1700, 1700, 4265), "item", list(12004), "itemnum", list(6800), "piecenum", 100, "lvcondition", 45, "joblv", 7, "servantShow", "【进阶6】伐木效率+52%"),
    175, map("id", 175, "servant", 40012, "lv", 7, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2706, 1965, 1965, 4931), "item", list(12004), "itemnum", list(11800), "piecenum", 140, "lvcondition", 1, "joblv", 8, "servantShow", "【进阶7】伐木效率+60%")
);
    }

    private static void init35() {
data.map(
    176, map("id", 176, "servant", 40012, "lv", 8, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3068, 2227, 2227, 5589), "item", list(12004), "itemnum", list(19800), "piecenum", 180, "lvcondition", 9, "joblv", 9, "servantShow", "【进阶8】伐木效率+68%"),
    177, map("id", 177, "servant", 40012, "lv", 9, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3425, 2486, 2486, 6240), "item", list(12004), "itemnum", list(31800), "piecenum", 220, "lvcondition", 18, "joblv", 10, "servantShow", "【进阶9】伐木效率+76%"),
    178, map("id", 178, "servant", 40012, "lv", 10, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3779, 2743, 2743, 6884), "item", list(12004), "itemnum", list(47800), "piecenum", 260, "lvcondition", 27, "joblv", 11, "servantShow", "【进阶10】伐木效率+84%"),
    179, map("id", 179, "servant", 40012, "lv", 11, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(4130, 2998, 2998, 7523), "item", list(12004), "itemnum", list(67800), "piecenum", 300, "lvcondition", 36, "joblv", 12, "servantShow", "【进阶11】伐木效率+92%"),
    180, map("id", 180, "servant", 40012, "lv", 12, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(4477, 3250, 3250, 8156), "item", list(12004), "itemnum", list(91800), "piecenum", 360, "lvcondition", 45, "joblv", 13, "servantShow", "【进阶12】伐木效率+100%")
);
    }

    private static void init36() {
data.map(
    181, map("id", 181, "servant", 40013, "lv", 1, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(433, 314, 314, 789), "item", list(12004), "itemnum", list(100), "piecenum", 0, "lvcondition", 1, "joblv", 15, "servantShow", "【进阶1】裁缝效率+12%"),
    182, map("id", 182, "servant", 40013, "lv", 2, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(827, 600, 600, 1507), "item", list(12004), "itemnum", list(300), "piecenum", 0, "lvcondition", 9, "joblv", 16, "servantShow", "【进阶2】裁缝效率+20%"),
    183, map("id", 183, "servant", 40013, "lv", 3, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1215, 881, 881, 2213), "item", list(12004), "itemnum", list(800), "piecenum", 20, "lvcondition", 18, "joblv", 17, "servantShow", "【进阶3】裁缝效率+28%"),
    184, map("id", 184, "servant", 40013, "lv", 4, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1596, 1158, 1158, 2907), "item", list(12004), "itemnum", list(1800), "piecenum", 40, "lvcondition", 27, "joblv", 18, "servantShow", "【进阶4】裁缝效率+36%"),
    185, map("id", 185, "servant", 40013, "lv", 5, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1971, 1431, 1431, 3591), "item", list(12004), "itemnum", list(3800), "piecenum", 60, "lvcondition", 36, "joblv", 19, "servantShow", "【进阶5】裁缝效率+44%")
);
    }

    private static void init37() {
data.map(
    186, map("id", 186, "servant", 40013, "lv", 6, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2341, 1700, 1700, 4265), "item", list(12004), "itemnum", list(6800), "piecenum", 100, "lvcondition", 45, "joblv", 20, "servantShow", "【进阶6】裁缝效率+52%"),
    187, map("id", 187, "servant", 40013, "lv", 7, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2706, 1965, 1965, 4931), "item", list(12004), "itemnum", list(11800), "piecenum", 140, "lvcondition", 1, "joblv", 21, "servantShow", "【进阶7】裁缝效率+60%"),
    188, map("id", 188, "servant", 40013, "lv", 8, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3068, 2227, 2227, 5589), "item", list(12004), "itemnum", list(19800), "piecenum", 180, "lvcondition", 9, "joblv", 22, "servantShow", "【进阶8】裁缝效率+68%"),
    189, map("id", 189, "servant", 40013, "lv", 9, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3425, 2486, 2486, 6240), "item", list(12004), "itemnum", list(31800), "piecenum", 220, "lvcondition", 18, "joblv", 23, "servantShow", "【进阶9】裁缝效率+76%"),
    190, map("id", 190, "servant", 40013, "lv", 10, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3779, 2743, 2743, 6884), "item", list(12004), "itemnum", list(47800), "piecenum", 260, "lvcondition", 27, "joblv", 24, "servantShow", "【进阶10】裁缝效率+84%")
);
    }

    private static void init38() {
data.map(
    191, map("id", 191, "servant", 40013, "lv", 11, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(4130, 2998, 2998, 7523), "item", list(12004), "itemnum", list(67800), "piecenum", 300, "lvcondition", 36, "joblv", 25, "servantShow", "【进阶11】裁缝效率+92%"),
    192, map("id", 192, "servant", 40013, "lv", 12, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(4477, 3250, 3250, 8156), "item", list(12004), "itemnum", list(91800), "piecenum", 360, "lvcondition", 45, "joblv", 26, "servantShow", "【进阶12】裁缝效率+100%"),
    193, map("id", 193, "servant", 40014, "lv", 1, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(433, 314, 314, 789), "item", list(12004), "itemnum", list(100), "piecenum", 0, "lvcondition", 1, "joblv", 28, "servantShow", "【进阶1】诗人效率+12%"),
    194, map("id", 194, "servant", 40014, "lv", 2, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(827, 600, 600, 1507), "item", list(12004), "itemnum", list(300), "piecenum", 0, "lvcondition", 9, "joblv", 29, "servantShow", "【进阶2】诗人效率+20%"),
    195, map("id", 195, "servant", 40014, "lv", 3, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1215, 881, 881, 2213), "item", list(12004), "itemnum", list(800), "piecenum", 20, "lvcondition", 18, "joblv", 30, "servantShow", "【进阶3】诗人效率+28%")
);
    }

    private static void init39() {
data.map(
    196, map("id", 196, "servant", 40014, "lv", 4, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1596, 1158, 1158, 2907), "item", list(12004), "itemnum", list(1800), "piecenum", 40, "lvcondition", 27, "joblv", 31, "servantShow", "【进阶4】诗人效率+36%"),
    197, map("id", 197, "servant", 40014, "lv", 5, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1971, 1431, 1431, 3591), "item", list(12004), "itemnum", list(3800), "piecenum", 60, "lvcondition", 36, "joblv", 32, "servantShow", "【进阶5】诗人效率+44%"),
    198, map("id", 198, "servant", 40014, "lv", 6, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2341, 1700, 1700, 4265), "item", list(12004), "itemnum", list(6800), "piecenum", 100, "lvcondition", 45, "joblv", 33, "servantShow", "【进阶6】诗人效率+52%"),
    199, map("id", 199, "servant", 40014, "lv", 7, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2706, 1965, 1965, 4931), "item", list(12004), "itemnum", list(11800), "piecenum", 140, "lvcondition", 1, "joblv", 34, "servantShow", "【进阶7】诗人效率+60%"),
    200, map("id", 200, "servant", 40014, "lv", 8, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3068, 2227, 2227, 5589), "item", list(12004), "itemnum", list(19800), "piecenum", 180, "lvcondition", 9, "joblv", 35, "servantShow", "【进阶8】诗人效率+68%")
);
    }

    private static void init40() {
data.map(
    201, map("id", 201, "servant", 40014, "lv", 9, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3425, 2486, 2486, 6240), "item", list(12004), "itemnum", list(31800), "piecenum", 220, "lvcondition", 18, "joblv", 36, "servantShow", "【进阶9】诗人效率+76%"),
    202, map("id", 202, "servant", 40014, "lv", 10, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3779, 2743, 2743, 6884), "item", list(12004), "itemnum", list(47800), "piecenum", 260, "lvcondition", 27, "joblv", 37, "servantShow", "【进阶10】诗人效率+84%"),
    203, map("id", 203, "servant", 40014, "lv", 11, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(4130, 2998, 2998, 7523), "item", list(12004), "itemnum", list(67800), "piecenum", 300, "lvcondition", 36, "joblv", 38, "servantShow", "【进阶11】诗人效率+92%"),
    204, map("id", 204, "servant", 40014, "lv", 12, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(4477, 3250, 3250, 8156), "item", list(12004), "itemnum", list(91800), "piecenum", 360, "lvcondition", 45, "joblv", 39, "servantShow", "【进阶12】诗人效率+100%"),
    205, map("id", 205, "servant", 40015, "lv", 1, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(433, 314, 314, 789), "item", list(12004), "itemnum", list(100), "piecenum", 0, "lvcondition", 1, "joblv", 2, "servantShow", "【进阶1】伐木效率+12%")
);
    }

    private static void init41() {
data.map(
    206, map("id", 206, "servant", 40015, "lv", 2, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(827, 600, 600, 1507), "item", list(12004), "itemnum", list(300), "piecenum", 0, "lvcondition", 9, "joblv", 3, "servantShow", "【进阶2】伐木效率+20%"),
    207, map("id", 207, "servant", 40015, "lv", 3, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1215, 881, 881, 2213), "item", list(12004), "itemnum", list(800), "piecenum", 20, "lvcondition", 18, "joblv", 4, "servantShow", "【进阶3】伐木效率+28%"),
    208, map("id", 208, "servant", 40015, "lv", 4, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1596, 1158, 1158, 2907), "item", list(12004), "itemnum", list(1800), "piecenum", 40, "lvcondition", 27, "joblv", 5, "servantShow", "【进阶4】伐木效率+36%"),
    209, map("id", 209, "servant", 40015, "lv", 5, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1971, 1431, 1431, 3591), "item", list(12004), "itemnum", list(3800), "piecenum", 60, "lvcondition", 36, "joblv", 6, "servantShow", "【进阶5】伐木效率+44%"),
    210, map("id", 210, "servant", 40015, "lv", 6, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2341, 1700, 1700, 4265), "item", list(12004), "itemnum", list(6800), "piecenum", 100, "lvcondition", 45, "joblv", 7, "servantShow", "【进阶6】伐木效率+52%")
);
    }

    private static void init42() {
data.map(
    211, map("id", 211, "servant", 40015, "lv", 7, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2706, 1965, 1965, 4931), "item", list(12004), "itemnum", list(11800), "piecenum", 140, "lvcondition", 1, "joblv", 8, "servantShow", "【进阶7】伐木效率+60%"),
    212, map("id", 212, "servant", 40015, "lv", 8, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3068, 2227, 2227, 5589), "item", list(12004), "itemnum", list(19800), "piecenum", 180, "lvcondition", 9, "joblv", 9, "servantShow", "【进阶8】伐木效率+68%"),
    213, map("id", 213, "servant", 40015, "lv", 9, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3425, 2486, 2486, 6240), "item", list(12004), "itemnum", list(31800), "piecenum", 220, "lvcondition", 18, "joblv", 10, "servantShow", "【进阶9】伐木效率+76%"),
    214, map("id", 214, "servant", 40015, "lv", 10, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3779, 2743, 2743, 6884), "item", list(12004), "itemnum", list(47800), "piecenum", 260, "lvcondition", 27, "joblv", 11, "servantShow", "【进阶10】伐木效率+84%"),
    215, map("id", 215, "servant", 40015, "lv", 11, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(4130, 2998, 2998, 7523), "item", list(12004), "itemnum", list(67800), "piecenum", 300, "lvcondition", 36, "joblv", 12, "servantShow", "【进阶11】伐木效率+92%")
);
    }

    private static void init43() {
data.map(
    216, map("id", 216, "servant", 40015, "lv", 12, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(4477, 3250, 3250, 8156), "item", list(12004), "itemnum", list(91800), "piecenum", 360, "lvcondition", 45, "joblv", 13, "servantShow", "【进阶12】伐木效率+100%"),
    217, map("id", 217, "servant", 40016, "lv", 1, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(433, 314, 314, 789), "item", list(12004), "itemnum", list(100), "piecenum", 0, "lvcondition", 1, "joblv", 15, "servantShow", "【进阶1】裁缝效率+12%"),
    218, map("id", 218, "servant", 40016, "lv", 2, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(827, 600, 600, 1507), "item", list(12004), "itemnum", list(300), "piecenum", 0, "lvcondition", 9, "joblv", 16, "servantShow", "【进阶2】裁缝效率+20%"),
    219, map("id", 219, "servant", 40016, "lv", 3, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1215, 881, 881, 2213), "item", list(12004), "itemnum", list(800), "piecenum", 20, "lvcondition", 18, "joblv", 17, "servantShow", "【进阶3】裁缝效率+28%"),
    220, map("id", 220, "servant", 40016, "lv", 4, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1596, 1158, 1158, 2907), "item", list(12004), "itemnum", list(1800), "piecenum", 40, "lvcondition", 27, "joblv", 18, "servantShow", "【进阶4】裁缝效率+36%")
);
    }

    private static void init44() {
data.map(
    221, map("id", 221, "servant", 40016, "lv", 5, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1971, 1431, 1431, 3591), "item", list(12004), "itemnum", list(3800), "piecenum", 60, "lvcondition", 36, "joblv", 19, "servantShow", "【进阶5】裁缝效率+44%"),
    222, map("id", 222, "servant", 40016, "lv", 6, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2341, 1700, 1700, 4265), "item", list(12004), "itemnum", list(6800), "piecenum", 100, "lvcondition", 45, "joblv", 20, "servantShow", "【进阶6】裁缝效率+52%"),
    223, map("id", 223, "servant", 40016, "lv", 7, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2706, 1965, 1965, 4931), "item", list(12004), "itemnum", list(11800), "piecenum", 140, "lvcondition", 1, "joblv", 21, "servantShow", "【进阶7】裁缝效率+60%"),
    224, map("id", 224, "servant", 40016, "lv", 8, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3068, 2227, 2227, 5589), "item", list(12004), "itemnum", list(19800), "piecenum", 180, "lvcondition", 9, "joblv", 22, "servantShow", "【进阶8】裁缝效率+68%"),
    225, map("id", 225, "servant", 40016, "lv", 9, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3425, 2486, 2486, 6240), "item", list(12004), "itemnum", list(31800), "piecenum", 220, "lvcondition", 18, "joblv", 23, "servantShow", "【进阶9】裁缝效率+76%")
);
    }

    private static void init45() {
data.map(
    226, map("id", 226, "servant", 40016, "lv", 10, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3779, 2743, 2743, 6884), "item", list(12004), "itemnum", list(47800), "piecenum", 260, "lvcondition", 27, "joblv", 24, "servantShow", "【进阶10】裁缝效率+84%"),
    227, map("id", 227, "servant", 40016, "lv", 11, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(4130, 2998, 2998, 7523), "item", list(12004), "itemnum", list(67800), "piecenum", 300, "lvcondition", 36, "joblv", 25, "servantShow", "【进阶11】裁缝效率+92%"),
    228, map("id", 228, "servant", 40016, "lv", 12, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(4477, 3250, 3250, 8156), "item", list(12004), "itemnum", list(91800), "piecenum", 360, "lvcondition", 45, "joblv", 26, "servantShow", "【进阶12】裁缝效率+100%"),
    229, map("id", 229, "servant", 40017, "lv", 1, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(433, 314, 314, 789), "item", list(12004), "itemnum", list(100), "piecenum", 0, "lvcondition", 1, "joblv", 28, "servantShow", "【进阶1】诗人效率+12%"),
    230, map("id", 230, "servant", 40017, "lv", 2, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(827, 600, 600, 1507), "item", list(12004), "itemnum", list(300), "piecenum", 0, "lvcondition", 9, "joblv", 29, "servantShow", "【进阶2】诗人效率+20%")
);
    }

    private static void init46() {
data.map(
    231, map("id", 231, "servant", 40017, "lv", 3, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1215, 881, 881, 2213), "item", list(12004), "itemnum", list(800), "piecenum", 20, "lvcondition", 18, "joblv", 30, "servantShow", "【进阶3】诗人效率+28%"),
    232, map("id", 232, "servant", 40017, "lv", 4, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1596, 1158, 1158, 2907), "item", list(12004), "itemnum", list(1800), "piecenum", 40, "lvcondition", 27, "joblv", 31, "servantShow", "【进阶4】诗人效率+36%"),
    233, map("id", 233, "servant", 40017, "lv", 5, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1971, 1431, 1431, 3591), "item", list(12004), "itemnum", list(3800), "piecenum", 60, "lvcondition", 36, "joblv", 32, "servantShow", "【进阶5】诗人效率+44%"),
    234, map("id", 234, "servant", 40017, "lv", 6, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2341, 1700, 1700, 4265), "item", list(12004), "itemnum", list(6800), "piecenum", 100, "lvcondition", 45, "joblv", 33, "servantShow", "【进阶6】诗人效率+52%"),
    235, map("id", 235, "servant", 40017, "lv", 7, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2706, 1965, 1965, 4931), "item", list(12004), "itemnum", list(11800), "piecenum", 140, "lvcondition", 1, "joblv", 34, "servantShow", "【进阶7】诗人效率+60%")
);
    }

    private static void init47() {
data.map(
    236, map("id", 236, "servant", 40017, "lv", 8, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3068, 2227, 2227, 5589), "item", list(12004), "itemnum", list(19800), "piecenum", 180, "lvcondition", 9, "joblv", 35, "servantShow", "【进阶8】诗人效率+68%"),
    237, map("id", 237, "servant", 40017, "lv", 9, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3425, 2486, 2486, 6240), "item", list(12004), "itemnum", list(31800), "piecenum", 220, "lvcondition", 18, "joblv", 36, "servantShow", "【进阶9】诗人效率+76%"),
    238, map("id", 238, "servant", 40017, "lv", 10, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3779, 2743, 2743, 6884), "item", list(12004), "itemnum", list(47800), "piecenum", 260, "lvcondition", 27, "joblv", 37, "servantShow", "【进阶10】诗人效率+84%"),
    239, map("id", 239, "servant", 40017, "lv", 11, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(4130, 2998, 2998, 7523), "item", list(12004), "itemnum", list(67800), "piecenum", 300, "lvcondition", 36, "joblv", 38, "servantShow", "【进阶11】诗人效率+92%"),
    240, map("id", 240, "servant", 40017, "lv", 12, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(4477, 3250, 3250, 8156), "item", list(12004), "itemnum", list(91800), "piecenum", 360, "lvcondition", 45, "joblv", 39, "servantShow", "【进阶12】诗人效率+100%")
);
    }

    private static void init48() {
data.map(
    241, map("id", 241, "servant", 40018, "lv", 1, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(419, 304, 304, 763), "item", list(12004), "itemnum", list(100), "piecenum", 0, "lvcondition", 1, "joblv", 2, "servantShow", "【进阶1】伐木效率+12%"),
    242, map("id", 242, "servant", 40018, "lv", 2, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(788, 571, 571, 1434), "item", list(12004), "itemnum", list(300), "piecenum", 0, "lvcondition", 9, "joblv", 3, "servantShow", "【进阶2】伐木效率+20%"),
    243, map("id", 243, "servant", 40018, "lv", 3, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1140, 826, 826, 2076), "item", list(12004), "itemnum", list(800), "piecenum", 20, "lvcondition", 18, "joblv", 4, "servantShow", "【进阶3】伐木效率+28%"),
    244, map("id", 244, "servant", 40018, "lv", 4, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1478, 1071, 1071, 2691), "item", list(12004), "itemnum", list(1800), "piecenum", 40, "lvcondition", 27, "joblv", 5, "servantShow", "【进阶4】伐木效率+36%"),
    245, map("id", 245, "servant", 40018, "lv", 5, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1802, 1307, 1307, 3282), "item", list(12004), "itemnum", list(3800), "piecenum", 60, "lvcondition", 36, "joblv", 6, "servantShow", "【进阶5】伐木效率+44%")
);
    }

    private static void init49() {
data.map(
    246, map("id", 246, "servant", 40018, "lv", 6, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2116, 1535, 1535, 3853), "item", list(12004), "itemnum", list(6800), "piecenum", 100, "lvcondition", 45, "joblv", 7, "servantShow", "【进阶6】伐木效率+52%"),
    247, map("id", 247, "servant", 40018, "lv", 7, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2419, 1755, 1755, 4406), "item", list(12004), "itemnum", list(11800), "piecenum", 140, "lvcondition", 1, "joblv", 8, "servantShow", "【进阶7】伐木效率+60%"),
    248, map("id", 248, "servant", 40018, "lv", 8, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2714, 1969, 1969, 4943), "item", list(12004), "itemnum", list(19800), "piecenum", 180, "lvcondition", 9, "joblv", 9, "servantShow", "【进阶8】伐木效率+68%"),
    249, map("id", 249, "servant", 40018, "lv", 9, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3001, 2177, 2177, 5466), "item", list(12004), "itemnum", list(31800), "piecenum", 220, "lvcondition", 18, "joblv", 10, "servantShow", "【进阶9】伐木效率+76%"),
    250, map("id", 250, "servant", 40018, "lv", 10, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3282, 2380, 2380, 5976), "item", list(12004), "itemnum", list(47800), "piecenum", 260, "lvcondition", 27, "joblv", 11, "servantShow", "【进阶10】伐木效率+84%")
);
    }

    private static void init50() {
data.map(
    251, map("id", 251, "servant", 40018, "lv", 11, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3556, 2579, 2579, 6476), "item", list(12004), "itemnum", list(67800), "piecenum", 300, "lvcondition", 36, "joblv", 12, "servantShow", "【进阶11】伐木效率+92%"),
    252, map("id", 252, "servant", 40018, "lv", 12, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3824, 2774, 2774, 6966), "item", list(12004), "itemnum", list(91800), "piecenum", 360, "lvcondition", 45, "joblv", 13, "servantShow", "【进阶12】伐木效率+100%"),
    253, map("id", 253, "servant", 40019, "lv", 1, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(419, 304, 304, 763), "item", list(12004), "itemnum", list(100), "piecenum", 0, "lvcondition", 1, "joblv", 15, "servantShow", "【进阶1】裁缝效率+12%"),
    254, map("id", 254, "servant", 40019, "lv", 2, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(788, 571, 571, 1434), "item", list(12004), "itemnum", list(300), "piecenum", 0, "lvcondition", 9, "joblv", 16, "servantShow", "【进阶2】裁缝效率+20%"),
    255, map("id", 255, "servant", 40019, "lv", 3, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1140, 826, 826, 2076), "item", list(12004), "itemnum", list(800), "piecenum", 20, "lvcondition", 18, "joblv", 17, "servantShow", "【进阶3】裁缝效率+28%")
);
    }

    private static void init51() {
data.map(
    256, map("id", 256, "servant", 40019, "lv", 4, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1478, 1071, 1071, 2691), "item", list(12004), "itemnum", list(1800), "piecenum", 40, "lvcondition", 27, "joblv", 18, "servantShow", "【进阶4】裁缝效率+36%"),
    257, map("id", 257, "servant", 40019, "lv", 5, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1802, 1307, 1307, 3282), "item", list(12004), "itemnum", list(3800), "piecenum", 60, "lvcondition", 36, "joblv", 19, "servantShow", "【进阶5】裁缝效率+44%"),
    258, map("id", 258, "servant", 40019, "lv", 6, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2116, 1535, 1535, 3853), "item", list(12004), "itemnum", list(6800), "piecenum", 100, "lvcondition", 45, "joblv", 20, "servantShow", "【进阶6】裁缝效率+52%"),
    259, map("id", 259, "servant", 40019, "lv", 7, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2419, 1755, 1755, 4406), "item", list(12004), "itemnum", list(11800), "piecenum", 140, "lvcondition", 1, "joblv", 21, "servantShow", "【进阶7】裁缝效率+60%"),
    260, map("id", 260, "servant", 40019, "lv", 8, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2714, 1969, 1969, 4943), "item", list(12004), "itemnum", list(19800), "piecenum", 180, "lvcondition", 9, "joblv", 22, "servantShow", "【进阶8】裁缝效率+68%")
);
    }

    private static void init52() {
data.map(
    261, map("id", 261, "servant", 40019, "lv", 9, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3001, 2177, 2177, 5466), "item", list(12004), "itemnum", list(31800), "piecenum", 220, "lvcondition", 18, "joblv", 23, "servantShow", "【进阶9】裁缝效率+76%"),
    262, map("id", 262, "servant", 40019, "lv", 10, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3282, 2380, 2380, 5976), "item", list(12004), "itemnum", list(47800), "piecenum", 260, "lvcondition", 27, "joblv", 24, "servantShow", "【进阶10】裁缝效率+84%"),
    263, map("id", 263, "servant", 40019, "lv", 11, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3556, 2579, 2579, 6476), "item", list(12004), "itemnum", list(67800), "piecenum", 300, "lvcondition", 36, "joblv", 25, "servantShow", "【进阶11】裁缝效率+92%"),
    264, map("id", 264, "servant", 40019, "lv", 12, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3824, 2774, 2774, 6966), "item", list(12004), "itemnum", list(91800), "piecenum", 360, "lvcondition", 45, "joblv", 26, "servantShow", "【进阶12】裁缝效率+100%"),
    265, map("id", 265, "servant", 40020, "lv", 1, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(419, 304, 304, 763), "item", list(12004), "itemnum", list(100), "piecenum", 0, "lvcondition", 1, "joblv", 28, "servantShow", "【进阶1】诗人效率+12%")
);
    }

    private static void init53() {
data.map(
    266, map("id", 266, "servant", 40020, "lv", 2, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(788, 571, 571, 1434), "item", list(12004), "itemnum", list(300), "piecenum", 0, "lvcondition", 9, "joblv", 29, "servantShow", "【进阶2】诗人效率+20%"),
    267, map("id", 267, "servant", 40020, "lv", 3, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1140, 826, 826, 2076), "item", list(12004), "itemnum", list(800), "piecenum", 20, "lvcondition", 18, "joblv", 30, "servantShow", "【进阶3】诗人效率+28%"),
    268, map("id", 268, "servant", 40020, "lv", 4, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1478, 1071, 1071, 2691), "item", list(12004), "itemnum", list(1800), "piecenum", 40, "lvcondition", 27, "joblv", 31, "servantShow", "【进阶4】诗人效率+36%"),
    269, map("id", 269, "servant", 40020, "lv", 5, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1802, 1307, 1307, 3282), "item", list(12004), "itemnum", list(3800), "piecenum", 60, "lvcondition", 36, "joblv", 32, "servantShow", "【进阶5】诗人效率+44%"),
    270, map("id", 270, "servant", 40020, "lv", 6, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2116, 1535, 1535, 3853), "item", list(12004), "itemnum", list(6800), "piecenum", 100, "lvcondition", 45, "joblv", 33, "servantShow", "【进阶6】诗人效率+52%")
);
    }

    private static void init54() {
data.map(
    271, map("id", 271, "servant", 40020, "lv", 7, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2419, 1755, 1755, 4406), "item", list(12004), "itemnum", list(11800), "piecenum", 140, "lvcondition", 1, "joblv", 34, "servantShow", "【进阶7】诗人效率+60%"),
    272, map("id", 272, "servant", 40020, "lv", 8, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2714, 1969, 1969, 4943), "item", list(12004), "itemnum", list(19800), "piecenum", 180, "lvcondition", 9, "joblv", 35, "servantShow", "【进阶8】诗人效率+68%"),
    273, map("id", 273, "servant", 40020, "lv", 9, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3001, 2177, 2177, 5466), "item", list(12004), "itemnum", list(31800), "piecenum", 220, "lvcondition", 18, "joblv", 36, "servantShow", "【进阶9】诗人效率+76%"),
    274, map("id", 274, "servant", 40020, "lv", 10, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3282, 2380, 2380, 5976), "item", list(12004), "itemnum", list(47800), "piecenum", 260, "lvcondition", 27, "joblv", 37, "servantShow", "【进阶10】诗人效率+84%"),
    275, map("id", 275, "servant", 40020, "lv", 11, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3556, 2579, 2579, 6476), "item", list(12004), "itemnum", list(67800), "piecenum", 300, "lvcondition", 36, "joblv", 38, "servantShow", "【进阶11】诗人效率+92%")
);
    }

    private static void init55() {
data.map(
    276, map("id", 276, "servant", 40020, "lv", 12, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3824, 2774, 2774, 6966), "item", list(12004), "itemnum", list(91800), "piecenum", 360, "lvcondition", 45, "joblv", 39, "servantShow", "【进阶12】诗人效率+100%"),
    277, map("id", 277, "servant", 40021, "lv", 1, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(419, 304, 304, 763), "item", list(12004), "itemnum", list(100), "piecenum", 0, "lvcondition", 1, "joblv", 2, "servantShow", "【进阶1】伐木效率+12%"),
    278, map("id", 278, "servant", 40021, "lv", 2, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(788, 571, 571, 1434), "item", list(12004), "itemnum", list(300), "piecenum", 0, "lvcondition", 9, "joblv", 3, "servantShow", "【进阶2】伐木效率+20%"),
    279, map("id", 279, "servant", 40021, "lv", 3, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1140, 826, 826, 2076), "item", list(12004), "itemnum", list(800), "piecenum", 20, "lvcondition", 18, "joblv", 4, "servantShow", "【进阶3】伐木效率+28%"),
    280, map("id", 280, "servant", 40021, "lv", 4, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1478, 1071, 1071, 2691), "item", list(12004), "itemnum", list(1800), "piecenum", 40, "lvcondition", 27, "joblv", 5, "servantShow", "【进阶4】伐木效率+36%")
);
    }

    private static void init56() {
data.map(
    281, map("id", 281, "servant", 40021, "lv", 5, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1802, 1307, 1307, 3282), "item", list(12004), "itemnum", list(3800), "piecenum", 60, "lvcondition", 36, "joblv", 6, "servantShow", "【进阶5】伐木效率+44%"),
    282, map("id", 282, "servant", 40021, "lv", 6, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2116, 1535, 1535, 3853), "item", list(12004), "itemnum", list(6800), "piecenum", 100, "lvcondition", 45, "joblv", 7, "servantShow", "【进阶6】伐木效率+52%"),
    283, map("id", 283, "servant", 40021, "lv", 7, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2419, 1755, 1755, 4406), "item", list(12004), "itemnum", list(11800), "piecenum", 140, "lvcondition", 1, "joblv", 8, "servantShow", "【进阶7】伐木效率+60%"),
    284, map("id", 284, "servant", 40021, "lv", 8, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2714, 1969, 1969, 4943), "item", list(12004), "itemnum", list(19800), "piecenum", 180, "lvcondition", 9, "joblv", 9, "servantShow", "【进阶8】伐木效率+68%"),
    285, map("id", 285, "servant", 40021, "lv", 9, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3001, 2177, 2177, 5466), "item", list(12004), "itemnum", list(31800), "piecenum", 220, "lvcondition", 18, "joblv", 10, "servantShow", "【进阶9】伐木效率+76%")
);
    }

    private static void init57() {
data.map(
    286, map("id", 286, "servant", 40021, "lv", 10, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3282, 2380, 2380, 5976), "item", list(12004), "itemnum", list(47800), "piecenum", 260, "lvcondition", 27, "joblv", 11, "servantShow", "【进阶10】伐木效率+84%"),
    287, map("id", 287, "servant", 40021, "lv", 11, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3556, 2579, 2579, 6476), "item", list(12004), "itemnum", list(67800), "piecenum", 300, "lvcondition", 36, "joblv", 12, "servantShow", "【进阶11】伐木效率+92%"),
    288, map("id", 288, "servant", 40021, "lv", 12, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3824, 2774, 2774, 6966), "item", list(12004), "itemnum", list(91800), "piecenum", 360, "lvcondition", 45, "joblv", 13, "servantShow", "【进阶12】伐木效率+100%"),
    289, map("id", 289, "servant", 40022, "lv", 1, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(419, 304, 304, 763), "item", list(12004), "itemnum", list(100), "piecenum", 0, "lvcondition", 1, "joblv", 15, "servantShow", "【进阶1】裁缝效率+12%"),
    290, map("id", 290, "servant", 40022, "lv", 2, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(788, 571, 571, 1434), "item", list(12004), "itemnum", list(300), "piecenum", 0, "lvcondition", 9, "joblv", 16, "servantShow", "【进阶2】裁缝效率+20%")
);
    }

    private static void init58() {
data.map(
    291, map("id", 291, "servant", 40022, "lv", 3, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1140, 826, 826, 2076), "item", list(12004), "itemnum", list(800), "piecenum", 20, "lvcondition", 18, "joblv", 17, "servantShow", "【进阶3】裁缝效率+28%"),
    292, map("id", 292, "servant", 40022, "lv", 4, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1478, 1071, 1071, 2691), "item", list(12004), "itemnum", list(1800), "piecenum", 40, "lvcondition", 27, "joblv", 18, "servantShow", "【进阶4】裁缝效率+36%"),
    293, map("id", 293, "servant", 40022, "lv", 5, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1802, 1307, 1307, 3282), "item", list(12004), "itemnum", list(3800), "piecenum", 60, "lvcondition", 36, "joblv", 19, "servantShow", "【进阶5】裁缝效率+44%"),
    294, map("id", 294, "servant", 40022, "lv", 6, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2116, 1535, 1535, 3853), "item", list(12004), "itemnum", list(6800), "piecenum", 100, "lvcondition", 45, "joblv", 20, "servantShow", "【进阶6】裁缝效率+52%"),
    295, map("id", 295, "servant", 40022, "lv", 7, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2419, 1755, 1755, 4406), "item", list(12004), "itemnum", list(11800), "piecenum", 140, "lvcondition", 1, "joblv", 21, "servantShow", "【进阶7】裁缝效率+60%")
);
    }

    private static void init59() {
data.map(
    296, map("id", 296, "servant", 40022, "lv", 8, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2714, 1969, 1969, 4943), "item", list(12004), "itemnum", list(19800), "piecenum", 180, "lvcondition", 9, "joblv", 22, "servantShow", "【进阶8】裁缝效率+68%"),
    297, map("id", 297, "servant", 40022, "lv", 9, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3001, 2177, 2177, 5466), "item", list(12004), "itemnum", list(31800), "piecenum", 220, "lvcondition", 18, "joblv", 23, "servantShow", "【进阶9】裁缝效率+76%"),
    298, map("id", 298, "servant", 40022, "lv", 10, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3282, 2380, 2380, 5976), "item", list(12004), "itemnum", list(47800), "piecenum", 260, "lvcondition", 27, "joblv", 24, "servantShow", "【进阶10】裁缝效率+84%"),
    299, map("id", 299, "servant", 40022, "lv", 11, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3556, 2579, 2579, 6476), "item", list(12004), "itemnum", list(67800), "piecenum", 300, "lvcondition", 36, "joblv", 25, "servantShow", "【进阶11】裁缝效率+92%"),
    300, map("id", 300, "servant", 40022, "lv", 12, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3824, 2774, 2774, 6966), "item", list(12004), "itemnum", list(91800), "piecenum", 360, "lvcondition", 45, "joblv", 26, "servantShow", "【进阶12】裁缝效率+100%")
);
    }

    private static void init60() {
data.map(
    301, map("id", 301, "servant", 40023, "lv", 1, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(447, 324, 324, 815), "item", list(12004), "itemnum", list(100), "piecenum", 0, "lvcondition", 1, "joblv", 28, "servantShow", "【进阶1】诗人效率+12%"),
    302, map("id", 302, "servant", 40023, "lv", 2, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(868, 629, 629, 1581), "item", list(12004), "itemnum", list(300), "piecenum", 0, "lvcondition", 9, "joblv", 29, "servantShow", "【进阶2】诗人效率+20%"),
    303, map("id", 303, "servant", 40023, "lv", 3, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1293, 937, 937, 2356), "item", list(12004), "itemnum", list(800), "piecenum", 20, "lvcondition", 18, "joblv", 30, "servantShow", "【进阶3】诗人效率+28%"),
    304, map("id", 304, "servant", 40023, "lv", 4, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1722, 1248, 1248, 3138), "item", list(12004), "itemnum", list(1800), "piecenum", 40, "lvcondition", 27, "joblv", 31, "servantShow", "【进阶4】诗人效率+36%"),
    305, map("id", 305, "servant", 40023, "lv", 5, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2154, 1562, 1562, 3926), "item", list(12004), "itemnum", list(3800), "piecenum", 60, "lvcondition", 36, "joblv", 32, "servantShow", "【进阶5】诗人效率+44%")
);
    }

    private static void init61() {
data.map(
    306, map("id", 306, "servant", 40023, "lv", 6, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2591, 1879, 1879, 4721), "item", list(12004), "itemnum", list(6800), "piecenum", 100, "lvcondition", 45, "joblv", 33, "servantShow", "【进阶6】诗人效率+52%"),
    307, map("id", 307, "servant", 40023, "lv", 7, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3031, 2198, 2198, 5523), "item", list(12004), "itemnum", list(11800), "piecenum", 140, "lvcondition", 1, "joblv", 34, "servantShow", "【进阶7】诗人效率+60%"),
    308, map("id", 308, "servant", 40023, "lv", 8, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3474, 2519, 2519, 6330), "item", list(12004), "itemnum", list(19800), "piecenum", 180, "lvcondition", 9, "joblv", 35, "servantShow", "【进阶8】诗人效率+68%"),
    309, map("id", 309, "servant", 40023, "lv", 9, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3920, 2843, 2843, 7142), "item", list(12004), "itemnum", list(31800), "piecenum", 220, "lvcondition", 18, "joblv", 36, "servantShow", "【进阶9】诗人效率+76%"),
    310, map("id", 310, "servant", 40023, "lv", 10, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(4369, 3169, 3169, 7959), "item", list(12004), "itemnum", list(47800), "piecenum", 260, "lvcondition", 27, "joblv", 37, "servantShow", "【进阶10】诗人效率+84%")
);
    }

    private static void init62() {
data.map(
    311, map("id", 311, "servant", 40023, "lv", 11, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(4820, 3497, 3497, 8781), "item", list(12004), "itemnum", list(67800), "piecenum", 300, "lvcondition", 36, "joblv", 38, "servantShow", "【进阶11】诗人效率+92%"),
    312, map("id", 312, "servant", 40023, "lv", 12, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(5273, 3826, 3826, 9608), "item", list(12004), "itemnum", list(91800), "piecenum", 360, "lvcondition", 45, "joblv", 39, "servantShow", "【进阶12】诗人效率+100%"),
    313, map("id", 313, "servant", 40024, "lv", 1, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(5273, 3826, 3826, 9608), "item", list(12004), "itemnum", list(100), "piecenum", 0, "lvcondition", 1, "joblv", 2, "servantShow", "【进阶1】伐木效率+12%"),
    314, map("id", 314, "servant", 40024, "lv", 2, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1300, 456, 456, 19500), "item", list(12004), "itemnum", list(300), "piecenum", 0, "lvcondition", 9, "joblv", 3, "servantShow", "【进阶2】伐木效率+20%"),
    315, map("id", 315, "servant", 40024, "lv", 3, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1950, 684, 684, 29250), "item", list(12004), "itemnum", list(800), "piecenum", 20, "lvcondition", 18, "joblv", 4, "servantShow", "【进阶3】伐木效率+28%")
);
    }

    private static void init63() {
data.map(
    316, map("id", 316, "servant", 40024, "lv", 4, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2600, 912, 912, 39000), "item", list(12004), "itemnum", list(1800), "piecenum", 40, "lvcondition", 27, "joblv", 5, "servantShow", "【进阶4】伐木效率+36%"),
    317, map("id", 317, "servant", 40024, "lv", 5, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3250, 1140, 1140, 48750), "item", list(12004), "itemnum", list(3800), "piecenum", 60, "lvcondition", 36, "joblv", 6, "servantShow", "【进阶5】伐木效率+44%"),
    318, map("id", 318, "servant", 40024, "lv", 6, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3900, 1368, 1368, 58500), "item", list(12004), "itemnum", list(6800), "piecenum", 100, "lvcondition", 45, "joblv", 7, "servantShow", "【进阶6】伐木效率+52%"),
    319, map("id", 319, "servant", 40024, "lv", 7, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(650, 228, 228, 9750), "item", list(12004), "itemnum", list(11800), "piecenum", 140, "lvcondition", 1, "joblv", 8, "servantShow", "【进阶7】伐木效率+60%"),
    320, map("id", 320, "servant", 40024, "lv", 8, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1300, 456, 456, 19500), "item", list(12004), "itemnum", list(19800), "piecenum", 180, "lvcondition", 9, "joblv", 9, "servantShow", "【进阶8】伐木效率+68%")
);
    }

    private static void init64() {
data.map(
    321, map("id", 321, "servant", 40024, "lv", 9, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1950, 684, 684, 29250), "item", list(12004), "itemnum", list(31800), "piecenum", 220, "lvcondition", 18, "joblv", 10, "servantShow", "【进阶9】伐木效率+76%"),
    322, map("id", 322, "servant", 40024, "lv", 10, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2600, 912, 912, 39000), "item", list(12004), "itemnum", list(47800), "piecenum", 260, "lvcondition", 27, "joblv", 11, "servantShow", "【进阶10】伐木效率+84%"),
    323, map("id", 323, "servant", 40024, "lv", 11, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3250, 1140, 1140, 48750), "item", list(12004), "itemnum", list(67800), "piecenum", 300, "lvcondition", 36, "joblv", 12, "servantShow", "【进阶11】伐木效率+92%"),
    324, map("id", 324, "servant", 40024, "lv", 12, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3900, 1368, 1368, 58500), "item", list(12004), "itemnum", list(91800), "piecenum", 360, "lvcondition", 45, "joblv", 13, "servantShow", "【进阶12】伐木效率+100%"),
    325, map("id", 325, "servant", 40025, "lv", 1, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(447, 324, 324, 815), "item", list(12004), "itemnum", list(100), "piecenum", 0, "lvcondition", 1, "joblv", 15, "servantShow", "【进阶1】裁缝效率+12%")
);
    }

    private static void init65() {
data.map(
    326, map("id", 326, "servant", 40025, "lv", 2, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(868, 629, 629, 1581), "item", list(12004), "itemnum", list(300), "piecenum", 0, "lvcondition", 9, "joblv", 16, "servantShow", "【进阶2】裁缝效率+20%"),
    327, map("id", 327, "servant", 40025, "lv", 3, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1293, 937, 937, 2356), "item", list(12004), "itemnum", list(800), "piecenum", 20, "lvcondition", 18, "joblv", 17, "servantShow", "【进阶3】裁缝效率+28%"),
    328, map("id", 328, "servant", 40025, "lv", 4, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1722, 1248, 1248, 3138), "item", list(12004), "itemnum", list(1800), "piecenum", 40, "lvcondition", 27, "joblv", 18, "servantShow", "【进阶4】裁缝效率+36%"),
    329, map("id", 329, "servant", 40025, "lv", 5, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2154, 1562, 1562, 3926), "item", list(12004), "itemnum", list(3800), "piecenum", 60, "lvcondition", 36, "joblv", 19, "servantShow", "【进阶5】裁缝效率+44%"),
    330, map("id", 330, "servant", 40025, "lv", 6, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2591, 1879, 1879, 4721), "item", list(12004), "itemnum", list(6800), "piecenum", 100, "lvcondition", 45, "joblv", 20, "servantShow", "【进阶6】裁缝效率+52%")
);
    }

    private static void init66() {
data.map(
    331, map("id", 331, "servant", 40025, "lv", 7, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3031, 2198, 2198, 5523), "item", list(12004), "itemnum", list(11800), "piecenum", 140, "lvcondition", 1, "joblv", 21, "servantShow", "【进阶7】裁缝效率+60%"),
    332, map("id", 332, "servant", 40025, "lv", 8, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3474, 2519, 2519, 6330), "item", list(12004), "itemnum", list(19800), "piecenum", 180, "lvcondition", 9, "joblv", 22, "servantShow", "【进阶8】裁缝效率+68%"),
    333, map("id", 333, "servant", 40025, "lv", 9, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3920, 2843, 2843, 7142), "item", list(12004), "itemnum", list(31800), "piecenum", 220, "lvcondition", 18, "joblv", 23, "servantShow", "【进阶9】裁缝效率+76%"),
    334, map("id", 334, "servant", 40025, "lv", 10, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(4369, 3169, 3169, 7959), "item", list(12004), "itemnum", list(47800), "piecenum", 260, "lvcondition", 27, "joblv", 24, "servantShow", "【进阶10】裁缝效率+84%"),
    335, map("id", 335, "servant", 40025, "lv", 11, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(4820, 3497, 3497, 8781), "item", list(12004), "itemnum", list(67800), "piecenum", 300, "lvcondition", 36, "joblv", 25, "servantShow", "【进阶11】裁缝效率+92%")
);
    }

    private static void init67() {
data.map(
    336, map("id", 336, "servant", 40025, "lv", 12, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(5273, 3826, 3826, 9608), "item", list(12004), "itemnum", list(91800), "piecenum", 360, "lvcondition", 45, "joblv", 26, "servantShow", "【进阶12】裁缝效率+100%"),
    337, map("id", 337, "servant", 40026, "lv", 1, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(405, 293, 293, 737), "item", list(12004), "itemnum", list(100), "piecenum", 0, "lvcondition", 1, "joblv", 28, "servantShow", "【进阶1】诗人效率+12%"),
    338, map("id", 338, "servant", 40026, "lv", 2, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(749, 542, 542, 1363), "item", list(12004), "itemnum", list(300), "piecenum", 0, "lvcondition", 9, "joblv", 29, "servantShow", "【进阶2】诗人效率+20%"),
    339, map("id", 339, "servant", 40026, "lv", 3, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1068, 774, 774, 1945), "item", list(12004), "itemnum", list(800), "piecenum", 20, "lvcondition", 18, "joblv", 30, "servantShow", "【进阶3】诗人效率+28%"),
    340, map("id", 340, "servant", 40026, "lv", 4, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1366, 990, 990, 2488), "item", list(12004), "itemnum", list(1800), "piecenum", 40, "lvcondition", 27, "joblv", 31, "servantShow", "【进阶4】诗人效率+36%")
);
    }

    private static void init68() {
data.map(
    341, map("id", 341, "servant", 40026, "lv", 5, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1646, 1193, 1193, 2998), "item", list(12004), "itemnum", list(3800), "piecenum", 60, "lvcondition", 36, "joblv", 32, "servantShow", "【进阶5】诗人效率+44%"),
    342, map("id", 342, "servant", 40026, "lv", 6, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1911, 1386, 1386, 3480), "item", list(12004), "itemnum", list(6800), "piecenum", 100, "lvcondition", 45, "joblv", 33, "servantShow", "【进阶6】诗人效率+52%"),
    343, map("id", 343, "servant", 40026, "lv", 7, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2162, 1568, 1568, 3939), "item", list(12004), "itemnum", list(11800), "piecenum", 140, "lvcondition", 1, "joblv", 34, "servantShow", "【进阶7】诗人效率+60%"),
    344, map("id", 344, "servant", 40026, "lv", 8, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2403, 1743, 1743, 4378), "item", list(12004), "itemnum", list(19800), "piecenum", 180, "lvcondition", 9, "joblv", 35, "servantShow", "【进阶8】诗人效率+68%"),
    345, map("id", 345, "servant", 40026, "lv", 9, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2634, 1911, 1911, 4799), "item", list(12004), "itemnum", list(31800), "piecenum", 220, "lvcondition", 18, "joblv", 36, "servantShow", "【进阶9】诗人效率+76%")
);
    }

    private static void init69() {
data.map(
    346, map("id", 346, "servant", 40026, "lv", 10, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2858, 2073, 2073, 5205), "item", list(12004), "itemnum", list(47800), "piecenum", 260, "lvcondition", 27, "joblv", 37, "servantShow", "【进阶10】诗人效率+84%"),
    347, map("id", 347, "servant", 40026, "lv", 11, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3074, 2230, 2230, 5600), "item", list(12004), "itemnum", list(67800), "piecenum", 300, "lvcondition", 36, "joblv", 38, "servantShow", "【进阶11】诗人效率+92%"),
    348, map("id", 348, "servant", 40026, "lv", 12, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3284, 2383, 2383, 5984), "item", list(12004), "itemnum", list(91800), "piecenum", 360, "lvcondition", 45, "joblv", 39, "servantShow", "【进阶12】诗人效率+100%"),
    349, map("id", 349, "servant", 40027, "lv", 1, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(650, 228, 228, 9750), "item", list(12004), "itemnum", list(100), "piecenum", 0, "lvcondition", 1, "joblv", 2, "servantShow", "【进阶1】伐木效率+12%"),
    350, map("id", 350, "servant", 40027, "lv", 2, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1300, 456, 456, 19500), "item", list(12004), "itemnum", list(300), "piecenum", 0, "lvcondition", 9, "joblv", 3, "servantShow", "【进阶2】伐木效率+20%")
);
    }

    private static void init70() {
data.map(
    351, map("id", 351, "servant", 40027, "lv", 3, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1950, 684, 684, 29250), "item", list(12004), "itemnum", list(800), "piecenum", 20, "lvcondition", 18, "joblv", 4, "servantShow", "【进阶3】伐木效率+28%"),
    352, map("id", 352, "servant", 40027, "lv", 4, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2600, 912, 912, 39000), "item", list(12004), "itemnum", list(1800), "piecenum", 40, "lvcondition", 27, "joblv", 5, "servantShow", "【进阶4】伐木效率+36%"),
    353, map("id", 353, "servant", 40027, "lv", 5, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3250, 1140, 1140, 48750), "item", list(12004), "itemnum", list(3800), "piecenum", 60, "lvcondition", 36, "joblv", 6, "servantShow", "【进阶5】伐木效率+44%"),
    354, map("id", 354, "servant", 40027, "lv", 6, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3900, 1368, 1368, 58500), "item", list(12004), "itemnum", list(6800), "piecenum", 100, "lvcondition", 45, "joblv", 7, "servantShow", "【进阶6】伐木效率+52%"),
    355, map("id", 355, "servant", 40027, "lv", 7, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(650, 228, 228, 9750), "item", list(12004), "itemnum", list(11800), "piecenum", 140, "lvcondition", 1, "joblv", 8, "servantShow", "【进阶7】伐木效率+60%")
);
    }

    private static void init71() {
data.map(
    356, map("id", 356, "servant", 40027, "lv", 8, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1300, 456, 456, 19500), "item", list(12004), "itemnum", list(19800), "piecenum", 180, "lvcondition", 9, "joblv", 9, "servantShow", "【进阶8】伐木效率+68%"),
    357, map("id", 357, "servant", 40027, "lv", 9, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1950, 684, 684, 29250), "item", list(12004), "itemnum", list(31800), "piecenum", 220, "lvcondition", 18, "joblv", 10, "servantShow", "【进阶9】伐木效率+76%"),
    358, map("id", 358, "servant", 40027, "lv", 10, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2600, 912, 912, 39000), "item", list(12004), "itemnum", list(47800), "piecenum", 260, "lvcondition", 27, "joblv", 11, "servantShow", "【进阶10】伐木效率+84%"),
    359, map("id", 359, "servant", 40027, "lv", 11, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3250, 1140, 1140, 48750), "item", list(12004), "itemnum", list(67800), "piecenum", 300, "lvcondition", 36, "joblv", 12, "servantShow", "【进阶11】伐木效率+92%"),
    360, map("id", 360, "servant", 40027, "lv", 12, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3900, 1368, 1368, 58500), "item", list(12004), "itemnum", list(91800), "piecenum", 360, "lvcondition", 45, "joblv", 13, "servantShow", "【进阶12】伐木效率+100%")
);
    }

    private static void init72() {
data.map(
    361, map("id", 361, "servant", 40028, "lv", 1, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(405, 293, 293, 737), "item", list(12004), "itemnum", list(100), "piecenum", 0, "lvcondition", 1, "joblv", 15, "servantShow", "【进阶1】裁缝效率+12%"),
    362, map("id", 362, "servant", 40028, "lv", 2, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(749, 542, 542, 1363), "item", list(12004), "itemnum", list(300), "piecenum", 0, "lvcondition", 9, "joblv", 16, "servantShow", "【进阶2】裁缝效率+20%"),
    363, map("id", 363, "servant", 40028, "lv", 3, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1068, 774, 774, 1945), "item", list(12004), "itemnum", list(800), "piecenum", 20, "lvcondition", 18, "joblv", 17, "servantShow", "【进阶3】裁缝效率+28%"),
    364, map("id", 364, "servant", 40028, "lv", 4, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1366, 990, 990, 2488), "item", list(12004), "itemnum", list(1800), "piecenum", 40, "lvcondition", 27, "joblv", 18, "servantShow", "【进阶4】裁缝效率+36%"),
    365, map("id", 365, "servant", 40028, "lv", 5, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1646, 1193, 1193, 2998), "item", list(12004), "itemnum", list(3800), "piecenum", 60, "lvcondition", 36, "joblv", 19, "servantShow", "【进阶5】裁缝效率+44%")
);
    }

    private static void init73() {
data.map(
    366, map("id", 366, "servant", 40028, "lv", 6, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1911, 1386, 1386, 3480), "item", list(12004), "itemnum", list(6800), "piecenum", 100, "lvcondition", 45, "joblv", 20, "servantShow", "【进阶6】裁缝效率+52%"),
    367, map("id", 367, "servant", 40028, "lv", 7, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2162, 1568, 1568, 3939), "item", list(12004), "itemnum", list(11800), "piecenum", 140, "lvcondition", 1, "joblv", 21, "servantShow", "【进阶7】裁缝效率+60%"),
    368, map("id", 368, "servant", 40028, "lv", 8, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2403, 1743, 1743, 4378), "item", list(12004), "itemnum", list(19800), "piecenum", 180, "lvcondition", 9, "joblv", 22, "servantShow", "【进阶8】裁缝效率+68%"),
    369, map("id", 369, "servant", 40028, "lv", 9, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2634, 1911, 1911, 4799), "item", list(12004), "itemnum", list(31800), "piecenum", 220, "lvcondition", 18, "joblv", 23, "servantShow", "【进阶9】裁缝效率+76%"),
    370, map("id", 370, "servant", 40028, "lv", 10, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2858, 2073, 2073, 5205), "item", list(12004), "itemnum", list(47800), "piecenum", 260, "lvcondition", 27, "joblv", 24, "servantShow", "【进阶10】裁缝效率+84%")
);
    }

    private static void init74() {
data.map(
    371, map("id", 371, "servant", 40028, "lv", 11, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3074, 2230, 2230, 5600), "item", list(12004), "itemnum", list(67800), "piecenum", 300, "lvcondition", 36, "joblv", 25, "servantShow", "【进阶11】裁缝效率+92%"),
    372, map("id", 372, "servant", 40028, "lv", 12, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3284, 2383, 2383, 5984), "item", list(12004), "itemnum", list(91800), "piecenum", 360, "lvcondition", 45, "joblv", 26, "servantShow", "【进阶12】裁缝效率+100%"),
    373, map("id", 373, "servant", 40029, "lv", 1, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(405, 293, 293, 737), "item", list(12004), "itemnum", list(100), "piecenum", 0, "lvcondition", 1, "joblv", 28, "servantShow", "【进阶1】诗人效率+12%"),
    374, map("id", 374, "servant", 40029, "lv", 2, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(749, 542, 542, 1363), "item", list(12004), "itemnum", list(300), "piecenum", 0, "lvcondition", 9, "joblv", 29, "servantShow", "【进阶2】诗人效率+20%"),
    375, map("id", 375, "servant", 40029, "lv", 3, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1068, 774, 774, 1945), "item", list(12004), "itemnum", list(800), "piecenum", 20, "lvcondition", 18, "joblv", 30, "servantShow", "【进阶3】诗人效率+28%")
);
    }

    private static void init75() {
data.map(
    376, map("id", 376, "servant", 40029, "lv", 4, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1366, 990, 990, 2488), "item", list(12004), "itemnum", list(1800), "piecenum", 40, "lvcondition", 27, "joblv", 31, "servantShow", "【进阶4】诗人效率+36%"),
    377, map("id", 377, "servant", 40029, "lv", 5, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1646, 1193, 1193, 2998), "item", list(12004), "itemnum", list(3800), "piecenum", 60, "lvcondition", 36, "joblv", 32, "servantShow", "【进阶5】诗人效率+44%"),
    378, map("id", 378, "servant", 40029, "lv", 6, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1911, 1386, 1386, 3480), "item", list(12004), "itemnum", list(6800), "piecenum", 100, "lvcondition", 45, "joblv", 33, "servantShow", "【进阶6】诗人效率+52%"),
    379, map("id", 379, "servant", 40029, "lv", 7, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2162, 1568, 1568, 3939), "item", list(12004), "itemnum", list(11800), "piecenum", 140, "lvcondition", 1, "joblv", 34, "servantShow", "【进阶7】诗人效率+60%"),
    380, map("id", 380, "servant", 40029, "lv", 8, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2403, 1743, 1743, 4378), "item", list(12004), "itemnum", list(19800), "piecenum", 180, "lvcondition", 9, "joblv", 35, "servantShow", "【进阶8】诗人效率+68%")
);
    }

    private static void init76() {
data.map(
    381, map("id", 381, "servant", 40029, "lv", 9, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2634, 1911, 1911, 4799), "item", list(12004), "itemnum", list(31800), "piecenum", 220, "lvcondition", 18, "joblv", 36, "servantShow", "【进阶9】诗人效率+76%"),
    382, map("id", 382, "servant", 40029, "lv", 10, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2858, 2073, 2073, 5205), "item", list(12004), "itemnum", list(47800), "piecenum", 260, "lvcondition", 27, "joblv", 37, "servantShow", "【进阶10】诗人效率+84%"),
    383, map("id", 383, "servant", 40029, "lv", 11, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3074, 2230, 2230, 5600), "item", list(12004), "itemnum", list(67800), "piecenum", 300, "lvcondition", 36, "joblv", 38, "servantShow", "【进阶11】诗人效率+92%"),
    384, map("id", 384, "servant", 40029, "lv", 12, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3284, 2383, 2383, 5984), "item", list(12004), "itemnum", list(91800), "piecenum", 360, "lvcondition", 45, "joblv", 39, "servantShow", "【进阶12】诗人效率+100%"),
    385, map("id", 385, "servant", 40030, "lv", 1, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(405, 293, 293, 737), "item", list(12004), "itemnum", list(100), "piecenum", 0, "lvcondition", 1, "joblv", 2, "servantShow", "【进阶1】伐木效率+12%")
);
    }

    private static void init77() {
data.map(
    386, map("id", 386, "servant", 40030, "lv", 2, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(749, 542, 542, 1363), "item", list(12004), "itemnum", list(300), "piecenum", 0, "lvcondition", 9, "joblv", 3, "servantShow", "【进阶2】伐木效率+20%"),
    387, map("id", 387, "servant", 40030, "lv", 3, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1068, 774, 774, 1945), "item", list(12004), "itemnum", list(800), "piecenum", 20, "lvcondition", 18, "joblv", 4, "servantShow", "【进阶3】伐木效率+28%"),
    388, map("id", 388, "servant", 40030, "lv", 4, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1366, 990, 990, 2488), "item", list(12004), "itemnum", list(1800), "piecenum", 40, "lvcondition", 27, "joblv", 5, "servantShow", "【进阶4】伐木效率+36%"),
    389, map("id", 389, "servant", 40030, "lv", 5, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1646, 1193, 1193, 2998), "item", list(12004), "itemnum", list(3800), "piecenum", 60, "lvcondition", 36, "joblv", 6, "servantShow", "【进阶5】伐木效率+44%"),
    390, map("id", 390, "servant", 40030, "lv", 6, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1911, 1386, 1386, 3480), "item", list(12004), "itemnum", list(6800), "piecenum", 100, "lvcondition", 45, "joblv", 7, "servantShow", "【进阶6】伐木效率+52%")
);
    }

    private static void init78() {
data.map(
    391, map("id", 391, "servant", 40030, "lv", 7, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2162, 1568, 1568, 3939), "item", list(12004), "itemnum", list(11800), "piecenum", 140, "lvcondition", 1, "joblv", 8, "servantShow", "【进阶7】伐木效率+60%"),
    392, map("id", 392, "servant", 40030, "lv", 8, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2403, 1743, 1743, 4378), "item", list(12004), "itemnum", list(19800), "piecenum", 180, "lvcondition", 9, "joblv", 9, "servantShow", "【进阶8】伐木效率+68%"),
    393, map("id", 393, "servant", 40030, "lv", 9, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2634, 1911, 1911, 4799), "item", list(12004), "itemnum", list(31800), "piecenum", 220, "lvcondition", 18, "joblv", 10, "servantShow", "【进阶9】伐木效率+76%"),
    394, map("id", 394, "servant", 40030, "lv", 10, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2858, 2073, 2073, 5205), "item", list(12004), "itemnum", list(47800), "piecenum", 260, "lvcondition", 27, "joblv", 11, "servantShow", "【进阶10】伐木效率+84%"),
    395, map("id", 395, "servant", 40030, "lv", 11, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3074, 2230, 2230, 5600), "item", list(12004), "itemnum", list(67800), "piecenum", 300, "lvcondition", 36, "joblv", 12, "servantShow", "【进阶11】伐木效率+92%")
);
    }

    private static void init79() {
data.map(
    396, map("id", 396, "servant", 40030, "lv", 12, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3284, 2383, 2383, 5984), "item", list(12004), "itemnum", list(91800), "piecenum", 360, "lvcondition", 45, "joblv", 13, "servantShow", "【进阶12】伐木效率+100%"),
    397, map("id", 397, "servant", 40031, "lv", 1, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(650, 228, 228, 9750), "item", list(12004), "itemnum", list(100), "piecenum", 0, "lvcondition", 1, "joblv", 15, "servantShow", "【进阶1】裁缝效率+12%"),
    398, map("id", 398, "servant", 40031, "lv", 2, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1300, 456, 456, 19500), "item", list(12004), "itemnum", list(300), "piecenum", 0, "lvcondition", 9, "joblv", 16, "servantShow", "【进阶2】裁缝效率+20%"),
    399, map("id", 399, "servant", 40031, "lv", 3, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1950, 684, 684, 29250), "item", list(12004), "itemnum", list(800), "piecenum", 20, "lvcondition", 18, "joblv", 17, "servantShow", "【进阶3】裁缝效率+28%"),
    400, map("id", 400, "servant", 40031, "lv", 4, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2600, 912, 912, 39000), "item", list(12004), "itemnum", list(1800), "piecenum", 40, "lvcondition", 27, "joblv", 18, "servantShow", "【进阶4】裁缝效率+36%")
);
    }

    private static void init80() {
data.map(
    401, map("id", 401, "servant", 40031, "lv", 5, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3250, 1140, 1140, 48750), "item", list(12004), "itemnum", list(3800), "piecenum", 60, "lvcondition", 36, "joblv", 19, "servantShow", "【进阶5】裁缝效率+44%"),
    402, map("id", 402, "servant", 40031, "lv", 6, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3900, 1368, 1368, 58500), "item", list(12004), "itemnum", list(6800), "piecenum", 100, "lvcondition", 45, "joblv", 20, "servantShow", "【进阶6】裁缝效率+52%"),
    403, map("id", 403, "servant", 40031, "lv", 7, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(650, 228, 228, 9750), "item", list(12004), "itemnum", list(11800), "piecenum", 140, "lvcondition", 1, "joblv", 21, "servantShow", "【进阶7】裁缝效率+60%"),
    404, map("id", 404, "servant", 40031, "lv", 8, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1300, 456, 456, 19500), "item", list(12004), "itemnum", list(19800), "piecenum", 180, "lvcondition", 9, "joblv", 22, "servantShow", "【进阶8】裁缝效率+68%"),
    405, map("id", 405, "servant", 40031, "lv", 9, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1950, 684, 684, 29250), "item", list(12004), "itemnum", list(31800), "piecenum", 220, "lvcondition", 18, "joblv", 23, "servantShow", "【进阶9】裁缝效率+76%")
);
    }

    private static void init81() {
data.map(
    406, map("id", 406, "servant", 40031, "lv", 10, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2600, 912, 912, 39000), "item", list(12004), "itemnum", list(47800), "piecenum", 260, "lvcondition", 27, "joblv", 24, "servantShow", "【进阶10】裁缝效率+84%"),
    407, map("id", 407, "servant", 40031, "lv", 11, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3250, 1140, 1140, 48750), "item", list(12004), "itemnum", list(67800), "piecenum", 300, "lvcondition", 36, "joblv", 25, "servantShow", "【进阶11】裁缝效率+92%"),
    408, map("id", 408, "servant", 40031, "lv", 12, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3900, 1368, 1368, 58500), "item", list(12004), "itemnum", list(91800), "piecenum", 360, "lvcondition", 45, "joblv", 26, "servantShow", "【进阶12】裁缝效率+100%"),
    409, map("id", 409, "servant", 40032, "lv", 1, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(447, 324, 324, 815), "item", list(12004), "itemnum", list(100), "piecenum", 0, "lvcondition", 1, "joblv", 28, "servantShow", "【进阶1】诗人效率+12%"),
    410, map("id", 410, "servant", 40032, "lv", 2, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(868, 629, 629, 1581), "item", list(12004), "itemnum", list(300), "piecenum", 0, "lvcondition", 9, "joblv", 29, "servantShow", "【进阶2】诗人效率+20%")
);
    }

    private static void init82() {
data.map(
    411, map("id", 411, "servant", 40032, "lv", 3, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1293, 937, 937, 2356), "item", list(12004), "itemnum", list(800), "piecenum", 20, "lvcondition", 18, "joblv", 30, "servantShow", "【进阶3】诗人效率+28%"),
    412, map("id", 412, "servant", 40032, "lv", 4, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1722, 1248, 1248, 3138), "item", list(12004), "itemnum", list(1800), "piecenum", 40, "lvcondition", 27, "joblv", 31, "servantShow", "【进阶4】诗人效率+36%"),
    413, map("id", 413, "servant", 40032, "lv", 5, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2154, 1562, 1562, 3926), "item", list(12004), "itemnum", list(3800), "piecenum", 60, "lvcondition", 36, "joblv", 32, "servantShow", "【进阶5】诗人效率+44%"),
    414, map("id", 414, "servant", 40032, "lv", 6, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2591, 1879, 1879, 4721), "item", list(12004), "itemnum", list(6800), "piecenum", 100, "lvcondition", 45, "joblv", 33, "servantShow", "【进阶6】诗人效率+52%"),
    415, map("id", 415, "servant", 40032, "lv", 7, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3031, 2198, 2198, 5523), "item", list(12004), "itemnum", list(11800), "piecenum", 140, "lvcondition", 1, "joblv", 34, "servantShow", "【进阶7】诗人效率+60%")
);
    }

    private static void init83() {
data.map(
    416, map("id", 416, "servant", 40032, "lv", 8, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3474, 2519, 2519, 6330), "item", list(12004), "itemnum", list(19800), "piecenum", 180, "lvcondition", 9, "joblv", 35, "servantShow", "【进阶8】诗人效率+68%"),
    417, map("id", 417, "servant", 40032, "lv", 9, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3920, 2843, 2843, 7142), "item", list(12004), "itemnum", list(31800), "piecenum", 220, "lvcondition", 18, "joblv", 36, "servantShow", "【进阶9】诗人效率+76%"),
    418, map("id", 418, "servant", 40032, "lv", 10, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(4369, 3169, 3169, 7959), "item", list(12004), "itemnum", list(47800), "piecenum", 260, "lvcondition", 27, "joblv", 37, "servantShow", "【进阶10】诗人效率+84%"),
    419, map("id", 419, "servant", 40032, "lv", 11, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(4820, 3497, 3497, 8781), "item", list(12004), "itemnum", list(67800), "piecenum", 300, "lvcondition", 36, "joblv", 38, "servantShow", "【进阶11】诗人效率+92%"),
    420, map("id", 420, "servant", 40032, "lv", 12, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(5273, 3826, 3826, 9608), "item", list(12004), "itemnum", list(91800), "piecenum", 360, "lvcondition", 45, "joblv", 39, "servantShow", "【进阶12】诗人效率+100%")
);
    }

    private static void init84() {
data.map(
    421, map("id", 421, "servant", 40033, "lv", 1, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(405, 293, 293, 737), "item", list(12004), "itemnum", list(100), "piecenum", 0, "lvcondition", 1, "joblv", 2, "servantShow", "【进阶1】伐木效率+12%"),
    422, map("id", 422, "servant", 40033, "lv", 2, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(749, 542, 542, 1363), "item", list(12004), "itemnum", list(300), "piecenum", 0, "lvcondition", 9, "joblv", 3, "servantShow", "【进阶2】伐木效率+20%"),
    423, map("id", 423, "servant", 40033, "lv", 3, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1068, 774, 774, 1945), "item", list(12004), "itemnum", list(800), "piecenum", 20, "lvcondition", 18, "joblv", 4, "servantShow", "【进阶3】伐木效率+28%"),
    424, map("id", 424, "servant", 40033, "lv", 4, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1366, 990, 990, 2488), "item", list(12004), "itemnum", list(1800), "piecenum", 40, "lvcondition", 27, "joblv", 5, "servantShow", "【进阶4】伐木效率+36%"),
    425, map("id", 425, "servant", 40033, "lv", 5, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1646, 1193, 1193, 2998), "item", list(12004), "itemnum", list(3800), "piecenum", 60, "lvcondition", 36, "joblv", 6, "servantShow", "【进阶5】伐木效率+44%")
);
    }

    private static void init85() {
data.map(
    426, map("id", 426, "servant", 40033, "lv", 6, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1911, 1386, 1386, 3480), "item", list(12004), "itemnum", list(6800), "piecenum", 100, "lvcondition", 45, "joblv", 7, "servantShow", "【进阶6】伐木效率+52%"),
    427, map("id", 427, "servant", 40033, "lv", 7, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2162, 1568, 1568, 3939), "item", list(12004), "itemnum", list(11800), "piecenum", 140, "lvcondition", 1, "joblv", 8, "servantShow", "【进阶7】伐木效率+60%"),
    428, map("id", 428, "servant", 40033, "lv", 8, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2403, 1743, 1743, 4378), "item", list(12004), "itemnum", list(19800), "piecenum", 180, "lvcondition", 9, "joblv", 9, "servantShow", "【进阶8】伐木效率+68%"),
    429, map("id", 429, "servant", 40033, "lv", 9, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2634, 1911, 1911, 4799), "item", list(12004), "itemnum", list(31800), "piecenum", 220, "lvcondition", 18, "joblv", 10, "servantShow", "【进阶9】伐木效率+76%"),
    430, map("id", 430, "servant", 40033, "lv", 10, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2858, 2073, 2073, 5205), "item", list(12004), "itemnum", list(47800), "piecenum", 260, "lvcondition", 27, "joblv", 11, "servantShow", "【进阶10】伐木效率+84%")
);
    }

    private static void init86() {
data.map(
    431, map("id", 431, "servant", 40033, "lv", 11, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3074, 2230, 2230, 5600), "item", list(12004), "itemnum", list(67800), "piecenum", 300, "lvcondition", 36, "joblv", 12, "servantShow", "【进阶11】伐木效率+92%"),
    432, map("id", 432, "servant", 40033, "lv", 12, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3284, 2383, 2383, 5984), "item", list(12004), "itemnum", list(91800), "piecenum", 360, "lvcondition", 45, "joblv", 13, "servantShow", "【进阶12】伐木效率+100%"),
    433, map("id", 433, "servant", 40036, "lv", 1, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(433, 314, 314, 789), "item", list(12004), "itemnum", list(100), "piecenum", 0, "lvcondition", 1, "joblv", 15, "servantShow", "【进阶1】裁缝效率+12%"),
    434, map("id", 434, "servant", 40036, "lv", 2, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(827, 600, 600, 1507), "item", list(12004), "itemnum", list(300), "piecenum", 0, "lvcondition", 9, "joblv", 16, "servantShow", "【进阶2】裁缝效率+20%"),
    435, map("id", 435, "servant", 40036, "lv", 3, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1215, 881, 881, 2213), "item", list(12004), "itemnum", list(800), "piecenum", 20, "lvcondition", 18, "joblv", 17, "servantShow", "【进阶3】裁缝效率+28%")
);
    }

    private static void init87() {
data.map(
    436, map("id", 436, "servant", 40036, "lv", 4, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1596, 1158, 1158, 2907), "item", list(12004), "itemnum", list(1800), "piecenum", 40, "lvcondition", 27, "joblv", 18, "servantShow", "【进阶4】裁缝效率+36%"),
    437, map("id", 437, "servant", 40036, "lv", 5, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(1971, 1431, 1431, 3591), "item", list(12004), "itemnum", list(3800), "piecenum", 60, "lvcondition", 36, "joblv", 19, "servantShow", "【进阶5】裁缝效率+44%"),
    438, map("id", 438, "servant", 40036, "lv", 6, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2341, 1700, 1700, 4265), "item", list(12004), "itemnum", list(6800), "piecenum", 100, "lvcondition", 45, "joblv", 20, "servantShow", "【进阶6】裁缝效率+52%"),
    439, map("id", 439, "servant", 40036, "lv", 7, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(2706, 1965, 1965, 4931), "item", list(12004), "itemnum", list(11800), "piecenum", 140, "lvcondition", 1, "joblv", 21, "servantShow", "【进阶7】裁缝效率+60%"),
    440, map("id", 440, "servant", 40036, "lv", 8, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3068, 2227, 2227, 5589), "item", list(12004), "itemnum", list(19800), "piecenum", 180, "lvcondition", 9, "joblv", 22, "servantShow", "【进阶8】裁缝效率+68%")
);
    }

    private static void init88() {
data.map(
    441, map("id", 441, "servant", 40036, "lv", 9, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3425, 2486, 2486, 6240), "item", list(12004), "itemnum", list(31800), "piecenum", 220, "lvcondition", 18, "joblv", 23, "servantShow", "【进阶9】裁缝效率+76%"),
    442, map("id", 442, "servant", 40036, "lv", 10, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(3779, 2743, 2743, 6884), "item", list(12004), "itemnum", list(47800), "piecenum", 260, "lvcondition", 27, "joblv", 24, "servantShow", "【进阶10】裁缝效率+84%"),
    443, map("id", 443, "servant", 40036, "lv", 11, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(4130, 2998, 2998, 7523), "item", list(12004), "itemnum", list(67800), "piecenum", 300, "lvcondition", 36, "joblv", 25, "servantShow", "【进阶11】裁缝效率+92%"),
    444, map("id", 444, "servant", 40036, "lv", 12, "propkind", list(10045, 10046, 10047, 10048), "propnum", list(4477, 3250, 3250, 8156), "item", list(12004), "itemnum", list(91800), "piecenum", 360, "lvcondition", 45, "joblv", 26, "servantShow", "【进阶12】裁缝效率+100%")
);
    }

}