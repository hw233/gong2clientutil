package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 服务端公式表.csv
 * 公式编号 = sid
 * 公式名称 = describe
 * 公式命名 = funName
 * 相关公式 = formula
 * 公式引用 = fmlaCite
 */
public class SFormulaData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        init1();
        init2();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    101, map("sid", 101, "describe", "宴请公式", "funName", "formulaA", "formula", "20/factionsA"),
    102, map("sid", 102, "describe", "拉拢", "funName", "formulaB", "formula", "math.max((1-factionsB/factionsC),0)"),
    103, map("sid", 103, "describe", "觐见", "funName", "formulaC", "formula", "factionsE*(factionsD)*20"),
    501, map("sid", 501, "describe", "治疗", "funName", "treatInjury", "formula", "o.finalAtk*o.skillDamegeProb+o.skillDamegeAdd"),
    99001, map("sid", 99001, "describe", "最终暴击率公式", "funName", "finalCriRate", "formula", "o.totCri+o.bufCri-t.totDcri-t.bufDcri")
);
    }

    private static void init1() {
data.map(
    99002, map("sid", 99002, "describe", "最终格挡率公式", "funName", "finalParryRate", "formula", "o.totParry+o.bufParry-t.totDparry-t.bufDparry"),
    99014, map("sid", 99014, "describe", "总战力公式", "funName", "totalZl", "formula", "math.floor(o.disAtk*4.6+o.disDef*4.1+o.disDpower*4.1+o.disHp*0.25+o.disCri*1300+o.disDcri*1300+o.disFocus*517+o.disDparry*1300+o.disParry*1300+o.disTen*1300+o.disPen*1818+o.disDeHIT*4.6+o.disPreDeepen*1724+o.disEahit*4.6+o.disPreEase*1724)"),
    99015, map("sid", 99015, "describe", "物理伤害公式", "funName", "PhyInjury", "formula", "math.floor(((math.max(o.finalAtk-t.finalDef*(1-o.finalPen),0)+o.finalAtk*0.11)*o.skillDamegeProb+o.skillDamegeAdd+o.finalDeHIT-t.finalEahit)*(1+o.finalPreDeepen-t.finalPreEase))"),
    99016, map("sid", 99016, "describe", "法术伤害公式", "funName", "MagInjury", "formula", "math.floor(((math.max(o.finalAtk-t.finalDpower*(1-o.finalPen),0)+o.finalAtk*0.11)*o.skillDamegeProb+o.skillDamegeAdd+o.finalDeHIT-t.finalEahit)*(1+o.finalPreDeepen-t.finalPreEase))"),
    99017, map("sid", 99017, "describe", "物理暴击公式", "funName", "criPhyInjury", "formula", "math.floor(((math.max(o.finalAtk-t.finalDef*(1-o.finalPen),0)+o.finalAtk*0.11)*o.skillDamegeProb+o.skillDamegeAdd+o.finalDeHIT-t.finalEahit)*(1+o.finalPreDeepen-t.finalPreEase+o.criProb))")
);
    }

    private static void init2() {
data.map(
    99018, map("sid", 99018, "describe", "法术暴击公式", "funName", "criMagInjury", "formula", "math.floor(((math.max(o.finalAtk-t.finalDpower*(1-o.finalPen),0)+o.finalAtk*0.11)*o.skillDamegeProb+o.skillDamegeAdd+o.finalDeHIT-t.finalEahit)*(1+o.finalPreDeepen-t.finalPreEase+o.criProb))"),
    99019, map("sid", 99019, "describe", "物理格挡公式", "funName", "parryPhyInjury", "formula", "math.floor(((math.max(o.finalAtk-t.finalDef*(1-o.finalPen),0)+o.finalAtk*0.11)*o.skillDamegeProb+o.skillDamegeAdd+o.finalDeHIT-t.finalEahit)*(1+o.finalPreDeepen-t.finalPreEase-t.parryProb))"),
    99020, map("sid", 99020, "describe", "法术格挡公式", "funName", "parryMagInjury", "formula", "math.floor(((math.max(o.finalAtk-t.finalDpower*(1-o.finalPen),0)+o.finalAtk*0.11)*o.skillDamegeProb+o.skillDamegeAdd+o.finalDeHIT-t.finalEahit)*(1+o.finalPreDeepen-t.finalPreEase-t.parryProb))"),
    99301, map("sid", 99301, "describe", "怪物等级计算公式", "funName", "calcMonsterLv", "formula", "lv")
);
    }

}