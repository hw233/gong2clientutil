--
-- 派系权谋操作表.csv
-- 操作编号 = id
-- 操作名称 = name
-- 操作类型 = type
-- 说明 = illustrate
-- 消耗资源类型 = costtype
-- 消耗资源数值 = costnum
-- 成功类型 = successtype
-- 操作成功概率 = successRate
-- 奖励掉落库 = dropID
-- 奖励次数 = dropNum
-- 操作派系职位限制 = limit
-- 影响类型 = effecttype
-- 影响的具体数值 = effectnum

local data = {
    [1] = {["id"] = 1, ["name"] = "锁定目标", ["type"] = 1, ["illustrate"] = "减少目标影响力", ["costtype"] = {10000, 10011}, ["costnum"] = {10000, 1}, ["successtype"] = 1, ["successRate"] = 1, ["dropID"] = {21}, ["dropNum"] = {5}, ["limit"] = {1, 2, 3, 4}, ["effecttype"] = 1, ["effectnum"] = 1000},
    [2] = {["id"] = 2, ["name"] = "惩奸除恶", ["type"] = 2, ["illustrate"] = "减少目标资金", ["costtype"] = {10000, 10011}, ["costnum"] = {10000, 1}, ["successtype"] = 1, ["successRate"] = 1, ["dropID"] = {21}, ["dropNum"] = {5}, ["limit"] = {1, 2, 3, 4}, ["effecttype"] = 2, ["effectnum"] = 20000},
    [3] = {["id"] = 3, ["name"] = "行侠仗义", ["type"] = 3, ["illustrate"] = "减少大量影响力", ["costtype"] = {10001, 10011}, ["costnum"] = {500, 1}, ["successtype"] = 2, ["successRate"] = 0, ["dropID"] = {21}, ["dropNum"] = {10}, ["limit"] = {1, 2, 3, 4}, ["effecttype"] = 1, ["effectnum"] = 5000}
}

return data