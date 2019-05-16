package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 每日活跃礼包.csv
 * 编号 = id
 * 活跃度数量 = vitality
 * 道具奖励ID = dropID
 * 道具奖励数量 = dropNum
 * 重置 = reset
 */
public class EverydayVitalityData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        init1();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    1000, map("id", 1000, "vitality", 30, "dropID", list(701), "dropNum", list(1), "reset", 1),
    1001, map("id", 1001, "vitality", 60, "dropID", list(702), "dropNum", list(1), "reset", 1),
    1002, map("id", 1002, "vitality", 90, "dropID", list(703), "dropNum", list(1), "reset", 1),
    1003, map("id", 1003, "vitality", 120, "dropID", list(704), "dropNum", list(1), "reset", 1),
    1004, map("id", 1004, "vitality", 150, "dropID", list(705), "dropNum", list(1), "reset", 1)
);
    }

    private static void init1() {
data.map(
    1006, map("id", 1006, "vitality", 520, "dropID", list(706), "dropNum", list(1), "reset", 2),
    1007, map("id", 1007, "vitality", 1050, "dropID", list(707), "dropNum", list(1), "reset", 2)
);
    }

}