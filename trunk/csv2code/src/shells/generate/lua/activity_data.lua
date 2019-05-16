--
-- 活动开启时间表.csv
-- 编号 = id
-- 名称 = name
-- 排序 = order
-- 开启等级 = openLv
-- 开放时间 = openTime
-- 开放时间显示 = timeShow
-- 每日免费次数 = freeNum
-- 描述 = describe
-- 玩法描述 = playDsc
-- 是否推送 = open

local data = {
    [1000] = {["id"] = 1000, ["name"] = "世界首领", ["order"] = 2, ["openLv"] = 22, ["openTime"] = {"11:30:00,12:30:00||", "18:00:00,18:30:00||"}, ["timeShow"] = "每天中午12点和晚上8点开启", ["freeNum"] = 1, ["describe"] = "可以获得大量铜钱、元宝、稀有道具奖励", ["playDsc"] = "每天中午12点和晚上8点开启", ["open"] = 1},
    [1001] = {["id"] = 1001, ["name"] = "每日补体力", ["order"] = 2, ["openLv"] = 0, ["openTime"] = {"12:00:00,13:00:00||", "18:00:00,19:00:01||"}, ["timeShow"] = "每天中午12点和晚上6点开启", ["freeNum"] = 2, ["describe"] = "可以获得体力", ["playDsc"] = "每天中午12点和晚上6点开启", ["open"] = 0}
}

return data