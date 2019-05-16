package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 天人表.csv
 * 排序 = id
 * 客卿ID = servantID
 */
public class AdvServantData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        init1();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    1, map("id", 1, "servantID", 40016),
    2, map("id", 2, "servantID", 40013),
    3, map("id", 3, "servantID", 40015),
    4, map("id", 4, "servantID", 40014),
    5, map("id", 5, "servantID", 40012)
);
    }

    private static void init1() {
data.map(
    6, map("id", 6, "servantID", 40009),
    7, map("id", 7, "servantID", 40017),
    8, map("id", 8, "servantID", 40010),
    9, map("id", 9, "servantID", 40006)
);
    }

}