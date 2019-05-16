--
-- 对话表.csv
-- 编号 = id
-- 对话内容 = talk
-- 对话人物 = char
-- 对话人物名称 = name
-- 正在说话任务 = talking
-- 下个对话 = next
-- 人物站位 = stance
-- 位置偏移值 = dpos
-- 配音ID = dub
-- 场景 = sense

local data = {
    [9999] = {["id"] = 9999, ["talk"] = "老奴给小主请安，小主来到这里想必是想了解一下娴妃娘娘吧，老奴是娴妃娘娘的乳母随娘娘一同入王府进皇宫，小主若想报答娘娘知遇之恩，那就随老奴前来，听老奴给您慢慢讲述。", ["name"] = "旁白", ["talking"] = -1, ["next"] = {10000}},
    [10000] = {["id"] = 10000, ["talk"] = "不知大总管一早前来可是王爷有话要带给侧福晋？", ["char"] = {1000, 1001}, ["name"] = "阿箬", ["talking"] = -1, ["next"] = {10000}, ["stance"] = {1, 2}, ["dpos"] = {0, 0}, ["dub"] = 10000, ["sense"] = 10000},
    [10001] = {["id"] = 10001, ["talk"] = "劳烦阿箬姑娘前去通报一下侧福晋，老奴前来给侧福晋问安。", ["char"] = {1000, 1001}, ["name"] = "王府总管", ["talking"] = -1, ["next"] = {10000}, ["stance"] = {1, 2}, ["dpos"] = {0, 0}, ["dub"] = 10000, ["sense"] = 10000},
    [10002] = {["id"] = 10002, ["talk"] = "阿箬，快请总管进来。", ["char"] = {1000, 1001}, ["name"] = "青缨", ["talking"] = -1, ["next"] = {10000}, ["stance"] = {1, 2}, ["dpos"] = {0, 0}, ["dub"] = 10000, ["sense"] = 10000},
    [10003] = {["id"] = 10003, ["talk"] = "老奴给侧福晋请安，王爷专程命老奴将府中机灵懂事的丫鬟挑选出来送到侧福晋房中。", ["char"] = {1000, 1001}, ["name"] = "王府总管", ["talking"] = -1, ["next"] = {10000}, ["stance"] = {1, 2}, ["dpos"] = {0, 0}, ["dub"] = 10000, ["sense"] = 10000},
    [10004] = {["id"] = 10004, ["talk"] = "辛苦总管了，樱儿初入王府以后府中的大小事务还都要劳烦总管您。", ["char"] = {1000, 1001}, ["name"] = "青缨", ["talking"] = -1, ["next"] = {10000}, ["stance"] = {1, 2}, ["dpos"] = {0, 0}, ["dub"] = 10000, ["sense"] = 10000},
    [10005] = {["id"] = 10005, ["talk"] = "侧福晋言重了，这是老奴应尽的本份。", ["char"] = {1000, 1001}, ["name"] = "王府总管", ["talking"] = -1, ["next"] = {10000}, ["stance"] = {1, 2}, ["dpos"] = {0, 0}, ["dub"] = 10000, ["sense"] = 10000}
}

return data