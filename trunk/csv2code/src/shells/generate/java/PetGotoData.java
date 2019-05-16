package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 宠物上阵.csv
 * 上阵数量 = num
 * 解锁等级 = lv
 * 位置 = pos
 */
public class PetGotoData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    1, map("num", 1, "lv", 0, "pos", 1),
    2, map("num", 2, "lv", 10, "pos", 2),
    3, map("num", 3, "lv", 20, "pos", 3)
);
    }

}