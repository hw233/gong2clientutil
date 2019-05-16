package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 时装位置表.csv
 * 装扮位置ID = id
 * 大小 = size
 * 坐标 = pos
 */
public class DressLocationData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        init1();
        init2();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    1000, map("id", 1000, "size", list(220, 390), "pos", list(3, 396)),
    1001, map("id", 1001, "size", list(56, 6), "pos", list(98, 0)),
    1002, map("id", 1002, "size", list(272, 726), "pos", list(336, 723)),
    1003, map("id", 1003, "size", list(272, 726), "pos", list(5, 396)),
    1004, map("id", 1004, "size", list(272, 726), "pos", list(157, 464))
);
    }

    private static void init1() {
data.map(
    1005, map("id", 1005, "size", list(272, 726), "pos", list(106, 28)),
    1006, map("id", 1006, "size", list(272, 726), "pos", list(403, 35)),
    1007, map("id", 1007, "size", list(272, 726), "pos", list(373, 40)),
    2000, map("id", 2000, "size", list(220, 390), "pos", list(243, 323)),
    2001, map("id", 2001, "size", list(56, 6), "pos", list(32, 8))
);
    }

    private static void init2() {
data.map(
    2002, map("id", 2002, "size", list(272, 726), "pos", list(288, 687)),
    2003, map("id", 2003, "size", list(272, 726), "pos", list(369, 0)),
    2004, map("id", 2004, "size", list(272, 726), "pos", list(-110, -62)),
    2005, map("id", 2005, "size", list(272, 726), "pos", list(219, 417)),
    2006, map("id", 2006, "size", list(272, 726), "pos", list(339, 15))
);
    }

}