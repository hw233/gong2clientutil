package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 科举宝箱.csv
 * 答题正确个数 = id
 * 奖励 = award
 * 数量 = num
 */
public class KjBoxawardData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        init1();
        init2();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    0, map("id", 0, "award", list(101), "num", list(1)),
    1, map("id", 1, "award", list(101), "num", list(1)),
    2, map("id", 2, "award", list(101), "num", list(1)),
    3, map("id", 3, "award", list(101), "num", list(1)),
    4, map("id", 4, "award", list(101), "num", list(1))
);
    }

    private static void init1() {
data.map(
    5, map("id", 5, "award", list(101), "num", list(1)),
    6, map("id", 6, "award", list(101), "num", list(1)),
    7, map("id", 7, "award", list(101), "num", list(1)),
    8, map("id", 8, "award", list(101), "num", list(1)),
    9, map("id", 9, "award", list(101), "num", list(1))
);
    }

    private static void init2() {
data.map(
    10, map("id", 10, "award", list(101), "num", list(1))
);
    }

}