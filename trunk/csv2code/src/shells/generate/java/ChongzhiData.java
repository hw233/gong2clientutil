package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 充值表.csv
 * 编号 = id
 * 商品编号 = productId
 * 渠道类型 = sdkId
 * 商品类型 = productKind
 * 商品子类型 = type
 * 价格 = price
 * 玉珏 = jade
 * 正常赠送 = giveGold
 * 每日赠送 = dayGive
 * 首充赠送 = firstGold
 * 图标 = icon
 * 首冲礼包 = firstGift
 * 物品数量 = firstNum
 * 2次充值礼包 = SecondGift
 * 3次充值礼包 = ThirdGift
 * 充值赠赠送百分比 = zfbGive
 * 联想平台用 = ext
 * VIP等级显示 = vipShow
 * 渠道特惠购买对应苹果id = thgmQd
 * 名字 = kuaijieName
 * 数量 = num
 */
public class ChongzhiData extends LData {
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
        init13();
        init14();
        init15();
        init16();
        init17();
        init18();
        init19();
        init20();
        init21();
        init22();
        init23();
        init24();
        init25();
        init26();
        init27();
        init28();
        init29();
        init30();
        init31();
        init32();
        init33();
        init34();
        init35();
        init36();
        init37();
        init38();
        init39();
        init40();
        init41();
        init42();
        init43();
        init44();
        init45();
        init46();
        init47();
        init48();
        init49();
        init50();
        init51();
        init52();
        init53();
        init54();
        init55();
        init56();
        init57();
        init58();
        init59();
        init60();
        init61();
        init62();
        init63();
        init64();
        init65();
        init66();
        init67();
        init68();
        init69();
        init70();
        init71();
        init72();
        init73();
        init74();
        init75();
        init76();
        init77();
        init78();
        init79();
        init80();
        init81();
        init82();
        init83();
        init84();
        init85();
        init86();
        init87();
        init88();
        init89();
        init90();
        init91();
        init92();
        init93();
        init94();
        init95();
        init96();
        init97();
        init98();
        init99();
        init100();
        init101();
        init102();
        init103();
        init104();
        init105();
        init106();
        init107();
        init108();
        init109();
        init110();
        init111();
        init112();
        init113();
        init114();
        init115();
        init116();
        init117();
        init118();
        init119();
        init120();
        init121();
        init122();
        init123();
        init124();
        init125();
        init126();
        init127();
        init128();
        init129();
        init130();
        init131();
        init132();
        init133();
        init134();
        init135();
        init136();
        init137();
        init138();
        init139();
        init140();
        init141();
        init142();
        init143();
        init144();
        init145();
        init146();
        init147();
        init148();
        init149();
        init150();
        init151();
        init152();
        init153();
        init154();
        init155();
        init156();
        init157();
        init158();
        init159();
        init160();
        init161();
        init162();
        init163();
        init164();
        init165();
        init166();
        init167();
        init168();
        init169();
        init170();
        init171();
        init172();
        init173();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    1000, map("id", 1000, "productId", "cn.gamejelly.gong.appstore_60yj", "sdkId", 1, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", list(12000, 12001, 12002), "firstNum", list(3, 5, 10), "firstIcon", 1000, "zfbGive", 0.05f),
    1001, map("id", 1001, "productId", "cn.gamejelly.gong.appstore_300yj", "sdkId", 1, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", list(12000, 12001, 12002), "firstNum", list(3, 5, 10), "firstIcon", 1001, "SecondGift", list(12000, 12001, 12002), "SecondNum", list(3, 5, 10), "SecondIcon", 1001, "zfbGive", 0.05f),
    1002, map("id", 1002, "productId", "cn.gamejelly.gong.appstore_980yj", "sdkId", 1, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", list(12000, 12001, 12002), "firstNum", list(3, 5, 10), "firstIcon", 1002, "SecondGift", list(12000, 12001, 12002), "SecondNum", list(3, 5, 10), "SecondIcon", 1002, "zfbGive", 0.05f),
    1003, map("id", 1003, "productId", "cn.gamejelly.gong.appstore_1980yj", "sdkId", 1, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", list(12000, 12001, 12002), "firstNum", list(3, 5, 10), "firstIcon", 1003, "SecondGift", list(12000, 12001, 12002), "SecondNum", list(3, 5, 10), "SecondIcon", 1003, "zfbGive", 0.05f),
    1004, map("id", 1004, "productId", "cn.gamejelly.gong.appstore_3280yj", "sdkId", 1, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", list(12000, 12001, 12002), "firstNum", list(3, 5, 10), "firstIcon", 1004, "SecondGift", list(12000, 12001, 12002), "SecondNum", list(3, 5, 10), "SecondIcon", 1004, "zfbGive", 0.05f)
);
    }

    private static void init1() {
data.map(
    1005, map("id", 1005, "productId", "cn.gamejelly.gong.appstore_6480yj", "sdkId", 1, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", list(12000, 12001, 12002), "firstNum", list(3, 5, 10), "firstIcon", 1005, "SecondGift", list(12000, 12001, 12002), "SecondNum", list(3, 5, 10), "SecondIcon", 1005, "zfbGive", 0.05f),
    1006, map("id", 1006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 1, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    1007, map("id", 1007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 1, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    1008, map("id", 1008, "productId", "cn.gamejelly.gong.appstore_10yj", "sdkId", 1, "productKind", 1, "type", 9, "price", 1.0f, "jade", 10, "giveGold", 1, "firstGold", 10, "firstGift", 22015),
    1009, map("id", 1009, "productId", "cn.gamejelly.gong.appstore_32400yj", "sdkId", 1, "productKind", 1, "type", 10, "price", 3240.0f, "jade", 32400, "giveGold", 10325, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 200)
);
    }

    private static void init2() {
data.map(
    1010, map("id", 1010, "productId", "cn.gamejelly.gong.appstore_36000yj", "sdkId", 1, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    2000, map("id", 2000, "productId", "cn.gamejelly.gong.ky_60yj", "sdkId", 5, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    2001, map("id", 2001, "productId", "cn.gamejelly.gong.ky_300yj", "sdkId", 5, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    2002, map("id", 2002, "productId", "cn.gamejelly.gong.ky_980yj", "sdkId", 5, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    2003, map("id", 2003, "productId", "cn.gamejelly.gong.ky_1980yj", "sdkId", 5, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init3() {
data.map(
    2004, map("id", 2004, "productId", "cn.gamejelly.gong.ky_3280yj", "sdkId", 5, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    2005, map("id", 2005, "productId", "cn.gamejelly.gong.ky_6480yj", "sdkId", 5, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    2006, map("id", 2006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 5, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    2007, map("id", 2007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 5, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    2008, map("id", 2008, "productId", "cn.gamejelly.gong.ky_32400yj", "sdkId", 5, "productKind", 1, "type", 9, "price", 3240.0f, "jade", 32400, "giveGold", 10325, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 200)
);
    }

    private static void init4() {
data.map(
    2009, map("id", 2009, "productId", "cn.gamejelly.gong.ky_36000yj", "sdkId", 5, "productKind", 1, "type", 10, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    3000, map("id", 3000, "productId", "cn.gamejelly.gong.tb_60yj", "sdkId", 7, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    3001, map("id", 3001, "productId", "cn.gamejelly.gong.tb_300yj", "sdkId", 7, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    3002, map("id", 3002, "productId", "cn.gamejelly.gong.tb_980yj", "sdkId", 7, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    3003, map("id", 3003, "productId", "cn.gamejelly.gong.tb_1980yj", "sdkId", 7, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init5() {
data.map(
    3004, map("id", 3004, "productId", "cn.gamejelly.gong.tb_3280yj", "sdkId", 7, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    3005, map("id", 3005, "productId", "cn.gamejelly.gong.tb_6480yj", "sdkId", 7, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    3006, map("id", 3006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 1, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    3007, map("id", 3007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 1, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    3008, map("id", 3008, "productId", "cn.gamejelly.gong.tb_32400yj", "sdkId", 7, "productKind", 1, "type", 9, "price", 3240.0f, "jade", 32400, "giveGold", 10325, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 200)
);
    }

    private static void init6() {
data.map(
    3009, map("id", 3009, "productId", "cn.gamejelly.gong.tb_36000yj", "sdkId", 7, "productKind", 1, "type", 10, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    4000, map("id", 4000, "productId", "cn.gamejelly.gong.i4_60yj", "sdkId", 10, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    4001, map("id", 4001, "productId", "cn.gamejelly.gong.i4_300yj", "sdkId", 10, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    4002, map("id", 4002, "productId", "cn.gamejelly.gong.i4_980yj", "sdkId", 10, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    4003, map("id", 4003, "productId", "cn.gamejelly.gong.i4_1980yj", "sdkId", 10, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init7() {
data.map(
    4004, map("id", 4004, "productId", "cn.gamejelly.gong.i4_3280yj", "sdkId", 10, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    4005, map("id", 4005, "productId", "cn.gamejelly.gong.i4_6480yj", "sdkId", 10, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    4006, map("id", 4006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 10, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    4007, map("id", 4007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 10, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    4008, map("id", 4008, "productId", "cn.gamejelly.gong.i4_32400yj", "sdkId", 10, "productKind", 1, "type", 9, "price", 3240.0f, "jade", 42725, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 200)
);
    }

    private static void init8() {
data.map(
    4009, map("id", 4009, "productId", "cn.gamejelly.gong.i4_36000yj", "sdkId", 10, "productKind", 1, "type", 10, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    5000, map("id", 5000, "productId", "cn.gamejelly.gong.hm_60yj", "sdkId", 9, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    5001, map("id", 5001, "productId", "cn.gamejelly.gong.hm_300yj", "sdkId", 9, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    5002, map("id", 5002, "productId", "cn.gamejelly.gong.hm_980yj", "sdkId", 9, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    5003, map("id", 5003, "productId", "cn.gamejelly.gong.hm_1980yj", "sdkId", 9, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init9() {
data.map(
    5004, map("id", 5004, "productId", "cn.gamejelly.gong.hm_3280yj", "sdkId", 9, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    5005, map("id", 5005, "productId", "cn.gamejelly.gong.hm_6480yj", "sdkId", 9, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    5006, map("id", 5006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 9, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    5007, map("id", 5007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 9, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    5008, map("id", 5008, "productId", "cn.gamejelly.gong.hm_32400yj", "sdkId", 9, "productKind", 1, "type", 9, "price", 3240.0f, "jade", 32400, "giveGold", 10325, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 200)
);
    }

    private static void init10() {
data.map(
    5009, map("id", 5009, "productId", "cn.gamejelly.gong.hm_36000yj", "sdkId", 9, "productKind", 1, "type", 10, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    6000, map("id", 6000, "productId", "cn.gamejelly.gong.xy_60yj", "sdkId", 4, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    6001, map("id", 6001, "productId", "cn.gamejelly.gong.xy_300yj", "sdkId", 4, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    6002, map("id", 6002, "productId", "cn.gamejelly.gong.xy_980yj", "sdkId", 4, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    6003, map("id", 6003, "productId", "cn.gamejelly.gong.xy_1980yj", "sdkId", 4, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init11() {
data.map(
    6004, map("id", 6004, "productId", "cn.gamejelly.gong.xy_3280yj", "sdkId", 4, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    6005, map("id", 6005, "productId", "cn.gamejelly.gong.xy_6480yj", "sdkId", 4, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    6006, map("id", 6006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 4, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    6007, map("id", 6007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 4, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    6008, map("id", 6008, "productId", "cn.gamejelly.gong.xy_32400yj", "sdkId", 4, "productKind", 1, "type", 9, "price", 3240.0f, "jade", 32400, "giveGold", 10325, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 200)
);
    }

    private static void init12() {
data.map(
    6009, map("id", 6009, "productId", "cn.gamejelly.gong.xy_36000yj", "sdkId", 4, "productKind", 1, "type", 10, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    7000, map("id", 7000, "productId", "cn.gamejelly.gong.gp_60yj", "sdkId", 3, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    7001, map("id", 7001, "productId", "cn.gamejelly.gong.gp_300yj", "sdkId", 3, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    7002, map("id", 7002, "productId", "cn.gamejelly.gong.gp_980yj", "sdkId", 3, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    7003, map("id", 7003, "productId", "cn.gamejelly.gong.gp_1980yj", "sdkId", 3, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init13() {
data.map(
    7004, map("id", 7004, "productId", "cn.gamejelly.gong.gp_3280yj", "sdkId", 3, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    7005, map("id", 7005, "productId", "cn.gamejelly.gong.gp_6480yj", "sdkId", 3, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    7006, map("id", 7006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 3, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    7007, map("id", 7007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 3, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    7008, map("id", 7008, "productId", "cn.gamejelly.gong.gp_32400yj", "sdkId", 3, "productKind", 1, "type", 9, "price", 3240.0f, "jade", 32400, "giveGold", 10325, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 200)
);
    }

    private static void init14() {
data.map(
    7009, map("id", 7009, "productId", "cn.gamejelly.gong.gp_36000yj", "sdkId", 3, "productKind", 1, "type", 10, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    8000, map("id", 8000, "productId", "cn.gamejelly.gong4533_60yj", "sdkId", 12, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    8001, map("id", 8001, "productId", "cn.gamejelly.gong4533_300yj", "sdkId", 12, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    8002, map("id", 8002, "productId", "cn.gamejelly.gong4533_980yj", "sdkId", 12, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    8003, map("id", 8003, "productId", "cn.gamejelly.gong4533_1980yj", "sdkId", 12, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init15() {
data.map(
    8004, map("id", 8004, "productId", "cn.gamejelly.gong4533_3280yj", "sdkId", 12, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    8005, map("id", 8005, "productId", "cn.gamejelly.gong4533_6480yj", "sdkId", 12, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    8006, map("id", 8006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 12, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    8007, map("id", 8007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 12, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    8008, map("id", 8008, "productId", "cn.gamejelly.gong4533_32400yj", "sdkId", 12, "productKind", 1, "type", 9, "price", 3240.0f, "jade", 32400, "giveGold", 10325, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 200)
);
    }

    private static void init16() {
data.map(
    8009, map("id", 8009, "productId", "cn.gamejelly.gong4533_36000yj", "sdkId", 12, "productKind", 1, "type", 10, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    9000, map("id", 9000, "productId", "com.changba.WDGT_60yj", "sdkId", 13, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    9001, map("id", 9001, "productId", "com.changba.WDGT_300yj", "sdkId", 13, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    9002, map("id", 9002, "productId", "com.changba.WDGT_980yj", "sdkId", 13, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    9003, map("id", 9003, "productId", "com.changba.WDGT_1980yj", "sdkId", 13, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init17() {
data.map(
    9004, map("id", 9004, "productId", "com.changba.WDGT_3280yj", "sdkId", 13, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    9005, map("id", 9005, "productId", "com.changba.WDGT_6480yj", "sdkId", 13, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    9006, map("id", 9006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 13, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    9007, map("id", 9007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 13, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    9008, map("id", 9008, "productId", "com.changba.WDGT_10yj", "sdkId", 13, "productKind", 1, "type", 9, "price", 1.0f, "jade", 10, "giveGold", 1, "firstGold", 10, "firstGift", 22015)
);
    }

    private static void init18() {
data.map(
    9009, map("id", 9009, "productId", "cn.changba.WDGT_36000yj", "sdkId", 13, "productKind", 1, "type", 10, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    10000, map("id", 10000, "productId", "cn.gamejelly.gong2_60yj", "sdkId", 11, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    10001, map("id", 10001, "productId", "cn.gamejelly.gong2_300yj", "sdkId", 11, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    10002, map("id", 10002, "productId", "cn.gamejelly.gong2_980yj", "sdkId", 11, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    10003, map("id", 10003, "productId", "cn.gamejelly.gong2_1980yj", "sdkId", 11, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init19() {
data.map(
    10004, map("id", 10004, "productId", "cn.gamejelly.gong2_3280yj", "sdkId", 11, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    10005, map("id", 10005, "productId", "cn.gamejelly.gong2_6480yj", "sdkId", 11, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    10006, map("id", 10006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 11, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    10007, map("id", 10007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 11, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    10008, map("id", 10008, "productId", "cn.gamejelly.gong2_10yj", "sdkId", 11, "productKind", 1, "type", 9, "price", 1.0f, "jade", 10, "giveGold", 1, "firstGold", 10, "firstGift", 22015)
);
    }

    private static void init20() {
data.map(
    10009, map("id", 10009, "productId", "cn.gamejelly.gong2_32400yj", "sdkId", 11, "productKind", 1, "type", 10, "price", 3240.0f, "jade", 32400, "giveGold", 10325, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 200),
    10010, map("id", 10010, "productId", "cn.gamejelly.gong2_36000yj", "sdkId", 11, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    11000, map("id", 11000, "productId", "cn.yuwan.appstore_60yj", "sdkId", 14, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    11001, map("id", 11001, "productId", "cn.yuwan.appstore_300yj", "sdkId", 14, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    11002, map("id", 11002, "productId", "cn.yuwan.appstore_980yj", "sdkId", 14, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init21() {
data.map(
    11003, map("id", 11003, "productId", "cn.yuwan.appstore_1980yj", "sdkId", 14, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    11004, map("id", 11004, "productId", "cn.yuwan.appstore_3280yj", "sdkId", 14, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    11005, map("id", 11005, "productId", "cn.yuwan.appstore_6480yj", "sdkId", 14, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    11006, map("id", 11006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 14, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    11007, map("id", 11007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 14, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f)
);
    }

    private static void init22() {
data.map(
    11008, map("id", 11008, "productId", "cn.yuwan.appstore_10yj", "sdkId", 14, "productKind", 1, "type", 9, "price", 1.0f, "jade", 10, "giveGold", 1, "firstGold", 10, "firstGift", 22015),
    11009, map("id", 11009, "productId", "cn.yuwan.appstore_36000yj", "sdkId", 14, "productKind", 1, "type", 10, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    12000, map("id", 12000, "productId", "cn.gamejelly.gong3_60yj", "sdkId", 15, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    12001, map("id", 12001, "productId", "cn.gamejelly.gong3_300yj", "sdkId", 15, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    12002, map("id", 12002, "productId", "cn.gamejelly.gong3_980yj", "sdkId", 15, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init23() {
data.map(
    12003, map("id", 12003, "productId", "cn.gamejelly.gong3_1980yj", "sdkId", 15, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    12004, map("id", 12004, "productId", "cn.gamejelly.gong3_3280yj", "sdkId", 15, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    12005, map("id", 12005, "productId", "cn.gamejelly.gong3_6480yj", "sdkId", 15, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    12006, map("id", 12006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 15, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    12007, map("id", 12007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 15, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f)
);
    }

    private static void init24() {
data.map(
    12008, map("id", 12008, "productId", "cn.gamejelly.gong3_10yj", "sdkId", 15, "productKind", 1, "type", 9, "price", 1.0f, "jade", 10, "giveGold", 1, "firstGold", 10, "firstGift", 22015),
    12009, map("id", 12009, "productId", "cn.gamejelly.gong3_32400yj", "sdkId", 15, "productKind", 1, "type", 10, "price", 3240.0f, "jade", 32400, "giveGold", 10325, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 200),
    12010, map("id", 12010, "productId", "cn.gamejelly.gong.gong3_36000yj", "sdkId", 15, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    13000, map("id", 13000, "productId", "cn.gamejelly.gong4_60yj", "sdkId", 16, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    13001, map("id", 13001, "productId", "cn.gamejelly.gong4_300yj", "sdkId", 16, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init25() {
data.map(
    13002, map("id", 13002, "productId", "cn.gamejelly.gong4_980yj", "sdkId", 16, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    13003, map("id", 13003, "productId", "cn.gamejelly.gong4_1980yj", "sdkId", 16, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    13004, map("id", 13004, "productId", "cn.gamejelly.gong4_3280yj", "sdkId", 16, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    13005, map("id", 13005, "productId", "cn.gamejelly.gong4_6480yj", "sdkId", 16, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    13006, map("id", 13006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 16, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f)
);
    }

    private static void init26() {
data.map(
    13007, map("id", 13007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 16, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    13008, map("id", 13008, "productId", "cn.gamejelly.gong4_10yj", "sdkId", 16, "productKind", 1, "type", 9, "price", 1.0f, "jade", 10, "giveGold", 1, "firstGold", 10, "firstGift", 22015),
    13009, map("id", 13009, "productId", "cn.gamejelly.gong4_32400yj", "sdkId", 16, "productKind", 1, "type", 10, "price", 3240.0f, "jade", 32400, "giveGold", 10325, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 200),
    13010, map("id", 13010, "productId", "cn.gamejelly.gong.gong4_36000yj", "sdkId", 16, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    14000, map("id", 14000, "productId", "cn.gamejelly.gong5_60yj", "sdkId", 17, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015)
);
    }

    private static void init27() {
data.map(
    14001, map("id", 14001, "productId", "cn.gamejelly.gong5_300yj", "sdkId", 17, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    14002, map("id", 14002, "productId", "cn.gamejelly.gong5_980yj", "sdkId", 17, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    14003, map("id", 14003, "productId", "cn.gamejelly.gong5_1980yj", "sdkId", 17, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    14004, map("id", 14004, "productId", "cn.gamejelly.gong5_3280yj", "sdkId", 17, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    14005, map("id", 14005, "productId", "cn.gamejelly.gong5_6480yj", "sdkId", 17, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init28() {
data.map(
    14006, map("id", 14006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 17, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    14007, map("id", 14007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 17, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    14008, map("id", 14008, "productId", "cn.gamejelly.gong5_10yj", "sdkId", 17, "productKind", 1, "type", 9, "price", 1.0f, "jade", 10, "giveGold", 1, "firstGold", 10, "firstGift", 22015),
    14009, map("id", 14009, "productId", "cn.gamejelly.gong5_32400yj", "sdkId", 17, "productKind", 1, "type", 10, "price", 3240.0f, "jade", 32400, "giveGold", 10325, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 200),
    14010, map("id", 14010, "productId", "cn.gamejelly.gong.gong5_36000yj", "sdkId", 17, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12)
);
    }

    private static void init29() {
data.map(
    15000, map("id", 15000, "productId", "cn.gamejelly.gong6_60yj", "sdkId", 18, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    15001, map("id", 15001, "productId", "cn.gamejelly.gong6_300yj", "sdkId", 18, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    15002, map("id", 15002, "productId", "cn.gamejelly.gong6_980yj", "sdkId", 18, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    15003, map("id", 15003, "productId", "cn.gamejelly.gong6_1980yj", "sdkId", 18, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    15004, map("id", 15004, "productId", "cn.gamejelly.gong6_3280yj", "sdkId", 18, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init30() {
data.map(
    15005, map("id", 15005, "productId", "cn.gamejelly.gong6_6480yj", "sdkId", 18, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    15006, map("id", 15006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 18, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    15007, map("id", 15007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 18, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    15008, map("id", 15008, "productId", "cn.gamejelly.gong6_10yj", "sdkId", 18, "productKind", 1, "type", 9, "price", 1.0f, "jade", 10, "giveGold", 1, "firstGold", 10, "firstGift", 22015),
    15009, map("id", 15009, "productId", "cn.gamejelly.gong6_32400yj", "sdkId", 18, "productKind", 1, "type", 10, "price", 3240.0f, "jade", 32400, "giveGold", 10325, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 200)
);
    }

    private static void init31() {
data.map(
    15010, map("id", 15010, "productId", "cn.gamejelly.gong.gong6_36000yj", "sdkId", 18, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    16000, map("id", 16000, "productId", "cn.gamejelly.gong7_60yj", "sdkId", 19, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    16001, map("id", 16001, "productId", "cn.gamejelly.gong7_300yj", "sdkId", 19, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    16002, map("id", 16002, "productId", "cn.gamejelly.gong7_980yj", "sdkId", 19, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    16003, map("id", 16003, "productId", "cn.gamejelly.gong7_1980yj", "sdkId", 19, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init32() {
data.map(
    16004, map("id", 16004, "productId", "cn.gamejelly.gong7_3280yj", "sdkId", 19, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    16005, map("id", 16005, "productId", "cn.gamejelly.gong7_6480yj", "sdkId", 19, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    16006, map("id", 16006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 19, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    16007, map("id", 16007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 19, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    16008, map("id", 16008, "productId", "cn.gamejelly.gong7_10yj", "sdkId", 19, "productKind", 1, "type", 9, "price", 1.0f, "jade", 10, "giveGold", 1, "firstGold", 10, "firstGift", 22015)
);
    }

    private static void init33() {
data.map(
    16009, map("id", 16009, "productId", "cn.gamejelly.gong7_32400yj", "sdkId", 19, "productKind", 1, "type", 10, "price", 3240.0f, "jade", 32400, "giveGold", 10325, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 200),
    16010, map("id", 16010, "productId", "cn.gamejelly.gong.gong7_36000yj", "sdkId", 19, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    17000, map("id", 17000, "productId", "cn.gamejelly.gong8_60yj", "sdkId", 20, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    17001, map("id", 17001, "productId", "cn.gamejelly.gong8_300yj", "sdkId", 20, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    17002, map("id", 17002, "productId", "cn.gamejelly.gong8_980yj", "sdkId", 20, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init34() {
data.map(
    17003, map("id", 17003, "productId", "cn.gamejelly.gong8_1980yj", "sdkId", 20, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    17004, map("id", 17004, "productId", "cn.gamejelly.gong8_3280yj", "sdkId", 20, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    17005, map("id", 17005, "productId", "cn.gamejelly.gong8_6480yj", "sdkId", 20, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    17006, map("id", 17006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 20, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    17007, map("id", 17007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 20, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f)
);
    }

    private static void init35() {
data.map(
    17008, map("id", 17008, "productId", "cn.gamejelly.gong8_10yj", "sdkId", 20, "productKind", 1, "type", 9, "price", 1.0f, "jade", 10, "giveGold", 1, "firstGold", 10, "firstGift", 22015),
    17009, map("id", 17009, "productId", "cn.gamejelly.gong8_32400yj", "sdkId", 20, "productKind", 1, "type", 10, "price", 3240.0f, "jade", 32400, "giveGold", 10325, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 200),
    17010, map("id", 17010, "productId", "cn.gamejelly.gong.gong8_36000yj", "sdkId", 20, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    18000, map("id", 18000, "productId", "cn.gamejelly.gong9_60yj", "sdkId", 21, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    18001, map("id", 18001, "productId", "cn.gamejelly.gong9_300yj", "sdkId", 21, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init36() {
data.map(
    18002, map("id", 18002, "productId", "cn.gamejelly.gong9_980yj", "sdkId", 21, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    18003, map("id", 18003, "productId", "cn.gamejelly.gong9_1980yj", "sdkId", 21, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    18004, map("id", 18004, "productId", "cn.gamejelly.gong9_3280yj", "sdkId", 21, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    18005, map("id", 18005, "productId", "cn.gamejelly.gong9_6480yj", "sdkId", 21, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    18006, map("id", 18006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 21, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f)
);
    }

    private static void init37() {
data.map(
    18007, map("id", 18007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 21, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    18008, map("id", 18008, "productId", "cn.gamejelly.gong9_10yj", "sdkId", 21, "productKind", 1, "type", 9, "price", 1.0f, "jade", 10, "giveGold", 1, "firstGold", 10, "firstGift", 22015),
    18009, map("id", 18009, "productId", "cn.gamejelly.gong9_32400yj", "sdkId", 21, "productKind", 1, "type", 10, "price", 3240.0f, "jade", 32400, "giveGold", 10325, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 200),
    18010, map("id", 18010, "productId", "cn.gamejelly.gong.gong9_36000yj", "sdkId", 21, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    19000, map("id", 19000, "productId", "cn.gamejelly.gong10_60yj", "sdkId", 22, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015)
);
    }

    private static void init38() {
data.map(
    19001, map("id", 19001, "productId", "cn.gamejelly.gong10_300yj", "sdkId", 22, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    19002, map("id", 19002, "productId", "cn.gamejelly.gong10_980yj", "sdkId", 22, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    19003, map("id", 19003, "productId", "cn.gamejelly.gong10_1980yj", "sdkId", 22, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    19004, map("id", 19004, "productId", "cn.gamejelly.gong10_3280yj", "sdkId", 22, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    19005, map("id", 19005, "productId", "cn.gamejelly.gong10_6480yj", "sdkId", 22, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init39() {
data.map(
    19006, map("id", 19006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 22, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    19007, map("id", 19007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 22, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    19008, map("id", 19008, "productId", "cn.gamejelly.gong10_10yj", "sdkId", 22, "productKind", 1, "type", 9, "price", 1.0f, "jade", 10, "giveGold", 1, "firstGold", 10, "firstGift", 22015),
    19009, map("id", 19009, "productId", "cn.gamejelly.gong10_32400yj", "sdkId", 22, "productKind", 1, "type", 10, "price", 3240.0f, "jade", 32400, "giveGold", 10325, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 200),
    19010, map("id", 19010, "productId", "cn.gamejelly.gong.gong10_36000yj", "sdkId", 22, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12)
);
    }

    private static void init40() {
data.map(
    20000, map("id", 20000, "productId", "cn.gamejelly.gong11_60yj", "sdkId", 23, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    20001, map("id", 20001, "productId", "cn.gamejelly.gong11_300yj", "sdkId", 23, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    20002, map("id", 20002, "productId", "cn.gamejelly.gong11_980yj", "sdkId", 23, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    20003, map("id", 20003, "productId", "cn.gamejelly.gong11_1980yj", "sdkId", 23, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    20004, map("id", 20004, "productId", "cn.gamejelly.gong11_3280yj", "sdkId", 23, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init41() {
data.map(
    20005, map("id", 20005, "productId", "cn.gamejelly.gong11_6480yj", "sdkId", 23, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    20006, map("id", 20006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 23, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    20007, map("id", 20007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 23, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    20008, map("id", 20008, "productId", "cn.gamejelly.gong11_10yj", "sdkId", 23, "productKind", 1, "type", 9, "price", 1.0f, "jade", 10, "giveGold", 1, "firstGold", 10, "firstGift", 22015),
    20009, map("id", 20009, "productId", "cn.gamejelly.gong11_32400yj", "sdkId", 23, "productKind", 1, "type", 10, "price", 3240.0f, "jade", 32400, "giveGold", 10325, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 200)
);
    }

    private static void init42() {
data.map(
    20010, map("id", 20010, "productId", "cn.gamejelly.gong.gong11_36000yj", "sdkId", 23, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    21000, map("id", 21000, "productId", "cn.gamejelly.gong12_60yj", "sdkId", 24, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    21001, map("id", 21001, "productId", "cn.gamejelly.gong12_300yj", "sdkId", 24, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    21002, map("id", 21002, "productId", "cn.gamejelly.gong12_980yj", "sdkId", 24, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    21003, map("id", 21003, "productId", "cn.gamejelly.gong12_1980yj", "sdkId", 24, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init43() {
data.map(
    21004, map("id", 21004, "productId", "cn.gamejelly.gong12_3280yj", "sdkId", 24, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    21005, map("id", 21005, "productId", "cn.gamejelly.gong12_6480yj", "sdkId", 24, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    21006, map("id", 21006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 24, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    21007, map("id", 21007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 24, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    21008, map("id", 21008, "productId", "cn.gamejelly.gong12_10yj", "sdkId", 24, "productKind", 1, "type", 9, "price", 1.0f, "jade", 10, "giveGold", 1, "firstGold", 10, "firstGift", 22015)
);
    }

    private static void init44() {
data.map(
    21009, map("id", 21009, "productId", "cn.gamejelly.gong12_32400yj", "sdkId", 24, "productKind", 1, "type", 10, "price", 3240.0f, "jade", 32400, "giveGold", 10325, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 200),
    21010, map("id", 21010, "productId", "cn.gamejelly.gong.gong12_36000yj", "sdkId", 24, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    22000, map("id", 22000, "productId", "cn.gamejelly.gong13_60yj", "sdkId", 25, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    22001, map("id", 22001, "productId", "cn.gamejelly.gong13_300yj", "sdkId", 25, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    22002, map("id", 22002, "productId", "cn.gamejelly.gong13_980yj", "sdkId", 25, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init45() {
data.map(
    22003, map("id", 22003, "productId", "cn.gamejelly.gong13_1980yj", "sdkId", 25, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    22004, map("id", 22004, "productId", "cn.gamejelly.gong13_3280yj", "sdkId", 25, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    22005, map("id", 22005, "productId", "cn.gamejelly.gong13_6480yj", "sdkId", 25, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    22006, map("id", 22006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 25, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    22007, map("id", 22007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 25, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f)
);
    }

    private static void init46() {
data.map(
    22008, map("id", 22008, "productId", "cn.gamejelly.gong13_10yj", "sdkId", 25, "productKind", 1, "type", 9, "price", 1.0f, "jade", 10, "giveGold", 1, "firstGold", 10, "firstGift", 22015),
    22009, map("id", 22009, "productId", "cn.gamejelly.gong13_32400yj", "sdkId", 25, "productKind", 1, "type", 10, "price", 3240.0f, "jade", 32400, "giveGold", 10325, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 200),
    22010, map("id", 22010, "productId", "cn.gamejelly.gong.gong13_36000yj", "sdkId", 25, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    23000, map("id", 23000, "productId", "cn.gamejelly.gong14_60yj", "sdkId", 26, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    23001, map("id", 23001, "productId", "cn.gamejelly.gong14_300yj", "sdkId", 26, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init47() {
data.map(
    23002, map("id", 23002, "productId", "cn.gamejelly.gong14_980yj", "sdkId", 26, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    23003, map("id", 23003, "productId", "cn.gamejelly.gong14_1980yj", "sdkId", 26, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    23004, map("id", 23004, "productId", "cn.gamejelly.gong14_3280yj", "sdkId", 26, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    23005, map("id", 23005, "productId", "cn.gamejelly.gong14_6480yj", "sdkId", 26, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    23006, map("id", 23006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 26, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f)
);
    }

    private static void init48() {
data.map(
    23007, map("id", 23007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 26, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    23008, map("id", 23008, "productId", "cn.gamejelly.gong14_10yj", "sdkId", 26, "productKind", 1, "type", 9, "price", 1.0f, "jade", 10, "giveGold", 1, "firstGold", 10, "firstGift", 22015),
    23009, map("id", 23009, "productId", "cn.gamejelly.gong14_32400yj", "sdkId", 26, "productKind", 1, "type", 10, "price", 3240.0f, "jade", 32400, "giveGold", 10325, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 200),
    23010, map("id", 23010, "productId", "cn.gamejelly.gong.gong14_36000yj", "sdkId", 26, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    24000, map("id", 24000, "productId", "cn.guodong.gong15_60yj", "sdkId", 27, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015)
);
    }

    private static void init49() {
data.map(
    24001, map("id", 24001, "productId", "cn.guodong.gong15_300yj", "sdkId", 27, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    24002, map("id", 24002, "productId", "cn.guodong.gong15_980yj", "sdkId", 27, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    24003, map("id", 24003, "productId", "cn.guodong.gong15_1980yj", "sdkId", 27, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    24004, map("id", 24004, "productId", "cn.guodong.gong15_3280yj", "sdkId", 27, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    24005, map("id", 24005, "productId", "cn.guodong.gong15_6480yj", "sdkId", 27, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init50() {
data.map(
    24006, map("id", 24006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 27, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    24007, map("id", 24007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 27, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    24008, map("id", 24008, "productId", "cn.guodong.gong15_10yj", "sdkId", 27, "productKind", 1, "type", 9, "price", 1.0f, "jade", 10, "giveGold", 1, "firstGold", 10, "firstGift", 22015),
    24009, map("id", 24009, "productId", "cn.guodong.gong15_32400yj", "sdkId", 27, "productKind", 1, "type", 10, "price", 3240.0f, "jade", 32400, "giveGold", 10325, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 200),
    24010, map("id", 24010, "productId", "cn.guodong.gong.gong15_36000yj", "sdkId", 27, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12)
);
    }

    private static void init51() {
data.map(
    25000, map("id", 25000, "productId", "cn.gamejelly.gong16_60yj", "sdkId", 28, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    25001, map("id", 25001, "productId", "cn.gamejelly.gong16_300yj", "sdkId", 28, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    25002, map("id", 25002, "productId", "cn.gamejelly.gong16_980yj", "sdkId", 28, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    25003, map("id", 25003, "productId", "cn.gamejelly.gong16_1980yj", "sdkId", 28, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    25004, map("id", 25004, "productId", "cn.gamejelly.gong16_3280yj", "sdkId", 28, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init52() {
data.map(
    25005, map("id", 25005, "productId", "cn.gamejelly.gong16_6480yj", "sdkId", 28, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    25006, map("id", 25006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 28, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    25007, map("id", 25007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 28, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    25008, map("id", 25008, "productId", "cn.gamejelly.gong16_10yj", "sdkId", 28, "productKind", 1, "type", 9, "price", 1.0f, "jade", 10, "giveGold", 1, "firstGold", 10, "firstGift", 22015),
    25009, map("id", 25009, "productId", "cn.gamejelly.gong16_32400yj", "sdkId", 28, "productKind", 1, "type", 10, "price", 3240.0f, "jade", 32400, "giveGold", 10325, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 200)
);
    }

    private static void init53() {
data.map(
    25010, map("id", 25010, "productId", "cn.gamejelly.gong.gong16_36000yj", "sdkId", 28, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    26000, map("id", 26000, "productId", "cn.suzhou.guodong_60yj", "sdkId", 29, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    26001, map("id", 26001, "productId", "cn.suzhou.guodong_300yj", "sdkId", 29, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    26002, map("id", 26002, "productId", "cn.suzhou.guodong_980yj", "sdkId", 29, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    26003, map("id", 26003, "productId", "cn.suzhou.guodong_1980yj", "sdkId", 29, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init54() {
data.map(
    26004, map("id", 26004, "productId", "cn.suzhou.guodong_3280yj", "sdkId", 29, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    26005, map("id", 26005, "productId", "cn.suzhou.guodong_6480yj", "sdkId", 29, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    26006, map("id", 26006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 29, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    26007, map("id", 26007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 29, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    26008, map("id", 26008, "productId", "cn.suzhou.guodong_10yj", "sdkId", 29, "productKind", 1, "type", 9, "price", 1.0f, "jade", 10, "giveGold", 1, "firstGold", 10, "firstGift", 22015)
);
    }

    private static void init55() {
data.map(
    26009, map("id", 26009, "productId", "cn.suzhou.guodong_32400yj", "sdkId", 29, "productKind", 1, "type", 10, "price", 3240.0f, "jade", 32400, "giveGold", 10325, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 200),
    26010, map("id", 26010, "productId", "cn.suzhou.guodong_36000yj", "sdkId", 29, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    27000, map("id", 27000, "productId", "cn.youxi.guodong_60yj", "sdkId", 30, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    27001, map("id", 27001, "productId", "cn.youxi.guodong_300yj", "sdkId", 30, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    27002, map("id", 27002, "productId", "cn.youxi.guodong_980yj", "sdkId", 30, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init56() {
data.map(
    27003, map("id", 27003, "productId", "cn.youxi.guodong_1980yj", "sdkId", 30, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    27004, map("id", 27004, "productId", "cn.youxi.guodong_3280yj", "sdkId", 30, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    27005, map("id", 27005, "productId", "cn.youxi.guodong_6480yj", "sdkId", 30, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    27006, map("id", 27006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 30, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    27007, map("id", 27007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 30, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f)
);
    }

    private static void init57() {
data.map(
    27008, map("id", 27008, "productId", "cn.youxi.guodong_10yj", "sdkId", 30, "productKind", 1, "type", 9, "price", 1.0f, "jade", 10, "giveGold", 1, "firstGold", 10, "firstGift", 22015),
    27009, map("id", 27009, "productId", "cn.youxi.guodong_32400yj", "sdkId", 30, "productKind", 1, "type", 10, "price", 3240.0f, "jade", 32400, "giveGold", 10325, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 200),
    27010, map("id", 27010, "productId", "cn.youxi.guodong_36000yj", "sdkId", 30, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    28000, map("id", 28000, "productId", "cn.guodong.gong19_60yj", "sdkId", 31, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    28001, map("id", 28001, "productId", "cn.guodong.gong19_300yj", "sdkId", 31, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init58() {
data.map(
    28002, map("id", 28002, "productId", "cn.guodong.gong19_980yj", "sdkId", 31, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    28003, map("id", 28003, "productId", "cn.guodong.gong19_1980yj", "sdkId", 31, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    28004, map("id", 28004, "productId", "cn.guodong.gong19_3280yj", "sdkId", 31, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    28005, map("id", 28005, "productId", "cn.guodong.gong19_6480yj", "sdkId", 31, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    28006, map("id", 28006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 31, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f)
);
    }

    private static void init59() {
data.map(
    28007, map("id", 28007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 31, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    28008, map("id", 28008, "productId", "cn.guodong.gong19_10yj", "sdkId", 31, "productKind", 1, "type", 9, "price", 1.0f, "jade", 10, "giveGold", 1, "firstGold", 10, "firstGift", 22015),
    28009, map("id", 28009, "productId", "cn.guodong.gong19_32400yj", "sdkId", 31, "productKind", 1, "type", 10, "price", 3240.0f, "jade", 32400, "giveGold", 10325, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 200),
    28010, map("id", 28010, "productId", "cn.guodong.gong.gong19_36000yj", "sdkId", 31, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    29000, map("id", 29000, "productId", "cn.guodong.gong20_60yj", "sdkId", 32, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015)
);
    }

    private static void init60() {
data.map(
    29001, map("id", 29001, "productId", "cn.guodong.gong20_300yj", "sdkId", 32, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    29002, map("id", 29002, "productId", "cn.guodong.gong20_980yj", "sdkId", 32, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    29003, map("id", 29003, "productId", "cn.guodong.gong20_1980yj", "sdkId", 32, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    29004, map("id", 29004, "productId", "cn.guodong.gong20_3280yj", "sdkId", 32, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    29005, map("id", 29005, "productId", "cn.guodong.gong20_6480yj", "sdkId", 32, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init61() {
data.map(
    29006, map("id", 29006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 32, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    29007, map("id", 29007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 32, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    29008, map("id", 29008, "productId", "cn.guodong.gong20_10yj", "sdkId", 32, "productKind", 1, "type", 9, "price", 1.0f, "jade", 10, "giveGold", 1, "firstGold", 10, "firstGift", 22015),
    29009, map("id", 29009, "productId", "cn.guodong.gong20_32400yj", "sdkId", 32, "productKind", 1, "type", 10, "price", 3240.0f, "jade", 32400, "giveGold", 10325, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 200),
    29010, map("id", 29010, "productId", "cn.guodong.gong.gong20_36000yj", "sdkId", 32, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12)
);
    }

    private static void init62() {
data.map(
    30000, map("id", 30000, "productId", "cn.guodong.gong21_60yj", "sdkId", 33, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    30001, map("id", 30001, "productId", "cn.guodong.gong21_300yj", "sdkId", 33, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    30002, map("id", 30002, "productId", "cn.guodong.gong21_980yj", "sdkId", 33, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    30003, map("id", 30003, "productId", "cn.guodong.gong21_1980yj", "sdkId", 33, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    30004, map("id", 30004, "productId", "cn.guodong.gong21_3280yj", "sdkId", 33, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init63() {
data.map(
    30005, map("id", 30005, "productId", "cn.guodong.gong21_6480yj", "sdkId", 33, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    30006, map("id", 30006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 33, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    30007, map("id", 30007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 33, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    30008, map("id", 30008, "productId", "cn.guodong.gong21_10yj", "sdkId", 33, "productKind", 1, "type", 9, "price", 1.0f, "jade", 10, "giveGold", 1, "firstGold", 10, "firstGift", 22015),
    30009, map("id", 30009, "productId", "cn.guodong.gong21_32400yj", "sdkId", 33, "productKind", 1, "type", 10, "price", 3240.0f, "jade", 32400, "giveGold", 10325, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 200)
);
    }

    private static void init64() {
data.map(
    30010, map("id", 30010, "productId", "cn.guodong.gong.gong21_36000yj", "sdkId", 33, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    31000, map("id", 31000, "productId", "cn.sz.wonderful_60yj", "sdkId", 34, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    31001, map("id", 31001, "productId", "cn.sz.wonderful_300yj", "sdkId", 34, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    31002, map("id", 31002, "productId", "cn.sz.wonderful_980yj", "sdkId", 34, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    31003, map("id", 31003, "productId", "cn.sz.wonderful_1980yj", "sdkId", 34, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init65() {
data.map(
    31004, map("id", 31004, "productId", "cn.sz.wonderful_3280yj", "sdkId", 34, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    31005, map("id", 31005, "productId", "cn.sz.wonderful_6480yj", "sdkId", 34, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    31008, map("id", 31008, "productId", "cn.sz.wonderful_10yj", "sdkId", 34, "productKind", 1, "type", 9, "price", 1.0f, "jade", 10, "giveGold", 1, "firstGold", 10, "firstGift", 22015),
    32000, map("id", 32000, "productId", "cn.guodong.gong23_60yj", "sdkId", 35, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    32001, map("id", 32001, "productId", "cn.guodong.gong23_300yj", "sdkId", 35, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init66() {
data.map(
    32002, map("id", 32002, "productId", "cn.guodong.gong23_980yj", "sdkId", 35, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    32003, map("id", 32003, "productId", "cn.guodong.gong23_1980yj", "sdkId", 35, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    32004, map("id", 32004, "productId", "cn.guodong.gong23_3280yj", "sdkId", 35, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    32005, map("id", 32005, "productId", "cn.guodong.gong23_6480yj", "sdkId", 35, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    32006, map("id", 32006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 35, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f)
);
    }

    private static void init67() {
data.map(
    32007, map("id", 32007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 35, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    32008, map("id", 32008, "productId", "cn.guodong.gong23_10yj", "sdkId", 35, "productKind", 1, "type", 9, "price", 1.0f, "jade", 10, "giveGold", 1, "firstGold", 10, "firstGift", 22015),
    32009, map("id", 32009, "productId", "cn.guodong.gong23_32400yj", "sdkId", 35, "productKind", 1, "type", 10, "price", 3240.0f, "jade", 32400, "giveGold", 10325, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 200),
    32010, map("id", 32010, "productId", "cn.guodong.gong.gong23_36000yj", "sdkId", 35, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    33000, map("id", 33000, "productId", "cn.guodong.gong24_60yj", "sdkId", 36, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015)
);
    }

    private static void init68() {
data.map(
    33001, map("id", 33001, "productId", "cn.guodong.gong24_300yj", "sdkId", 36, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    33002, map("id", 33002, "productId", "cn.guodong.gong24_980yj", "sdkId", 36, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    33003, map("id", 33003, "productId", "cn.guodong.gong24_1980yj", "sdkId", 36, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    33004, map("id", 33004, "productId", "cn.guodong.gong24_3280yj", "sdkId", 36, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    33005, map("id", 33005, "productId", "cn.guodong.gong24_6480yj", "sdkId", 36, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init69() {
data.map(
    33006, map("id", 33006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 36, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    33007, map("id", 33007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 36, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    33008, map("id", 33008, "productId", "cn.guodong.gong24_10yj", "sdkId", 36, "productKind", 1, "type", 9, "price", 1.0f, "jade", 10, "giveGold", 1, "firstGold", 10, "firstGift", 22015),
    33009, map("id", 33009, "productId", "cn.guodong.gong24_32400yj", "sdkId", 36, "productKind", 1, "type", 10, "price", 3240.0f, "jade", 32400, "giveGold", 10325, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 200),
    33010, map("id", 33010, "productId", "cn.guodong.gong.gong24_36000yj", "sdkId", 36, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12)
);
    }

    private static void init70() {
data.map(
    34000, map("id", 34000, "productId", "cn.guodong.gong25_60yj", "sdkId", 37, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    34001, map("id", 34001, "productId", "cn.guodong.gong25_300yj", "sdkId", 37, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    34002, map("id", 34002, "productId", "cn.guodong.gong25_980yj", "sdkId", 37, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    34003, map("id", 34003, "productId", "cn.guodong.gong25_1980yj", "sdkId", 37, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    34004, map("id", 34004, "productId", "cn.guodong.gong25_3280yj", "sdkId", 37, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init71() {
data.map(
    34005, map("id", 34005, "productId", "cn.guodong.gong25_6480yj", "sdkId", 37, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    34006, map("id", 34006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 37, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    34007, map("id", 34007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 37, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    34008, map("id", 34008, "productId", "cn.guodong.gong25_10yj", "sdkId", 37, "productKind", 1, "type", 9, "price", 1.0f, "jade", 10, "giveGold", 1, "firstGold", 10, "firstGift", 22015),
    34009, map("id", 34009, "productId", "cn.guodong.gong25_32500yj", "sdkId", 37, "productKind", 1, "type", 10, "price", 3240.0f, "jade", 32400, "giveGold", 10325, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 200)
);
    }

    private static void init72() {
data.map(
    34010, map("id", 34010, "productId", "cn.guodong.gong.gong25_36000yj", "sdkId", 37, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    35000, map("id", 35000, "productId", "cn.guodong.gong27_60yj", "sdkId", 39, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    35001, map("id", 35001, "productId", "cn.guodong.gong27_300yj", "sdkId", 39, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    35002, map("id", 35002, "productId", "cn.guodong.gong27_980yj", "sdkId", 39, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    35003, map("id", 35003, "productId", "cn.guodong.gong27_1980yj", "sdkId", 39, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init73() {
data.map(
    35004, map("id", 35004, "productId", "cn.guodong.gong27_3280yj", "sdkId", 39, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    35005, map("id", 35005, "productId", "cn.guodong.gong27_6480yj", "sdkId", 39, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    35006, map("id", 35006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 39, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    35007, map("id", 35007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 39, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    35008, map("id", 35008, "productId", "cn.guodong.gong27_10yj", "sdkId", 39, "productKind", 1, "type", 9, "price", 1.0f, "jade", 10, "giveGold", 1, "firstGold", 10, "firstGift", 22015)
);
    }

    private static void init74() {
data.map(
    35009, map("id", 35009, "productId", "cn.guodong.gong27_32500yj", "sdkId", 39, "productKind", 1, "type", 10, "price", 3240.0f, "jade", 32400, "giveGold", 10325, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 200),
    35010, map("id", 35010, "productId", "cn.guodong.gong.gong27_36000yj", "sdkId", 39, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    36000, map("id", 36000, "productId", "cn.guodong.gong28_60yj", "sdkId", 40, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    36001, map("id", 36001, "productId", "cn.guodong.gong28_300yj", "sdkId", 40, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    36002, map("id", 36002, "productId", "cn.guodong.gong28_980yj", "sdkId", 40, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init75() {
data.map(
    36003, map("id", 36003, "productId", "cn.guodong.gong28_1980yj", "sdkId", 40, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    36004, map("id", 36004, "productId", "cn.guodong.gong28_3280yj", "sdkId", 40, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    36005, map("id", 36005, "productId", "cn.guodong.gong28_6480yj", "sdkId", 40, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    36006, map("id", 36006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 40, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    36007, map("id", 36007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 40, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f)
);
    }

    private static void init76() {
data.map(
    36008, map("id", 36008, "productId", "cn.guodong.gong28_10yj", "sdkId", 40, "productKind", 1, "type", 9, "price", 1.0f, "jade", 10, "giveGold", 1, "firstGold", 10, "firstGift", 22015),
    36009, map("id", 36009, "productId", "cn.guodong.gong28_32500yj", "sdkId", 40, "productKind", 1, "type", 10, "price", 3240.0f, "jade", 32400, "giveGold", 10325, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 200),
    36010, map("id", 36010, "productId", "cn.guodong.gong.gong28_36000yj", "sdkId", 40, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    36011, map("id", 36011, "productId", "cn.guodong.gong29_60yj", "sdkId", 41, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    36012, map("id", 36012, "productId", "cn.guodong.gong29_300yj", "sdkId", 41, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init77() {
data.map(
    36013, map("id", 36013, "productId", "cn.guodong.gong29_980yj", "sdkId", 41, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    36014, map("id", 36014, "productId", "cn.guodong.gong29_1980yj", "sdkId", 41, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    36015, map("id", 36015, "productId", "cn.guodong.gong29_3280yj", "sdkId", 41, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    36016, map("id", 36016, "productId", "cn.guodong.gong29_6480yj", "sdkId", 41, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    36017, map("id", 36017, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 41, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f)
);
    }

    private static void init78() {
data.map(
    36018, map("id", 36018, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 41, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    36019, map("id", 36019, "productId", "cn.guodong.gong29_10yj", "sdkId", 41, "productKind", 1, "type", 9, "price", 1.0f, "jade", 10, "giveGold", 1, "firstGold", 10, "firstGift", 22015),
    36020, map("id", 36020, "productId", "cn.guodong.gong29_32400yj", "sdkId", 41, "productKind", 1, "type", 10, "price", 3240.0f, "jade", 32400, "giveGold", 10325, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 200),
    36021, map("id", 36021, "productId", "cn.guodong.gong.gong29_36000yj", "sdkId", 41, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    40000, map("id", 40000, "productId", "cn.gamejelly.gong.appstore_60yj", "sdkId", 2000, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", list(12000, 12001, 12002), "firstNum", list(3, 5, 10), "firstIcon", 1000, "zfbGive", 0.05f)
);
    }

    private static void init79() {
data.map(
    40001, map("id", 40001, "productId", "cn.gamejelly.gong.appstore_300yj", "sdkId", 2000, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", list(12000, 12001, 12002), "firstNum", list(3, 5, 10), "firstIcon", 1001, "SecondGift", list(12000, 12001, 12002), "SecondNum", list(3, 5, 10), "SecondIcon", 1001, "zfbGive", 0.05f),
    40002, map("id", 40002, "productId", "cn.gamejelly.gong.appstore_980yj", "sdkId", 2000, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", list(12000, 12001, 12002), "firstNum", list(3, 5, 10), "firstIcon", 1002, "SecondGift", list(12000, 12001, 12002), "SecondNum", list(3, 5, 10), "SecondIcon", 1002, "zfbGive", 0.05f),
    40003, map("id", 40003, "productId", "cn.gamejelly.gong.appstore_1980yj", "sdkId", 2000, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", list(12000, 12001, 12002), "firstNum", list(3, 5, 10), "firstIcon", 1003, "SecondGift", list(12000, 12001, 12002), "SecondNum", list(3, 5, 10), "SecondIcon", 1003, "zfbGive", 0.05f),
    40004, map("id", 40004, "productId", "cn.gamejelly.gong.appstore_3280yj", "sdkId", 2000, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", list(12000, 12001, 12002), "firstNum", list(3, 5, 10), "firstIcon", 1004, "SecondGift", list(12000, 12001, 12002), "SecondNum", list(3, 5, 10), "SecondIcon", 1004, "zfbGive", 0.05f),
    40005, map("id", 40005, "productId", "cn.gamejelly.gong.appstore_6480yj", "sdkId", 2000, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", list(12000, 12001, 12002), "firstNum", list(3, 5, 10), "firstIcon", 1005, "SecondGift", list(12000, 12001, 12002), "SecondNum", list(3, 5, 10), "SecondIcon", 1005, "zfbGive", 0.05f)
);
    }

    private static void init80() {
data.map(
    40006, map("id", 40006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 2000, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    40007, map("id", 40007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 2000, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    100000, map("id", 100000, "productId", "cn.gamejelly.gong.uc_60yj", "sdkId", 117, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    100001, map("id", 100001, "productId", "cn.gamejelly.gong.uc_300yj", "sdkId", 117, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    100002, map("id", 100002, "productId", "cn.gamejelly.gong.uc_980yj", "sdkId", 117, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init81() {
data.map(
    100003, map("id", 100003, "productId", "cn.gamejelly.gong.uc_1980yj", "sdkId", 117, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    100004, map("id", 100004, "productId", "cn.gamejelly.gong.uc_3280yj", "sdkId", 117, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    100005, map("id", 100005, "productId", "cn.gamejelly.gong.uc_6480yj", "sdkId", 117, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    100006, map("id", 100006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 117, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    100007, map("id", 100007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 117, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f)
);
    }

    private static void init82() {
data.map(
    100008, map("id", 100008, "productId", "cn.gamejelly.gong.uc_36000yj", "sdkId", 117, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    100009, map("id", 100009, "productId", "cn.gamejelly.uc.thgm_10yj", "sdkId", 117, "productKind", 4, "type", 12, "price", 1.0f, "firstGold", 0, "ThirdNum", 500006),
    100010, map("id", 100010, "productId", "cn.gamejelly.uc.thgm_60yj", "sdkId", 117, "productKind", 4, "type", 13, "price", 6.0f, "firstGold", 0, "ThirdNum", 500001),
    100011, map("id", 100011, "productId", "cn.gamejelly.uc.thgm_300yj", "sdkId", 117, "productKind", 4, "type", 14, "price", 30.0f, "firstGold", 0, "ThirdNum", 500000),
    100012, map("id", 100012, "productId", "cn.gamejelly.uc.thgm_980yj", "sdkId", 117, "productKind", 4, "type", 15, "price", 98.0f, "firstGold", 0, "ThirdNum", 500002)
);
    }

    private static void init83() {
data.map(
    100013, map("id", 100013, "productId", "cn.gamejelly.uc.thgm_1980yj", "sdkId", 117, "productKind", 4, "type", 16, "price", 198.0f, "firstGold", 0, "ThirdNum", 500003),
    100014, map("id", 100014, "productId", "cn.gamejelly.uc.thgm_3280yj", "sdkId", 117, "productKind", 4, "type", 17, "price", 328.0f, "firstGold", 0, "ThirdNum", 500004),
    100015, map("id", 100015, "productId", "cn.gamejelly.uc.thgm_6480yj", "sdkId", 117, "productKind", 4, "type", 18, "price", 648.0f, "firstGold", 0, "ThirdNum", 500005),
    101000, map("id", 101000, "productId", "cn.gamejelly.gong.mz_60yj", "sdkId", 146, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    101001, map("id", 101001, "productId", "cn.gamejelly.gong.mz_300yj", "sdkId", 146, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init84() {
data.map(
    101002, map("id", 101002, "productId", "cn.gamejelly.gong.mz_980yj", "sdkId", 146, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    101003, map("id", 101003, "productId", "cn.gamejelly.gong.mz_1980yj", "sdkId", 146, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    101004, map("id", 101004, "productId", "cn.gamejelly.gong.mz_3280yj", "sdkId", 146, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    101005, map("id", 101005, "productId", "cn.gamejelly.gong.mz_6480yj", "sdkId", 146, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    101006, map("id", 101006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 146, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f)
);
    }

    private static void init85() {
data.map(
    101007, map("id", 101007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 146, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    101008, map("id", 101008, "productId", "cn.gamejelly.gong.mz_36000yj", "sdkId", 146, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    101009, map("id", 101009, "productId", "cn.gamejelly.mz.thgm_10yj", "sdkId", 146, "productKind", 4, "type", 12, "price", 1.0f, "firstGold", 0, "ThirdNum", 500006),
    101010, map("id", 101010, "productId", "cn.gamejelly.mz.thgm_60yj", "sdkId", 146, "productKind", 4, "type", 13, "price", 6.0f, "firstGold", 0, "ThirdNum", 500001),
    101011, map("id", 101011, "productId", "cn.gamejelly.mz.thgm_300yj", "sdkId", 146, "productKind", 4, "type", 14, "price", 30.0f, "firstGold", 0, "ThirdNum", 500000)
);
    }

    private static void init86() {
data.map(
    101012, map("id", 101012, "productId", "cn.gamejelly.mz.thgm_980yj", "sdkId", 146, "productKind", 4, "type", 15, "price", 98.0f, "firstGold", 0, "ThirdNum", 500002),
    101013, map("id", 101013, "productId", "cn.gamejelly.mz.thgm_1980yj", "sdkId", 146, "productKind", 4, "type", 16, "price", 198.0f, "firstGold", 0, "ThirdNum", 500003),
    101014, map("id", 101014, "productId", "cn.gamejelly.mz.thgm_3280yj", "sdkId", 146, "productKind", 4, "type", 17, "price", 328.0f, "firstGold", 0, "ThirdNum", 500004),
    101015, map("id", 101015, "productId", "cn.gamejelly.mz.thgm_6480yj", "sdkId", 146, "productKind", 4, "type", 18, "price", 648.0f, "firstGold", 0, "ThirdNum", 500005),
    102000, map("id", 102000, "productId", "cn.gamejelly.gong.mi_60yj", "sdkId", 116, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015)
);
    }

    private static void init87() {
data.map(
    102001, map("id", 102001, "productId", "cn.gamejelly.gong.mi_300yj", "sdkId", 116, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    102002, map("id", 102002, "productId", "cn.gamejelly.gong.mi_980yj", "sdkId", 116, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    102003, map("id", 102003, "productId", "cn.gamejelly.gong.mi_1980yj", "sdkId", 116, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    102004, map("id", 102004, "productId", "cn.gamejelly.gong.mi_3280yj", "sdkId", 116, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    102005, map("id", 102005, "productId", "cn.gamejelly.gong.mi_6480yj", "sdkId", 116, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init88() {
data.map(
    102006, map("id", 102006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 116, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    102007, map("id", 102007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 116, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    102008, map("id", 102008, "productId", "cn.gamejelly.gong.mz_36000yj", "sdkId", 116, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    102009, map("id", 102009, "productId", "cn.gamejelly.mi.thgm_10yj", "sdkId", 116, "productKind", 4, "type", 12, "price", 1.0f, "firstGold", 0, "ThirdNum", 500006),
    102010, map("id", 102010, "productId", "cn.gamejelly.mi.thgm_60yj", "sdkId", 116, "productKind", 4, "type", 13, "price", 6.0f, "firstGold", 0, "ThirdNum", 500001)
);
    }

    private static void init89() {
data.map(
    102011, map("id", 102011, "productId", "cn.gamejelly.mi.thgm_300yj", "sdkId", 116, "productKind", 4, "type", 14, "price", 30.0f, "firstGold", 0, "ThirdNum", 500000),
    102012, map("id", 102012, "productId", "cn.gamejelly.mi.thgm_980yj", "sdkId", 116, "productKind", 4, "type", 15, "price", 98.0f, "firstGold", 0, "ThirdNum", 500002),
    102013, map("id", 102013, "productId", "cn.gamejelly.mi.thgm_1980yj", "sdkId", 116, "productKind", 4, "type", 16, "price", 198.0f, "firstGold", 0, "ThirdNum", 500003),
    102014, map("id", 102014, "productId", "cn.gamejelly.mi.thgm_3280yj", "sdkId", 116, "productKind", 4, "type", 17, "price", 328.0f, "firstGold", 0, "ThirdNum", 500004),
    102015, map("id", 102015, "productId", "cn.gamejelly.mi.thgm_6480yj", "sdkId", 116, "productKind", 4, "type", 18, "price", 648.0f, "firstGold", 0, "ThirdNum", 500005)
);
    }

    private static void init90() {
data.map(
    103000, map("id", 103000, "productId", "cn.gamejelly.gong.oppo_60yj", "sdkId", 122, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    103001, map("id", 103001, "productId", "cn.gamejelly.gong.oppo_300yj", "sdkId", 122, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    103002, map("id", 103002, "productId", "cn.gamejelly.gong.oppo_980yj", "sdkId", 122, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    103003, map("id", 103003, "productId", "cn.gamejelly.gong.oppo_1980yj", "sdkId", 122, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    103004, map("id", 103004, "productId", "cn.gamejelly.gong.oppo_3280yj", "sdkId", 122, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init91() {
data.map(
    103005, map("id", 103005, "productId", "cn.gamejelly.gong.oppo_6480yj", "sdkId", 122, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    103006, map("id", 103006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 122, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    103007, map("id", 103007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 122, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    103008, map("id", 103008, "productId", "cn.gamejelly.gong.oppo_36000yj", "sdkId", 122, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    103009, map("id", 103009, "productId", "cn.gamejelly.oppo.thgm_10yj", "sdkId", 122, "productKind", 4, "type", 12, "price", 1.0f, "firstGold", 0, "ThirdNum", 500006)
);
    }

    private static void init92() {
data.map(
    103010, map("id", 103010, "productId", "cn.gamejelly.oppo.thgm_60yj", "sdkId", 122, "productKind", 4, "type", 13, "price", 6.0f, "firstGold", 0, "ThirdNum", 500001),
    103011, map("id", 103011, "productId", "cn.gamejelly.oppo.thgm_300yj", "sdkId", 122, "productKind", 4, "type", 14, "price", 30.0f, "firstGold", 0, "ThirdNum", 500000),
    103012, map("id", 103012, "productId", "cn.gamejelly.oppo.thgm_980yj", "sdkId", 122, "productKind", 4, "type", 15, "price", 98.0f, "firstGold", 0, "ThirdNum", 500002),
    103013, map("id", 103013, "productId", "cn.gamejelly.oppo.thgm_1980yj", "sdkId", 122, "productKind", 4, "type", 16, "price", 198.0f, "firstGold", 0, "ThirdNum", 500003),
    103014, map("id", 103014, "productId", "cn.gamejelly.oppo.thgm_3280yj", "sdkId", 122, "productKind", 4, "type", 17, "price", 328.0f, "firstGold", 0, "ThirdNum", 500004)
);
    }

    private static void init93() {
data.map(
    103015, map("id", 103015, "productId", "cn.gamejelly.oppo.thgm_6480yj", "sdkId", 122, "productKind", 4, "type", 18, "price", 648.0f, "firstGold", 0, "ThirdNum", 500005),
    104000, map("id", 104000, "productId", "cn.gamejelly.gong.vivo_60yj", "sdkId", 124, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    104001, map("id", 104001, "productId", "cn.gamejelly.gong.vivo_300yj", "sdkId", 124, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    104002, map("id", 104002, "productId", "cn.gamejelly.gong.vivo_980yj", "sdkId", 124, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    104003, map("id", 104003, "productId", "cn.gamejelly.gong.vivo_1980yj", "sdkId", 124, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init94() {
data.map(
    104004, map("id", 104004, "productId", "cn.gamejelly.gong.vivo_3280yj", "sdkId", 124, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    104005, map("id", 104005, "productId", "cn.gamejelly.gong.vivo_6480yj", "sdkId", 124, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    104006, map("id", 104006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 124, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    104007, map("id", 104007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 124, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    104008, map("id", 104008, "productId", "cn.gamejelly.gong.vivo_36000yj", "sdkId", 124, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12)
);
    }

    private static void init95() {
data.map(
    104009, map("id", 104009, "productId", "cn.gamejelly.vivo.thgm_10yj", "sdkId", 124, "productKind", 4, "type", 12, "price", 1.0f, "firstGold", 0, "ThirdNum", 500006),
    104010, map("id", 104010, "productId", "cn.gamejelly.vivo.thgm_60yj", "sdkId", 124, "productKind", 4, "type", 13, "price", 6.0f, "firstGold", 0, "ThirdNum", 500001),
    104011, map("id", 104011, "productId", "cn.gamejelly.vivo.thgm_300yj", "sdkId", 124, "productKind", 4, "type", 14, "price", 30.0f, "firstGold", 0, "ThirdNum", 500000),
    104012, map("id", 104012, "productId", "cn.gamejelly.vivo.thgm_980yj", "sdkId", 124, "productKind", 4, "type", 15, "price", 98.0f, "firstGold", 0, "ThirdNum", 500002),
    104013, map("id", 104013, "productId", "cn.gamejelly.vivo.thgm_1980yj", "sdkId", 124, "productKind", 4, "type", 16, "price", 198.0f, "firstGold", 0, "ThirdNum", 500003)
);
    }

    private static void init96() {
data.map(
    104014, map("id", 104014, "productId", "cn.gamejelly.vivo.thgm_3280yj", "sdkId", 124, "productKind", 4, "type", 17, "price", 328.0f, "firstGold", 0, "ThirdNum", 500004),
    104015, map("id", 104015, "productId", "cn.gamejelly.vivo.thgm_6480yj", "sdkId", 124, "productKind", 4, "type", 18, "price", 648.0f, "firstGold", 0, "ThirdNum", 500005),
    105000, map("id", 105000, "productId", "cn.gamejelly.gong.lx_60yj", "sdkId", 127, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015, "SecondIcon", 115966),
    105001, map("id", 105001, "productId", "cn.gamejelly.gong.lx_300yj", "sdkId", 127, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052, "SecondIcon", 115967),
    105002, map("id", 105002, "productId", "cn.gamejelly.gong.lx_980yj", "sdkId", 127, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052, "SecondIcon", 115968)
);
    }

    private static void init97() {
data.map(
    105003, map("id", 105003, "productId", "cn.gamejelly.gong.lx_1980yj", "sdkId", 127, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052, "SecondIcon", 115969),
    105004, map("id", 105004, "productId", "cn.gamejelly.gong.lx_3280yj", "sdkId", 127, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052, "SecondIcon", 115970),
    105005, map("id", 105005, "productId", "cn.gamejelly.gong.lx_6480yj", "sdkId", 127, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052, "SecondIcon", 115971),
    105006, map("id", 105006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 127, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    105007, map("id", 105007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 127, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f)
);
    }

    private static void init98() {
data.map(
    105008, map("id", 105008, "productId", "cn.gamejelly.gong.lx_36000yj", "sdkId", 127, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    105009, map("id", 105009, "productId", "cn.gamejelly.lx.thgm_10yj", "sdkId", 127, "productKind", 4, "type", 12, "price", 1.0f, "firstGold", 0, "SecondIcon", 172923, "ThirdNum", 500006),
    105010, map("id", 105010, "productId", "cn.gamejelly.lx.thgm_60yj", "sdkId", 127, "productKind", 4, "type", 13, "price", 6.0f, "firstGold", 0, "SecondIcon", 172924, "ThirdNum", 500001),
    105011, map("id", 105011, "productId", "cn.gamejelly.lx.thgm_300yj", "sdkId", 127, "productKind", 4, "type", 14, "price", 30.0f, "firstGold", 0, "SecondIcon", 172925, "ThirdNum", 500000),
    105012, map("id", 105012, "productId", "cn.gamejelly.lx.thgm_980yj", "sdkId", 127, "productKind", 4, "type", 15, "price", 98.0f, "firstGold", 0, "SecondIcon", 172926, "ThirdNum", 500002)
);
    }

    private static void init99() {
data.map(
    105013, map("id", 105013, "productId", "cn.gamejelly.lx.thgm_1980yj", "sdkId", 127, "productKind", 4, "type", 16, "price", 198.0f, "firstGold", 0, "SecondIcon", 172927, "ThirdNum", 500003),
    105014, map("id", 105014, "productId", "cn.gamejelly.lx.thgm_3280yj", "sdkId", 127, "productKind", 4, "type", 17, "price", 328.0f, "firstGold", 0, "SecondIcon", 172928, "ThirdNum", 500004),
    105015, map("id", 105015, "productId", "cn.gamejelly.lx.thgm_6480yj", "sdkId", 127, "productKind", 4, "type", 18, "price", 648.0f, "firstGold", 0, "SecondIcon", 172929, "ThirdNum", 500005),
    106000, map("id", 106000, "productId", "cn.gamejelly.gong.gionee_60yj", "sdkId", 131, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    106001, map("id", 106001, "productId", "cn.gamejelly.gong.gionee_300yj", "sdkId", 131, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init100() {
data.map(
    106002, map("id", 106002, "productId", "cn.gamejelly.gong.gionee_980yj", "sdkId", 131, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    106003, map("id", 106003, "productId", "cn.gamejelly.gong.gionee_1980yj", "sdkId", 131, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    106004, map("id", 106004, "productId", "cn.gamejelly.gong.gionee_3280yj", "sdkId", 131, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    106005, map("id", 106005, "productId", "cn.gamejelly.gong.gionee_6480yj", "sdkId", 131, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    106006, map("id", 106006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 131, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f)
);
    }

    private static void init101() {
data.map(
    106007, map("id", 106007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 131, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    106008, map("id", 106008, "productId", "cn.gamejelly.gong.gionee_36000yj", "sdkId", 131, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    106009, map("id", 106009, "productId", "cn.gamejelly.ginoee.thgm_10yj", "sdkId", 131, "productKind", 4, "type", 12, "price", 1.0f, "firstGold", 0, "ThirdNum", 500006),
    106010, map("id", 106010, "productId", "cn.gamejelly.ginoee.thgm_60yj", "sdkId", 131, "productKind", 4, "type", 13, "price", 6.0f, "firstGold", 0, "ThirdNum", 500001),
    106011, map("id", 106011, "productId", "cn.gamejelly.ginoee.thgm_300yj", "sdkId", 131, "productKind", 4, "type", 14, "price", 30.0f, "firstGold", 0, "ThirdNum", 500000)
);
    }

    private static void init102() {
data.map(
    106012, map("id", 106012, "productId", "cn.gamejelly.ginoee.thgm_980yj", "sdkId", 131, "productKind", 4, "type", 15, "price", 98.0f, "firstGold", 0, "ThirdNum", 500002),
    106013, map("id", 106013, "productId", "cn.gamejelly.ginoee.thgm_1980yj", "sdkId", 131, "productKind", 4, "type", 16, "price", 198.0f, "firstGold", 0, "ThirdNum", 500003),
    106014, map("id", 106014, "productId", "cn.gamejelly.ginoee.thgm_3280yj", "sdkId", 131, "productKind", 4, "type", 17, "price", 328.0f, "firstGold", 0, "ThirdNum", 500004),
    106015, map("id", 106015, "productId", "cn.gamejelly.ginoee.thgm_6480yj", "sdkId", 131, "productKind", 4, "type", 18, "price", 648.0f, "firstGold", 0, "ThirdNum", 500005),
    107000, map("id", 107000, "productId", "cn.gamejelly.gong.huawei_60yj", "sdkId", 119, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015)
);
    }

    private static void init103() {
data.map(
    107001, map("id", 107001, "productId", "cn.gamejelly.gong.huawei_300yj", "sdkId", 119, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    107002, map("id", 107002, "productId", "cn.gamejelly.gong.huawei_980yj", "sdkId", 119, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    107003, map("id", 107003, "productId", "cn.gamejelly.gong.huawei_1980yj", "sdkId", 119, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    107004, map("id", 107004, "productId", "cn.gamejelly.gong.huawei_3280yj", "sdkId", 119, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    107005, map("id", 107005, "productId", "cn.gamejelly.gong.huawei_6480yj", "sdkId", 119, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init104() {
data.map(
    107006, map("id", 107006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 119, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    107007, map("id", 107007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 119, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    107008, map("id", 107008, "productId", "cn.gamejelly.gong.huaiwei_36000yj", "sdkId", 119, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    107009, map("id", 107009, "productId", "cn.gamejelly.huawei.thgm_10yj", "sdkId", 119, "productKind", 4, "type", 12, "price", 1.0f, "firstGold", 0, "ThirdNum", 500006),
    107010, map("id", 107010, "productId", "cn.gamejelly.huawei.thgm_60yj", "sdkId", 119, "productKind", 4, "type", 13, "price", 6.0f, "firstGold", 0, "ThirdNum", 500001)
);
    }

    private static void init105() {
data.map(
    107011, map("id", 107011, "productId", "cn.gamejelly.huawei.thgm_300yj", "sdkId", 119, "productKind", 4, "type", 14, "price", 30.0f, "firstGold", 0, "ThirdNum", 500000),
    107012, map("id", 107012, "productId", "cn.gamejelly.huawei.thgm_980yj", "sdkId", 119, "productKind", 4, "type", 15, "price", 98.0f, "firstGold", 0, "ThirdNum", 500002),
    107013, map("id", 107013, "productId", "cn.gamejelly.huawei.thgm_1980yj", "sdkId", 119, "productKind", 4, "type", 16, "price", 198.0f, "firstGold", 0, "ThirdNum", 500003),
    107014, map("id", 107014, "productId", "cn.gamejelly.huawei.thgm_3280yj", "sdkId", 119, "productKind", 4, "type", 17, "price", 328.0f, "firstGold", 0, "ThirdNum", 500004),
    107015, map("id", 107015, "productId", "cn.gamejelly.huawei.thgm_6480yj", "sdkId", 119, "productKind", 4, "type", 18, "price", 648.0f, "firstGold", 0, "ThirdNum", 500005)
);
    }

    private static void init106() {
data.map(
    108000, map("id", 108000, "productId", "cn.gamejelly.gong.360_60yj", "sdkId", 115, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    108001, map("id", 108001, "productId", "cn.gamejelly.gong.360_300yj", "sdkId", 115, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    108002, map("id", 108002, "productId", "cn.gamejelly.gong.360_980yj", "sdkId", 115, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    108003, map("id", 108003, "productId", "cn.gamejelly.gong.360_1980yj", "sdkId", 115, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    108004, map("id", 108004, "productId", "cn.gamejelly.gong.360_3280yj", "sdkId", 115, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init107() {
data.map(
    108005, map("id", 108005, "productId", "cn.gamejelly.gong.360_6480yj", "sdkId", 115, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    108006, map("id", 108006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 115, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    108007, map("id", 108007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 115, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    108008, map("id", 108008, "productId", "cn.gamejelly.gong.360_36000yj", "sdkId", 115, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    108009, map("id", 108009, "productId", "cn.gamejelly.360.thgm_10yj", "sdkId", 115, "productKind", 4, "type", 12, "price", 1.0f, "firstGold", 0, "ThirdNum", 500006)
);
    }

    private static void init108() {
data.map(
    108010, map("id", 108010, "productId", "cn.gamejelly.360.thgm_60yj", "sdkId", 115, "productKind", 4, "type", 13, "price", 6.0f, "firstGold", 0, "ThirdNum", 500001),
    108011, map("id", 108011, "productId", "cn.gamejelly.360.thgm_300yj", "sdkId", 115, "productKind", 4, "type", 14, "price", 30.0f, "firstGold", 0, "ThirdNum", 500000),
    108012, map("id", 108012, "productId", "cn.gamejelly.360.thgm_980yj", "sdkId", 115, "productKind", 4, "type", 15, "price", 98.0f, "firstGold", 0, "ThirdNum", 500002),
    108013, map("id", 108013, "productId", "cn.gamejelly.360.thgm_1980yj", "sdkId", 115, "productKind", 4, "type", 16, "price", 198.0f, "firstGold", 0, "ThirdNum", 500003),
    108014, map("id", 108014, "productId", "cn.gamejelly.360.thgm_3280yj", "sdkId", 115, "productKind", 4, "type", 17, "price", 328.0f, "firstGold", 0, "ThirdNum", 500004)
);
    }

    private static void init109() {
data.map(
    108015, map("id", 108015, "productId", "cn.gamejelly.360.thgm_6480yj", "sdkId", 115, "productKind", 4, "type", 18, "price", 648.0f, "firstGold", 0, "ThirdNum", 500005),
    109000, map("id", 109000, "productId", "cn.gamejelly.gong.official_60yj", "sdkId", 400, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    109001, map("id", 109001, "productId", "cn.gamejelly.gong.official_300yj", "sdkId", 400, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    109002, map("id", 109002, "productId", "cn.gamejelly.gong.official_980yj", "sdkId", 400, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    109003, map("id", 109003, "productId", "cn.gamejelly.gong.official_1980yj", "sdkId", 400, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init110() {
data.map(
    109004, map("id", 109004, "productId", "cn.gamejelly.gong.official_3280yj", "sdkId", 400, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    109005, map("id", 109005, "productId", "cn.gamejelly.gong.official_6480yj", "sdkId", 400, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    109006, map("id", 109006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 400, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    109007, map("id", 109007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 400, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    109008, map("id", 109008, "productId", "cn.gamejelly.gong.official_36000yj", "sdkId", 400, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12)
);
    }

    private static void init111() {
data.map(
    109009, map("id", 109009, "productId", "cn.gamejelly.gong.official_10yj", "sdkId", 400, "productKind", 1, "type", 9, "price", 1.0f, "jade", 10, "giveGold", 1, "firstGold", 10, "firstGift", 22015),
    110000, map("id", 110000, "productId", "cn.gamejelly.gong.coolpad_60yj", "sdkId", 147, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015, "SecondIcon", 2, "ext", 1),
    110001, map("id", 110001, "productId", "cn.gamejelly.gong.coolpad_300yj", "sdkId", 147, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052, "SecondIcon", 3, "ext", 2),
    110002, map("id", 110002, "productId", "cn.gamejelly.gong.coolpad_980yj", "sdkId", 147, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052, "SecondIcon", 4, "ext", 3),
    110003, map("id", 110003, "productId", "cn.gamejelly.gong.coolpad_1980yj", "sdkId", 147, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052, "SecondIcon", 5, "ext", 4)
);
    }

    private static void init112() {
data.map(
    110004, map("id", 110004, "productId", "cn.gamejelly.gong.coolpad_3280yj", "sdkId", 147, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052, "SecondIcon", 6, "ext", 5),
    110005, map("id", 110005, "productId", "cn.gamejelly.gong.coolpad_6480yj", "sdkId", 147, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052, "SecondIcon", 7, "ext", 6),
    110006, map("id", 110006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 147, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    110007, map("id", 110007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 147, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    110008, map("id", 110008, "productId", "cn.gamejelly.gong.coolpad_36000yj", "sdkId", 147, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12)
);
    }

    private static void init113() {
data.map(
    110009, map("id", 110009, "productId", "cn.gamejelly.coolpad.thgm_10yj", "sdkId", 147, "productKind", 4, "type", 12, "price", 1.0f, "firstGold", 0, "SecondIcon", 10, "ThirdNum", 500006),
    110010, map("id", 110010, "productId", "cn.gamejelly.coolpad.thgm_60yj", "sdkId", 147, "productKind", 4, "type", 13, "price", 6.0f, "firstGold", 0, "SecondIcon", 11, "ThirdNum", 500001),
    110011, map("id", 110011, "productId", "cn.gamejelly.coolpad.thgm_300yj", "sdkId", 147, "productKind", 4, "type", 14, "price", 30.0f, "firstGold", 0, "SecondIcon", 12, "ThirdNum", 500000),
    110012, map("id", 110012, "productId", "cn.gamejelly.coolpad.thgm_980yj", "sdkId", 147, "productKind", 4, "type", 15, "price", 98.0f, "firstGold", 0, "SecondIcon", 13, "ThirdNum", 500002),
    110013, map("id", 110013, "productId", "cn.gamejelly.coolpad.thgm_1980yj", "sdkId", 147, "productKind", 4, "type", 16, "price", 198.0f, "firstGold", 0, "SecondIcon", 14, "ThirdNum", 500003)
);
    }

    private static void init114() {
data.map(
    110014, map("id", 110014, "productId", "cn.gamejelly.coolpad.thgm_3280yj", "sdkId", 147, "productKind", 4, "type", 17, "price", 328.0f, "firstGold", 0, "SecondIcon", 15, "ThirdNum", 500004),
    110015, map("id", 110015, "productId", "cn.gamejelly.coolpad.thgm_6480yj", "sdkId", 147, "productKind", 4, "type", 18, "price", 648.0f, "firstGold", 0, "SecondIcon", 16, "ThirdNum", 500005),
    111000, map("id", 111000, "productId", "com.tencent.tmgp.mygame_60yj", "sdkId", 136, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    111001, map("id", 111001, "productId", "com.tencent.tmgp.mygame_300yj", "sdkId", 136, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    111002, map("id", 111002, "productId", "com.tencent.tmgp.mygame_980yj", "sdkId", 136, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init115() {
data.map(
    111003, map("id", 111003, "productId", "com.tencent.tmgp.mygame_1980yj", "sdkId", 136, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    111004, map("id", 111004, "productId", "com.tencent.tmgp.mygame_3280yj", "sdkId", 136, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    111005, map("id", 111005, "productId", "com.tencent.tmgp.mygame_6480yj", "sdkId", 136, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    111006, map("id", 111006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 136, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    111007, map("id", 111007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 136, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f)
);
    }

    private static void init116() {
data.map(
    111008, map("id", 111008, "productId", "com.tencent.tmgp.mygame_36000yj", "sdkId", 136, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    111009, map("id", 111009, "productId", "com.tencent.tmgp.mygame.thgm_10yj", "sdkId", 136, "productKind", 4, "type", 12, "price", 1.0f, "firstGold", 0, "ThirdNum", 500006),
    111010, map("id", 111010, "productId", "com.tencent.tmgp.mygame.thgm_60yj", "sdkId", 136, "productKind", 4, "type", 13, "price", 6.0f, "firstGold", 0, "ThirdNum", 500001),
    111011, map("id", 111011, "productId", "com.tencent.tmgp.mygame.thgm_300yj", "sdkId", 136, "productKind", 4, "type", 14, "price", 30.0f, "firstGold", 0, "ThirdNum", 500000),
    111012, map("id", 111012, "productId", "com.tencent.tmgp.mygame.thgm_980yj", "sdkId", 136, "productKind", 4, "type", 15, "price", 98.0f, "firstGold", 0, "ThirdNum", 500002)
);
    }

    private static void init117() {
data.map(
    111013, map("id", 111013, "productId", "com.tencent.tmgp.mygame.thgm_1980yj", "sdkId", 136, "productKind", 4, "type", 16, "price", 198.0f, "firstGold", 0, "ThirdNum", 500003),
    111014, map("id", 111014, "productId", "com.tencent.tmgp.mygame.thgm_3280yj", "sdkId", 136, "productKind", 4, "type", 17, "price", 328.0f, "firstGold", 0, "ThirdNum", 500004),
    111015, map("id", 111015, "productId", "com.tencent.tmgp.mygame.thgm_6480yj", "sdkId", 136, "productKind", 4, "type", 18, "price", 648.0f, "firstGold", 0, "ThirdNum", 500005),
    112000, map("id", 112000, "productId", "cn.gamejelly.gong.baidu_60yj", "sdkId", 114, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    112001, map("id", 112001, "productId", "cn.gamejelly.gong.baidu_300yj", "sdkId", 114, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init118() {
data.map(
    112002, map("id", 112002, "productId", "cn.gamejelly.gong.baidu_980yj", "sdkId", 114, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    112003, map("id", 112003, "productId", "cn.gamejelly.gong.baidu_1980yj", "sdkId", 114, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    112004, map("id", 112004, "productId", "cn.gamejelly.gong.baidu_3280yj", "sdkId", 114, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    112005, map("id", 112005, "productId", "cn.gamejelly.gong.baidu_6480yj", "sdkId", 114, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    112006, map("id", 112006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 114, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f)
);
    }

    private static void init119() {
data.map(
    112007, map("id", 112007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 114, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    112008, map("id", 112008, "productId", "cn.gamejelly.gong.baidu_36000yj", "sdkId", 114, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    112009, map("id", 112009, "productId", "cn.gamejelly.baidu.thgm_10yj", "sdkId", 114, "productKind", 4, "type", 12, "price", 1.0f, "firstGold", 0, "ThirdNum", 500006),
    112010, map("id", 112010, "productId", "cn.gamejelly.baidu.thgm_60yj", "sdkId", 114, "productKind", 4, "type", 13, "price", 6.0f, "firstGold", 0, "ThirdNum", 500001),
    112011, map("id", 112011, "productId", "cn.gamejelly.baidu.thgm_300yj", "sdkId", 114, "productKind", 4, "type", 14, "price", 30.0f, "firstGold", 0, "ThirdNum", 500000)
);
    }

    private static void init120() {
data.map(
    112012, map("id", 112012, "productId", "cn.gamejelly.baidu.thgm_980yj", "sdkId", 114, "productKind", 4, "type", 15, "price", 98.0f, "firstGold", 0, "ThirdNum", 500002),
    112013, map("id", 112013, "productId", "cn.gamejelly.baidu.thgm_1980yj", "sdkId", 114, "productKind", 4, "type", 16, "price", 198.0f, "firstGold", 0, "ThirdNum", 500003),
    112014, map("id", 112014, "productId", "cn.gamejelly.baidu.thgm_3280yj", "sdkId", 114, "productKind", 4, "type", 17, "price", 328.0f, "firstGold", 0, "ThirdNum", 500004),
    112015, map("id", 112015, "productId", "cn.gamejelly.baidu.thgm_6480yj", "sdkId", 114, "productKind", 4, "type", 18, "price", 648.0f, "firstGold", 0, "ThirdNum", 500005),
    113000, map("id", 113000, "productId", "cn.gamejelly.gong.kuaikan_60yj", "sdkId", 148, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015, "SecondIcon", 1)
);
    }

    private static void init121() {
data.map(
    113001, map("id", 113001, "productId", "cn.gamejelly.gong.kuaikan_300yj", "sdkId", 148, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052, "SecondIcon", 2),
    113002, map("id", 113002, "productId", "cn.gamejelly.gong.kuaikan_980yj", "sdkId", 148, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052, "SecondIcon", 3),
    113003, map("id", 113003, "productId", "cn.gamejelly.gong.kuaikan_1980yj", "sdkId", 148, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052, "SecondIcon", 4),
    113004, map("id", 113004, "productId", "cn.gamejelly.gong.kuaikan_3280yj", "sdkId", 148, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052, "SecondIcon", 5),
    113005, map("id", 113005, "productId", "cn.gamejelly.gong.kuaikan_6480yj", "sdkId", 148, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052, "SecondIcon", 6)
);
    }

    private static void init122() {
data.map(
    113006, map("id", 113006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 148, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    113007, map("id", 113007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 148, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    113008, map("id", 113008, "productId", "cn.gamejelly.gong.kuaikan_36000yj", "sdkId", 148, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    113009, map("id", 113009, "productId", "cn.gamejelly.kuaikan.thgm_10yj", "sdkId", 148, "productKind", 4, "type", 12, "price", 1.0f, "firstGold", 0, "SecondIcon", 10, "ThirdNum", 500006),
    113010, map("id", 113010, "productId", "cn.gamejelly.kuaikan.thgm_60yj", "sdkId", 148, "productKind", 4, "type", 13, "price", 6.0f, "firstGold", 0, "SecondIcon", 11, "ThirdNum", 500001)
);
    }

    private static void init123() {
data.map(
    113011, map("id", 113011, "productId", "cn.gamejelly.kuaikan.thgm_300yj", "sdkId", 148, "productKind", 4, "type", 14, "price", 30.0f, "firstGold", 0, "SecondIcon", 12, "ThirdNum", 500000),
    113012, map("id", 113012, "productId", "cn.gamejelly.kuaikan.thgm_980yj", "sdkId", 148, "productKind", 4, "type", 15, "price", 98.0f, "firstGold", 0, "SecondIcon", 13, "ThirdNum", 500002),
    113013, map("id", 113013, "productId", "cn.gamejelly.kuaikan.thgm_1980yj", "sdkId", 148, "productKind", 4, "type", 16, "price", 198.0f, "firstGold", 0, "SecondIcon", 14, "ThirdNum", 500003),
    113014, map("id", 113014, "productId", "cn.gamejelly.kuaikan.thgm_3280yj", "sdkId", 148, "productKind", 4, "type", 17, "price", 328.0f, "firstGold", 0, "SecondIcon", 15, "ThirdNum", 500004),
    113015, map("id", 113015, "productId", "cn.gamejelly.kuaikan.thgm_6480yj", "sdkId", 148, "productKind", 4, "type", 18, "price", 648.0f, "firstGold", 0, "SecondIcon", 16, "ThirdNum", 500005)
);
    }

    private static void init124() {
data.map(
    114000, map("id", 114000, "productId", "cn.gamejelly.gong.nubia_60yj", "sdkId", 150, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    114001, map("id", 114001, "productId", "cn.gamejelly.gong.nubia_300yj", "sdkId", 150, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    114002, map("id", 114002, "productId", "cn.gamejelly.gong.nubia_980yj", "sdkId", 150, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    114003, map("id", 114003, "productId", "cn.gamejelly.gong.nubia_1980yj", "sdkId", 150, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    114004, map("id", 114004, "productId", "cn.gamejelly.gong.nubia_3280yj", "sdkId", 150, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init125() {
data.map(
    114005, map("id", 114005, "productId", "cn.gamejelly.gong.nubia_6480yj", "sdkId", 150, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    114006, map("id", 114006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 150, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    114007, map("id", 114007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 150, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    114008, map("id", 114008, "productId", "cn.gamejelly.gong.nubia_36000yj", "sdkId", 150, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    114009, map("id", 114009, "productId", "cn.gamejelly.nubia.thgm_10yj", "sdkId", 150, "productKind", 4, "type", 12, "price", 1.0f, "firstGold", 0, "ThirdNum", 500006)
);
    }

    private static void init126() {
data.map(
    114010, map("id", 114010, "productId", "cn.gamejelly.nubia.thgm_60yj", "sdkId", 150, "productKind", 4, "type", 13, "price", 6.0f, "firstGold", 0, "ThirdNum", 500001),
    114011, map("id", 114011, "productId", "cn.gamejelly.nubia.thgm_300yj", "sdkId", 150, "productKind", 4, "type", 14, "price", 30.0f, "firstGold", 0, "ThirdNum", 500000),
    114012, map("id", 114012, "productId", "cn.gamejelly.nubia.thgm_980yj", "sdkId", 150, "productKind", 4, "type", 15, "price", 98.0f, "firstGold", 0, "ThirdNum", 500002),
    114013, map("id", 114013, "productId", "cn.gamejelly.nubia.thgm_1980yj", "sdkId", 150, "productKind", 4, "type", 16, "price", 198.0f, "firstGold", 0, "ThirdNum", 500003),
    114014, map("id", 114014, "productId", "cn.gamejelly.nubia.thgm_3280yj", "sdkId", 150, "productKind", 4, "type", 17, "price", 328.0f, "firstGold", 0, "ThirdNum", 500004)
);
    }

    private static void init127() {
data.map(
    114015, map("id", 114015, "productId", "cn.gamejelly.nubia.thgm_6480yj", "sdkId", 150, "productKind", 4, "type", 18, "price", 648.0f, "firstGold", 0, "ThirdNum", 500005),
    115000, map("id", 115000, "productId", "cn.gamejelly.gong.iqy_60yj", "sdkId", 151, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    115001, map("id", 115001, "productId", "cn.gamejelly.gong.iqy_300yj", "sdkId", 151, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    115002, map("id", 115002, "productId", "cn.gamejelly.gong.iqy_980yj", "sdkId", 151, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    115003, map("id", 115003, "productId", "cn.gamejelly.gong.iqy_1980yj", "sdkId", 151, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init128() {
data.map(
    115004, map("id", 115004, "productId", "cn.gamejelly.gong.iqy_3280yj", "sdkId", 151, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    115005, map("id", 115005, "productId", "cn.gamejelly.gong.iqy_6480yj", "sdkId", 151, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    115006, map("id", 115006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 151, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    115007, map("id", 115007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 151, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    115008, map("id", 115008, "productId", "cn.gamejelly.gong.iqy_36000yj", "sdkId", 151, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12)
);
    }

    private static void init129() {
data.map(
    115009, map("id", 115009, "productId", "cn.gamejelly.iqy.thgm_10yj", "sdkId", 151, "productKind", 4, "type", 12, "price", 1.0f, "firstGold", 0, "ThirdNum", 500006),
    115010, map("id", 115010, "productId", "cn.gamejelly.iqy.thgm_60yj", "sdkId", 151, "productKind", 4, "type", 13, "price", 6.0f, "firstGold", 0, "ThirdNum", 500001),
    115011, map("id", 115011, "productId", "cn.gamejelly.iqy.thgm_300yj", "sdkId", 151, "productKind", 4, "type", 14, "price", 30.0f, "firstGold", 0, "ThirdNum", 500000),
    115012, map("id", 115012, "productId", "cn.gamejelly.iqy.thgm_980yj", "sdkId", 151, "productKind", 4, "type", 15, "price", 98.0f, "firstGold", 0, "ThirdNum", 500002),
    115013, map("id", 115013, "productId", "cn.gamejelly.iqy.thgm_1980yj", "sdkId", 151, "productKind", 4, "type", 16, "price", 198.0f, "firstGold", 0, "ThirdNum", 500003)
);
    }

    private static void init130() {
data.map(
    115014, map("id", 115014, "productId", "cn.gamejelly.iqy.thgm_3280yj", "sdkId", 151, "productKind", 4, "type", 17, "price", 328.0f, "firstGold", 0, "ThirdNum", 500004),
    115015, map("id", 115015, "productId", "cn.gamejelly.iqy.thgm_6480yj", "sdkId", 151, "productKind", 4, "type", 18, "price", 648.0f, "firstGold", 0, "ThirdNum", 500005),
    116000, map("id", 116000, "productId", "cn.gamejelly.gong.meitu_60yj", "sdkId", 149, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    116001, map("id", 116001, "productId", "cn.gamejelly.gong.meitu_300yj", "sdkId", 149, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    116002, map("id", 116002, "productId", "cn.gamejelly.gong.meitu_980yj", "sdkId", 149, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init131() {
data.map(
    116003, map("id", 116003, "productId", "cn.gamejelly.gong.meitu_1980yj", "sdkId", 149, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    116004, map("id", 116004, "productId", "cn.gamejelly.gong.meitu_3280yj", "sdkId", 149, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    116005, map("id", 116005, "productId", "cn.gamejelly.gong.meitu_6480yj", "sdkId", 149, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    116006, map("id", 116006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 149, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    116007, map("id", 116007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 149, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f)
);
    }

    private static void init132() {
data.map(
    116008, map("id", 116008, "productId", "cn.gamejelly.gong.meitu_36000yj", "sdkId", 149, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    116009, map("id", 116009, "productId", "cn.gamejelly.meitu.thgm_10yj", "sdkId", 149, "productKind", 4, "type", 12, "price", 1.0f, "firstGold", 0, "ThirdNum", 500006),
    116010, map("id", 116010, "productId", "cn.gamejelly.meitu.thgm_60yj", "sdkId", 149, "productKind", 4, "type", 13, "price", 6.0f, "firstGold", 0, "ThirdNum", 500001),
    116011, map("id", 116011, "productId", "cn.gamejelly.meitu.thgm_300yj", "sdkId", 149, "productKind", 4, "type", 14, "price", 30.0f, "firstGold", 0, "ThirdNum", 500000),
    116012, map("id", 116012, "productId", "cn.gamejelly.meitu.thgm_980yj", "sdkId", 149, "productKind", 4, "type", 15, "price", 98.0f, "firstGold", 0, "ThirdNum", 500002)
);
    }

    private static void init133() {
data.map(
    116013, map("id", 116013, "productId", "cn.gamejelly.meitu.thgm_1980yj", "sdkId", 149, "productKind", 4, "type", 16, "price", 198.0f, "firstGold", 0, "ThirdNum", 500003),
    116014, map("id", 116014, "productId", "cn.gamejelly.meitu.thgm_3280yj", "sdkId", 149, "productKind", 4, "type", 17, "price", 328.0f, "firstGold", 0, "ThirdNum", 500004),
    116015, map("id", 116015, "productId", "cn.gamejelly.meitu.thgm_6480yj", "sdkId", 149, "productKind", 4, "type", 18, "price", 648.0f, "firstGold", 0, "ThirdNum", 500005),
    117000, map("id", 117000, "productId", "cn.gamejelly.gong.pywan_60yj", "sdkId", 152, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015, "SecondIcon", 1),
    117001, map("id", 117001, "productId", "cn.gamejelly.gong.pywan_300yj", "sdkId", 152, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052, "SecondIcon", 2)
);
    }

    private static void init134() {
data.map(
    117002, map("id", 117002, "productId", "cn.gamejelly.gong.pywan_980yj", "sdkId", 152, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052, "SecondIcon", 8),
    117003, map("id", 117003, "productId", "cn.gamejelly.gong.pywan_1980yj", "sdkId", 152, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052, "SecondIcon", 3),
    117004, map("id", 117004, "productId", "cn.gamejelly.gong.pywan_3280yj", "sdkId", 152, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052, "SecondIcon", 4),
    117005, map("id", 117005, "productId", "cn.gamejelly.gong.pywan_6480yj", "sdkId", 152, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052, "SecondIcon", 5),
    117006, map("id", 117006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 152, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f)
);
    }

    private static void init135() {
data.map(
    117007, map("id", 117007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 152, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    117008, map("id", 117008, "productId", "cn.gamejelly.gong.pywan_36000yj", "sdkId", 152, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    117009, map("id", 117009, "productId", "cn.gamejelly.pywan.thgm_10yj", "sdkId", 152, "productKind", 4, "type", 12, "price", 1.0f, "firstGold", 0, "SecondIcon", 9, "ThirdNum", 500006),
    117010, map("id", 117010, "productId", "cn.gamejelly.pywan.thgm_60yj", "sdkId", 152, "productKind", 4, "type", 13, "price", 6.0f, "firstGold", 0, "SecondIcon", 10, "ThirdNum", 500001),
    117011, map("id", 117011, "productId", "cn.gamejelly.pywan.thgm_300yj", "sdkId", 152, "productKind", 4, "type", 14, "price", 30.0f, "firstGold", 0, "SecondIcon", 11, "ThirdNum", 500000)
);
    }

    private static void init136() {
data.map(
    117012, map("id", 117012, "productId", "cn.gamejelly.pywan.thgm_980yj", "sdkId", 152, "productKind", 4, "type", 15, "price", 98.0f, "firstGold", 0, "SecondIcon", 12, "ThirdNum", 500002),
    117013, map("id", 117013, "productId", "cn.gamejelly.pywan.thgm_1980yj", "sdkId", 152, "productKind", 4, "type", 16, "price", 198.0f, "firstGold", 0, "SecondIcon", 13, "ThirdNum", 500003),
    117014, map("id", 117014, "productId", "cn.gamejelly.pywan.thgm_3280yj", "sdkId", 152, "productKind", 4, "type", 17, "price", 328.0f, "firstGold", 0, "SecondIcon", 14, "ThirdNum", 500004),
    117015, map("id", 117015, "productId", "cn.gamejelly.pywan.thgm_6480yj", "sdkId", 152, "productKind", 4, "type", 18, "price", 648.0f, "firstGold", 0, "SecondIcon", 15, "ThirdNum", 500005),
    118000, map("id", 118000, "productId", "cn.gamejelly.gong.ttyuyin_60yj", "sdkId", 153, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015)
);
    }

    private static void init137() {
data.map(
    118001, map("id", 118001, "productId", "cn.gamejelly.gong.ttyuyin_300yj", "sdkId", 153, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    118002, map("id", 118002, "productId", "cn.gamejelly.gong.ttyuyin_980yj", "sdkId", 153, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    118003, map("id", 118003, "productId", "cn.gamejelly.gong.ttyuyin_1980yj", "sdkId", 153, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    118004, map("id", 118004, "productId", "cn.gamejelly.gong.ttyuyin_3280yj", "sdkId", 153, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    118005, map("id", 118005, "productId", "cn.gamejelly.gong.ttyuyin_6480yj", "sdkId", 153, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init138() {
data.map(
    118006, map("id", 118006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 153, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    118007, map("id", 118007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 153, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    118008, map("id", 118008, "productId", "cn.gamejelly.gong.ttyuyin_36000yj", "sdkId", 153, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    118009, map("id", 118009, "productId", "cn.gamejelly.ttyuyin.thgm_10yj", "sdkId", 153, "productKind", 4, "type", 12, "price", 1.0f, "firstGold", 0, "ThirdNum", 500006),
    118010, map("id", 118010, "productId", "cn.gamejelly.ttyuyin.thgm_60yj", "sdkId", 153, "productKind", 4, "type", 13, "price", 6.0f, "firstGold", 0, "ThirdNum", 500001)
);
    }

    private static void init139() {
data.map(
    118011, map("id", 118011, "productId", "cn.gamejelly.ttyuyin.thgm_300yj", "sdkId", 153, "productKind", 4, "type", 14, "price", 30.0f, "firstGold", 0, "ThirdNum", 500000),
    118012, map("id", 118012, "productId", "cn.gamejelly.ttyuyin.thgm_980yj", "sdkId", 153, "productKind", 4, "type", 15, "price", 98.0f, "firstGold", 0, "ThirdNum", 500002),
    118013, map("id", 118013, "productId", "cn.gamejelly.ttyuyin.thgm_1980yj", "sdkId", 153, "productKind", 4, "type", 16, "price", 198.0f, "firstGold", 0, "ThirdNum", 500003),
    118014, map("id", 118014, "productId", "cn.gamejelly.ttyuyin.thgm_3280yj", "sdkId", 153, "productKind", 4, "type", 17, "price", 328.0f, "firstGold", 0, "ThirdNum", 500004),
    118015, map("id", 118015, "productId", "cn.gamejelly.ttyuyin.thgm_6480yj", "sdkId", 153, "productKind", 4, "type", 18, "price", 648.0f, "firstGold", 0, "ThirdNum", 500005)
);
    }

    private static void init140() {
data.map(
    119000, map("id", 119000, "productId", "cn.gamejelly.gong.guaimao_60yj", "sdkId", 154, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    119001, map("id", 119001, "productId", "cn.gamejelly.gong.guaimao_300yj", "sdkId", 154, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    119002, map("id", 119002, "productId", "cn.gamejelly.gong.guaimao_980yj", "sdkId", 154, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    119003, map("id", 119003, "productId", "cn.gamejelly.gong.guaimao_1980yj", "sdkId", 154, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    119004, map("id", 119004, "productId", "cn.gamejelly.gong.guaimao_3280yj", "sdkId", 154, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init141() {
data.map(
    119005, map("id", 119005, "productId", "cn.gamejelly.gong.guaimao_6480yj", "sdkId", 154, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    119006, map("id", 119006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 154, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    119007, map("id", 119007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 154, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    119008, map("id", 119008, "productId", "cn.gamejelly.gong.guaimao_36000yj", "sdkId", 154, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    119009, map("id", 119009, "productId", "cn.gamejelly.guaimao.thgm_10yj", "sdkId", 154, "productKind", 4, "type", 12, "price", 1.0f, "firstGold", 0, "ThirdNum", 500006)
);
    }

    private static void init142() {
data.map(
    119010, map("id", 119010, "productId", "cn.gamejelly.guaimao.thgm_60yj", "sdkId", 154, "productKind", 4, "type", 13, "price", 6.0f, "firstGold", 0, "ThirdNum", 500001),
    119011, map("id", 119011, "productId", "cn.gamejelly.guaimao.thgm_300yj", "sdkId", 154, "productKind", 4, "type", 14, "price", 30.0f, "firstGold", 0, "ThirdNum", 500000),
    119012, map("id", 119012, "productId", "cn.gamejelly.guaimao.thgm_980yj", "sdkId", 154, "productKind", 4, "type", 15, "price", 98.0f, "firstGold", 0, "ThirdNum", 500002),
    119013, map("id", 119013, "productId", "cn.gamejelly.guaimao.thgm_1980yj", "sdkId", 154, "productKind", 4, "type", 16, "price", 198.0f, "firstGold", 0, "ThirdNum", 500003),
    119014, map("id", 119014, "productId", "cn.gamejelly.guaimao.thgm_3280yj", "sdkId", 154, "productKind", 4, "type", 17, "price", 328.0f, "firstGold", 0, "ThirdNum", 500004)
);
    }

    private static void init143() {
data.map(
    119015, map("id", 119015, "productId", "cn.gamejelly.guaimao.thgm_6480yj", "sdkId", 154, "productKind", 4, "type", 18, "price", 648.0f, "firstGold", 0, "ThirdNum", 500005),
    120000, map("id", 120000, "productId", "cn.gamejelly.gong.sina_60yj", "sdkId", 155, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    120001, map("id", 120001, "productId", "cn.gamejelly.gong.sina_300yj", "sdkId", 155, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    120002, map("id", 120002, "productId", "cn.gamejelly.gong.sina_980yj", "sdkId", 155, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    120003, map("id", 120003, "productId", "cn.gamejelly.gong.sina_1980yj", "sdkId", 155, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init144() {
data.map(
    120004, map("id", 120004, "productId", "cn.gamejelly.gong.sina_3280yj", "sdkId", 155, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    120005, map("id", 120005, "productId", "cn.gamejelly.gong.sina_6480yj", "sdkId", 155, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    120006, map("id", 120006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 155, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    120007, map("id", 120007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 155, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    120008, map("id", 120008, "productId", "cn.gamejelly.gong.sina_36000yj", "sdkId", 155, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12)
);
    }

    private static void init145() {
data.map(
    120009, map("id", 120009, "productId", "cn.gamejelly.sina.thgm_10yj", "sdkId", 155, "productKind", 4, "type", 12, "price", 1.0f, "firstGold", 0, "ThirdNum", 500006),
    120010, map("id", 120010, "productId", "cn.gamejelly.sina.thgm_60yj", "sdkId", 155, "productKind", 4, "type", 13, "price", 6.0f, "firstGold", 0, "ThirdNum", 500001),
    120011, map("id", 120011, "productId", "cn.gamejelly.sina.thgm_300yj", "sdkId", 155, "productKind", 4, "type", 14, "price", 30.0f, "firstGold", 0, "ThirdNum", 500000),
    120012, map("id", 120012, "productId", "cn.gamejelly.sina.thgm_980yj", "sdkId", 155, "productKind", 4, "type", 15, "price", 98.0f, "firstGold", 0, "ThirdNum", 500002),
    120013, map("id", 120013, "productId", "cn.gamejelly.sina.thgm_1980yj", "sdkId", 155, "productKind", 4, "type", 16, "price", 198.0f, "firstGold", 0, "ThirdNum", 500003)
);
    }

    private static void init146() {
data.map(
    120014, map("id", 120014, "productId", "cn.gamejelly.sina.thgm_3280yj", "sdkId", 155, "productKind", 4, "type", 17, "price", 328.0f, "firstGold", 0, "ThirdNum", 500004),
    120015, map("id", 120015, "productId", "cn.gamejelly.sina.thgm_6480yj", "sdkId", 155, "productKind", 4, "type", 18, "price", 648.0f, "firstGold", 0, "ThirdNum", 500005),
    121000, map("id", 121000, "productId", "cn.gamejelly.gong.xiaoqi_60yj", "sdkId", 156, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    121001, map("id", 121001, "productId", "cn.gamejelly.gong.xiaoqi_300yj", "sdkId", 156, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    121002, map("id", 121002, "productId", "cn.gamejelly.gong.xiaoqi_980yj", "sdkId", 156, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init147() {
data.map(
    121003, map("id", 121003, "productId", "cn.gamejelly.gong.xiaoqi_1980yj", "sdkId", 156, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    121004, map("id", 121004, "productId", "cn.gamejelly.gong.xiaoqi_3280yj", "sdkId", 156, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    121005, map("id", 121005, "productId", "cn.gamejelly.gong.xiaoqi_6480yj", "sdkId", 156, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    121006, map("id", 121006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 156, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    121007, map("id", 121007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 156, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f)
);
    }

    private static void init148() {
data.map(
    121008, map("id", 121008, "productId", "cn.gamejelly.gong.xiaoqi_36000yj", "sdkId", 156, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    121009, map("id", 121009, "productId", "cn.gamejelly.xiaoqi.thgm_10yj", "sdkId", 156, "productKind", 4, "type", 12, "price", 1.0f, "firstGold", 0, "ThirdNum", 500006),
    121010, map("id", 121010, "productId", "cn.gamejelly.xiaoqi.thgm_60yj", "sdkId", 156, "productKind", 4, "type", 13, "price", 6.0f, "firstGold", 0, "ThirdNum", 500001),
    121011, map("id", 121011, "productId", "cn.gamejelly.xiaoqi.thgm_300yj", "sdkId", 156, "productKind", 4, "type", 14, "price", 30.0f, "firstGold", 0, "ThirdNum", 500000),
    121012, map("id", 121012, "productId", "cn.gamejelly.xiaoqi.thgm_980yj", "sdkId", 156, "productKind", 4, "type", 15, "price", 98.0f, "firstGold", 0, "ThirdNum", 500002)
);
    }

    private static void init149() {
data.map(
    121013, map("id", 121013, "productId", "cn.gamejelly.xiaoqi.thgm_1980yj", "sdkId", 156, "productKind", 4, "type", 16, "price", 198.0f, "firstGold", 0, "ThirdNum", 500003),
    121014, map("id", 121014, "productId", "cn.gamejelly.xiaoqi.thgm_3280yj", "sdkId", 156, "productKind", 4, "type", 17, "price", 328.0f, "firstGold", 0, "ThirdNum", 500004),
    121015, map("id", 121015, "productId", "cn.gamejelly.xiaoqi.thgm_6480yj", "sdkId", 156, "productKind", 4, "type", 18, "price", 648.0f, "firstGold", 0, "ThirdNum", 500005),
    122000, map("id", 122000, "productId", "cn.gamejelly.gong.xiaoqian_60yj", "sdkId", 157, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    122001, map("id", 122001, "productId", "cn.gamejelly.gong.xiaoqian_300yj", "sdkId", 157, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init150() {
data.map(
    122002, map("id", 122002, "productId", "cn.gamejelly.gong.xiaoqian_980yj", "sdkId", 157, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    122003, map("id", 122003, "productId", "cn.gamejelly.gong.xiaoqian_1980yj", "sdkId", 157, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    122004, map("id", 122004, "productId", "cn.gamejelly.gong.xiaoqian_3280yj", "sdkId", 157, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    122005, map("id", 122005, "productId", "cn.gamejelly.gong.xiaoqian_6480yj", "sdkId", 157, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    122006, map("id", 122006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 157, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f)
);
    }

    private static void init151() {
data.map(
    122007, map("id", 122007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 157, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    122008, map("id", 122008, "productId", "cn.gamejelly.gong.xiaoqian_36000yj", "sdkId", 157, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    122009, map("id", 122009, "productId", "cn.gamejelly.xiaoqian.thgm_10yj", "sdkId", 157, "productKind", 4, "type", 12, "price", 1.0f, "firstGold", 0, "ThirdNum", 500006),
    122010, map("id", 122010, "productId", "cn.gamejelly.xiaoqian.thgm_60yj", "sdkId", 157, "productKind", 4, "type", 13, "price", 6.0f, "firstGold", 0, "ThirdNum", 500001),
    122011, map("id", 122011, "productId", "cn.gamejelly.xiaoqian.thgm_300yj", "sdkId", 157, "productKind", 4, "type", 14, "price", 30.0f, "firstGold", 0, "ThirdNum", 500000)
);
    }

    private static void init152() {
data.map(
    122012, map("id", 122012, "productId", "cn.gamejelly.xiaoqian.thgm_980yj", "sdkId", 157, "productKind", 4, "type", 15, "price", 98.0f, "firstGold", 0, "ThirdNum", 500002),
    122013, map("id", 122013, "productId", "cn.gamejelly.xiaoqian.thgm_1980yj", "sdkId", 157, "productKind", 4, "type", 16, "price", 198.0f, "firstGold", 0, "ThirdNum", 500003),
    122014, map("id", 122014, "productId", "cn.gamejelly.xiaoqian.thgm_3280yj", "sdkId", 157, "productKind", 4, "type", 17, "price", 328.0f, "firstGold", 0, "ThirdNum", 500004),
    122015, map("id", 122015, "productId", "cn.gamejelly.xiaoqian.thgm_6480yj", "sdkId", 157, "productKind", 4, "type", 18, "price", 648.0f, "firstGold", 0, "ThirdNum", 500005),
    123000, map("id", 123000, "productId", "cn.gamejelly.gong.kuaijie_60yj", "sdkId", 160, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015)
);
    }

    private static void init153() {
data.map(
    123001, map("id", 123001, "productId", "cn.gamejelly.gong.kuaijie_300yj", "sdkId", 160, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    123002, map("id", 123002, "productId", "cn.gamejelly.gong.kuaijie_980yj", "sdkId", 160, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    123003, map("id", 123003, "productId", "cn.gamejelly.gong.kuaijie_1980yj", "sdkId", 160, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    123004, map("id", 123004, "productId", "cn.gamejelly.gong.kuaijie_3280yj", "sdkId", 160, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    123005, map("id", 123005, "productId", "cn.gamejelly.gong.kuaijie_6480yj", "sdkId", 160, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init154() {
data.map(
    123006, map("id", 123006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 160, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    123007, map("id", 123007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 160, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    123008, map("id", 123008, "productId", "cn.gamejelly.gong.kuaijie_36000yj", "sdkId", 160, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    123009, map("id", 123009, "productId", "cn.gamejelly.kuaijie.thgm_10yj", "sdkId", 160, "productKind", 4, "type", 12, "price", 1.0f, "firstGold", 0, "ThirdNum", 500006),
    123010, map("id", 123010, "productId", "cn.gamejelly.kuaijie.thgm_60yj", "sdkId", 160, "productKind", 4, "type", 13, "price", 6.0f, "firstGold", 0, "ThirdNum", 500001)
);
    }

    private static void init155() {
data.map(
    123011, map("id", 123011, "productId", "cn.gamejelly.kuaijie.thgm_300yj", "sdkId", 160, "productKind", 4, "type", 14, "price", 30.0f, "firstGold", 0, "ThirdNum", 500000),
    123012, map("id", 123012, "productId", "cn.gamejelly.kuaijie.thgm_980yj", "sdkId", 160, "productKind", 4, "type", 15, "price", 98.0f, "firstGold", 0, "ThirdNum", 500002),
    123013, map("id", 123013, "productId", "cn.gamejelly.kuaijie.thgm_1980yj", "sdkId", 160, "productKind", 4, "type", 16, "price", 198.0f, "firstGold", 0, "ThirdNum", 500003),
    123014, map("id", 123014, "productId", "cn.gamejelly.kuaijie.thgm_3280yj", "sdkId", 160, "productKind", 4, "type", 17, "price", 328.0f, "firstGold", 0, "ThirdNum", 500004),
    123015, map("id", 123015, "productId", "cn.gamejelly.kuaijie.thgm_6480yj", "sdkId", 160, "productKind", 4, "type", 18, "price", 648.0f, "firstGold", 0, "ThirdNum", 500005)
);
    }

    private static void init156() {
data.map(
    124000, map("id", 124000, "productId", "cn.gamejelly.gong.muzhiwan_60yj", "sdkId", 158, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    124001, map("id", 124001, "productId", "cn.gamejelly.gong.muzhiwan_300yj", "sdkId", 158, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    124002, map("id", 124002, "productId", "cn.gamejelly.gong.muzhiwan_980yj", "sdkId", 158, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    124003, map("id", 124003, "productId", "cn.gamejelly.gong.muzhiwan_1980yj", "sdkId", 158, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    124004, map("id", 124004, "productId", "cn.gamejelly.gong.muzhiwan_3280yj", "sdkId", 158, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init157() {
data.map(
    124005, map("id", 124005, "productId", "cn.gamejelly.gong.muzhiwan_6480yj", "sdkId", 158, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    124006, map("id", 124006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 158, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    124007, map("id", 124007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 158, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    124008, map("id", 124008, "productId", "cn.gamejelly.gong.muzhiwan_36000yj", "sdkId", 158, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12),
    124009, map("id", 124009, "productId", "cn.gamejelly.muzhiwan.thgm_10yj", "sdkId", 158, "productKind", 4, "type", 12, "price", 1.0f, "firstGold", 0, "ThirdNum", 500006)
);
    }

    private static void init158() {
data.map(
    124010, map("id", 124010, "productId", "cn.gamejelly.muzhiwan.thgm_60yj", "sdkId", 158, "productKind", 4, "type", 13, "price", 6.0f, "firstGold", 0, "ThirdNum", 500001),
    124011, map("id", 124011, "productId", "cn.gamejelly.muzhiwan.thgm_300yj", "sdkId", 158, "productKind", 4, "type", 14, "price", 30.0f, "firstGold", 0, "ThirdNum", 500000),
    124012, map("id", 124012, "productId", "cn.gamejelly.muzhiwan.thgm_980yj", "sdkId", 158, "productKind", 4, "type", 15, "price", 98.0f, "firstGold", 0, "ThirdNum", 500002),
    124013, map("id", 124013, "productId", "cn.gamejelly.muzhiwan.thgm_1980yj", "sdkId", 158, "productKind", 4, "type", 16, "price", 198.0f, "firstGold", 0, "ThirdNum", 500003),
    124014, map("id", 124014, "productId", "cn.gamejelly.muzhiwan.thgm_3280yj", "sdkId", 158, "productKind", 4, "type", 17, "price", 328.0f, "firstGold", 0, "ThirdNum", 500004)
);
    }

    private static void init159() {
data.map(
    124015, map("id", 124015, "productId", "cn.gamejelly.muzhiwan.thgm_6480yj", "sdkId", 158, "productKind", 4, "type", 18, "price", 648.0f, "firstGold", 0, "ThirdNum", 500005),
    125000, map("id", 125000, "productId", "cn.gamejelly.gong.yiwan_60yj", "sdkId", 159, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    125001, map("id", 125001, "productId", "cn.gamejelly.gong.yiwan_300yj", "sdkId", 159, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    125002, map("id", 125002, "productId", "cn.gamejelly.gong.yiwan_980yj", "sdkId", 159, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    125003, map("id", 125003, "productId", "cn.gamejelly.gong.yiwan_1980yj", "sdkId", 159, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init160() {
data.map(
    125004, map("id", 125004, "productId", "cn.gamejelly.gong.yiwan_3280yj", "sdkId", 159, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    125005, map("id", 125005, "productId", "cn.gamejelly.gong.yiwan_6480yj", "sdkId", 159, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    125006, map("id", 125006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 159, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    125007, map("id", 125007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 159, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    125008, map("id", 125008, "productId", "cn.gamejelly.gong.yiwan_36000yj", "sdkId", 159, "productKind", 1, "type", 11, "price", 3600.0f, "jade", 36000, "giveGold", 10800, "firstGold", 0, "firstGift", 22015, "firstNum", 22052, "ThirdGift", 12)
);
    }

    private static void init161() {
data.map(
    125009, map("id", 125009, "productId", "cn.gamejelly.yiwan.thgm_10yj", "sdkId", 159, "productKind", 4, "type", 12, "price", 1.0f, "firstGold", 0, "ThirdNum", 500006),
    125010, map("id", 125010, "productId", "cn.gamejelly.yiwan.thgm_60yj", "sdkId", 159, "productKind", 4, "type", 13, "price", 6.0f, "firstGold", 0, "ThirdNum", 500001),
    125011, map("id", 125011, "productId", "cn.gamejelly.yiwan.thgm_300yj", "sdkId", 159, "productKind", 4, "type", 14, "price", 30.0f, "firstGold", 0, "ThirdNum", 500000),
    125012, map("id", 125012, "productId", "cn.gamejelly.yiwan.thgm_980yj", "sdkId", 159, "productKind", 4, "type", 15, "price", 98.0f, "firstGold", 0, "ThirdNum", 500002),
    125013, map("id", 125013, "productId", "cn.gamejelly.yiwan.thgm_1980yj", "sdkId", 159, "productKind", 4, "type", 16, "price", 198.0f, "firstGold", 0, "ThirdNum", 500003)
);
    }

    private static void init162() {
data.map(
    125014, map("id", 125014, "productId", "cn.gamejelly.yiwan.thgm_3280yj", "sdkId", 159, "productKind", 4, "type", 17, "price", 328.0f, "firstGold", 0, "ThirdNum", 500004),
    125015, map("id", 125015, "productId", "cn.gamejelly.yiwan.thgm_6480yj", "sdkId", 159, "productKind", 4, "type", 18, "price", 648.0f, "firstGold", 0, "ThirdNum", 500005),
    126000, map("id", 126000, "productId", "cn.gamejelly.gong.hd_60yj", "sdkId", 100, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    126001, map("id", 126001, "productId", "cn.gamejelly.gong.hd_300yj", "sdkId", 100, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    126002, map("id", 126002, "productId", "cn.gamejelly.gong.hd_980yj", "sdkId", 100, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init163() {
data.map(
    126003, map("id", 126003, "productId", "cn.gamejelly.gong.hd_1980yj", "sdkId", 100, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    126004, map("id", 126004, "productId", "cn.gamejelly.gong.hd_3280yj", "sdkId", 100, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    126005, map("id", 126005, "productId", "cn.gamejelly.gong.hd_6480yj", "sdkId", 100, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    126006, map("id", 126006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 100, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    126007, map("id", 126007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 100, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f)
);
    }

    private static void init164() {
data.map(
    190000, map("id", 190000, "productId", "cn.guodong.gong.tw_60yj", "sdkId", 1000, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    190001, map("id", 190001, "productId", "cn.guodong.gong.tw_300yj", "sdkId", 1000, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    190002, map("id", 190002, "productId", "cn.guodong.gong.tw_980yj", "sdkId", 1000, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    190003, map("id", 190003, "productId", "cn.guodong.gong.tw_1980yj", "sdkId", 1000, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    190004, map("id", 190004, "productId", "cn.guodong.gong.tw_3280yj", "sdkId", 1000, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init165() {
data.map(
    190005, map("id", 190005, "productId", "cn.guodong.gong.tw_6480yj", "sdkId", 1000, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    190006, map("id", 190006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 1000, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    190007, map("id", 190007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 1000, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    191000, map("id", 191000, "productId", "cn.jelly.tw1_60yj", "sdkId", 1000, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    191001, map("id", 191001, "productId", "cn.jelly.tw1_300yj", "sdkId", 1001, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init166() {
data.map(
    191002, map("id", 191002, "productId", "cn.jelly.tw1_980yj", "sdkId", 1001, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    191003, map("id", 191003, "productId", "cn.jelly.tw1_1980yj", "sdkId", 1001, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    191004, map("id", 191004, "productId", "cn.jelly.tw1_3280yj", "sdkId", 1001, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    191005, map("id", 191005, "productId", "cn.jelly.tw1_6480yj", "sdkId", 1001, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    191006, map("id", 191006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 1000, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f)
);
    }

    private static void init167() {
data.map(
    191007, map("id", 191007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 1000, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    192000, map("id", 192000, "productId", "cn.jelly.tw2_60yj", "sdkId", 1002, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    192001, map("id", 192001, "productId", "cn.jelly.tw2_300yj", "sdkId", 1002, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    192002, map("id", 192002, "productId", "cn.jelly.tw2_980yj", "sdkId", 1002, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    192003, map("id", 192003, "productId", "cn.jelly.tw2_1980yj", "sdkId", 1002, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init168() {
data.map(
    192004, map("id", 192004, "productId", "cn.jelly.tw2_3280yj", "sdkId", 1002, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    192005, map("id", 192005, "productId", "cn.jelly.tw2_6480yj", "sdkId", 1002, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    192006, map("id", 192006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 1002, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    192007, map("id", 192007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 1002, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    193000, map("id", 193000, "productId", "cn.jelly.tw3_60yj", "sdkId", 1002, "productKind", 1, "type", 1, "price", 6.0f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015)
);
    }

    private static void init169() {
data.map(
    193001, map("id", 193001, "productId", "cn.jelly.tw3_300yj", "sdkId", 1004, "productKind", 1, "type", 2, "price", 30.0f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    193002, map("id", 193002, "productId", "cn.jelly.tw3_980yj", "sdkId", 1004, "productKind", 1, "type", 3, "price", 98.0f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052),
    193003, map("id", 193003, "productId", "cn.jelly.tw3_1980yj", "sdkId", 1004, "productKind", 1, "type", 4, "price", 198.0f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    193004, map("id", 193004, "productId", "cn.jelly.tw3_3380yj", "sdkId", 1004, "productKind", 1, "type", 5, "price", 328.0f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    193005, map("id", 193005, "productId", "cn.jelly.tw3_6480yj", "sdkId", 1004, "productKind", 1, "type", 6, "price", 648.0f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init170() {
data.map(
    193006, map("id", 193006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 1004, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    193007, map("id", 193007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 1004, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f),
    200000, map("id", 200000, "productId", "cn.gamejelly.gong.tw_60yj", "sdkId", 10000, "productKind", 1, "type", 1, "price", 0.99f, "jade", 60, "giveGold", 6, "firstGold", 60, "firstGift", 22015),
    200001, map("id", 200001, "productId", "cn.gamejelly.gong.tw_300yj", "sdkId", 10000, "productKind", 1, "type", 2, "price", 4.99f, "jade", 300, "giveGold", 30, "firstGold", 300, "firstGift", 22015, "firstNum", 22052),
    200002, map("id", 200002, "productId", "cn.gamejelly.gong.tw_980yj", "sdkId", 10000, "productKind", 1, "type", 3, "price", 14.99f, "jade", 980, "giveGold", 128, "firstGold", 980, "firstGift", 22015, "firstNum", 22052)
);
    }

    private static void init171() {
data.map(
    200003, map("id", 200003, "productId", "cn.gamejelly.gong.tw_1980yj", "sdkId", 10000, "productKind", 1, "type", 4, "price", 29.99f, "jade", 1980, "giveGold", 288, "firstGold", 1980, "firstGift", 22015, "firstNum", 22052),
    200004, map("id", 200004, "productId", "cn.gamejelly.gong.tw_3280yj", "sdkId", 10000, "productKind", 1, "type", 5, "price", 49.99f, "jade", 3280, "giveGold", 628, "firstGold", 3280, "firstGift", 22015, "firstNum", 22052),
    200005, map("id", 200005, "productId", "cn.gamejelly.gong.tw_6480yj", "sdkId", 10000, "productKind", 1, "type", 6, "price", 99.99f, "jade", 6480, "giveGold", 1288, "firstGold", 6480, "firstGift", 22015, "firstNum", 22052),
    200006, map("id", 200006, "productId", "cn.gamejelly.gong.appstore_yk", "sdkId", 10000, "productKind", 3, "type", 7, "price", 30.0f, "jade", 300, "dayGive", 50, "firstGold", 300, "zfbGive", 0.05f),
    200007, map("id", 200007, "productId", "cn.gamejelly.gong.appstore_zk", "sdkId", 10000, "productKind", 2, "type", 8, "price", 10.0f, "jade", 100, "dayGive", 60, "firstGold", 100, "zfbGive", 0.05f)
);
    }

    private static void init172() {
data.map(
    500000, map("id", 500000, "productId", "cn.gamejelly.gong.thgm_300yj", "sdkId", 500, "productKind", 4, "type", 1, "price", 30.0f, "firstGold", 0, "ThirdNum", 500000),
    500001, map("id", 500001, "productId", "cn.gamejelly.gong.thgm_60yj", "sdkId", 500, "productKind", 4, "type", 1, "price", 6.0f, "firstGold", 0, "ThirdNum", 500001),
    500002, map("id", 500002, "productId", "cn.gamejelly.gong.thgm_980yj", "sdkId", 500, "productKind", 4, "type", 1, "price", 98.0f, "firstGold", 0, "ThirdNum", 500002),
    500003, map("id", 500003, "productId", "cn.gamejelly.gong.thgm_1980yj", "sdkId", 500, "productKind", 4, "type", 1, "price", 198.0f, "firstGold", 0, "ThirdNum", 500003),
    500004, map("id", 500004, "productId", "cn.gamejelly.gong.thgm_3280yj", "sdkId", 500, "productKind", 4, "type", 1, "price", 328.0f, "firstGold", 0, "ThirdNum", 500004)
);
    }

    private static void init173() {
data.map(
    500005, map("id", 500005, "productId", "cn.gamejelly.gong.thgm_6480yj", "sdkId", 500, "productKind", 4, "type", 1, "price", 648.0f, "firstGold", 0, "ThirdNum", 500005),
    500006, map("id", 500006, "productId", "cn.gamejelly.gong.thgm_10yj", "sdkId", 500, "productKind", 4, "type", 1, "price", 1.0f, "firstGold", 0, "ThirdNum", 500006),
    500007, map("id", 500007, "productId", "cn.gamejelly.gong.thgm_120yj", "sdkId", 500, "productKind", 4, "type", 1, "price", 12.0f, "firstGold", 0, "ThirdNum", 500007),
    600000, map("id", 600000, "productId", "cn.gamejelly.gong.czjj_980yj", "sdkId", 500, "productKind", 5, "type", 1, "price", 98.0f, "firstGold", 0),
    700000, map("id", 700000, "productId", "cn.gamejelly.gong.thgm_yth", "sdkId", 500, "productKind", 6, "type", 1, "price", 30.0f, "firstGold", 0, "ThirdNum", 500000)
);
    }

}