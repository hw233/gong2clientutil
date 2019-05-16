package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 官员定义表.csv
 * 官员编号 = id
 * 官员名称 = name
 * 官员权力 = power
 */
public class PowerData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        init1();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    1, map("id", 1, "name", "帮主", "power", list(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)),
    2, map("id", 2, "name", "副帮主", "power", list(1, 2, 3, 4, 5, 8, 9, 10, 11)),
    3, map("id", 3, "name", "外交使者", "power", list(1, 2, 8, 9, 10)),
    4, map("id", 4, "name", "内务总管", "power", list(1, 3, 4, 5, 9)),
    5, map("id", 5, "name", "精英")
);
    }

    private static void init1() {
data.map(
    6, map("id", 6, "name", "成员")
);
    }

}