--
-- 传记副本表.csv
-- id = id
-- 武将ID = kind
-- 武将名称 = name
-- 武将形象ID = AnimatId
-- 怪物组ID = gkMonsterId
-- 章节的等级限制 = lvlimit
-- 后续关卡 = nextGuanka
-- 开启关卡 = openGuanka
-- 消耗体力 = epConsume
-- 经验奖励 = basExp
-- 银两奖励 = basMoney
-- 关卡掉落 = dropID
-- 关卡掉落数量 = dropNum

local data = {
    [1001] = {["id"] = 1001, ["kind"] = 1, ["name"] = "张碧君", ["AnimatId"] = 40028, ["gkMonsterId"] = 201, ["lvlimit"] = 16, ["nextGuanka"] = 1002, ["basMoney"] = 1530, ["dropID"] = {301, 311}, ["dropNum"] = {1, 0}},
    [1002] = {["id"] = 1002, ["kind"] = 1, ["name"] = "张碧君", ["AnimatId"] = 40028, ["gkMonsterId"] = 202, ["nextGuanka"] = 1003, ["basMoney"] = 1530, ["dropID"] = {301, 311}, ["dropNum"] = {1, 1}},
    [1003] = {["id"] = 1003, ["kind"] = 1, ["name"] = "张碧君", ["AnimatId"] = 40028, ["gkMonsterId"] = 203, ["nextGuanka"] = 1004, ["openGuanka"] = 2, ["basMoney"] = 1530, ["dropID"] = {301, 311}, ["dropNum"] = {1, 2}},
    [1004] = {["id"] = 1004, ["kind"] = 1, ["name"] = "张碧君", ["AnimatId"] = 40028, ["gkMonsterId"] = 204, ["nextGuanka"] = 1005, ["basMoney"] = 1530, ["dropID"] = {301, 311}, ["dropNum"] = {1, 3}},
    [1005] = {["id"] = 1005, ["kind"] = 1, ["name"] = "张碧君", ["AnimatId"] = 40028, ["gkMonsterId"] = 205, ["basMoney"] = 1530, ["dropID"] = {301, 311}, ["dropNum"] = {1, 4}},
    [2001] = {["id"] = 2001, ["kind"] = 2, ["name"] = "玄机散人", ["AnimatId"] = 40017, ["gkMonsterId"] = 206, ["lvlimit"] = 18, ["nextGuanka"] = 2002, ["basMoney"] = 1530, ["dropID"] = {302, 312}, ["dropNum"] = {1, 0}},
    [2002] = {["id"] = 2002, ["kind"] = 2, ["name"] = "玄机散人", ["AnimatId"] = 40017, ["gkMonsterId"] = 207, ["nextGuanka"] = 2003, ["basMoney"] = 1530, ["dropID"] = {302, 312}, ["dropNum"] = {1, 1}},
    [2003] = {["id"] = 2003, ["kind"] = 2, ["name"] = "玄机散人", ["AnimatId"] = 40017, ["gkMonsterId"] = 208, ["nextGuanka"] = 2004, ["openGuanka"] = 3, ["basMoney"] = 1530, ["dropID"] = {302, 312}, ["dropNum"] = {1, 2}},
    [2004] = {["id"] = 2004, ["kind"] = 2, ["name"] = "玄机散人", ["AnimatId"] = 40017, ["gkMonsterId"] = 209, ["nextGuanka"] = 2005, ["basMoney"] = 1530, ["dropID"] = {302, 312}, ["dropNum"] = {1, 3}},
    [2005] = {["id"] = 2005, ["kind"] = 2, ["name"] = "玄机散人", ["AnimatId"] = 40017, ["gkMonsterId"] = 210, ["basMoney"] = 1530, ["dropID"] = {302, 312}, ["dropNum"] = {1, 4}},
    [3001] = {["id"] = 3001, ["kind"] = 3, ["name"] = "逍遥", ["AnimatId"] = 40016, ["gkMonsterId"] = 211, ["lvlimit"] = 20, ["nextGuanka"] = 3002, ["basMoney"] = 1530, ["dropID"] = {303, 313}, ["dropNum"] = {1, 0}},
    [3002] = {["id"] = 3002, ["kind"] = 3, ["name"] = "逍遥", ["AnimatId"] = 40016, ["gkMonsterId"] = 212, ["nextGuanka"] = 3003, ["basMoney"] = 1530, ["dropID"] = {303, 313}, ["dropNum"] = {1, 1}},
    [3003] = {["id"] = 3003, ["kind"] = 3, ["name"] = "逍遥", ["AnimatId"] = 40016, ["gkMonsterId"] = 213, ["nextGuanka"] = 3004, ["openGuanka"] = 4, ["basMoney"] = 1530, ["dropID"] = {303, 313}, ["dropNum"] = {1, 2}},
    [3004] = {["id"] = 3004, ["kind"] = 3, ["name"] = "逍遥", ["AnimatId"] = 40016, ["gkMonsterId"] = 214, ["nextGuanka"] = 3005, ["basMoney"] = 1530, ["dropID"] = {303, 313}, ["dropNum"] = {1, 3}},
    [3005] = {["id"] = 3005, ["kind"] = 3, ["name"] = "逍遥", ["AnimatId"] = 40016, ["gkMonsterId"] = 215, ["basMoney"] = 1530, ["dropID"] = {303, 313}, ["dropNum"] = {1, 4}},
    [4001] = {["id"] = 4001, ["kind"] = 4, ["name"] = "穆云梳", ["AnimatId"] = 40015, ["gkMonsterId"] = 216, ["lvlimit"] = 22, ["nextGuanka"] = 4002, ["basMoney"] = 1530, ["dropID"] = {304, 314}, ["dropNum"] = {1, 0}},
    [4002] = {["id"] = 4002, ["kind"] = 4, ["name"] = "穆云梳", ["AnimatId"] = 40015, ["gkMonsterId"] = 217, ["nextGuanka"] = 4003, ["basMoney"] = 1530, ["dropID"] = {304, 314}, ["dropNum"] = {1, 1}},
    [4003] = {["id"] = 4003, ["kind"] = 4, ["name"] = "穆云梳", ["AnimatId"] = 40015, ["gkMonsterId"] = 218, ["nextGuanka"] = 4004, ["openGuanka"] = 5, ["basMoney"] = 1530, ["dropID"] = {304, 314}, ["dropNum"] = {1, 2}},
    [4004] = {["id"] = 4004, ["kind"] = 4, ["name"] = "穆云梳", ["AnimatId"] = 40015, ["gkMonsterId"] = 219, ["nextGuanka"] = 4005, ["basMoney"] = 1530, ["dropID"] = {304, 314}, ["dropNum"] = {1, 3}},
    [4005] = {["id"] = 4005, ["kind"] = 4, ["name"] = "穆云梳", ["AnimatId"] = 40015, ["gkMonsterId"] = 220, ["basMoney"] = 1530, ["dropID"] = {304, 314}, ["dropNum"] = {1, 4}},
    [5001] = {["id"] = 5001, ["kind"] = 5, ["name"] = "武照", ["AnimatId"] = 40014, ["gkMonsterId"] = 221, ["lvlimit"] = 24, ["nextGuanka"] = 5002, ["basMoney"] = 1530, ["dropID"] = {305, 315}, ["dropNum"] = {1, 0}},
    [5002] = {["id"] = 5002, ["kind"] = 5, ["name"] = "武照", ["AnimatId"] = 40014, ["gkMonsterId"] = 222, ["nextGuanka"] = 5003, ["basMoney"] = 1530, ["dropID"] = {305, 315}, ["dropNum"] = {1, 1}},
    [5003] = {["id"] = 5003, ["kind"] = 5, ["name"] = "武照", ["AnimatId"] = 40014, ["gkMonsterId"] = 223, ["nextGuanka"] = 5004, ["openGuanka"] = 6, ["basMoney"] = 1530, ["dropID"] = {305, 315}, ["dropNum"] = {1, 2}},
    [5004] = {["id"] = 5004, ["kind"] = 5, ["name"] = "武照", ["AnimatId"] = 40014, ["gkMonsterId"] = 224, ["nextGuanka"] = 5005, ["basMoney"] = 1530, ["dropID"] = {305, 315}, ["dropNum"] = {1, 3}},
    [5005] = {["id"] = 5005, ["kind"] = 5, ["name"] = "武照", ["AnimatId"] = 40014, ["gkMonsterId"] = 225, ["basMoney"] = 1530, ["dropID"] = {305, 315}, ["dropNum"] = {1, 4}},
    [6001] = {["id"] = 6001, ["kind"] = 6, ["name"] = "胡不归", ["AnimatId"] = 40013, ["gkMonsterId"] = 226, ["lvlimit"] = 26, ["nextGuanka"] = 6002, ["basMoney"] = 1530, ["dropID"] = {306, 316}, ["dropNum"] = {1, 0}},
    [6002] = {["id"] = 6002, ["kind"] = 6, ["name"] = "胡不归", ["AnimatId"] = 40013, ["gkMonsterId"] = 227, ["nextGuanka"] = 6003, ["basMoney"] = 1530, ["dropID"] = {306, 316}, ["dropNum"] = {1, 1}},
    [6003] = {["id"] = 6003, ["kind"] = 6, ["name"] = "胡不归", ["AnimatId"] = 40013, ["gkMonsterId"] = 228, ["nextGuanka"] = 6004, ["openGuanka"] = 7, ["basMoney"] = 1530, ["dropID"] = {306, 316}, ["dropNum"] = {1, 2}},
    [6004] = {["id"] = 6004, ["kind"] = 6, ["name"] = "胡不归", ["AnimatId"] = 40013, ["gkMonsterId"] = 229, ["nextGuanka"] = 6005, ["basMoney"] = 1530, ["dropID"] = {306, 316}, ["dropNum"] = {1, 3}},
    [6005] = {["id"] = 6005, ["kind"] = 6, ["name"] = "胡不归", ["AnimatId"] = 40013, ["gkMonsterId"] = 230, ["basMoney"] = 1530, ["dropID"] = {306, 316}, ["dropNum"] = {1, 4}},
    [7001] = {["id"] = 7001, ["kind"] = 7, ["name"] = "窦夫人", ["AnimatId"] = 40012, ["gkMonsterId"] = 231, ["lvlimit"] = 28, ["nextGuanka"] = 7002, ["basMoney"] = 1530, ["dropID"] = {307, 317}, ["dropNum"] = {1, 0}},
    [7002] = {["id"] = 7002, ["kind"] = 7, ["name"] = "窦夫人", ["AnimatId"] = 40012, ["gkMonsterId"] = 232, ["nextGuanka"] = 7003, ["basMoney"] = 1530, ["dropID"] = {307, 317}, ["dropNum"] = {1, 1}},
    [7003] = {["id"] = 7003, ["kind"] = 7, ["name"] = "窦夫人", ["AnimatId"] = 40012, ["gkMonsterId"] = 233, ["nextGuanka"] = 7004, ["openGuanka"] = 8, ["basMoney"] = 1530, ["dropID"] = {307, 317}, ["dropNum"] = {1, 2}},
    [7004] = {["id"] = 7004, ["kind"] = 7, ["name"] = "窦夫人", ["AnimatId"] = 40012, ["gkMonsterId"] = 234, ["nextGuanka"] = 7005, ["basMoney"] = 1530, ["dropID"] = {307, 317}, ["dropNum"] = {1, 3}},
    [7005] = {["id"] = 7005, ["kind"] = 7, ["name"] = "窦夫人", ["AnimatId"] = 40012, ["gkMonsterId"] = 235, ["basMoney"] = 1530, ["dropID"] = {307, 317}, ["dropNum"] = {1, 4}},
    [8001] = {["id"] = 8001, ["kind"] = 8, ["name"] = "姬重华", ["AnimatId"] = 40006, ["gkMonsterId"] = 236, ["lvlimit"] = 30, ["nextGuanka"] = 8002, ["basMoney"] = 1530, ["dropID"] = {308, 318}, ["dropNum"] = {1, 0}},
    [8002] = {["id"] = 8002, ["kind"] = 8, ["name"] = "姬重华", ["AnimatId"] = 40006, ["gkMonsterId"] = 237, ["nextGuanka"] = 8003, ["basMoney"] = 1530, ["dropID"] = {308, 318}, ["dropNum"] = {1, 1}},
    [8003] = {["id"] = 8003, ["kind"] = 8, ["name"] = "姬重华", ["AnimatId"] = 40006, ["gkMonsterId"] = 238, ["nextGuanka"] = 8004, ["openGuanka"] = 9, ["basMoney"] = 1530, ["dropID"] = {308, 318}, ["dropNum"] = {1, 2}},
    [8004] = {["id"] = 8004, ["kind"] = 8, ["name"] = "姬重华", ["AnimatId"] = 40006, ["gkMonsterId"] = 239, ["nextGuanka"] = 8005, ["basMoney"] = 1530, ["dropID"] = {308, 318}, ["dropNum"] = {1, 3}},
    [8005] = {["id"] = 8005, ["kind"] = 8, ["name"] = "姬重华", ["AnimatId"] = 40006, ["gkMonsterId"] = 240, ["basMoney"] = 1530, ["dropID"] = {308, 318}, ["dropNum"] = {1, 4}},
    [9001] = {["id"] = 9001, ["kind"] = 9, ["name"] = "公子尘来", ["AnimatId"] = 40010, ["gkMonsterId"] = 241, ["lvlimit"] = 32, ["nextGuanka"] = 9002, ["basMoney"] = 1530, ["dropID"] = {309, 319}, ["dropNum"] = {1, 0}},
    [9002] = {["id"] = 9002, ["kind"] = 9, ["name"] = "公子尘来", ["AnimatId"] = 40010, ["gkMonsterId"] = 242, ["nextGuanka"] = 9003, ["basMoney"] = 1530, ["dropID"] = {309, 319}, ["dropNum"] = {1, 1}},
    [9003] = {["id"] = 9003, ["kind"] = 9, ["name"] = "公子尘来", ["AnimatId"] = 40010, ["gkMonsterId"] = 243, ["nextGuanka"] = 9004, ["basMoney"] = 1530, ["dropID"] = {309, 319}, ["dropNum"] = {1, 2}},
    [9004] = {["id"] = 9004, ["kind"] = 9, ["name"] = "公子尘来", ["AnimatId"] = 40010, ["gkMonsterId"] = 244, ["nextGuanka"] = 9005, ["basMoney"] = 1530, ["dropID"] = {309, 319}, ["dropNum"] = {1, 3}},
    [9005] = {["id"] = 9005, ["kind"] = 9, ["name"] = "公子尘来", ["AnimatId"] = 40010, ["gkMonsterId"] = 245, ["basMoney"] = 1530, ["dropID"] = {309, 319}, ["dropNum"] = {1, 4}}
}

return data