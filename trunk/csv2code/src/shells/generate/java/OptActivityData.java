package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 运营活动表.csv
 * 编号 = optId
 * 服务器编号 = serverId
 * 渠道编号 = oprGroup
 * 活动类型 = optType
 * 活动有效性 = optValidity
 * 签到开放月份 = signOpenTime
 * 时间类型 = timeKind
 * 活动开放时间 = openTime
 * 活动显示时间 = showTime
 * 是否活动结束可领 = endClaim
 * 生效时间 = effectTime
 * 道具ID = itemId
 * 转盘奖励个数 = zhuanpanItem
 * 特惠购买充值金额 = czId
 * 特惠购买参与次数 = limitNum
 * 连续充值对应id = contczId
 * 水果机对应id = sgjId
 * 转盘种类 = zpzl
 */
public class OptActivityData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        init1();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    1000, map("optId", 1000, "optType", 5, "optValidity", false),
    1001, map("optId", 1001, "optType", 8, "optValidity", true, "timeKind", 2, "openTime", "0,30660", "showTime", "0,30660"),
    1002, map("optId", 1002, "optType", 20, "optValidity", true),
    1003, map("optId", 1003, "optType", 6, "optValidity", true),
    1004, map("optId", 1004, "optType", 53, "optValidity", true)
);
    }

    private static void init1() {
data.map(
    1006, map("optId", 1006, "optType", 1, "optValidity", true, "timeKind", 2, "openTime", "0,166", "showTime", "0,192", "endClaim", true),
    1007, map("optId", 1007, "optValidity", false, "timeKind", 1, "openTime", "||2017-1-1 00:00:00,2017-1-4 22:00:00", "showTime", "||2017-1-1 00:00:00,2017-1-5 24:00:00", "endClaim", true, "itemId", 90517),
    1008, map("optId", 1008, "optType", 909, "optValidity", true, "timeKind", 2, "openTime", "0,166", "showTime", "0,166", "endClaim", true),
    1009, map("optId", 1009, "optType", 910, "optValidity", true, "timeKind", 2, "openTime", "0,166", "showTime", "0,166", "endClaim", true)
);
    }

}