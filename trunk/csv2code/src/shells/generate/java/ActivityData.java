package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 活动开启时间表.csv
 * 编号 = id
 * 名称 = name
 * 开启等级 = openLv
 * 开放时间 = openTime
 * 每日免费次数 = freeNum
 * 是否推送 = open
 */
public class ActivityData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    1000, map("id", 1000, "name", "世界首领", "openLv", 22, "openTime", list("11:30:00,12:30:00||", "18:00:00,18:30:00||"), "freeNum", 1, "open", 1),
    1001, map("id", 1001, "name", "每日补体力", "openLv", 0, "openTime", list("12:00:00,13:00:00||", "18:00:00,19:00:01||"), "freeNum", 2, "open", 0)
);
    }

}