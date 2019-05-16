package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 派系权谋操作表.csv
 * 操作编号 = id
 * 操作类型 = type
 * 消耗资源类型 = costtype
 * 消耗资源数值 = costnum
 * 成功类型 = successtype
 * 操作成功概率 = successRate
 * 奖励掉落库 = dropID
 * 奖励次数 = dropNum
 * 操作派系职位限制 = limit
 * 影响类型 = effecttype
 * 影响的具体数值 = effectnum
 */
public class FactionsTrickeryData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    1, map("id", 1, "type", 1, "costtype", list(10000, 10011), "costnum", list(10000, 1), "successtype", 1, "successRate", 1, "dropID", list(21), "dropNum", list(5), "limit", list(1, 2, 3, 4), "effecttype", 1, "effectnum", 1000),
    2, map("id", 2, "type", 2, "costtype", list(10000, 10011), "costnum", list(10000, 1), "successtype", 1, "successRate", 1, "dropID", list(21), "dropNum", list(5), "limit", list(1, 2, 3, 4), "effecttype", 2, "effectnum", 20000),
    3, map("id", 3, "type", 3, "costtype", list(10001, 10011), "costnum", list(500, 1), "successtype", 2, "successRate", 0, "dropID", list(21), "dropNum", list(10), "limit", list(1, 2, 3, 4), "effecttype", 1, "effectnum", 5000)
);
    }

}