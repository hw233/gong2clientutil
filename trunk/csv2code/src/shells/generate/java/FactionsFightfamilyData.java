package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 派系争斗势力表.csv
 * 编号 = id
 * 名称 = name
 * 解锁建筑等级 = building
 * 重置消耗的派系资金 = cost
 */
public class FactionsFightfamilyData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        init1();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    1, map("id", 1, "name", "散人", "building", 1, "cost", 1000),
    2, map("id", 2, "name", "影阁", "building", 1, "cost", 1000),
    3, map("id", 3, "name", "青莲剑阁", "building", 2, "cost", 1000),
    4, map("id", 4, "name", "鹤樱馆", "building", 2, "cost", 1000),
    5, map("id", 5, "name", "紫宸殿", "building", 3, "cost", 1000)
);
    }

    private static void init1() {
data.map(
    6, map("id", 6, "name", "昆仑战阁", "building", 4, "cost", 1000),
    7, map("id", 7, "name", "披香殿", "building", 5, "cost", 1000),
    8, map("id", 8, "name", "观星台", "building", 6, "cost", 1000)
);
    }

}