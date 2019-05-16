--
-- 礼包商城表.csv
-- id = id
-- 礼包名称 = name
-- 礼包顺序 = order
-- 礼包数量 = num
-- 礼包内容 = content
-- 内容数量 = contentnum
-- 是否限时 = limit
-- 限时时间 = timeLimit
-- 限时时间显示 = timeshow
-- 每日购买次数 = openGuanka
-- 等级限制 = limitlv
-- 官品限制 = limitgrade
-- VIP限制 = limitvip
-- 购买消耗类型 = costkind
-- 购买消耗数量 = costnum

local data = {
    [31000] = {["id"] = 31000, ["name"] = "限时大礼包", ["order"] = 1, ["num"] = 5, ["content"] = {12000, 12001, 12002}, ["contentnum"] = {3, 5, 10}, ["limit"] = 1, ["timeLimit"] = {"12:00:00,12:30:00||"}, ["timeshow"] = "每天12点-12点30分开始售卖", ["openGuanka"] = 1, ["limitlv"] = 5}
}

return data