package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 派系建筑等级表.csv
 * 编号 = id
 * 建筑类型 = type
 * 建筑名称 = deputyleader
 * 建筑等级 = buildinglv
 * 消耗材料类型 = expendtype
 * 消耗材料数量 = expendnum
 * 升级条件类型 = uptype
 * 升级条件 = upnum
 * 议政厅派系影响力上限 = effectlimit
 * 议政厅派系资金力上限 = fundlimit
 * 升级建筑增加的派系影响力值 = upeffect
 */
public class FactionsBuildingData extends LData {
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
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    1, map("id", 1, "type", 1, "deputyleader", "议政厅", "buildinglv", 1, "expendtype", list(10005), "expendnum", list(108000), "uptype", 2, "upnum", 20, "effectlimit", 1000000, "fundlimit", 1000000, "upeffect", 1000),
    2, map("id", 2, "type", 1, "deputyleader", "议政厅", "buildinglv", 2, "expendtype", list(10005), "expendnum", list(240000), "uptype", 2, "upnum", 30, "effectlimit", 1500000, "fundlimit", 2500000, "upeffect", 2000),
    3, map("id", 3, "type", 1, "deputyleader", "议政厅", "buildinglv", 3, "expendtype", list(10005), "expendnum", list(528000), "uptype", 2, "upnum", 40, "effectlimit", 2000000, "fundlimit", 4000000, "upeffect", 3000),
    4, map("id", 4, "type", 1, "deputyleader", "议政厅", "buildinglv", 4, "expendtype", list(10005), "expendnum", list(864000), "uptype", 2, "upnum", 50, "effectlimit", 2500000, "fundlimit", 5500000, "upeffect", 4000),
    5, map("id", 5, "type", 1, "deputyleader", "议政厅", "buildinglv", 5, "expendtype", list(10005), "expendnum", list(1404000), "uptype", 2, "upnum", 60, "effectlimit", 3000000, "fundlimit", 7000000, "upeffect", 5000)
);
    }

    private static void init1() {
data.map(
    6, map("id", 6, "type", 1, "deputyleader", "议政厅", "buildinglv", 6, "expendtype", list(10005), "expendnum", list(2016000), "uptype", 2, "upnum", 70, "effectlimit", 3500000, "fundlimit", 8500000, "upeffect", 6000),
    7, map("id", 7, "type", 1, "deputyleader", "议政厅", "buildinglv", 7, "expendtype", list(10005), "expendnum", list(2880000), "uptype", 2, "upnum", 80, "effectlimit", 4000000, "fundlimit", 10000000, "upeffect", 7000),
    8, map("id", 8, "type", 1, "deputyleader", "议政厅", "buildinglv", 8, "expendtype", list(10005), "expendnum", list(3840000), "uptype", 2, "upnum", 90, "effectlimit", 4500000, "fundlimit", 11500000, "upeffect", 8000),
    9, map("id", 9, "type", 1, "deputyleader", "议政厅", "buildinglv", 9, "expendtype", list(10005), "expendnum", list(5100000), "uptype", 2, "upnum", 100, "effectlimit", 5000000, "fundlimit", 13000000, "upeffect", 9000),
    10, map("id", 10, "type", 1, "deputyleader", "议政厅", "buildinglv", 10, "expendtype", list(10005), "expendnum", list(6480000), "uptype", 2, "upnum", 110, "effectlimit", 5500000, "fundlimit", 14500000, "upeffect", 10000)
);
    }

    private static void init2() {
data.map(
    11, map("id", 11, "type", 1, "deputyleader", "议政厅", "buildinglv", 11, "expendtype", list(10005), "expendnum", list(8208000), "uptype", 2, "upnum", 120, "effectlimit", 6000000, "fundlimit", 16000000, "upeffect", 11000),
    12, map("id", 12, "type", 1, "deputyleader", "议政厅", "buildinglv", 12, "uptype", 2),
    13, map("id", 13, "type", 2, "deputyleader", "派系任务", "buildinglv", 1, "expendtype", list(10005), "expendnum", list(120000), "uptype", 1, "upnum", 2, "upeffect", 500),
    14, map("id", 14, "type", 2, "deputyleader", "派系任务", "buildinglv", 2, "expendtype", list(10005), "expendnum", list(432000), "uptype", 1, "upnum", 4, "upeffect", 600),
    15, map("id", 15, "type", 2, "deputyleader", "派系任务", "buildinglv", 3, "expendtype", list(10005), "expendnum", list(1008000), "uptype", 1, "upnum", 6, "upeffect", 900)
);
    }

    private static void init3() {
data.map(
    16, map("id", 16, "type", 2, "deputyleader", "派系任务", "buildinglv", 4, "expendtype", list(10005), "expendnum", list(1920000), "uptype", 1, "upnum", 8, "upeffect", 1000),
    17, map("id", 17, "type", 2, "deputyleader", "派系任务", "buildinglv", 5, "expendtype", list(10005), "expendnum", list(3240000), "uptype", 1, "upnum", 10, "upeffect", 1100),
    18, map("id", 18, "type", 2, "deputyleader", "派系任务", "buildinglv", 6, "uptype", 1),
    19, map("id", 19, "type", 3, "deputyleader", "派系挑战", "buildinglv", 1, "expendtype", list(10005), "expendnum", list(264000), "uptype", 1, "upnum", 3, "upeffect", 500),
    20, map("id", 20, "type", 3, "deputyleader", "派系挑战", "buildinglv", 2, "expendtype", list(10005), "expendnum", list(702000), "uptype", 1, "upnum", 5, "upeffect", 600)
);
    }

    private static void init4() {
data.map(
    21, map("id", 21, "type", 3, "deputyleader", "派系挑战", "buildinglv", 3, "expendtype", list(10005), "expendnum", list(1440000), "uptype", 1, "upnum", 7, "upeffect", 900),
    22, map("id", 22, "type", 3, "deputyleader", "派系挑战", "buildinglv", 4, "expendtype", list(10005), "expendnum", list(2550000), "uptype", 1, "upnum", 9, "upeffect", 1000),
    23, map("id", 23, "type", 3, "deputyleader", "派系挑战", "buildinglv", 5, "expendtype", list(10005), "expendnum", list(4104000), "uptype", 1, "upnum", 11, "upeffect", 1100),
    24, map("id", 24, "type", 3, "deputyleader", "派系挑战", "buildinglv", 6, "expendtype", list(10005), "uptype", 1),
    25, map("id", 25, "type", 4, "deputyleader", "派系高手", "buildinglv", 1, "expendtype", list(10005), "expendnum", list(264000), "uptype", 1, "upnum", 3, "upeffect", 500)
);
    }

    private static void init5() {
data.map(
    26, map("id", 26, "type", 4, "deputyleader", "派系高手", "buildinglv", 2, "expendtype", list(10005), "expendnum", list(702000), "uptype", 1, "upnum", 5, "upeffect", 600),
    27, map("id", 27, "type", 4, "deputyleader", "派系高手", "buildinglv", 3, "expendtype", list(10005), "expendnum", list(1440000), "uptype", 1, "upnum", 7, "upeffect", 900),
    28, map("id", 28, "type", 4, "deputyleader", "派系高手", "buildinglv", 4, "expendtype", list(10005), "expendnum", list(2550000), "uptype", 1, "upnum", 9, "upeffect", 1000),
    29, map("id", 29, "type", 4, "deputyleader", "派系高手", "buildinglv", 5, "expendtype", list(10005), "expendnum", list(4104000), "uptype", 1, "upnum", 11, "upeffect", 1100),
    30, map("id", 30, "type", 4, "deputyleader", "派系高手", "buildinglv", 6, "expendtype", list(10005), "uptype", 1)
);
    }

    private static void init6() {
data.map(
    31, map("id", 31, "type", 5, "deputyleader", "派系商店", "buildinglv", 1, "expendtype", list(10005), "expendnum", list(120000), "uptype", 1, "upnum", 2, "upeffect", 500),
    32, map("id", 32, "type", 5, "deputyleader", "派系商店", "buildinglv", 2, "expendtype", list(10005), "expendnum", list(432000), "uptype", 1, "upnum", 4, "upeffect", 600),
    33, map("id", 33, "type", 5, "deputyleader", "派系商店", "buildinglv", 3, "expendtype", list(10005), "expendnum", list(1008000), "uptype", 1, "upnum", 6, "upeffect", 900),
    34, map("id", 34, "type", 5, "deputyleader", "派系商店", "buildinglv", 4, "expendtype", list(10005), "expendnum", list(1920000), "uptype", 1, "upnum", 8, "upeffect", 1000),
    35, map("id", 35, "type", 5, "deputyleader", "派系商店", "buildinglv", 5, "expendtype", list(10005), "expendnum", list(3240000), "uptype", 1, "upnum", 10, "upeffect", 1100)
);
    }

    private static void init7() {
data.map(
    36, map("id", 36, "type", 5, "deputyleader", "派系商店", "buildinglv", 6, "uptype", 1)
);
    }

}