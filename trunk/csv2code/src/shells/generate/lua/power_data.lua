--
-- 官员定义表.csv
-- 官员编号 = id
-- 官员名称 = name
-- 官员权力 = power

local data = {
    [1] = {["id"] = 1, ["name"] = "帮主", ["power"] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}},
    [2] = {["id"] = 2, ["name"] = "副帮主", ["power"] = {1, 2, 3, 4, 5, 8, 9, 10, 11}},
    [3] = {["id"] = 3, ["name"] = "外交使者", ["power"] = {1, 2, 8, 9, 10}},
    [4] = {["id"] = 4, ["name"] = "内务总管", ["power"] = {1, 3, 4, 5, 9}},
    [5] = {["id"] = 5, ["name"] = "精英"},
    [6] = {["id"] = 6, ["name"] = "成员"}
}

return data