--
-- 官员定义表.csv
-- 官员编号 = id
-- 官员名称 = number
-- 官员权力 = deputyleader

local data = {
    [1] = {["id"] = 1, ["number"] = "首领", ["deputyleader"] = {1, 2, 3, 4, 5, 6, 7, 8, 9}},
    [2] = {["id"] = 2, ["number"] = "副首领", ["deputyleader"] = {1, 2, 3, 4, 5, 6, 7, 8}},
    [3] = {["id"] = 3, ["number"] = "外交官", ["deputyleader"] = {1, 2, 3, 4, 5, 6, 7}},
    [4] = {["id"] = 4, ["number"] = "内政官", ["deputyleader"] = {1, 2, 3, 4, 5}},
    [5] = {["id"] = 5, ["number"] = "精英", ["deputyleader"] = {1, 2, 3, 4, 5}},
    [6] = {["id"] = 6, ["number"] = "成员"}
}

return data