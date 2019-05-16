package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 世界boss排名表.csv
 * 编号 = ID
 * 排名区间 = rank
 * 奖励 = dropID
 * 奖励数量 = dropNum
 * 固定奖励 = gddropID
 * 固定奖励数量 = gddropNum
 */
public class BossRankData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        init1();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    1, map("ID", 1, "rank", list(1, 1), "gddropID", list(26), "gddropNum", list(1)),
    2, map("ID", 2, "rank", list(2, 2), "gddropID", list(27), "gddropNum", list(1)),
    3, map("ID", 3, "rank", list(3, 3), "gddropID", list(28), "gddropNum", list(1)),
    4, map("ID", 4, "rank", list(4, 10), "gddropID", list(29), "gddropNum", list(1)),
    5, map("ID", 5, "rank", list(11, 20), "gddropID", list(30), "gddropNum", list(1))
);
    }

    private static void init1() {
data.map(
    6, map("ID", 6, "rank", list(21, 30), "gddropID", list(31), "gddropNum", list(1)),
    7, map("ID", 7, "rank", list(31, 40), "gddropID", list(32), "gddropNum", list(1)),
    8, map("ID", 8, "rank", list(41, 50), "gddropID", list(33), "gddropNum", list(1)),
    9, map("ID", 9, "rank", list(51, 100), "gddropID", list(34), "gddropNum", list(1))
);
    }

}