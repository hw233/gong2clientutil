package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 配饰强化加成表.csv
 * id = id
 * 强化等级 = lv
 * 属性 = porp
 * 属性值 = porpnum
 */
public class JadeQhAddData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        init1();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    1001, map("id", 1001, "lv", 10, "porp", list(10045, 10046, 10047, 10048), "porpnum", list(6, 0, 0, 0)),
    1002, map("id", 1002, "lv", 20, "porp", list(10045, 10046, 10047, 10048), "porpnum", list(10, 0, 0, 0)),
    1003, map("id", 1003, "lv", 30, "porp", list(10045, 10046, 10047, 10048), "porpnum", list(10, 0, 0, 1)),
    1004, map("id", 1004, "lv", 40, "porp", list(10045, 10046, 10047, 10048), "porpnum", list(10, 0, 0, 2)),
    1005, map("id", 1005, "lv", 50, "porp", list(10045, 10046, 10047, 10048), "porpnum", list(10, 0, 0, 3))
);
    }

    private static void init1() {
data.map(
    1006, map("id", 1006, "lv", 60, "porp", list(10045, 10046, 10047, 10048), "porpnum", list(10, 0, 0, 4))
);
    }

}