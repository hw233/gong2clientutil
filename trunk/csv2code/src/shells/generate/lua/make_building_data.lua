--
-- 建筑合成表.csv
-- 建筑编号编号 = id
-- 建筑名 = name
-- 建筑分类 = classify
-- 合成材料 = material
-- 材料数量 = num

local data = {
    [1500] = {["id"] = 1500, ["name"] = "宠物房", ["classify"] = 1, ["material"] = {12077, 10009, 12007, 12008}, ["num"] = {1, 80000, 5, 5}},
    [1501] = {["id"] = 1501, ["name"] = "高级宠物房", ["classify"] = 1, ["material"] = {12078, 10009, 12007, 12008}, ["num"] = {1, 80000, 5, 5}},
    [1502] = {["id"] = 1502, ["name"] = "江南小铺", ["classify"] = 1, ["material"] = {12078, 10009, 12009, 12010}, ["num"] = {1, 80000, 5, 5}},
    [1503] = {["id"] = 1503, ["name"] = "摘星阁", ["classify"] = 1, ["material"] = {12079, 10009, 12009, 12010}, ["num"] = {1, 180000, 5, 5}},
    [1504] = {["id"] = 1504, ["name"] = "太液池", ["classify"] = 4, ["material"] = {12076, 10009, 12017, 12018}, ["num"] = {1, 500000, 5, 5}},
    [2000] = {["id"] = 2000, ["name"] = "小路", ["classify"] = 2, ["material"] = {12062, 10009, 12027, 12028}, ["num"] = {1, 20000, 5, 5}},
    [2001] = {["id"] = 2001, ["name"] = "地板", ["classify"] = 2, ["material"] = {12062, 10009, 12027, 12028}, ["num"] = {1, 80000, 5, 5}},
    [2201] = {["id"] = 2201, ["name"] = "露天雪温泉", ["classify"] = 2, ["material"] = {12078, 10009, 12029, 12030}, ["num"] = {1, 80000, 5, 5}},
    [2202] = {["id"] = 2202, ["name"] = "小假山", ["classify"] = 2, ["material"] = {12077, 10009, 12029, 12030}, ["num"] = {1, 80000, 5, 5}},
    [2203] = {["id"] = 2203, ["name"] = "烟波里假山", ["classify"] = 2, ["material"] = {12077, 10009, 12039, 12040}, ["num"] = {1, 20000, 5, 5}},
    [2204] = {["id"] = 2204, ["name"] = "相思桥", ["classify"] = 2, ["material"] = {12077, 10009, 12039, 12040}, ["num"] = {1, 120000, 5, 5}},
    [2326] = {["id"] = 2326, ["name"] = "樱花树", ["classify"] = 3, ["material"] = {12080, 10009, 12047, 12048}, ["num"] = {1, 20000, 5, 5}},
    [2327] = {["id"] = 2327, ["name"] = "三春泷樱树", ["classify"] = 3, ["material"] = {12081, 10009, 12049, 12050}, ["num"] = {1, 80000, 5, 5}},
    [2800] = {["id"] = 2800, ["name"] = "棋桌", ["classify"] = 2, ["material"] = {12075, 10009, 12006, 12007}, ["num"] = {1, 80000, 5, 5}},
    [2801] = {["id"] = 2801, ["name"] = "石凳", ["classify"] = 2, ["material"] = {12075, 10009, 12007, 12008}, ["num"] = {1, 20000, 5, 5}},
    [2802] = {["id"] = 2802, ["name"] = "石灯", ["classify"] = 2, ["material"] = {12075, 10009, 12009, 12010}, ["num"] = {1, 20000, 5, 5}},
    [2803] = {["id"] = 2803, ["name"] = "花园路灯", ["classify"] = 2, ["material"] = {12076, 10009, 12019, 12020}, ["num"] = {1, 20000, 5, 5}},
    [2804] = {["id"] = 2804, ["name"] = "红木塔灯", ["classify"] = 2, ["material"] = {12076, 10009, 12029, 12030}, ["num"] = {1, 20000, 5, 5}},
    [2805] = {["id"] = 2805, ["name"] = "长相思亭宇", ["classify"] = 2, ["material"] = {12078, 10009, 12039, 12040}, ["num"] = {1, 80000, 5, 5}}
}

return data