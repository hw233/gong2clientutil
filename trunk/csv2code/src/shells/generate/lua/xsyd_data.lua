--
-- 新手引导表.csv
-- 编号 = id
-- 下一引导 = nextId
-- 引导步骤 = ydbz
-- 关键点 = keyStep
-- 是否是建造的步骤 = isBuild
-- 引导描述 = describe
-- 建筑id = buildId
-- 建造建筑id = haveBuildId
-- 经验 = exp
-- 开放等级 = openClass
-- 是否是功能引导 = isFunctions
-- 物品id = itemsId
-- 物品数量 = itemsNumber
-- 跳至 = jumpTo

local data = {
    [10001] = {["id"] = 10001, ["ydbz"] = {20001, 20002, 20003, 20004}, ["keyStep"] = 20004, ["isBuild"] = 0},
    [10002] = {["id"] = 10002, ["ydbz"] = {30001, 30002, 30003}, ["keyStep"] = 30003, ["isBuild"] = 0},
    [10003] = {["id"] = 10003, ["nextId"] = 10002, ["ydbz"] = {40001, 40002, 40003, 40004, 40005, 40006, 40007, 40008, 40009, 40010}, ["keyStep"] = 40010, ["isBuild"] = 0},
    [10004] = {["id"] = 10004, ["ydbz"] = {50001, 50002, 50003}, ["keyStep"] = 50003},
    [10005] = {["id"] = 10005, ["ydbz"] = {60001, 60002, 60003, 60004, 60005, 60006, 60007}, ["keyStep"] = 60007, ["isBuild"] = 0},
    [10006] = {["id"] = 10006, ["ydbz"] = {70001, 70002}, ["keyStep"] = 70002},
    [10007] = {["id"] = 10007, ["ydbz"] = {70003, 70004}, ["keyStep"] = 70004},
    [10008] = {["id"] = 10008, ["ydbz"] = {1, 5}, ["keyStep"] = 5, ["openClass"] = 12},
    [10009] = {["id"] = 10009, ["ydbz"] = {90201, 6, 7, 8, 9}, ["keyStep"] = 9, ["openClass"] = 10},
    [10010] = {["id"] = 10010, ["ydbz"] = {10, 11, 12}, ["keyStep"] = 12, ["openClass"] = 7},
    [10011] = {["id"] = 10011, ["ydbz"] = {13, 14, 15, 16}, ["keyStep"] = 16, ["openClass"] = 9},
    [10012] = {["id"] = 10012, ["nextId"] = 10024, ["ydbz"] = {17, 18, 19, 20}, ["keyStep"] = 20},
    [10014] = {["id"] = 10014, ["ydbz"] = {90001, 90102, 90103, 90104}, ["keyStep"] = 90104},
    [10015] = {["id"] = 10015, ["ydbz"] = {90201, 90202, 90203, 90204, 90205, 90206, 90207, 90208}, ["keyStep"] = 90208, ["openClass"] = 14},
    [10016] = {["id"] = 10016, ["ydbz"] = {90301, 90302, 90303, 90304, 90305, 90306, 90307, 90308, 90309, 90310, 90311, 90208, 90312, 90313, 90314, 90315, 90316, 90317, 90318, 90319, 90320, 90004}, ["keyStep"] = 90004, ["openClass"] = 18},
    [10017] = {["id"] = 10017, ["ydbz"] = {90401, 90402, 90403, 90404, 90405, 90407}, ["keyStep"] = 90407, ["openClass"] = 20},
    [10018] = {["id"] = 10018, ["ydbz"] = {90501, 90502, 90503, 90504, 90505, 90506, 90507}, ["keyStep"] = 90507, ["openClass"] = 25},
    [10019] = {["id"] = 10019, ["ydbz"] = {90601, 90602, 90603, 90604, 90605, 90606}, ["keyStep"] = 90606},
    [10020] = {["id"] = 10020, ["ydbz"] = {90701, 90702, 90703, 90704}, ["keyStep"] = 90704},
    [10021] = {["id"] = 10021, ["ydbz"] = {90801, 90802, 90803, 90804, 90805, 90806}, ["keyStep"] = 90806},
    [10022] = {["id"] = 10022, ["ydbz"] = {100001, 100002, 100003, 100004}, ["keyStep"] = 100004, ["openClass"] = 7},
    [10023] = {["id"] = 10023, ["ydbz"] = {100101, 100102, 100103, 100104}, ["keyStep"] = 100104, ["openClass"] = 16},
    [10024] = {["id"] = 10024, ["ydbz"] = {100201, 100202, 100203, 100204, 100205, 100206, 100207, 100208, 100209}, ["keyStep"] = 100209},
    [10025] = {["id"] = 10025, ["ydbz"] = {100301, 100302, 100303, 100304, 100305, 100306}, ["keyStep"] = 100306, ["openClass"] = 11},
    [10026] = {["id"] = 10026, ["ydbz"] = {100401, 100402, 100403}, ["keyStep"] = 100403},
    [10027] = {["id"] = 10027, ["ydbz"] = {80001, 80002}, ["keyStep"] = 80002},
    [10028] = {["id"] = 10028, ["nextId"] = 10029, ["ydbz"] = {100404, 100405}, ["keyStep"] = 100405},
    [10029] = {["id"] = 10029, ["nextId"] = 10022, ["ydbz"] = {30005, 30006, 30007}, ["keyStep"] = 30007},
    [37006] = {["id"] = 37006, ["ydbz"] = {90002, 90003, 90004}, ["keyStep"] = 90004}
}

return data