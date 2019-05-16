--
-- 官品定义表.csv
-- 官品编号 = id
-- 官品名称 = name
-- 男的 = maleName
-- 女的 = femaleName
-- 官品特权描述 = description
-- 官品人数限制 = numpeople
-- 考核方式 = examination
-- 战斗怪物组 = fight
-- 播放剧情ID = tale
-- 每次入围人数 = numup
-- 每次降品人数 = numdown
-- 报名时间类型 = timetype
-- 报名日期 = timedate
-- 报名时间点 = timepoint
-- 报名持续时间 = timelast
-- 报名玩家等级条件 = lvrestrict
-- 家园繁荣度条件 = boomrestrict
-- 派系影响力条件 = forcerestrict
-- 官品权利 = droit
-- 官品特赐掉落库 = droplargess
-- 所属官场 = officialdom
-- 家园产出加成 = homeeffect
-- 剧情对话ID = talkId

local data = {
    [1] = {["id"] = 1, ["name"] = "初窥门径", ["maleName"] = "新秀", ["femaleName"] = "新秀", ["description"] = 10048, ["examination"] = 1, ["fight"] = 401, ["tale"] = 1, ["numup"] = 0, ["numdown"] = 0, ["timetype"] = 1, ["lvrestrict"] = 12, ["boomrestrict"] = 0, ["droplargess"] = {78}, ["homeeffect"] = 0.05, ["talkId"] = 1},
    [2] = {["id"] = 2, ["name"] = "粗通皮毛", ["maleName"] = "侠者", ["femaleName"] = "侠女", ["description"] = 10049, ["examination"] = 1, ["fight"] = 402, ["tale"] = 1, ["numup"] = 0, ["numdown"] = 0, ["timetype"] = 1, ["lvrestrict"] = 14, ["boomrestrict"] = 200, ["droit"] = {8}, ["droplargess"] = {79}, ["homeeffect"] = 0.08, ["talkId"] = 1},
    [3] = {["id"] = 3, ["name"] = "略有小成", ["maleName"] = "忠勇大侠", ["femaleName"] = "忠勇大侠", ["description"] = 10050, ["examination"] = 1, ["fight"] = 403, ["tale"] = 1, ["numup"] = 0, ["numdown"] = 0, ["timetype"] = 1, ["lvrestrict"] = 16, ["boomrestrict"] = 300, ["droit"] = {8}, ["droplargess"] = {80}, ["homeeffect"] = 0.11, ["talkId"] = 1},
    [4] = {["id"] = 4, ["name"] = "登堂入室", ["maleName"] = "任勇豪侠", ["femaleName"] = "任勇豪侠", ["description"] = 10051, ["examination"] = 1, ["fight"] = 404, ["tale"] = 1, ["numup"] = 0, ["numdown"] = 0, ["timetype"] = 1, ["lvrestrict"] = 18, ["boomrestrict"] = 400, ["droit"] = {8, 9}, ["droplargess"] = {81}, ["homeeffect"] = 0.14, ["talkId"] = 1},
    [5] = {["id"] = 5, ["name"] = "崭露头角", ["maleName"] = "宣度大侠", ["femaleName"] = "宣度大侠", ["description"] = 10052, ["examination"] = 1, ["fight"] = 405, ["tale"] = 1, ["numup"] = 0, ["numdown"] = 0, ["timetype"] = 1, ["lvrestrict"] = 20, ["boomrestrict"] = 500, ["droit"] = {8, 9}, ["droplargess"] = {82}, ["homeeffect"] = 0.17, ["talkId"] = 1},
    [6] = {["id"] = 6, ["name"] = "鹤立鸡群", ["maleName"] = "宣节豪侠", ["femaleName"] = "宣节豪侠", ["description"] = 10053, ["examination"] = 1, ["fight"] = 406, ["tale"] = 1, ["numup"] = 0, ["numdown"] = 0, ["timetype"] = 1, ["lvrestrict"] = 22, ["boomrestrict"] = 600, ["droit"] = {8, 9}, ["droplargess"] = {83}, ["officialdom"] = 1, ["homeeffect"] = 0.2, ["talkId"] = 1},
    [7] = {["id"] = 7, ["name"] = "心领神会", ["maleName"] = "翊麾大侠", ["femaleName"] = "翊麾大侠", ["description"] = 10054, ["numpeople"] = 2000, ["examination"] = 2, ["tale"] = 1, ["numup"] = 200, ["numdown"] = 200, ["timetype"] = 2, ["timepoint"] = "9:00,10:00,12:00,14:00,18:00,19:00,21:00", ["timelast"] = 10, ["lvrestrict"] = 24, ["boomrestrict"] = 700, ["droit"] = {8, 9, 5}, ["droplargess"] = {84}, ["officialdom"] = 2, ["homeeffect"] = 0.23, ["talkId"] = 1},
    [8] = {["id"] = 8, ["name"] = "出类拔萃", ["maleName"] = "翊站豪侠", ["femaleName"] = "翊站豪侠", ["description"] = 10055, ["numpeople"] = 1500, ["examination"] = 2, ["tale"] = 1, ["numup"] = 150, ["numdown"] = 150, ["timetype"] = 2, ["timepoint"] = "9:30,10:30,12:30,18:30,19:30,21:30", ["timelast"] = 10, ["lvrestrict"] = 26, ["boomrestrict"] = 800, ["droit"] = {8, 9, 5, 4}, ["droplargess"] = {85}, ["officialdom"] = 3, ["homeeffect"] = 0.26, ["talkId"] = 1},
    [9] = {["id"] = 9, ["name"] = "炉火纯青", ["maleName"] = "昭武大侠", ["femaleName"] = "昭武大侠", ["description"] = 10056, ["numpeople"] = 1000, ["examination"] = 2, ["tale"] = 1, ["numup"] = 100, ["numdown"] = 100, ["timetype"] = 2, ["timepoint"] = "10:00,13:00,14:00,19:00,20:00,22:00", ["timelast"] = 10, ["lvrestrict"] = 28, ["boomrestrict"] = 1000, ["droit"] = {8, 9, 5, 6, 4}, ["droplargess"] = {86}, ["officialdom"] = 4, ["homeeffect"] = 0.29, ["talkId"] = 1},
    [10] = {["id"] = 10, ["name"] = "已有大成", ["maleName"] = "绝武豪侠", ["femaleName"] = "绝武豪侠", ["description"] = 10057, ["numpeople"] = 800, ["examination"] = 2, ["tale"] = 1, ["numup"] = 80, ["numdown"] = 80, ["timetype"] = 2, ["timepoint"] = "10:30,12:00,13:45,19:45,22:15", ["timelast"] = 10, ["lvrestrict"] = 30, ["boomrestrict"] = 1500, ["droit"] = {8, 9, 5, 6, 4}, ["droplargess"] = {87}, ["officialdom"] = 5, ["homeeffect"] = 0.32, ["talkId"] = 1},
    [11] = {["id"] = 11, ["name"] = "技冠群雄", ["maleName"] = "宁远大侠", ["femaleName"] = "宁远大侠", ["description"] = 10058, ["numpeople"] = 500, ["examination"] = 2, ["tale"] = 1, ["numup"] = 50, ["numdown"] = 50, ["timetype"] = 2, ["timepoint"] = "11:00,14:00,20:00,22:15", ["timelast"] = 10, ["lvrestrict"] = 32, ["boomrestrict"] = 2000, ["droit"] = {8, 9, 5, 6, 7, 4}, ["droplargess"] = {88}, ["officialdom"] = 6, ["homeeffect"] = 0.35, ["talkId"] = 1},
    [12] = {["id"] = 12, ["name"] = "神乎其技", ["maleName"] = "定远豪侠", ["femaleName"] = "定远豪侠", ["description"] = 10059, ["numpeople"] = 400, ["examination"] = 2, ["tale"] = 1, ["numup"] = 40, ["numdown"] = 40, ["timetype"] = 2, ["timepoint"] = "11:30,14:30,20:30", ["timelast"] = 10, ["lvrestrict"] = 34, ["boomrestrict"] = 2500, ["droit"] = {8, 9, 5, 6, 7, 4}, ["droplargess"] = {89}, ["officialdom"] = 7, ["homeeffect"] = 0.38, ["talkId"] = 1},
    [13] = {["id"] = 13, ["name"] = "所向披靡", ["maleName"] = "名威大侠", ["femaleName"] = "名威大侠", ["description"] = 10060, ["numpeople"] = 300, ["examination"] = 2, ["tale"] = 1, ["numup"] = 30, ["numdown"] = 30, ["timetype"] = 2, ["timepoint"] = "12:15,15:45,21:15", ["timelast"] = 10, ["lvrestrict"] = 36, ["boomrestrict"] = 3000, ["forcerestrict"] = 120000, ["droit"] = {8, 9, 5, 6, 7, 1, 4}, ["droplargess"] = {90}, ["officialdom"] = 8, ["homeeffect"] = 0.41, ["talkId"] = 1},
    [14] = {["id"] = 14, ["name"] = "登峰造极", ["maleName"] = "宣威豪侠", ["femaleName"] = "宣威豪侠", ["description"] = 10061, ["numpeople"] = 200, ["examination"] = 2, ["tale"] = 1, ["numup"] = 20, ["numdown"] = 20, ["timetype"] = 2, ["timepoint"] = "12:30,19:00", ["timelast"] = 10, ["lvrestrict"] = 38, ["boomrestrict"] = 3500, ["forcerestrict"] = 150000, ["droit"] = {8, 9, 5, 6, 7, 1, 4}, ["droplargess"] = {91}, ["officialdom"] = 9, ["homeeffect"] = 0.44, ["talkId"] = 1},
    [15] = {["id"] = 15, ["name"] = "傲视群雄", ["maleName"] = "云麾豪侠", ["femaleName"] = "云麾豪侠", ["description"] = 10062, ["numpeople"] = 100, ["examination"] = 2, ["tale"] = 1, ["numup"] = 10, ["numdown"] = 10, ["timetype"] = 2, ["timepoint"] = "11:00,15:00", ["timelast"] = 10, ["lvrestrict"] = 40, ["boomrestrict"] = 4000, ["forcerestrict"] = 180000, ["droit"] = {8, 9, 5, 6, 7, 1, 4}, ["droplargess"] = {92}, ["officialdom"] = 10, ["homeeffect"] = 0.47, ["talkId"] = 1},
    [16] = {["id"] = 16, ["name"] = "举世无双", ["maleName"] = "环化侠公", ["femaleName"] = "环化侠公", ["description"] = 10063, ["numpeople"] = 60, ["examination"] = 2, ["tale"] = 1, ["numup"] = 6, ["numdown"] = 6, ["timetype"] = 2, ["timepoint"] = "10:00,12:00", ["timelast"] = 10, ["lvrestrict"] = 42, ["boomrestrict"] = 4500, ["forcerestrict"] = 210000, ["droit"] = {8, 9, 5, 6, 7, 1, 4}, ["droplargess"] = {93}, ["officialdom"] = 11, ["homeeffect"] = 0.5, ["talkId"] = 1},
    [17] = {["id"] = 17, ["name"] = "一代宗师", ["maleName"] = "镇国侠宗", ["femaleName"] = "镇国侠宗", ["description"] = 10064, ["numpeople"] = 20, ["examination"] = 2, ["tale"] = 1, ["numup"] = 2, ["numdown"] = 2, ["timetype"] = 2, ["timepoint"] = "9:00,13:00", ["timelast"] = 10, ["lvrestrict"] = 44, ["boomrestrict"] = 5000, ["forcerestrict"] = 240000, ["droit"] = {8, 9, 5, 6, 7, 1, 4, 3}, ["droplargess"] = {94}, ["officialdom"] = 12, ["homeeffect"] = 0.53, ["talkId"] = 1},
    [18] = {["id"] = 18, ["name"] = "超凡入圣", ["maleName"] = "辅国侠尊", ["femaleName"] = "辅国侠尊", ["description"] = 10065, ["numpeople"] = 5, ["examination"] = 3, ["tale"] = 1, ["numup"] = 7, ["numdown"] = 0, ["timetype"] = 2, ["timepoint"] = "18:00", ["timelast"] = 10, ["lvrestrict"] = 46, ["boomrestrict"] = 5500, ["forcerestrict"] = 270000, ["droit"] = {8, 9, 5, 6, 7, 1, 4, 3}, ["droplargess"] = {95}, ["officialdom"] = 13, ["homeeffect"] = 0.56, ["talkId"] = 1},
    [19] = {["id"] = 19, ["name"] = "威震寰宇", ["maleName"] = "顺天侠圣", ["femaleName"] = "顺天侠圣", ["description"] = 10066, ["numpeople"] = 1, ["examination"] = 3, ["tale"] = 1, ["numup"] = 3, ["numdown"] = 0, ["timetype"] = 2, ["timepoint"] = "20:00", ["timelast"] = 10, ["lvrestrict"] = 48, ["boomrestrict"] = 6000, ["forcerestrict"] = 300000, ["droit"] = {8, 9, 5, 6, 7, 1, 4, 3}, ["droplargess"] = {96}, ["officialdom"] = 13, ["homeeffect"] = 0.59, ["talkId"] = 1}
}

return data