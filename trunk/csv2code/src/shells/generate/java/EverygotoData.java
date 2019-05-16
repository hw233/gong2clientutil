package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 每日觐见表.csv
 * 官品编号 = id
 * 官品名称 = name
 * 剧情 = plot
 * 官品奖励 = dropID
 */
public class EverygotoData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        init1();
        init2();
        init3();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    1, map("id", 1, "name", "从九品", "plot", 1, "dropID", 833),
    2, map("id", 2, "name", "正九品", "plot", 1, "dropID", 833),
    3, map("id", 3, "name", "从八品", "plot", 1, "dropID", 833),
    4, map("id", 4, "name", "正八品", "plot", 1, "dropID", 833),
    5, map("id", 5, "name", "从七品", "plot", 1, "dropID", 833)
);
    }

    private static void init1() {
data.map(
    6, map("id", 6, "name", "正七品", "plot", 1, "dropID", 833),
    7, map("id", 7, "name", "从六品", "plot", 1, "dropID", 833),
    8, map("id", 8, "name", "正六品", "plot", 1, "dropID", 833),
    9, map("id", 9, "name", "从五品", "plot", 1, "dropID", 833),
    10, map("id", 10, "name", "正五品", "plot", 1, "dropID", 833)
);
    }

    private static void init2() {
data.map(
    11, map("id", 11, "name", "从四品", "plot", 1, "dropID", 833),
    12, map("id", 12, "name", "正四品", "plot", 1, "dropID", 833),
    13, map("id", 13, "name", "从三品", "plot", 1, "dropID", 833),
    14, map("id", 14, "name", "正三品", "plot", 1, "dropID", 833),
    15, map("id", 15, "name", "从二品", "plot", 1, "dropID", 833)
);
    }

    private static void init3() {
data.map(
    16, map("id", 16, "name", "正二品", "plot", 1, "dropID", 833),
    17, map("id", 17, "name", "从一品", "plot", 1, "dropID", 833),
    18, map("id", 18, "name", "正一品", "plot", 1, "dropID", 833),
    19, map("id", 19, "name", "超品加爵", "plot", 1, "dropID", 833)
);
    }

}