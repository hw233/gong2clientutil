--
-- 派系任务表.csv
-- 编号 = id
-- 名称 = name
-- 任务描述 = describe
-- 引用任务ID = task
-- 完成奖励 = award
-- 派系活跃度 = vitality
-- 开启建筑等级 = buildingLV
-- 跳转ID = skip

local data = {
    [1] = {["id"] = 1, ["name"] = "赠送鲜花", ["describe"] = "赠送鲜花给好友1次", ["task"] = 50000, ["award"] = {38, 39, 40, 41, 42, 43}, ["vitality"] = 20, ["buildingLV"] = 1, ["skip"] = 1008},
    [2] = {["id"] = 2, ["name"] = "派系捐献", ["describe"] = "派系捐献5次", ["task"] = 50001, ["award"] = {38, 39, 40, 41, 42, 43}, ["vitality"] = 20, ["buildingLV"] = 1, ["skip"] = 1115},
    [3] = {["id"] = 3, ["name"] = "派系挑战", ["describe"] = "派系挑战5次", ["task"] = 50002, ["award"] = {38, 39, 40, 41, 42, 43}, ["vitality"] = 20, ["buildingLV"] = 1, ["skip"] = 1116},
    [4] = {["id"] = 4, ["name"] = "高手友好", ["describe"] = "与高手友好1次", ["task"] = 50003, ["award"] = {38, 39, 40, 41, 42, 43}, ["vitality"] = 20, ["buildingLV"] = 1, ["skip"] = 1117},
    [5] = {["id"] = 5, ["name"] = "高手宴请", ["describe"] = "与高手宴请1次", ["task"] = 50004, ["award"] = {38, 39, 40, 41, 42, 43}, ["vitality"] = 20, ["buildingLV"] = 1, ["skip"] = 1117},
    [6] = {["id"] = 6, ["name"] = "赠送体力", ["describe"] = "赠送好友体力5次", ["task"] = 50005, ["award"] = {38, 39, 40, 41, 42, 43}, ["vitality"] = 20, ["buildingLV"] = 1, ["skip"] = 1007},
    [7] = {["id"] = 7, ["name"] = "世界聊天", ["describe"] = "世界聊天1次", ["task"] = 50006, ["award"] = {38, 39, 40, 41, 42, 43}, ["vitality"] = 20, ["buildingLV"] = 1, ["skip"] = 0},
    [8] = {["id"] = 8, ["name"] = "派系购买", ["describe"] = "派系商店购买1次", ["task"] = 50007, ["award"] = {38, 39, 40, 41, 42, 43}, ["vitality"] = 20, ["buildingLV"] = 1, ["skip"] = 1118},
    [9] = {["id"] = 9, ["name"] = "拜访好友庄园", ["describe"] = "拜访好友庄园1次", ["task"] = 50008, ["award"] = {38, 39, 40, 41, 42, 43}, ["vitality"] = 20, ["buildingLV"] = 1, ["skip"] = 1007}
}

return data