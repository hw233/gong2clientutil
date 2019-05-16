--
-- 技能数据表.csv
-- 法宝编号 = id
-- 法宝名称 = skillname
-- 技能ICON = skillicon
-- 使用条件 = skillCond
-- 攻击范围 = skillRange
-- 技能效果 = skillEffect
-- 技能效果1 = skillEffect1
-- 自身效果 = oneEffect
-- 技能消耗 = skillConsume
-- 技能类型 = fbKind
-- 技能属性 = jnKind
-- 获得怒气 = addCp
-- 需要怒气 = conCp
-- 类型 = type
-- 战斗CD = fightCd
-- 法宝战力 = fbZl

local data = {
    [1] = {["id"] = 1, ["skillname"] = "天下为棋", ["fbKind"] = 3, ["jnKind"] = 1, ["addCp"] = 20, ["conCp"] = 0, ["fightCd"] = 0},
    [2] = {["id"] = 2, ["skillname"] = "唯我独尊", ["fbKind"] = 1, ["jnKind"] = 1, ["addCp"] = 100, ["conCp"] = 100, ["fightCd"] = 0},
    [3] = {["id"] = 3, ["skillname"] = "小太监", ["fbKind"] = 3, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 0, ["fightCd"] = 0},
    [4] = {["id"] = 4, ["skillname"] = "小太监", ["fbKind"] = 1, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 100, ["fightCd"] = 0},
    [5] = {["id"] = 5, ["skillname"] = "太监总管", ["fbKind"] = 3, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 0, ["fightCd"] = 0},
    [6] = {["id"] = 6, ["skillname"] = "太监总管", ["fbKind"] = 1, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 100, ["fightCd"] = 0},
    [7] = {["id"] = 7, ["skillname"] = "小宫女", ["fbKind"] = 3, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 0, ["fightCd"] = 0},
    [8] = {["id"] = 8, ["skillname"] = "小宫女", ["fbKind"] = 1, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 100, ["fightCd"] = 0},
    [9] = {["id"] = 9, ["skillname"] = "宫女总管", ["fbKind"] = 3, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 0, ["fightCd"] = 0},
    [10] = {["id"] = 10, ["skillname"] = "宫女总管", ["fbKind"] = 1, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 100, ["fightCd"] = 0},
    [11] = {["id"] = 11, ["skillname"] = "高级嬷嬷", ["fbKind"] = 3, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 0, ["fightCd"] = 0},
    [12] = {["id"] = 12, ["skillname"] = "高级嬷嬷", ["fbKind"] = 1, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 100, ["fightCd"] = 0},
    [13] = {["id"] = 13, ["skillname"] = "总管侍卫", ["fbKind"] = 3, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 0, ["fightCd"] = 0},
    [14] = {["id"] = 14, ["skillname"] = "总管侍卫", ["fbKind"] = 1, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 100, ["fightCd"] = 0},
    [15] = {["id"] = 15, ["skillname"] = "高等武将", ["fbKind"] = 3, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 0, ["fightCd"] = 0},
    [16] = {["id"] = 16, ["skillname"] = "高等武将", ["fbKind"] = 1, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 100, ["fightCd"] = 0},
    [17] = {["id"] = 17, ["skillname"] = "高等贵妇", ["fbKind"] = 3, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 0, ["fightCd"] = 0},
    [18] = {["id"] = 18, ["skillname"] = "高等贵妇", ["fbKind"] = 1, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 100, ["fightCd"] = 0},
    [19] = {["id"] = 19, ["skillname"] = "青年文官", ["fbKind"] = 3, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 0, ["fightCd"] = 0},
    [20] = {["id"] = 20, ["skillname"] = "青年文官", ["fbKind"] = 1, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 100, ["fightCd"] = 0},
    [21] = {["id"] = 21, ["skillname"] = "老年文官", ["fbKind"] = 3, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 0, ["fightCd"] = 0},
    [22] = {["id"] = 22, ["skillname"] = "老年文官", ["fbKind"] = 1, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 100, ["fightCd"] = 0},
    [23] = {["id"] = 23, ["skillname"] = "皇子", ["fbKind"] = 3, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 0},
    [24] = {["id"] = 24, ["skillname"] = "皇子", ["fbKind"] = 1, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 100},
    [25] = {["id"] = 25, ["skillname"] = "少年", ["fbKind"] = 3, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 0},
    [26] = {["id"] = 26, ["skillname"] = "少年", ["fbKind"] = 1, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 100},
    [27] = {["id"] = 27, ["skillname"] = "少女", ["fbKind"] = 3, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 0},
    [28] = {["id"] = 28, ["skillname"] = "少女", ["fbKind"] = 1, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 100},
    [29] = {["id"] = 29, ["skillname"] = "侠客", ["fbKind"] = 3, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 0},
    [30] = {["id"] = 30, ["skillname"] = "侠客", ["fbKind"] = 1, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 100},
    [35001] = {["id"] = 35001, ["skillname"] = "北射天狼", ["skillicon"] = 35002, ["skillEffect"] = "西北望，射天狼。姬长生拉弓快速疾射，对敌方全体造成38%的物理伤害，且此次暴击率额外提高30%", ["fbKind"] = 3, ["jnKind"] = 0, ["addCp"] = 40, ["conCp"] = 0, ["fightCd"] = 0},
    [35002] = {["id"] = 35002, ["skillname"] = "天命所归", ["skillicon"] = 35003, ["skillEffect"] = "炎图如日永，赫赫照华夷。天子召唤真龙对所有敌人造成173%的法术伤害，且此次攻击暴击率额外提高30%", ["fbKind"] = 1, ["jnKind"] = 0, ["addCp"] = 40, ["conCp"] = 100, ["fightCd"] = 0},
    [35003] = {["id"] = 35003, ["skillname"] = "撼世", ["skillicon"] = 35004, ["skillEffect"] = "放之四海而皆准。长雍驱使阴阳鱼化作流光，对怒气最高的三个敌人造成41%的法术伤害，并有20%的概率降低目标2点怒气。", ["fbKind"] = 3, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 0, ["fightCd"] = 0},
    [35004] = {["id"] = 35004, ["skillname"] = "瞻前顾后", ["skillicon"] = 35005, ["skillEffect"] = "天地一阴阳。长雍念出密咒强化阴阳鱼，对怒气最高的三个敌人造成130%的物理伤害，并有50%的概率降低目标2点怒气，且我方全体闪避率提高10%，持续两回合。", ["fbKind"] = 1, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 100, ["fightCd"] = 0},
    [35005] = {["id"] = 35005, ["skillname"] = "任达不拘", ["skillicon"] = 35002, ["skillEffect"] = "愿将腰下剑，直为斩楼兰。李白挥剑将剑气袭向敌人，对前排的敌人造成56%的物理伤害", ["fbKind"] = 3, ["jnKind"] = 0, ["addCp"] = 40, ["conCp"] = 0, ["fightCd"] = 0},
    [35006] = {["id"] = 35006, ["skillname"] = "横行天下", ["skillicon"] = 35003, ["skillEffect"] = "三尺长剑提在手, 白发一样杀强贼。漫天剑雨攻击敌方全体，对所有敌人造成127%的物理伤害，本次攻击的暴击率提高40%，且敌人受伤害增加10%，持续两回合", ["fbKind"] = 1, ["jnKind"] = 0, ["addCp"] = 40, ["conCp"] = 100, ["fightCd"] = 0},
    [35007] = {["id"] = 35007, ["skillname"] = "横枪跃马", ["skillicon"] = 35004, ["skillEffect"] = "镫青一电瞬，寒星动有芒。卡萨投掷匕首对后排单个敌人造成48%的法术伤害", ["fbKind"] = 3, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 0, ["fightCd"] = 0},
    [35008] = {["id"] = 35008, ["skillname"] = "雷霆万钧", ["skillicon"] = 35005, ["skillEffect"] = "从来幽并客，皆共尘沙老。卡萨跃至敌方身后，对其造成165%的法术伤害，并有50%的概率眩晕目标一回合，若目标血量低于60%则造成400%的伤害，并眩晕目标一回合。", ["fbKind"] = 1, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 100, ["fightCd"] = 0},
    [35009] = {["id"] = 35009, ["skillname"] = "醉斩楼兰", ["skillicon"] = 35000, ["skillEffect"] = "一剑霜寒十四州。承影直指敌方，对前排敌方造成56%的物理伤害", ["fbKind"] = 3, ["jnKind"] = 0, ["addCp"] = 40, ["conCp"] = 0, ["fightCd"] = 0},
    [35010] = {["id"] = 35010, ["skillname"] = "青莲剑歌", ["skillicon"] = 35001, ["skillEffect"] = "大道忘情绝去留，天伦何处觅踪由。承影化身剑灵举剑横扫敌方，对敌方造成192%的物理伤害，并有50%的概率降低目标1点怒气", ["fbKind"] = 1, ["jnKind"] = 0, ["addCp"] = 40, ["conCp"] = 100, ["fightCd"] = 0},
    [35011] = {["id"] = 35011, ["skillname"] = "唳空", ["skillicon"] = 35006, ["skillEffect"] = "白鹤呼风唳碧空。白色纸鹤飞起绕我方一周，治疗生命最少的友军102%的治疗效果", ["fbKind"] = 3, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 0, ["fightCd"] = 0},
    [35012] = {["id"] = 35012, ["skillname"] = "鹤寄相思", ["skillicon"] = 35007, ["skillEffect"] = "治疗全体友军116%的治疗效果，且20%概率增加2点怒气", ["fbKind"] = 1, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 100, ["fightCd"] = 0},
    [35013] = {["id"] = 35013, ["skillname"] = "山水相逢", ["skillicon"] = 35004, ["skillEffect"] = "倚天万里须长剑。姬尘来挥斥唐刀，对敌方一列敌人造成65%的物理伤害", ["fbKind"] = 3, ["jnKind"] = 0, ["addCp"] = 40, ["conCp"] = 0, ["fightCd"] = 0},
    [35014] = {["id"] = 35014, ["skillname"] = "清泉流响", ["skillicon"] = 35005, ["skillEffect"] = "挥雪刃，掩泉扃。姬尘来将手中唐刀插入地面，对一列敌人造成232%物理伤害，下一回合伤害提高50%", ["fbKind"] = 1, ["jnKind"] = 0, ["addCp"] = 40, ["conCp"] = 100, ["fightCd"] = 0},
    [35015] = {["id"] = 35015, ["skillname"] = "图穷见匕", ["skillicon"] = 35002, ["skillEffect"] = "轻尘在玉琴。南歌抚动琴弦，对敌方指定敌人造成28%的物理伤害，并回复自身一点怒气值", ["fbKind"] = 3, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 0, ["fightCd"] = 0},
    [35016] = {["id"] = 35016, ["skillname"] = "远来客", ["skillicon"] = 35003, ["skillEffect"] = "丝桐合为琴，中有太古声。琴音化作锐刃对一列敌方造成107%的物理伤害，并随机回复我方三人一点怒气值", ["fbKind"] = 1, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 100, ["fightCd"] = 0},
    [35017] = {["id"] = 35017, ["skillname"] = "一剑霜寒", ["skillicon"] = 35002, ["skillEffect"] = "不识胡枪与弓箭。胡不归掏枪齐射，对后排敌人造成52%的物理伤害", ["fbKind"] = 3, ["jnKind"] = 0, ["addCp"] = 40, ["conCp"] = 0, ["fightCd"] = 0},
    [35018] = {["id"] = 35018, ["skillname"] = "孤剑鸣", ["skillicon"] = 35003, ["skillEffect"] = "江寒风动枪火鸣。胡不归向空中射出成千上万颗子弹，对后排敌人造成168%的物理伤害，且此次攻击命中率和暴击率提升30%。", ["fbKind"] = 1, ["jnKind"] = 0, ["addCp"] = 40, ["conCp"] = 100, ["fightCd"] = 0},
    [35019] = {["id"] = 35019, ["skillname"] = "毒针", ["skillicon"] = 35004, ["skillEffect"] = "放出三枚毒针，对随机3个敌人造成55%的法术伤害", ["fbKind"] = 3, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 0, ["fightCd"] = 0},
    [35020] = {["id"] = 35020, ["skillname"] = "冰魄银针", ["skillicon"] = 35005, ["skillEffect"] = "放出冰魄银针，对随机3个敌人造成162%法术伤害，并有17%概率眩晕目标1回合", ["fbKind"] = 1, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 100, ["fightCd"] = 0},
    [35021] = {["id"] = 35021, ["skillname"] = "道且殊", ["skillicon"] = 35000, ["skillEffect"] = "对前排敌人造成58%的物理伤害", ["fbKind"] = 3, ["jnKind"] = 0, ["addCp"] = 40, ["conCp"] = 0, ["fightCd"] = 0},
    [35022] = {["id"] = 35022, ["skillname"] = "任我行", ["skillicon"] = 35001, ["skillEffect"] = "对前排敌人造成197%物理伤害，己方全体格挡增加20%，2回合", ["fbKind"] = 1, ["jnKind"] = 0, ["addCp"] = 40, ["conCp"] = 100, ["fightCd"] = 0},
    [35023] = {["id"] = 35023, ["skillname"] = "直上瑶台", ["skillicon"] = 35006, ["skillEffect"] = "摇动金铃铛，治疗全体友军48%", ["fbKind"] = 3, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 0, ["fightCd"] = 0},
    [35024] = {["id"] = 35024, ["skillname"] = "扶摇九霄", ["skillicon"] = 35007, ["skillEffect"] = "舞动动金铃铛，鼓舞队友，治疗全体友军116%，并持续回复40%，2回合", ["fbKind"] = 1, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 100, ["fightCd"] = 0},
    [35025] = {["id"] = 35025, ["skillname"] = "多歧亡羊", ["skillicon"] = 35002, ["skillEffect"] = "逍遥刀斩出一道刀光，对前排敌人造成58%物理伤害", ["fbKind"] = 3, ["jnKind"] = 0, ["addCp"] = 40, ["conCp"] = 0, ["fightCd"] = 0},
    [35026] = {["id"] = 35026, ["skillname"] = "大道之行", ["skillicon"] = 35003, ["skillEffect"] = "逍遥刀寒光逼人，斩出寒光，对前排敌人造成213%物理伤害，破招率提高50%", ["fbKind"] = 1, ["jnKind"] = 0, ["addCp"] = 40, ["conCp"] = 100, ["fightCd"] = 0},
    [35027] = {["id"] = 35027, ["skillname"] = "行针步线", ["skillicon"] = 35004, ["skillEffect"] = "撩动拂尘，对所有敌人造成40%法术伤害", ["fbKind"] = 3, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 0, ["fightCd"] = 0},
    [35028] = {["id"] = 35028, ["skillname"] = "细针密缕", ["skillicon"] = 35005, ["skillEffect"] = "挥舞拂尘，风起云涌，对所有敌人造成80%法术伤害，并造成30%的灼烧效果，持续2回合", ["fbKind"] = 1, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 100, ["fightCd"] = 0},
    [35029] = {["id"] = 35029, ["skillname"] = "山水画", ["skillicon"] = 35002, ["skillEffect"] = "随机3个敌人造成55%的物理伤害", ["fbKind"] = 3, ["jnKind"] = 0, ["addCp"] = 40, ["conCp"] = 0, ["fightCd"] = 0},
    [35030] = {["id"] = 35030, ["skillname"] = "学海无涯", ["skillicon"] = 35003, ["skillEffect"] = "对随机3个敌人造成167%的物理伤害，且本次攻击暴击率提升30%", ["fbKind"] = 1, ["jnKind"] = 0, ["addCp"] = 40, ["conCp"] = 100, ["fightCd"] = 0},
    [35031] = {["id"] = 35031, ["skillname"] = "十字月轮", ["skillicon"] = 35004, ["skillEffect"] = "对单个敌人造成110%法术伤害", ["fbKind"] = 3, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 0, ["fightCd"] = 0},
    [35032] = {["id"] = 35032, ["skillname"] = "会挽剑霜", ["skillicon"] = 35005, ["skillEffect"] = "对怒气最多的敌人造成220%点法术伤害，并减少目标2点怒气", ["fbKind"] = 1, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 100, ["fightCd"] = 0},
    [35033] = {["id"] = 35033, ["skillname"] = "相聚", ["skillicon"] = 35000, ["skillEffect"] = "对单个敌人造成110%物理伤害", ["fbKind"] = 3, ["jnKind"] = 0, ["addCp"] = 40, ["conCp"] = 0, ["fightCd"] = 0},
    [35034] = {["id"] = 35034, ["skillname"] = "姐妹情深", ["skillicon"] = 35001, ["skillEffect"] = "对前排敌人造成196%的物理伤害，己方前排格挡提高20%，2回合", ["fbKind"] = 1, ["jnKind"] = 0, ["addCp"] = 40, ["conCp"] = 100, ["fightCd"] = 0},
    [35035] = {["id"] = 35035, ["skillname"] = "聚首", ["skillicon"] = 35006, ["skillEffect"] = "治疗生命最少的友军102%", ["fbKind"] = 3, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 0, ["fightCd"] = 0},
    [35036] = {["id"] = 35036, ["skillname"] = "情深意重", ["skillicon"] = 35007, ["skillEffect"] = "治疗全体友军116%", ["fbKind"] = 1, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 100, ["fightCd"] = 0},
    [35037] = {["id"] = 35037, ["skillname"] = "财能通神", ["skillicon"] = 35002, ["skillEffect"] = "对一列敌人造成65%物理伤害", ["fbKind"] = 3, ["jnKind"] = 0, ["addCp"] = 40, ["conCp"] = 0, ["fightCd"] = 0},
    [35038] = {["id"] = 35038, ["skillname"] = "富可敌国", ["skillicon"] = 35003, ["skillEffect"] = "对一列敌人造成241%物理伤害", ["fbKind"] = 1, ["jnKind"] = 0, ["addCp"] = 40, ["conCp"] = 100, ["fightCd"] = 0},
    [35039] = {["id"] = 35039, ["skillname"] = "临时配置", ["skillicon"] = 35004, ["skillEffect"] = "对一列敌人造成65%物理伤害", ["fbKind"] = 3, ["jnKind"] = 0, ["addCp"] = 40, ["conCp"] = 0, ["fightCd"] = 0},
    [35040] = {["id"] = 35040, ["skillname"] = "临时配置", ["skillicon"] = 35005, ["skillEffect"] = "对一列敌人造成241%物理伤害", ["fbKind"] = 1, ["jnKind"] = 0, ["addCp"] = 40, ["conCp"] = 100, ["fightCd"] = 0},
    [35041] = {["id"] = 35041, ["skillname"] = "风起潇湘", ["skillicon"] = 35002, ["skillCond"] = "对方存在武将", ["skillRange"] = "物理攻击单个目标", ["skillEffect"] = "出入君怀袖，动摇微风发。扇动扇子将一名目标敌人吹起，对目标造成100%的物理伤害", ["fbKind"] = 3, ["jnKind"] = 0, ["addCp"] = 40, ["conCp"] = 100, ["fightCd"] = 0},
    [35042] = {["id"] = 35042, ["skillname"] = "一帘芳华", ["skillicon"] = 35004, ["skillCond"] = "对方存在武将", ["skillRange"] = "法术攻击单个目标", ["skillEffect"] = "玉手摇，百芳落。将手中绣球抛掷出去花瓣，对目标造成100%的法术伤害", ["fbKind"] = 3, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 100, ["fightCd"] = 0},
    [35043] = {["id"] = 35043, ["skillname"] = "风刀霜剑", ["skillicon"] = 35003, ["skillCond"] = "对方存在武将", ["skillRange"] = "物理直线2个目标", ["skillEffect"] = "书香涤月影，墨韵荡秋思。折扇化作三道光刃，对目标造成200%的物理伤害", ["fbKind"] = 1, ["jnKind"] = 0, ["addCp"] = 40, ["conCp"] = 100, ["fightCd"] = 0},
    [35044] = {["id"] = 35044, ["skillname"] = "落英乱云", ["skillicon"] = 35005, ["skillCond"] = "对方存在武将", ["skillRange"] = "法术直线2个目标", ["skillEffect"] = "桃之夭夭，灼灼其华。绣球投掷出大量花雨，对目标造成200%的法术伤害，50%造成眩晕", ["fbKind"] = 1, ["jnKind"] = 1, ["addCp"] = 40, ["conCp"] = 100, ["fightCd"] = 0},
    [35045] = {["id"] = 35045, ["skillname"] = "临时配置", ["skillicon"] = 35004, ["skillEffect"] = "对一列敌人造成65%物理伤害", ["fbKind"] = 3, ["jnKind"] = 0, ["addCp"] = 40, ["conCp"] = 0, ["fightCd"] = 0},
    [35046] = {["id"] = 35046, ["skillname"] = "临时配置", ["skillicon"] = 35005, ["skillEffect"] = "对一列敌人造成241%物理伤害", ["fbKind"] = 1, ["jnKind"] = 0, ["addCp"] = 40, ["conCp"] = 100, ["fightCd"] = 0},
    [35047] = {["id"] = 35047, ["skillname"] = "临时配置", ["skillicon"] = 35004, ["skillEffect"] = "对一列敌人造成65%物理伤害", ["fbKind"] = 3, ["jnKind"] = 0, ["addCp"] = 40, ["conCp"] = 0, ["fightCd"] = 0},
    [35048] = {["id"] = 35048, ["skillname"] = "临时配置", ["skillicon"] = 35005, ["skillEffect"] = "对一列敌人造成241%物理伤害", ["fbKind"] = 1, ["jnKind"] = 0, ["addCp"] = 40, ["conCp"] = 100, ["fightCd"] = 0},
    [35049] = {["id"] = 35049, ["skillname"] = "临时配置", ["skillicon"] = 35004, ["skillEffect"] = "对一列敌人造成65%物理伤害", ["fbKind"] = 3, ["jnKind"] = 0, ["addCp"] = 40, ["conCp"] = 0, ["fightCd"] = 0},
    [35050] = {["id"] = 35050, ["skillname"] = "临时配置", ["skillicon"] = 35005, ["skillEffect"] = "对一列敌人造成241%物理伤害", ["fbKind"] = 1, ["jnKind"] = 0, ["addCp"] = 40, ["conCp"] = 100, ["fightCd"] = 0},
    [35051] = {["id"] = 35051, ["skillname"] = "无名斩", ["skillicon"] = 35004, ["skillEffect"] = "挥动无名剑斩出一道剑光，对目标敌人造成100%法术伤害", ["fbKind"] = 3, ["jnKind"] = 0, ["addCp"] = 40, ["conCp"] = 0, ["fightCd"] = 0},
    [35052] = {["id"] = 35052, ["skillname"] = "灵剑幻花", ["skillicon"] = 35005, ["skillEffect"] = "灵剑幻花，对随机3名敌人造成192%法术伤害", ["fbKind"] = 1, ["jnKind"] = 0, ["addCp"] = 40, ["conCp"] = 100, ["fightCd"] = 0},
    [35053] = {["id"] = 35053, ["skillname"] = "符咒", ["skillicon"] = 35004, ["skillEffect"] = "风之符咒，对随机3名敌人造成55%法术伤害", ["fbKind"] = 3, ["jnKind"] = 0, ["addCp"] = 40, ["conCp"] = 0, ["fightCd"] = 0},
    [35054] = {["id"] = 35054, ["skillname"] = "无名卷轴", ["skillicon"] = 35005, ["skillEffect"] = "无名卷轴缠绕敌方，对全体敌人造成140%法术伤害", ["fbKind"] = 1, ["jnKind"] = 0, ["addCp"] = 40, ["conCp"] = 100, ["fightCd"] = 0},
    [35055] = {["id"] = 35055, ["skillname"] = "临时配置", ["skillicon"] = 35004, ["skillEffect"] = "对一列敌人造成65%物理伤害", ["fbKind"] = 3, ["jnKind"] = 0, ["addCp"] = 40, ["conCp"] = 0, ["fightCd"] = 0},
    [35056] = {["id"] = 35056, ["skillname"] = "临时配置", ["skillicon"] = 35005, ["skillEffect"] = "对一列敌人造成241%物理伤害", ["fbKind"] = 1, ["jnKind"] = 0, ["addCp"] = 40, ["conCp"] = 100, ["fightCd"] = 0},
    [35057] = {["id"] = 35057, ["skillname"] = "临时配置", ["skillicon"] = 35004, ["skillEffect"] = "对一列敌人造成65%物理伤害", ["fbKind"] = 3, ["jnKind"] = 0, ["addCp"] = 40, ["conCp"] = 0, ["fightCd"] = 0},
    [35058] = {["id"] = 35058, ["skillname"] = "临时配置", ["skillicon"] = 35005, ["skillEffect"] = "对一列敌人造成241%物理伤害", ["fbKind"] = 1, ["jnKind"] = 0, ["addCp"] = 40, ["conCp"] = 100, ["fightCd"] = 0},
    [35059] = {["id"] = 35059, ["skillname"] = "临时配置", ["skillicon"] = 35004, ["skillEffect"] = "对一列敌人造成65%物理伤害", ["fbKind"] = 3, ["jnKind"] = 0, ["addCp"] = 40, ["conCp"] = 0, ["fightCd"] = 0},
    [35060] = {["id"] = 35060, ["skillname"] = "临时配置", ["skillicon"] = 35005, ["skillEffect"] = "对一列敌人造成241%物理伤害", ["fbKind"] = 1, ["jnKind"] = 0, ["addCp"] = 40, ["conCp"] = 100, ["fightCd"] = 0},
    [35061] = {["id"] = 35061, ["skillname"] = "技能1", ["skillicon"] = 35004, ["skillRange"] = "3", ["skillEffect"] = "对前排敌人造成55%物理伤害", ["fbKind"] = 3, ["jnKind"] = 0, ["addCp"] = 40, ["conCp"] = 0, ["fightCd"] = 0},
    [35062] = {["id"] = 35062, ["skillname"] = "技能2", ["skillicon"] = 35005, ["skillRange"] = "6", ["skillEffect"] = "对所有敌人造成168%物理伤害，且敌人受到伤害增加20%，持续1回合", ["fbKind"] = 1, ["jnKind"] = 0, ["addCp"] = 40, ["conCp"] = 100, ["fightCd"] = 0}
}

return data