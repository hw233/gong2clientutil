--
-- 活动奖励表.csv
-- 编号 = id
-- 活动描述 = dsc
-- 活动组 = optId
-- 子顺序 = order
-- 条件值 = conValue
-- 奖励物品 = award

local data = {
    [1000] = {["id"] = 1000, ["dsc"] = "在线奖励", ["optId"] = 1004, ["order"] = 1, ["conValue"] = "300", ["award"] = 101},
    [1001] = {["id"] = 1001, ["dsc"] = "在线奖励", ["optId"] = 1004, ["order"] = 2, ["conValue"] = "900", ["award"] = 101},
    [1002] = {["id"] = 1002, ["dsc"] = "在线奖励", ["optId"] = 1004, ["order"] = 3, ["conValue"] = "2100", ["award"] = 101},
    [1003] = {["id"] = 1003, ["dsc"] = "在线奖励", ["optId"] = 1004, ["order"] = 4, ["conValue"] = "3600", ["award"] = 101},
    [1004] = {["id"] = 1004, ["dsc"] = "在线奖励", ["optId"] = 1004, ["order"] = 5, ["conValue"] = "5400", ["award"] = 101},
    [2000] = {["id"] = 2000, ["dsc"] = "签到第1天", ["optId"] = 1003, ["order"] = 1, ["conValue"] = "1", ["award"] = 101},
    [2001] = {["id"] = 2001, ["dsc"] = "签到第2天", ["optId"] = 1003, ["order"] = 2, ["conValue"] = "2", ["award"] = 101},
    [2002] = {["id"] = 2002, ["dsc"] = "签到第3天", ["optId"] = 1003, ["order"] = 3, ["conValue"] = "3", ["award"] = 101},
    [2003] = {["id"] = 2003, ["dsc"] = "签到第4天", ["optId"] = 1003, ["order"] = 4, ["conValue"] = "4", ["award"] = 101},
    [2004] = {["id"] = 2004, ["dsc"] = "签到第5天", ["optId"] = 1003, ["order"] = 5, ["conValue"] = "5", ["award"] = 101},
    [2005] = {["id"] = 2005, ["dsc"] = "签到第6天", ["optId"] = 1003, ["order"] = 6, ["conValue"] = "6", ["award"] = 101},
    [2006] = {["id"] = 2006, ["dsc"] = "签到第7天", ["optId"] = 1003, ["order"] = 7, ["conValue"] = "7", ["award"] = 101}
}

return data