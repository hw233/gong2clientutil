package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 任务变量表.csv
 * 变量名 = name
 * 统计类型 = statsType
 */
public class MissionVariantData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        init1();
        init2();
        init3();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    "dayPtgkNum", map("name", "dayPtgkNum", "statsType", 2),
    "zx\nCombatPowerNum", map("name", "zx\nCombatPowerNum", "statsType", 3),
    "zx1\nImprovingQualityNum", map("name", "zx1\nImprovingQualityNum", "statsType", 3),
    "zx1StrengthenNum", map("name", "zx1StrengthenNum", "statsType", 3),
    "zx2\nGoOnlineNum", map("name", "zx2\nGoOnlineNum", "statsType", 3)
);
    }

    private static void init1() {
data.map(
    "zx2\nImprovingQualityNum", map("name", "zx2\nImprovingQualityNum", "statsType", 3),
    "zx2StrengthenNum", map("name", "zx2StrengthenNum", "statsType", 3),
    "zx3\nGoOnlineNum", map("name", "zx3\nGoOnlineNum", "statsType", 3),
    "zx4\nGoOnlineNum", map("name", "zx4\nGoOnlineNum", "statsType", 3),
    "zx5\nGoOnlineNum", map("name", "zx5\nGoOnlineNum", "statsType", 3)
);
    }

    private static void init2() {
data.map(
    "zx6\nGoOnlineNum", map("name", "zx6\nGoOnlineNum", "statsType", 3),
    "zx7\nGoOnlineNum", map("name", "zx7\nGoOnlineNum", "statsType", 3),
    "zxAddFriendNum", map("name", "zxAddFriendNum", "statsType", 3),
    "zxChatNum", map("name", "zxChatNum", "statsType", 3),
    "zxPlotNum", map("name", "zxPlotNum", "statsType", 3)
);
    }

    private static void init3() {
data.map(
    "zxRecruitNum", map("name", "zxRecruitNum", "statsType", 3),
    "zxShangzhenMun", map("name", "zxShangzhenMun", "statsType", 3)
);
    }

}