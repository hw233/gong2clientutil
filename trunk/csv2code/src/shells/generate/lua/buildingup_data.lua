--
-- 建筑升级表.csv
-- 建筑编号编号 = id
-- 建筑名 = name
-- 升级后建筑ID = upgradeId
-- 主城标识 = sign
-- 升级建筑需要繁荣度 = glory
-- 升级建筑需要官品 = officerProduct
-- 升级建筑所需材料 = needmater
-- 升级建筑所需数量 = neednum
-- 升级耗时 = time
-- 产出类型 = outputtype
-- 产出时间 = outputtime
-- 产出数量 = outputnum
-- 工作类型 = worktype
-- 开启阵位 = vowopenloc
-- 阵位人数 = locpeople
-- 许愿产出货币类型 = vowtype
-- 许愿产出货币数量 = vownum
-- 产出倍率 = vowmul
-- 倍率概率 = vowpor

local data = {
    [1000] = {["id"] = 1000, ["name"] = "主城", ["upgradeId"] = 1001, ["sign"] = 1, ["glory"] = 4000, ["officerProduct"] = 1, ["needmater"] = {10009}, ["neednum"] = {2000}, ["time"] = 300},
    [1001] = {["id"] = 1001, ["name"] = "主城", ["upgradeId"] = 1002, ["sign"] = 1, ["glory"] = 6000, ["officerProduct"] = 2, ["needmater"] = {10009}, ["neednum"] = {3600}, ["time"] = 600},
    [1002] = {["id"] = 1002, ["name"] = "主城", ["upgradeId"] = 1003, ["sign"] = 1, ["glory"] = 8000, ["officerProduct"] = 3, ["needmater"] = {10009}, ["neednum"] = {9000}, ["time"] = 900},
    [1003] = {["id"] = 1003, ["name"] = "主城", ["upgradeId"] = 1004, ["sign"] = 1, ["glory"] = 10000, ["officerProduct"] = 4, ["needmater"] = {10009}, ["neednum"] = {16800}, ["time"] = 1500},
    [1004] = {["id"] = 1004, ["name"] = "主城", ["upgradeId"] = 1005, ["sign"] = 1, ["glory"] = 12000, ["officerProduct"] = 5, ["needmater"] = {10009}, ["neednum"] = {33000}, ["time"] = 2000},
    [1005] = {["id"] = 1005, ["name"] = "主城", ["upgradeId"] = 1006, ["sign"] = 1, ["glory"] = 14000, ["officerProduct"] = 6, ["needmater"] = {10009}, ["neednum"] = {54000}, ["time"] = 2500},
    [1006] = {["id"] = 1006, ["name"] = "主城", ["upgradeId"] = 1007, ["sign"] = 1, ["glory"] = 16000, ["officerProduct"] = 7, ["needmater"] = {10009}, ["neednum"] = {79800}, ["time"] = 3000},
    [1007] = {["id"] = 1007, ["name"] = "主城", ["upgradeId"] = 1008, ["sign"] = 1, ["glory"] = 18000, ["officerProduct"] = 8, ["needmater"] = {10009}, ["neednum"] = {120000}, ["time"] = 4000},
    [1008] = {["id"] = 1008, ["name"] = "主城", ["upgradeId"] = 1009, ["sign"] = 1, ["glory"] = 20000, ["officerProduct"] = 9, ["needmater"] = {10009}, ["neednum"] = {167400}, ["time"] = 5000},
    [1009] = {["id"] = 1009, ["name"] = "主城", ["upgradeId"] = 1010, ["sign"] = 1, ["glory"] = 22000, ["officerProduct"] = 10, ["needmater"] = {10009}, ["neednum"] = {186000}, ["time"] = 6000},
    [1010] = {["id"] = 1010, ["name"] = "主城", ["upgradeId"] = 1011, ["sign"] = 1, ["glory"] = 24000, ["officerProduct"] = 11, ["needmater"] = {10009}, ["neednum"] = {204600}, ["time"] = 7000},
    [1011] = {["id"] = 1011, ["name"] = "主城", ["upgradeId"] = 1012, ["sign"] = 1, ["glory"] = 26000, ["officerProduct"] = 12, ["needmater"] = {10009}, ["neednum"] = {223200}, ["time"] = 8000},
    [1012] = {["id"] = 1012, ["name"] = "主城", ["upgradeId"] = 1013, ["sign"] = 1, ["glory"] = 28000, ["officerProduct"] = 13, ["needmater"] = {10009}, ["neednum"] = {241800}, ["time"] = 9000},
    [1013] = {["id"] = 1013, ["name"] = "主城", ["upgradeId"] = 1014, ["sign"] = 1, ["glory"] = 30000, ["officerProduct"] = 14, ["needmater"] = {10009}, ["neednum"] = {260400}, ["time"] = 10000},
    [1014] = {["id"] = 1014, ["name"] = "主城", ["upgradeId"] = 1015, ["sign"] = 1, ["glory"] = 32000, ["officerProduct"] = 15, ["needmater"] = {10009}, ["neednum"] = {279000}, ["time"] = 11000},
    [1015] = {["id"] = 1015, ["name"] = "主城", ["upgradeId"] = 1016, ["sign"] = 1, ["glory"] = 34000, ["officerProduct"] = 16, ["needmater"] = {10009}, ["neednum"] = {297600}, ["time"] = 12000},
    [1016] = {["id"] = 1016, ["name"] = "主城", ["upgradeId"] = 1017, ["sign"] = 1, ["glory"] = 36000, ["officerProduct"] = 17, ["needmater"] = {10009}, ["neednum"] = {316200}, ["time"] = 13000},
    [1017] = {["id"] = 1017, ["name"] = "主城", ["upgradeId"] = 1018, ["sign"] = 1, ["glory"] = 38000, ["officerProduct"] = 18, ["needmater"] = {10009}, ["neednum"] = {334800}, ["time"] = 14000},
    [1018] = {["id"] = 1018, ["name"] = "主城", ["upgradeId"] = 1019, ["sign"] = 1, ["glory"] = 40000, ["officerProduct"] = 19, ["needmater"] = {10009}, ["neednum"] = {353400}, ["time"] = 15000},
    [1019] = {["id"] = 1019, ["name"] = "主城", ["sign"] = 1, ["officerProduct"] = 20, ["needmater"] = {10009}, ["neednum"] = {372000}, ["time"] = 16000},
    [1100] = {["id"] = 1100, ["name"] = "鲜花地", ["upgradeId"] = 1101, ["sign"] = 2, ["glory"] = 4000, ["officerProduct"] = 1, ["needmater"] = {10009}, ["neednum"] = {2000}, ["time"] = 300},
    [1101] = {["id"] = 1101, ["name"] = "鲜花地", ["upgradeId"] = 1102, ["sign"] = 2, ["glory"] = 6000, ["officerProduct"] = 2, ["needmater"] = {10009}, ["neednum"] = {3600}, ["time"] = 600},
    [1102] = {["id"] = 1102, ["name"] = "鲜花地", ["upgradeId"] = 1103, ["sign"] = 2, ["glory"] = 8000, ["officerProduct"] = 3, ["needmater"] = {10009}, ["neednum"] = {9000}, ["time"] = 900},
    [1103] = {["id"] = 1103, ["name"] = "鲜花地", ["upgradeId"] = 1104, ["sign"] = 2, ["glory"] = 10000, ["officerProduct"] = 4, ["needmater"] = {10009}, ["neednum"] = {16800}, ["time"] = 1500},
    [1104] = {["id"] = 1104, ["name"] = "鲜花地", ["upgradeId"] = 1105, ["sign"] = 2, ["glory"] = 12000, ["officerProduct"] = 5, ["needmater"] = {10009}, ["neednum"] = {33000}, ["time"] = 2000},
    [1105] = {["id"] = 1105, ["name"] = "鲜花地", ["upgradeId"] = 1106, ["sign"] = 2, ["glory"] = 14000, ["officerProduct"] = 6, ["needmater"] = {10009}, ["neednum"] = {54000}, ["time"] = 2500},
    [1106] = {["id"] = 1106, ["name"] = "鲜花地", ["upgradeId"] = 1107, ["sign"] = 2, ["glory"] = 16000, ["officerProduct"] = 7, ["needmater"] = {10009}, ["neednum"] = {79800}, ["time"] = 3000},
    [1107] = {["id"] = 1107, ["name"] = "鲜花地", ["upgradeId"] = 1108, ["sign"] = 2, ["glory"] = 18000, ["officerProduct"] = 8, ["needmater"] = {10009}, ["neednum"] = {120000}, ["time"] = 4000},
    [1108] = {["id"] = 1108, ["name"] = "鲜花地", ["upgradeId"] = 1109, ["sign"] = 2, ["glory"] = 20000, ["officerProduct"] = 9, ["needmater"] = {10009}, ["neednum"] = {167400}, ["time"] = 5000},
    [1109] = {["id"] = 1109, ["name"] = "鲜花地", ["upgradeId"] = 1110, ["sign"] = 2, ["glory"] = 22000, ["officerProduct"] = 10, ["needmater"] = {10009}, ["neednum"] = {186000}, ["time"] = 6000},
    [1110] = {["id"] = 1110, ["name"] = "鲜花地", ["upgradeId"] = 1111, ["sign"] = 2, ["glory"] = 24000, ["officerProduct"] = 11, ["needmater"] = {10009}, ["neednum"] = {204600}, ["time"] = 7000},
    [1111] = {["id"] = 1111, ["name"] = "鲜花地", ["upgradeId"] = 1112, ["sign"] = 2, ["glory"] = 26000, ["officerProduct"] = 12, ["needmater"] = {10009}, ["neednum"] = {223200}, ["time"] = 8000},
    [1112] = {["id"] = 1112, ["name"] = "鲜花地", ["upgradeId"] = 1113, ["sign"] = 2, ["glory"] = 28000, ["officerProduct"] = 13, ["needmater"] = {10009}, ["neednum"] = {241800}, ["time"] = 9000},
    [1113] = {["id"] = 1113, ["name"] = "鲜花地", ["upgradeId"] = 1114, ["sign"] = 2, ["glory"] = 30000, ["officerProduct"] = 14, ["needmater"] = {10009}, ["neednum"] = {260400}, ["time"] = 10000},
    [1114] = {["id"] = 1114, ["name"] = "鲜花地", ["upgradeId"] = 1115, ["sign"] = 2, ["glory"] = 32000, ["officerProduct"] = 15, ["needmater"] = {10009}, ["neednum"] = {279000}, ["time"] = 11000},
    [1115] = {["id"] = 1115, ["name"] = "鲜花地", ["upgradeId"] = 1116, ["sign"] = 2, ["glory"] = 34000, ["officerProduct"] = 16, ["needmater"] = {10009}, ["neednum"] = {297600}, ["time"] = 12000},
    [1116] = {["id"] = 1116, ["name"] = "鲜花地", ["upgradeId"] = 1117, ["sign"] = 2, ["glory"] = 36000, ["officerProduct"] = 17, ["needmater"] = {10009}, ["neednum"] = {316200}, ["time"] = 13000},
    [1117] = {["id"] = 1117, ["name"] = "鲜花地", ["upgradeId"] = 1118, ["sign"] = 2, ["glory"] = 38000, ["officerProduct"] = 18, ["needmater"] = {10009}, ["neednum"] = {334800}, ["time"] = 14000},
    [1118] = {["id"] = 1118, ["name"] = "鲜花地", ["upgradeId"] = 1119, ["sign"] = 2, ["glory"] = 40000, ["officerProduct"] = 19, ["needmater"] = {10009}, ["neednum"] = {353400}, ["time"] = 15000},
    [1119] = {["id"] = 1119, ["name"] = "鲜花地", ["sign"] = 2, ["officerProduct"] = 20, ["needmater"] = {10009}, ["neednum"] = {372000}, ["time"] = 16000},
    [1200] = {["id"] = 1200, ["name"] = "许愿池", ["upgradeId"] = 1201, ["sign"] = 2, ["glory"] = 4000, ["officerProduct"] = 1, ["needmater"] = {10009}, ["neednum"] = {2000}, ["time"] = 300, ["outputtype"] = {10000}, ["outputtime"] = 1800, ["outputnum"] = {600}, ["worktype"] = 1, ["vowopenloc"] = 1, ["locpeople"] = 1, ["vowtype"] = {10000}, ["vownum"] = {1320}, ["vowmul"] = {{1, 3}, {4, 8}, {8, 10}}, ["vowpor"] = {0.5, 0.4, 0.1}},
    [1201] = {["id"] = 1201, ["name"] = "许愿池", ["upgradeId"] = 1202, ["sign"] = 2, ["glory"] = 6000, ["officerProduct"] = 2, ["needmater"] = {10009}, ["neednum"] = {3600}, ["time"] = 600, ["outputtype"] = {10000}, ["outputtime"] = 1800, ["outputnum"] = {660}, ["worktype"] = 1, ["vowopenloc"] = 1, ["locpeople"] = 2, ["vowtype"] = {10000}, ["vownum"] = {1360}, ["vowmul"] = {{1, 3}, {4, 8}, {8, 10}}, ["vowpor"] = {0.5, 0.4, 0.2}},
    [1202] = {["id"] = 1202, ["name"] = "许愿池", ["upgradeId"] = 1203, ["sign"] = 2, ["glory"] = 8000, ["officerProduct"] = 3, ["needmater"] = {10009}, ["neednum"] = {9000}, ["time"] = 900, ["outputtype"] = {10000}, ["outputtime"] = 1800, ["outputnum"] = {720}, ["worktype"] = 1, ["vowopenloc"] = 1, ["locpeople"] = 3, ["vowtype"] = {10000}, ["vownum"] = {1400}, ["vowmul"] = {{1, 3}, {4, 8}, {8, 10}}, ["vowpor"] = {0.5, 0.4, 0.3}},
    [1203] = {["id"] = 1203, ["name"] = "许愿池", ["upgradeId"] = 1204, ["sign"] = 2, ["glory"] = 10000, ["officerProduct"] = 4, ["needmater"] = {10009}, ["neednum"] = {16800}, ["time"] = 1500, ["outputtype"] = {10000}, ["outputtime"] = 1800, ["outputnum"] = {780}, ["worktype"] = 1, ["vowopenloc"] = 1, ["locpeople"] = 4, ["vowtype"] = {10000}, ["vownum"] = {1440}, ["vowmul"] = {{1, 3}, {4, 8}, {8, 10}}, ["vowpor"] = {0.5, 0.4, 0.4}},
    [1204] = {["id"] = 1204, ["name"] = "许愿池", ["upgradeId"] = 1205, ["sign"] = 2, ["glory"] = 12000, ["officerProduct"] = 5, ["needmater"] = {10009}, ["neednum"] = {33000}, ["time"] = 2000, ["outputtype"] = {10000}, ["outputtime"] = 1800, ["outputnum"] = {840}, ["worktype"] = 1, ["vowopenloc"] = 1, ["locpeople"] = 4, ["vowtype"] = {10000}, ["vownum"] = {1480}, ["vowmul"] = {{1, 3}, {4, 8}, {8, 10}}, ["vowpor"] = {0.5, 0.4, 0.5}},
    [1205] = {["id"] = 1205, ["name"] = "许愿池", ["upgradeId"] = 1206, ["sign"] = 2, ["glory"] = 14000, ["officerProduct"] = 6, ["needmater"] = {10009}, ["neednum"] = {54000}, ["time"] = 2500, ["outputtype"] = {10000}, ["outputtime"] = 1800, ["outputnum"] = {900}, ["worktype"] = 1, ["vowopenloc"] = 1, ["locpeople"] = 4, ["vowtype"] = {10000}, ["vownum"] = {1520}, ["vowmul"] = {{1, 3}, {4, 8}, {8, 10}}, ["vowpor"] = {0.5, 0.4, 0.5}},
    [1206] = {["id"] = 1206, ["name"] = "许愿池", ["upgradeId"] = 1207, ["sign"] = 2, ["glory"] = 16000, ["officerProduct"] = 7, ["needmater"] = {10009}, ["neednum"] = {79800}, ["time"] = 3000, ["outputtype"] = {10000}, ["outputtime"] = 1800, ["outputnum"] = {960}, ["worktype"] = 1, ["vowopenloc"] = 1, ["locpeople"] = 4, ["vowtype"] = {10000}, ["vownum"] = {1560}, ["vowmul"] = {{1, 3}, {4, 8}, {8, 10}}, ["vowpor"] = {0.5, 0.4, 0.5}},
    [1207] = {["id"] = 1207, ["name"] = "许愿池", ["upgradeId"] = 1208, ["sign"] = 2, ["glory"] = 18000, ["officerProduct"] = 8, ["needmater"] = {10009}, ["neednum"] = {120000}, ["time"] = 4000, ["outputtype"] = {10000}, ["outputtime"] = 1800, ["outputnum"] = {1020}, ["worktype"] = 1, ["vowopenloc"] = 1, ["locpeople"] = 4, ["vowtype"] = {10000}, ["vownum"] = {1600}, ["vowmul"] = {{1, 3}, {4, 8}, {8, 10}}, ["vowpor"] = {0.5, 0.4, 0.5}},
    [1208] = {["id"] = 1208, ["name"] = "许愿池", ["upgradeId"] = 1209, ["sign"] = 2, ["glory"] = 20000, ["officerProduct"] = 9, ["needmater"] = {10009}, ["neednum"] = {167400}, ["time"] = 5000, ["outputtype"] = {10000}, ["outputtime"] = 1800, ["outputnum"] = {1080}, ["worktype"] = 1, ["vowopenloc"] = 1, ["locpeople"] = 4, ["vowtype"] = {10000}, ["vownum"] = {1640}, ["vowmul"] = {{1, 3}, {4, 8}, {8, 10}}, ["vowpor"] = {0.5, 0.4, 0.5}},
    [1209] = {["id"] = 1209, ["name"] = "许愿池", ["upgradeId"] = 1210, ["sign"] = 2, ["glory"] = 22000, ["officerProduct"] = 10, ["needmater"] = {10009}, ["neednum"] = {186000}, ["time"] = 6000, ["outputtype"] = {10000}, ["outputtime"] = 1800, ["outputnum"] = {1140}, ["worktype"] = 1, ["vowopenloc"] = 1, ["locpeople"] = 4, ["vowtype"] = {10000}, ["vownum"] = {1680}, ["vowmul"] = {{1, 3}, {4, 8}, {8, 10}}, ["vowpor"] = {0.5, 0.4, 0.5}},
    [1210] = {["id"] = 1210, ["name"] = "许愿池", ["upgradeId"] = 1211, ["sign"] = 2, ["glory"] = 24000, ["officerProduct"] = 11, ["needmater"] = {10009}, ["neednum"] = {204600}, ["time"] = 7000, ["outputtype"] = {10000}, ["outputtime"] = 1800, ["outputnum"] = {1200}, ["worktype"] = 1, ["vowopenloc"] = 1, ["locpeople"] = 4, ["vowtype"] = {10000}, ["vownum"] = {1720}, ["vowmul"] = {{1, 3}, {4, 8}, {8, 10}}, ["vowpor"] = {0.5, 0.4, 0.5}},
    [1211] = {["id"] = 1211, ["name"] = "许愿池", ["upgradeId"] = 1212, ["sign"] = 2, ["glory"] = 26000, ["officerProduct"] = 12, ["needmater"] = {10009}, ["neednum"] = {223200}, ["time"] = 8000, ["outputtype"] = {10000}, ["outputtime"] = 1800, ["outputnum"] = {1260}, ["worktype"] = 1, ["vowopenloc"] = 1, ["locpeople"] = 4, ["vowtype"] = {10000}, ["vownum"] = {1760}, ["vowmul"] = {{1, 3}, {4, 8}, {8, 10}}, ["vowpor"] = {0.5, 0.4, 0.5}},
    [1212] = {["id"] = 1212, ["name"] = "许愿池", ["upgradeId"] = 1213, ["sign"] = 2, ["glory"] = 28000, ["officerProduct"] = 13, ["needmater"] = {10009}, ["neednum"] = {241800}, ["time"] = 9000, ["outputtype"] = {10000}, ["outputtime"] = 1800, ["outputnum"] = {1320}, ["worktype"] = 1, ["vowopenloc"] = 1, ["locpeople"] = 4, ["vowtype"] = {10000}, ["vownum"] = {1800}, ["vowmul"] = {{1, 3}, {4, 8}, {8, 10}}, ["vowpor"] = {0.5, 0.4, 0.5}},
    [1213] = {["id"] = 1213, ["name"] = "许愿池", ["upgradeId"] = 1214, ["sign"] = 2, ["glory"] = 30000, ["officerProduct"] = 14, ["needmater"] = {10009}, ["neednum"] = {260400}, ["time"] = 10000, ["outputtype"] = {10000}, ["outputtime"] = 1800, ["outputnum"] = {1380}, ["worktype"] = 1, ["vowopenloc"] = 1, ["locpeople"] = 4, ["vowtype"] = {10000}, ["vownum"] = {1840}, ["vowmul"] = {{1, 3}, {4, 8}, {8, 10}}, ["vowpor"] = {0.5, 0.4, 0.5}},
    [1214] = {["id"] = 1214, ["name"] = "许愿池", ["upgradeId"] = 1215, ["sign"] = 2, ["glory"] = 32000, ["officerProduct"] = 15, ["needmater"] = {10009}, ["neednum"] = {279000}, ["time"] = 11000, ["outputtype"] = {10000}, ["outputtime"] = 1800, ["outputnum"] = {1440}, ["worktype"] = 1, ["vowopenloc"] = 1, ["locpeople"] = 4, ["vowtype"] = {10000}, ["vownum"] = {1880}, ["vowmul"] = {{1, 3}, {4, 8}, {8, 10}}, ["vowpor"] = {0.5, 0.4, 0.5}},
    [1215] = {["id"] = 1215, ["name"] = "许愿池", ["upgradeId"] = 1216, ["sign"] = 2, ["glory"] = 34000, ["officerProduct"] = 16, ["needmater"] = {10009}, ["neednum"] = {297600}, ["time"] = 12000, ["outputtype"] = {10000}, ["outputtime"] = 1800, ["outputnum"] = {1500}, ["worktype"] = 1, ["vowopenloc"] = 1, ["locpeople"] = 4, ["vowtype"] = {10000}, ["vownum"] = {1920}, ["vowmul"] = {{1, 3}, {4, 8}, {8, 10}}, ["vowpor"] = {0.5, 0.4, 0.5}},
    [1216] = {["id"] = 1216, ["name"] = "许愿池", ["upgradeId"] = 1217, ["sign"] = 2, ["glory"] = 36000, ["officerProduct"] = 17, ["needmater"] = {10009}, ["neednum"] = {316200}, ["time"] = 13000, ["outputtype"] = {10000}, ["outputtime"] = 1800, ["outputnum"] = {1560}, ["worktype"] = 1, ["vowopenloc"] = 1, ["locpeople"] = 4, ["vowtype"] = {10000}, ["vownum"] = {1960}, ["vowmul"] = {{1, 3}, {4, 8}, {8, 10}}, ["vowpor"] = {0.5, 0.4, 0.5}},
    [1217] = {["id"] = 1217, ["name"] = "许愿池", ["upgradeId"] = 1218, ["sign"] = 2, ["glory"] = 38000, ["officerProduct"] = 18, ["needmater"] = {10009}, ["neednum"] = {334800}, ["time"] = 14000, ["outputtype"] = {10000}, ["outputtime"] = 1800, ["outputnum"] = {1620}, ["worktype"] = 1, ["vowopenloc"] = 1, ["locpeople"] = 4, ["vowtype"] = {10000}, ["vownum"] = {2000}, ["vowmul"] = {{1, 3}, {4, 8}, {8, 10}}, ["vowpor"] = {0.5, 0.4, 0.5}},
    [1218] = {["id"] = 1218, ["name"] = "许愿池", ["upgradeId"] = 1219, ["sign"] = 2, ["glory"] = 40000, ["officerProduct"] = 19, ["needmater"] = {10009}, ["neednum"] = {353400}, ["time"] = 15000, ["outputtype"] = {10000}, ["outputtime"] = 1800, ["outputnum"] = {1680}, ["worktype"] = 1, ["vowopenloc"] = 1, ["locpeople"] = 4, ["vowtype"] = {10000}, ["vownum"] = {2040}, ["vowmul"] = {{1, 3}, {4, 8}, {8, 10}}, ["vowpor"] = {0.5, 0.4, 0.5}},
    [1219] = {["id"] = 1219, ["name"] = "许愿池", ["sign"] = 2, ["officerProduct"] = 20, ["needmater"] = {10009}, ["neednum"] = {372000}, ["time"] = 16000, ["outputtype"] = {10000}, ["outputtime"] = 1800, ["outputnum"] = {1740}, ["worktype"] = 1, ["vowopenloc"] = 1, ["locpeople"] = 4, ["vowtype"] = {10000}, ["vownum"] = {2080}, ["vowmul"] = {{1, 3}, {4, 8}, {8, 10}}, ["vowpor"] = {0.5, 0.4, 0.5}},
    [1300] = {["id"] = 1300, ["name"] = "采石场", ["upgradeId"] = 1301, ["sign"] = 2, ["glory"] = 4000, ["officerProduct"] = 1, ["needmater"] = {10009}, ["neednum"] = {2000}, ["time"] = 300, ["outputtype"] = {10010}, ["outputtime"] = 600, ["outputnum"] = {10}, ["worktype"] = 2, ["vowopenloc"] = 1, ["locpeople"] = 3},
    [1301] = {["id"] = 1301, ["name"] = "采石场", ["upgradeId"] = 1302, ["sign"] = 2, ["glory"] = 6000, ["officerProduct"] = 2, ["needmater"] = {10009}, ["neednum"] = {3600}, ["time"] = 600, ["outputtype"] = {10010}, ["outputtime"] = 600, ["outputnum"] = {10}, ["worktype"] = 2, ["vowopenloc"] = 1, ["locpeople"] = 3},
    [1302] = {["id"] = 1302, ["name"] = "采石场", ["upgradeId"] = 1303, ["sign"] = 2, ["glory"] = 8000, ["officerProduct"] = 3, ["needmater"] = {10009}, ["neednum"] = {9000}, ["time"] = 900, ["outputtype"] = {10010}, ["outputtime"] = 600, ["outputnum"] = {10}, ["worktype"] = 2, ["vowopenloc"] = 1, ["locpeople"] = 3},
    [1303] = {["id"] = 1303, ["name"] = "采石场", ["upgradeId"] = 1304, ["sign"] = 2, ["glory"] = 10000, ["officerProduct"] = 4, ["needmater"] = {10009}, ["neednum"] = {16800}, ["time"] = 1500, ["outputtype"] = {10010}, ["outputtime"] = 600, ["outputnum"] = {10}, ["worktype"] = 2, ["vowopenloc"] = 1, ["locpeople"] = 3},
    [1304] = {["id"] = 1304, ["name"] = "采石场", ["upgradeId"] = 1305, ["sign"] = 2, ["glory"] = 12000, ["officerProduct"] = 5, ["needmater"] = {10009}, ["neednum"] = {33000}, ["time"] = 2000, ["outputtype"] = {10010}, ["outputtime"] = 600, ["outputnum"] = {10}, ["worktype"] = 2, ["vowopenloc"] = 1, ["locpeople"] = 3},
    [1305] = {["id"] = 1305, ["name"] = "采石场", ["upgradeId"] = 1306, ["sign"] = 2, ["glory"] = 14000, ["officerProduct"] = 6, ["needmater"] = {10009}, ["neednum"] = {54000}, ["time"] = 2500, ["outputtype"] = {10010}, ["outputtime"] = 600, ["outputnum"] = {10}, ["worktype"] = 2, ["vowopenloc"] = 1, ["locpeople"] = 3},
    [1306] = {["id"] = 1306, ["name"] = "采石场", ["upgradeId"] = 1307, ["sign"] = 2, ["glory"] = 16000, ["officerProduct"] = 7, ["needmater"] = {10009}, ["neednum"] = {79800}, ["time"] = 3000, ["outputtype"] = {10010}, ["outputtime"] = 600, ["outputnum"] = {10}, ["worktype"] = 2, ["vowopenloc"] = 1, ["locpeople"] = 3},
    [1307] = {["id"] = 1307, ["name"] = "采石场", ["upgradeId"] = 1308, ["sign"] = 2, ["glory"] = 18000, ["officerProduct"] = 8, ["needmater"] = {10009}, ["neednum"] = {120000}, ["time"] = 4000, ["outputtype"] = {10010}, ["outputtime"] = 600, ["outputnum"] = {10}, ["worktype"] = 2, ["vowopenloc"] = 2, ["locpeople"] = 3},
    [1308] = {["id"] = 1308, ["name"] = "采石场", ["upgradeId"] = 1309, ["sign"] = 2, ["glory"] = 20000, ["officerProduct"] = 9, ["needmater"] = {10009}, ["neednum"] = {167400}, ["time"] = 5000, ["outputtype"] = {10010}, ["outputtime"] = 600, ["outputnum"] = {10}, ["worktype"] = 2, ["vowopenloc"] = 2, ["locpeople"] = 3},
    [1309] = {["id"] = 1309, ["name"] = "采石场", ["upgradeId"] = 1310, ["sign"] = 2, ["glory"] = 22000, ["officerProduct"] = 10, ["needmater"] = {10009}, ["neednum"] = {186000}, ["time"] = 6000, ["outputtype"] = {10010}, ["outputtime"] = 600, ["outputnum"] = {10}, ["worktype"] = 2, ["vowopenloc"] = 2, ["locpeople"] = 3},
    [1310] = {["id"] = 1310, ["name"] = "采石场", ["upgradeId"] = 1311, ["sign"] = 2, ["glory"] = 24000, ["officerProduct"] = 11, ["needmater"] = {10009}, ["neednum"] = {204600}, ["time"] = 7000, ["outputtype"] = {10010}, ["outputtime"] = 600, ["outputnum"] = {10}, ["worktype"] = 2, ["vowopenloc"] = 2, ["locpeople"] = 3},
    [1311] = {["id"] = 1311, ["name"] = "采石场", ["upgradeId"] = 1312, ["sign"] = 2, ["glory"] = 26000, ["officerProduct"] = 12, ["needmater"] = {10009}, ["neednum"] = {223200}, ["time"] = 8000, ["outputtype"] = {10010}, ["outputtime"] = 600, ["outputnum"] = {10}, ["worktype"] = 2, ["vowopenloc"] = 2, ["locpeople"] = 3},
    [1312] = {["id"] = 1312, ["name"] = "采石场", ["upgradeId"] = 1313, ["sign"] = 2, ["glory"] = 28000, ["officerProduct"] = 13, ["needmater"] = {10009}, ["neednum"] = {241800}, ["time"] = 9000, ["outputtype"] = {10010}, ["outputtime"] = 600, ["outputnum"] = {10}, ["worktype"] = 2, ["vowopenloc"] = 2, ["locpeople"] = 3},
    [1313] = {["id"] = 1313, ["name"] = "采石场", ["upgradeId"] = 1314, ["sign"] = 2, ["glory"] = 30000, ["officerProduct"] = 14, ["needmater"] = {10009}, ["neednum"] = {260400}, ["time"] = 10000, ["outputtype"] = {10010}, ["outputtime"] = 600, ["outputnum"] = {10}, ["worktype"] = 2, ["vowopenloc"] = 2, ["locpeople"] = 3},
    [1314] = {["id"] = 1314, ["name"] = "采石场", ["upgradeId"] = 1315, ["sign"] = 2, ["glory"] = 32000, ["officerProduct"] = 15, ["needmater"] = {10009}, ["neednum"] = {279000}, ["time"] = 11000, ["outputtype"] = {10010}, ["outputtime"] = 600, ["outputnum"] = {10}, ["worktype"] = 2, ["vowopenloc"] = 2, ["locpeople"] = 3},
    [1315] = {["id"] = 1315, ["name"] = "采石场", ["upgradeId"] = 1316, ["sign"] = 2, ["glory"] = 34000, ["officerProduct"] = 16, ["needmater"] = {10009}, ["neednum"] = {297600}, ["time"] = 12000, ["outputtype"] = {10010}, ["outputtime"] = 600, ["outputnum"] = {10}, ["worktype"] = 2, ["vowopenloc"] = 3, ["locpeople"] = 3},
    [1316] = {["id"] = 1316, ["name"] = "采石场", ["upgradeId"] = 1317, ["sign"] = 2, ["glory"] = 36000, ["officerProduct"] = 17, ["needmater"] = {10009}, ["neednum"] = {316200}, ["time"] = 13000, ["outputtype"] = {10010}, ["outputtime"] = 600, ["outputnum"] = {10}, ["worktype"] = 2, ["vowopenloc"] = 3, ["locpeople"] = 3},
    [1317] = {["id"] = 1317, ["name"] = "采石场", ["upgradeId"] = 1318, ["sign"] = 2, ["glory"] = 38000, ["officerProduct"] = 18, ["needmater"] = {10009}, ["neednum"] = {334800}, ["time"] = 14000, ["outputtype"] = {10010}, ["outputtime"] = 600, ["outputnum"] = {10}, ["worktype"] = 2, ["vowopenloc"] = 2, ["locpeople"] = 3},
    [1318] = {["id"] = 1318, ["name"] = "采石场", ["upgradeId"] = 1319, ["sign"] = 2, ["glory"] = 40000, ["officerProduct"] = 19, ["needmater"] = {10009}, ["neednum"] = {353400}, ["time"] = 15000, ["outputtype"] = {10010}, ["outputtime"] = 600, ["outputnum"] = {10}, ["worktype"] = 2, ["vowopenloc"] = 3, ["locpeople"] = 3},
    [1319] = {["id"] = 1319, ["name"] = "采石场", ["sign"] = 2, ["officerProduct"] = 20, ["needmater"] = {10009}, ["neednum"] = {372000}, ["time"] = 16000, ["outputtype"] = {10010}, ["outputtime"] = 600, ["outputnum"] = {10}, ["worktype"] = 2, ["vowopenloc"] = 3, ["locpeople"] = 3},
    [1400] = {["id"] = 1400, ["name"] = "伐木场", ["upgradeId"] = 1401, ["sign"] = 2, ["glory"] = 4000, ["officerProduct"] = 1, ["needmater"] = {10009}, ["neednum"] = {2000}, ["time"] = 300, ["outputtype"] = {10009}, ["outputtime"] = 600, ["outputnum"] = {10}, ["worktype"] = 5, ["vowopenloc"] = 1, ["locpeople"] = 3},
    [1401] = {["id"] = 1401, ["name"] = "伐木场", ["upgradeId"] = 1402, ["sign"] = 2, ["glory"] = 6000, ["officerProduct"] = 2, ["needmater"] = {10009}, ["neednum"] = {3600}, ["time"] = 600, ["outputtype"] = {10009}, ["outputtime"] = 600, ["outputnum"] = {10}, ["worktype"] = 5, ["vowopenloc"] = 1, ["locpeople"] = 3},
    [1402] = {["id"] = 1402, ["name"] = "伐木场", ["upgradeId"] = 1403, ["sign"] = 2, ["glory"] = 8000, ["officerProduct"] = 3, ["needmater"] = {10009}, ["neednum"] = {9000}, ["time"] = 900, ["outputtype"] = {10009}, ["outputtime"] = 600, ["outputnum"] = {10}, ["worktype"] = 5, ["vowopenloc"] = 2, ["locpeople"] = 3},
    [1403] = {["id"] = 1403, ["name"] = "伐木场", ["upgradeId"] = 1404, ["sign"] = 2, ["glory"] = 10000, ["officerProduct"] = 4, ["needmater"] = {10009}, ["neednum"] = {16800}, ["time"] = 1500, ["outputtype"] = {10009}, ["outputtime"] = 600, ["outputnum"] = {10}, ["worktype"] = 5, ["vowopenloc"] = 3, ["locpeople"] = 3},
    [1404] = {["id"] = 1404, ["name"] = "伐木场", ["upgradeId"] = 1405, ["sign"] = 2, ["glory"] = 12000, ["officerProduct"] = 5, ["needmater"] = {10009}, ["neednum"] = {33000}, ["time"] = 2000, ["outputtype"] = {10009}, ["outputtime"] = 600, ["outputnum"] = {10}, ["worktype"] = 5, ["vowopenloc"] = 3, ["locpeople"] = 3},
    [1405] = {["id"] = 1405, ["name"] = "伐木场", ["upgradeId"] = 1406, ["sign"] = 2, ["glory"] = 14000, ["officerProduct"] = 6, ["needmater"] = {10009}, ["neednum"] = {54000}, ["time"] = 2500, ["outputtype"] = {10009}, ["outputtime"] = 600, ["outputnum"] = {10}, ["worktype"] = 5, ["vowopenloc"] = 1, ["locpeople"] = 3},
    [1406] = {["id"] = 1406, ["name"] = "伐木场", ["upgradeId"] = 1407, ["sign"] = 2, ["glory"] = 16000, ["officerProduct"] = 7, ["needmater"] = {10009}, ["neednum"] = {79800}, ["time"] = 3000, ["outputtype"] = {10009}, ["outputtime"] = 600, ["outputnum"] = {10}, ["worktype"] = 5, ["vowopenloc"] = 1, ["locpeople"] = 3},
    [1407] = {["id"] = 1407, ["name"] = "伐木场", ["upgradeId"] = 1408, ["sign"] = 2, ["glory"] = 18000, ["officerProduct"] = 8, ["needmater"] = {10009}, ["neednum"] = {120000}, ["time"] = 4000, ["outputtype"] = {10009}, ["outputtime"] = 600, ["outputnum"] = {10}, ["worktype"] = 5, ["vowopenloc"] = 2, ["locpeople"] = 3},
    [1408] = {["id"] = 1408, ["name"] = "伐木场", ["upgradeId"] = 1409, ["sign"] = 2, ["glory"] = 20000, ["officerProduct"] = 9, ["needmater"] = {10009}, ["neednum"] = {167400}, ["time"] = 5000, ["outputtype"] = {10009}, ["outputtime"] = 600, ["outputnum"] = {10}, ["worktype"] = 5, ["vowopenloc"] = 3, ["locpeople"] = 3},
    [1409] = {["id"] = 1409, ["name"] = "伐木场", ["upgradeId"] = 1410, ["sign"] = 2, ["glory"] = 22000, ["officerProduct"] = 10, ["needmater"] = {10009}, ["neednum"] = {186000}, ["time"] = 6000, ["outputtype"] = {10009}, ["outputtime"] = 600, ["outputnum"] = {10}, ["worktype"] = 5, ["vowopenloc"] = 3, ["locpeople"] = 3},
    [1410] = {["id"] = 1410, ["name"] = "伐木场", ["upgradeId"] = 1411, ["sign"] = 2, ["glory"] = 24000, ["officerProduct"] = 11, ["needmater"] = {10009}, ["neednum"] = {204600}, ["time"] = 7000, ["outputtype"] = {10009}, ["outputtime"] = 600, ["outputnum"] = {10}, ["worktype"] = 5, ["vowopenloc"] = 1, ["locpeople"] = 3},
    [1411] = {["id"] = 1411, ["name"] = "伐木场", ["upgradeId"] = 1412, ["sign"] = 2, ["glory"] = 26000, ["officerProduct"] = 12, ["needmater"] = {10009}, ["neednum"] = {223200}, ["time"] = 8000, ["outputtype"] = {10009}, ["outputtime"] = 600, ["outputnum"] = {10}, ["worktype"] = 5, ["vowopenloc"] = 1, ["locpeople"] = 3},
    [1412] = {["id"] = 1412, ["name"] = "伐木场", ["upgradeId"] = 1413, ["sign"] = 2, ["glory"] = 28000, ["officerProduct"] = 13, ["needmater"] = {10009}, ["neednum"] = {241800}, ["time"] = 9000, ["outputtype"] = {10009}, ["outputtime"] = 600, ["outputnum"] = {10}, ["worktype"] = 5, ["vowopenloc"] = 2, ["locpeople"] = 3},
    [1413] = {["id"] = 1413, ["name"] = "伐木场", ["upgradeId"] = 1414, ["sign"] = 2, ["glory"] = 30000, ["officerProduct"] = 14, ["needmater"] = {10009}, ["neednum"] = {260400}, ["time"] = 10000, ["outputtype"] = {10009}, ["outputtime"] = 600, ["outputnum"] = {10}, ["worktype"] = 5, ["vowopenloc"] = 3, ["locpeople"] = 3},
    [1414] = {["id"] = 1414, ["name"] = "伐木场", ["upgradeId"] = 1415, ["sign"] = 2, ["glory"] = 32000, ["officerProduct"] = 15, ["needmater"] = {10009}, ["neednum"] = {279000}, ["time"] = 11000, ["outputtype"] = {10009}, ["outputtime"] = 600, ["outputnum"] = {10}, ["worktype"] = 5, ["vowopenloc"] = 3, ["locpeople"] = 3},
    [1415] = {["id"] = 1415, ["name"] = "伐木场", ["upgradeId"] = 1416, ["sign"] = 2, ["glory"] = 34000, ["officerProduct"] = 16, ["needmater"] = {10009}, ["neednum"] = {297600}, ["time"] = 12000, ["outputtype"] = {10009}, ["outputtime"] = 600, ["outputnum"] = {10}, ["worktype"] = 5, ["vowopenloc"] = 1, ["locpeople"] = 3},
    [1416] = {["id"] = 1416, ["name"] = "伐木场", ["upgradeId"] = 1417, ["sign"] = 2, ["glory"] = 36000, ["officerProduct"] = 17, ["needmater"] = {10009}, ["neednum"] = {316200}, ["time"] = 13000, ["outputtype"] = {10009}, ["outputtime"] = 600, ["outputnum"] = {10}, ["worktype"] = 5, ["vowopenloc"] = 1, ["locpeople"] = 3},
    [1417] = {["id"] = 1417, ["name"] = "伐木场", ["upgradeId"] = 1418, ["sign"] = 2, ["glory"] = 38000, ["officerProduct"] = 18, ["needmater"] = {10009}, ["neednum"] = {334800}, ["time"] = 14000, ["outputtype"] = {10009}, ["outputtime"] = 600, ["outputnum"] = {10}, ["worktype"] = 5, ["vowopenloc"] = 2, ["locpeople"] = 3},
    [1418] = {["id"] = 1418, ["name"] = "伐木场", ["upgradeId"] = 1419, ["sign"] = 2, ["glory"] = 40000, ["officerProduct"] = 19, ["needmater"] = {10009}, ["neednum"] = {353400}, ["time"] = 15000, ["outputtype"] = {10009}, ["outputtime"] = 600, ["outputnum"] = {10}, ["worktype"] = 5, ["vowopenloc"] = 3, ["locpeople"] = 3},
    [1419] = {["id"] = 1419, ["name"] = "伐木场", ["sign"] = 2, ["officerProduct"] = 20, ["needmater"] = {10009}, ["neednum"] = {372000}, ["time"] = 16000, ["outputtype"] = {10009}, ["outputtime"] = 600, ["outputnum"] = {10}, ["worktype"] = 5, ["vowopenloc"] = 3, ["locpeople"] = 3}
}

return data