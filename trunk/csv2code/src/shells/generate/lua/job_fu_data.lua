--
-- 副职业定义表.csv
-- 副职业ID = lv
-- 副职业类型 = upExp
-- 副职业名称 = upServantExp
-- 木材 = joba
-- 石材 = jobb
-- 铜钱 = jobc

local data = {
    [1] = {["lv"] = 1, ["upExp"] = 1, ["upServantExp"] = "初级匠师", ["joba"] = 0.04, ["jobb"] = 0.0, ["jobc"] = 0.0},
    [2] = {["lv"] = 2, ["upExp"] = 1, ["upServantExp"] = "1级匠师", ["joba"] = 0.12, ["jobb"] = 0.0, ["jobc"] = 0.0},
    [3] = {["lv"] = 3, ["upExp"] = 1, ["upServantExp"] = "2级匠师", ["joba"] = 0.2, ["jobb"] = 0.0, ["jobc"] = 0.0},
    [4] = {["lv"] = 4, ["upExp"] = 1, ["upServantExp"] = "3级匠师", ["joba"] = 0.28, ["jobb"] = 0.0, ["jobc"] = 0.0},
    [5] = {["lv"] = 5, ["upExp"] = 1, ["upServantExp"] = "4级匠师", ["joba"] = 0.36, ["jobb"] = 0.0, ["jobc"] = 0.0},
    [6] = {["lv"] = 6, ["upExp"] = 1, ["upServantExp"] = "5级匠师", ["joba"] = 0.44, ["jobb"] = 0.0, ["jobc"] = 0.0},
    [7] = {["lv"] = 7, ["upExp"] = 1, ["upServantExp"] = "6级匠师", ["joba"] = 0.52, ["jobb"] = 0.0, ["jobc"] = 0.0},
    [8] = {["lv"] = 8, ["upExp"] = 1, ["upServantExp"] = "7级匠师", ["joba"] = 0.6, ["jobb"] = 0.0, ["jobc"] = 0.0},
    [9] = {["lv"] = 9, ["upExp"] = 1, ["upServantExp"] = "8级匠师", ["joba"] = 0.68, ["jobb"] = 0.0, ["jobc"] = 0.0},
    [10] = {["lv"] = 10, ["upExp"] = 1, ["upServantExp"] = "9级匠师", ["joba"] = 0.76, ["jobb"] = 0.0, ["jobc"] = 0.0},
    [11] = {["lv"] = 11, ["upExp"] = 1, ["upServantExp"] = "10级匠师", ["joba"] = 0.84, ["jobb"] = 0.0, ["jobc"] = 0.0},
    [12] = {["lv"] = 12, ["upExp"] = 1, ["upServantExp"] = "11级匠师", ["joba"] = 0.92, ["jobb"] = 0.0, ["jobc"] = 0.0},
    [13] = {["lv"] = 13, ["upExp"] = 1, ["upServantExp"] = "12级匠师", ["joba"] = 1.0, ["jobb"] = 0.0, ["jobc"] = 0.0},
    [14] = {["lv"] = 14, ["upExp"] = 2, ["upServantExp"] = "初级裁缝", ["joba"] = 0.0, ["jobb"] = 0.04, ["jobc"] = 0.0},
    [15] = {["lv"] = 15, ["upExp"] = 2, ["upServantExp"] = "1级裁缝", ["joba"] = 0.0, ["jobb"] = 0.12, ["jobc"] = 0.0},
    [16] = {["lv"] = 16, ["upExp"] = 2, ["upServantExp"] = "2级裁缝", ["joba"] = 0.0, ["jobb"] = 0.2, ["jobc"] = 0.0},
    [17] = {["lv"] = 17, ["upExp"] = 2, ["upServantExp"] = "3级裁缝", ["joba"] = 0.0, ["jobb"] = 0.28, ["jobc"] = 0.0},
    [18] = {["lv"] = 18, ["upExp"] = 2, ["upServantExp"] = "4级裁缝", ["joba"] = 0.0, ["jobb"] = 0.36, ["jobc"] = 0.0},
    [19] = {["lv"] = 19, ["upExp"] = 2, ["upServantExp"] = "5级裁缝", ["joba"] = 0.0, ["jobb"] = 0.44, ["jobc"] = 0.0},
    [20] = {["lv"] = 20, ["upExp"] = 2, ["upServantExp"] = "6级裁缝", ["joba"] = 0.0, ["jobb"] = 0.52, ["jobc"] = 0.0},
    [21] = {["lv"] = 21, ["upExp"] = 2, ["upServantExp"] = "7级裁缝", ["joba"] = 0.0, ["jobb"] = 0.6, ["jobc"] = 0.0},
    [22] = {["lv"] = 22, ["upExp"] = 2, ["upServantExp"] = "8级裁缝", ["joba"] = 0.0, ["jobb"] = 0.68, ["jobc"] = 0.0},
    [23] = {["lv"] = 23, ["upExp"] = 2, ["upServantExp"] = "9级裁缝", ["joba"] = 0.0, ["jobb"] = 0.76, ["jobc"] = 0.0},
    [24] = {["lv"] = 24, ["upExp"] = 2, ["upServantExp"] = "10级裁缝", ["joba"] = 0.0, ["jobb"] = 0.84, ["jobc"] = 0.0},
    [25] = {["lv"] = 25, ["upExp"] = 2, ["upServantExp"] = "11级裁缝", ["joba"] = 0.0, ["jobb"] = 0.92, ["jobc"] = 0.0},
    [26] = {["lv"] = 26, ["upExp"] = 2, ["upServantExp"] = "12级裁缝", ["joba"] = 0.0, ["jobb"] = 1.0, ["jobc"] = 0.0},
    [27] = {["lv"] = 27, ["upExp"] = 3, ["upServantExp"] = "初级诗人", ["joba"] = 0.0, ["jobb"] = 0.0, ["jobc"] = 0.04},
    [28] = {["lv"] = 28, ["upExp"] = 3, ["upServantExp"] = "1级诗人", ["joba"] = 0.0, ["jobb"] = 0.0, ["jobc"] = 0.12},
    [29] = {["lv"] = 29, ["upExp"] = 3, ["upServantExp"] = "2级诗人", ["joba"] = 0.0, ["jobb"] = 0.0, ["jobc"] = 0.2},
    [30] = {["lv"] = 30, ["upExp"] = 3, ["upServantExp"] = "3级诗人", ["joba"] = 0.0, ["jobb"] = 0.0, ["jobc"] = 0.28},
    [31] = {["lv"] = 31, ["upExp"] = 3, ["upServantExp"] = "4级诗人", ["joba"] = 0.0, ["jobb"] = 0.0, ["jobc"] = 0.36},
    [32] = {["lv"] = 32, ["upExp"] = 3, ["upServantExp"] = "5级诗人", ["joba"] = 0.0, ["jobb"] = 0.0, ["jobc"] = 0.44},
    [33] = {["lv"] = 33, ["upExp"] = 3, ["upServantExp"] = "6级诗人", ["joba"] = 0.0, ["jobb"] = 0.0, ["jobc"] = 0.52},
    [34] = {["lv"] = 34, ["upExp"] = 3, ["upServantExp"] = "7级诗人", ["joba"] = 0.0, ["jobb"] = 0.0, ["jobc"] = 0.6},
    [35] = {["lv"] = 35, ["upExp"] = 3, ["upServantExp"] = "8级诗人", ["joba"] = 0.0, ["jobb"] = 0.0, ["jobc"] = 0.68},
    [36] = {["lv"] = 36, ["upExp"] = 3, ["upServantExp"] = "9级诗人", ["joba"] = 0.0, ["jobb"] = 0.0, ["jobc"] = 0.76},
    [37] = {["lv"] = 37, ["upExp"] = 3, ["upServantExp"] = "10级诗人", ["joba"] = 0.0, ["jobb"] = 0.0, ["jobc"] = 0.84},
    [38] = {["lv"] = 38, ["upExp"] = 3, ["upServantExp"] = "11级诗人", ["joba"] = 0.0, ["jobb"] = 0.0, ["jobc"] = 0.92},
    [39] = {["lv"] = 39, ["upExp"] = 3, ["upServantExp"] = "12级诗人", ["joba"] = 0.0, ["jobb"] = 0.0, ["jobc"] = 1.0}
}

return data