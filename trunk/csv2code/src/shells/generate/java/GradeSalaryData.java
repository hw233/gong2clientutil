package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 官场每日俸禄表.csv
 * 编号 = id
 * 官品 = name
 * 官场排名 = ranking
 * 俸禄 = salary
 */
public class GradeSalaryData extends LData {
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
    1, map("id", 1, "name", 1, "salary", list(807)),
    2, map("id", 2, "name", 2, "salary", list(808)),
    3, map("id", 3, "name", 3, "salary", list(809)),
    4, map("id", 4, "name", 4, "salary", list(810)),
    5, map("id", 5, "name", 5, "salary", list(811))
);
    }

    private static void init1() {
data.map(
    6, map("id", 6, "name", 6, "salary", list(812)),
    7, map("id", 7, "name", 7, "salary", list(813)),
    8, map("id", 8, "name", 8, "salary", list(814)),
    9, map("id", 9, "name", 9, "salary", list(815)),
    10, map("id", 10, "name", 10, "salary", list(816))
);
    }

    private static void init2() {
data.map(
    11, map("id", 11, "name", 11, "salary", list(817)),
    12, map("id", 12, "name", 12, "salary", list(818)),
    13, map("id", 13, "name", 13, "salary", list(819)),
    14, map("id", 14, "name", 14, "salary", list(820)),
    15, map("id", 15, "name", 15, "salary", list(821))
);
    }

    private static void init3() {
data.map(
    16, map("id", 16, "name", 16, "salary", list(822)),
    17, map("id", 17, "name", 17, "salary", list(823)),
    18, map("id", 18, "name", 18, "salary", list(824)),
    19, map("id", 19, "name", 19, "salary", list(825))
);
    }

}