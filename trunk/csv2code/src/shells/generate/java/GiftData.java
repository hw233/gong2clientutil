package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 礼包表.csv
 * 物品编号 = id
 * 掉落 = dropID
 * 掉落数量 = dropNum
 */
public class GiftData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        init1();
        init2();
        init3();
        init4();
        init5();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    10015, map("id", 10015, "dropID", list(60), "dropNum", list(1)),
    10019, map("id", 10019, "dropID", list(708), "dropNum", list(1)),
    10020, map("id", 10020, "dropID", list(826), "dropNum", list(1)),
    10021, map("id", 10021, "dropID", list(826), "dropNum", list(1)),
    10022, map("id", 10022, "dropID", list(826), "dropNum", list(1))
);
    }

    private static void init1() {
data.map(
    10023, map("id", 10023, "dropID", list(826), "dropNum", list(1)),
    10024, map("id", 10024, "dropID", list(826), "dropNum", list(1)),
    10025, map("id", 10025, "dropID", list(826), "dropNum", list(1)),
    10026, map("id", 10026, "dropID", list(826), "dropNum", list(1)),
    10027, map("id", 10027, "dropID", list(826), "dropNum", list(1))
);
    }

    private static void init2() {
data.map(
    10028, map("id", 10028, "dropID", list(826), "dropNum", list(1)),
    10029, map("id", 10029, "dropID", list(826), "dropNum", list(1)),
    10030, map("id", 10030, "dropID", list(827), "dropNum", list(1)),
    10031, map("id", 10031, "dropID", list(827), "dropNum", list(1)),
    10032, map("id", 10032, "dropID", list(827), "dropNum", list(1))
);
    }

    private static void init3() {
data.map(
    10033, map("id", 10033, "dropID", list(828), "dropNum", list(1)),
    10034, map("id", 10034, "dropID", list(828), "dropNum", list(1)),
    10035, map("id", 10035, "dropID", list(828), "dropNum", list(1)),
    10036, map("id", 10036, "dropID", list(829), "dropNum", list(1)),
    10037, map("id", 10037, "dropID", list(828), "dropNum", list(1))
);
    }

    private static void init4() {
data.map(
    10038, map("id", 10038, "dropID", list(828), "dropNum", list(1)),
    10039, map("id", 10039, "dropID", list(837), "dropNum", list(1)),
    10040, map("id", 10040, "dropID", list(838), "dropNum", list(1)),
    12086, map("id", 12086, "dropID", list(76), "dropNum", list(1)),
    15000, map("id", 15000, "dropID", list(101), "dropNum", list(1))
);
    }

    private static void init5() {
data.map(
    15001, map("id", 15001, "dropID", list(200, 201), "dropNum", list(1, 1))
);
    }

}