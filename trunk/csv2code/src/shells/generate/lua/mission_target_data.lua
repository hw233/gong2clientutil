--
-- 任务条件表.csv
-- 条件编号 = id
-- 统计的字段名称 = var
-- 统计的字段值 = varMax

local data = {
    [10000] = {["id"] = 10000, ["var"] = "lvNum", ["varMax"] = 5},
    [10001] = {["id"] = 10001, ["var"] = "lvNum", ["varMax"] = 10},
    [10002] = {["id"] = 10002, ["var"] = "lvNum", ["varMax"] = 15},
    [10003] = {["id"] = 10003, ["var"] = "lvNum", ["varMax"] = 20},
    [10004] = {["id"] = 10004, ["var"] = "lvNum", ["varMax"] = 25},
    [10005] = {["id"] = 10005, ["var"] = "lvNum", ["varMax"] = 30},
    [10006] = {["id"] = 10006, ["var"] = "lvNum", ["varMax"] = 35},
    [10007] = {["id"] = 10007, ["var"] = "lvNum", ["varMax"] = 40},
    [10008] = {["id"] = 10008, ["var"] = "lvNum", ["varMax"] = 45},
    [10009] = {["id"] = 10009, ["var"] = "lvNum", ["varMax"] = 50},
    [10010] = {["id"] = 10010, ["var"] = "lvNum", ["varMax"] = 55},
    [10011] = {["id"] = 10011, ["var"] = "lvNum", ["varMax"] = 60},
    [10012] = {["id"] = 10012, ["var"] = "lvNum", ["varMax"] = 65},
    [10013] = {["id"] = 10013, ["var"] = "lvNum", ["varMax"] = 70},
    [10014] = {["id"] = 10014, ["var"] = "lvNum", ["varMax"] = 75},
    [10015] = {["id"] = 10015, ["var"] = "lvNum", ["varMax"] = 80},
    [10016] = {["id"] = 10016, ["var"] = "lvNum", ["varMax"] = 85},
    [10017] = {["id"] = 10017, ["var"] = "lvNum", ["varMax"] = 90},
    [10018] = {["id"] = 10018, ["var"] = "lvNum", ["varMax"] = 95},
    [10019] = {["id"] = 10019, ["var"] = "lvNum", ["varMax"] = 100},
    [10050] = {["id"] = 10050, ["var"] = "powNum", ["varMax"] = 40000},
    [10051] = {["id"] = 10051, ["var"] = "powNum", ["varMax"] = 80000},
    [10052] = {["id"] = 10052, ["var"] = "powNum", ["varMax"] = 120000},
    [10053] = {["id"] = 10053, ["var"] = "powNum", ["varMax"] = 160000},
    [10054] = {["id"] = 10054, ["var"] = "powNum", ["varMax"] = 200000},
    [10055] = {["id"] = 10055, ["var"] = "powNum", ["varMax"] = 240000},
    [10056] = {["id"] = 10056, ["var"] = "powNum", ["varMax"] = 280000},
    [10057] = {["id"] = 10057, ["var"] = "powNum", ["varMax"] = 320000},
    [10058] = {["id"] = 10058, ["var"] = "powNum", ["varMax"] = 360000},
    [10059] = {["id"] = 10059, ["var"] = "powNum", ["varMax"] = 400000},
    [10060] = {["id"] = 10060, ["var"] = "powNum", ["varMax"] = 440000},
    [10061] = {["id"] = 10061, ["var"] = "powNum", ["varMax"] = 480000},
    [10062] = {["id"] = 10062, ["var"] = "powNum", ["varMax"] = 520000},
    [10063] = {["id"] = 10063, ["var"] = "powNum", ["varMax"] = 560000},
    [10064] = {["id"] = 10064, ["var"] = "powNum", ["varMax"] = 600000},
    [10065] = {["id"] = 10065, ["var"] = "powNum", ["varMax"] = 680000},
    [10066] = {["id"] = 10066, ["var"] = "powNum", ["varMax"] = 760000},
    [10067] = {["id"] = 10067, ["var"] = "powNum", ["varMax"] = 840000},
    [10068] = {["id"] = 10068, ["var"] = "powNum", ["varMax"] = 920000},
    [10069] = {["id"] = 10069, ["var"] = "powNum", ["varMax"] = 1000000},
    [10070] = {["id"] = 10070, ["var"] = "powNum", ["varMax"] = 1200000},
    [10071] = {["id"] = 10071, ["var"] = "powNum", ["varMax"] = 1400000},
    [10072] = {["id"] = 10072, ["var"] = "powNum", ["varMax"] = 1600000},
    [10073] = {["id"] = 10073, ["var"] = "powNum", ["varMax"] = 1800000},
    [10074] = {["id"] = 10074, ["var"] = "powNum", ["varMax"] = 2000000},
    [10075] = {["id"] = 10075, ["var"] = "powNum", ["varMax"] = 2500000},
    [10076] = {["id"] = 10076, ["var"] = "powNum", ["varMax"] = 3000000},
    [10077] = {["id"] = 10077, ["var"] = "powNum", ["varMax"] = 3500000},
    [10078] = {["id"] = 10078, ["var"] = "powNum", ["varMax"] = 4000000},
    [10079] = {["id"] = 10079, ["var"] = "powNum", ["varMax"] = 4500000},
    [10080] = {["id"] = 10080, ["var"] = "powNum", ["varMax"] = 5000000},
    [10100] = {["id"] = 10100},
    [10101] = {["id"] = 10101},
    [10102] = {["id"] = 10102},
    [10103] = {["id"] = 10103},
    [10104] = {["id"] = 10104},
    [10105] = {["id"] = 10105},
    [10106] = {["id"] = 10106},
    [10107] = {["id"] = 10107},
    [10108] = {["id"] = 10108},
    [10109] = {["id"] = 10109},
    [10110] = {["id"] = 10110},
    [10111] = {["id"] = 10111},
    [10112] = {["id"] = 10112},
    [10113] = {["id"] = 10113},
    [10114] = {["id"] = 10114},
    [10115] = {["id"] = 10115},
    [10116] = {["id"] = 10116},
    [10117] = {["id"] = 10117},
    [10118] = {["id"] = 10118},
    [10150] = {["id"] = 10150, ["var"] = "fanhuaNum", ["varMax"] = 6000},
    [10151] = {["id"] = 10151, ["var"] = "fanhuaNum", ["varMax"] = 8000},
    [10152] = {["id"] = 10152, ["var"] = "fanhuaNum", ["varMax"] = 10000},
    [10153] = {["id"] = 10153, ["var"] = "fanhuaNum", ["varMax"] = 12000},
    [10154] = {["id"] = 10154, ["var"] = "fanhuaNum", ["varMax"] = 14000},
    [10155] = {["id"] = 10155, ["var"] = "fanhuaNum", ["varMax"] = 16000},
    [10156] = {["id"] = 10156, ["var"] = "fanhuaNum", ["varMax"] = 18000},
    [10157] = {["id"] = 10157, ["var"] = "fanhuaNum", ["varMax"] = 20000},
    [10158] = {["id"] = 10158, ["var"] = "fanhuaNum", ["varMax"] = 24000},
    [10159] = {["id"] = 10159, ["var"] = "fanhuaNum", ["varMax"] = 28000},
    [10160] = {["id"] = 10160, ["var"] = "fanhuaNum", ["varMax"] = 32000},
    [10161] = {["id"] = 10161, ["var"] = "fanhuaNum", ["varMax"] = 36000},
    [10162] = {["id"] = 10162, ["var"] = "fanhuaNum", ["varMax"] = 40000},
    [10163] = {["id"] = 10163, ["var"] = "fanhuaNum", ["varMax"] = 44000},
    [10164] = {["id"] = 10164, ["var"] = "fanhuaNum", ["varMax"] = 48000},
    [10165] = {["id"] = 10165, ["var"] = "fanhuaNum", ["varMax"] = 52000},
    [10166] = {["id"] = 10166, ["var"] = "fanhuaNum", ["varMax"] = 56000},
    [10167] = {["id"] = 10167, ["var"] = "fanhuaNum", ["varMax"] = 60000},
    [10168] = {["id"] = 10168, ["var"] = "fanhuaNum", ["varMax"] = 70000},
    [10169] = {["id"] = 10169, ["var"] = "fanhuaNum", ["varMax"] = 80000},
    [10170] = {["id"] = 10170, ["var"] = "fanhuaNum", ["varMax"] = 90000},
    [10171] = {["id"] = 10171, ["var"] = "fanhuaNum", ["varMax"] = 100000},
    [10172] = {["id"] = 10172, ["var"] = "fanhuaNum", ["varMax"] = 110000},
    [10173] = {["id"] = 10173, ["var"] = "fanhuaNum", ["varMax"] = 120000},
    [10174] = {["id"] = 10174, ["var"] = "fanhuaNum", ["varMax"] = 130000},
    [10175] = {["id"] = 10175, ["var"] = "fanhuaNum", ["varMax"] = 150000},
    [10176] = {["id"] = 10176, ["var"] = "fanhuaNum", ["varMax"] = 200000},
    [10177] = {["id"] = 10177, ["var"] = "fanhuaNum", ["varMax"] = 250000},
    [10178] = {["id"] = 10178, ["var"] = "fanhuaNum", ["varMax"] = 300000},
    [10179] = {["id"] = 10179, ["var"] = "fanhuaNum", ["varMax"] = 400000},
    [10200] = {["id"] = 10200, ["var"] = "leitaiNum", ["varMax"] = 5},
    [10201] = {["id"] = 10201, ["var"] = "leitaiNum", ["varMax"] = 10},
    [10202] = {["id"] = 10202, ["var"] = "leitaiNum", ["varMax"] = 15},
    [10203] = {["id"] = 10203, ["var"] = "leitaiNum", ["varMax"] = 20},
    [10204] = {["id"] = 10204, ["var"] = "leitaiNum", ["varMax"] = 25},
    [10205] = {["id"] = 10205, ["var"] = "leitaiNum", ["varMax"] = 30},
    [10206] = {["id"] = 10206, ["var"] = "leitaiNum", ["varMax"] = 40},
    [10207] = {["id"] = 10207, ["var"] = "leitaiNum", ["varMax"] = 50},
    [10208] = {["id"] = 10208, ["var"] = "leitaiNum", ["varMax"] = 60},
    [10209] = {["id"] = 10209, ["var"] = "leitaiNum", ["varMax"] = 70},
    [10210] = {["id"] = 10210, ["var"] = "leitaiNum", ["varMax"] = 80},
    [10211] = {["id"] = 10211, ["var"] = "leitaiNum", ["varMax"] = 90},
    [10212] = {["id"] = 10212, ["var"] = "leitaiNum", ["varMax"] = 100},
    [10213] = {["id"] = 10213, ["var"] = "leitaiNum", ["varMax"] = 120},
    [10214] = {["id"] = 10214, ["var"] = "leitaiNum", ["varMax"] = 140},
    [10215] = {["id"] = 10215, ["var"] = "leitaiNum", ["varMax"] = 160},
    [10216] = {["id"] = 10216, ["var"] = "leitaiNum", ["varMax"] = 180},
    [10217] = {["id"] = 10217, ["var"] = "leitaiNum", ["varMax"] = 200},
    [10218] = {["id"] = 10218, ["var"] = "leitaiNum", ["varMax"] = 240},
    [10219] = {["id"] = 10219, ["var"] = "leitaiNum", ["varMax"] = 280},
    [10220] = {["id"] = 10220, ["var"] = "leitaiNum", ["varMax"] = 320},
    [10221] = {["id"] = 10221, ["var"] = "leitaiNum", ["varMax"] = 360},
    [10222] = {["id"] = 10222, ["var"] = "leitaiNum", ["varMax"] = 400},
    [10223] = {["id"] = 10223, ["var"] = "leitaiNum", ["varMax"] = 450},
    [10224] = {["id"] = 10224, ["var"] = "leitaiNum", ["varMax"] = 500},
    [10250] = {["id"] = 10250, ["var"] = "cengshuNum", ["varMax"] = 10},
    [10251] = {["id"] = 10251, ["var"] = "cengshuNum", ["varMax"] = 20},
    [10252] = {["id"] = 10252, ["var"] = "cengshuNum", ["varMax"] = 30},
    [10253] = {["id"] = 10253, ["var"] = "cengshuNum", ["varMax"] = 40},
    [10254] = {["id"] = 10254, ["var"] = "cengshuNum", ["varMax"] = 50},
    [10255] = {["id"] = 10255, ["var"] = "cengshuNum", ["varMax"] = 60},
    [10256] = {["id"] = 10256, ["var"] = "cengshuNum", ["varMax"] = 70},
    [10257] = {["id"] = 10257, ["var"] = "cengshuNum", ["varMax"] = 80},
    [10258] = {["id"] = 10258, ["var"] = "cengshuNum", ["varMax"] = 90},
    [10259] = {["id"] = 10259, ["var"] = "cengshuNum", ["varMax"] = 100},
    [10260] = {["id"] = 10260, ["var"] = "cengshuNum", ["varMax"] = 110},
    [10261] = {["id"] = 10261, ["var"] = "cengshuNum", ["varMax"] = 120},
    [10262] = {["id"] = 10262, ["var"] = "cengshuNum", ["varMax"] = 130},
    [10263] = {["id"] = 10263, ["var"] = "cengshuNum", ["varMax"] = 140},
    [10264] = {["id"] = 10264, ["var"] = "cengshuNum", ["varMax"] = 150},
    [10265] = {["id"] = 10265, ["var"] = "cengshuNum", ["varMax"] = 160},
    [10266] = {["id"] = 10266, ["var"] = "cengshuNum", ["varMax"] = 170},
    [10267] = {["id"] = 10267, ["var"] = "cengshuNum", ["varMax"] = 180},
    [10268] = {["id"] = 10268, ["var"] = "cengshuNum", ["varMax"] = 190},
    [10269] = {["id"] = 10269, ["var"] = "cengshuNum", ["varMax"] = 200},
    [10270] = {["id"] = 10270, ["var"] = "cengshuNum", ["varMax"] = 210},
    [10271] = {["id"] = 10271, ["var"] = "cengshuNum", ["varMax"] = 220},
    [10272] = {["id"] = 10272, ["var"] = "cengshuNum", ["varMax"] = 230},
    [10273] = {["id"] = 10273, ["var"] = "cengshuNum", ["varMax"] = 240},
    [10300] = {["id"] = 10300, ["var"] = "guizuNum", ["varMax"] = 1},
    [10301] = {["id"] = 10301, ["var"] = "guizuNum", ["varMax"] = 2},
    [10302] = {["id"] = 10302, ["var"] = "guizuNum", ["varMax"] = 3},
    [10303] = {["id"] = 10303, ["var"] = "guizuNum", ["varMax"] = 4},
    [10304] = {["id"] = 10304, ["var"] = "guizuNum", ["varMax"] = 5},
    [10305] = {["id"] = 10305, ["var"] = "guizuNum", ["varMax"] = 6},
    [10306] = {["id"] = 10306, ["var"] = "guizuNum", ["varMax"] = 7},
    [10307] = {["id"] = 10307, ["var"] = "guizuNum", ["varMax"] = 8},
    [10308] = {["id"] = 10308, ["var"] = "guizuNum", ["varMax"] = 9},
    [10309] = {["id"] = 10309, ["var"] = "guizuNum", ["varMax"] = 10},
    [10310] = {["id"] = 10310, ["var"] = "guizuNum", ["varMax"] = 11},
    [10311] = {["id"] = 10311, ["var"] = "guizuNum", ["varMax"] = 12},
    [10312] = {["id"] = 10312, ["var"] = "guizuNum", ["varMax"] = 13},
    [10313] = {["id"] = 10313, ["var"] = "guizuNum", ["varMax"] = 14},
    [10314] = {["id"] = 10314, ["var"] = "guizuNum", ["varMax"] = 15},
    [10350] = {["id"] = 10350, ["var"] = "chXiaohaoTQNum", ["varMax"] = 20000},
    [10351] = {["id"] = 10351, ["var"] = "chXiaohaoTQNum", ["varMax"] = 40000},
    [10352] = {["id"] = 10352, ["var"] = "chXiaohaoTQNum", ["varMax"] = 60000},
    [10353] = {["id"] = 10353, ["var"] = "chXiaohaoTQNum", ["varMax"] = 80000},
    [10354] = {["id"] = 10354, ["var"] = "chXiaohaoTQNum", ["varMax"] = 100000},
    [10355] = {["id"] = 10355, ["var"] = "chXiaohaoTQNum", ["varMax"] = 120000},
    [10356] = {["id"] = 10356, ["var"] = "chXiaohaoTQNum", ["varMax"] = 140000},
    [10357] = {["id"] = 10357, ["var"] = "chXiaohaoTQNum", ["varMax"] = 160000},
    [10358] = {["id"] = 10358, ["var"] = "chXiaohaoTQNum", ["varMax"] = 180000},
    [10359] = {["id"] = 10359, ["var"] = "chXiaohaoTQNum", ["varMax"] = 200000},
    [10360] = {["id"] = 10360, ["var"] = "chXiaohaoTQNum", ["varMax"] = 220000},
    [10361] = {["id"] = 10361, ["var"] = "chXiaohaoTQNum", ["varMax"] = 240000},
    [10362] = {["id"] = 10362, ["var"] = "chXiaohaoTQNum", ["varMax"] = 280000},
    [10363] = {["id"] = 10363, ["var"] = "chXiaohaoTQNum", ["varMax"] = 320000},
    [10364] = {["id"] = 10364, ["var"] = "chXiaohaoTQNum", ["varMax"] = 360000},
    [10365] = {["id"] = 10365, ["var"] = "chXiaohaoTQNum", ["varMax"] = 400000},
    [10366] = {["id"] = 10366, ["var"] = "chXiaohaoTQNum", ["varMax"] = 440000},
    [10367] = {["id"] = 10367, ["var"] = "chXiaohaoTQNum", ["varMax"] = 480000},
    [10368] = {["id"] = 10368, ["var"] = "chXiaohaoTQNum", ["varMax"] = 520000},
    [10369] = {["id"] = 10369, ["var"] = "chXiaohaoTQNum", ["varMax"] = 560000},
    [10370] = {["id"] = 10370, ["var"] = "chXiaohaoTQNum", ["varMax"] = 600000},
    [10371] = {["id"] = 10371, ["var"] = "chXiaohaoTQNum", ["varMax"] = 640000},
    [10372] = {["id"] = 10372, ["var"] = "chXiaohaoTQNum", ["varMax"] = 680000},
    [10373] = {["id"] = 10373, ["var"] = "chXiaohaoTQNum", ["varMax"] = 720000},
    [10374] = {["id"] = 10374, ["var"] = "chXiaohaoTQNum", ["varMax"] = 760000},
    [10375] = {["id"] = 10375, ["var"] = "chXiaohaoTQNum", ["varMax"] = 800000},
    [10376] = {["id"] = 10376, ["var"] = "chXiaohaoTQNum", ["varMax"] = 1000000},
    [10377] = {["id"] = 10377, ["var"] = "chXiaohaoTQNum", ["varMax"] = 2000000},
    [10378] = {["id"] = 10378, ["var"] = "chXiaohaoTQNum", ["varMax"] = 3000000},
    [10379] = {["id"] = 10379, ["var"] = "chXiaohaoTQNum", ["varMax"] = 5000000},
    [10400] = {["id"] = 10400, ["var"] = "chXiaohaoYbNum", ["varMax"] = 400},
    [10401] = {["id"] = 10401, ["var"] = "chXiaohaoYbNum", ["varMax"] = 600},
    [10402] = {["id"] = 10402, ["var"] = "chXiaohaoYbNum", ["varMax"] = 800},
    [10403] = {["id"] = 10403, ["var"] = "chXiaohaoYbNum", ["varMax"] = 1000},
    [10404] = {["id"] = 10404, ["var"] = "chXiaohaoYbNum", ["varMax"] = 1500},
    [10405] = {["id"] = 10405, ["var"] = "chXiaohaoYbNum", ["varMax"] = 2000},
    [10406] = {["id"] = 10406, ["var"] = "chXiaohaoYbNum", ["varMax"] = 2500},
    [10407] = {["id"] = 10407, ["var"] = "chXiaohaoYbNum", ["varMax"] = 3000},
    [10408] = {["id"] = 10408, ["var"] = "chXiaohaoYbNum", ["varMax"] = 3500},
    [10409] = {["id"] = 10409, ["var"] = "chXiaohaoYbNum", ["varMax"] = 4000},
    [10410] = {["id"] = 10410, ["var"] = "chXiaohaoYbNum", ["varMax"] = 5000},
    [10411] = {["id"] = 10411, ["var"] = "chXiaohaoYbNum", ["varMax"] = 6000},
    [10412] = {["id"] = 10412, ["var"] = "chXiaohaoYbNum", ["varMax"] = 7000},
    [10413] = {["id"] = 10413, ["var"] = "chXiaohaoYbNum", ["varMax"] = 8000},
    [10414] = {["id"] = 10414, ["var"] = "chXiaohaoYbNum", ["varMax"] = 9000},
    [10415] = {["id"] = 10415, ["var"] = "chXiaohaoYbNum", ["varMax"] = 10000},
    [10416] = {["id"] = 10416, ["var"] = "chXiaohaoYbNum", ["varMax"] = 12000},
    [10417] = {["id"] = 10417, ["var"] = "chXiaohaoYbNum", ["varMax"] = 14000},
    [10418] = {["id"] = 10418, ["var"] = "chXiaohaoYbNum", ["varMax"] = 16000},
    [10419] = {["id"] = 10419, ["var"] = "chXiaohaoYbNum", ["varMax"] = 18000},
    [10420] = {["id"] = 10420, ["var"] = "chXiaohaoYbNum", ["varMax"] = 20000},
    [10421] = {["id"] = 10421, ["var"] = "chXiaohaoYbNum", ["varMax"] = 25000},
    [10422] = {["id"] = 10422, ["var"] = "chXiaohaoYbNum", ["varMax"] = 30000},
    [10423] = {["id"] = 10423, ["var"] = "chXiaohaoYbNum", ["varMax"] = 35000},
    [10424] = {["id"] = 10424, ["var"] = "chXiaohaoYbNum", ["varMax"] = 40000},
    [10425] = {["id"] = 10425, ["var"] = "chXiaohaoYbNum", ["varMax"] = 45000},
    [10426] = {["id"] = 10426, ["var"] = "chXiaohaoYbNum", ["varMax"] = 50000},
    [10427] = {["id"] = 10427, ["var"] = "chXiaohaoYbNum", ["varMax"] = 60000},
    [10428] = {["id"] = 10428, ["var"] = "chXiaohaoYbNum", ["varMax"] = 70000},
    [10429] = {["id"] = 10429, ["var"] = "chXiaohaoYbNum", ["varMax"] = 80000},
    [10450] = {["id"] = 10450, ["var"] = "zhaomuNum", ["varMax"] = 3},
    [10451] = {["id"] = 10451, ["var"] = "zhaomuNum", ["varMax"] = 5},
    [10452] = {["id"] = 10452, ["var"] = "zhaomuNum", ["varMax"] = 7},
    [10453] = {["id"] = 10453, ["var"] = "zhaomuNum", ["varMax"] = 9},
    [10454] = {["id"] = 10454, ["var"] = "zhaomuNum", ["varMax"] = 10},
    [10455] = {["id"] = 10455, ["var"] = "zhaomuNum", ["varMax"] = 11},
    [10456] = {["id"] = 10456, ["var"] = "zhaomuNum", ["varMax"] = 12},
    [10457] = {["id"] = 10457, ["var"] = "zhaomuNum", ["varMax"] = 13},
    [10458] = {["id"] = 10458, ["var"] = "zhaomuNum", ["varMax"] = 14},
    [10459] = {["id"] = 10459, ["var"] = "zhaomuNum", ["varMax"] = 15},
    [10460] = {["id"] = 10460, ["var"] = "zhaomuNum", ["varMax"] = 16},
    [10461] = {["id"] = 10461, ["var"] = "zhaomuNum", ["varMax"] = 17},
    [10462] = {["id"] = 10462, ["var"] = "zhaomuNum", ["varMax"] = 18},
    [10463] = {["id"] = 10463, ["var"] = "zhaomuNum", ["varMax"] = 19},
    [10464] = {["id"] = 10464, ["var"] = "zhaomuNum", ["varMax"] = 20},
    [10465] = {["id"] = 10465, ["var"] = "zhaomuNum", ["varMax"] = 21},
    [10466] = {["id"] = 10466, ["var"] = "zhaomuNum", ["varMax"] = 22},
    [10467] = {["id"] = 10467, ["var"] = "zhaomuNum", ["varMax"] = 23},
    [10468] = {["id"] = 10468, ["var"] = "zhaomuNum", ["varMax"] = 24},
    [10469] = {["id"] = 10469, ["var"] = "zhaomuNum", ["varMax"] = 25},
    [10500] = {["id"] = 10500},
    [10501] = {["id"] = 10501},
    [10502] = {["id"] = 10502},
    [10503] = {["id"] = 10503},
    [10504] = {["id"] = 10504},
    [10505] = {["id"] = 10505},
    [10506] = {["id"] = 10506},
    [10507] = {["id"] = 10507},
    [10508] = {["id"] = 10508},
    [10509] = {["id"] = 10509},
    [10510] = {["id"] = 10510},
    [10511] = {["id"] = 10511},
    [10550] = {["id"] = 10550},
    [10551] = {["id"] = 10551},
    [10552] = {["id"] = 10552},
    [10553] = {["id"] = 10553},
    [10554] = {["id"] = 10554},
    [10555] = {["id"] = 10555},
    [10556] = {["id"] = 10556},
    [10557] = {["id"] = 10557},
    [10558] = {["id"] = 10558},
    [10559] = {["id"] = 10559},
    [10560] = {["id"] = 10560},
    [10561] = {["id"] = 10561},
    [10600] = {["id"] = 10600, ["var"] = "FbxjNum", ["varMax"] = 10},
    [10601] = {["id"] = 10601, ["var"] = "FbxjNum", ["varMax"] = 20},
    [10602] = {["id"] = 10602, ["var"] = "FbxjNum", ["varMax"] = 30},
    [10603] = {["id"] = 10603, ["var"] = "FbxjNum", ["varMax"] = 40},
    [10604] = {["id"] = 10604, ["var"] = "FbxjNum", ["varMax"] = 60},
    [10605] = {["id"] = 10605, ["var"] = "FbxjNum", ["varMax"] = 80},
    [10606] = {["id"] = 10606, ["var"] = "FbxjNum", ["varMax"] = 100},
    [10607] = {["id"] = 10607, ["var"] = "FbxjNum", ["varMax"] = 120},
    [10608] = {["id"] = 10608, ["var"] = "FbxjNum", ["varMax"] = 140},
    [10609] = {["id"] = 10609, ["var"] = "FbxjNum", ["varMax"] = 160},
    [10610] = {["id"] = 10610, ["var"] = "FbxjNum", ["varMax"] = 180},
    [10611] = {["id"] = 10611, ["var"] = "FbxjNum", ["varMax"] = 200},
    [10612] = {["id"] = 10612, ["var"] = "FbxjNum", ["varMax"] = 240},
    [10613] = {["id"] = 10613, ["var"] = "FbxjNum", ["varMax"] = 280},
    [10614] = {["id"] = 10614, ["var"] = "FbxjNum", ["varMax"] = 320},
    [10615] = {["id"] = 10615, ["var"] = "FbxjNum", ["varMax"] = 360},
    [10616] = {["id"] = 10616, ["var"] = "FbxjNum", ["varMax"] = 400},
    [10617] = {["id"] = 10617, ["var"] = "FbxjNum", ["varMax"] = 440},
    [10618] = {["id"] = 10618, ["var"] = "FbxjNum", ["varMax"] = 480},
    [10619] = {["id"] = 10619, ["var"] = "FbxjNum", ["varMax"] = 520},
    [10620] = {["id"] = 10620, ["var"] = "FbxjNum", ["varMax"] = 560},
    [10621] = {["id"] = 10621, ["var"] = "FbxjNum", ["varMax"] = 600},
    [10622] = {["id"] = 10622, ["var"] = "FbxjNum", ["varMax"] = 640},
    [10623] = {["id"] = 10623, ["var"] = "FbxjNum", ["varMax"] = 680},
    [10624] = {["id"] = 10624, ["var"] = "FbxjNum", ["varMax"] = 720},
    [10650] = {["id"] = 10650, ["var"] = "addZsFlowerNum", ["varMax"] = 5},
    [10651] = {["id"] = 10651, ["var"] = "addZsFlowerNum", ["varMax"] = 10},
    [10652] = {["id"] = 10652, ["var"] = "addZsFlowerNum", ["varMax"] = 15},
    [10653] = {["id"] = 10653, ["var"] = "addZsFlowerNum", ["varMax"] = 20},
    [10654] = {["id"] = 10654, ["var"] = "addZsFlowerNum", ["varMax"] = 25},
    [10655] = {["id"] = 10655, ["var"] = "addZsFlowerNum", ["varMax"] = 30},
    [10656] = {["id"] = 10656, ["var"] = "addZsFlowerNum", ["varMax"] = 35},
    [10657] = {["id"] = 10657, ["var"] = "addZsFlowerNum", ["varMax"] = 40},
    [10658] = {["id"] = 10658, ["var"] = "addZsFlowerNum", ["varMax"] = 50},
    [10659] = {["id"] = 10659, ["var"] = "addZsFlowerNum", ["varMax"] = 60},
    [10660] = {["id"] = 10660, ["var"] = "addZsFlowerNum", ["varMax"] = 70},
    [10661] = {["id"] = 10661, ["var"] = "addZsFlowerNum", ["varMax"] = 80},
    [10662] = {["id"] = 10662, ["var"] = "addZsFlowerNum", ["varMax"] = 100},
    [10663] = {["id"] = 10663, ["var"] = "addZsFlowerNum", ["varMax"] = 120},
    [10664] = {["id"] = 10664, ["var"] = "addZsFlowerNum", ["varMax"] = 140},
    [10665] = {["id"] = 10665, ["var"] = "addZsFlowerNum", ["varMax"] = 160},
    [10666] = {["id"] = 10666, ["var"] = "addZsFlowerNum", ["varMax"] = 180},
    [10667] = {["id"] = 10667, ["var"] = "addZsFlowerNum", ["varMax"] = 200},
    [10668] = {["id"] = 10668, ["var"] = "addZsFlowerNum", ["varMax"] = 220},
    [10669] = {["id"] = 10669, ["var"] = "addZsFlowerNum", ["varMax"] = 240},
    [10670] = {["id"] = 10670, ["var"] = "addZsFlowerNum", ["varMax"] = 260},
    [10671] = {["id"] = 10671, ["var"] = "addZsFlowerNum", ["varMax"] = 280},
    [10672] = {["id"] = 10672, ["var"] = "addZsFlowerNum", ["varMax"] = 300},
    [10673] = {["id"] = 10673, ["var"] = "addZsFlowerNum", ["varMax"] = 340},
    [10674] = {["id"] = 10674, ["var"] = "addZsFlowerNum", ["varMax"] = 380},
    [10675] = {["id"] = 10675, ["var"] = "addZsFlowerNum", ["varMax"] = 420},
    [10676] = {["id"] = 10676, ["var"] = "addZsFlowerNum", ["varMax"] = 460},
    [10677] = {["id"] = 10677, ["var"] = "addZsFlowerNum", ["varMax"] = 500},
    [10678] = {["id"] = 10678, ["var"] = "addZsFlowerNum", ["varMax"] = 600},
    [20000] = {["id"] = 20000, ["var"] = "dayPtgkNum", ["varMax"] = 10},
    [20001] = {["id"] = 20001, ["var"] = "dayJygkNum", ["varMax"] = 5},
    [20002] = {["id"] = 20002, ["var"] = "dayXsrwNum", ["varMax"] = 5},
    [20003] = {["id"] = 20003, ["var"] = "dayPataNum", ["varMax"] = 1},
    [20004] = {["id"] = 20004, ["var"] = "dayZjfbNum", ["varMax"] = 3},
    [20005] = {["id"] = 20005, ["var"] = "dayBuyHpNum", ["varMax"] = 1},
    [20006] = {["id"] = 20006, ["var"] = "dayBuyMoneyNum", ["varMax"] = 1},
    [20007] = {["id"] = 20007, ["var"] = "dayBuyItemNum", ["varMax"] = 1},
    [20008] = {["id"] = 20008, ["var"] = "dayGdNum", ["varMax"] = 5},
    [20009] = {["id"] = 20009, ["var"] = "dayBjNum", ["varMax"] = 1},
    [20011] = {["id"] = 20011, ["var"] = "dayZbqhNum", ["varMax"] = 1},
    [20012] = {["id"] = 20012, ["var"] = "dayBshcNum", ["varMax"] = 1},
    [20013] = {["id"] = 20013, ["var"] = "dayLiaotianNum", ["varMax"] = 1},
    [20014] = {["id"] = 20014, ["var"] = "dayZfsjNum", ["varMax"] = 1},
    [20015] = {["id"] = 20015, ["var"] = "dayHfqhNum", ["varMax"] = 1},
    [20016] = {["id"] = 20016, ["var"] = "bossNum", ["varMax"] = 1},
    [20017] = {["id"] = 20017, ["var"] = "caikuangNum", ["varMax"] = 1},
    [20018] = {["id"] = 20018, ["var"] = "lvUpNum", ["varMax"] = 1},
    [35000] = {["id"] = 35000},
    [35001] = {["id"] = 35001},
    [35002] = {["id"] = 35002},
    [35003] = {["id"] = 35003, ["var"] = "zxJqFihgtNum", ["varMax"] = 1},
    [35004] = {["id"] = 35004},
    [35005] = {["id"] = 35005, ["var"] = "zxJqFihgtNum", ["varMax"] = 1},
    [35006] = {["id"] = 35006},
    [35007] = {["id"] = 35007, ["var"] = "zxJqFihgtNum", ["varMax"] = 1},
    [35008] = {["id"] = 35008},
    [35009] = {["id"] = 35009},
    [35010] = {["id"] = 35010, ["var"] = "zxFindNum", ["varMax"] = 1},
    [35011] = {["id"] = 35011},
    [35012] = {["id"] = 35012, ["var"] = "zxJqFihgtNum", ["varMax"] = 1},
    [35013] = {["id"] = 35013, ["var"] = "zxJqFihgtNum", ["varMax"] = 1},
    [35014] = {["id"] = 35014},
    [35015] = {["id"] = 35015},
    [35016] = {["id"] = 35016},
    [35017] = {["id"] = 35017},
    [35018] = {["id"] = 35018},
    [35019] = {["id"] = 35019},
    [35020] = {["id"] = 35020, ["var"] = "zxJqFihgtNum", ["varMax"] = 1},
    [35021] = {["id"] = 35021},
    [35022] = {["id"] = 35022},
    [35023] = {["id"] = 35023},
    [35024] = {["id"] = 35024},
    [35025] = {["id"] = 35025},
    [35026] = {["id"] = 35026},
    [35027] = {["id"] = 35027},
    [35028] = {["id"] = 35028},
    [35029] = {["id"] = 35029},
    [35030] = {["id"] = 35030},
    [35031] = {["id"] = 35031, ["var"] = "zxJqFihgtNum", ["varMax"] = 1},
    [35032] = {["id"] = 35032},
    [35033] = {["id"] = 35033, ["var"] = "zxJqFihgtNum", ["varMax"] = 1},
    [35034] = {["id"] = 35034, ["var"] = "zxJqFihgtNum", ["varMax"] = 1},
    [35035] = {["id"] = 35035},
    [35036] = {["id"] = 35036},
    [35037] = {["id"] = 35037},
    [35038] = {["id"] = 35038},
    [35039] = {["id"] = 35039},
    [35040] = {["id"] = 35040, ["var"] = "zxJqFihgtNum", ["varMax"] = 1},
    [35041] = {["id"] = 35041},
    [35042] = {["id"] = 35042, ["var"] = "zxJqFihgtNum", ["varMax"] = 1},
    [35043] = {["id"] = 35043},
    [35044] = {["id"] = 35044},
    [35045] = {["id"] = 35045},
    [35046] = {["id"] = 35046},
    [35047] = {["id"] = 35047},
    [35048] = {["id"] = 35048},
    [35049] = {["id"] = 35049},
    [35050] = {["id"] = 35050},
    [35051] = {["id"] = 35051, ["var"] = "zxJqFihgtNum", ["varMax"] = 1},
    [35052] = {["id"] = 35052},
    [35053] = {["id"] = 35053},
    [35054] = {["id"] = 35054},
    [35055] = {["id"] = 35055},
    [35056] = {["id"] = 35056},
    [37000] = {["id"] = 37000},
    [37001] = {["id"] = 37001},
    [37002] = {["id"] = 37002, ["var"] = "zxJqFihgtNum", ["varMax"] = 1},
    [37003] = {["id"] = 37003},
    [37004] = {["id"] = 37004},
    [37005] = {["id"] = 37005, ["var"] = "zxJqFihgtNum", ["varMax"] = 1},
    [37006] = {["id"] = 37006, ["var"] = "zxJqFihgtNum", ["varMax"] = 1},
    [37007] = {["id"] = 37007},
    [37008] = {["id"] = 37008},
    [37009] = {["id"] = 37009},
    [37010] = {["id"] = 37010},
    [37011] = {["id"] = 37011, ["var"] = "zxJqFihgtNum", ["varMax"] = 1},
    [37012] = {["id"] = 37012, ["var"] = "zxJqFihgtNum", ["varMax"] = 1},
    [37013] = {["id"] = 37013},
    [37014] = {["id"] = 37014},
    [37015] = {["id"] = 37015},
    [37016] = {["id"] = 37016, ["var"] = "zxJqFihgtNum", ["varMax"] = 1},
    [37017] = {["id"] = 37017},
    [37018] = {["id"] = 37018},
    [37019] = {["id"] = 37019, ["var"] = "zxJqFihgtNum", ["varMax"] = 1},
    [37020] = {["id"] = 37020},
    [37021] = {["id"] = 37021},
    [37022] = {["id"] = 37022},
    [37023] = {["id"] = 37023, ["var"] = "zxJqFihgtNum", ["varMax"] = 1},
    [37024] = {["id"] = 37024},
    [37025] = {["id"] = 37025},
    [37026] = {["id"] = 37026, ["var"] = "zxJqFihgtNum", ["varMax"] = 1},
    [37027] = {["id"] = 37027},
    [37028] = {["id"] = 37028},
    [37029] = {["id"] = 37029, ["var"] = "zxJqFihgtNum", ["varMax"] = 1},
    [37030] = {["id"] = 37030},
    [37031] = {["id"] = 37031},
    [37032] = {["id"] = 37032},
    [37033] = {["id"] = 37033},
    [37034] = {["id"] = 37034},
    [37035] = {["id"] = 37035},
    [37036] = {["id"] = 37036},
    [37037] = {["id"] = 37037},
    [37038] = {["id"] = 37038},
    [37039] = {["id"] = 37039},
    [37040] = {["id"] = 37040},
    [37041] = {["id"] = 37041},
    [37042] = {["id"] = 37042, ["var"] = "zxJqFihgtNum", ["varMax"] = 1},
    [37043] = {["id"] = 37043, ["var"] = "zxJqFihgtNum", ["varMax"] = 1},
    [37044] = {["id"] = 37044},
    [37045] = {["id"] = 37045},
    [37046] = {["id"] = 37046},
    [37047] = {["id"] = 37047, ["var"] = "zxJqFihgtNum", ["varMax"] = 1},
    [37048] = {["id"] = 37048, ["var"] = "zxJqFihgtNum", ["varMax"] = 1},
    [37049] = {["id"] = 37049},
    [37050] = {["id"] = 37050},
    [37051] = {["id"] = 37051},
    [37052] = {["id"] = 37052, ["var"] = "zxJqFihgtNum", ["varMax"] = 1},
    [37053] = {["id"] = 37053},
    [37054] = {["id"] = 37054, ["var"] = "zxJqFihgtNum", ["varMax"] = 1},
    [37055] = {["id"] = 37055},
    [37056] = {["id"] = 37056, ["var"] = "zxJqFihgtNum", ["varMax"] = 1},
    [37057] = {["id"] = 37057},
    [40000] = {["id"] = 40000},
    [40001] = {["id"] = 40001},
    [40002] = {["id"] = 40002},
    [40003] = {["id"] = 40003},
    [40004] = {["id"] = 40004},
    [40005] = {["id"] = 40005},
    [40006] = {["id"] = 40006},
    [40007] = {["id"] = 40007},
    [40008] = {["id"] = 40008, ["var"] = "PaTaNum", ["varMax"] = 1},
    [40009] = {["id"] = 40009},
    [40010] = {["id"] = 40010},
    [50000] = {["id"] = 50000, ["var"] = "dayZsFlowerNum", ["varMax"] = 1},
    [50001] = {["id"] = 50001, ["var"] = "dayPxjxNum", ["varMax"] = 5},
    [50002] = {["id"] = 50002, ["var"] = "dayPxdzNum", ["varMax"] = 5},
    [50003] = {["id"] = 50003, ["var"] = "dayQjyhNum", ["varMax"] = 1},
    [50004] = {["id"] = 50004, ["var"] = "dayQjyqNum", ["varMax"] = 1},
    [50005] = {["id"] = 50005, ["var"] = "dayZstlNum", ["varMax"] = 5},
    [50006] = {["id"] = 50006, ["var"] = "liaotianNum", ["varMax"] = 1},
    [50007] = {["id"] = 50007, ["var"] = "dayPxgmNum", ["varMax"] = 1},
    [50008] = {["id"] = 50008, ["var"] = "dayBfzyNum", ["varMax"] = 1},
    [90002] = {["id"] = 90002},
    [90009] = {["id"] = 90009},
    [90014] = {["id"] = 90014},
    [90050] = {["id"] = 90050},
    [90051] = {["id"] = 90051},
    [90052] = {["id"] = 90052},
    [90053] = {["id"] = 90053},
    [90100] = {["id"] = 90100},
    [90101] = {["id"] = 90101},
    [90102] = {["id"] = 90102},
    [100001] = {["id"] = 100001, ["var"] = "zhoukaNum", ["varMax"] = 1},
    [100002] = {["id"] = 100002, ["var"] = "yuekaNum", ["varMax"] = 1},
    [200001] = {["id"] = 200001},
    [200002] = {["id"] = 200002},
    [200003] = {["id"] = 200003},
    [200004] = {["id"] = 200004},
    [200005] = {["id"] = 200005},
    [200006] = {["id"] = 200006},
    [200007] = {["id"] = 200007}
}

return data