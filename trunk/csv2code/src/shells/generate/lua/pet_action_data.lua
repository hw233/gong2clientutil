--
-- 宠物行为表.csv
-- 编号 = id
-- 行为名称 = ActionName
-- 行为类型 = ActionType
-- 参数值 = value
-- 对应物品 = ItemId

local data = {
    [80001] = {["id"] = 80001, ["ActionName"] = "点心", ["ActionType"] = 1, ["value"] = 20, ["ItemId"] = 80001},
    [80002] = {["id"] = 80002, ["ActionName"] = "茶水", ["ActionType"] = 1, ["value"] = 50, ["ItemId"] = 80002},
    [80003] = {["id"] = 80003, ["ActionName"] = "球", ["ActionType"] = 2, ["value"] = 20, ["ItemId"] = 80003},
    [80004] = {["id"] = 80004, ["ActionName"] = "跳绳", ["ActionType"] = 2, ["value"] = 50, ["ItemId"] = 80004}
}

return data