package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 建筑功能表.csv
 * 编号 = id
 * 开放等级 = openLv
 * 对应引导 = ydId
 */
public class BuildFunData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        init1();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    100, map("id", 100, "openLv", 1),
    101, map("id", 101, "openLv", 1),
    102, map("id", 102, "openLv", 1),
    103, map("id", 103, "openLv", 1),
    104, map("id", 104, "openLv", 1)
);
    }

    private static void init1() {
data.map(
    105, map("id", 105, "openLv", 1),
    106, map("id", 106, "openLv", 1),
    107, map("id", 107, "openLv", 1)
);
    }

}