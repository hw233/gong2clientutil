--
-- 官品操作表.csv
-- 操作编号 = id
-- 操作名称 = name
-- 操作类型 = type
-- 按钮出现的官品等级 = limitGrade
-- 按钮出现的玩家等级 = limitLv
-- 效果说明 = illustrate
-- 消耗资源类型 = costtype
-- 消耗资源数值 = costnum
-- 对方增加资源类型 = gaintype
-- 对方增加资源数值 = gainnum
-- 每日操作次数 = time
-- 对方获得的BUFF效果 = targetBuff
-- 对方获得的BUFF时间 = targetBufftime
-- 己方获得的BUFF效果 = OwnBuff
-- 己方获得的BUFF时间 = OwnBufftime
-- 变形美术资源 = distortion

local data = {
    [1] = {["id"] = 1, ["name"] = "掌嘴"},
    [2] = {["id"] = 2, ["name"] = "流言"},
    [3] = {["id"] = 3, ["name"] = "禁言"},
    [4] = {["id"] = 4, ["name"] = "变猪"},
    [5] = {["id"] = 5, ["name"] = "上朝"},
    [6] = {["id"] = 6, ["name"] = "褒奖"},
    [7] = {["id"] = 7, ["name"] = "提携"},
    [8] = {["id"] = 8, ["name"] = "请安"},
    [9] = {["id"] = 9, ["name"] = "进贡"},
    [10] = {["id"] = 10, ["name"] = "大赦天下"}
}

return data