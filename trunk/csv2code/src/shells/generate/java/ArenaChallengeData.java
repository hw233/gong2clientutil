package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 勇者宝箱奖励.csv
 * 编号 = id
 * 宝箱顺序 = turn
 * 挑战次数 = time
 * 掉落库UID = dropID
 * 掉落次数 = dropNum
 */
public class ArenaChallengeData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    1, map("id", 1, "turn", "1", "time", 5, "dropID", list(1), "dropNum", list(1)),
    2, map("id", 2, "turn", "2", "time", 10, "dropID", list(1), "dropNum", list(1)),
    3, map("id", 3, "turn", "3", "time", 15, "dropID", list(1), "dropNum", list(1))
);
    }

}