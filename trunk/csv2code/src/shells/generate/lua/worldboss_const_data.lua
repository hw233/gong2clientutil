--
-- 世界boss常量表.csv

local data = {
    ["AUTOMATICATTACK_VIP_LEVEL"] = 2, -- 自动攻击开启vip等级
    ["ATTACK_INTERVAL"] = {30, 30, 30}, -- 每次攻击时间间隔
    ["ENCOURAGING_COST_YINZI"] = 10000, -- 银子鼓舞消耗
    ["ENCOURAGING_INTERVAL_YINZI"] = 30, -- 银子鼓舞时间间隔
    ["ENCOURAGING_SUCCESS_DEMAGE"] = 0.05, -- 鼓舞提升伤害百分比
    ["WORLDBOSS_LEVEL"] = 5, -- 世界boss初始等级
    ["YINZI_RANK"] = 51, -- 银子奖励排名
    ["FUHUO_CD"] = 5, -- 复活时间间隔
    ["FIGHT_REWARD_NUMBER"] = 20, -- 战斗奖励次数
    ["FIGHT_DAMAGE_RANK_TUISONG"] = 10, -- boss伤害前多少名推送
    ["FIGHT_DAMAGE_QIANHOUTUISONG"] = 100, -- 伤害推送前后多少名
    ["FIGHT_LEVELUP_WORLDBOSS"] = {1200, 600, 300, 100, 0}, -- boss升级击杀时间1
    ["WORLDBOSS_INCREASE"] = {-10, -5, -2, 3, 5} -- 世界boss每次增加等级
}

return data