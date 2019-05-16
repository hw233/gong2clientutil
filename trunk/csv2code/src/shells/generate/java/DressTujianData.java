package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 装扮图鉴表.csv
 * 装扮编号 = id
 * 顺序 = xl
 * 装扮id = icon
 * 套装名 = taozhuangName
 * 套装部位 = dressId
 * 获取路径 = skip
 */
public class DressTujianData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    10000, map("id", 10000, "xl", 1, "icon", 1000, "taozhuangName", "回风流雪", "dressId", 29508, "dresspart", list(29500, 29501, 29502), "effect", 1000, "skip", list(1304)),
    10001, map("id", 10001, "xl", 2, "icon", 1001, "taozhuangName", "桃之夭夭", "dressId", 29509, "dresspart", list(29504, 29505, 29506), "effect", 29509, "skip", list(1304)),
    20000, map("id", 20000, "xl", 1, "icon", 1000, "taozhuangName", "名士风流", "dressId", 29008, "dresspart", list(29000, 29001, 29002), "effect", 29008, "skip", list(1304)),
    20001, map("id", 20001, "xl", 2, "icon", 1001, "taozhuangName", "那时年少", "dressId", 29009, "dresspart", list(29004, 29005, 29006), "effect", 1001, "skip", list(1304))
);
    }

}