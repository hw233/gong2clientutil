--
-- 派系捐献表.csv
-- 捐献编号 = id
-- 名称 = name
-- 消耗资源类型 = costtype
-- 消耗资源数值 = costnum
-- 消耗道具ID = costprop
-- 奖励类型 = award
-- 派系资金 = factionsaward

local data = {
    [1] = {["id"] = 1, ["name"] = "蓝", ["costtype"] = {10000}, ["costnum"] = {2700}, ["award"] = {11}, ["factionsaward"] = 300},
    [2] = {["id"] = 2, ["name"] = "紫", ["costtype"] = {10001}, ["costnum"] = {100}, ["award"] = {12}, ["factionsaward"] = 450},
    [3] = {["id"] = 3, ["name"] = "橙", ["costtype"] = {10001}, ["costnum"] = {1000}, ["costprop"] = 12056, ["award"] = {13}, ["factionsaward"] = 1000}
}

return data