--
-- NPC对话表.csv
-- id = id
-- 对话组ID = groupId
-- 对话顺序 = order
-- 说话者 1npc2玩家自己3其他NPC = talker
-- 其他NPC形象 = image
-- 对话内容 = talking

local data = {
    [1] = {["id"] = 1, ["groupId"] = 1, ["order"] = 1, ["talker"] = 1, ["talking"] = "你是猪吗？"},
    [2] = {["id"] = 2, ["groupId"] = 1, ["order"] = 2, ["talker"] = 2, ["talking"] = "你才是猪"},
    [3] = {["id"] = 3, ["groupId"] = 1, ["order"] = 3, ["talker"] = 1, ["talking"] = "你全家是猪"},
    [4] = {["id"] = 4, ["groupId"] = 1, ["order"] = 4, ["talker"] = 3, ["image"] = 1111, ["talking"] = "你们打一架吧"}
}

return data