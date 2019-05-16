package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 派系权贵表.csv
 * 权贵编号 = id
 * 名称 = name
 * 己方派系BUFF = factionsbuff
 * 己方阵营BUFF = campbuff
 * 敌对权贵 = hostile
 * 建筑解锁等级 = limit
 * 初始势力 = initial
 * 初始势力的友好度 = friend
 */
public class FactionsBigwigsData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        init1();
        init2();
        init3();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    1, map("id", 1, "name", "白凤", "factionsbuff", list(2001), "campbuff", list(2017), "hostile", list(5), "limit", 1, "initial", 1, "friend", 20000),
    2, map("id", 2, "name", "平山丘", "factionsbuff", list(2002), "campbuff", list(2018), "hostile", list(6), "limit", 1, "initial", 1, "friend", 20000),
    3, map("id", 3, "name", "杏林生", "factionsbuff", list(2003), "campbuff", list(2019), "hostile", list(7), "limit", 1, "initial", 2, "friend", 20000),
    4, map("id", 4, "name", "青松道人", "factionsbuff", list(2004), "campbuff", list(2020), "hostile", list(8), "limit", 1, "initial", 2, "friend", 20000),
    5, map("id", 5, "name", "白芷散人", "factionsbuff", list(2005), "campbuff", list(2021), "hostile", list(1), "limit", 2, "initial", 3, "friend", 20000)
);
    }

    private static void init1() {
data.map(
    6, map("id", 6, "name", "长风君", "factionsbuff", list(2006), "campbuff", list(2022), "hostile", list(2), "limit", 2, "initial", 3, "friend", 20000),
    7, map("id", 7, "name", "惊玄君", "factionsbuff", list(2007), "campbuff", list(2023), "hostile", list(3), "limit", 3, "initial", 4, "friend", 20000),
    8, map("id", 8, "name", "松柏老人", "factionsbuff", list(2008), "campbuff", list(2024), "hostile", list(4), "limit", 3, "initial", 4, "friend", 20000),
    9, map("id", 9, "name", "青竹客", "factionsbuff", list(2009), "campbuff", list(2025), "hostile", list(13), "limit", 3, "initial", 5, "friend", 20000),
    10, map("id", 10, "name", "凌波仙子", "factionsbuff", list(2010), "campbuff", list(2026), "hostile", list(14), "limit", 4, "initial", 5, "friend", 20000)
);
    }

    private static void init2() {
data.map(
    11, map("id", 11, "name", "蓬莱山主", "factionsbuff", list(2011), "campbuff", list(2027), "hostile", list(15), "limit", 4, "initial", 6, "friend", 20000),
    12, map("id", 12, "name", "血罗刹", "factionsbuff", list(2012), "campbuff", list(2028), "hostile", list(16), "limit", 4, "initial", 6, "friend", 20000),
    13, map("id", 13, "name", "璎珞女", "factionsbuff", list(2013), "campbuff", list(2029), "hostile", list(9), "limit", 5, "initial", 7, "friend", 20000),
    14, map("id", 14, "name", "萍水剑客", "factionsbuff", list(2014), "campbuff", list(2030), "hostile", list(10), "limit", 5, "initial", 7, "friend", 20000),
    15, map("id", 15, "name", "丘道人", "factionsbuff", list(2015), "campbuff", list(2031), "hostile", list(11), "limit", 6, "initial", 8, "friend", 20000)
);
    }

    private static void init3() {
data.map(
    16, map("id", 16, "name", "落雁客", "factionsbuff", list(2016), "campbuff", list(2032), "hostile", list(12), "limit", 6, "initial", 8, "friend", 20000)
);
    }

}