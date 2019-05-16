--
-- 称号表.csv
-- 称号id = nicknameid
-- 称号名称 = nickname
-- 获取方式 = gain
-- 获取条件 = nicknamedescribe
-- 图片id = pictureid
-- 称号属性增幅 = nicknameabilityup
-- 属性值 = attributeup

local data = {
    [10000] = {["nicknameid"] = 10000, ["nickname"] = "小有财名", ["gain"] = 1, ["nicknamedescribe"] = "成为1级贵族", ["pictureid"] = "chenghao_vip1", ["nicknameabilityup"] = {10045, 10046, 10047, 10048}, ["attributeup"] = {1, 1, 1, 1}},
    [10001] = {["nicknameid"] = 10001, ["nickname"] = "财大气粗", ["gain"] = 1, ["nicknamedescribe"] = "成为2级贵族", ["pictureid"] = "chenghao_vip2", ["nicknameabilityup"] = {10045, 10046, 10047, 10048}, ["attributeup"] = {1, 1, 1, 1}},
    [10002] = {["nicknameid"] = 10002, ["nickname"] = "腰缠万贯", ["gain"] = 1, ["nicknamedescribe"] = "成为3级贵族", ["pictureid"] = "chenghao_vip3", ["nicknameabilityup"] = {10045, 10046, 10047, 10048}, ["attributeup"] = {1, 1, 1, 1}},
    [10003] = {["nicknameid"] = 10003, ["nickname"] = "富甲一方", ["gain"] = 1, ["nicknamedescribe"] = "成为4级贵族", ["pictureid"] = "chenghao_vip4", ["nicknameabilityup"] = {10045, 10046, 10047, 10048}, ["attributeup"] = {1, 1, 1, 1}},
    [10004] = {["nicknameid"] = 10004, ["nickname"] = "朱门绣户", ["gain"] = 1, ["nicknamedescribe"] = "成为5级贵族", ["pictureid"] = "chenghao_vip5", ["nicknameabilityup"] = {10045, 10046, 10047, 10048}, ["attributeup"] = {1, 1, 1, 1}},
    [10005] = {["nicknameid"] = 10005, ["nickname"] = "堆金积玉", ["gain"] = 1, ["nicknamedescribe"] = "成为6级贵族", ["pictureid"] = "chenghao_vip6", ["nicknameabilityup"] = {10045, 10046, 10047, 10048}, ["attributeup"] = {1, 1, 1, 1}},
    [10006] = {["nicknameid"] = 10006, ["nickname"] = "一掷千金", ["gain"] = 1, ["nicknamedescribe"] = "成为7级贵族", ["pictureid"] = "chenghao_vip7", ["nicknameabilityup"] = {10045, 10046, 10047, 10048}, ["attributeup"] = {1, 1, 1, 1}},
    [10007] = {["nicknameid"] = 10007, ["nickname"] = "金玉满堂", ["gain"] = 1, ["nicknamedescribe"] = "成为8级贵族", ["pictureid"] = "chenghao_vip8", ["nicknameabilityup"] = {10045, 10046, 10047, 10048}, ["attributeup"] = {1, 1, 1, 1}},
    [10008] = {["nicknameid"] = 10008, ["nickname"] = "挥金如土", ["gain"] = 1, ["nicknamedescribe"] = "成为9级贵族", ["nicknameabilityup"] = {10045, 10046, 10047, 10048}, ["attributeup"] = {1, 1, 1, 1}},
    [10009] = {["nicknameid"] = 10009, ["nickname"] = "富贵逼人", ["gain"] = 1, ["nicknamedescribe"] = "成为10级贵族", ["nicknameabilityup"] = {10045, 10046, 10047, 10048}, ["attributeup"] = {1, 1, 1, 1}},
    [10010] = {["nicknameid"] = 10010, ["nickname"] = "钟鸣鼎食", ["gain"] = 1, ["nicknamedescribe"] = "成为11级贵族", ["nicknameabilityup"] = {10045, 10046, 10047, 10048}, ["attributeup"] = {1, 1, 1, 1}},
    [10011] = {["nicknameid"] = 10011, ["nickname"] = "富甲天下", ["gain"] = 1, ["nicknamedescribe"] = "成为12级贵族", ["nicknameabilityup"] = {10045, 10046, 10047, 10048}, ["attributeup"] = {1, 1, 1, 1}},
    [10012] = {["nicknameid"] = 10012, ["nickname"] = "陶朱之富", ["gain"] = 1, ["nicknamedescribe"] = "成为13级贵族", ["pictureid"] = "chenghao_vip13", ["nicknameabilityup"] = {10045, 10046, 10047, 10048}, ["attributeup"] = {1, 1, 1, 1}},
    [10013] = {["nicknameid"] = 10013, ["nickname"] = "富埒陶白", ["gain"] = 1, ["nicknamedescribe"] = "成为14级贵族", ["pictureid"] = "chenghao_vip14", ["nicknameabilityup"] = {10045, 10046, 10047, 10048}, ["attributeup"] = {1, 1, 1, 1}},
    [10014] = {["nicknameid"] = 10014, ["nickname"] = "千里荣华", ["gain"] = 1, ["nicknamedescribe"] = "成为15级贵族", ["pictureid"] = "chenghao_vip15", ["nicknameabilityup"] = {10045, 10046, 10047, 10048}, ["attributeup"] = {1, 1, 1, 1}},
    [15000] = {["nicknameid"] = 15000, ["nickname"] = "万人之上", ["gain"] = 2, ["nicknamedescribe"] = "官至极品", ["pictureid"] = "chenghao_jipin", ["nicknameabilityup"] = {10045, 10046, 10047, 10048}, ["attributeup"] = {1, 1, 1, 1}},
    [15001] = {["nicknameid"] = 15001, ["nickname"] = "位极人臣", ["gain"] = 2, ["nicknamedescribe"] = "官至正一品", ["nicknameabilityup"] = {10045, 10046, 10047, 10048}, ["attributeup"] = {1, 1, 1, 1}},
    [15002] = {["nicknameid"] = 15002, ["nickname"] = "国士无双", ["gain"] = 2, ["nicknamedescribe"] = "官至从一品", ["nicknameabilityup"] = {10045, 10046, 10047, 10048}, ["attributeup"] = {1, 1, 1, 1}},
    [15003] = {["nicknameid"] = 15003, ["nickname"] = "风华绝代", ["gain"] = 2, ["nicknamedescribe"] = "官至正二品", ["nicknameabilityup"] = {10045, 10046, 10047, 10048}, ["attributeup"] = {1, 1, 1, 1}},
    [15004] = {["nicknameid"] = 15004, ["nickname"] = "怀瑾握瑜", ["gain"] = 2, ["nicknamedescribe"] = "官至从二品", ["nicknameabilityup"] = {10045, 10046, 10047, 10048}, ["attributeup"] = {1, 1, 1, 1}},
    [15005] = {["nicknameid"] = 15005, ["nickname"] = "栋梁之才", ["gain"] = 2, ["nicknamedescribe"] = "官至正三品", ["nicknameabilityup"] = {10045, 10046, 10047, 10048}, ["attributeup"] = {1, 1, 1, 1}},
    [15006] = {["nicknameid"] = 15006, ["nickname"] = "文能书史", ["gain"] = 2, ["nicknamedescribe"] = "官至从三品", ["nicknameabilityup"] = {10045, 10046, 10047, 10048}, ["attributeup"] = {1, 1, 1, 1}},
    [15007] = {["nicknameid"] = 15007, ["nickname"] = "头角峥嵘", ["gain"] = 2, ["nicknamedescribe"] = "官至正四品", ["nicknameabilityup"] = {10045, 10046, 10047, 10048}, ["attributeup"] = {1, 1, 1, 1}},
    [15008] = {["nicknameid"] = 15008, ["nickname"] = "韬光养晦", ["gain"] = 2, ["nicknamedescribe"] = "官至从四品", ["nicknameabilityup"] = {10045, 10046, 10047, 10048}, ["attributeup"] = {1, 1, 1, 1}},
    [15009] = {["nicknameid"] = 15009, ["nickname"] = "殚见洽闻", ["gain"] = 2, ["nicknamedescribe"] = "官至正五品", ["nicknameabilityup"] = {10045, 10046, 10047, 10048}, ["attributeup"] = {1, 1, 1, 1}},
    [15010] = {["nicknameid"] = 15010, ["nickname"] = "满腹锦绣", ["gain"] = 2, ["nicknamedescribe"] = "官至从五品", ["nicknameabilityup"] = {10045, 10046, 10047, 10048}, ["attributeup"] = {1, 1, 1, 1}},
    [15011] = {["nicknameid"] = 15011, ["nickname"] = "矜能负才", ["gain"] = 2, ["nicknamedescribe"] = "官至正六品", ["nicknameabilityup"] = {10045, 10046, 10047, 10048}, ["attributeup"] = {1, 1, 1, 1}},
    [15012] = {["nicknameid"] = 15012, ["nickname"] = "文采风流", ["gain"] = 2, ["nicknamedescribe"] = "官至从六品", ["nicknameabilityup"] = {10045, 10046, 10047, 10048}, ["attributeup"] = {1, 1, 1, 1}},
    [15013] = {["nicknameid"] = 15013, ["nickname"] = "才华横溢", ["gain"] = 2, ["nicknamedescribe"] = "官至正七品", ["nicknameabilityup"] = {10045, 10046, 10047, 10048}, ["attributeup"] = {1, 1, 1, 1}},
    [15014] = {["nicknameid"] = 15014, ["nickname"] = "百卉含英", ["gain"] = 2, ["nicknamedescribe"] = "官至从七品", ["nicknameabilityup"] = {10045, 10046, 10047, 10048}, ["attributeup"] = {1, 1, 1, 1}},
    [15015] = {["nicknameid"] = 15015, ["nickname"] = "经明行修", ["gain"] = 2, ["nicknamedescribe"] = "官至正八品", ["nicknameabilityup"] = {10045, 10046, 10047, 10048}, ["attributeup"] = {1, 1, 1, 1}},
    [15016] = {["nicknameid"] = 15016, ["nickname"] = "才高八斗", ["gain"] = 2, ["nicknamedescribe"] = "官至从八品", ["nicknameabilityup"] = {10045, 10046, 10047, 10048}, ["attributeup"] = {1, 1, 1, 1}},
    [15017] = {["nicknameid"] = 15017, ["nickname"] = "博学多才", ["gain"] = 2, ["nicknamedescribe"] = "官至正九品", ["nicknameabilityup"] = {10045, 10046, 10047, 10048}, ["attributeup"] = {1, 1, 1, 1}},
    [15018] = {["nicknameid"] = 15018, ["nickname"] = "下笔成文", ["gain"] = 2, ["nicknamedescribe"] = "官至从九品", ["nicknameabilityup"] = {10045, 10046, 10047, 10048}, ["attributeup"] = {1, 1, 1, 1}}
}

return data