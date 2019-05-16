--
-- 派系建筑等级表.csv
-- 编号 = id
-- 建筑类型 = type
-- 建筑名称 = deputyleader
-- 建筑等级 = buildinglv
-- 消耗材料类型 = expendtype
-- 消耗材料数量 = expendnum
-- 升级条件类型 = uptype
-- 升级条件 = upnum
-- 建筑作用效果描述 = desc
-- 议政厅派系影响力上限 = effectlimit
-- 议政厅派系资金力上限 = fundlimit
-- 升级建筑增加的派系影响力值 = upeffect

local data = {
    [1] = {["id"] = 1, ["type"] = 1, ["deputyleader"] = "议政厅", ["buildinglv"] = 1, ["expendtype"] = {10005}, ["expendnum"] = {108000}, ["uptype"] = 2, ["upnum"] = 20, ["effectlimit"] = 1000000, ["fundlimit"] = 1000000, ["upeffect"] = 1000},
    [2] = {["id"] = 2, ["type"] = 1, ["deputyleader"] = "议政厅", ["buildinglv"] = 2, ["expendtype"] = {10005}, ["expendnum"] = {240000}, ["uptype"] = 2, ["upnum"] = 30, ["desc"] = "1.建筑等级达到2级\n2.解锁派系任务建筑等级\n3.解锁派系商店建筑等级", ["effectlimit"] = 1500000, ["fundlimit"] = 2500000, ["upeffect"] = 2000},
    [3] = {["id"] = 3, ["type"] = 1, ["deputyleader"] = "议政厅", ["buildinglv"] = 3, ["expendtype"] = {10005}, ["expendnum"] = {528000}, ["uptype"] = 2, ["upnum"] = 40, ["desc"] = "1.建筑等级达到3级\n2.解锁派系高手建筑等级\n3.解锁派系挑战建筑等级", ["effectlimit"] = 2000000, ["fundlimit"] = 4000000, ["upeffect"] = 3000},
    [4] = {["id"] = 4, ["type"] = 1, ["deputyleader"] = "议政厅", ["buildinglv"] = 4, ["expendtype"] = {10005}, ["expendnum"] = {864000}, ["uptype"] = 2, ["upnum"] = 50, ["desc"] = "1.建筑等级达到4级\n2.解锁派系任务建筑等级\n3.解锁派系商店建筑等级", ["effectlimit"] = 2500000, ["fundlimit"] = 5500000, ["upeffect"] = 4000},
    [5] = {["id"] = 5, ["type"] = 1, ["deputyleader"] = "议政厅", ["buildinglv"] = 5, ["expendtype"] = {10005}, ["expendnum"] = {1404000}, ["uptype"] = 2, ["upnum"] = 60, ["desc"] = "1.建筑等级达到5级\n2.解锁派系高手建筑等级\n3.解锁派系挑战建筑等级", ["effectlimit"] = 3000000, ["fundlimit"] = 7000000, ["upeffect"] = 5000},
    [6] = {["id"] = 6, ["type"] = 1, ["deputyleader"] = "议政厅", ["buildinglv"] = 6, ["expendtype"] = {10005}, ["expendnum"] = {2016000}, ["uptype"] = 2, ["upnum"] = 70, ["desc"] = "1.建筑等级达到6级\n2.解锁派系任务建筑等级\n3.解锁派系商店建筑等级", ["effectlimit"] = 3500000, ["fundlimit"] = 8500000, ["upeffect"] = 6000},
    [7] = {["id"] = 7, ["type"] = 1, ["deputyleader"] = "议政厅", ["buildinglv"] = 7, ["expendtype"] = {10005}, ["expendnum"] = {2880000}, ["uptype"] = 2, ["upnum"] = 80, ["desc"] = "1.建筑等级达到7级\n2.解锁派系高手建筑等级\n3.解锁派系挑战建筑等级", ["effectlimit"] = 4000000, ["fundlimit"] = 10000000, ["upeffect"] = 7000},
    [8] = {["id"] = 8, ["type"] = 1, ["deputyleader"] = "议政厅", ["buildinglv"] = 8, ["expendtype"] = {10005}, ["expendnum"] = {3840000}, ["uptype"] = 2, ["upnum"] = 90, ["desc"] = "1.建筑等级达到8级\n2.解锁派系任务建筑等级\n3.解锁派系商店建筑等级", ["effectlimit"] = 4500000, ["fundlimit"] = 11500000, ["upeffect"] = 8000},
    [9] = {["id"] = 9, ["type"] = 1, ["deputyleader"] = "议政厅", ["buildinglv"] = 9, ["expendtype"] = {10005}, ["expendnum"] = {5100000}, ["uptype"] = 2, ["upnum"] = 100, ["desc"] = "1.建筑等级达到9级\n2.解锁派系高手建筑等级\n3.解锁派系挑战建筑等级", ["effectlimit"] = 5000000, ["fundlimit"] = 13000000, ["upeffect"] = 9000},
    [10] = {["id"] = 10, ["type"] = 1, ["deputyleader"] = "议政厅", ["buildinglv"] = 10, ["expendtype"] = {10005}, ["expendnum"] = {6480000}, ["uptype"] = 2, ["upnum"] = 110, ["desc"] = "1.建筑等级达到10级\n2.解锁派系任务建筑等级\n3.解锁派系商店建筑等级", ["effectlimit"] = 5500000, ["fundlimit"] = 14500000, ["upeffect"] = 10000},
    [11] = {["id"] = 11, ["type"] = 1, ["deputyleader"] = "议政厅", ["buildinglv"] = 11, ["expendtype"] = {10005}, ["expendnum"] = {8208000}, ["uptype"] = 2, ["upnum"] = 120, ["desc"] = "1.建筑等级达到11级\n2.解锁派系高手建筑等级\n3.解锁派系挑战建筑等级", ["effectlimit"] = 6000000, ["fundlimit"] = 16000000, ["upeffect"] = 11000},
    [12] = {["id"] = 12, ["type"] = 1, ["deputyleader"] = "议政厅", ["buildinglv"] = 12, ["uptype"] = 2, ["desc"] = "1.建筑等级达到12级\n2.解锁派系高手建筑等级\n3.解锁派系挑战建筑等级"},
    [13] = {["id"] = 13, ["type"] = 2, ["deputyleader"] = "派系任务", ["buildinglv"] = 1, ["expendtype"] = {10005}, ["expendnum"] = {120000}, ["uptype"] = 1, ["upnum"] = 2, ["upeffect"] = 500},
    [14] = {["id"] = 14, ["type"] = 2, ["deputyleader"] = "派系任务", ["buildinglv"] = 2, ["expendtype"] = {10005}, ["expendnum"] = {432000}, ["uptype"] = 1, ["upnum"] = 4, ["desc"] = "1.建筑等级达到2级\n2.任务奖励更多个人贡献值", ["upeffect"] = 600},
    [15] = {["id"] = 15, ["type"] = 2, ["deputyleader"] = "派系任务", ["buildinglv"] = 3, ["expendtype"] = {10005}, ["expendnum"] = {1008000}, ["uptype"] = 1, ["upnum"] = 6, ["desc"] = "1.建筑等级达到3级\n2.任务奖励更多个人贡献值", ["upeffect"] = 900},
    [16] = {["id"] = 16, ["type"] = 2, ["deputyleader"] = "派系任务", ["buildinglv"] = 4, ["expendtype"] = {10005}, ["expendnum"] = {1920000}, ["uptype"] = 1, ["upnum"] = 8, ["desc"] = "1.建筑等级达到4级\n2.任务奖励更多个人贡献值", ["upeffect"] = 1000},
    [17] = {["id"] = 17, ["type"] = 2, ["deputyleader"] = "派系任务", ["buildinglv"] = 5, ["expendtype"] = {10005}, ["expendnum"] = {3240000}, ["uptype"] = 1, ["upnum"] = 10, ["desc"] = "1.建筑等级达到5级\n2.任务奖励更多个人贡献值", ["upeffect"] = 1100},
    [18] = {["id"] = 18, ["type"] = 2, ["deputyleader"] = "派系任务", ["buildinglv"] = 6, ["uptype"] = 1, ["desc"] = "1.建筑等级达到6级\n2.任务奖励更多个人贡献值"},
    [19] = {["id"] = 19, ["type"] = 3, ["deputyleader"] = "派系挑战", ["buildinglv"] = 1, ["expendtype"] = {10005}, ["expendnum"] = {264000}, ["uptype"] = 1, ["upnum"] = 3, ["upeffect"] = 500},
    [20] = {["id"] = 20, ["type"] = 3, ["deputyleader"] = "派系挑战", ["buildinglv"] = 2, ["expendtype"] = {10005}, ["expendnum"] = {702000}, ["uptype"] = 1, ["upnum"] = 5, ["desc"] = "1.建筑等级达到2级\n2.解锁新的挑战势力", ["upeffect"] = 600},
    [21] = {["id"] = 21, ["type"] = 3, ["deputyleader"] = "派系挑战", ["buildinglv"] = 3, ["expendtype"] = {10005}, ["expendnum"] = {1440000}, ["uptype"] = 1, ["upnum"] = 7, ["desc"] = "1.建筑等级达到3级\n2.解锁新的挑战势力", ["upeffect"] = 900},
    [22] = {["id"] = 22, ["type"] = 3, ["deputyleader"] = "派系挑战", ["buildinglv"] = 4, ["expendtype"] = {10005}, ["expendnum"] = {2550000}, ["uptype"] = 1, ["upnum"] = 9, ["desc"] = "1.建筑等级达到4级\n2.解锁新的挑战势力", ["upeffect"] = 1000},
    [23] = {["id"] = 23, ["type"] = 3, ["deputyleader"] = "派系挑战", ["buildinglv"] = 5, ["expendtype"] = {10005}, ["expendnum"] = {4104000}, ["uptype"] = 1, ["upnum"] = 11, ["desc"] = "1.建筑等级达到5级\n2.解锁新的挑战势力", ["upeffect"] = 1100},
    [24] = {["id"] = 24, ["type"] = 3, ["deputyleader"] = "派系挑战", ["buildinglv"] = 6, ["expendtype"] = {10005}, ["uptype"] = 1, ["desc"] = "1.建筑等级达到6级\n2.解锁新的挑战势力"},
    [25] = {["id"] = 25, ["type"] = 4, ["deputyleader"] = "派系高手", ["buildinglv"] = 1, ["expendtype"] = {10005}, ["expendnum"] = {264000}, ["uptype"] = 1, ["upnum"] = 3, ["upeffect"] = 500},
    [26] = {["id"] = 26, ["type"] = 4, ["deputyleader"] = "派系高手", ["buildinglv"] = 2, ["expendtype"] = {10005}, ["expendnum"] = {702000}, ["uptype"] = 1, ["upnum"] = 5, ["desc"] = "1.建筑等级达到2级\n2.解锁新的高手", ["upeffect"] = 600},
    [27] = {["id"] = 27, ["type"] = 4, ["deputyleader"] = "派系高手", ["buildinglv"] = 3, ["expendtype"] = {10005}, ["expendnum"] = {1440000}, ["uptype"] = 1, ["upnum"] = 7, ["desc"] = "1.建筑等级达到3级\n2.解锁新的高手", ["upeffect"] = 900},
    [28] = {["id"] = 28, ["type"] = 4, ["deputyleader"] = "派系高手", ["buildinglv"] = 4, ["expendtype"] = {10005}, ["expendnum"] = {2550000}, ["uptype"] = 1, ["upnum"] = 9, ["desc"] = "1.建筑等级达到4级\n2.解锁新的高手", ["upeffect"] = 1000},
    [29] = {["id"] = 29, ["type"] = 4, ["deputyleader"] = "派系高手", ["buildinglv"] = 5, ["expendtype"] = {10005}, ["expendnum"] = {4104000}, ["uptype"] = 1, ["upnum"] = 11, ["desc"] = "1.建筑等级达到5级\n2.解锁新的高手", ["upeffect"] = 1100},
    [30] = {["id"] = 30, ["type"] = 4, ["deputyleader"] = "派系高手", ["buildinglv"] = 6, ["expendtype"] = {10005}, ["uptype"] = 1, ["desc"] = "1.建筑等级达到6级\n2.解锁新的高手"},
    [31] = {["id"] = 31, ["type"] = 5, ["deputyleader"] = "派系商店", ["buildinglv"] = 1, ["expendtype"] = {10005}, ["expendnum"] = {120000}, ["uptype"] = 1, ["upnum"] = 2, ["upeffect"] = 500},
    [32] = {["id"] = 32, ["type"] = 5, ["deputyleader"] = "派系商店", ["buildinglv"] = 2, ["expendtype"] = {10005}, ["expendnum"] = {432000}, ["uptype"] = 1, ["upnum"] = 4, ["desc"] = "1.建筑等级达到2级\n2.解锁新的物品", ["upeffect"] = 600},
    [33] = {["id"] = 33, ["type"] = 5, ["deputyleader"] = "派系商店", ["buildinglv"] = 3, ["expendtype"] = {10005}, ["expendnum"] = {1008000}, ["uptype"] = 1, ["upnum"] = 6, ["desc"] = "1.建筑等级达到3级\n2.解锁新的物品", ["upeffect"] = 900},
    [34] = {["id"] = 34, ["type"] = 5, ["deputyleader"] = "派系商店", ["buildinglv"] = 4, ["expendtype"] = {10005}, ["expendnum"] = {1920000}, ["uptype"] = 1, ["upnum"] = 8, ["desc"] = "1.建筑等级达到4级\n2.解锁新的物品", ["upeffect"] = 1000},
    [35] = {["id"] = 35, ["type"] = 5, ["deputyleader"] = "派系商店", ["buildinglv"] = 5, ["expendtype"] = {10005}, ["expendnum"] = {3240000}, ["uptype"] = 1, ["upnum"] = 10, ["desc"] = "1.建筑等级达到5级\n2.解锁新的物品", ["upeffect"] = 1100},
    [36] = {["id"] = 36, ["type"] = 5, ["deputyleader"] = "派系商店", ["buildinglv"] = 6, ["uptype"] = 1, ["desc"] = "1.建筑等级达到6级\n2.解锁新的物品"}
}

return data