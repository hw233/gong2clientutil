package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 兑换表.csv
 * 编号 = id
 * 类型1）勾玉 2）元宝 = kind
 * 排列顺序 = turn
 * 充值表 = chongzhiId
 * 兑换数值 = award
 * 消耗数值 = cost
 * 显示的返利比例(配10，就是10%) = rebate
 */
public class ExchangeData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        init1();
        init2();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    1, map("id", 1, "kind", 1, "turn", 1, "chongzhiId", 1000, "award", 6, "cost", 6),
    2, map("id", 2, "kind", 1, "turn", 2, "chongzhiId", 1001, "award", 30, "cost", 30),
    3, map("id", 3, "kind", 1, "turn", 3, "chongzhiId", 1002, "award", 98, "cost", 98),
    4, map("id", 4, "kind", 1, "turn", 4, "chongzhiId", 1003, "award", 198, "cost", 198),
    5, map("id", 5, "kind", 1, "turn", 5, "chongzhiId", 1004, "award", 328, "cost", 328)
);
    }

    private static void init1() {
data.map(
    6, map("id", 6, "kind", 1, "turn", 6, "chongzhiId", 1005, "award", 648, "cost", 648),
    9, map("id", 9, "kind", 2, "turn", 1, "award", 70, "cost", 6, "rebate", 10),
    10, map("id", 10, "kind", 2, "turn", 2, "award", 330, "cost", 30, "rebate", 10),
    11, map("id", 11, "kind", 2, "turn", 3, "award", 750, "cost", 68, "rebate", 10),
    12, map("id", 12, "kind", 2, "turn", 4, "award", 2180, "cost", 198, "rebate", 10)
);
    }

    private static void init2() {
data.map(
    13, map("id", 13, "kind", 2, "turn", 5, "award", 2950, "cost", 268, "rebate", 10),
    14, map("id", 14, "kind", 2, "turn", 6, "award", 3610, "cost", 328, "rebate", 10),
    15, map("id", 15, "kind", 2, "turn", 7, "award", 7130, "cost", 648, "rebate", 10),
    16, map("id", 16, "kind", 2, "turn", 8, "award", 14080, "cost", 1280, "rebate", 10)
);
    }

}