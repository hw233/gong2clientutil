package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 状态表.csv
 * 状态编号 = id
 * 状态名称 = name
 * 战斗内外 = inside
 * 状态描述 = desc
 * 修正属性类型 = propKind
 * 公式 = propIncome
 * 状态类型 = buffKind
 * 持续回合 = lastTime
 * 生效时机 = effectTime
 * 目标是否跳过回合 = skip
 * 是否需要每回合计算 = every
 * 特效 = effect
 * 特效播放类型 0）循环 1）播一次 = looptype
 * 特效播放速度 = effectSpead
 * 属性飘字 = picID
 */
public class BuffData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        init1();
        init2();
        init3();
        init4();
        init5();
        init6();
        init7();
        init8();
        init9();
        init10();
        init11();
        init12();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    10, map("id", 10, "name", "攻击+5%", "inside", 1, "propKind", 10055, "propIncome", "0.05", "buffKind", 4, "lastTime", 1, "effectTime", 0, "skip", 0, "every", true, "picID", 22007),
    11, map("id", 11, "name", "物理防御+5%", "inside", 1, "propKind", 10056, "propIncome", "0.05", "buffKind", 4, "lastTime", 1, "effectTime", 0, "skip", 0, "every", true, "picID", 23007),
    12, map("id", 12, "name", "法术防御+5%", "inside", 1, "propKind", 10057, "propIncome", "0.05", "buffKind", 4, "lastTime", 1, "effectTime", 0, "skip", 0, "every", true, "picID", 24007),
    13, map("id", 13, "name", "生命+5%", "inside", 1, "propKind", 10058, "propIncome", "0.05", "buffKind", 4, "lastTime", 1, "effectTime", 0, "skip", 0, "every", true, "picID", 22007),
    1001, map("id", 1001, "name", "眩晕", "inside", 0, "desc", "不能攻击 不能使用技能", "buffKind", 1, "lastTime", 1, "effectTime", 0, "skip", 0, "every", true, "effect", 1)
);
    }

    private static void init1() {
data.map(
    1002, map("id", 1002, "name", "护盾", "inside", 0, "desc", "受到伤害有限扣除护盾吸收的数值，护盾持续若干回合，或者被打破则BUFF消失（攻击力*百分比+附加值）", "propIncome", "o.finalAtk*1.15+50", "buffKind", 2, "lastTime", 2, "effectTime", 0, "skip", 0, "every", true, "effect", 2),
    1004, map("id", 1004, "name", "中毒/持续恢复", "inside", 0, "desc", "每一回合开始按释放者的攻击百分比减少/增加 血量 （攻击力*百分比+附加值）", "propIncome", "o.finalAtk*0.65+50", "buffKind", 3, "lastTime", 2, "effectTime", 0, "skip", 0, "every", true, "effect", 8),
    1005, map("id", 1005, "name", "属性提升", "inside", 0, "desc", ".", "propKind", 10030, "propIncome", "0.2", "buffKind", 4, "lastTime", 2, "effectTime", 0, "skip", 0, "every", true, "effect", 9, "picID", 22007),
    1006, map("id", 1006, "name", "提高/降低怒气", "inside", 0, "desc", "增加当前怒气值", "propIncome", "-2", "buffKind", 5, "lastTime", 1, "effectTime", 0, "skip", 0, "every", true, "looptype", 1),
    2001, map("id", 2001, "name", "攻击+4%", "inside", 1, "propKind", 10055, "propIncome", "0.04", "buffKind", 4, "lastTime", 1, "effectTime", 0, "skip", 0, "every", true, "picID", 22007)
);
    }

    private static void init2() {
data.map(
    2002, map("id", 2002, "name", "物理防御+4%", "inside", 1, "propKind", 10056, "propIncome", "0.04", "buffKind", 4, "lastTime", 1, "effectTime", 0, "skip", 0, "every", true, "picID", 22007),
    2003, map("id", 2003, "name", "法术防御+4%", "inside", 1, "propKind", 10057, "propIncome", "0.04", "buffKind", 4, "lastTime", 1, "effectTime", 0, "skip", 0, "every", true, "picID", 22007),
    2004, map("id", 2004, "name", "血量+4%", "inside", 1, "propKind", 10058, "propIncome", "0.04", "buffKind", 4, "lastTime", 1, "effectTime", 0, "skip", 0, "every", true, "picID", 22007),
    2005, map("id", 2005, "name", "攻击+6%", "inside", 1, "propKind", 10055, "propIncome", "0.06", "buffKind", 4, "lastTime", 1, "effectTime", 0, "skip", 0, "every", true, "picID", 22007),
    2006, map("id", 2006, "name", "物理防御+6%", "inside", 1, "propKind", 10056, "propIncome", "0.06", "buffKind", 4, "lastTime", 1, "effectTime", 0, "skip", 0, "every", true, "picID", 22007)
);
    }

    private static void init3() {
data.map(
    2007, map("id", 2007, "name", "法术防御+6%", "inside", 1, "propKind", 10057, "propIncome", "0.06", "buffKind", 4, "lastTime", 1, "effectTime", 0, "skip", 0, "every", true, "picID", 22007),
    2008, map("id", 2008, "name", "血量+6%", "inside", 1, "propKind", 10058, "propIncome", "0.06", "buffKind", 4, "lastTime", 1, "effectTime", 0, "skip", 0, "every", true, "picID", 22007),
    2009, map("id", 2009, "name", "攻击+8%", "inside", 1, "propKind", 10055, "propIncome", "0.08", "buffKind", 4, "lastTime", 1, "effectTime", 0, "skip", 0, "every", true, "picID", 22007),
    2010, map("id", 2010, "name", "物理防御+8%", "inside", 1, "propKind", 10056, "propIncome", "0.08", "buffKind", 4, "lastTime", 1, "effectTime", 0, "skip", 0, "every", true, "picID", 22007),
    2011, map("id", 2011, "name", "法术防御+8%", "inside", 1, "propKind", 10057, "propIncome", "0.08", "buffKind", 4, "lastTime", 1, "effectTime", 0, "skip", 0, "every", true, "picID", 22007)
);
    }

    private static void init4() {
data.map(
    2012, map("id", 2012, "name", "血量+8%", "inside", 1, "propKind", 10058, "propIncome", "0.08", "buffKind", 4, "lastTime", 1, "effectTime", 0, "skip", 0, "every", true, "picID", 22007),
    2013, map("id", 2013, "name", "攻击+10%", "inside", 1, "propKind", 10055, "propIncome", "0.1", "buffKind", 4, "lastTime", 1, "effectTime", 0, "skip", 0, "every", true, "picID", 22007),
    2014, map("id", 2014, "name", "物理防御+10%", "inside", 1, "propKind", 10056, "propIncome", "0.1", "buffKind", 4, "lastTime", 1, "effectTime", 0, "skip", 0, "every", true, "picID", 22007),
    2015, map("id", 2015, "name", "法术防御+10%", "inside", 1, "propKind", 10057, "propIncome", "0.1", "buffKind", 4, "lastTime", 1, "effectTime", 0, "skip", 0, "every", true, "picID", 22007),
    2016, map("id", 2016, "name", "血量+10%", "inside", 1, "propKind", 10058, "propIncome", "0.1", "buffKind", 4, "lastTime", 1, "effectTime", 0, "skip", 0, "every", true, "picID", 22007)
);
    }

    private static void init5() {
data.map(
    2017, map("id", 2017, "name", "暴击+2.5%", "inside", 1, "propKind", 10059, "propIncome", "0.025", "buffKind", 4, "lastTime", 1, "effectTime", 0, "skip", 0, "every", true, "picID", 22007),
    2018, map("id", 2018, "name", "抗暴+2.5%", "inside", 1, "propKind", 10060, "propIncome", "0.025", "buffKind", 4, "lastTime", 1, "effectTime", 0, "skip", 0, "every", true, "picID", 22007),
    2019, map("id", 2019, "name", "招架+2.5%", "inside", 1, "propKind", 10063, "propIncome", "0.025", "buffKind", 4, "lastTime", 1, "effectTime", 0, "skip", 0, "every", true, "picID", 22007),
    2020, map("id", 2020, "name", "破招+2.5%", "inside", 1, "propKind", 10062, "propIncome", "0.025", "buffKind", 4, "lastTime", 1, "effectTime", 0, "skip", 0, "every", true, "picID", 22007),
    2021, map("id", 2021, "name", "抗暴+2.5%", "inside", 1, "propKind", 10060, "propIncome", "0.025", "buffKind", 4, "lastTime", 1, "effectTime", 0, "skip", 0, "every", true, "picID", 22007)
);
    }

    private static void init6() {
data.map(
    2022, map("id", 2022, "name", "招架+2.5%", "inside", 1, "propKind", 10063, "propIncome", "0.025", "buffKind", 4, "lastTime", 1, "effectTime", 0, "skip", 0, "every", true, "picID", 22007),
    2023, map("id", 2023, "name", "破招+2.5%", "inside", 1, "propKind", 10062, "propIncome", "0.025", "buffKind", 4, "lastTime", 1, "effectTime", 0, "skip", 0, "every", true, "picID", 22007),
    2024, map("id", 2024, "name", "暴击+2.5%", "inside", 1, "propKind", 10059, "propIncome", "0.025", "buffKind", 4, "lastTime", 1, "effectTime", 0, "skip", 0, "every", true, "picID", 22007),
    2025, map("id", 2025, "name", "招架+2.5%", "inside", 1, "propKind", 10063, "propIncome", "0.025", "buffKind", 4, "lastTime", 1, "effectTime", 0, "skip", 0, "every", true, "picID", 22007),
    2026, map("id", 2026, "name", "破招+2.5%", "inside", 1, "propKind", 10062, "propIncome", "0.025", "buffKind", 4, "lastTime", 1, "effectTime", 0, "skip", 0, "every", true, "picID", 22007)
);
    }

    private static void init7() {
data.map(
    2027, map("id", 2027, "name", "暴击+2.5%", "inside", 1, "propKind", 10059, "propIncome", "0.025", "buffKind", 4, "lastTime", 1, "effectTime", 0, "skip", 0, "every", true, "picID", 22007),
    2028, map("id", 2028, "name", "抗暴+2.5%", "inside", 1, "propKind", 10060, "propIncome", "0.025", "buffKind", 4, "lastTime", 1, "effectTime", 0, "skip", 0, "every", true, "picID", 22007),
    2029, map("id", 2029, "name", "破招+2.5%", "inside", 1, "propKind", 10062, "propIncome", "0.025", "buffKind", 4, "lastTime", 1, "effectTime", 0, "skip", 0, "every", true, "picID", 22007),
    2030, map("id", 2030, "name", "暴击+2.5%", "inside", 1, "propKind", 10059, "propIncome", "0.025", "buffKind", 4, "lastTime", 1, "effectTime", 0, "skip", 0, "every", true, "picID", 22007),
    2031, map("id", 2031, "name", "抗暴+2.5%", "inside", 1, "propKind", 10060, "propIncome", "0.025", "buffKind", 4, "lastTime", 1, "effectTime", 0, "skip", 0, "every", true, "picID", 22007)
);
    }

    private static void init8() {
data.map(
    2032, map("id", 2032, "name", "招架+2.5%", "inside", 1, "propKind", 10063, "propIncome", "0.025", "buffKind", 4, "lastTime", 1, "effectTime", 0, "skip", 0, "every", true, "picID", 22007),
    5001, map("id", 5001, "name", "当次攻击，暴击提高30%", "inside", 0, "propKind", 10030, "propIncome", "0.3", "buffKind", 4, "lastTime", 0, "effectTime", 0, "skip", 0, "every", false, "effect", 5, "looptype", 1, "picID", 10030),
    5002, map("id", 5002, "name", "降低2怒气", "inside", 0, "propIncome", "-40", "buffKind", 5, "lastTime", 1, "effectTime", 0, "skip", 0, "every", false, "effect", 6, "looptype", 1),
    5003, map("id", 5003, "name", "降低20%格挡率，2回合", "inside", 0, "propKind", 10034, "propIncome", "-0.2", "buffKind", 4, "lastTime", 2, "effectTime", 0, "skip", 0, "every", false, "effect", 6, "looptype", 1, "picID", 30008),
    5004, map("id", 5004, "name", "自己下一回合伤害增加30%", "inside", 0, "propKind", 10039, "propIncome", "0.3", "buffKind", 4, "lastTime", 1, "effectTime", 1, "skip", 0, "every", false, "effect", 5, "looptype", 1, "picID", 22007)
);
    }

    private static void init9() {
data.map(
    5005, map("id", 5005, "name", "灼烧20%攻击", "inside", 0, "propIncome", "o.finalAtk*0.20", "buffKind", 3, "lastTime", 2, "effectTime", 1, "skip", 0, "every", false, "effect", 3),
    5006, map("id", 5006, "name", "眩晕1回合", "inside", 0, "buffKind", 1, "lastTime", 1, "effectTime", 1, "skip", 0, "every", false, "effect", 1),
    5007, map("id", 5007, "name", "降低20%破招率，2回合", "inside", 0, "propKind", 10033, "propIncome", "-0.2", "buffKind", 4, "lastTime", 2, "effectTime", 0, "skip", 0, "every", false, "effect", 6, "looptype", 1, "picID", 30006),
    5008, map("id", 5008, "name", "降低伤害20%，2回合", "inside", 0, "propKind", 10040, "propIncome", "-0.2", "buffKind", 4, "lastTime", 2, "effectTime", 1, "skip", 0, "every", false, "effect", 6, "looptype", 1, "picID", 22007),
    5009, map("id", 5009, "name", "霍曼曼普攻治疗", "inside", 0, "propIncome", "o.finalAtk*1.025+50", "buffKind", 3, "lastTime", 0, "effectTime", 0, "skip", 0, "every", false)
);
    }

    private static void init10() {
data.map(
    5010, map("id", 5010, "name", "霍曼曼大招治疗", "inside", 0, "propIncome", "o.finalAtk*1.025+50", "buffKind", 3, "lastTime", 0, "effectTime", 0, "skip", 0, "every", false, "effect", 7),
    5011, map("id", 5011, "name", "增加2怒气", "inside", 0, "propIncome", "40", "buffKind", 5, "lastTime", 1, "effectTime", 0, "skip", 0, "every", false, "effect", 5, "looptype", 1),
    5012, map("id", 5012, "name", "自己下一回合伤害增加50%", "inside", 0, "propKind", 10039, "propIncome", "0.5", "buffKind", 4, "lastTime", 1, "effectTime", 1, "skip", 0, "every", false, "effect", 5, "looptype", 1, "picID", 22007),
    5013, map("id", 5013, "name", "增加1怒气", "inside", 0, "propIncome", "20", "buffKind", 5, "lastTime", 1, "effectTime", 0, "skip", 0, "every", false, "effect", 5, "looptype", 1),
    5014, map("id", 5014, "name", "格挡提高25%，1回合", "inside", 0, "propKind", 10034, "propIncome", "0.25", "buffKind", 4, "lastTime", 1, "effectTime", 0, "skip", 0, "every", false, "effect", 5, "looptype", 1, "picID", 30008)
);
    }

    private static void init11() {
data.map(
    5015, map("id", 5015, "name", "持续治疗40%，2回合", "inside", 0, "propIncome", "o.finalAtk*0.4+50", "buffKind", 3, "lastTime", 2, "effectTime", 0, "skip", 0, "every", false, "effect", 4),
    5016, map("id", 5016, "name", "破招提高50%，1回合+当前回合", "inside", 0, "propKind", 10033, "propIncome", "0.5", "buffKind", 4, "lastTime", 1, "effectTime", 0, "skip", 0, "every", false, "effect", 5, "looptype", 1, "picID", 30006),
    5017, map("id", 5017, "name", "灼烧30%攻击，2回合", "inside", 0, "propIncome", "o.finalAtk*0.30", "buffKind", 3, "lastTime", 2, "effectTime", 1, "skip", 0, "every", false, "effect", 3),
    5018, map("id", 5018, "name", "格挡提高20%，1回合", "inside", 0, "propKind", 10034, "propIncome", "0.2", "buffKind", 4, "lastTime", 1, "effectTime", 0, "skip", 0, "every", false, "effect", 5, "looptype", 1, "picID", 30008),
    5019, map("id", 5019, "name", "荀德妃普攻治疗", "inside", 0, "propIncome", "o.finalAtk*0.4+50", "buffKind", 3, "lastTime", 0, "effectTime", 0, "skip", 0, "every", false)
);
    }

    private static void init12() {
data.map(
    5020, map("id", 5020, "name", "荀德妃技能治疗", "inside", 0, "propIncome", "o.finalAtk*0.66+50", "buffKind", 3, "lastTime", 0, "effectTime", 0, "skip", 0, "every", false),
    5021, map("id", 5021, "name", "青湖普攻治疗", "inside", 0, "propIncome", "o.finalAtk*1+50", "buffKind", 3, "lastTime", 0, "effectTime", 0, "skip", 0, "every", false),
    5022, map("id", 5022, "name", "青湖技能治疗", "inside", 0, "propIncome", "o.finalAtk*1.48+50", "buffKind", 3, "lastTime", 0, "effectTime", 0, "skip", 0, "every", false),
    5023, map("id", 5023, "name", "提高受到的伤害", "inside", 0, "propKind", 10040, "propIncome", "-0.2", "buffKind", 4, "lastTime", 1, "effectTime", 0, "skip", 0, "every", false, "effect", 6, "looptype", 1, "picID", 23007)
);
    }

}