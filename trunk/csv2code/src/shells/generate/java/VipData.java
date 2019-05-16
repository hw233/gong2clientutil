package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * VIP表.csv
 * VIP等级 = id
 * 名称 = name
 * 金额 = gold
 * VIP跳过战斗时间 = ifFight
 * 每日体力购买次数 = hpNum
 * 每日许愿次数 = vowNum
 * 道具 = item
 * 道具个数 = itemnum
 * 购买道具原价 = buyMoney
 * 购买折扣价 = buyDisMoney
 * 购买次数 = num
 * 描述 = des
 */
public class VipData extends LData {
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
    0, map("id", 0, "name", "VIP0", "vipLv", 0, "gold", 0, "ifFight", 0, "hpNum", 12, "vowNum", 5, "item", list(10000), "itemnum", list(1), "buyMoney", 100, "buyDisMoney", 50, "num", 1, "des", "<ttf color = '#996c33' fontsize=20>1.[累计充值60元宝]</ttf>\n<ttf color = '#996c33' fontsize=20>2.好友上限35个</ttf>\n<ttf color = '#996c33' fontsize=20>3.每天整点挂机次数100次</ttf>\n<ttf color = '#996c33' fontsize=20>4.每周获得275点经验双倍点</ttf>\n<ttf color = '#996c33' fontsize=20>5.拥有领取红包机会4次"),
    1, map("id", 1, "name", "VIP1", "vipLv", 1, "gold", 60, "ifFight", 0, "hpNum", 13, "vowNum", 6, "item", list(10000), "itemnum", list(2), "buyMoney", 100, "buyDisMoney", 50, "num", 1, "des", "<ttf color = '#996c33' fontsize=20>1.[累计充值60元宝]</ttf>\n<ttf color = '#996c33' fontsize=20>2.好友上限35个</ttf>\n<ttf color = '#996c33' fontsize=20>3.每天整点挂机次数100次</ttf>\n<ttf color = '#996c33' fontsize=20>4.每周获得275点经验双倍点</ttf>\n<ttf color = '#996c33' fontsize=20>5.拥有领取红包机会4次"),
    2, map("id", 2, "name", "VIP2", "vipLv", 2, "gold", 300, "ifFight", 0, "hpNum", 14, "vowNum", 7, "item", list(10000), "itemnum", list(3), "buyMoney", 100, "buyDisMoney", 50, "num", 1, "des", "<ttf color = '#996c33' fontsize=20>1.[累计充值60元宝]</ttf>\n<ttf color = '#996c33' fontsize=20>2.好友上限35个</ttf>\n<ttf color = '#996c33' fontsize=20>3.每天整点挂机次数100次</ttf>\n<ttf color = '#996c33' fontsize=20>4.每周获得275点经验双倍点</ttf>\n<ttf color = '#996c33' fontsize=20>5.拥有领取红包机会4次"),
    3, map("id", 3, "name", "VIP3", "vipLv", 3, "gold", 1000, "ifFight", 0, "hpNum", 15, "vowNum", 8, "item", list(10000), "itemnum", list(4), "buyMoney", 100, "buyDisMoney", 50, "num", 1, "des", "<ttf color = '#996c33' fontsize=20>1.[累计充值60元宝]</ttf>\n<ttf color = '#996c33' fontsize=20>2.好友上限35个</ttf>\n<ttf color = '#996c33' fontsize=20>3.每天整点挂机次数100次</ttf>\n<ttf color = '#996c33' fontsize=20>4.每周获得275点经验双倍点</ttf>\n<ttf color = '#996c33' fontsize=20>5.拥有领取红包机会4次"),
    4, map("id", 4, "name", "VIP4", "vipLv", 4, "gold", 2000, "ifFight", 0, "hpNum", 16, "vowNum", 9, "item", list(10000), "itemnum", list(5), "buyMoney", 100, "buyDisMoney", 50, "num", 1, "des", "<ttf color = '#996c33' fontsize=20>1.[累计充值60元宝]</ttf>\n<ttf color = '#996c33' fontsize=20>2.好友上限35个</ttf>\n<ttf color = '#996c33' fontsize=20>3.每天整点挂机次数100次</ttf>\n<ttf color = '#996c33' fontsize=20>4.每周获得275点经验双倍点</ttf>\n<ttf color = '#996c33' fontsize=20>5.拥有领取红包机会4次")
);
    }

    private static void init1() {
data.map(
    5, map("id", 5, "name", "VIP5", "vipLv", 5, "gold", 5000, "ifFight", 0, "hpNum", 17, "vowNum", 10, "item", list(10000), "itemnum", list(6), "buyMoney", 100, "buyDisMoney", 50, "num", 1, "des", "<ttf color = '#996c33' fontsize=20>1.[累计充值60元宝]</ttf>\n<ttf color = '#996c33' fontsize=20>2.好友上限35个</ttf>\n<ttf color = '#996c33' fontsize=20>3.每天整点挂机次数100次</ttf>\n<ttf color = '#996c33' fontsize=20>4.每周获得275点经验双倍点</ttf>\n<ttf color = '#996c33' fontsize=20>5.拥有领取红包机会4次"),
    6, map("id", 6, "name", "VIP6", "vipLv", 6, "gold", 10000, "ifFight", 0, "hpNum", 18, "vowNum", 11, "item", list(10000), "itemnum", list(7), "buyMoney", 100, "buyDisMoney", 50, "num", 1, "des", "<ttf color = '#996c33' fontsize=20>1.[累计充值60元宝]</ttf>\n<ttf color = '#996c33' fontsize=20>2.好友上限35个</ttf>\n<ttf color = '#996c33' fontsize=20>3.每天整点挂机次数100次</ttf>\n<ttf color = '#996c33' fontsize=20>4.每周获得275点经验双倍点</ttf>\n<ttf color = '#996c33' fontsize=20>5.拥有领取红包机会4次"),
    7, map("id", 7, "name", "VIP7", "vipLv", 7, "gold", 25000, "ifFight", 0, "hpNum", 19, "vowNum", 12, "item", list(10000), "itemnum", list(8), "buyMoney", 100, "buyDisMoney", 50, "num", 1, "des", "<ttf color = '#996c33' fontsize=20>1.[累计充值60元宝]</ttf>\n<ttf color = '#996c33' fontsize=20>2.好友上限35个</ttf>\n<ttf color = '#996c33' fontsize=20>3.每天整点挂机次数100次</ttf>\n<ttf color = '#996c33' fontsize=20>4.每周获得275点经验双倍点</ttf>\n<ttf color = '#996c33' fontsize=20>5.拥有领取红包机会4次"),
    8, map("id", 8, "name", "VIP8", "vipLv", 8, "gold", 50000, "ifFight", 0, "hpNum", 20, "vowNum", 13, "item", list(10000), "itemnum", list(9), "buyMoney", 100, "buyDisMoney", 50, "num", 1, "des", "<ttf color = '#996c33' fontsize=20>1.[累计充值60元宝]</ttf>\n<ttf color = '#996c33' fontsize=20>2.好友上限35个</ttf>\n<ttf color = '#996c33' fontsize=20>3.每天整点挂机次数100次</ttf>\n<ttf color = '#996c33' fontsize=20>4.每周获得275点经验双倍点</ttf>\n<ttf color = '#996c33' fontsize=20>5.拥有领取红包机会4次"),
    9, map("id", 9, "name", "VIP9", "vipLv", 9, "gold", 80000, "ifFight", 0, "hpNum", 21, "vowNum", 14, "item", list(10000), "itemnum", list(10), "buyMoney", 100, "buyDisMoney", 50, "num", 1, "des", "<ttf color = '#996c33' fontsize=20>1.[累计充值60元宝]</ttf>\n<ttf color = '#996c33' fontsize=20>2.好友上限35个</ttf>\n<ttf color = '#996c33' fontsize=20>3.每天整点挂机次数100次</ttf>\n<ttf color = '#996c33' fontsize=20>4.每周获得275点经验双倍点</ttf>\n<ttf color = '#996c33' fontsize=20>5.拥有领取红包机会4次")
);
    }

    private static void init2() {
data.map(
    10, map("id", 10, "name", "VIP10", "vipLv", 10, "gold", 120000, "ifFight", 0, "hpNum", 22, "vowNum", 15, "item", list(10000), "itemnum", list(11), "buyMoney", 100, "buyDisMoney", 50, "num", 1, "des", "<ttf color = '#996c33' fontsize=20>1.[累计充值60元宝]</ttf>\n<ttf color = '#996c33' fontsize=20>2.好友上限35个</ttf>\n<ttf color = '#996c33' fontsize=20>3.每天整点挂机次数100次</ttf>\n<ttf color = '#996c33' fontsize=20>4.每周获得275点经验双倍点</ttf>\n<ttf color = '#996c33' fontsize=20>5.拥有领取红包机会4次"),
    11, map("id", 11, "name", "VIP11", "vipLv", 11, "gold", 160000, "ifFight", 0, "hpNum", 23, "vowNum", 16, "item", list(10000), "itemnum", list(12), "buyMoney", 100, "buyDisMoney", 50, "num", 1, "des", "<ttf color = '#996c33' fontsize=20>1.[累计充值60元宝]</ttf>\n<ttf color = '#996c33' fontsize=20>2.好友上限35个</ttf>\n<ttf color = '#996c33' fontsize=20>3.每天整点挂机次数100次</ttf>\n<ttf color = '#996c33' fontsize=20>4.每周获得275点经验双倍点</ttf>\n<ttf color = '#996c33' fontsize=20>5.拥有领取红包机会4次"),
    12, map("id", 12, "name", "VIP12", "vipLv", 12, "gold", 200000, "ifFight", 0, "hpNum", 24, "vowNum", 17, "item", list(10000), "itemnum", list(13), "buyMoney", 100, "buyDisMoney", 50, "num", 1, "des", "<ttf color = '#996c33' fontsize=20>1.[累计充值60元宝]</ttf>\n<ttf color = '#996c33' fontsize=20>2.好友上限35个</ttf>\n<ttf color = '#996c33' fontsize=20>3.每天整点挂机次数100次</ttf>\n<ttf color = '#996c33' fontsize=20>4.每周获得275点经验双倍点</ttf>\n<ttf color = '#996c33' fontsize=20>5.拥有领取红包机会4次"),
    13, map("id", 13, "name", "VIP13", "vipLv", 13, "gold", 250000, "ifFight", 0, "hpNum", 25, "vowNum", 18, "item", list(10000), "itemnum", list(14), "buyMoney", 100, "buyDisMoney", 50, "num", 1, "des", "<ttf color = '#996c33' fontsize=20>1.[累计充值60元宝]</ttf>\n<ttf color = '#996c33' fontsize=20>2.好友上限35个</ttf>\n<ttf color = '#996c33' fontsize=20>3.每天整点挂机次数100次</ttf>\n<ttf color = '#996c33' fontsize=20>4.每周获得275点经验双倍点</ttf>\n<ttf color = '#996c33' fontsize=20>5.拥有领取红包机会4次"),
    14, map("id", 14, "name", "VIP14", "vipLv", 14, "gold", 350000, "ifFight", 0, "hpNum", 26, "vowNum", 19, "item", list(10000), "itemnum", list(15), "buyMoney", 100, "buyDisMoney", 50, "num", 1, "des", "<ttf color = '#996c33' fontsize=20>1.[累计充值60元宝]</ttf>\n<ttf color = '#996c33' fontsize=20>2.好友上限35个</ttf>\n<ttf color = '#996c33' fontsize=20>3.每天整点挂机次数100次</ttf>\n<ttf color = '#996c33' fontsize=20>4.每周获得275点经验双倍点</ttf>\n<ttf color = '#996c33' fontsize=20>5.拥有领取红包机会4次")
);
    }

    private static void init3() {
data.map(
    15, map("id", 15, "name", "VIP15", "vipLv", 15, "gold", 500000, "ifFight", 0, "hpNum", 30, "vowNum", 20, "item", list(10000), "itemnum", list(16), "buyMoney", 100, "buyDisMoney", 50, "num", 1, "des", "<ttf color = '#996c33' fontsize=20>1.[累计充值60元宝]</ttf>\n<ttf color = '#996c33' fontsize=20>2.好友上限35个</ttf>\n<ttf color = '#996c33' fontsize=20>3.每天整点挂机次数100次</ttf>\n<ttf color = '#996c33' fontsize=20>4.每周获得275点经验双倍点</ttf>\n<ttf color = '#996c33' fontsize=20>5.拥有领取红包机会4次")
);
    }

}