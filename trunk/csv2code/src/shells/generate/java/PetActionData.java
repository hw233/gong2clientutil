package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 宠物行为表.csv
 * 编号 = id
 * 行为名称 = ActionName
 * 行为类型 = ActionType
 * 参数值 = value
 * 对应物品 = ItemId
 */
public class PetActionData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    80001, map("id", 80001, "ActionName", "点心", "ActionType", 1, "value", 20, "ItemId", 80001),
    80002, map("id", 80002, "ActionName", "茶水", "ActionType", 1, "value", 50, "ItemId", 80002),
    80003, map("id", 80003, "ActionName", "球", "ActionType", 2, "value", 20, "ItemId", 80003),
    80004, map("id", 80004, "ActionName", "跳绳", "ActionType", 2, "value", 50, "ItemId", 80004)
);
    }

}