package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 活动奖励表.csv
 * 编号 = id
 * 活动组 = optId
 * 子顺序 = order
 * 条件值 = conValue
 * 奖励物品 = award
 */
public class OptRewardData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        init1();
        init2();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    1000, map("id", 1000, "optId", 1004, "order", 1, "conValue", "300", "award", 101),
    1001, map("id", 1001, "optId", 1004, "order", 2, "conValue", "900", "award", 101),
    1002, map("id", 1002, "optId", 1004, "order", 3, "conValue", "2100", "award", 101),
    1003, map("id", 1003, "optId", 1004, "order", 4, "conValue", "3600", "award", 101),
    1004, map("id", 1004, "optId", 1004, "order", 5, "conValue", "5400", "award", 101)
);
    }

    private static void init1() {
data.map(
    2000, map("id", 2000, "optId", 1003, "order", 1, "conValue", "1", "award", 101),
    2001, map("id", 2001, "optId", 1003, "order", 2, "conValue", "2", "award", 101),
    2002, map("id", 2002, "optId", 1003, "order", 3, "conValue", "3", "award", 101),
    2003, map("id", 2003, "optId", 1003, "order", 4, "conValue", "4", "award", 101),
    2004, map("id", 2004, "optId", 1003, "order", 5, "conValue", "5", "award", 101)
);
    }

    private static void init2() {
data.map(
    2005, map("id", 2005, "optId", 1003, "order", 6, "conValue", "6", "award", 101),
    2006, map("id", 2006, "optId", 1003, "order", 7, "conValue", "7", "award", 101)
);
    }

}