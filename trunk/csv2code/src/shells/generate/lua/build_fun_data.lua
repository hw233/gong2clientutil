--
-- 建筑功能表.csv
-- 编号 = id
-- 系统名称 = name
-- 开放等级 = openLv
-- 对应引导 = ydId
-- 是否开启显示 = show
-- 系统图标名字 = icon
-- 系统UI = uiId
-- 系统提示 = tishi

local data = {
    [100] = {["id"] = 100, ["name"] = "拆除", ["openLv"] = 1, ["show"] = 1, ["icon"] = 100},
    [101] = {["id"] = 101, ["name"] = "旋转", ["openLv"] = 1, ["show"] = 1, ["icon"] = 101},
    [102] = {["id"] = 102, ["name"] = "采木", ["openLv"] = 1, ["show"] = 1, ["icon"] = 102},
    [103] = {["id"] = 103, ["name"] = "采矿", ["openLv"] = 1, ["show"] = 1, ["icon"] = 103},
    [104] = {["id"] = 104, ["name"] = "庄园背包", ["openLv"] = 1, ["show"] = 1, ["icon"] = 104},
    [105] = {["id"] = 105, ["name"] = "家具制作", ["openLv"] = 1, ["show"] = 1, ["icon"] = 105},
    [106] = {["id"] = 106, ["name"] = "信息", ["openLv"] = 1, ["show"] = 1, ["icon"] = 106},
    [107] = {["id"] = 107, ["name"] = "鲜花房", ["openLv"] = 1, ["show"] = 1, ["icon"] = 107}
}

return data