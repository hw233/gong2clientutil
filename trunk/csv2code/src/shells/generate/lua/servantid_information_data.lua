--
-- 武将介绍表.csv
-- 编号 = id
-- 武将id = servantid
-- 武将名称 = servantname
-- 简介内容 = information

local data = {
    [10000] = {["id"] = 10000, ["servantid"] = 40000, ["servantname"] = "姬长生", ["information"] = "昆仑之主，￥武功超凡入圣。"},
    [10001] = {["id"] = 10001, ["servantid"] = 40001, ["servantname"] = "长雍君", ["information"] = "天鹤山上最为神秘之人，￥听闻其料事如神，￥能观星象变幻，￥预知未来。"},
    [10002] = {["id"] = 10002, ["servantid"] = 40002, ["servantname"] = "闻仲", ["information"] = "敬请期待"},
    [10003] = {["id"] = 10003, ["servantid"] = 40003, ["servantname"] = "李耳", ["information"] = "敬请期待"},
    [10004] = {["id"] = 10004, ["servantid"] = 40004, ["servantname"] = "李青莲", ["information"] = "十步杀一人，千里不留行。￥青莲剑起，歌起长平。"},
    [10005] = {["id"] = 10005, ["servantid"] = 40005, ["servantname"] = "卡萨", ["information"] = "江湖上四大刺客之一。￥行事诡异，神秘莫测。"},
    [10006] = {["id"] = 10006, ["servantid"] = 40006, ["servantname"] = "姬重华", ["information"] = "折梅山庄庄主重华。￥嚣张霸道，性烈如火，￥平生最烦有人称道其容貌，￥却因美貌著称于金陵之中。"},
    [10007] = {["id"] = 10007, ["servantid"] = 40007, ["servantname"] = "安倍晴明", ["information"] = "敬请期待"},
    [10008] = {["id"] = 10008, ["servantid"] = 40008, ["servantname"] = "承影", ["information"] = "南府暗卫之首，￥武功高绝，性格冷淡，沉默寡言。￥传闻江湖中曾有一位令人闻风丧胆也名唤‘承影’，￥不知二者之间有何关联……"},
    [10009] = {["id"] = 10009, ["servantid"] = 40009, ["servantname"] = "霍曼曼", ["information"] = "名门霍家之女，￥高贵典雅，优雅大方。￥七弦琴起，高山流水，不过如是。"},
    [10010] = {["id"] = 10010, ["servantid"] = 40010, ["servantname"] = "公子尘来", ["information"] = "天鹤山二公子，公子尘来。￥性格沉稳果决，隐隐有问鼎下届武林之势。"},
    [10011] = {["id"] = 10011, ["servantid"] = 40011, ["servantname"] = "南歌", ["information"] = "敬请期待"},
    [10012] = {["id"] = 10012, ["servantid"] = 40012, ["servantname"] = "窦夫人", ["information"] = "曾经名满金陵的才女，￥性格温和又具有才气。￥善棋，曾布下珍珑棋局"},
    [10013] = {["id"] = 10013, ["servantid"] = 40013, ["servantname"] = "胡不归", ["information"] = "名门胡家之旁系女，￥温柔小意，妩媚多情。￥一曲箜篌，天下无双。"},
    [10014] = {["id"] = 10014, ["servantid"] = 40014, ["servantname"] = "武照", ["information"] = "江湖上有名的散客，无门无派，￥不知从何处来，也不知从何处去，￥可谓是江湖上最神秘之人之一。"},
    [10015] = {["id"] = 10015, ["servantid"] = 40015, ["servantname"] = "穆云梳", ["information"] = "江湖名门之女，￥十五年前以美貌名动金陵。￥善画技，传其牡丹图可引百蝶环绕。"},
    [10016] = {["id"] = 10016, ["servantid"] = 40016, ["servantname"] = "逍遥", ["information"] = "江湖上有名的剑客，￥无门无派，剑术极为高超。￥喜好饮酒，经常出没在有好酒的地方。"},
    [10017] = {["id"] = 10017, ["servantid"] = 40017, ["servantname"] = "玄机散人", ["information"] = "名满金陵的才女，￥性格淡薄，厌恶世人愚昧，￥故而出家为女冠。￥于文采一道上颇有成就。"},
    [10018] = {["id"] = 10018, ["servantid"] = 40018, ["servantname"] = "合德", ["information"] = "敬请期待"},
    [10019] = {["id"] = 10019, ["servantid"] = 40019, ["servantname"] = "飞燕", ["information"] = "敬请期待"},
    [10020] = {["id"] = 10020, ["servantid"] = 40020, ["servantname"] = "洗砚", ["information"] = "书童洗砚。￥聪明伶俐，￥于书画一道上颇有天赋。"},
    [10021] = {["id"] = 10021, ["servantid"] = 40021, ["servantname"] = "青湖", ["information"] = "南府大小姐的贴身婢女。￥聪明伶俐，天真可爱。￥只是似乎有一种神秘力量，￥她说的不好的话都会成真……"},
    [10022] = {["id"] = 10022, ["servantid"] = 40022, ["servantname"] = "艳客", ["information"] = "敬请期待"},
    [10023] = {["id"] = 10023, ["servantid"] = 40023, ["servantname"] = "离原", ["information"] = "江苏最大的丝商，￥行止有度，翩翩君子。"},
    [10024] = {["id"] = 10024, ["servantid"] = 40024, ["servantname"] = "姬燕来", ["information"] = "昆仑少主，￥从未出现在江湖之上，￥江湖上却有他的传说。"},
    [10025] = {["id"] = 10025, ["servantid"] = 40025, ["servantname"] = "药王", ["information"] = "天下第一杏林圣手。￥杏林一道，无人可及。"},
    [10026] = {["id"] = 10026, ["servantid"] = 40026, ["servantname"] = "杜浪", ["information"] = "江湖上默默无名的剑客。￥似是来自一个神秘的组织。￥经常出现在出人意料的地方。￥不过这种平平无奇的人出现在哪里也不奇怪吧。"},
    [10027] = {["id"] = 10027, ["servantid"] = 40027, ["servantname"] = "柳如是", ["information"] = "敬请期待"},
    [10028] = {["id"] = 10028, ["servantid"] = 40028, ["servantname"] = "张碧君", ["information"] = "金陵中颇有才名之人，￥关于他的传闻猜测从未停止。￥只是他本人似乎并不在意。"},
    [10029] = {["id"] = 10029, ["servantid"] = 40029, ["servantname"] = "燕小青", ["information"] = "敬请期待"},
    [10030] = {["id"] = 10030, ["servantid"] = 40030, ["servantname"] = "要离", ["information"] = "敬请期待"},
    [10031] = {["id"] = 10031, ["servantid"] = 40031, ["servantname"] = "荆轲", ["information"] = "敬请期待"},
    [10032] = {["id"] = 10032, ["servantid"] = 40032, ["servantname"] = "南鹤", ["information"] = "敬请期待"},
    [10033] = {["id"] = 10033, ["servantid"] = 40033, ["servantname"] = "狄青剑", ["information"] = "敬请期待"},
    [10034] = {["id"] = 10034, ["servantid"] = 40034, ["servantname"] = "公孙大娘", ["information"] = "敬请期待"},
    [10035] = {["id"] = 10035, ["servantid"] = 40035, ["servantname"] = "张江陵", ["information"] = "敬请期待"},
    [10036] = {["id"] = 10036, ["servantid"] = 40036, ["servantname"] = "杜少陵", ["information"] = "金陵中颇有才名之人，￥只是不知为何弃官入川，￥令人惋惜。"},
    [20000] = {["id"] = 20000, ["servantid"] = 40018, ["servantname"] = "柳氏", ["information"] = "南府主母，￥南鹤之妻。"},
    [20001] = {["id"] = 20001, ["servantid"] = 40024, ["servantname"] = "雁北归", ["information"] = "雪夜所救的神秘男子。"},
    [20002] = {["id"] = 20002, ["servantid"] = 40001, ["servantname"] = "华服男子", ["information"] = "出现在雪夜之中的神秘男子"},
    [20003] = {["id"] = 20003, ["servantid"] = 40010, ["servantname"] = "玄衣男子", ["information"] = "出现在雪夜之中的玄衣男子。"},
    [20004] = {["id"] = 20004, ["servantid"] = 40028, ["servantname"] = "王管事", ["information"] = "南府管家，￥忠心可靠。"},
    [20005] = {["id"] = 20005, ["servantid"] = 40024, ["servantname"] = "濒死之人", ["information"] = "雪夜所救的神秘男子。"},
    [20006] = {["id"] = 20006, ["servantid"] = 40024, ["servantname"] = "颜北归", ["information"] = "雪夜所救的神秘男子。"},
    [20007] = {["id"] = 20007, ["servantid"] = 40029, ["servantname"] = "无名杀手", ["information"] = "出现在来去寺的神秘杀手，￥不知道是何人所派。"},
    [20008] = {["id"] = 20008, ["servantid"] = 40005, ["servantname"] = "诡异马夫", ["information"] = "这马夫的眼神令人背后一寒。"},
    [20009] = {["id"] = 20009, ["servantid"] = 40014, ["servantname"] = "北斗", ["information"] = "观星台侍卫长，￥武功高深莫测，￥诸星之首，￥谓之‘北斗’。"}
}

return data