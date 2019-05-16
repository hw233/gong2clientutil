--
-- 特权表.csv
-- 编号 = id
-- 名称 = name
-- VIP等级 = vipLv
-- 金额 = gold
-- 道具 = item
-- 购买道具价格 = buyMoney
-- 购买次数 = num
-- 每日体力购买次数 = hpNum
-- 每日许愿次数 = vowNum
-- 是否可跳过战斗 = ifFight
-- 武将本是否开启重置 = lifeResetting

local data = {
    [1001] = {["id"] = 1001, ["name"] = "VIP 1", ["vipLv"] = 1, ["gold"] = 60, ["item"] = 101, ["buyMoney"] = 6, ["num"] = 1, ["hpNum"] = 1, ["vowNum"] = 5, ["ifFight"] = false, ["lifeResetting"] = true},
    [1002] = {["id"] = 1002, ["name"] = "VIP 2", ["vipLv"] = 2, ["gold"] = 300, ["item"] = 101, ["buyMoney"] = 100, ["num"] = 1, ["hpNum"] = 1, ["vowNum"] = 10, ["ifFight"] = false, ["lifeResetting"] = true},
    [1003] = {["id"] = 1003, ["name"] = "VIP 3", ["vipLv"] = 3, ["gold"] = 1000, ["item"] = 101, ["buyMoney"] = 200, ["num"] = 1, ["hpNum"] = 1, ["vowNum"] = 20, ["ifFight"] = true, ["lifeResetting"] = true},
    [1004] = {["id"] = 1004, ["name"] = "VIP 4", ["vipLv"] = 4, ["gold"] = 2000, ["item"] = 101, ["buyMoney"] = 400, ["num"] = 1, ["hpNum"] = 1, ["vowNum"] = 50, ["ifFight"] = true, ["lifeResetting"] = true},
    [1005] = {["id"] = 1005, ["name"] = "VIP 5", ["vipLv"] = 5, ["gold"] = 5000, ["item"] = 101, ["buyMoney"] = 800, ["num"] = 1, ["hpNum"] = 1, ["vowNum"] = 100, ["ifFight"] = true, ["lifeResetting"] = true},
    [1006] = {["id"] = 1006, ["name"] = "VIP 6", ["vipLv"] = 6, ["gold"] = 10000, ["item"] = 101, ["buyMoney"] = 800, ["num"] = 1, ["hpNum"] = 1, ["vowNum"] = 200, ["ifFight"] = true, ["lifeResetting"] = true},
    [1007] = {["id"] = 1007, ["name"] = "VIP 7", ["vipLv"] = 7, ["gold"] = 25000, ["item"] = 101, ["buyMoney"] = 800, ["num"] = 1, ["hpNum"] = 1, ["vowNum"] = 500, ["ifFight"] = true, ["lifeResetting"] = true},
    [1008] = {["id"] = 1008, ["name"] = "VIP 8", ["vipLv"] = 8, ["gold"] = 50000, ["item"] = 101, ["buyMoney"] = 800, ["num"] = 1, ["hpNum"] = 1, ["vowNum"] = 1000, ["ifFight"] = true, ["lifeResetting"] = true},
    [1009] = {["id"] = 1009, ["name"] = "VIP 9", ["vipLv"] = 9, ["gold"] = 80000, ["item"] = 101, ["buyMoney"] = 800, ["num"] = 1, ["hpNum"] = 1, ["vowNum"] = 1000, ["ifFight"] = true, ["lifeResetting"] = true},
    [1010] = {["id"] = 1010, ["name"] = "VIP 10", ["vipLv"] = 10, ["gold"] = 120000, ["item"] = 101, ["buyMoney"] = 800, ["num"] = 1, ["hpNum"] = 1, ["vowNum"] = 1000, ["ifFight"] = true, ["lifeResetting"] = true},
    [1011] = {["id"] = 1011, ["name"] = "VIP 11", ["vipLv"] = 11, ["gold"] = 160000, ["item"] = 101, ["buyMoney"] = 1000, ["num"] = 1, ["hpNum"] = 1, ["vowNum"] = 1000, ["ifFight"] = true, ["lifeResetting"] = true},
    [1012] = {["id"] = 1012, ["name"] = "VIP 12", ["vipLv"] = 12, ["gold"] = 200000, ["item"] = 101, ["buyMoney"] = 1000, ["num"] = 1, ["hpNum"] = 1, ["vowNum"] = 1000, ["ifFight"] = true, ["lifeResetting"] = true},
    [1013] = {["id"] = 1013, ["name"] = "VIP 13", ["vipLv"] = 13, ["gold"] = 250000, ["item"] = 101, ["buyMoney"] = 650, ["num"] = 1, ["hpNum"] = 1, ["vowNum"] = 1000, ["ifFight"] = true, ["lifeResetting"] = true},
    [1014] = {["id"] = 1014, ["name"] = "VIP 14", ["vipLv"] = 14, ["gold"] = 350000, ["item"] = 101, ["buyMoney"] = 900, ["num"] = 1, ["hpNum"] = 1, ["vowNum"] = 1000, ["ifFight"] = true, ["lifeResetting"] = true},
    [1015] = {["id"] = 1015, ["name"] = "VIP 15", ["vipLv"] = 15, ["gold"] = 500000, ["item"] = 101, ["buyMoney"] = 1590, ["num"] = 1, ["hpNum"] = 1, ["vowNum"] = 1000, ["ifFight"] = true, ["lifeResetting"] = true}
}

return data