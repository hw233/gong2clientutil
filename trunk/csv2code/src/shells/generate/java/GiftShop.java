package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 礼包商城表.csv
 * id = id
 * 礼包顺序 = order
 * 礼包数量 = num
 * 礼包内容 = content
 * 内容数量 = contentnum
 * 限时时间 = timeLimit
 * 每日购买次数 = openGuanka
 * 等级限制 = limitlv
 * 官品限制 = limitgrade
 * VIP限制 = limitvip
 * 购买消耗类型 = costkind
 * 购买消耗数量 = costnum
 */
public class GiftShop extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    31000, map("id", 31000, "order", 1, "num", 5, "content", list(12000, 12001, 12002), "contentnum", list(3, 5, 10), "timeLimit", list("12:00:00,12:30:00||"), "openGuanka", 1, "limitlv", 5)
);
    }

}