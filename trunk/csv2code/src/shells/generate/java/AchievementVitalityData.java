package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 成就点礼包.csv
 * 编号 = id
 * 活跃度数量 = vitality
 * 道具奖励ID = dropID
 * 道具奖励数量 = dropNum
 */
public class AchievementVitalityData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        init1();
        init2();
        init3();
        init4();
        init5();
        init6();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    1000, map("id", 1000, "vitality", 100, "dropID", list(500), "dropNum", list(1)),
    1001, map("id", 1001, "vitality", 200, "dropID", list(500), "dropNum", list(1)),
    1002, map("id", 1002, "vitality", 300, "dropID", list(500), "dropNum", list(1)),
    1003, map("id", 1003, "vitality", 400, "dropID", list(500), "dropNum", list(2)),
    1004, map("id", 1004, "vitality", 500, "dropID", list(500), "dropNum", list(2))
);
    }

    private static void init1() {
data.map(
    1005, map("id", 1005, "vitality", 600, "dropID", list(500), "dropNum", list(2)),
    1006, map("id", 1006, "vitality", 700, "dropID", list(500), "dropNum", list(2)),
    1007, map("id", 1007, "vitality", 800, "dropID", list(500), "dropNum", list(2)),
    1008, map("id", 1008, "vitality", 900, "dropID", list(500), "dropNum", list(2)),
    1009, map("id", 1009, "vitality", 1000, "dropID", list(500), "dropNum", list(3))
);
    }

    private static void init2() {
data.map(
    1010, map("id", 1010, "vitality", 1100, "dropID", list(500), "dropNum", list(3)),
    1011, map("id", 1011, "vitality", 1200, "dropID", list(500), "dropNum", list(3)),
    1012, map("id", 1012, "vitality", 1300, "dropID", list(500), "dropNum", list(3)),
    1013, map("id", 1013, "vitality", 1400, "dropID", list(500), "dropNum", list(3)),
    1014, map("id", 1014, "vitality", 1500, "dropID", list(500), "dropNum", list(3))
);
    }

    private static void init3() {
data.map(
    1015, map("id", 1015, "vitality", 1600, "dropID", list(500), "dropNum", list(4)),
    1016, map("id", 1016, "vitality", 1700, "dropID", list(500), "dropNum", list(4)),
    1017, map("id", 1017, "vitality", 1800, "dropID", list(500), "dropNum", list(4)),
    1018, map("id", 1018, "vitality", 1900, "dropID", list(500), "dropNum", list(4)),
    1019, map("id", 1019, "vitality", 2000, "dropID", list(500), "dropNum", list(4))
);
    }

    private static void init4() {
data.map(
    1020, map("id", 1020, "vitality", 2100, "dropID", list(500), "dropNum", list(4)),
    1021, map("id", 1021, "vitality", 2200, "dropID", list(500), "dropNum", list(4)),
    1022, map("id", 1022, "vitality", 2300, "dropID", list(500), "dropNum", list(6)),
    1023, map("id", 1023, "vitality", 2400, "dropID", list(500), "dropNum", list(6)),
    1024, map("id", 1024, "vitality", 2500, "dropID", list(500), "dropNum", list(6))
);
    }

    private static void init5() {
data.map(
    1025, map("id", 1025, "vitality", 2600, "dropID", list(500), "dropNum", list(6)),
    1026, map("id", 1026, "vitality", 2700, "dropID", list(500), "dropNum", list(6)),
    1027, map("id", 1027, "vitality", 2800, "dropID", list(500), "dropNum", list(6)),
    1028, map("id", 1028, "vitality", 2900, "dropID", list(500), "dropNum", list(8)),
    1029, map("id", 1029, "vitality", 3000, "dropID", list(500), "dropNum", list(8))
);
    }

    private static void init6() {
data.map(
    1030, map("id", 1030, "vitality", 3100, "dropID", list(500), "dropNum", list(8)),
    1031, map("id", 1031, "vitality", 3200, "dropID", list(500), "dropNum", list(10)),
    1032, map("id", 1032, "vitality", 3300, "dropID", list(500), "dropNum", list(20))
);
    }

}