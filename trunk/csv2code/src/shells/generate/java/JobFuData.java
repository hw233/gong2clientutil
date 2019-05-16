package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 副职业定义表.csv
 * 副职业ID = lv
 * 副职业类型 = upExp
 * 副职业名称 = upServantExp
 * 木材 = joba
 * 石材 = jobb
 * 铜钱 = jobc
 */
public class JobFuData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        init1();
        init2();
        init3();
        init4();
        init5();
        init6();
        init7();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    1, map("lv", 1, "upExp", 1, "upServantExp", "初级匠师", "joba", 0.04f, "jobb", 0.0f, "jobc", 0.0f),
    2, map("lv", 2, "upExp", 1, "upServantExp", "1级匠师", "joba", 0.12f, "jobb", 0.0f, "jobc", 0.0f),
    3, map("lv", 3, "upExp", 1, "upServantExp", "2级匠师", "joba", 0.2f, "jobb", 0.0f, "jobc", 0.0f),
    4, map("lv", 4, "upExp", 1, "upServantExp", "3级匠师", "joba", 0.28f, "jobb", 0.0f, "jobc", 0.0f),
    5, map("lv", 5, "upExp", 1, "upServantExp", "4级匠师", "joba", 0.36f, "jobb", 0.0f, "jobc", 0.0f)
);
    }

    private static void init1() {
data.map(
    6, map("lv", 6, "upExp", 1, "upServantExp", "5级匠师", "joba", 0.44f, "jobb", 0.0f, "jobc", 0.0f),
    7, map("lv", 7, "upExp", 1, "upServantExp", "6级匠师", "joba", 0.52f, "jobb", 0.0f, "jobc", 0.0f),
    8, map("lv", 8, "upExp", 1, "upServantExp", "7级匠师", "joba", 0.6f, "jobb", 0.0f, "jobc", 0.0f),
    9, map("lv", 9, "upExp", 1, "upServantExp", "8级匠师", "joba", 0.68f, "jobb", 0.0f, "jobc", 0.0f),
    10, map("lv", 10, "upExp", 1, "upServantExp", "9级匠师", "joba", 0.76f, "jobb", 0.0f, "jobc", 0.0f)
);
    }

    private static void init2() {
data.map(
    11, map("lv", 11, "upExp", 1, "upServantExp", "10级匠师", "joba", 0.84f, "jobb", 0.0f, "jobc", 0.0f),
    12, map("lv", 12, "upExp", 1, "upServantExp", "11级匠师", "joba", 0.92f, "jobb", 0.0f, "jobc", 0.0f),
    13, map("lv", 13, "upExp", 1, "upServantExp", "12级匠师", "joba", 1.0f, "jobb", 0.0f, "jobc", 0.0f),
    14, map("lv", 14, "upExp", 2, "upServantExp", "初级裁缝", "joba", 0.0f, "jobb", 0.04f, "jobc", 0.0f),
    15, map("lv", 15, "upExp", 2, "upServantExp", "1级裁缝", "joba", 0.0f, "jobb", 0.12f, "jobc", 0.0f)
);
    }

    private static void init3() {
data.map(
    16, map("lv", 16, "upExp", 2, "upServantExp", "2级裁缝", "joba", 0.0f, "jobb", 0.2f, "jobc", 0.0f),
    17, map("lv", 17, "upExp", 2, "upServantExp", "3级裁缝", "joba", 0.0f, "jobb", 0.28f, "jobc", 0.0f),
    18, map("lv", 18, "upExp", 2, "upServantExp", "4级裁缝", "joba", 0.0f, "jobb", 0.36f, "jobc", 0.0f),
    19, map("lv", 19, "upExp", 2, "upServantExp", "5级裁缝", "joba", 0.0f, "jobb", 0.44f, "jobc", 0.0f),
    20, map("lv", 20, "upExp", 2, "upServantExp", "6级裁缝", "joba", 0.0f, "jobb", 0.52f, "jobc", 0.0f)
);
    }

    private static void init4() {
data.map(
    21, map("lv", 21, "upExp", 2, "upServantExp", "7级裁缝", "joba", 0.0f, "jobb", 0.6f, "jobc", 0.0f),
    22, map("lv", 22, "upExp", 2, "upServantExp", "8级裁缝", "joba", 0.0f, "jobb", 0.68f, "jobc", 0.0f),
    23, map("lv", 23, "upExp", 2, "upServantExp", "9级裁缝", "joba", 0.0f, "jobb", 0.76f, "jobc", 0.0f),
    24, map("lv", 24, "upExp", 2, "upServantExp", "10级裁缝", "joba", 0.0f, "jobb", 0.84f, "jobc", 0.0f),
    25, map("lv", 25, "upExp", 2, "upServantExp", "11级裁缝", "joba", 0.0f, "jobb", 0.92f, "jobc", 0.0f)
);
    }

    private static void init5() {
data.map(
    26, map("lv", 26, "upExp", 2, "upServantExp", "12级裁缝", "joba", 0.0f, "jobb", 1.0f, "jobc", 0.0f),
    27, map("lv", 27, "upExp", 3, "upServantExp", "初级诗人", "joba", 0.0f, "jobb", 0.0f, "jobc", 0.04f),
    28, map("lv", 28, "upExp", 3, "upServantExp", "1级诗人", "joba", 0.0f, "jobb", 0.0f, "jobc", 0.12f),
    29, map("lv", 29, "upExp", 3, "upServantExp", "2级诗人", "joba", 0.0f, "jobb", 0.0f, "jobc", 0.2f),
    30, map("lv", 30, "upExp", 3, "upServantExp", "3级诗人", "joba", 0.0f, "jobb", 0.0f, "jobc", 0.28f)
);
    }

    private static void init6() {
data.map(
    31, map("lv", 31, "upExp", 3, "upServantExp", "4级诗人", "joba", 0.0f, "jobb", 0.0f, "jobc", 0.36f),
    32, map("lv", 32, "upExp", 3, "upServantExp", "5级诗人", "joba", 0.0f, "jobb", 0.0f, "jobc", 0.44f),
    33, map("lv", 33, "upExp", 3, "upServantExp", "6级诗人", "joba", 0.0f, "jobb", 0.0f, "jobc", 0.52f),
    34, map("lv", 34, "upExp", 3, "upServantExp", "7级诗人", "joba", 0.0f, "jobb", 0.0f, "jobc", 0.6f),
    35, map("lv", 35, "upExp", 3, "upServantExp", "8级诗人", "joba", 0.0f, "jobb", 0.0f, "jobc", 0.68f)
);
    }

    private static void init7() {
data.map(
    36, map("lv", 36, "upExp", 3, "upServantExp", "9级诗人", "joba", 0.0f, "jobb", 0.0f, "jobc", 0.76f),
    37, map("lv", 37, "upExp", 3, "upServantExp", "10级诗人", "joba", 0.0f, "jobb", 0.0f, "jobc", 0.84f),
    38, map("lv", 38, "upExp", 3, "upServantExp", "11级诗人", "joba", 0.0f, "jobb", 0.0f, "jobc", 0.92f),
    39, map("lv", 39, "upExp", 3, "upServantExp", "12级诗人", "joba", 0.0f, "jobb", 0.0f, "jobc", 1.0f)
);
    }

}