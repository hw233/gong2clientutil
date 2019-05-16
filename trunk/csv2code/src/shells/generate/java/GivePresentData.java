package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 客卿赠送道具.csv
 * 道具名称 = id
 * 好感度描述 = des
 * 增加好感度 = likability
 */
public class GivePresentData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        init1();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    24000, map("id", 24000, "des", "山茶花", "likability", 10),
    24001, map("id", 24001, "des", "满天星", "likability", 10),
    24002, map("id", 24002, "des", "傲雪寒梅", "likability", 20),
    24003, map("id", 24003, "des", "凤穿牡丹", "likability", 30),
    24004, map("id", 24004, "des", "丹桂飘香", "likability", 40)
);
    }

    private static void init1() {
data.map(
    24005, map("id", 24005, "des", "墨染幽兰", "likability", 50)
);
    }

}