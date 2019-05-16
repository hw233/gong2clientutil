package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 官员定义表.csv
 * 官员编号 = id
 * 官员权力 = deputyleader
 */
public class FactionsPowerData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        init1();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    1, map("id", 1, "deputyleader", list(1, 2, 3, 4, 5, 6, 7, 8, 9)),
    2, map("id", 2, "deputyleader", list(1, 2, 3, 4, 5, 6, 7, 8)),
    3, map("id", 3, "deputyleader", list(1, 2, 3, 4, 5, 6, 7)),
    4, map("id", 4, "deputyleader", list(1, 2, 3, 4, 5)),
    5, map("id", 5, "deputyleader", list(1, 2, 3, 4, 5))
);
    }

    private static void init1() {
data.map(
    6, map("id", 6)
);
    }

}