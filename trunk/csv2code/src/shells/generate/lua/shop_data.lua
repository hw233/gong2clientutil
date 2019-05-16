--
-- 商店表.csv
-- 编号 = id
-- 名称 = name
-- 图片 = pic
-- 类型 = type
-- 随机出现的商品数量 = num
-- 系统刷新间隔时间 = spacetime
-- 刷新消耗类型 = costtype
-- 刷新消耗数值 = costnum
-- 每日刷新次数 = costtime

local data = {
    [1] = {["id"] = 1, ["name"] = "商店", ["type"] = 2},
    [2] = {["id"] = 2, ["name"] = "派系商店", ["type"] = 2},
    [3] = {["id"] = 3, ["name"] = "客卿商店", ["type"] = 1, ["num"] = 8, ["spacetime"] = 720, ["costtype"] = 10001, ["costnum"] = {20, 20, 20, 20, 20}, ["costtime"] = 5},
    [4] = {["id"] = 4, ["name"] = "名剑商店", ["type"] = 2, ["num"] = 8, ["spacetime"] = 720, ["costtype"] = 10001, ["costnum"] = {20, 20, 20, 20, 20}, ["costtime"] = 5},
    [5] = {["id"] = 5, ["name"] = "鲜花商店", ["type"] = 2},
    [6] = {["id"] = 6, ["name"] = "装扮商店", ["type"] = 2},
    [7] = {["id"] = 7, ["name"] = "玲珑商店", ["type"] = 2}
}

return data