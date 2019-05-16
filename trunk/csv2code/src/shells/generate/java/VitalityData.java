package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 派系活跃礼包.csv
 * 编号 = id
 * 活跃度数量 = vitality
 * 道具奖励ID = dropID
 * 道具奖励数量 = dropNum
 */
public class VitalityData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        init1();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    1000, map("id", 1000, "vitality", 25, "dropID", list(101), "dropNum", list(1)),
    1001, map("id", 1001, "vitality", 50, "dropID", list(101), "dropNum", list(1)),
    1002, map("id", 1002, "vitality", 75, "dropID", list(101), "dropNum", list(1)),
    1003, map("id", 1003, "vitality", 100, "dropID", list(101), "dropNum", list(1)),
    1004, map("id", 1004, "vitality", 125, "dropID", list(101), "dropNum", list(1))
);
    }

    private static void init1() {
data.map(
    1005, map("id", 1005, "vitality", 150, "dropID", list(101), "dropNum", list(1)),
    1006, map("id", 1006, "vitality", 200, "dropID", list(101), "dropNum", list(1)),
    1007, map("id", 1007, "vitality", 250, "dropID", list(101), "dropNum", list(1))
);
    }

}