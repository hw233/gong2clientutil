package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 排名奖励表.csv
 * 编号 = id
 * 名次区间(超过的取最后一档) = ranking
 * 掉落库UID = dropID
 * 掉落次数 = dropNum
 * 初次达到名次奖励掉落库 = fistdropID
 */
public class ArenaAwardData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        init1();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    1, map("id", 1, "ranking", list(1, 1), "dropID", list(1), "dropNum", list(1), "fistdropID", list(1), "fistdropNum", list(1)),
    2, map("id", 2, "ranking", list(2, 2), "dropID", list(1), "dropNum", list(1), "fistdropID", list(1), "fistdropNum", list(1)),
    103, map("id", 103, "ranking", list(3, 3), "dropID", list(1), "dropNum", list(1), "fistdropID", list(1), "fistdropNum", list(1)),
    104, map("id", 104, "ranking", list(4, 4), "dropID", list(1), "dropNum", list(1), "fistdropID", list(1), "fistdropNum", list(1)),
    105, map("id", 105, "ranking", list(5, 5), "dropID", list(1), "dropNum", list(1), "fistdropID", list(1), "fistdropNum", list(1))
);
    }

    private static void init1() {
data.map(
    106, map("id", 106, "ranking", list(6, 10), "dropID", list(1), "dropNum", list(1), "fistdropID", list(1), "fistdropNum", list(1)),
    107, map("id", 107, "ranking", list(11, 50), "dropID", list(1), "dropNum", list(1), "fistdropID", list(1), "fistdropNum", list(1)),
    108, map("id", 108, "ranking", list(51, 100), "dropID", list(1), "dropNum", list(1), "fistdropID", list(1), "fistdropNum", list(1))
);
    }

}