package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 抽将表.csv
 * 抽卡库类型 = id
 * 掉落库ID = dropID
 * 随机次数 = dropNum
 * 备注 = explain
 * 消耗道具 = item
 * 消耗元宝 = gold
 * 附加物品 = items
 * 附件物品数量 = itemsnum
 * 必出抽卡库类型ID = changeSelectID
 */
public class ServantSelectData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        init1();
        init2();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    1, map("id", 1, "dropID", list(6), "dropNum", list(1), "explain", "低级免费，随一次", "items", list(10008), "itemsnum", list(1)),
    2, map("id", 2, "dropID", list(6), "dropNum", list(1), "explain", "低级道具，随一次", "item", 12083, "items", list(10008), "itemsnum", list(1)),
    3, map("id", 3, "dropID", list(3), "dropNum", list(1), "explain", "高级免费，随一次", "items", list(10008), "itemsnum", list(10), "changeSelectID", 8),
    4, map("id", 4, "dropID", list(3), "dropNum", list(1), "explain", "高级道具，随一次", "item", 12084, "items", list(10008), "itemsnum", list(10), "changeSelectID", 8),
    5, map("id", 5, "dropID", list(3), "dropNum", list(1), "explain", "高级单抽，随一次", "gold", 300, "items", list(10008), "itemsnum", list(10), "changeSelectID", 8)
);
    }

    private static void init1() {
data.map(
    6, map("id", 6, "dropID", list(6, 3, 2), "dropNum", list(6, 3, 1), "explain", "高级6连抽,3个库", "gold", 2888, "items", list(10008), "itemsnum", list(60), "changeSelectID", 7),
    7, map("id", 7, "dropID", list(6, 3, 2), "dropNum", list(6, 3, 1), "explain", "高级6连抽,3个库，必出武将", "gold", 2888, "items", list(10008), "itemsnum", list(60)),
    8, map("id", 8, "dropID", list(2), "dropNum", list(1), "explain", "高级单抽，随一次，必出武将", "gold", 300, "items", list(10008), "itemsnum", list(10)),
    9, map("id", 9, "dropID", list(64), "dropNum", list(1), "explain", "单抽第一次抽，假随机", "item", 12084, "gold", 300, "items", list(10008), "itemsnum", list(10)),
    11, map("id", 11, "dropID", list(839), "dropNum", list(1), "explain", "抽取宠物")
);
    }

    private static void init2() {
data.map(
    12, map("id", 12, "dropID", list(840), "dropNum", list(1), "explain", "抽取宠物"),
    13, map("id", 13, "dropID", list(841), "dropNum", list(1), "explain", "抽取宠物")
);
    }

}