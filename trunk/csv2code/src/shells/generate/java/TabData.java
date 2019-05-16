package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 页签表.csv
 * id = id
 * 页签 = dec
 * 页签图标 = icon
 * 掉落 = drop
 * 掉落次数 = num
 */
public class TabData extends LData {
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
    10000, map("id", 10000, "dec", 1, "icon", "1", "drop", 101, "num", 1),
    10001, map("id", 10001, "dec", 2, "icon", "1", "drop", 101, "num", 1),
    10002, map("id", 10002, "dec", 3, "icon", "1", "drop", 101, "num", 1),
    10003, map("id", 10003, "dec", 4, "icon", "1", "drop", 101, "num", 1),
    10004, map("id", 10004, "dec", 5, "icon", "1", "drop", 101, "num", 1)
);
    }

    private static void init1() {
data.map(
    10005, map("id", 10005, "dec", 6, "icon", "1", "drop", 101, "num", 1),
    10006, map("id", 10006, "dec", 7, "icon", "1", "drop", 101, "num", 1),
    10007, map("id", 10007, "dec", 8, "icon", "1", "drop", 101, "num", 1),
    10008, map("id", 10008, "dec", 9, "icon", "1", "drop", 101, "num", 1),
    10009, map("id", 10009, "dec", 10, "icon", "1", "drop", 101, "num", 1)
);
    }

    private static void init2() {
data.map(
    10010, map("id", 10010, "dec", 11, "icon", "1", "drop", 101, "num", 1),
    10011, map("id", 10011, "dec", 12, "icon", "1", "drop", 101, "num", 1),
    10012, map("id", 10012, "dec", 13, "icon", "1", "drop", 101, "num", 1),
    10013, map("id", 10013, "dec", 14, "icon", "1", "drop", 101, "num", 1),
    10014, map("id", 10014, "dec", 15, "icon", "1", "drop", 101, "num", 1)
);
    }

    private static void init3() {
data.map(
    10015, map("id", 10015, "dec", 16, "icon", "1", "drop", 101, "num", 1),
    10016, map("id", 10016, "dec", 17, "icon", "1", "drop", 101, "num", 1),
    10017, map("id", 10017, "dec", 18, "icon", "1", "drop", 101, "num", 1),
    10018, map("id", 10018, "dec", 19, "icon", "1", "drop", 101, "num", 1),
    10019, map("id", 10019, "dec", 20, "icon", "1", "drop", 101, "num", 1)
);
    }

}