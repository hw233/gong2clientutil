--
-- 跳转定义表.csv
-- ID = id
-- 类型 = type
-- 参数 = parameter
-- 描述 = name
-- 显示文字 = des

local data = {
    [1000] = {["id"] = 1000, ["type"] = 1, ["name"] = "阵容", ["des"] = "阵容"},
    [1001] = {["id"] = 1001, ["type"] = 2, ["name"] = "时装", ["des"] = "时装"},
    [1002] = {["id"] = 1002, ["type"] = 3, ["name"] = "阵法", ["des"] = "阵法"},
    [1003] = {["id"] = 1003, ["type"] = 4, ["name"] = "客卿背包", ["des"] = "客卿背包"},
    [1004] = {["id"] = 1004, ["type"] = 5, ["name"] = "活动", ["des"] = "活动"},
    [1005] = {["id"] = 1005, ["type"] = 6, ["name"] = "官场", ["des"] = "官场"},
    [1006] = {["id"] = 1006, ["type"] = 7, ["name"] = "官品", ["des"] = "官品"},
    [1007] = {["id"] = 1007, ["type"] = 8, ["name"] = "好友", ["des"] = "好友"},
    [1008] = {["id"] = 1008, ["type"] = 9, ["name"] = "送花", ["des"] = "送花"},
    [1009] = {["id"] = 1009, ["type"] = 10, ["name"] = "许愿池", ["des"] = "许愿池"},
    [1010] = {["id"] = 1010, ["type"] = 11, ["name"] = "家园", ["des"] = "家园"},
    [1011] = {["id"] = 1011, ["type"] = 12, ["name"] = "分享", ["des"] = "分享"},
    [1012] = {["id"] = 1012, ["type"] = 13, ["name"] = "充值", ["des"] = "充值"},
    [1013] = {["id"] = 1013, ["type"] = 14, ["name"] = "招募", ["des"] = "招募"},
    [1014] = {["id"] = 1014, ["type"] = 15, ["name"] = "图鉴", ["des"] = "图鉴"},
    [1015] = {["id"] = 1015, ["type"] = 16, ["name"] = "任务界面", ["des"] = "任务界面"},
    [1016] = {["id"] = 1016, ["type"] = 17, ["name"] = "旋转主界面", ["des"] = "旋转主界面"},
    [1017] = {["id"] = 1017, ["type"] = 19, ["name"] = "世界首领", ["des"] = "世界首领"},
    [1018] = {["id"] = 1018, ["type"] = 20, ["name"] = "派系", ["des"] = "派系"},
    [1019] = {["id"] = 1019, ["type"] = 21, ["name"] = "吴王地宫", ["des"] = "吴王地宫"},
    [1020] = {["id"] = 1020, ["type"] = 22, ["name"] = "面圣", ["des"] = "面圣"},
    [1021] = {["id"] = 1021, ["type"] = 23, ["name"] = "武将传记本", ["des"] = "传记"},
    [1022] = {["id"] = 1022, ["type"] = 24, ["name"] = "贵族特权", ["des"] = "贵族特权"},
    [1023] = {["id"] = 1023, ["type"] = 25, ["name"] = "悬赏", ["des"] = "悬赏任务界面"},
    [1024] = {["id"] = 1024, ["type"] = 26, ["name"] = "购买体力", ["des"] = "购买体力"},
    [1025] = {["id"] = 1025, ["type"] = 27, ["name"] = "伐木场", ["des"] = "伐木场"},
    [1026] = {["id"] = 1026, ["type"] = 28, ["name"] = "采矿场", ["des"] = "采矿场"},
    [1100] = {["id"] = 1100, ["type"] = 18, ["parameter"] = {1}, ["name"] = "南府老宅", ["des"] = "剧情地图"},
    [1101] = {["id"] = 1101, ["type"] = 18, ["parameter"] = {2}, ["name"] = "枫山行宫", ["des"] = "剧情地图"},
    [1102] = {["id"] = 1102, ["type"] = 18, ["parameter"] = {3}, ["name"] = "来去寺", ["des"] = "剧情地图"},
    [1103] = {["id"] = 1103, ["type"] = 18, ["parameter"] = {4}, ["name"] = "长风别院", ["des"] = "剧情地图"},
    [1104] = {["id"] = 1104, ["type"] = 18, ["parameter"] = {5}, ["name"] = "集贤馆", ["des"] = "剧情地图"},
    [1105] = {["id"] = 1105, ["type"] = 18, ["parameter"] = {6}, ["name"] = "临江楼", ["des"] = "剧情地图"},
    [1106] = {["id"] = 1106, ["type"] = 18, ["parameter"] = {7}, ["name"] = "虎丘塔", ["des"] = "剧情地图"},
    [1107] = {["id"] = 1107, ["type"] = 18, ["parameter"] = {8}, ["name"] = "姑苏城", ["des"] = "剧情地图"},
    [1108] = {["id"] = 1108, ["type"] = 18, ["parameter"] = {9}, ["name"] = "寒山寺", ["des"] = "剧情地图"},
    [1109] = {["id"] = 1109, ["type"] = 18, ["parameter"] = {10}, ["name"] = "御花园", ["des"] = "剧情地图"},
    [1110] = {["id"] = 1110, ["type"] = 18, ["parameter"] = {11}, ["name"] = "紫宸殿", ["des"] = "剧情地图"},
    [1111] = {["id"] = 1111, ["type"] = 18, ["parameter"] = {12}, ["name"] = "含元殿", ["des"] = "剧情地图"},
    [1112] = {["id"] = 1112, ["type"] = 18, ["parameter"] = {13}, ["name"] = "扶桑海境", ["des"] = "剧情地图"},
    [1113] = {["id"] = 1113, ["type"] = 18, ["parameter"] = {14}, ["name"] = "江户城", ["des"] = "剧情地图"},
    [1114] = {["id"] = 1114, ["type"] = 18, ["parameter"] = {15}, ["name"] = "阴阳寮", ["des"] = "剧情地图"},
    [1115] = {["id"] = 1115, ["type"] = 20, ["parameter"] = {1}, ["name"] = "捐献", ["des"] = "捐献"},
    [1116] = {["id"] = 1116, ["type"] = 20, ["parameter"] = {2}, ["name"] = "派系斗争", ["des"] = "派系斗争"},
    [1117] = {["id"] = 1117, ["type"] = 20, ["parameter"] = {3}, ["name"] = "权贵", ["des"] = "权贵"},
    [1118] = {["id"] = 1118, ["type"] = 20, ["parameter"] = {4}, ["name"] = "派系商店", ["des"] = "派系商店"},
    [1300] = {["id"] = 1300, ["type"] = 30, ["name"] = "直接链接商店", ["des"] = "直接链接商店"},
    [1301] = {["id"] = 1301, ["type"] = 30, ["parameter"] = {1}, ["name"] = "商店", ["des"] = "商店"},
    [1302] = {["id"] = 1302, ["type"] = 30, ["parameter"] = {2}, ["name"] = "商店", ["des"] = "商店"},
    [1303] = {["id"] = 1303, ["type"] = 30, ["parameter"] = {3}, ["name"] = "商店", ["des"] = "商店"},
    [1304] = {["id"] = 1304, ["type"] = 33, ["name"] = "时装商城", ["des"] = "时装商城"},
    [1305] = {["id"] = 1305, ["type"] = 34, ["parameter"] = {1}, ["name"] = "擂台", ["des"] = "擂台"},
    [2000] = {["id"] = 2000, ["type"] = 31, ["name"] = "简单副本", ["des"] = "简单副本"},
    [2001] = {["id"] = 2001, ["type"] = 31, ["parameter"] = {10000, 10000}, ["name"] = "副本", ["des"] = "简单副本 1-1"},
    [2002] = {["id"] = 2002, ["type"] = 31, ["parameter"] = {10000, 10001}, ["name"] = "副本", ["des"] = "简单副本 1-2"},
    [2003] = {["id"] = 2003, ["type"] = 31, ["parameter"] = {10000, 10002}, ["name"] = "副本", ["des"] = "简单副本 1-3"},
    [2004] = {["id"] = 2004, ["type"] = 31, ["parameter"] = {10000, 10003}, ["name"] = "副本", ["des"] = "简单副本 1-4"},
    [2005] = {["id"] = 2005, ["type"] = 31, ["parameter"] = {10000, 10004}, ["name"] = "副本", ["des"] = "简单副本 1-5"},
    [2006] = {["id"] = 2006, ["type"] = 31, ["parameter"] = {10000, 10005}, ["name"] = "副本", ["des"] = "简单副本 1-6"},
    [2007] = {["id"] = 2007, ["type"] = 31, ["parameter"] = {10000, 10006}, ["name"] = "副本", ["des"] = "简单副本 1-7"},
    [2008] = {["id"] = 2008, ["type"] = 31, ["parameter"] = {10000, 10007}, ["name"] = "副本", ["des"] = "简单副本 1-8"},
    [2009] = {["id"] = 2009, ["type"] = 31, ["parameter"] = {10000, 10008}, ["name"] = "副本", ["des"] = "简单副本 1-9"},
    [2010] = {["id"] = 2010, ["type"] = 31, ["parameter"] = {10000, 10009}, ["name"] = "副本", ["des"] = "简单副本 1-10"},
    [2011] = {["id"] = 2011, ["type"] = 31, ["parameter"] = {10001, 10010}, ["name"] = "副本", ["des"] = "简单副本 2-1"},
    [2012] = {["id"] = 2012, ["type"] = 31, ["parameter"] = {10001, 10011}, ["name"] = "副本", ["des"] = "简单副本 2-2"},
    [2013] = {["id"] = 2013, ["type"] = 31, ["parameter"] = {10001, 10012}, ["name"] = "副本", ["des"] = "简单副本 2-3"},
    [2014] = {["id"] = 2014, ["type"] = 31, ["parameter"] = {10001, 10013}, ["name"] = "副本", ["des"] = "简单副本 2-4"},
    [2015] = {["id"] = 2015, ["type"] = 31, ["parameter"] = {10001, 10014}, ["name"] = "副本", ["des"] = "简单副本 2-5"},
    [2016] = {["id"] = 2016, ["type"] = 31, ["parameter"] = {10001, 10015}, ["name"] = "副本", ["des"] = "简单副本 2-6"},
    [2017] = {["id"] = 2017, ["type"] = 31, ["parameter"] = {10001, 10016}, ["name"] = "副本", ["des"] = "简单副本 2-7"},
    [2018] = {["id"] = 2018, ["type"] = 31, ["parameter"] = {10001, 10017}, ["name"] = "副本", ["des"] = "简单副本 2-8"},
    [2019] = {["id"] = 2019, ["type"] = 31, ["parameter"] = {10001, 10018}, ["name"] = "副本", ["des"] = "简单副本 2-9"},
    [2020] = {["id"] = 2020, ["type"] = 31, ["parameter"] = {10001, 10019}, ["name"] = "副本", ["des"] = "简单副本 2-10"},
    [2021] = {["id"] = 2021, ["type"] = 31, ["parameter"] = {10002, 10020}, ["name"] = "副本", ["des"] = "简单副本 3-1"},
    [2022] = {["id"] = 2022, ["type"] = 31, ["parameter"] = {10002, 10021}, ["name"] = "副本", ["des"] = "简单副本 3-2"},
    [2023] = {["id"] = 2023, ["type"] = 31, ["parameter"] = {10002, 10022}, ["name"] = "副本", ["des"] = "简单副本 3-3"},
    [2024] = {["id"] = 2024, ["type"] = 31, ["parameter"] = {10002, 10023}, ["name"] = "副本", ["des"] = "简单副本 3-4"},
    [2025] = {["id"] = 2025, ["type"] = 31, ["parameter"] = {10002, 10024}, ["name"] = "副本", ["des"] = "简单副本 3-5"},
    [2026] = {["id"] = 2026, ["type"] = 31, ["parameter"] = {10002, 10025}, ["name"] = "副本", ["des"] = "简单副本 3-6"},
    [2027] = {["id"] = 2027, ["type"] = 31, ["parameter"] = {10002, 10026}, ["name"] = "副本", ["des"] = "简单副本 3-7"},
    [2028] = {["id"] = 2028, ["type"] = 31, ["parameter"] = {10002, 10027}, ["name"] = "副本", ["des"] = "简单副本 3-8"},
    [2029] = {["id"] = 2029, ["type"] = 31, ["parameter"] = {10002, 10028}, ["name"] = "副本", ["des"] = "简单副本 3-9"},
    [2030] = {["id"] = 2030, ["type"] = 31, ["parameter"] = {10002, 10029}, ["name"] = "副本", ["des"] = "简单副本 3-10"},
    [2031] = {["id"] = 2031, ["type"] = 31, ["parameter"] = {10003, 10030}, ["name"] = "副本", ["des"] = "简单副本 4-1"},
    [2032] = {["id"] = 2032, ["type"] = 31, ["parameter"] = {10003, 10031}, ["name"] = "副本", ["des"] = "简单副本 4-2"},
    [2033] = {["id"] = 2033, ["type"] = 31, ["parameter"] = {10003, 10032}, ["name"] = "副本", ["des"] = "简单副本 4-3"},
    [2034] = {["id"] = 2034, ["type"] = 31, ["parameter"] = {10003, 10033}, ["name"] = "副本", ["des"] = "简单副本 4-4"},
    [2035] = {["id"] = 2035, ["type"] = 31, ["parameter"] = {10003, 10034}, ["name"] = "副本", ["des"] = "简单副本 4-5"},
    [2036] = {["id"] = 2036, ["type"] = 31, ["parameter"] = {10003, 10035}, ["name"] = "副本", ["des"] = "简单副本 4-6"},
    [2037] = {["id"] = 2037, ["type"] = 31, ["parameter"] = {10003, 10036}, ["name"] = "副本", ["des"] = "简单副本 4-7"},
    [2038] = {["id"] = 2038, ["type"] = 31, ["parameter"] = {10003, 10037}, ["name"] = "副本", ["des"] = "简单副本 4-8"},
    [2039] = {["id"] = 2039, ["type"] = 31, ["parameter"] = {10003, 10038}, ["name"] = "副本", ["des"] = "简单副本 4-9"},
    [2040] = {["id"] = 2040, ["type"] = 31, ["parameter"] = {10003, 10039}, ["name"] = "副本", ["des"] = "简单副本 4-10"},
    [2041] = {["id"] = 2041, ["type"] = 31, ["parameter"] = {10004, 10040}, ["name"] = "副本", ["des"] = "简单副本 5-1"},
    [2042] = {["id"] = 2042, ["type"] = 31, ["parameter"] = {10004, 10041}, ["name"] = "副本", ["des"] = "简单副本 5-2"},
    [2043] = {["id"] = 2043, ["type"] = 31, ["parameter"] = {10004, 10042}, ["name"] = "副本", ["des"] = "简单副本 5-3"},
    [2044] = {["id"] = 2044, ["type"] = 31, ["parameter"] = {10004, 10043}, ["name"] = "副本", ["des"] = "简单副本 5-4"},
    [2045] = {["id"] = 2045, ["type"] = 31, ["parameter"] = {10004, 10044}, ["name"] = "副本", ["des"] = "简单副本 5-5"},
    [2046] = {["id"] = 2046, ["type"] = 31, ["parameter"] = {10004, 10045}, ["name"] = "副本", ["des"] = "简单副本 5-6"},
    [2047] = {["id"] = 2047, ["type"] = 31, ["parameter"] = {10004, 10046}, ["name"] = "副本", ["des"] = "简单副本 5-7"},
    [2048] = {["id"] = 2048, ["type"] = 31, ["parameter"] = {10004, 10047}, ["name"] = "副本", ["des"] = "简单副本 5-8"},
    [2049] = {["id"] = 2049, ["type"] = 31, ["parameter"] = {10004, 10048}, ["name"] = "副本", ["des"] = "简单副本 5-9"},
    [2050] = {["id"] = 2050, ["type"] = 31, ["parameter"] = {10004, 10049}, ["name"] = "副本", ["des"] = "简单副本 5-10"},
    [2051] = {["id"] = 2051, ["type"] = 31, ["parameter"] = {10005, 10050}, ["name"] = "副本", ["des"] = "简单副本 6-1"},
    [2052] = {["id"] = 2052, ["type"] = 31, ["parameter"] = {10005, 10051}, ["name"] = "副本", ["des"] = "简单副本 6-2"},
    [2053] = {["id"] = 2053, ["type"] = 31, ["parameter"] = {10005, 10052}, ["name"] = "副本", ["des"] = "简单副本 6-3"},
    [2054] = {["id"] = 2054, ["type"] = 31, ["parameter"] = {10005, 10053}, ["name"] = "副本", ["des"] = "简单副本 6-4"},
    [2055] = {["id"] = 2055, ["type"] = 31, ["parameter"] = {10005, 10054}, ["name"] = "副本", ["des"] = "简单副本 6-5"},
    [2056] = {["id"] = 2056, ["type"] = 31, ["parameter"] = {10005, 10055}, ["name"] = "副本", ["des"] = "简单副本 6-6"},
    [2057] = {["id"] = 2057, ["type"] = 31, ["parameter"] = {10005, 10056}, ["name"] = "副本", ["des"] = "简单副本 6-7"},
    [2058] = {["id"] = 2058, ["type"] = 31, ["parameter"] = {10005, 10057}, ["name"] = "副本", ["des"] = "简单副本 6-8"},
    [2059] = {["id"] = 2059, ["type"] = 31, ["parameter"] = {10005, 10058}, ["name"] = "副本", ["des"] = "简单副本 6-9"},
    [2060] = {["id"] = 2060, ["type"] = 31, ["parameter"] = {10005, 10059}, ["name"] = "副本", ["des"] = "简单副本 6-10"},
    [2061] = {["id"] = 2061, ["type"] = 31, ["parameter"] = {10006, 10060}, ["name"] = "副本", ["des"] = "简单副本 7-1"},
    [2062] = {["id"] = 2062, ["type"] = 31, ["parameter"] = {10006, 10061}, ["name"] = "副本", ["des"] = "简单副本 7-2"},
    [2063] = {["id"] = 2063, ["type"] = 31, ["parameter"] = {10006, 10062}, ["name"] = "副本", ["des"] = "简单副本 7-3"},
    [2064] = {["id"] = 2064, ["type"] = 31, ["parameter"] = {10006, 10063}, ["name"] = "副本", ["des"] = "简单副本 7-4"},
    [2065] = {["id"] = 2065, ["type"] = 31, ["parameter"] = {10006, 10064}, ["name"] = "副本", ["des"] = "简单副本 7-5"},
    [2066] = {["id"] = 2066, ["type"] = 31, ["parameter"] = {10006, 10065}, ["name"] = "副本", ["des"] = "简单副本 7-6"},
    [2067] = {["id"] = 2067, ["type"] = 31, ["parameter"] = {10006, 10066}, ["name"] = "副本", ["des"] = "简单副本 7-7"},
    [2068] = {["id"] = 2068, ["type"] = 31, ["parameter"] = {10006, 10067}, ["name"] = "副本", ["des"] = "简单副本 7-8"},
    [2069] = {["id"] = 2069, ["type"] = 31, ["parameter"] = {10006, 10068}, ["name"] = "副本", ["des"] = "简单副本 7-9"},
    [2070] = {["id"] = 2070, ["type"] = 31, ["parameter"] = {10006, 10069}, ["name"] = "副本", ["des"] = "简单副本 7-10"},
    [2071] = {["id"] = 2071, ["type"] = 31, ["parameter"] = {10007, 10070}, ["name"] = "副本", ["des"] = "简单副本 8-1"},
    [2072] = {["id"] = 2072, ["type"] = 31, ["parameter"] = {10007, 10071}, ["name"] = "副本", ["des"] = "简单副本 8-2"},
    [2073] = {["id"] = 2073, ["type"] = 31, ["parameter"] = {10007, 10072}, ["name"] = "副本", ["des"] = "简单副本 8-3"},
    [2074] = {["id"] = 2074, ["type"] = 31, ["parameter"] = {10007, 10073}, ["name"] = "副本", ["des"] = "简单副本 8-4"},
    [2075] = {["id"] = 2075, ["type"] = 31, ["parameter"] = {10007, 10074}, ["name"] = "副本", ["des"] = "简单副本 8-5"},
    [2076] = {["id"] = 2076, ["type"] = 31, ["parameter"] = {10007, 10075}, ["name"] = "副本", ["des"] = "简单副本 8-6"},
    [2077] = {["id"] = 2077, ["type"] = 31, ["parameter"] = {10007, 10076}, ["name"] = "副本", ["des"] = "简单副本 8-7"},
    [2078] = {["id"] = 2078, ["type"] = 31, ["parameter"] = {10007, 10077}, ["name"] = "副本", ["des"] = "简单副本 8-8"},
    [2079] = {["id"] = 2079, ["type"] = 31, ["parameter"] = {10007, 10078}, ["name"] = "副本", ["des"] = "简单副本 8-9"},
    [2080] = {["id"] = 2080, ["type"] = 31, ["parameter"] = {10007, 10079}, ["name"] = "副本", ["des"] = "简单副本 8-10"},
    [2081] = {["id"] = 2081, ["type"] = 31, ["parameter"] = {10008, 10080}, ["name"] = "副本", ["des"] = "简单副本 9-1"},
    [2082] = {["id"] = 2082, ["type"] = 31, ["parameter"] = {10008, 10081}, ["name"] = "副本", ["des"] = "简单副本 9-2"},
    [2083] = {["id"] = 2083, ["type"] = 31, ["parameter"] = {10008, 10082}, ["name"] = "副本", ["des"] = "简单副本 9-3"},
    [2084] = {["id"] = 2084, ["type"] = 31, ["parameter"] = {10008, 10083}, ["name"] = "副本", ["des"] = "简单副本 9-4"},
    [2085] = {["id"] = 2085, ["type"] = 31, ["parameter"] = {10008, 10084}, ["name"] = "副本", ["des"] = "简单副本 9-5"},
    [2086] = {["id"] = 2086, ["type"] = 31, ["parameter"] = {10008, 10085}, ["name"] = "副本", ["des"] = "简单副本 9-6"},
    [2087] = {["id"] = 2087, ["type"] = 31, ["parameter"] = {10008, 10086}, ["name"] = "副本", ["des"] = "简单副本 9-7"},
    [2088] = {["id"] = 2088, ["type"] = 31, ["parameter"] = {10008, 10087}, ["name"] = "副本", ["des"] = "简单副本 9-8"},
    [2089] = {["id"] = 2089, ["type"] = 31, ["parameter"] = {10008, 10088}, ["name"] = "副本", ["des"] = "简单副本 9-9"},
    [2090] = {["id"] = 2090, ["type"] = 31, ["parameter"] = {10008, 10089}, ["name"] = "副本", ["des"] = "简单副本 9-10"},
    [2091] = {["id"] = 2091, ["type"] = 31, ["parameter"] = {10009, 10090}, ["name"] = "副本", ["des"] = "简单副本 10-1"},
    [2092] = {["id"] = 2092, ["type"] = 31, ["parameter"] = {10009, 10091}, ["name"] = "副本", ["des"] = "简单副本 10-2"},
    [2093] = {["id"] = 2093, ["type"] = 31, ["parameter"] = {10009, 10092}, ["name"] = "副本", ["des"] = "简单副本 10-3"},
    [2094] = {["id"] = 2094, ["type"] = 31, ["parameter"] = {10009, 10093}, ["name"] = "副本", ["des"] = "简单副本 10-4"},
    [2095] = {["id"] = 2095, ["type"] = 31, ["parameter"] = {10009, 10094}, ["name"] = "副本", ["des"] = "简单副本 10-5"},
    [2096] = {["id"] = 2096, ["type"] = 31, ["parameter"] = {10009, 10095}, ["name"] = "副本", ["des"] = "简单副本 10-6"},
    [2097] = {["id"] = 2097, ["type"] = 31, ["parameter"] = {10009, 10096}, ["name"] = "副本", ["des"] = "简单副本 10-7"},
    [2098] = {["id"] = 2098, ["type"] = 31, ["parameter"] = {10009, 10097}, ["name"] = "副本", ["des"] = "简单副本 10-8"},
    [2099] = {["id"] = 2099, ["type"] = 31, ["parameter"] = {10009, 10098}, ["name"] = "副本", ["des"] = "简单副本 10-9"},
    [2100] = {["id"] = 2100, ["type"] = 31, ["parameter"] = {10009, 10099}, ["name"] = "副本", ["des"] = "简单副本 10-10"},
    [2101] = {["id"] = 2101, ["type"] = 31, ["parameter"] = {10010, 10100}, ["name"] = "副本", ["des"] = "简单副本 11-1"},
    [2102] = {["id"] = 2102, ["type"] = 31, ["parameter"] = {10010, 10101}, ["name"] = "副本", ["des"] = "简单副本 11-2"},
    [2103] = {["id"] = 2103, ["type"] = 31, ["parameter"] = {10010, 10102}, ["name"] = "副本", ["des"] = "简单副本 11-3"},
    [2104] = {["id"] = 2104, ["type"] = 31, ["parameter"] = {10010, 10103}, ["name"] = "副本", ["des"] = "简单副本 11-4"},
    [2105] = {["id"] = 2105, ["type"] = 31, ["parameter"] = {10010, 10104}, ["name"] = "副本", ["des"] = "简单副本 11-5"},
    [2106] = {["id"] = 2106, ["type"] = 31, ["parameter"] = {10010, 10105}, ["name"] = "副本", ["des"] = "简单副本 11-6"},
    [2107] = {["id"] = 2107, ["type"] = 31, ["parameter"] = {10010, 10106}, ["name"] = "副本", ["des"] = "简单副本 11-7"},
    [2108] = {["id"] = 2108, ["type"] = 31, ["parameter"] = {10010, 10107}, ["name"] = "副本", ["des"] = "简单副本 11-8"},
    [2109] = {["id"] = 2109, ["type"] = 31, ["parameter"] = {10010, 10108}, ["name"] = "副本", ["des"] = "简单副本 11-9"},
    [2110] = {["id"] = 2110, ["type"] = 31, ["parameter"] = {10010, 10109}, ["name"] = "副本", ["des"] = "简单副本 11-10"},
    [2111] = {["id"] = 2111, ["type"] = 31, ["parameter"] = {10011, 10110}, ["name"] = "副本", ["des"] = "简单副本 12-1"},
    [2112] = {["id"] = 2112, ["type"] = 31, ["parameter"] = {10011, 10111}, ["name"] = "副本", ["des"] = "简单副本 12-2"},
    [2113] = {["id"] = 2113, ["type"] = 31, ["parameter"] = {10011, 10112}, ["name"] = "副本", ["des"] = "简单副本 12-3"},
    [2114] = {["id"] = 2114, ["type"] = 31, ["parameter"] = {10011, 10113}, ["name"] = "副本", ["des"] = "简单副本 12-4"},
    [2115] = {["id"] = 2115, ["type"] = 31, ["parameter"] = {10011, 10114}, ["name"] = "副本", ["des"] = "简单副本 12-5"},
    [2116] = {["id"] = 2116, ["type"] = 31, ["parameter"] = {10011, 10115}, ["name"] = "副本", ["des"] = "简单副本 12-6"},
    [2117] = {["id"] = 2117, ["type"] = 31, ["parameter"] = {10011, 10116}, ["name"] = "副本", ["des"] = "简单副本 12-7"},
    [2118] = {["id"] = 2118, ["type"] = 31, ["parameter"] = {10011, 10117}, ["name"] = "副本", ["des"] = "简单副本 12-8"},
    [2119] = {["id"] = 2119, ["type"] = 31, ["parameter"] = {10011, 10118}, ["name"] = "副本", ["des"] = "简单副本 12-9"},
    [2120] = {["id"] = 2120, ["type"] = 31, ["parameter"] = {10011, 10119}, ["name"] = "副本", ["des"] = "简单副本 12-10"},
    [3000] = {["id"] = 3000, ["type"] = 32, ["name"] = "困难副本", ["des"] = "困难副本"},
    [3001] = {["id"] = 3001, ["type"] = 32, ["parameter"] = {20000, 20000}, ["name"] = "副本", ["des"] = "困难副本 1-1"},
    [3002] = {["id"] = 3002, ["type"] = 32, ["parameter"] = {20000, 20001}, ["name"] = "副本", ["des"] = "困难副本 1-2"},
    [3003] = {["id"] = 3003, ["type"] = 32, ["parameter"] = {20000, 20002}, ["name"] = "副本", ["des"] = "困难副本 1-3"},
    [3004] = {["id"] = 3004, ["type"] = 32, ["parameter"] = {20000, 20003}, ["name"] = "副本", ["des"] = "困难副本 1-4"},
    [3005] = {["id"] = 3005, ["type"] = 32, ["parameter"] = {20000, 20004}, ["name"] = "副本", ["des"] = "困难副本 1-5"},
    [3006] = {["id"] = 3006, ["type"] = 32, ["parameter"] = {20000, 20005}, ["name"] = "副本", ["des"] = "困难副本 1-6"},
    [3007] = {["id"] = 3007, ["type"] = 32, ["parameter"] = {20000, 20006}, ["name"] = "副本", ["des"] = "困难副本 1-7"},
    [3008] = {["id"] = 3008, ["type"] = 32, ["parameter"] = {20000, 20007}, ["name"] = "副本", ["des"] = "困难副本 1-8"},
    [3009] = {["id"] = 3009, ["type"] = 32, ["parameter"] = {20000, 20008}, ["name"] = "副本", ["des"] = "困难副本 1-9"},
    [3010] = {["id"] = 3010, ["type"] = 32, ["parameter"] = {20000, 20009}, ["name"] = "副本", ["des"] = "困难副本 1-10"},
    [3011] = {["id"] = 3011, ["type"] = 32, ["parameter"] = {20001, 20010}, ["name"] = "副本", ["des"] = "困难副本 2-1"},
    [3012] = {["id"] = 3012, ["type"] = 32, ["parameter"] = {20001, 20011}, ["name"] = "副本", ["des"] = "困难副本 2-2"},
    [3013] = {["id"] = 3013, ["type"] = 32, ["parameter"] = {20001, 20012}, ["name"] = "副本", ["des"] = "困难副本 2-3"},
    [3014] = {["id"] = 3014, ["type"] = 32, ["parameter"] = {20001, 20013}, ["name"] = "副本", ["des"] = "困难副本 2-4"},
    [3015] = {["id"] = 3015, ["type"] = 32, ["parameter"] = {20001, 20014}, ["name"] = "副本", ["des"] = "困难副本 2-5"},
    [3016] = {["id"] = 3016, ["type"] = 32, ["parameter"] = {20001, 20015}, ["name"] = "副本", ["des"] = "困难副本 2-6"},
    [3017] = {["id"] = 3017, ["type"] = 32, ["parameter"] = {20001, 20016}, ["name"] = "副本", ["des"] = "困难副本 2-7"},
    [3018] = {["id"] = 3018, ["type"] = 32, ["parameter"] = {20001, 20017}, ["name"] = "副本", ["des"] = "困难副本 2-8"},
    [3019] = {["id"] = 3019, ["type"] = 32, ["parameter"] = {20001, 20018}, ["name"] = "副本", ["des"] = "困难副本 2-9"},
    [3020] = {["id"] = 3020, ["type"] = 32, ["parameter"] = {20001, 20019}, ["name"] = "副本", ["des"] = "困难副本 2-10"},
    [3021] = {["id"] = 3021, ["type"] = 32, ["parameter"] = {20002, 20020}, ["name"] = "副本", ["des"] = "困难副本 3-1"},
    [3022] = {["id"] = 3022, ["type"] = 32, ["parameter"] = {20002, 20021}, ["name"] = "副本", ["des"] = "困难副本 3-2"},
    [3023] = {["id"] = 3023, ["type"] = 32, ["parameter"] = {20002, 20022}, ["name"] = "副本", ["des"] = "困难副本 3-3"},
    [3024] = {["id"] = 3024, ["type"] = 32, ["parameter"] = {20002, 20023}, ["name"] = "副本", ["des"] = "困难副本 3-4"},
    [3025] = {["id"] = 3025, ["type"] = 32, ["parameter"] = {20002, 20024}, ["name"] = "副本", ["des"] = "困难副本 3-5"},
    [3026] = {["id"] = 3026, ["type"] = 32, ["parameter"] = {20002, 20025}, ["name"] = "副本", ["des"] = "困难副本 3-6"},
    [3027] = {["id"] = 3027, ["type"] = 32, ["parameter"] = {20002, 20026}, ["name"] = "副本", ["des"] = "困难副本 3-7"},
    [3028] = {["id"] = 3028, ["type"] = 32, ["parameter"] = {20002, 20027}, ["name"] = "副本", ["des"] = "困难副本 3-8"},
    [3029] = {["id"] = 3029, ["type"] = 32, ["parameter"] = {20002, 20028}, ["name"] = "副本", ["des"] = "困难副本 3-9"},
    [3030] = {["id"] = 3030, ["type"] = 32, ["parameter"] = {20002, 20029}, ["name"] = "副本", ["des"] = "困难副本 3-10"},
    [3031] = {["id"] = 3031, ["type"] = 32, ["parameter"] = {20003, 20030}, ["name"] = "副本", ["des"] = "困难副本 4-1"},
    [3032] = {["id"] = 3032, ["type"] = 32, ["parameter"] = {20003, 20031}, ["name"] = "副本", ["des"] = "困难副本 4-2"},
    [3033] = {["id"] = 3033, ["type"] = 32, ["parameter"] = {20003, 20032}, ["name"] = "副本", ["des"] = "困难副本 4-3"},
    [3034] = {["id"] = 3034, ["type"] = 32, ["parameter"] = {20003, 20033}, ["name"] = "副本", ["des"] = "困难副本 4-4"},
    [3035] = {["id"] = 3035, ["type"] = 32, ["parameter"] = {20003, 20034}, ["name"] = "副本", ["des"] = "困难副本 4-5"},
    [3036] = {["id"] = 3036, ["type"] = 32, ["parameter"] = {20003, 20035}, ["name"] = "副本", ["des"] = "困难副本 4-6"},
    [3037] = {["id"] = 3037, ["type"] = 32, ["parameter"] = {20003, 20036}, ["name"] = "副本", ["des"] = "困难副本 4-7"},
    [3038] = {["id"] = 3038, ["type"] = 32, ["parameter"] = {20003, 20037}, ["name"] = "副本", ["des"] = "困难副本 4-8"},
    [3039] = {["id"] = 3039, ["type"] = 32, ["parameter"] = {20003, 20038}, ["name"] = "副本", ["des"] = "困难副本 4-9"},
    [3040] = {["id"] = 3040, ["type"] = 32, ["parameter"] = {20003, 20039}, ["name"] = "副本", ["des"] = "困难副本 4-10"},
    [3041] = {["id"] = 3041, ["type"] = 32, ["parameter"] = {20004, 20040}, ["name"] = "副本", ["des"] = "困难副本 5-1"},
    [3042] = {["id"] = 3042, ["type"] = 32, ["parameter"] = {20004, 20041}, ["name"] = "副本", ["des"] = "困难副本 5-2"},
    [3043] = {["id"] = 3043, ["type"] = 32, ["parameter"] = {20004, 20042}, ["name"] = "副本", ["des"] = "困难副本 5-3"},
    [3044] = {["id"] = 3044, ["type"] = 32, ["parameter"] = {20004, 20043}, ["name"] = "副本", ["des"] = "困难副本 5-4"},
    [3045] = {["id"] = 3045, ["type"] = 32, ["parameter"] = {20004, 20044}, ["name"] = "副本", ["des"] = "困难副本 5-5"},
    [3046] = {["id"] = 3046, ["type"] = 32, ["parameter"] = {20004, 20045}, ["name"] = "副本", ["des"] = "困难副本 5-6"},
    [3047] = {["id"] = 3047, ["type"] = 32, ["parameter"] = {20004, 20046}, ["name"] = "副本", ["des"] = "困难副本 5-7"},
    [3048] = {["id"] = 3048, ["type"] = 32, ["parameter"] = {20004, 20047}, ["name"] = "副本", ["des"] = "困难副本 5-8"},
    [3049] = {["id"] = 3049, ["type"] = 32, ["parameter"] = {20004, 20048}, ["name"] = "副本", ["des"] = "困难副本 5-9"},
    [3050] = {["id"] = 3050, ["type"] = 32, ["parameter"] = {20004, 20049}, ["name"] = "副本", ["des"] = "困难副本 5-10"},
    [3051] = {["id"] = 3051, ["type"] = 32, ["parameter"] = {20005, 20050}, ["name"] = "副本", ["des"] = "困难副本 6-1"},
    [3052] = {["id"] = 3052, ["type"] = 32, ["parameter"] = {20005, 20051}, ["name"] = "副本", ["des"] = "困难副本 6-2"},
    [3053] = {["id"] = 3053, ["type"] = 32, ["parameter"] = {20005, 20052}, ["name"] = "副本", ["des"] = "困难副本 6-3"},
    [3054] = {["id"] = 3054, ["type"] = 32, ["parameter"] = {20005, 20053}, ["name"] = "副本", ["des"] = "困难副本 6-4"},
    [3055] = {["id"] = 3055, ["type"] = 32, ["parameter"] = {20005, 20054}, ["name"] = "副本", ["des"] = "困难副本 6-5"},
    [3056] = {["id"] = 3056, ["type"] = 32, ["parameter"] = {20005, 20055}, ["name"] = "副本", ["des"] = "困难副本 6-6"},
    [3057] = {["id"] = 3057, ["type"] = 32, ["parameter"] = {20005, 20056}, ["name"] = "副本", ["des"] = "困难副本 6-7"},
    [3058] = {["id"] = 3058, ["type"] = 32, ["parameter"] = {20005, 20057}, ["name"] = "副本", ["des"] = "困难副本 6-8"},
    [3059] = {["id"] = 3059, ["type"] = 32, ["parameter"] = {20005, 20058}, ["name"] = "副本", ["des"] = "困难副本 6-9"},
    [3060] = {["id"] = 3060, ["type"] = 32, ["parameter"] = {20005, 20059}, ["name"] = "副本", ["des"] = "困难副本 6-10"},
    [3061] = {["id"] = 3061, ["type"] = 32, ["parameter"] = {20006, 20060}, ["name"] = "副本", ["des"] = "困难副本 7-1"},
    [3062] = {["id"] = 3062, ["type"] = 32, ["parameter"] = {20006, 20061}, ["name"] = "副本", ["des"] = "困难副本 7-2"},
    [3063] = {["id"] = 3063, ["type"] = 32, ["parameter"] = {20006, 20062}, ["name"] = "副本", ["des"] = "困难副本 7-3"},
    [3064] = {["id"] = 3064, ["type"] = 32, ["parameter"] = {20006, 20063}, ["name"] = "副本", ["des"] = "困难副本 7-4"},
    [3065] = {["id"] = 3065, ["type"] = 32, ["parameter"] = {20006, 20064}, ["name"] = "副本", ["des"] = "困难副本 7-5"},
    [3066] = {["id"] = 3066, ["type"] = 32, ["parameter"] = {20006, 20065}, ["name"] = "副本", ["des"] = "困难副本 7-6"},
    [3067] = {["id"] = 3067, ["type"] = 32, ["parameter"] = {20006, 20066}, ["name"] = "副本", ["des"] = "困难副本 7-7"},
    [3068] = {["id"] = 3068, ["type"] = 32, ["parameter"] = {20006, 20067}, ["name"] = "副本", ["des"] = "困难副本 7-8"},
    [3069] = {["id"] = 3069, ["type"] = 32, ["parameter"] = {20006, 20068}, ["name"] = "副本", ["des"] = "困难副本 7-9"},
    [3070] = {["id"] = 3070, ["type"] = 32, ["parameter"] = {20006, 20069}, ["name"] = "副本", ["des"] = "困难副本 7-10"},
    [3071] = {["id"] = 3071, ["type"] = 32, ["parameter"] = {20007, 20070}, ["name"] = "副本", ["des"] = "困难副本 8-1"},
    [3072] = {["id"] = 3072, ["type"] = 32, ["parameter"] = {20007, 20071}, ["name"] = "副本", ["des"] = "困难副本 8-2"},
    [3073] = {["id"] = 3073, ["type"] = 32, ["parameter"] = {20007, 20072}, ["name"] = "副本", ["des"] = "困难副本 8-3"},
    [3074] = {["id"] = 3074, ["type"] = 32, ["parameter"] = {20007, 20073}, ["name"] = "副本", ["des"] = "困难副本 8-4"},
    [3075] = {["id"] = 3075, ["type"] = 32, ["parameter"] = {20007, 20074}, ["name"] = "副本", ["des"] = "困难副本 8-5"},
    [3076] = {["id"] = 3076, ["type"] = 32, ["parameter"] = {20007, 20075}, ["name"] = "副本", ["des"] = "困难副本 8-6"},
    [3077] = {["id"] = 3077, ["type"] = 32, ["parameter"] = {20007, 20076}, ["name"] = "副本", ["des"] = "困难副本 8-7"},
    [3078] = {["id"] = 3078, ["type"] = 32, ["parameter"] = {20007, 20077}, ["name"] = "副本", ["des"] = "困难副本 8-8"},
    [3079] = {["id"] = 3079, ["type"] = 32, ["parameter"] = {20007, 20078}, ["name"] = "副本", ["des"] = "困难副本 8-9"},
    [3080] = {["id"] = 3080, ["type"] = 32, ["parameter"] = {20007, 20079}, ["name"] = "副本", ["des"] = "困难副本 8-10"},
    [3081] = {["id"] = 3081, ["type"] = 32, ["parameter"] = {20008, 20080}, ["name"] = "副本", ["des"] = "困难副本 9-1"},
    [3082] = {["id"] = 3082, ["type"] = 32, ["parameter"] = {20008, 20081}, ["name"] = "副本", ["des"] = "困难副本 9-2"},
    [3083] = {["id"] = 3083, ["type"] = 32, ["parameter"] = {20008, 20082}, ["name"] = "副本", ["des"] = "困难副本 9-3"},
    [3084] = {["id"] = 3084, ["type"] = 32, ["parameter"] = {20008, 20083}, ["name"] = "副本", ["des"] = "困难副本 9-4"},
    [3085] = {["id"] = 3085, ["type"] = 32, ["parameter"] = {20008, 20084}, ["name"] = "副本", ["des"] = "困难副本 9-5"},
    [3086] = {["id"] = 3086, ["type"] = 32, ["parameter"] = {20008, 20085}, ["name"] = "副本", ["des"] = "困难副本 9-6"},
    [3087] = {["id"] = 3087, ["type"] = 32, ["parameter"] = {20008, 20086}, ["name"] = "副本", ["des"] = "困难副本 9-7"},
    [3088] = {["id"] = 3088, ["type"] = 32, ["parameter"] = {20008, 20087}, ["name"] = "副本", ["des"] = "困难副本 9-8"},
    [3089] = {["id"] = 3089, ["type"] = 32, ["parameter"] = {20008, 20088}, ["name"] = "副本", ["des"] = "困难副本 9-9"},
    [3090] = {["id"] = 3090, ["type"] = 32, ["parameter"] = {20008, 20089}, ["name"] = "副本", ["des"] = "困难副本 9-10"},
    [3091] = {["id"] = 3091, ["type"] = 32, ["parameter"] = {20009, 20090}, ["name"] = "副本", ["des"] = "困难副本 10-1"},
    [3092] = {["id"] = 3092, ["type"] = 32, ["parameter"] = {20009, 20091}, ["name"] = "副本", ["des"] = "困难副本 10-2"},
    [3093] = {["id"] = 3093, ["type"] = 32, ["parameter"] = {20009, 20092}, ["name"] = "副本", ["des"] = "困难副本 10-3"},
    [3094] = {["id"] = 3094, ["type"] = 32, ["parameter"] = {20009, 20093}, ["name"] = "副本", ["des"] = "困难副本 10-4"},
    [3095] = {["id"] = 3095, ["type"] = 32, ["parameter"] = {20009, 20094}, ["name"] = "副本", ["des"] = "困难副本 10-5"},
    [3096] = {["id"] = 3096, ["type"] = 32, ["parameter"] = {20009, 20095}, ["name"] = "副本", ["des"] = "困难副本 10-6"},
    [3097] = {["id"] = 3097, ["type"] = 32, ["parameter"] = {20009, 20096}, ["name"] = "副本", ["des"] = "困难副本 10-7"},
    [3098] = {["id"] = 3098, ["type"] = 32, ["parameter"] = {20009, 20097}, ["name"] = "副本", ["des"] = "困难副本 10-8"},
    [3099] = {["id"] = 3099, ["type"] = 32, ["parameter"] = {20009, 20098}, ["name"] = "副本", ["des"] = "困难副本 10-9"},
    [3100] = {["id"] = 3100, ["type"] = 32, ["parameter"] = {20009, 20099}, ["name"] = "副本", ["des"] = "困难副本 10-10"},
    [3101] = {["id"] = 3101, ["type"] = 32, ["parameter"] = {20010, 20100}, ["name"] = "副本", ["des"] = "困难副本 11-1"},
    [3102] = {["id"] = 3102, ["type"] = 32, ["parameter"] = {20010, 20101}, ["name"] = "副本", ["des"] = "困难副本 11-2"},
    [3103] = {["id"] = 3103, ["type"] = 32, ["parameter"] = {20010, 20102}, ["name"] = "副本", ["des"] = "困难副本 11-3"},
    [3104] = {["id"] = 3104, ["type"] = 32, ["parameter"] = {20010, 20103}, ["name"] = "副本", ["des"] = "困难副本 11-4"},
    [3105] = {["id"] = 3105, ["type"] = 32, ["parameter"] = {20010, 20104}, ["name"] = "副本", ["des"] = "困难副本 11-5"},
    [3106] = {["id"] = 3106, ["type"] = 32, ["parameter"] = {20010, 20105}, ["name"] = "副本", ["des"] = "困难副本 11-6"},
    [3107] = {["id"] = 3107, ["type"] = 32, ["parameter"] = {20010, 20106}, ["name"] = "副本", ["des"] = "困难副本 11-7"},
    [3108] = {["id"] = 3108, ["type"] = 32, ["parameter"] = {20010, 20107}, ["name"] = "副本", ["des"] = "困难副本 11-8"},
    [3109] = {["id"] = 3109, ["type"] = 32, ["parameter"] = {20010, 20108}, ["name"] = "副本", ["des"] = "困难副本 11-9"},
    [3110] = {["id"] = 3110, ["type"] = 32, ["parameter"] = {20010, 20109}, ["name"] = "副本", ["des"] = "困难副本 11-10"},
    [3111] = {["id"] = 3111, ["type"] = 32, ["parameter"] = {20011, 20110}, ["name"] = "副本", ["des"] = "困难副本 12-1"},
    [3112] = {["id"] = 3112, ["type"] = 32, ["parameter"] = {20011, 20111}, ["name"] = "副本", ["des"] = "困难副本 12-2"},
    [3113] = {["id"] = 3113, ["type"] = 32, ["parameter"] = {20011, 20112}, ["name"] = "副本", ["des"] = "困难副本 12-3"},
    [3114] = {["id"] = 3114, ["type"] = 32, ["parameter"] = {20011, 20113}, ["name"] = "副本", ["des"] = "困难副本 12-4"},
    [3115] = {["id"] = 3115, ["type"] = 32, ["parameter"] = {20011, 20114}, ["name"] = "副本", ["des"] = "困难副本 12-5"},
    [3116] = {["id"] = 3116, ["type"] = 32, ["parameter"] = {20011, 20115}, ["name"] = "副本", ["des"] = "困难副本 12-6"},
    [3117] = {["id"] = 3117, ["type"] = 32, ["parameter"] = {20011, 20116}, ["name"] = "副本", ["des"] = "困难副本 12-7"},
    [3118] = {["id"] = 3118, ["type"] = 32, ["parameter"] = {20011, 20117}, ["name"] = "副本", ["des"] = "困难副本 12-8"},
    [3119] = {["id"] = 3119, ["type"] = 32, ["parameter"] = {20011, 20118}, ["name"] = "副本", ["des"] = "困难副本 12-9"},
    [3120] = {["id"] = 3120, ["type"] = 32, ["parameter"] = {20011, 20119}, ["name"] = "副本", ["des"] = "困难副本 12-10"}
}

return data