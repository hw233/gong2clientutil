package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 每日副本表.csv
 * 副本编号 = id
 * 所属难度 = difficulty
 * 怪物阵型 = monster
 * 掉落库ID = dropId
 * 掉落库数量 = dropNum
 * 周启日 = day
 * 开启时间点 = time
 * 持续时间 = duration
 */
public class DailySceneData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        init1();
        init2();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    1, map("id", 1, "difficulty", 1, "monster", 1, "dropId", list(1), "dropNum", list(1), "day", list(5, 7), "time", "19:00,22:00", "duration", list(1200, 1200)),
    2, map("id", 2, "difficulty", 1, "monster", 2, "dropId", list(1), "dropNum", list(1), "day", list(5, 7), "time", "19:00,22:00", "duration", list(1200, 1200)),
    3, map("id", 3, "difficulty", 1, "monster", 3, "dropId", list(1), "dropNum", list(1), "day", list(5, 7), "time", "19:00,22:00", "duration", list(1200, 1200)),
    4, map("id", 4, "difficulty", 2, "monster", 4, "dropId", list(1), "dropNum", list(1), "day", list(5, 7), "time", "19:00,22:00", "duration", list(1200, 1200)),
    5, map("id", 5, "difficulty", 2, "monster", 5, "dropId", list(1), "dropNum", list(1), "day", list(5, 7), "time", "19:00,22:00", "duration", list(1200, 1200))
);
    }

    private static void init1() {
data.map(
    6, map("id", 6, "difficulty", 2, "monster", 6, "dropId", list(1), "dropNum", list(1), "day", list(5, 7), "time", "19:00,22:00", "duration", list(1200, 1200)),
    7, map("id", 7, "difficulty", 3, "monster", 7, "dropId", list(1), "dropNum", list(1), "day", list(5, 7), "time", "19:00,22:00", "duration", list(1200, 1200)),
    8, map("id", 8, "difficulty", 3, "monster", 8, "dropId", list(1), "dropNum", list(1), "day", list(5, 7), "time", "19:00,22:00", "duration", list(1200, 1200)),
    9, map("id", 9, "difficulty", 3, "monster", 9, "dropId", list(1), "dropNum", list(1), "day", list(5, 7), "time", "19:00,22:00", "duration", list(1200, 1200)),
    10, map("id", 10, "difficulty", 4, "monster", 10, "dropId", list(1), "dropNum", list(1), "day", list(5, 7), "time", "19:00,22:00", "duration", list(1200, 1200))
);
    }

    private static void init2() {
data.map(
    11, map("id", 11, "difficulty", 4, "monster", 11, "dropId", list(1), "dropNum", list(1), "day", list(5, 7), "time", "19:00,22:00", "duration", list(1200, 1200)),
    12, map("id", 12, "difficulty", 4, "monster", 12, "dropId", list(1), "dropNum", list(1), "day", list(5, 7), "time", "19:00,22:00", "duration", list(1200, 1200))
);
    }

}