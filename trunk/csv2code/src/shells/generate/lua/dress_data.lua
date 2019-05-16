--
-- 时装表.csv
-- 装扮编号 = id
-- 性别 = sex
-- 图片id = imageId
-- 层级 = order
-- 位置 = location
-- 属性ID = porpertyID
-- 增加属性 = porpertyValue
-- 套装类型 = clothType
-- 装扮类型 = type
-- 套装特效 = clothEffect
-- 是否反转 = clothReversal
-- 套装比例 = clothProportion

local data = {
    [29000] = {["id"] = 29000, ["sex"] = 1, ["imageId"] = {29000}, ["order"] = {10}, ["location"] = {1000}, ["clothType"] = {29008}, ["type"] = 1, ["clothReversal"] = 0},
    [29001] = {["id"] = 29001, ["sex"] = 1, ["imageId"] = {29001}, ["order"] = {4}, ["location"] = {1001}, ["clothType"] = {29008}, ["type"] = 2, ["clothReversal"] = 0},
    [29002] = {["id"] = 29002, ["sex"] = 1, ["imageId"] = {29002}, ["order"] = {9}, ["location"] = {1002}, ["clothType"] = {29008}, ["type"] = 3, ["clothReversal"] = 0},
    [29003] = {["id"] = 29003, ["sex"] = 1, ["imageId"] = {29003}, ["order"] = {9}, ["location"] = {1003}, ["type"] = 4, ["clothReversal"] = 0},
    [29004] = {["id"] = 29004, ["sex"] = 1, ["imageId"] = {29004}, ["order"] = {10}, ["location"] = {1004}, ["clothType"] = {29009}, ["type"] = 1, ["clothReversal"] = 0},
    [29005] = {["id"] = 29005, ["sex"] = 1, ["imageId"] = {29005}, ["order"] = {4}, ["location"] = {1005}, ["clothType"] = {29009}, ["type"] = 2, ["clothReversal"] = 0},
    [29006] = {["id"] = 29006, ["sex"] = 1, ["imageId"] = {29006}, ["order"] = {9}, ["location"] = {1002}, ["clothType"] = {29009}, ["type"] = 3, ["clothReversal"] = 0},
    [29007] = {["id"] = 29007, ["sex"] = 1, ["imageId"] = {29007}, ["order"] = {9}, ["location"] = {1003}, ["type"] = 4, ["clothReversal"] = 0},
    [29008] = {["id"] = 29008, ["sex"] = 1, ["imageId"] = {29008}, ["order"] = {4}, ["location"] = {1006}, ["clothType"] = {29001, 29002, 29000}, ["type"] = 5, ["clothEffect"] = 29008, ["clothReversal"] = 1, ["clothProportion"] = 102},
    [29009] = {["id"] = 29009, ["sex"] = 1, ["imageId"] = {29009}, ["order"] = {4}, ["location"] = {1007}, ["clothType"] = {29004, 29005, 29006}, ["type"] = 5, ["clothEffect"] = 1001, ["clothReversal"] = 0, ["clothProportion"] = 96},
    [29500] = {["id"] = 29500, ["sex"] = 0, ["imageId"] = {29500}, ["order"] = {10}, ["location"] = {2005}, ["clothType"] = {29508}, ["type"] = 1, ["clothReversal"] = 0},
    [29501] = {["id"] = 29501, ["sex"] = 0, ["imageId"] = {29501}, ["order"] = {4}, ["location"] = {2004}, ["clothType"] = {29508}, ["type"] = 2, ["clothReversal"] = 0},
    [29502] = {["id"] = 29502, ["sex"] = 0, ["imageId"] = {29502}, ["order"] = {9}, ["location"] = {2002}, ["clothType"] = {29508}, ["type"] = 3, ["clothReversal"] = 0},
    [29503] = {["id"] = 29503, ["sex"] = 0, ["imageId"] = {29503}, ["order"] = {9}, ["location"] = {2003}, ["type"] = 4, ["clothReversal"] = 0},
    [29504] = {["id"] = 29504, ["sex"] = 0, ["imageId"] = {29504}, ["order"] = {10}, ["location"] = {2000}, ["clothType"] = {29509}, ["type"] = 1, ["clothReversal"] = 0},
    [29505] = {["id"] = 29505, ["sex"] = 0, ["imageId"] = {29505}, ["order"] = {4}, ["location"] = {2001}, ["clothType"] = {29509}, ["type"] = 2, ["clothReversal"] = 0},
    [29506] = {["id"] = 29506, ["sex"] = 0, ["imageId"] = {29506}, ["order"] = {9}, ["location"] = {2002}, ["clothType"] = {29509}, ["type"] = 3, ["clothReversal"] = 0},
    [29507] = {["id"] = 29507, ["sex"] = 0, ["imageId"] = {29507}, ["order"] = {9}, ["location"] = {2003}, ["type"] = 4, ["clothReversal"] = 0},
    [29508] = {["id"] = 29508, ["sex"] = 0, ["imageId"] = {29508}, ["order"] = {4}, ["location"] = {2003}, ["clothType"] = {29501, 29502, 29500}, ["type"] = 5, ["clothEffect"] = 1000, ["clothReversal"] = 0, ["clothProportion"] = 99},
    [29509] = {["id"] = 29509, ["sex"] = 0, ["imageId"] = {29509}, ["order"] = {4}, ["location"] = {2006}, ["clothType"] = {29504, 29505, 29506}, ["type"] = 5, ["clothEffect"] = 29509, ["clothReversal"] = 0, ["clothProportion"] = 115}
}

return data