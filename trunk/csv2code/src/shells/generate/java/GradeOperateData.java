package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 官品操作表.csv
 * 操作编号 = id
 * 操作类型 = type
 * 按钮出现的官品等级 = limitGrade
 * 按钮出现的玩家等级 = limitLv
 * 消耗资源类型 = costtype
 * 消耗资源数值 = costnum
 * 对方增加资源类型 = gaintype
 * 对方增加资源数值 = gainnum
 * 每日操作次数 = time
 * 对方获得的BUFF效果 = targetBuff
 * 对方获得的BUFF时间 = targetBufftime
 * 己方获得的BUFF效果 = OwnBuff
 * 己方获得的BUFF时间 = OwnBufftime
 * 变形美术资源 = distortion
 */
public class GradeOperateData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        init1();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    1, map("id", 1),
    2, map("id", 2),
    3, map("id", 3),
    4, map("id", 4),
    5, map("id", 5)
);
    }

    private static void init1() {
data.map(
    6, map("id", 6),
    7, map("id", 7),
    8, map("id", 8),
    9, map("id", 9),
    10, map("id", 10)
);
    }

}