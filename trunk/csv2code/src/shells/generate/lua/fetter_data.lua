--
-- 羁绊表.csv
-- 编号 = id
-- 武将id = servant_id
-- 羁绊关系 = fetter
-- 属性提升 = attribute
-- 提升属性 = attribute_up
-- 羁绊描述 = fetter_describe

local data = {
    [40000] = {["id"] = 40000, ["servant_id"] = 40000, ["fetter"] = {40014}, ["attribute"] = {10055, 10056, 10057, 10058}, ["attribute_up"] = {0.035, 0.025, 0.025, 0.045}, ["fetter_describe"] = "日月明空"},
    [40001] = {["id"] = 40001, ["servant_id"] = 40001, ["fetter"] = {40000}, ["attribute"] = {10055, 10056, 10057, 10058}, ["attribute_up"] = {0.055, 0.03, 0.03, 0.01}, ["fetter_describe"] = "虚舟难覆"},
    [40005] = {["id"] = 40005, ["servant_id"] = 40005, ["fetter"] = {40022}, ["attribute"] = {10055, 10056, 10057, 10058}, ["attribute_up"] = {0.075, 0.01, 0.01, 0.01}, ["fetter_describe"] = "向风靡然"},
    [40006] = {["id"] = 40006, ["servant_id"] = 40006, ["fetter"] = {40009}, ["attribute"] = {10055, 10056, 10057, 10058}, ["attribute_up"] = {0.06, 0.01, 0.01, 0.03}, ["fetter_describe"] = "芝兰之交"},
    [40008] = {["id"] = 40008, ["servant_id"] = 40008, ["fetter"] = {40021}, ["attribute"] = {10055, 10056, 10057, 10058}, ["attribute_up"] = {0.01, 0.05, 0.05, 0.075}, ["fetter_describe"] = "丹心不易"},
    [40009] = {["id"] = 40009, ["servant_id"] = 40009, ["fetter"] = {40025}, ["attribute"] = {10055, 10056, 10057, 10058}, ["attribute_up"] = {0.03, 0.03, 0.03, 0.045}, ["fetter_describe"] = "妙手仁心"},
    [40010] = {["id"] = 40010, ["servant_id"] = 40010, ["fetter"] = {40015}, ["attribute"] = {10055, 10056, 10057, 10058}, ["attribute_up"] = {0.035, 0.025, 0.025, 0.045}, ["fetter_describe"] = "血浓于水"},
    [40011] = {["id"] = 40011, ["servant_id"] = 40011, ["fetter"] = {40016}, ["attribute"] = {10055, 10056, 10057, 10058}, ["attribute_up"] = {0.055, 0.03, 0.03, 0.01}, ["fetter_describe"] = "柔情侠骨"},
    [40012] = {["id"] = 40012, ["servant_id"] = 40012, ["fetter"] = {40001}, ["attribute"] = {10055, 10056, 10057, 10058}, ["attribute_up"] = {0.035, 0.025, 0.025, 0.045}, ["fetter_describe"] = "天道循环"},
    [40013] = {["id"] = 40013, ["servant_id"] = 40013, ["fetter"] = {40009}, ["attribute"] = {10055, 10056, 10057, 10058}, ["attribute_up"] = {0.055, 0.03, 0.03, 0.01}, ["fetter_describe"] = "桃李争妍"},
    [40014] = {["id"] = 40014, ["servant_id"] = 40014, ["fetter"] = {40026}, ["attribute"] = {10055, 10056, 10057, 10058}, ["attribute_up"] = {0.01, 0.05, 0.05, 0.075}, ["fetter_describe"] = "唇齿相依"},
    [40015] = {["id"] = 40015, ["servant_id"] = 40015, ["fetter"] = {40010}, ["attribute"] = {10055, 10056, 10057, 10058}, ["attribute_up"] = {0.03, 0.03, 0.03, 0.045}, ["fetter_describe"] = "舐犊情深"},
    [40016] = {["id"] = 40016, ["servant_id"] = 40016, ["fetter"] = {40008}, ["attribute"] = {10055, 10056, 10057, 10058}, ["attribute_up"] = {0.06, 0.01, 0.01, 0.03}, ["fetter_describe"] = "江湖相忘"},
    [40017] = {["id"] = 40017, ["servant_id"] = 40017, ["fetter"] = {40023}, ["attribute"] = {10055, 10056, 10057, 10058}, ["attribute_up"] = {0.055, 0.03, 0.03, 0.01}, ["fetter_describe"] = "朝花夕拾"},
    [40018] = {["id"] = 40018, ["servant_id"] = 40018, ["fetter"] = {40019}, ["attribute"] = {10055, 10056, 10057, 10058}, ["attribute_up"] = {0.035, 0.025, 0.025, 0.045}, ["fetter_describe"] = "祸水红颜"},
    [40019] = {["id"] = 40019, ["servant_id"] = 40019, ["fetter"] = {40018}, ["attribute"] = {10055, 10056, 10057, 10058}, ["attribute_up"] = {0.055, 0.03, 0.03, 0.01}, ["fetter_describe"] = "姐妹情深"},
    [40020] = {["id"] = 40020, ["servant_id"] = 40020, ["fetter"] = {40036}, ["attribute"] = {10055, 10056, 10057, 10058}, ["attribute_up"] = {0.01, 0.05, 0.05, 0.075}, ["fetter_describe"] = "想望风采"},
    [40021] = {["id"] = 40021, ["servant_id"] = 40021, ["fetter"] = {40020}, ["attribute"] = {10055, 10056, 10057, 10058}, ["attribute_up"] = {0.03, 0.03, 0.03, 0.045}, ["fetter_describe"] = "赤子心肠"},
    [40022] = {["id"] = 40022, ["servant_id"] = 40022, ["fetter"] = {40023}, ["attribute"] = {10055, 10056, 10057, 10058}, ["attribute_up"] = {0.06, 0.01, 0.01, 0.03}, ["fetter_describe"] = "笑谈春秋"},
    [40023] = {["id"] = 40023, ["servant_id"] = 40023, ["fetter"] = {40028}, ["attribute"] = {10055, 10056, 10057, 10058}, ["attribute_up"] = {0.075, 0.01, 0.01, 0.01}, ["fetter_describe"] = "算无遗策"},
    [40025] = {["id"] = 40025, ["servant_id"] = 40025, ["fetter"] = {40036}, ["attribute"] = {10055, 10056, 10057, 10058}, ["attribute_up"] = {0.01, 0.05, 0.05, 0.075}, ["fetter_describe"] = "清风高谊"},
    [40026] = {["id"] = 40026, ["servant_id"] = 40026, ["fetter"] = {40014}, ["attribute"] = {10055, 10056, 10057, 10058}, ["attribute_up"] = {0.075, 0.01, 0.01, 0.01}, ["fetter_describe"] = "风雨同舟"},
    [40028] = {["id"] = 40028, ["servant_id"] = 40028, ["fetter"] = {40013}, ["attribute"] = {10055, 10056, 10057, 10058}, ["attribute_up"] = {0.055, 0.03, 0.03, 0.01}, ["fetter_describe"] = "塞上江南"},
    [40029] = {["id"] = 40029, ["servant_id"] = 40029, ["fetter"] = {40016}, ["attribute"] = {10055, 10056, 10057, 10058}, ["attribute_up"] = {0.01, 0.05, 0.05, 0.075}, ["fetter_describe"] = "山长水阔"},
    [40030] = {["id"] = 40030, ["servant_id"] = 40030, ["fetter"] = {40011}, ["attribute"] = {10055, 10056, 10057, 10058}, ["attribute_up"] = {0.035, 0.025, 0.025, 0.045}, ["fetter_describe"] = "江湖夜雨"},
    [40032] = {["id"] = 40032, ["servant_id"] = 40032, ["fetter"] = {40011}, ["attribute"] = {10055, 10056, 10057, 10058}, ["attribute_up"] = {0.06, 0.01, 0.01, 0.03}, ["fetter_describe"] = "同气连枝"},
    [40033] = {["id"] = 40033, ["servant_id"] = 40033, ["fetter"] = {40029}, ["attribute"] = {10055, 10056, 10057, 10058}, ["attribute_up"] = {0.06, 0.01, 0.01, 0.03}, ["fetter_describe"] = "平生豪举"},
    [40036] = {["id"] = 40036, ["servant_id"] = 40036, ["fetter"] = {40017}, ["attribute"] = {10055, 10056, 10057, 10058}, ["attribute_up"] = {0.075, 0.01, 0.01, 0.01}, ["fetter_describe"] = "倾盖如故"}
}

return data