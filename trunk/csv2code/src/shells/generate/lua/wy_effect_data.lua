--
-- 位移效果表.csv
-- 编号 = id
-- 位移分类 = wyKind
-- 瞬移掩藏时间 = fadeoutTime
-- 位移音效编号 = wySound
-- 位移音效延迟 = wySoundDely
-- 移动点判断 = ydd
-- 目标点偏移 = tgtOffset
-- 抛物线曲率 = curvature
-- 移动速度 = spd
-- 弹道加速度 = acc
-- 逐渐放大比例 = zoomRatio
-- 是否要位移动作 = wyAction
-- 面向类型 = mxKind

local data = {
    [10000] = {["id"] = 10000, ["wyKind"] = 1, ["ydd"] = 1, ["tgtOffset"] = {0, 0}, ["spd"] = 0.0, ["mxKind"] = 1},
    [10001] = {["id"] = 10001, ["wyKind"] = 1, ["ydd"] = 3, ["tgtOffset"] = {0, 0}, ["spd"] = 16.0},
    [10002] = {["id"] = 10002, ["wyKind"] = 2, ["fadeoutTime"] = 0.2, ["ydd"] = 3, ["tgtOffset"] = {0, 0}},
    [10003] = {["id"] = 10003, ["wyKind"] = 1, ["fadeoutTime"] = 0.0, ["ydd"] = 2, ["tgtOffset"] = {150, 0}, ["spd"] = 16.0},
    [10004] = {["id"] = 10004, ["wyKind"] = 1, ["fadeoutTime"] = 0.0, ["ydd"] = 1, ["tgtOffset"] = {50, 0}, ["spd"] = 16.0},
    [10005] = {["id"] = 10005, ["wyKind"] = 1, ["fadeoutTime"] = 0.0, ["ydd"] = 2, ["tgtOffset"] = {100, 0}, ["spd"] = 16.0},
    [20000] = {["id"] = 20000, ["wyKind"] = 1, ["ydd"] = 2, ["tgtOffset"] = {0, 0}, ["spd"] = 6.0, ["acc"] = 2, ["mxKind"] = 2},
    [20001] = {["id"] = 20001, ["wyKind"] = 1, ["fadeoutTime"] = 0.0, ["ydd"] = 2, ["tgtOffset"] = {-85, 0}, ["spd"] = 32.0, ["mxKind"] = 2},
    [20002] = {["id"] = 20002, ["wyKind"] = 1, ["ydd"] = 2, ["tgtOffset"] = {150, 0}, ["spd"] = 8.0, ["acc"] = 2, ["mxKind"] = 2},
    [20003] = {["id"] = 20003, ["wyKind"] = 1, ["ydd"] = 2, ["tgtOffset"] = {50, 0}, ["spd"] = 12.0},
    [20004] = {["id"] = 20004, ["wyKind"] = 1, ["ydd"] = 2, ["tgtOffset"] = {0, 150}, ["spd"] = 12.0, ["acc"] = 2, ["mxKind"] = 2},
    [20005] = {["id"] = 20005, ["wyKind"] = 1, ["ydd"] = 2, ["tgtOffset"] = {150, 0}, ["spd"] = 12.0},
    [20006] = {["id"] = 20006, ["wyKind"] = 1, ["ydd"] = 2, ["tgtOffset"] = {100, 100}, ["spd"] = 8.0},
    [20007] = {["id"] = 20007, ["wyKind"] = 1, ["ydd"] = 2, ["tgtOffset"] = {20, 120}, ["spd"] = 8.0},
    [20008] = {["id"] = 20008, ["wyKind"] = 1, ["ydd"] = 2, ["tgtOffset"] = {140, 0}, ["spd"] = 12.0},
    [20009] = {["id"] = 20009, ["wyKind"] = 1, ["ydd"] = 2, ["tgtOffset"] = {100, 120}, ["spd"] = 8.0},
    [20010] = {["id"] = 20010, ["wyKind"] = 1, ["ydd"] = 2, ["tgtOffset"] = {100, 80}, ["curvature"] = 0.4, ["spd"] = 6.0},
    [20011] = {["id"] = 20011, ["wyKind"] = 1, ["ydd"] = 2, ["tgtOffset"] = {50, 20}, ["spd"] = 8.0},
    [20012] = {["id"] = 20012, ["wyKind"] = 1, ["ydd"] = 2, ["tgtOffset"] = {0, 0}, ["curvature"] = -0.4, ["spd"] = 8.0},
    [20013] = {["id"] = 20013, ["wyKind"] = 1, ["ydd"] = 2, ["tgtOffset"] = {0, 0}, ["spd"] = 11.0},
    [20014] = {["id"] = 20014, ["wyKind"] = 1, ["ydd"] = 2, ["tgtOffset"] = {0, 0}, ["spd"] = 12.0}
}

return data