package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 消耗表.csv
 * 编号 = id
 * 消费重置 = reset
 * 消耗类型 = kind
 * 消耗元宝 = consume
 * 影响值 = effect
 */
public class ConsumeData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        init1();
        init2();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    1000, map("id", 1000, "reset", false, "kind", 1, "consume", list(300)),
    1001, map("id", 1001, "reset", false, "kind", 1, "consume", list(10)),
    1002, map("id", 1002, "reset", false, "kind", 1, "consume", list(300)),
    1003, map("id", 1003, "reset", true, "kind", 2, "consume", list(0, 5, 10, 15, 20, 25, 30, 35, 40, 45)),
    1004, map("id", 1004, "reset", false, "kind", 1, "consume", list(0, 300, 300, 300))
);
    }

    private static void init1() {
data.map(
    1005, map("id", 1005, "reset", false, "kind", 1, "consume", list(50)),
    1007, map("id", 1007, "reset", true, "kind", 2, "consume", list(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50)),
    1008, map("id", 1008, "reset", true, "kind", 2, "consume", list(0, 300)),
    1009, map("id", 1009, "reset", true, "kind", 2, "consume", list(300)),
    1010, map("id", 1010, "reset", false, "kind", 1, "consume", list(20))
);
    }

    private static void init2() {
data.map(
    1011, map("id", 1011, "reset", false, "kind", 1, "consume", list(100)),
    1012, map("id", 1012, "reset", false, "kind", 1, "consume", list(100)),
    1013, map("id", 1013, "reset", false, "kind", 1, "consume", list(50)),
    1014, map("id", 1014, "reset", false, "kind", 1, "consume", list(20))
);
    }

}