package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 派系捐献表.csv
 * 捐献编号 = id
 * 消耗资源类型 = costtype
 * 消耗资源数值 = costnum
 * 消耗道具ID = costprop
 * 奖励类型 = award
 * 派系资金 = factionsaward
 */
public class FactionsDonateData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    1, map("id", 1, "costtype", list(10000), "costnum", list(2700), "award", list(11), "factionsaward", 300),
    2, map("id", 2, "costtype", list(10001), "costnum", list(100), "award", list(12), "factionsaward", 450),
    3, map("id", 3, "costtype", list(10001), "costnum", list(1000), "costprop", 12056, "award", list(13), "factionsaward", 1000)
);
    }

}