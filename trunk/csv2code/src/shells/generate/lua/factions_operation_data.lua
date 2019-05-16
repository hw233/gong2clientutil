--
-- 高手操作表.csv
-- 操作编号 = id
-- 操作类型 = type
-- 玩法类型 = playtype
-- 操作名称 = name
-- 说明 = instruction
-- 操作友好度限制 = limitA
-- 操作派系影响力限制 = limitB
-- 操作派系职位限制 = limitC
-- 操作家园繁荣度限制 = limitD
-- 是否能对己方派系使用 0可以 /1不可以 = limitE
-- 消耗资源类型 = costtype
-- 消耗资源数值 = costnum
-- 增加友好度 = upnum
-- 降低所属方友好度 = downnum
-- 概率类型（1概率2公式） = chancetype
-- 成功概率/公式ID = chancenum
-- 操作奖励 = award
-- 掉落次数 = awardnum
-- 每日操作次数 = number
-- 拜谒倒计时 = meettime
-- 拜谒响应人数限制 = meetlimit
-- 拜谒条件说明 = meetinstruction

local data = {
    [1] = {["id"] = 1, ["type"] = 1, ["playtype"] = 1, ["name"] = "歌功颂德", ["instruction"] = "提升我方与高手的友好度", ["limitE"] = 0, ["costtype"] = {10011, 10000}, ["costnum"] = {1, 1000}, ["upnum"] = 130, ["chancetype"] = 1, ["chancenum"] = 1, ["award"] = {21}, ["awardnum"] = {5}},
    [2] = {["id"] = 2, ["type"] = 1, ["playtype"] = 1, ["name"] = "赠送礼物", ["instruction"] = "提升我方与高手的友好度", ["limitE"] = 0, ["costtype"] = {10011, 10001}, ["costnum"] = {1, 100}, ["upnum"] = 570, ["chancetype"] = 1, ["chancenum"] = 1, ["award"] = {21}, ["awardnum"] = {10}},
    [3] = {["id"] = 3, ["type"] = 2, ["playtype"] = 1, ["name"] = "雅致小宴", ["instruction"] = "提升我方与高手的友好度，削弱高手与所属势力的友好度", ["limitD"] = 5000, ["limitE"] = 0, ["costtype"] = {10011, 10000}, ["costnum"] = {1, 1000}, ["upnum"] = 1000, ["chancetype"] = 1, ["chancenum"] = 1, ["award"] = {21}, ["awardnum"] = {5}},
    [4] = {["id"] = 4, ["type"] = 2, ["playtype"] = 1, ["name"] = "广邀好友", ["instruction"] = "提升我方与高手的友好度，削弱高手与所属势力的友好度", ["limitD"] = 20000, ["limitE"] = 0, ["costtype"] = {10011, 10001}, ["costnum"] = {1, 100}, ["upnum"] = 520, ["downnum"] = 520, ["chancetype"] = 1, ["chancenum"] = 1, ["award"] = {21}, ["awardnum"] = {10}},
    [5] = {["id"] = 5, ["type"] = 3, ["playtype"] = 1, ["name"] = "聊天", ["instruction"] = "提升我方与高手的友好度", ["limitE"] = 1, ["costtype"] = {10011, 10000}, ["costnum"] = {1, 1000}, ["upnum"] = 75, ["downnum"] = 75, ["chancetype"] = 1, ["chancenum"] = 1, ["award"] = {21}, ["awardnum"] = {5}},
    [6] = {["id"] = 6, ["type"] = 3, ["playtype"] = 1, ["name"] = "打听消息", ["instruction"] = "提升我方与高手的友好度", ["limitE"] = 1, ["costtype"] = {10011, 10001}, ["costnum"] = {1, 100}, ["upnum"] = 300, ["downnum"] = 300, ["chancetype"] = 1, ["chancenum"] = 1, ["award"] = {21}, ["awardnum"] = {10}},
    [7] = {["id"] = 7, ["type"] = 4, ["playtype"] = 1, ["name"] = "诚心拜请", ["instruction"] = "以派系的名义可以与高手提升大量的友好度", ["limitA"] = 5000, ["limitB"] = 10000, ["limitC"] = {1, 2}, ["limitE"] = 0, ["costtype"] = {10011, 10000}, ["costnum"] = {1, 1000}, ["upnum"] = 2000, ["chancetype"] = 1, ["chancenum"] = 1, ["award"] = {21}, ["awardnum"] = {5}, ["number"] = 5},
    [8] = {["id"] = 8, ["type"] = 4, ["playtype"] = 1, ["name"] = "针对", ["instruction"] = "以派系的名义可以与高手提升大量的友好度", ["limitA"] = 5000, ["limitB"] = 10000, ["limitC"] = {1, 2}, ["limitE"] = 1, ["costtype"] = {10011, 10001}, ["costnum"] = {1, 100}, ["upnum"] = 1100, ["downnum"] = 1100, ["chancetype"] = 1, ["chancenum"] = 1, ["award"] = {21}, ["awardnum"] = {10}, ["number"] = 5},
    [9] = {["id"] = 9, ["type"] = 5, ["playtype"] = 2, ["name"] = "亲善", ["instruction"] = "组织派系成员集体参与，提高与高手的友好度", ["limitC"] = {1, 2}, ["limitE"] = 0, ["costtype"] = {10011, 10000}, ["costnum"] = {1, 1000}, ["upnum"] = 5000, ["chancetype"] = 1, ["chancenum"] = 1, ["number"] = 2, ["meettime"] = 360, ["meetlimit"] = 10, ["meetinstruction"] = "1.响应人数>=10人，才能开始拜谒。/n2.拜谒成功率由响应人数和官品级别影响"},
    [10] = {["id"] = 10, ["type"] = 5, ["playtype"] = 2, ["name"] = "竞争", ["instruction"] = "组织派系成员集体参与，提高与高手的友好度", ["limitC"] = {1, 2}, ["limitE"] = 1, ["costtype"] = {10011, 10001}, ["costnum"] = {1, 100}, ["upnum"] = 2700, ["downnum"] = 2700, ["chancetype"] = 1, ["chancenum"] = 1, ["number"] = 2, ["meettime"] = 360, ["meetlimit"] = 30, ["meetinstruction"] = "1.响应人数>=30人，才能开始拜谒。/n2.拜谒成功率由响应人数和官品级别影响"}
}

return data