--
-- 商品表.csv
-- 编号 = id
-- 所属商店 = kind
-- 商品顺序 = order
-- 商品道具 = prop
-- 道具数量 = num
-- 随机权重 = weight
-- 商品折扣 = discount
-- 每日购买次数 = time
-- 购买消耗货币类型 = costkind
-- 购买消耗货币数值 = costnum
-- 官品限制 = limitgrade
-- 等级限制 = limitlv
-- 派系商店等级限制 = limitbuilding

local data = {
    [10000] = {["id"] = 10000, ["kind"] = "1", ["order"] = 1, ["prop"] = 10027, ["num"] = 1, ["time"] = 1, ["costkind"] = 10001, ["costnum"] = 100, ["limitgrade"] = 8},
    [10001] = {["id"] = 10001, ["kind"] = "1", ["order"] = 2, ["prop"] = 10030, ["num"] = 1, ["time"] = 1, ["costkind"] = 10001, ["costnum"] = 200, ["limitgrade"] = 11},
    [10002] = {["id"] = 10002, ["kind"] = "1", ["order"] = 3, ["prop"] = 10033, ["num"] = 1, ["time"] = 1, ["costkind"] = 10001, ["costnum"] = 400, ["limitgrade"] = 14},
    [10003] = {["id"] = 10003, ["kind"] = "1", ["order"] = 4, ["prop"] = 10036, ["num"] = 1, ["time"] = 1, ["costkind"] = 10001, ["costnum"] = 800, ["limitgrade"] = 17},
    [10004] = {["id"] = 10004, ["kind"] = "1", ["order"] = 5, ["prop"] = 12075, ["num"] = 1, ["costkind"] = 10001, ["costnum"] = 1},
    [10005] = {["id"] = 10005, ["kind"] = "1", ["order"] = 6, ["prop"] = 12076, ["num"] = 1, ["costkind"] = 10001, ["costnum"] = 1},
    [10006] = {["id"] = 10006, ["kind"] = "1", ["order"] = 7, ["prop"] = 12077, ["num"] = 1, ["costkind"] = 10001, ["costnum"] = 1},
    [10007] = {["id"] = 10007, ["kind"] = "1", ["order"] = 8, ["prop"] = 12078, ["num"] = 1, ["costkind"] = 10001, ["costnum"] = 1},
    [10008] = {["id"] = 10008, ["kind"] = "1", ["order"] = 9, ["prop"] = 12079, ["num"] = 1, ["costkind"] = 10001, ["costnum"] = 1},
    [10009] = {["id"] = 10009, ["kind"] = "1", ["order"] = 10, ["prop"] = 12076, ["num"] = 1, ["costkind"] = 10001, ["costnum"] = 1},
    [10010] = {["id"] = 10010, ["kind"] = "1", ["order"] = 11, ["prop"] = 12062, ["num"] = 1, ["costkind"] = 10001, ["costnum"] = 1},
    [10011] = {["id"] = 10011, ["kind"] = "1", ["order"] = 12, ["prop"] = 12080, ["num"] = 1, ["costkind"] = 10001, ["costnum"] = 1},
    [10012] = {["id"] = 10012, ["kind"] = "1", ["order"] = 13, ["prop"] = 12081, ["num"] = 1, ["costkind"] = 10001, ["costnum"] = 1},
    [20000] = {["id"] = 20000, ["kind"] = "2", ["order"] = 1, ["prop"] = 10011, ["num"] = 1, ["costkind"] = 10004, ["costnum"] = 100, ["limitbuilding"] = 1},
    [20001] = {["id"] = 20001, ["kind"] = "2", ["order"] = 2, ["prop"] = 26001, ["num"] = 1, ["costkind"] = 10004, ["costnum"] = 1000, ["limitbuilding"] = 1},
    [20002] = {["id"] = 20002, ["kind"] = "2", ["order"] = 3, ["prop"] = 26011, ["num"] = 1, ["costkind"] = 10004, ["costnum"] = 1000, ["limitbuilding"] = 1},
    [20003] = {["id"] = 20003, ["kind"] = "2", ["order"] = 4, ["prop"] = 26021, ["num"] = 1, ["costkind"] = 10004, ["costnum"] = 1000, ["limitbuilding"] = 1},
    [20004] = {["id"] = 20004, ["kind"] = "2", ["order"] = 5, ["prop"] = 26031, ["num"] = 1, ["costkind"] = 10004, ["costnum"] = 1000, ["limitbuilding"] = 1},
    [20005] = {["id"] = 20005, ["kind"] = "2", ["order"] = 6, ["prop"] = 26041, ["num"] = 1, ["costkind"] = 10004, ["costnum"] = 1000, ["limitbuilding"] = 1},
    [20006] = {["id"] = 20006, ["kind"] = "2", ["order"] = 7, ["prop"] = 26051, ["num"] = 1, ["costkind"] = 10004, ["costnum"] = 1000, ["limitbuilding"] = 1},
    [20007] = {["id"] = 20007, ["kind"] = "2", ["order"] = 8, ["prop"] = 10015, ["num"] = 1, ["time"] = 1, ["costkind"] = 10004, ["costnum"] = 200, ["limitbuilding"] = 3},
    [20008] = {["id"] = 20008, ["kind"] = "2", ["order"] = 9, ["prop"] = 26061, ["num"] = 1, ["costkind"] = 10004, ["costnum"] = 2000, ["limitbuilding"] = 2},
    [20009] = {["id"] = 20009, ["kind"] = "2", ["order"] = 10, ["prop"] = 26066, ["num"] = 1, ["costkind"] = 10004, ["costnum"] = 2000, ["limitbuilding"] = 3},
    [20010] = {["id"] = 20010, ["kind"] = "2", ["order"] = 11, ["prop"] = 26071, ["num"] = 1, ["costkind"] = 10004, ["costnum"] = 2000, ["limitbuilding"] = 4},
    [20011] = {["id"] = 20011, ["kind"] = "2", ["order"] = 12, ["prop"] = 26076, ["num"] = 1, ["costkind"] = 10004, ["costnum"] = 2000, ["limitbuilding"] = 5},
    [20012] = {["id"] = 20012, ["kind"] = "2", ["order"] = 13, ["prop"] = 26166, ["num"] = 1, ["costkind"] = 10004, ["costnum"] = 2000, ["limitbuilding"] = 6},
    [30000] = {["id"] = 30000, ["kind"] = "3", ["order"] = 1, ["prop"] = 40006, ["num"] = 5, ["weight"] = 10, ["costkind"] = 10008, ["costnum"] = 20, ["limitlv"] = 20},
    [30001] = {["id"] = 30001, ["kind"] = "3", ["order"] = 2, ["prop"] = 40010, ["num"] = 5, ["weight"] = 10, ["costkind"] = 10008, ["costnum"] = 20, ["limitlv"] = 20},
    [30002] = {["id"] = 30002, ["kind"] = "3", ["order"] = 3, ["prop"] = 40009, ["num"] = 5, ["weight"] = 50, ["costkind"] = 10008, ["costnum"] = 14, ["limitlv"] = 20},
    [30003] = {["id"] = 30003, ["kind"] = "3", ["order"] = 4, ["prop"] = 40012, ["num"] = 5, ["weight"] = 100, ["costkind"] = 10008, ["costnum"] = 14, ["limitlv"] = 20},
    [30004] = {["id"] = 30004, ["kind"] = "3", ["order"] = 5, ["prop"] = 40013, ["num"] = 5, ["weight"] = 100, ["costkind"] = 10008, ["costnum"] = 14, ["limitlv"] = 20},
    [30005] = {["id"] = 30005, ["kind"] = "3", ["order"] = 6, ["prop"] = 40014, ["num"] = 5, ["weight"] = 100, ["costkind"] = 10008, ["costnum"] = 14, ["limitlv"] = 20},
    [30006] = {["id"] = 30006, ["kind"] = "3", ["order"] = 7, ["prop"] = 40015, ["num"] = 5, ["weight"] = 100, ["costkind"] = 10008, ["costnum"] = 14, ["limitlv"] = 20},
    [30007] = {["id"] = 30007, ["kind"] = "3", ["order"] = 8, ["prop"] = 40016, ["num"] = 5, ["weight"] = 200, ["costkind"] = 10008, ["costnum"] = 14, ["limitlv"] = 20},
    [30008] = {["id"] = 30008, ["kind"] = "3", ["order"] = 9, ["prop"] = 40017, ["num"] = 5, ["weight"] = 200, ["costkind"] = 10008, ["costnum"] = 14, ["limitlv"] = 20},
    [30009] = {["id"] = 30009, ["kind"] = "3", ["order"] = 10, ["prop"] = 40026, ["num"] = 5, ["weight"] = 200, ["costkind"] = 10008, ["costnum"] = 12, ["limitlv"] = 20},
    [30010] = {["id"] = 30010, ["kind"] = "3", ["order"] = 11, ["prop"] = 40028, ["num"] = 5, ["weight"] = 200, ["costkind"] = 10008, ["costnum"] = 12, ["limitlv"] = 20},
    [40000] = {["id"] = 40000, ["kind"] = "4", ["order"] = 1, ["prop"] = 31020, ["num"] = 1, ["costkind"] = 10007, ["costnum"] = 18000, ["limitgrade"] = 3},
    [40001] = {["id"] = 40001, ["kind"] = "4", ["order"] = 2, ["prop"] = 31021, ["num"] = 1, ["costkind"] = 10007, ["costnum"] = 18000, ["limitgrade"] = 6},
    [40002] = {["id"] = 40002, ["kind"] = "4", ["order"] = 3, ["prop"] = 31022, ["num"] = 1, ["costkind"] = 10007, ["costnum"] = 18000, ["limitgrade"] = 9},
    [40003] = {["id"] = 40003, ["kind"] = "4", ["order"] = 4, ["prop"] = 31023, ["num"] = 1, ["costkind"] = 10007, ["costnum"] = 18000, ["limitgrade"] = 12},
    [40004] = {["id"] = 40004, ["kind"] = "4", ["order"] = 5, ["prop"] = 31026, ["num"] = 500, ["costkind"] = 10007, ["costnum"] = 1100, ["limitgrade"] = 1},
    [40005] = {["id"] = 40005, ["kind"] = "4", ["order"] = 6, ["prop"] = 31026, ["num"] = 2000, ["costkind"] = 10007, ["costnum"] = 4400, ["limitgrade"] = 1},
    [40006] = {["id"] = 40006, ["kind"] = "4", ["order"] = 7, ["prop"] = 31026, ["num"] = 5000, ["costkind"] = 10007, ["costnum"] = 10900, ["limitgrade"] = 1},
    [50000] = {["id"] = 50000, ["kind"] = "5", ["order"] = 1, ["prop"] = 24000, ["num"] = 1, ["discount"] = {0.5, 0.7, 0.9}, ["costkind"] = 10001, ["costnum"] = 100},
    [50001] = {["id"] = 50001, ["kind"] = "5", ["order"] = 2, ["prop"] = 24001, ["num"] = 1, ["discount"] = {0.5, 0.7, 0.9}, ["costkind"] = 10001, ["costnum"] = 100},
    [50002] = {["id"] = 50002, ["kind"] = "5", ["order"] = 3, ["prop"] = 24002, ["num"] = 1, ["discount"] = {0.5, 0.7, 0.9}, ["costkind"] = 10001, ["costnum"] = 200},
    [50003] = {["id"] = 50003, ["kind"] = "5", ["order"] = 4, ["prop"] = 24003, ["num"] = 1, ["discount"] = {0.5, 0.7, 0.9}, ["costkind"] = 10001, ["costnum"] = 200},
    [50004] = {["id"] = 50004, ["kind"] = "5", ["order"] = 5, ["prop"] = 24004, ["num"] = 1, ["discount"] = {0.5, 0.7, 0.9}, ["costkind"] = 10001, ["costnum"] = 300},
    [60000] = {["id"] = 60000, ["kind"] = "6", ["order"] = 1, ["prop"] = 29000, ["num"] = 1, ["costkind"] = 10001, ["costnum"] = 500},
    [60001] = {["id"] = 60001, ["kind"] = "6", ["order"] = 2, ["prop"] = 29001, ["num"] = 1, ["costkind"] = 10001, ["costnum"] = 800},
    [60002] = {["id"] = 60002, ["kind"] = "6", ["order"] = 3, ["prop"] = 29002, ["num"] = 1, ["costkind"] = 10001, ["costnum"] = 500},
    [60003] = {["id"] = 60003, ["kind"] = "6", ["order"] = 4, ["prop"] = 29003, ["num"] = 1, ["costkind"] = 10001, ["costnum"] = 1000},
    [60004] = {["id"] = 60004, ["kind"] = "6", ["order"] = 5, ["prop"] = 29004, ["num"] = 1, ["costkind"] = 10001, ["costnum"] = 500},
    [60005] = {["id"] = 60005, ["kind"] = "6", ["order"] = 6, ["prop"] = 29005, ["num"] = 1, ["costkind"] = 10001, ["costnum"] = 800},
    [60006] = {["id"] = 60006, ["kind"] = "6", ["order"] = 7, ["prop"] = 29006, ["num"] = 1, ["costkind"] = 10001, ["costnum"] = 500},
    [60007] = {["id"] = 60007, ["kind"] = "6", ["order"] = 8, ["prop"] = 29007, ["num"] = 1, ["costkind"] = 10001, ["costnum"] = 1000},
    [61008] = {["id"] = 61008, ["kind"] = "6", ["order"] = 1, ["prop"] = 29500, ["num"] = 1, ["costkind"] = 10001, ["costnum"] = 500},
    [61009] = {["id"] = 61009, ["kind"] = "6", ["order"] = 2, ["prop"] = 29501, ["num"] = 1, ["costkind"] = 10001, ["costnum"] = 800},
    [61010] = {["id"] = 61010, ["kind"] = "6", ["order"] = 3, ["prop"] = 29502, ["num"] = 1, ["costkind"] = 10001, ["costnum"] = 500},
    [61011] = {["id"] = 61011, ["kind"] = "6", ["order"] = 4, ["prop"] = 29503, ["num"] = 1, ["costkind"] = 10001, ["costnum"] = 1000},
    [61012] = {["id"] = 61012, ["kind"] = "6", ["order"] = 5, ["prop"] = 29504, ["num"] = 1, ["costkind"] = 10001, ["costnum"] = 500},
    [61013] = {["id"] = 61013, ["kind"] = "6", ["order"] = 6, ["prop"] = 29505, ["num"] = 1, ["costkind"] = 10001, ["costnum"] = 800},
    [61014] = {["id"] = 61014, ["kind"] = "6", ["order"] = 7, ["prop"] = 29506, ["num"] = 1, ["costkind"] = 10001, ["costnum"] = 500},
    [61015] = {["id"] = 61015, ["kind"] = "6", ["order"] = 8, ["prop"] = 29507, ["num"] = 1, ["costkind"] = 10001, ["costnum"] = 1000},
    [61016] = {["id"] = 61016, ["kind"] = "7", ["order"] = 1, ["prop"] = 12059, ["num"] = 1, ["costkind"] = 10014, ["costnum"] = 45},
    [61017] = {["id"] = 61017, ["kind"] = "7", ["order"] = 2, ["prop"] = 12060, ["num"] = 1, ["costkind"] = 10014, ["costnum"] = 900},
    [61018] = {["id"] = 61018, ["kind"] = "7", ["order"] = 3, ["prop"] = 11112, ["num"] = 1, ["costkind"] = 10014, ["costnum"] = 3200},
    [61019] = {["id"] = 61019, ["kind"] = "7", ["order"] = 4, ["prop"] = 11113, ["num"] = 1, ["costkind"] = 10014, ["costnum"] = 3200},
    [61020] = {["id"] = 61020, ["kind"] = "7", ["order"] = 5, ["prop"] = 11114, ["num"] = 1, ["costkind"] = 10014, ["costnum"] = 3200},
    [61021] = {["id"] = 61021, ["kind"] = "7", ["order"] = 6, ["prop"] = 11115, ["num"] = 1, ["costkind"] = 10014, ["costnum"] = 3200},
    [61022] = {["id"] = 61022, ["kind"] = "7", ["order"] = 7, ["prop"] = 11120, ["num"] = 1, ["costkind"] = 10014, ["costnum"] = 2560},
    [61023] = {["id"] = 61023, ["kind"] = "7", ["order"] = 8, ["prop"] = 11121, ["num"] = 1, ["costkind"] = 10014, ["costnum"] = 2560},
    [61024] = {["id"] = 61024, ["kind"] = "7", ["order"] = 9, ["prop"] = 11122, ["num"] = 1, ["costkind"] = 10014, ["costnum"] = 2560},
    [61025] = {["id"] = 61025, ["kind"] = "7", ["order"] = 10, ["prop"] = 11123, ["num"] = 1, ["costkind"] = 10014, ["costnum"] = 2560},
    [61026] = {["id"] = 61026, ["kind"] = "7", ["order"] = 11, ["prop"] = 11220, ["num"] = 1, ["costkind"] = 10014, ["costnum"] = 3200},
    [61027] = {["id"] = 61027, ["kind"] = "7", ["order"] = 12, ["prop"] = 11221, ["num"] = 1, ["costkind"] = 10014, ["costnum"] = 3200},
    [61028] = {["id"] = 61028, ["kind"] = "7", ["order"] = 13, ["prop"] = 12004, ["num"] = 220, ["time"] = 1, ["costkind"] = 10014, ["costnum"] = 100},
    [62000] = {["id"] = 62000, ["kind"] = "6", ["order"] = 9, ["prop"] = 29008, ["num"] = 1, ["costkind"] = 10001, ["costnum"] = 1800},
    [62001] = {["id"] = 62001, ["kind"] = "6", ["order"] = 10, ["prop"] = 29009, ["num"] = 1, ["costkind"] = 10001, ["costnum"] = 1800},
    [62500] = {["id"] = 62500, ["kind"] = "6", ["order"] = 9, ["prop"] = 29508, ["num"] = 1, ["costkind"] = 10001, ["costnum"] = 1800},
    [62501] = {["id"] = 62501, ["kind"] = "6", ["order"] = 10, ["prop"] = 29509, ["num"] = 1, ["costkind"] = 10001, ["costnum"] = 1800}
}

return data