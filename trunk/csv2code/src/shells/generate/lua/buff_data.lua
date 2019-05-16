--
-- 状态表.csv
-- 状态编号 = id
-- 状态名称 = name
-- 状态描述 = desc
-- 修正属性类型 = propKind
-- 状态类型 = buffKind
-- 图标 = icon
-- 特效 = effect
-- 特效播放类型 0）循环 1）播一次 = looptype
-- 特效播放速度 = effectSpead
-- 属性飘字 = picID

local data = {
    [10] = {["id"] = 10, ["name"] = "攻击+5%", ["propKind"] = 10055, ["buffKind"] = 4, ["icon"] = "35002", ["picID"] = 22007},
    [11] = {["id"] = 11, ["name"] = "物理防御+5%", ["propKind"] = 10056, ["buffKind"] = 4, ["icon"] = "35000", ["picID"] = 23007},
    [12] = {["id"] = 12, ["name"] = "法术防御+5%", ["propKind"] = 10057, ["buffKind"] = 4, ["icon"] = "35001", ["picID"] = 24007},
    [13] = {["id"] = 13, ["name"] = "生命+5%", ["propKind"] = 10058, ["buffKind"] = 4, ["icon"] = "35006", ["picID"] = 22007},
    [1001] = {["id"] = 1001, ["name"] = "眩晕", ["desc"] = "不能攻击 不能使用技能", ["buffKind"] = 1, ["icon"] = "22002", ["effect"] = 1},
    [1002] = {["id"] = 1002, ["name"] = "护盾", ["desc"] = "受到伤害有限扣除护盾吸收的数值，护盾持续若干回合，或者被打破则BUFF消失（攻击力*百分比+附加值）", ["buffKind"] = 2, ["icon"] = "22002", ["effect"] = 2},
    [1004] = {["id"] = 1004, ["name"] = "中毒/持续恢复", ["desc"] = "每一回合开始按释放者的攻击百分比减少/增加 血量 （攻击力*百分比+附加值）", ["buffKind"] = 3, ["icon"] = "22002", ["effect"] = 8},
    [1005] = {["id"] = 1005, ["name"] = "属性提升", ["desc"] = ".", ["propKind"] = 10030, ["buffKind"] = 4, ["icon"] = "22002", ["effect"] = 9, ["picID"] = 22007},
    [1006] = {["id"] = 1006, ["name"] = "提高/降低怒气", ["desc"] = "增加当前怒气值", ["buffKind"] = 5, ["icon"] = "22002", ["looptype"] = 1},
    [2001] = {["id"] = 2001, ["name"] = "攻击+4%", ["propKind"] = 10055, ["buffKind"] = 4, ["icon"] = "35002", ["picID"] = 22007},
    [2002] = {["id"] = 2002, ["name"] = "物理防御+4%", ["propKind"] = 10056, ["buffKind"] = 4, ["icon"] = "35000", ["picID"] = 22007},
    [2003] = {["id"] = 2003, ["name"] = "法术防御+4%", ["propKind"] = 10057, ["buffKind"] = 4, ["icon"] = "35001", ["picID"] = 22007},
    [2004] = {["id"] = 2004, ["name"] = "血量+4%", ["propKind"] = 10058, ["buffKind"] = 4, ["icon"] = "35006", ["picID"] = 22007},
    [2005] = {["id"] = 2005, ["name"] = "攻击+6%", ["propKind"] = 10055, ["buffKind"] = 4, ["icon"] = "35002", ["picID"] = 22007},
    [2006] = {["id"] = 2006, ["name"] = "物理防御+6%", ["propKind"] = 10056, ["buffKind"] = 4, ["icon"] = "35000", ["picID"] = 22007},
    [2007] = {["id"] = 2007, ["name"] = "法术防御+6%", ["propKind"] = 10057, ["buffKind"] = 4, ["icon"] = "35001", ["picID"] = 22007},
    [2008] = {["id"] = 2008, ["name"] = "血量+6%", ["propKind"] = 10058, ["buffKind"] = 4, ["icon"] = "35006", ["picID"] = 22007},
    [2009] = {["id"] = 2009, ["name"] = "攻击+8%", ["propKind"] = 10055, ["buffKind"] = 4, ["icon"] = "35002", ["picID"] = 22007},
    [2010] = {["id"] = 2010, ["name"] = "物理防御+8%", ["propKind"] = 10056, ["buffKind"] = 4, ["icon"] = "35000", ["picID"] = 22007},
    [2011] = {["id"] = 2011, ["name"] = "法术防御+8%", ["propKind"] = 10057, ["buffKind"] = 4, ["icon"] = "35001", ["picID"] = 22007},
    [2012] = {["id"] = 2012, ["name"] = "血量+8%", ["propKind"] = 10058, ["buffKind"] = 4, ["icon"] = "35006", ["picID"] = 22007},
    [2013] = {["id"] = 2013, ["name"] = "攻击+10%", ["propKind"] = 10055, ["buffKind"] = 4, ["icon"] = "35002", ["picID"] = 22007},
    [2014] = {["id"] = 2014, ["name"] = "物理防御+10%", ["propKind"] = 10056, ["buffKind"] = 4, ["icon"] = "35000", ["picID"] = 22007},
    [2015] = {["id"] = 2015, ["name"] = "法术防御+10%", ["propKind"] = 10057, ["buffKind"] = 4, ["icon"] = "35001", ["picID"] = 22007},
    [2016] = {["id"] = 2016, ["name"] = "血量+10%", ["propKind"] = 10058, ["buffKind"] = 4, ["icon"] = "35006", ["picID"] = 22007},
    [2017] = {["id"] = 2017, ["name"] = "暴击+2.5%", ["propKind"] = 10059, ["buffKind"] = 4, ["icon"] = "35002", ["picID"] = 22007},
    [2018] = {["id"] = 2018, ["name"] = "抗暴+2.5%", ["propKind"] = 10060, ["buffKind"] = 4, ["icon"] = "35015", ["picID"] = 22007},
    [2019] = {["id"] = 2019, ["name"] = "招架+2.5%", ["propKind"] = 10063, ["buffKind"] = 4, ["icon"] = "35013", ["picID"] = 22007},
    [2020] = {["id"] = 2020, ["name"] = "破招+2.5%", ["propKind"] = 10062, ["buffKind"] = 4, ["icon"] = "35009", ["picID"] = 22007},
    [2021] = {["id"] = 2021, ["name"] = "抗暴+2.5%", ["propKind"] = 10060, ["buffKind"] = 4, ["icon"] = "35015", ["picID"] = 22007},
    [2022] = {["id"] = 2022, ["name"] = "招架+2.5%", ["propKind"] = 10063, ["buffKind"] = 4, ["icon"] = "35013", ["picID"] = 22007},
    [2023] = {["id"] = 2023, ["name"] = "破招+2.5%", ["propKind"] = 10062, ["buffKind"] = 4, ["icon"] = "35009", ["picID"] = 22007},
    [2024] = {["id"] = 2024, ["name"] = "暴击+2.5%", ["propKind"] = 10059, ["buffKind"] = 4, ["icon"] = "35002", ["picID"] = 22007},
    [2025] = {["id"] = 2025, ["name"] = "招架+2.5%", ["propKind"] = 10063, ["buffKind"] = 4, ["icon"] = "35013", ["picID"] = 22007},
    [2026] = {["id"] = 2026, ["name"] = "破招+2.5%", ["propKind"] = 10062, ["buffKind"] = 4, ["icon"] = "35009", ["picID"] = 22007},
    [2027] = {["id"] = 2027, ["name"] = "暴击+2.5%", ["propKind"] = 10059, ["buffKind"] = 4, ["icon"] = "35002", ["picID"] = 22007},
    [2028] = {["id"] = 2028, ["name"] = "抗暴+2.5%", ["propKind"] = 10060, ["buffKind"] = 4, ["icon"] = "35015", ["picID"] = 22007},
    [2029] = {["id"] = 2029, ["name"] = "破招+2.5%", ["propKind"] = 10062, ["buffKind"] = 4, ["icon"] = "35009", ["picID"] = 22007},
    [2030] = {["id"] = 2030, ["name"] = "暴击+2.5%", ["propKind"] = 10059, ["buffKind"] = 4, ["icon"] = "35002", ["picID"] = 22007},
    [2031] = {["id"] = 2031, ["name"] = "抗暴+2.5%", ["propKind"] = 10060, ["buffKind"] = 4, ["icon"] = "35015", ["picID"] = 22007},
    [2032] = {["id"] = 2032, ["name"] = "招架+2.5%", ["propKind"] = 10063, ["buffKind"] = 4, ["icon"] = "35013", ["picID"] = 22007},
    [5001] = {["id"] = 5001, ["name"] = "当次攻击，暴击提高30%", ["propKind"] = 10030, ["buffKind"] = 4, ["effect"] = 5, ["looptype"] = 1, ["picID"] = 10030},
    [5002] = {["id"] = 5002, ["name"] = "降低2怒气", ["buffKind"] = 5, ["effect"] = 6, ["looptype"] = 1},
    [5003] = {["id"] = 5003, ["name"] = "降低20%格挡率，2回合", ["propKind"] = 10034, ["buffKind"] = 4, ["effect"] = 6, ["looptype"] = 1, ["picID"] = 30008},
    [5004] = {["id"] = 5004, ["name"] = "自己下一回合伤害增加30%", ["propKind"] = 10039, ["buffKind"] = 4, ["effect"] = 5, ["looptype"] = 1, ["picID"] = 22007},
    [5005] = {["id"] = 5005, ["name"] = "灼烧20%攻击", ["buffKind"] = 3, ["effect"] = 3},
    [5006] = {["id"] = 5006, ["name"] = "眩晕1回合", ["buffKind"] = 1, ["effect"] = 1},
    [5007] = {["id"] = 5007, ["name"] = "降低20%破招率，2回合", ["propKind"] = 10033, ["buffKind"] = 4, ["effect"] = 6, ["looptype"] = 1, ["picID"] = 30006},
    [5008] = {["id"] = 5008, ["name"] = "降低伤害20%，2回合", ["propKind"] = 10040, ["buffKind"] = 4, ["effect"] = 6, ["looptype"] = 1, ["picID"] = 22007},
    [5009] = {["id"] = 5009, ["name"] = "霍曼曼普攻治疗", ["buffKind"] = 3},
    [5010] = {["id"] = 5010, ["name"] = "霍曼曼大招治疗", ["buffKind"] = 3, ["effect"] = 7},
    [5011] = {["id"] = 5011, ["name"] = "增加2怒气", ["buffKind"] = 5, ["effect"] = 5, ["looptype"] = 1},
    [5012] = {["id"] = 5012, ["name"] = "自己下一回合伤害增加50%", ["propKind"] = 10039, ["buffKind"] = 4, ["effect"] = 5, ["looptype"] = 1, ["picID"] = 22007},
    [5013] = {["id"] = 5013, ["name"] = "增加1怒气", ["buffKind"] = 5, ["effect"] = 5, ["looptype"] = 1},
    [5014] = {["id"] = 5014, ["name"] = "格挡提高25%，1回合", ["propKind"] = 10034, ["buffKind"] = 4, ["effect"] = 5, ["looptype"] = 1, ["picID"] = 30008},
    [5015] = {["id"] = 5015, ["name"] = "持续治疗40%，2回合", ["buffKind"] = 3, ["effect"] = 4},
    [5016] = {["id"] = 5016, ["name"] = "破招提高50%，1回合+当前回合", ["propKind"] = 10033, ["buffKind"] = 4, ["effect"] = 5, ["looptype"] = 1, ["picID"] = 30006},
    [5017] = {["id"] = 5017, ["name"] = "灼烧30%攻击，2回合", ["buffKind"] = 3, ["effect"] = 3},
    [5018] = {["id"] = 5018, ["name"] = "格挡提高20%，1回合", ["propKind"] = 10034, ["buffKind"] = 4, ["effect"] = 5, ["looptype"] = 1, ["picID"] = 30008},
    [5019] = {["id"] = 5019, ["name"] = "荀德妃普攻治疗", ["buffKind"] = 3},
    [5020] = {["id"] = 5020, ["name"] = "荀德妃技能治疗", ["buffKind"] = 3},
    [5021] = {["id"] = 5021, ["name"] = "青湖普攻治疗", ["buffKind"] = 3},
    [5022] = {["id"] = 5022, ["name"] = "青湖技能治疗", ["buffKind"] = 3},
    [5023] = {["id"] = 5023, ["name"] = "提高受到的伤害", ["propKind"] = 10040, ["buffKind"] = 4, ["effect"] = 6, ["looptype"] = 1, ["picID"] = 23007}
}

return data