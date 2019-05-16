--
-- 战斗信息表.csv
-- 信息条编号 = id
-- 信息条类型 = kind
-- 初始位置方式 = iniType
-- 初始位置偏移量 = iniOffset
-- 初始透明倍率 = initOpacity
-- 初始缩放倍数 = iniZoom
-- 初始震屏编号 = initZpid
-- 一阶段持续时间 = fstLastTime
-- 一阶段偏移量 = fstOffset
-- 一阶段缩放倍率 = fstZoom
-- 一阶段透明倍率 = fstOpacity
-- 一阶段缓动函数 = fstEase
-- 一阶段图片是否复制 = fstPictureCopy
-- 文字出现音效 = wordSound
-- 文字音效延迟 = sndDelay
-- 一阶段震屏编号 = fstZpid
-- 一阶段延迟 = fstDisplayLast
-- 二阶段持续时间 = scdLastTime
-- 二阶段偏移量 = scdOffset
-- 二阶段缩放倍率 = scdZoom
-- 二阶段透明倍率 = scdOpacity
-- 二阶段缓动函数 = scdEase
-- 二阶段震屏编号 = scdZpid
-- 二阶段延迟 = scdDisplayLast

local data = {
    [10000] = {["id"] = 10000, ["kind"] = 1, ["iniType"] = 1, ["iniOffset"] = {0, 230}, ["initOpacity"] = 1.0, ["iniZoom"] = 0.5, ["fstLastTime"] = 0.2, ["fstOffset"] = {50, 30}, ["fstZoom"] = 1.0, ["fstOpacity"] = 1.0, ["fstPictureCopy"] = false, ["scdLastTime"] = 0.4, ["scdOffset"] = {0, 0}, ["scdZoom"] = 1.0, ["scdOpacity"] = 0.0, ["scdDisplayLast"] = 0.0},
    [10001] = {["id"] = 10001, ["kind"] = 1, ["iniType"] = 1, ["iniOffset"] = {0, 230}, ["initOpacity"] = 0.5, ["iniZoom"] = 0.5, ["fstLastTime"] = 0.2, ["fstOffset"] = {100, 30}, ["fstZoom"] = 1.5, ["fstOpacity"] = 1.0, ["fstPictureCopy"] = false, ["scdLastTime"] = 0.24, ["scdOffset"] = {0, 0}, ["scdZoom"] = 1.5, ["scdOpacity"] = 0.0, ["scdDisplayLast"] = 0.0},
    [10002] = {["id"] = 10002, ["kind"] = 1, ["iniType"] = 1, ["iniOffset"] = {0, 150}, ["initOpacity"] = 1.0, ["iniZoom"] = 0.75, ["fstLastTime"] = 0.1, ["fstOffset"] = {45, 0}, ["fstZoom"] = 1.1, ["fstOpacity"] = 1.0, ["fstPictureCopy"] = false, ["fstDisplayLast"] = 0.8, ["scdLastTime"] = 0.3, ["scdOffset"] = {-10, 0}, ["scdZoom"] = 1.1, ["scdOpacity"] = 0.0, ["scdDisplayLast"] = 0.0},
    [10003] = {["id"] = 10003, ["kind"] = 1, ["iniType"] = 1, ["iniOffset"] = {0, 150}, ["initOpacity"] = 1.0, ["iniZoom"] = 1.0, ["fstLastTime"] = 0.01, ["fstOffset"] = {10, 10}, ["fstZoom"] = 1.0, ["fstOpacity"] = 1.0, ["fstPictureCopy"] = false, ["fstDisplayLast"] = 0.65, ["scdLastTime"] = 0.4, ["scdOffset"] = {-25, 0}, ["scdZoom"] = 1.0, ["scdOpacity"] = 0.0, ["scdDisplayLast"] = 0.0},
    [10004] = {["id"] = 10004, ["kind"] = 1, ["iniType"] = 1, ["iniOffset"] = {0, 150}, ["initOpacity"] = 1.0, ["iniZoom"] = 0.5, ["fstLastTime"] = 0.3, ["fstOffset"] = {-50, 10}, ["fstZoom"] = 1.0, ["fstOpacity"] = 1.0, ["fstPictureCopy"] = false, ["fstDisplayLast"] = 0.1, ["scdLastTime"] = 0.2, ["scdOffset"] = {50, -10}, ["scdZoom"] = 1.0, ["scdOpacity"] = 1.0, ["scdDisplayLast"] = 0.3},
    [10005] = {["id"] = 10005, ["kind"] = 1, ["iniType"] = 1, ["iniOffset"] = {0, 150}, ["initOpacity"] = 1.0, ["iniZoom"] = 1.0, ["fstLastTime"] = 0.05, ["fstOffset"] = {-30, 10}, ["fstZoom"] = 1.0, ["fstOpacity"] = 1.0, ["fstPictureCopy"] = false, ["fstDisplayLast"] = 0.85, ["scdLastTime"] = 0.0, ["scdOpacity"] = 0.0, ["scdDisplayLast"] = 0.0},
    [10006] = {["id"] = 10006, ["kind"] = 1, ["iniType"] = 1, ["iniOffset"] = {0, 250}, ["initOpacity"] = 0.5, ["iniZoom"] = 0.75, ["fstLastTime"] = 0.1, ["fstOffset"] = {0, 0}, ["fstZoom"] = 1.0, ["fstOpacity"] = 0.75, ["fstPictureCopy"] = false, ["scdLastTime"] = 0.3, ["scdOffset"] = {0, 0}, ["scdZoom"] = 1.25, ["scdOpacity"] = 1.0, ["scdDisplayLast"] = 0.0},
    [10007] = {["id"] = 10007, ["kind"] = 3, ["iniType"] = 2, ["iniOffset"] = {0, 0}, ["initOpacity"] = 1.0, ["iniZoom"] = 1.75, ["initZpid"] = 10001, ["fstLastTime"] = 1.3, ["fstOffset"] = {0, 0}, ["fstZoom"] = 1.75, ["fstOpacity"] = 1.0, ["fstPictureCopy"] = false, ["fstDisplayLast"] = 0.0, ["scdOpacity"] = 1.0, ["scdDisplayLast"] = 1.0},
    [10008] = {["id"] = 10008, ["kind"] = 1, ["iniType"] = 1, ["iniOffset"] = {0, 175}, ["initOpacity"] = 1.0, ["iniZoom"] = 1.4},
    [10009] = {["id"] = 10009, ["kind"] = 3, ["iniType"] = 2, ["iniOffset"] = {480, 280}, ["initOpacity"] = 1.0, ["iniZoom"] = 1.0, ["initZpid"] = 10001, ["fstLastTime"] = 1.3, ["fstOffset"] = {0, 0}, ["fstZoom"] = 1.0, ["fstOpacity"] = 1.0, ["fstPictureCopy"] = false, ["fstDisplayLast"] = 0.0, ["scdOpacity"] = 1.0, ["scdDisplayLast"] = 1.0},
    [10011] = {["id"] = 10011, ["kind"] = 1, ["iniType"] = 1, ["iniOffset"] = {0, 120}, ["initOpacity"] = 0.5, ["iniZoom"] = 1.0, ["initZpid"] = 10009, ["fstLastTime"] = 0.8, ["fstOffset"] = {0, 55}, ["fstZoom"] = 1.0, ["fstOpacity"] = 0.0, ["fstPictureCopy"] = false, ["fstDisplayLast"] = 0.0, ["scdDisplayLast"] = 0.0},
    [10012] = {["id"] = 10012, ["kind"] = 1, ["iniType"] = 1, ["iniOffset"] = {0, 120}, ["initOpacity"] = 1.0, ["iniZoom"] = 1.0, ["initZpid"] = 10009, ["fstLastTime"] = 0.8, ["fstOffset"] = {0, 55}, ["fstZoom"] = 1.0, ["fstOpacity"] = 0.0, ["fstPictureCopy"] = false, ["fstDisplayLast"] = 0.0, ["scdDisplayLast"] = 0.0},
    [10013] = {["id"] = 10013, ["kind"] = 1, ["iniType"] = 1, ["iniOffset"] = {0, 120}, ["initOpacity"] = 1.0, ["iniZoom"] = 0.75, ["initZpid"] = 10009, ["fstLastTime"] = 0.8, ["fstOffset"] = {0, 55}, ["fstZoom"] = 0.75, ["fstOpacity"] = 0.0, ["fstPictureCopy"] = false, ["fstDisplayLast"] = 0.0, ["scdDisplayLast"] = 0.0},
    [20000] = {["id"] = 20000, ["kind"] = 1, ["iniType"] = 1, ["iniOffset"] = {0, 230}, ["initOpacity"] = 1.0, ["iniZoom"] = 1.0, ["fstLastTime"] = 0.4, ["fstOffset"] = {0, 0}, ["fstZoom"] = 1.0, ["fstOpacity"] = 1.0, ["fstPictureCopy"] = false, ["scdLastTime"] = 0.2, ["scdOffset"] = {0, 0}, ["scdZoom"] = 1.0, ["scdOpacity"] = 0.0, ["scdDisplayLast"] = 0.0},
    [20001] = {["id"] = 20001, ["kind"] = 1, ["iniType"] = 1, ["iniOffset"] = {0, 0}, ["initOpacity"] = 1.0, ["iniZoom"] = 1.0, ["fstLastTime"] = 0.4, ["fstOffset"] = {0, 230}, ["fstZoom"] = 1.0, ["fstOpacity"] = 1.0, ["fstPictureCopy"] = false, ["scdLastTime"] = 0.2, ["scdOffset"] = {0, 0}, ["scdZoom"] = 1.0, ["scdOpacity"] = 0.0, ["scdDisplayLast"] = 0.0}
}

return data