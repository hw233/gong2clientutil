package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 鸿雁传书对话表.csv
 * 编号 = id
 * 对话内容 = talk
 * 对话人物 = char
 * 对话人物名称 = name
 * 正在说话任务 = talking
 * 下个对话 = next
 * 配音ID = dub
 * 概率 = lovefeel
 * 好感度 = intimacyn
 * 结束 = end
 */
public class BirdLetterDat extends LData {
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
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    1, map("id", 1, "talk", "方才一阵雨真是令人措手不及……", "char", 40000, "name", "姬长生", "talking", 40000, "next", list(2)),
    2, map("id", 2, "talk", "你可好？可被淋湿了？", "char", 40000, "name", "姬长生", "talking", 40000, "next", list(3)),
    3, map("id", 3, "talk", "恩……可不是，还好书没给淋湿。", "char", 40000, "name", "玩家", "talking", -1, "next", list(4)),
    4, map("id", 4, "talk", "赶紧去把衣服换了吧，万一着凉了可不好。", "char", 40000, "name", "姬长生", "talking", 40000, "next", list(5, 6, 7)),
    5, map("id", 5, "talk", "我这等皮糙肉厚，无妨的。", "char", 40000, "name", "玩家", "talking", -1, "next", list(8), "lovefeel", "30", "intimacyn", 10, "end", 1)
);
    }

    private static void init1() {
data.map(
    6, map("id", 6, "talk", "恩恩，我现在就去换。", "char", 40000, "name", "玩家", "talking", -1, "next", list(11), "lovefeel", "60", "intimacyn", 10, "end", 1),
    7, map("id", 7, "talk", "我在御花园中……没有衣服……", "char", 40000, "name", "玩家", "talking", -1, "next", list(12), "lovefeel", "90", "intimacyn", 10, "end", 1),
    8, map("id", 8, "talk", "就算你这么说，但是还是要注意身体。", "char", 40000, "name", "姬长生", "talking", 40000, "next", list(9)),
    9, map("id", 9, "talk", "我骗你的，已经换好了！", "char", 40000, "name", "玩家", "talking", -1, "next", list(10)),
    10, map("id", 10, "talk", "你啊……真是拿你没办法。", "char", 40000, "name", "姬长生", "talking", 40000)
);
    }

    private static void init2() {
data.map(
    11, map("id", 11, "talk", "去吧，莫要着凉。", "char", 40000, "name", "姬长生", "talking", 40000),
    12, map("id", 12, "talk", "御花园？可是被堵在御花园中了？", "char", 40000, "name", "姬长生", "talking", 40000, "next", list(13)),
    13, map("id", 13, "talk", "陛下圣明！", "char", 40000, "name", "玩家", "talking", -1, "next", list(14)),
    14, map("id", 14, "talk", "莫要乱跑，朕着人给你送干净的衣物。", "char", 40000, "name", "姬长生", "talking", 40000, "next", list(15)),
    15, map("id", 15, "talk", "多谢陛下！", "char", 40000, "name", "玩家", "talking", -1)
);
    }

    private static void init3() {
data.map(
    16, map("id", 16, "talk", "近日我得了一奇物，观之如朽木，触之如兽皮，却隐隐有酒香之气绵延，我思索许久，终破木而观……你可听说过三辰之酒？", "char", 40008, "name", "承影", "talking", 40008, "next", list(17, 19, 22)),
    17, map("id", 17, "talk", "可是相传中百年前玄宗密酿，宫廷御酒？", "char", 40008, "name", "玩家", "talking", -1, "next", list(18), "lovefeel", "90", "intimacyn", 10, "end", 1),
    18, map("id", 18, "talk", "正是此酒，没想到你也是同好之人。", "char", 40008, "name", "承影", "talking", 40008, "next", list(24)),
    19, map("id", 19, "talk", "那是什么？", "char", 40008, "name", "玩家", "talking", -1, "next", list(20), "lovefeel", "30", "intimacyn", 10, "end", 1),
    20, map("id", 20, "talk", "此物稀少难觅，不知也是常理。", "char", 40008, "name", "承影", "talking", 40008, "next", list(21))
);
    }

    private static void init4() {
data.map(
    21, map("id", 21, "talk", "这天下之大，又如何能事事皆知？……老爷突然有事寻我，先不说了。待来日你我有闲，再相约泛舟。", "char", 40008, "name", "承影", "talking", 40008),
    22, map("id", 22, "talk", "三辰？日、月、星为三辰，这酒好大的口气。", "char", 40008, "name", "玩家", "talking", -1, "next", list(23), "lovefeel", "60", "intimacyn", 10, "end", 1),
    23, map("id", 23, "talk", "此乃百年前玄宗亲手所制，自然不惧其他。", "char", 40008, "name", "承影", "talking", 40008, "next", list(24)),
    24, map("id", 24, "talk", "传闻玄宗密酿此酒初衷乃是为了杨妃，日月星三辰喻为朝朝暮暮，可惜杨妃死于马嵬驿之变，此酒便成了宫廷御酒。每逢祭日，玄宗便置曲清潭，贮以此酒，以托相思……", "char", 40008, "name", "承影", "talking", 40008, "next", list(25)),
    25, map("id", 25, "talk", "……我说这些是不是很无趣？其实我想说的并不是这个，只是不知为何话到嘴边却说不出口来了……", "char", 40008, "name", "承影", "talking", 40008, "next", list(26))
);
    }

    private static void init5() {
data.map(
    26, map("id", 26, "talk", "……我其实只想问你……", "char", 40008, "name", "承影", "talking", 40008, "next", list(27)),
    27, map("id", 27, "talk", "你可愿与我共饮此杯？", "char", 40008, "name", "承影", "talking", 40008),
    28, map("id", 28, "talk", "今早见雾霭沉沉，水汽充裕，便知道要下雨。不想这一场雨如此猝不及防，你可淋着了？", "char", 40008, "name", "承影", "talking", 40008, "next", list(29, 32, 34)),
    29, map("id", 29, "talk", "我带了伞，却还是淋湿了大半。", "char", 40008, "name", "玩家", "talking", -1, "next", list(30), "lovefeel", "30", "intimacyn", 10, "end", 1),
    30, map("id", 30, "talk", "这天气，若是着凉可不好，切记要更换湿衣，万万不可盼它捂干。", "char", 40008, "name", "承影", "talking", 40008, "next", list(31))
);
    }

    private static void init6() {
data.map(
    31, map("id", 31, "talk", "想必你现在定然手忙脚乱吧？我便不打扰你了，换好衣物记得喝一些姜汤祛寒。", "char", 40008, "name", "承影", "talking", 40008),
    32, map("id", 32, "talk", "正巧那时我在外办事，落汤鸡就是我了。", "char", 40008, "name", "玩家", "talking", -1, "next", list(33), "lovefeel", "90", "intimacyn", 10),
    33, map("id", 33, "talk", "这……看你说的，你可是着凉了？现在在何处，可回府了？", "char", 40008, "name", "承影", "talking", 40008, "next", list(36, 37, 38)),
    34, map("id", 34, "talk", "见着要下雨，我便没有出门。", "char", 40008, "name", "玩家", "talking", -1, "next", list(35), "lovefeel", "60", "intimacyn", 10),
    35, map("id", 35, "talk", "向来只有老人才懂得看天，不想你也懂得……真是了不起。", "char", 40008, "name", "承影", "talking", 40008, "next", list(36, 37, 38))
);
    }

    private static void init7() {
data.map(
    36, map("id", 36, "talk", "你寻我可是有什么要事？", "char", 40008, "name", "玩家", "talking", -1, "next", list(39), "end", 1),
    37, map("id", 37, "talk", "倒是甚少见你关注我是否出门。", "char", 40008, "name", "玩家", "talking", -1, "next", list(39), "end", 1),
    38, map("id", 38, "talk", "天色初霁，承影大人有此一问……莫不是也成了落汤鸡？", "char", 40008, "name", "玩家", "talking", -1, "next", list(39), "end", 1),
    39, map("id", 39, "talk", "……", "char", 40008, "name", "承影", "talking", 40008, "next", list(40)),
    40, map("id", 40, "talk", "凉风至，白露生，寒蝉鸣，我新酿了的枫露白，此时启封最是好。", "char", 40008, "name", "承影", "talking", 40008, "next", list(41))
);
    }

    private static void init8() {
data.map(
    41, map("id", 41, "talk", "你若是有空，不妨来寻我共尝这新酒，我必扫榻相迎。", "char", 40008, "name", "承影", "talking", 40008),
    42, map("id", 42, "talk", "恍然不觉，我也到了将屠苏递给家中小儿的年岁。", "char", 40008, "name", "承影", "talking", 40008, "next", list(43)),
    43, map("id", 43, "talk", "我初至……时，虽训练酷厉，因我年纪最小，每逢新岁，师傅总是先将屠苏递予我喝。", "char", 40008, "name", "承影", "talking", 40008, "next", list(44, 46, 48)),
    44, map("id", 44, "talk", "光阴似箭，日月如梭。", "char", 40008, "name", "玩家", "talking", -1, "next", list(45), "lovefeel", "60", "intimacyn", 10),
    45, map("id", 45, "talk", "……确实如此。幼时总想快些长大，如今，却又想回少年时。", "char", 40008, "name", "承影", "talking", 40008, "next", list(50))
);
    }

    private static void init9() {
data.map(
    46, map("id", 46, "talk", "若是你拉的下脸，也可以先一口喝个干净。", "char", 40008, "name", "玩家", "talking", -1, "next", list(47), "lovefeel", "90", "intimacyn", 10),
    47, map("id", 47, "talk", "我并非如某人一般厚颜无耻。", "char", 40008, "name", "承影", "talking", 40008, "next", list(50)),
    48, map("id", 48, "talk", "不服老还是怎么的？", "char", 40008, "name", "玩家", "talking", -1, "next", list(49), "lovefeel", "30", "intimacyn", 10),
    49, map("id", 49, "talk", "……本人虚度二十又五载光阴。", "char", 40008, "name", "承影", "talking", 40008, "next", list(50)),
    50, map("id", 50, "talk", "话虽如此，这一杯屠苏我仍旧愿意递与你。", "char", 40008, "name", "承影", "talking", 40008, "next", list(51))
);
    }

    private static void init10() {
data.map(
    51, map("id", 51, "talk", "若是可以，年年岁岁这一杯屠苏酒，我都愿意递与你。", "char", 40008, "name", "承影", "talking", 40008),
    52, map("id", 52, "talk", "承影，可否询你一事？", "char", 40008, "name", "玩家", "talking", -1, "next", list(53)),
    53, map("id", 53, "talk", "但说无妨，知无不言。", "char", 40008, "name", "承影", "talking", 40008, "next", list(54, 57, 59)),
    54, map("id", 54, "talk", "你为何如此爱喝酒？", "char", 40008, "name", "玩家", "talking", -1, "next", list(55), "lovefeel", "30", "intimacyn", 10, "end", 1),
    55, map("id", 55, "talk", "酒能解愁，能忘忧，有何不好？", "char", 40008, "name", "承影", "talking", 40008, "next", list(56))
);
    }

    private static void init11() {
data.map(
    56, map("id", 56, "talk", "……你莫要担心我，我心中无事，只是单纯的喜欢而已。", "char", 40008, "name", "承影", "talking", 40008),
    57, map("id", 57, "talk", "你为何会成为暗卫？", "char", 40008, "name", "玩家", "talking", -1, "next", list(58), "lovefeel", "60", "intimacyn", 10, "end", 1),
    58, map("id", 58, "talk", "幼时家中贫困，我父早亡，母亲带着弟弟，只好将我卖入暗卫营。不过这都是过去的事情了……我也不是很在意。", "char", 40008, "name", "承影", "talking", 40008),
    59, map("id", 59, "talk", "你原来叫什么？", "char", 40008, "name", "玩家", "talking", -1, "next", list(60), "lovefeel", "90", "intimacyn", 10),
    60, map("id", 60, "talk", "……", "char", 40008, "name", "承影", "talking", 40008, "next", list(61))
);
    }

    private static void init12() {
data.map(
    61, map("id", 61, "talk", "…………", "char", 40008, "name", "承影", "talking", 40008, "next", list(62)),
    62, map("id", 62, "talk", "我原本的名字早已忘却，不过年少时有一挚友为我取名。", "char", 40008, "name", "承影", "talking", 40008, "next", list(63)),
    63, map("id", 63, "talk", "十五年前，我与他唯一一次偷溜出营，便是去了酒楼。那时店家仿前朝宫廷御酿兰生酒，广邀宾客……", "char", 40008, "name", "承影", "talking", 40008, "next", list(64)),
    64, map("id", 64, "talk", "我们后来喝醉了，他道兰生酒集百花露水，芳若兰芷，醉后逍遥若神仙……以后我们也要日日这般放肆快活，故而要给自己取名叫‘逍遥’，而给我取名叫‘兰生’，用以纪念此日。", "char", 40008, "name", "承影", "talking", 40008, "next", list(65, 67, 69)),
    65, map("id", 65, "talk", "唯一一次？", "char", 40008, "name", "玩家", "talking", -1, "next", list(66), "lovefeel", "60", "intimacyn", 10, "end", 1)
);
    }

    private static void init13() {
data.map(
    66, map("id", 66, "talk", "恩，唯一一次。", "char", 40008, "name", "承影", "talking", 40008, "next", list(71)),
    67, map("id", 67, "talk", "兰生真是个好名字，听来便觉得心里都充满了温柔……", "char", 40008, "name", "玩家", "talking", -1, "next", list(68), "lovefeel", "30", "intimacyn", 10, "end", 1),
    68, map("id", 68, "talk", "……多谢你。", "char", 40008, "name", "承影", "talking", 40008, "next", list(71)),
    69, map("id", 69, "talk", "你那位朋友真是个妙人儿。", "char", 40008, "name", "玩家", "talking", -1, "next", list(70), "lovefeel", "90", "intimacyn", 10, "end", 1),
    70, map("id", 70, "talk", "呵……谁说不是呢……", "char", 40008, "name", "承影", "talking", 40008, "next", list(71))
);
    }

    private static void init14() {
data.map(
    71, map("id", 71, "talk", "不与你闲谈了，府中有事吩咐，我先离开一会儿。", "char", 40008, "name", "承影", "talking", 40008),
    72, map("id", 72, "talk", "数日不见，近日可好？你若是有闲，不如来我处一趟。", "char", 40008, "name", "承影", "talking", 40008, "next", list(73, 75, 77)),
    73, map("id", 73, "talk", "……你再不出现我还以为你失手了！", "char", 40008, "name", "玩家", "talking", -1, "next", list(74), "lovefeel", "90", "intimacyn", 10),
    74, map("id", 74, "talk", "只是去得久了一些而已，何至如此？", "char", 40008, "name", "承影", "talking", 40008, "next", list(79)),
    75, map("id", 75, "talk", "你有何事寻我？", "char", 40008, "name", "玩家", "talking", -1, "next", list(76), "lovefeel", "60", "intimacyn", 10)
);
    }

    private static void init15() {
data.map(
    76, map("id", 76, "talk", "无事便不能寻你了？", "char", 40008, "name", "承影", "talking", 40008, "next", list(79)),
    77, map("id", 77, "talk", "虽然很想去，但是我现在在当差。", "char", 40008, "name", "玩家", "talking", -1, "next", list(78), "lovefeel", "30", "intimacyn", 10, "end", 1),
    78, map("id", 78, "talk", "如此不巧？那便好好当差吧，若是出了差错，便是不死也要被脱层皮。我这里你何时想来都可以。", "char", 40008, "name", "承影", "talking", 40008),
    79, map("id", 79, "talk", "我寻着了一块石碑，疑似东坡先生遗物，你于此道颇有建树，若是有闲便来与我看一看。", "char", 40008, "name", "承影", "talking", 40008, "next", list(80, 82, 84)),
    80, map("id", 80, "talk", "东坡先生的遗物？", "char", 40008, "name", "玩家", "talking", -1, "next", list(81), "lovefeel", "30", "intimacyn", 10, "end", 1)
);
    }

    private static void init16() {
data.map(
    81, map("id", 81, "talk", "在罗浮山中寻到的，应是无错。", "char", 40008, "name", "承影", "talking", 40008, "next", list(86)),
    82, map("id", 82, "talk", "罗浮春？", "char", 40008, "name", "玩家", "talking", -1, "next", list(83), "lovefeel", "90", "intimacyn", 10, "end", 1),
    83, map("id", 83, "talk", "懂我者，汝也。", "char", 40008, "name", "承影", "talking", 40008, "next", list(86)),
    84, map("id", 84, "talk", "这等珍宝，也能被你寻着，当真厉害……", "char", 40008, "name", "玩家", "talking", -1, "next", list(85), "lovefeel", "60", "intimacyn", 10, "end", 1),
    85, map("id", 85, "talk", "确实是花费了不少功夫，若不是我机敏，便要折在深山中了。", "char", 40008, "name", "承影", "talking", 40008, "next", list(86))
);
    }

    private static void init17() {
data.map(
    86, map("id", 86, "talk", "那么便约定了，今晚便来我家中，为我看了看这石碑。", "char", 40008, "name", "承影", "talking", 40008, "next", list(87)),
    87, map("id", 87, "talk", "……若是解不出石碑也无妨……许久未见你，着实想念。", "char", 40008, "name", "承影", "talking", 40008),
    88, map("id", 88, "talk", "绿蚁新醅酒，红泥小火炉。晚来天欲雪，能饮一杯无？", "char", 40008, "name", "承影", "talking", 40008, "next", list(89, 92, 95)),
    89, map("id", 89, "talk", "……你若是想寻我喝酒直说便是了。", "char", 40008, "name", "玩家", "talking", -1, "next", list(90), "lovefeel", "90", "intimacyn", 10),
    90, map("id", 90, "talk", "当世知我者，唯一二也。", "char", 40008, "name", "承影", "talking", 40008, "next", list(91))
);
    }

    private static void init18() {
data.map(
    91, map("id", 91, "talk", "既知如此，还不速来？", "char", 40008, "name", "承影", "talking", 40008, "next", list(98, 100, 102)),
    92, map("id", 92, "talk", "真是奇了怪了，我们眼高于顶的承影大人居然制了米酒？", "char", 40008, "name", "玩家", "talking", -1, "next", list(93), "lovefeel", "60", "intimacyn", 10),
    93, map("id", 93, "talk", "并非米酒，乃是我新制之酒。", "char", 40008, "name", "承影", "talking", 40008, "next", list(94)),
    94, map("id", 94, "talk", "那日雨过天青，水天一色，望而生感，妙手而得此酒。酒色霜青，漾波则绿，我为它取名‘寒霜点翠’。", "char", 40008, "name", "承影", "talking", 40008, "next", list(98, 100, 102)),
    95, map("id", 95, "talk", "今日师父寻我作陪，改日再约吧。", "char", 40008, "name", "玩家", "talking", -1, "next", list(96), "lovefeel", "30", "intimacyn", 10, "end", 1)
);
    }

    private static void init19() {
data.map(
    96, map("id", 96, "talk", "哦？他居然下山了？真是少见。", "char", 40008, "name", "承影", "talking", 40008, "next", list(97)),
    97, map("id", 97, "talk", "如此我便不扰你了。", "char", 40008, "name", "承影", "talking", 40008),
    98, map("id", 98, "talk", "能让你如此积极，怕是难得之物。", "char", 40008, "name", "玩家", "talking", -1, "next", list(99), "lovefeel", "60", "intimacyn", 10, "end", 1),
    99, map("id", 99, "talk", "若非绝世之宝，又如何敢唤你来？", "char", 40008, "name", "玩家", "talking", -1, "next", list(111)),
    100, map("id", 100, "talk", "初识你之时……现在想来，果然是妙不可言。", "char", 40008, "name", "玩家", "talking", -1, "next", list(101), "lovefeel", "90", "intimacyn", 10)
);
    }

    private static void init20() {
data.map(
    101, map("id", 101, "talk", "初识我之时如何？", "char", 40008, "name", "承影", "talking", 40008, "next", list(104, 106, 108)),
    102, map("id", 102, "talk", "听着很不错，但是我这几日咳疾复发，还是下次再约吧。", "char", 40008, "name", "玩家", "talking", -1, "next", list(103), "lovefeel", "30", "intimacyn", 10, "end", 1),
    103, map("id", 103, "talk", "既然如此，身体要紧。", "char", 40008, "name", "承影", "talking", 40008),
    104, map("id", 104, "talk", "觉得你是一个刚硬冷酷之人。", "char", 40008, "name", "玩家", "talking", -1, "next", list(105), "lovefeel", "30", "intimacyn", 10, "end", 1),
    105, map("id", 105, "talk", "哦？原来我在你心中是如此之人，着实让我失望。", "char", 40008, "name", "承影", "talking", 40008)
);
    }

    private static void init21() {
data.map(
    106, map("id", 106, "talk", "觉得你是一个无欲无求之人。", "char", 40008, "name", "玩家", "talking", -1, "next", list(107), "lovefeel", "60", "intimacyn", 10, "end", 1),
    107, map("id", 107, "talk", "若是等我心法大成，怕就如你口中，乃是一名无欲无求之人了。", "char", 40008, "name", "承影", "talking", 40008, "next", list(111)),
    108, map("id", 108, "talk", "觉得你是一个沉默寡言之人。", "char", 40008, "name", "玩家", "talking", -1, "next", list(109), "lovefeel", "90", "intimacyn", 10, "end", 1),
    109, map("id", 109, "talk", "你的意思是嫌我话多？", "char", 40008, "name", "承影", "talking", 40008, "next", list(110)),
    110, map("id", 110, "talk", "我之前认识你之时，也不曾想过自己会有今天这模样。", "char", 40008, "name", "承影", "talking", 40008, "next", list(111))
);
    }

    private static void init22() {
data.map(
    111, map("id", 111, "talk", "若是还想与我说话，便来我这里吧。这鸿雁传书……着实不便。", "char", 40008, "name", "承影", "talking", 40008, "next", list(112)),
    112, map("id", 112, "talk", "……我想见你。", "char", 40008, "name", "承影", "talking", 40008),
    113, map("id", 113, "talk", "前日王翰林寻我，直言相邀我去那什么曲江宴。", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(114)),
    114, map("id", 114, "talk", "我瞧这几日天色尚好，正适合游玩踏青。你可要与我一同前去？", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(115, 117, 120)),
    115, map("id", 115, "talk", "游玩踏青？", "char", 40017, "name", "玩家", "talking", -1, "next", list(116), "lovefeel", "90", "intimacyn", 10, "end", 1)
);
    }

    private static void init23() {
data.map(
    116, map("id", 116, "talk", "每逢这时日，京郊桃林尽绽，万枝灼春。最是适合一同出游。", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(123)),
    117, map("id", 117, "talk", "曲江宴？莫非是昔年玄宗为新科进士所设御宴？", "char", 40017, "name", "玩家", "talking", -1, "next", list(118), "lovefeel", "30", "intimacyn", 10, "end", 1),
    118, map("id", 118, "talk", "是也不是。虽然曲江宴为玄宗所设，可也从没禁了旁人去办。", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(119)),
    119, map("id", 119, "talk", "规矩都是人定的。他既未曾禁止，文人墨客们便有样学样。", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(123)),
    120, map("id", 120, "talk", "玄机这等才名，王翰林邀请你，倒是不甚意外。", "char", 40017, "name", "玩家", "talking", -1, "next", list(121), "lovefeel", "60", "intimacyn", 10, "end", 1)
);
    }

    private static void init24() {
data.map(
    121, map("id", 121, "talk", "不过是各取所需罢了。他目的不纯，我自然也另有所图。", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(122)),
    122, map("id", 122, "talk", "不过……", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(123)),
    123, map("id", 123, "talk", "上巳踏青、曲水流饮，倒也算美事一桩。", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(124)),
    124, map("id", 124, "talk", "说了这么多，还没问你的打算。我向来不好热闹，也没什么朋友……", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(125)),
    125, map("id", 125, "talk", "你若是肯赏脸同去，玄机实是感激不尽。", "char", 40017, "name", "鱼玄机", "talking", 40017)
);
    }

    private static void init25() {
data.map(
    126, map("id", 126, "talk", "方才外出郊游，忽地便下了一场大雨。依稀记得你前些时候说要出门采风，不知可有被淋着？", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(127, 130, 134)),
    127, map("id", 127, "talk", "说来惭愧，今日见天色不好，便未曾出门。", "char", 40017, "name", "玩家", "talking", -1, "next", list(128), "lovefeel", "30", "intimacyn", 10, "end", 1),
    128, map("id", 128, "talk", "原来如此。倒是玄机想岔了。", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(129)),
    129, map("id", 129, "talk", "我还有些事情，便不叨扰你了。还望保重身体。", "char", 40017, "name", "鱼玄机", "talking", 40017),
    130, map("id", 130, "talk", "被淋了个通透，险些连书稿一道打湿了。", "char", 40017, "name", "玩家", "talking", -1, "next", list(131), "lovefeel", "90", "intimacyn", 10)
);
    }

    private static void init26() {
data.map(
    131, map("id", 131, "talk", "呵，不曾想你竟也是这般莽撞之人。这么大的雨，不知寻个地方躲躲？", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(132)),
    132, map("id", 132, "talk", "急着赶路，便忘记了这件事情。等到想起来，已经变成了个落汤鸡。", "char", 40017, "name", "玩家", "talking", -1, "next", list(133)),
    133, map("id", 133, "talk", "有香客方才送来了些新姜。若你路过道观，不妨进来饮上一些现制的姜汤。", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(137, 138, 139)),
    134, map("id", 134, "talk", "未曾被淋着。师父曾教我夜辨天象，是以早早带了蓑衣出门。", "char", 40017, "name", "玩家", "talking", -1, "next", list(135), "lovefeel", "60", "intimacyn", 10),
    135, map("id", 135, "talk", "我知道你定是早有准备，现在看果真如此。", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(136))
);
    }

    private static void init27() {
data.map(
    136, map("id", 136, "talk", "待你归来后，定要与你一起，将搜集来的那些民谣好好鉴赏一番。", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(137, 138, 139)),
    137, map("id", 137, "talk", "怎么突然想起来邀请我？", "char", 40017, "name", "玩家", "talking", -1, "next", list(140), "end", 1),
    138, map("id", 138, "talk", "咦，此话当真？", "char", 40017, "name", "玩家", "talking", -1, "next", list(140), "end", 1),
    139, map("id", 139, "talk", "如此甚好！", "char", 40017, "name", "玩家", "talking", -1, "next", list(140), "end", 1),
    140, map("id", 140, "talk", "我自幼住在京畿，未曾得览过别地风光。想你这次出门采风，定是带了不少好东西回来。", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(141))
);
    }

    private static void init28() {
data.map(
    141, map("id", 141, "talk", "若就此错过，岂不遗憾？自然要将你留在我这儿，细细研读才好。", "char", 40017, "name", "鱼玄机", "talking", 40017),
    142, map("id", 142, "talk", "我这里新进了一批春茶，你可要来道观尝尝？", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(143, 146, 148)),
    143, map("id", 143, "talk", "那我得带几本珍藏的诗集过去了。", "char", 40017, "name", "玩家", "talking", -1, "next", list(144), "lovefeel", "90", "intimacyn", 10, "end", 1),
    144, map("id", 144, "talk", "呵，赌书泼茶？你倒是好一番闲情雅致。", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(145)),
    145, map("id", 145, "talk", "刚巧，我新作了几首诗，你也帮我一同瞧瞧吧。", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(146))
);
    }

    private static void init29() {
data.map(
    146, map("id", 146, "talk", "极好，刚巧我也有东西想要赠你。", "char", 40017, "name", "玩家", "talking", -1, "next", list(147), "lovefeel", "30", "intimacyn", 10, "end", 1),
    147, map("id", 147, "talk", "那我便在道观恭候大驾。若是来晚了，可莫要怨我没给你留茶。", "char", 40017, "name", "鱼玄机", "talking", 40017),
    148, map("id", 148, "talk", "怎么突然想到请我喝茶？", "char", 40017, "name", "玩家", "talking", -1, "next", list(149), "lovefeel", "60", "intimacyn", 10, "end", 1),
    149, map("id", 149, "talk", "前几日阴雨连绵，道观珍藏的书籍受了潮。刚巧今日雨霁天青……", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(150)),
    150, map("id", 150, "talk", "好呀，原来是想叫我去做苦力！", "char", 40017, "name", "玩家", "talking", -1, "next", list(151))
);
    }

    private static void init30() {
data.map(
    151, map("id", 151, "talk", "既然你闲着也是闲着，倒不如来帮我晒晒这书。作为回礼，我请你尝一尝这明前的新茶。", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(152)),
    152, map("id", 152, "talk", "当然，若你不愿，我亦不会勉强。我已让绿翘装了些茶，差人给你送去。", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(153)),
    153, map("id", 153, "talk", "……若是可以，还是希望你能来……", "char", 40017, "name", "鱼玄机", "talking", 40017),
    154, map("id", 154, "talk", "不知有何事寻我？", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(155)),
    155, map("id", 155, "talk", "我有一事想要询问，不知该不该说出口。", "char", 40017, "name", "玩家", "talking", -1, "next", list(156))
);
    }

    private static void init31() {
data.map(
    156, map("id", 156, "talk", "你说便是。若我听了不高兴，就当做未曾听见。", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(157, 162, 164)),
    157, map("id", 157, "talk", "缘何要出家做女冠？", "char", 40017, "name", "玩家", "talking", -1, "next", list(158), "lovefeel", "30", "intimacyn", 10, "end", 1),
    158, map("id", 158, "talk", "世人多愚昧。既无人得解我心中之意，倒不如入观，从此青灯一生。", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(159)),
    159, map("id", 159, "talk", "玄机……", "char", 40017, "name", "玩家", "talking", -1, "next", list(160)),
    160, map("id", 160, "talk", "……你不必为我担忧。从前我是孤独一人，自然这般作想。如今有你为伴，日子虽然清苦了些，可心却是快活的。", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(161))
);
    }

    private static void init32() {
data.map(
    161, map("id", 161, "talk", "人一生得一知己，已是足矣。至于别的，便不再奢求。", "char", 40017, "name", "鱼玄机", "talking", 40017),
    162, map("id", 162, "talk", "不知玄机此号，由何人所起？", "char", 40017, "name", "玩家", "talking", -1, "next", list(163), "lovefeel", "60", "intimacyn", 10, "end", 1),
    163, map("id", 163, "talk", "昔日出家为女冠之时，由道观观主所赐。不过她已亡故多年，你要是想去见一见她，怕是没机会了。", "char", 40017, "name", "鱼玄机", "talking", 40017),
    164, map("id", 164, "talk", "玄机这般诗才，不由对尊师很是好奇。", "char", 40017, "name", "玩家", "talking", -1, "next", list(165), "lovefeel", "90", "intimacyn", 10),
    165, map("id", 165, "talk", "你竟然好奇这个？", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(166))
);
    }

    private static void init33() {
data.map(
    166, map("id", 166, "talk", "罢了，既然你想知道。我就说与你吧。", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(167)),
    167, map("id", 167, "talk", "我爹爹早亡，家中又只有我一个独女。母亲便只能靠浆洗缝补衣裳补贴些家用，维持生计。我也因此丢了读书的机会，跟着母亲靠做活儿赚钱。", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(168)),
    168, map("id", 168, "talk", "他人很好，见我年纪小小，竟这般可怜。又不忍我浪费了大好青春才华，便资助我读书，教给了我许多东西。", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(169)),
    169, map("id", 169, "talk", "说来他也是一等一的栋梁，只是不知缘何流落江湖，并未出仕拜相。", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(170, 171, 173)),
    170, map("id", 170, "talk", "原来竟是这般，倒真想见他一面。", "char", 40017, "name", "玩家", "talking", -1, "next", list(175), "end", 1)
);
    }

    private static void init34() {
data.map(
    171, map("id", 171, "talk", "那他现在人在何处？", "char", 40017, "name", "玩家", "talking", -1, "next", list(172), "end", 1),
    172, map("id", 172, "talk", "我与他阔别已久，并不知他如今在何处。不过世间种种机缘难测，说不定有一日，你便在这京畿瞧见了他呢。", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(175)),
    173, map("id", 173, "talk", "玄机能遇上此人，也是幸运。", "char", 40017, "name", "玩家", "talking", -1, "next", list(174), "end", 1),
    174, map("id", 174, "talk", "幸运？呵，如此说来，倒的确是幸运。但于他而言，这究竟是幸还是不幸呢……", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(175)),
    175, map("id", 175, "talk", "我还有事，今天便到此为止吧。", "char", 40017, "name", "鱼玄机", "talking", 40017)
);
    }

    private static void init35() {
data.map(
    176, map("id", 176, "talk", "你近来可有时间？我新学了首曲子，想让你听听。", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(177, 180, 185)),
    177, map("id", 177, "talk", "听绿翘说你忙得很。原是为了这个。", "char", 40017, "name", "玩家", "talking", -1, "next", list(178), "lovefeel", "30", "intimacyn", 10),
    178, map("id", 178, "talk", "绿翘那丫头倒是勤快，本无意告知你此事，不想却被她先泄露了出去。", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(179)),
    179, map("id", 179, "talk", "她也只是好意罢了，你莫要多想。", "char", 40017, "name", "玩家", "talking", -1, "next", list(188)),
    180, map("id", 180, "talk", "是什么曲子？", "char", 40017, "name", "玩家", "talking", -1, "next", list(181), "lovefeel", "90", "intimacyn", 10)
);
    }

    private static void init36() {
data.map(
    181, map("id", 181, "talk", "是凤求凰。", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(182)),
    182, map("id", 182, "talk", "咦？玄机的意思难不成是……", "char", 40017, "name", "玩家", "talking", -1, "next", list(183)),
    183, map("id", 183, "talk", "你莫要多想，不过是教我曲子的人最擅此曲罢了。我可不是专门学的……", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(184)),
    184, map("id", 184, "talk", "好好好，既然你这么说了，我信就是。", "char", 40017, "name", "玩家", "talking", -1, "next", list(188)),
    185, map("id", 185, "talk", "消失这么久，还以为你帮人驱邪去了。", "char", 40017, "name", "玩家", "talking", -1, "next", list(186), "lovefeel", "60", "intimacyn", 10)
);
    }

    private static void init37() {
data.map(
    186, map("id", 186, "talk", "做法事，不过是图个心安而已。这世间哪来的那许多邪祟需要驱赶？说到底，也只是人心中有祟罢了。", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(187)),
    187, map("id", 187, "talk", "那曲子是我从昔年临江楼的一位琴娘处学来的。她年轻时曾技惊四座，引得无数才子墨客追逐。你若来我观内走上一遭，定不会失望而归。", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(188)),
    188, map("id", 188, "talk", "门前红叶落而未扫，只虚位以待，等候卿来。", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(189, 190, 191)),
    189, map("id", 189, "talk", "如此盛情相邀，怎敢推拒？", "char", 40017, "name", "玩家", "talking", -1, "next", list(193), "end", 1),
    190, map("id", 190, "talk", "玄机以知音待我，这场邀约，定是要赴的。", "char", 40017, "name", "玩家", "talking", -1, "next", list(193), "end", 1)
);
    }

    private static void init38() {
data.map(
    191, map("id", 191, "talk", "近日甚为忙碌，还是改日再约吧。", "char", 40017, "name", "玩家", "talking", -1, "next", list(192), "end", 1),
    192, map("id", 192, "talk", "如此也好。", "char", 40017, "name", "鱼玄机", "talking", 40017),
    193, map("id", 193, "talk", "那我这便去焚香沐浴，就这么说好了。", "char", 40017, "name", "鱼玄机", "talking", 40017),
    194, map("id", 194, "talk", "你可知道什么能治头疼的法子？今日不知怎的，头昏脑涨，连东西都看不清了。", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(195, 197, 200)),
    195, map("id", 195, "talk", "发生了什么事？", "char", 40017, "name", "玩家", "talking", -1, "next", list(196), "lovefeel", "60", "intimacyn", 10)
);
    }

    private static void init39() {
data.map(
    196, map("id", 196, "talk", "昨日有旧友来访，一时高兴，便放纵了些。", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(202, 207, 209)),
    197, map("id", 197, "talk", "这几日忽冷忽热，莫不是着了凉？", "char", 40017, "name", "玩家", "talking", -1, "next", list(198), "lovefeel", "90", "intimacyn", 10),
    198, map("id", 198, "talk", "这倒不至于，不过是昨日与临江楼来的娘子多饮了几杯。哪知……", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(199)),
    199, map("id", 199, "talk", "果真贪杯坏事。", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(202, 207, 209)),
    200, map("id", 200, "talk", "怎会突然头疼？", "char", 40017, "name", "玩家", "talking", -1, "next", list(201), "lovefeel", "30", "intimacyn", 10)
);
    }

    private static void init40() {
data.map(
    201, map("id", 201, "talk", "约莫是因为昨日宿醉吧。", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(202, 207, 209)),
    202, map("id", 202, "talk", "原来道士也会饮酒。", "char", 40017, "name", "玩家", "talking", -1, "next", list(203), "lovefeel", "90", "intimacyn", 10),
    203, map("id", 203, "talk", "道士又怎么了？那也是人，自然会有七情六欲……", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(204)),
    204, map("id", 204, "talk", "往日也没见你在我面前避讳，怎的今日便说起这事儿来了？", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(205)),
    205, map("id", 205, "talk", "从未见你醉过，因此十分惊讶。", "char", 40017, "name", "玩家", "talking", -1, "next", list(206))
);
    }

    private static void init41() {
data.map(
    206, map("id", 206, "talk", "你没见过的可多了去了。我的名声在京畿狼藉至此，你心里难道没数儿？", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(207)),
    207, map("id", 207, "talk", "喝多了便好好休息吧，莫要强撑。", "char", 40017, "name", "玩家", "talking", -1, "next", list(208), "lovefeel", "30", "intimacyn", 10, "end", 1),
    208, map("id", 208, "talk", "说的也是，那我这就去休息。", "char", 40017, "name", "鱼玄机", "talking", 40017),
    209, map("id", 209, "talk", "你可不是这般容易动感情的人。", "char", 40017, "name", "玩家", "talking", -1, "next", list(210), "lovefeel", "60", "intimacyn", 10),
    210, map("id", 210, "talk", "昔年一别后，我再未想过能与她重逢。如今机缘巧合下竟能再见，如何不值得感怀？", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(211))
);
    }

    private static void init42() {
data.map(
    211, map("id", 211, "talk", "如此说来，那可得要恭喜你才是。", "char", 40017, "name", "玩家", "talking", -1, "next", list(212)),
    212, map("id", 212, "talk", "……我只是突然想起了故人而已……", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(213)),
    213, map("id", 213, "talk", "故人？", "char", 40017, "name", "玩家", "talking", -1, "next", list(214)),
    214, map("id", 214, "talk", "罢了，他人在天涯，想来逍遥快活得很。一生短暂，又何必瞻前顾尾，畏畏缩缩。", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(215)),
    215, map("id", 215, "talk", "如若能全心中所愿。哪怕朝生暮死，也能再无遗憾了吧。", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(225))
);
    }

    private static void init43() {
data.map(
    216, map("id", 216, "talk", "别这么说，我觉得你这样已是极好。", "char", 40017, "name", "玩家", "talking", -1, "next", list(217), "lovefeel", "90", "intimacyn", 10, "end", 1),
    217, map("id", 217, "talk", "……极好？你当真这般认为？", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(218)),
    218, map("id", 218, "talk", "这是自然。若非如此，你我又怎会相识？", "char", 40017, "name", "玩家", "talking", -1, "next", list(225)),
    219, map("id", 219, "talk", "你勿要妄自菲薄。", "char", 40017, "name", "玩家", "talking", -1, "next", list(220), "lovefeel", "30", "intimacyn", 10, "end", 1),
    220, map("id", 220, "talk", "也不尽是。不过，对以前的自己略有怀疑罢了……", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(221))
);
    }

    private static void init44() {
data.map(
    221, map("id", 221, "talk", "我这一生，究竟该说是幸，还是不幸……", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(225)),
    222, map("id", 222, "talk", "人活于世，又何必要在意他人眼光？", "char", 40017, "name", "玩家", "talking", -1, "next", list(223), "lovefeel", "60", "intimacyn", 10, "end", 1),
    223, map("id", 223, "talk", "我觉得你的那位朋友，话说得其实很对。", "char", 40017, "name", "玩家", "talking", -1, "next", list(224)),
    224, map("id", 224, "talk", "呵，你也是洒脱。小小年纪便有这等心境，倒十分难得。", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(225)),
    225, map("id", 225, "talk", "与你说了这些，心情好多了。谢谢你。", "char", 40017, "name", "鱼玄机", "talking", 40017, "next", list(226))
);
    }

    private static void init45() {
data.map(
    226, map("id", 226, "talk", "今晚若有空闲，便来我这儿吧。我请你喝新开封的桑落。", "char", 40017, "name", "鱼玄机", "talking", 40017),
    227, map("id", 227, "talk", "今日偶得一失传已久的曲谱残章，名曰《灵渺》。试奏之，由空灵飘逸起，后铿锵振奋，未料曲谱至此戛然而止。心中对余下篇章甚是好奇，后我了解到这曲谱乃是皇家雅乐，想来你在宫内颇有人缘，不知可否帮忙探寻？", "char", 40023, "name", "范蠡", "talking", 40023, "next", list(228, 231, 233)),
    228, map("id", 228, "talk", "哦？若是寻得，可是要偷出来给你？不管怎么样，听起来可都是够辛苦的。", "char", 40023, "name", "玩家", "talking", -1, "next", list(229), "lovefeel", "90", "intimacyn", 10),
    229, map("id", 229, "talk", "我只是好奇曲谱内容，并未对其本身有窥探之意，我相信以你之天资，", "char", 40023, "name", "范蠡", "talking", 40023, "next", list(230)),
    230, map("id", 230, "talk", "若是寻得，定不负你一番辛劳。", "char", 40023, "name", "范蠡", "talking", 40023, "next", list(235))
);
    }

    private static void init46() {
data.map(
    231, map("id", 231, "talk", "没想到还有你办不到的事情。", "char", 40023, "name", "玩家", "talking", -1, "next", list(232), "lovefeel", "60", "intimacyn", 10),
    232, map("id", 232, "talk", "天地广阔，纵是神仙也有自己一方洞天，更何况我这等凡夫俗子。", "char", 40023, "name", "范蠡", "talking", 40023, "next", list(235)),
    233, map("id", 233, "talk", "听起来颇为费力，可有何好处？", "char", 40023, "name", "玩家", "talking", -1, "next", list(234), "lovefeel", "30", "intimacyn", 10),
    234, map("id", 234, "talk", "若有幸觅得，在我力所能及范围内，你可随意索求。", "char", 40023, "name", "范蠡", "talking", 40023, "next", list(235)),
    235, map("id", 235, "talk", "你在宫内事务繁杂之时，也可多聆雅乐，令身心舒畅。", "char", 40023, "name", "范蠡", "talking", 40023, "next", list(236, 238, 241))
);
    }

    private static void init47() {
data.map(
    236, map("id", 236, "talk", "哦，怕就怕心情烦躁之时，任何乐曲听起来都会觉得聒噪。", "char", 40023, "name", "玩家", "talking", -1, "next", list(237), "end", 1),
    237, map("id", 237, "talk", "乐曲之妙在于舒缓不在于帮助处理杂务，若是你有此困扰，不妨下次清空思绪，权当放松身心，无需过于思虑身外繁杂事务。", "char", 40023, "name", "范蠡", "talking", 40023),
    238, map("id", 238, "talk", "倒是个法子，我回去试试。", "char", 40023, "name", "玩家", "talking", -1, "next", list(239), "end", 1),
    239, map("id", 239, "talk", "可是最近宫内事务令你过于忧心？", "char", 40023, "name", "范蠡", "talking", 40023, "next", list(240)),
    240, map("id", 240, "talk", "若是有烦心事，不妨与我倾诉一番，或许心晴会舒爽些。", "char", 40023, "name", "范蠡", "talking", 40023)
);
    }

    private static void init48() {
data.map(
    241, map("id", 241, "talk", "怕就怕迷上了这些乐曲，以后都不想干活了。", "char", 40023, "name", "玩家", "talking", -1, "next", list(242), "end", 1),
    242, map("id", 242, "talk", "若真是这样，我怕是要负荆请罪了，不过我相信你不是如此无定力之人。", "char", 40023, "name", "范蠡", "talking", 40023, "next", list(243)),
    243, map("id", 243, "talk", "在其位谋其政，你在宫中有此地位，正是你实力的象征，且不可颓靡。", "char", 40023, "name", "范蠡", "talking", 40023),
    244, map("id", 244, "talk", "昨晚我养育多时的灵鸟故去，感叹之余想问问你对它生死之事如何看待？", "char", 40023, "name", "范蠡", "talking", 40023, "next", list(245, 248, 251)),
    245, map("id", 245, "talk", "故去或许也是一种解脱，不过这灵鸟与我无关，我才能说出如此淡薄之言。", "char", 40023, "name", "玩家", "talking", -1, "next", list(246), "lovefeel", "90", "intimacyn", 10)
);
    }

    private static void init49() {
data.map(
    246, map("id", 246, "talk", "旁观者看地通透，或许局中之人往往难以勘破。", "char", 40023, "name", "范蠡", "talking", 40023, "next", list(247)),
    247, map("id", 247, "talk", "无妨，与快言快语的你交谈果然无比顺畅。", "char", 40023, "name", "范蠡", "talking", 40023, "next", list(253)),
    248, map("id", 248, "talk", "去了也好，省得叽叽喳喳吵得人头痛", "char", 40023, "name", "玩家", "talking", -1, "next", list(249), "lovefeel", "60", "intimacyn", 10),
    249, map("id", 249, "talk", "你想问题的角度倒是很奇特。", "char", 40023, "name", "范蠡", "talking", 40023, "next", list(250)),
    250, map("id", 250, "talk", "只是这只灵鸟很通人性，并无聒噪之举。", "char", 40023, "name", "范蠡", "talking", 40023, "next", list(253))
);
    }

    private static void init50() {
data.map(
    251, map("id", 251, "talk", "还请先生节哀", "char", 40023, "name", "玩家", "talking", -1, "next", list(252), "lovefeel", "30", "intimacyn", 10),
    252, map("id", 252, "talk", "尘埃终有落定时，多谢安慰。", "char", 40023, "name", "范蠡", "talking", 40023, "next", list(253)),
    253, map("id", 253, "talk", "这只灵鸟曾陪伴一位聪慧清冷的女孩成长，若换做你，会否将这噩耗告知与她？", "char", 40023, "name", "范蠡", "talking", 40023, "next", list(254, 257, 259)),
    254, map("id", 254, "talk", "告知与不告知并无区别。先生对世事洒脱通透，想来这位女孩也并非对俗世固执之人。", "char", 40023, "name", "玩家", "talking", -1, "next", list(255), "end", 1),
    255, map("id", 255, "talk", "“对世事洒脱通透”真是对范某莫大的评价，只可惜范某仍执着于世间黄白之物，又何谈洒脱通透？", "char", 40023, "name", "范蠡", "talking", 40023, "next", list(256))
);
    }

    private static void init51() {
data.map(
    256, map("id", 256, "talk", "倒是我言中女子，寄予青娥，一心修道，只怕修为远在我之上。", "char", 40023, "name", "范蠡", "talking", 40023),
    257, map("id", 257, "talk", "死生轮回众人皆经历，死后能送这灵鸟一程总也不负其生前相伴。", "char", 40023, "name", "玩家", "talking", -1, "next", list(258), "end", 1),
    258, map("id", 258, "talk", "好一句不负相伴，只可惜……罢了罢了，既然往事已死，不提也罢。", "char", 40023, "name", "范蠡", "talking", 40023),
    259, map("id", 259, "talk", "当陪伴已成过往，轻易撕碎这份美好便是谓之残忍，若是我，绝对做不到。", "char", 40023, "name", "玩家", "talking", -1, "next", list(260), "end", 1),
    260, map("id", 260, "talk", "可隐瞒真可谓之长久之计么？只怕真相水落石之日，亦会是彼此反目之时。", "char", 40023, "name", "范蠡", "talking", 40023, "next", list(261))
);
    }

    private static void init52() {
data.map(
    261, map("id", 261, "talk", "范某言重，还请你无需多虑。", "char", 40023, "name", "范蠡", "talking", 40023),
    262, map("id", 262, "talk", "近日有弟子经验甚浅，误进了一批低劣货物，若换作你，当如何处理？", "char", 40023, "name", "范蠡", "talking", 40023, "next", list(263, 265, 268)),
    263, map("id", 263, "talk", "先生经商多年，不值得为了些蝇头利将其消耗殆尽。所以我认为还是尽数毁掉得好。", "char", 40023, "name", "玩家", "talking", -1, "next", list(264), "lovefeel", "30", "intimacyn", 10, "end", 1),
    264, map("id", 264, "talk", "人无诚不立，业无信不存，你虽未行商却仍通晓儒商之道，范某佩服。", "char", 40023, "name", "范蠡", "talking", 40023),
    265, map("id", 265, "talk", "依我看来，低劣货物并非百无一用，不如明白告知，折价出售，也能挽回部分损失。", "char", 40023, "name", "玩家", "talking", -1, "next", list(266), "lovefeel", "90", "intimacyn", 10, "end", 1)
);
    }

    private static void init53() {
data.map(
    266, map("id", 266, "talk", "若是蒙骗卖出，有违诚信之道，若是孤行焚毁，又颇觉可惜，行市之间总有空缺。", "char", 40023, "name", "范蠡", "talking", 40023, "next", list(267)),
    267, map("id", 267, "talk", "你这想法恰好弥补了这空缺。既能挽回部分损失，又物尽其用，有趣有趣，你倒总能想出与众不同的点子。", "char", 40023, "name", "范蠡", "talking", 40023),
    268, map("id", 268, "talk", "若是我就优劣货品掺和一起卖掉，不过我始终不是你，我猜你会一把火烧掉吧。", "char", 40023, "name", "玩家", "talking", -1, "next", list(269), "lovefeel", "60", "intimacyn", 10, "end", 1),
    269, map("id", 269, "talk", "有趣有趣，若你成为商人，只怕在盈利方面范某是自愧不如的。", "char", 40023, "name", "范蠡", "talking", 40023),
    270, map("id", 270, "talk", "吾之挚友喜得千金，在为幼女加名之时，在“冰玉”、 “忘忧”之间左右不定，不知若是你会如何抉择？", "char", 40023, "name", "范蠡", "talking", 40023, "next", list(271, 274, 276))
);
    }

    private static void init54() {
data.map(
    271, map("id", 271, "talk", "若是我，干脆写两张字条，让孩子自己抓就是了。", "char", 40023, "name", "玩家", "talking", -1, "next", list(272), "lovefeel", "90", "intimacyn", 10, "end", 1),
    272, map("id", 272, "talk", "这倒是目前最公正合理的做法，无论怎样都是孩子选的，大人倒也无需纠结。", "char", 40023, "name", "范蠡", "talking", 40023, "next", list(273)),
    273, map("id", 273, "talk", "我便把这法子告知我那挚友，想来能免却他不少烦忧。", "char", 40023, "name", "范蠡", "talking", 40023),
    274, map("id", 274, "talk", "忘忧吧，哪个父母不希望孩子开开心心没有忧愁呢？", "char", 40023, "name", "玩家", "talking", -1, "next", list(275), "lovefeel", "30", "intimacyn", 10, "end", 1),
    275, map("id", 275, "talk", "希冀虽好，但若是孩子不经历磨难又岂会成长，又岂能体悟无忧之珍贵呢？", "char", 40023, "name", "范蠡", "talking", 40023)
);
    }

    private static void init55() {
data.map(
    276, map("id", 276, "talk", "若是我的话，或许会选择冰玉？冰清玉洁，蕙质兰心，或许是对女子最高的赞赏了吧。", "char", 40023, "name", "玩家", "talking", -1, "next", list(277), "lovefeel", "60", "intimacyn", 10, "end", 1),
    277, map("id", 277, "talk", "冰清玉洁，蕙质兰心，果然还是会想到这一句。", "char", 40023, "name", "范蠡", "talking", 40023, "next", list(278)),
    278, map("id", 278, "talk", "啊，怎么了。", "char", 40023, "name", "范蠡", "talking", 40023),
    279, map("id", 279, "talk", "昨夜观星象，突见红鸾星堕入你命宫，向来不日你命里便要遭逢一番红鸾星动了。", "char", 40023, "name", "范蠡", "talking", 40023, "next", list(280, 282, 285)),
    280, map("id", 280, "talk", "有点意思，最近无聊的很，正想来点桃花玩玩。", "char", 40023, "name", "玩家", "talking", -1, "next", list(281), "lovefeel", "30", "intimacyn", 10, "end", 1)
);
    }

    private static void init56() {
data.map(
    281, map("id", 281, "talk", "在我看来，人间情事，最宜真心，最忌清浅，若是你抱着玩玩的心态，只怕到头来伤人伤己。", "char", 40023, "name", "范蠡", "talking", 40023),
    282, map("id", 282, "talk", "有意思，能算出来是大概什么时候吗？", "char", 40023, "name", "玩家", "talking", -1, "next", list(283), "lovefeel", "90", "intimacyn", 10, "end", 1),
    283, map("id", 283, "talk", "哦？看来你已经急不可耐了？", "char", 40023, "name", "范蠡", "talking", 40023, "next", list(284)),
    284, map("id", 284, "talk", "有些事情可是急不得，小心情急之下，会将眼前诸多境遇误会成桃花。", "char", 40023, "name", "范蠡", "talking", 40023),
    285, map("id", 285, "talk", "哎，真的吗？", "char", 40023, "name", "玩家", "talking", -1, "next", list(286), "lovefeel", "60", "intimacyn", 10, "end", 1)
);
    }

    private static void init57() {
data.map(
    286, map("id", 286, "talk", "确有此事，不过这次乃是红鸾星主动入你命宫，接下来成与不成还要看你是否愿意把握。", "char", 40023, "name", "范蠡", "talking", 40023),
    287, map("id", 287, "talk", "最近新雇了一名厨子，尤擅长各色小点，你若来苏州，可愿意来我处品尝一番？", "char", 40023, "name", "范蠡", "talking", 40023, "next", list(288, 291, 294)),
    288, map("id", 288, "talk", "都有哪些珍馐，说来听听", "char", 40023, "name", "玩家", "talking", -1, "next", list(289), "lovefeel", "90", "intimacyn", 10),
    289, map("id", 289, "talk", "云片糕、玉带糕、梅花糕、海棠糕，数不胜数，还怕你吃不过来。", "char", 40023, "name", "范蠡", "talking", 40023, "next", list(290)),
    290, map("id", 290, "talk", "只是甜腻化湿，湿气本是邪淫之气，下次若来我处，我便吩咐手下多做些除湿气的饮食给你。", "char", 40023, "name", "范蠡", "talking", 40023, "next", list(296))
);
    }

    private static void init58() {
data.map(
    291, map("id", 291, "talk", "先生果然阔气，厨子接二连三的", "char", 40023, "name", "玩家", "talking", -1, "next", list(292), "lovefeel", "60", "intimacyn", 10),
    292, map("id", 292, "talk", "享乐之事与金钱无关，只要问心无愧，又何须担心身外之物", "char", 40023, "name", "范蠡", "talking", 40023, "next", list(293)),
    293, map("id", 293, "talk", "你也不必客气，尽管享用便是。", "char", 40023, "name", "范蠡", "talking", 40023, "next", list(296)),
    294, map("id", 294, "talk", "近日事情有点多，下次去寻先生还不知要到何时，哎……", "char", 40023, "name", "玩家", "talking", -1, "next", list(295), "lovefeel", "30", "intimacyn", 10),
    295, map("id", 295, "talk", "无妨，你居宫中，自然要以宫内事务优先，如此我便不叨扰了。", "char", 40023, "name", "范蠡", "talking", 40023)
);
    }

    private static void init59() {
data.map(
    296, map("id", 296, "talk", "说到糕点，你平日喜好何种口味？", "char", 40023, "name", "范蠡", "talking", 40023, "next", list(297, 299, 302)),
    297, map("id", 297, "talk", "偏甜，闲极无聊之时，若是不来些香甜之物，怕是整个人都要废了。", "char", 40023, "name", "玩家", "talking", -1, "next", list(298), "end", 1),
    298, map("id", 298, "talk", "说来你久居宫中，不仅身边之人鱼龙混杂，更要面对诸多争斗竞逐，还盼你事事小心谨慎。", "char", 40023, "name", "范蠡", "talking", 40023),
    299, map("id", 299, "talk", "若是平时，可能会选择偏咸之物，算是给平日生活寻些刺激吧。", "char", 40023, "name", "玩家", "talking", -1, "next", list(300), "end", 1),
    300, map("id", 300, "talk", "想来你在宫中生活并未步步惊心，如此也好。", "char", 40023, "name", "范蠡", "talking", 40023, "next", list(301))
);
    }

    private static void init60() {
data.map(
    301, map("id", 301, "talk", "不论身处何境地都无需庸人自扰，这份决绝令人赞赏。", "char", 40023, "name", "范蠡", "talking", 40023),
    302, map("id", 302, "talk", "压力大的时候吃点咸的，心情不好的时候吃点甜的，生活的乐趣就在这里吧。", "char", 40023, "name", "玩家", "talking", -1, "next", list(303), "end", 1),
    303, map("id", 303, "talk", "那下次你来寻我之时，我可要好好算算你是压力大还是心情不好，以便对症下药。", "char", 40023, "name", "范蠡", "talking", 40023),
    304, map("id", 304, "talk", "哎，前几日执行任务，因为我的失误，连累同伴不幸受伤了。", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(305)),
    305, map("id", 305, "talk", "本来只该我一人受伤的，谁知道同伴之一相助。都怪我武艺不精，连累他了。", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(306, 309, 312))
);
    }

    private static void init61() {
data.map(
    306, map("id", 306, "talk", "你们怎么样？伤的严重吗？", "char", 40026, "name", "玩家", "talking", -1, "next", list(307), "lovefeel", "90", "intimacyn", 10),
    307, map("id", 307, "talk", "啊，这个你不必担心，只是小伤，卧床几日便可。", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(308)),
    308, map("id", 308, "talk", "今日……我的同伴已可以自如活动了。", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(315)),
    309, map("id", 309, "talk", "这什么任务啊，也太危险了吧。", "char", 40026, "name", "玩家", "talking", -1, "next", list(310), "lovefeel", "30", "intimacyn", 10),
    310, map("id", 310, "talk", "只是简单地护送雇主收藏的古董，没想到路上遇到山贼……", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(311))
);
    }

    private static void init62() {
data.map(
    311, map("id", 311, "talk", "可恶，他们人多势众，好在有同伴相助，最后东西总算平安送到。", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(315)),
    312, map("id", 312, "talk", "你们也太拼了，这是拿命执行任务啊！", "char", 40026, "name", "玩家", "talking", -1, "next", list(313), "lovefeel", "60", "intimacyn", 10),
    313, map("id", 313, "talk", "既然已经承诺，拼了命也要完成。", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(314)),
    314, map("id", 314, "talk", "对于我们来说，违背了已承诺的委托，远比丢了性命要严重。", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(315)),
    315, map("id", 315, "talk", "有时候我在想，幸好你时常在宫中，守卫森严，也能够安全些。", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(316))
);
    }

    private static void init63() {
data.map(
    316, map("id", 316, "talk", "不必如我一般，过着胆战心惊的日子。", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(317, 320, 323)),
    317, map("id", 317, "talk", "快好好休息吧，别想东想西的。", "char", 40026, "name", "玩家", "talking", -1, "next", list(318), "end", 1),
    318, map("id", 318, "talk", "嗯，大概是我这几日养伤在床，容易胡思乱想。", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(319)),
    319, map("id", 319, "talk", "不过，我是真心希望身边的朋友都平安，不受伤害。", "char", 40026, "name", "杜浪", "talking", 40026),
    320, map("id", 320, "talk", "宫里的日子也没有那么好过啊！", "char", 40026, "name", "玩家", "talking", -1, "next", list(321), "end", 1)
);
    }

    private static void init64() {
data.map(
    321, map("id", 321, "talk", "是吗？最近可是有什么烦心事？", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(322)),
    322, map("id", 322, "talk", "正好我这几日养伤也是无事，有什么不开心的说出来给我听，或许你会好受一些。", "char", 40026, "name", "杜浪", "talking", 40026),
    323, map("id", 323, "talk", "听你这么说伤得不轻啊，改天我去看看你吧!", "char", 40026, "name", "玩家", "talking", -1, "next", list(324), "end", 1),
    324, map("id", 324, "talk", "不必了，不必了。你的心意我收下了了。", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(325)),
    325, map("id", 325, "talk", "只是我真的是小伤而已，不必劳烦你来回奔波。", "char", 40026, "name", "杜浪", "talking", 40026)
);
    }

    private static void init65() {
data.map(
    326, map("id", 326, "talk", "我今日接了一项委托，乃是将一柄神兵利器送至一位主顾手中，谁知送至之时得知，那人已经故去了。", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(327, 329, 331)),
    327, map("id", 327, "talk", "竟然这么巧吗？果然阎王让他三更死，绝不留他到五更。", "char", 40026, "name", "玩家", "talking", -1, "next", list(328), "lovefeel", "90", "intimacyn", 10),
    328, map("id", 328, "talk", "是啊，每次执行危险任务之前，我都会往家中寄出书信，尤怕这会是……", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(334)),
    329, map("id", 329, "talk", "感觉这是白跑了一趟啊……", "char", 40026, "name", "玩家", "talking", -1, "next", list(330), "lovefeel", "60", "intimacyn", 10),
    330, map("id", 330, "talk", "并不，此番行程遇到颇多有趣的江湖人士，这为其一。这次也让我更加体会到生命无常，此为其二。", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(334))
);
    }

    private static void init66() {
data.map(
    331, map("id", 331, "talk", "太巧了吧，那人怎么死的？", "char", 40026, "name", "玩家", "talking", -1, "next", list(332), "lovefeel", "30", "intimacyn", 10),
    332, map("id", 332, "talk", "听闻是被仇家追杀。", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(333)),
    333, map("id", 333, "talk", "而这把剑本是他用来和仇家决斗的，奈何仇家提前几日伏击……", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(334)),
    334, map("id", 334, "talk", "我也是后来得知这次的委托物是一柄神兵利刃，据说哪怕功夫粗浅之人使用这把利刃，武艺也会精进。", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(335)),
    335, map("id", 335, "talk", "那位逝者的家人却怕睹物思人，不肯接受，于是现在这把剑便在我手中，你说我是否该试试这柄剑呢？", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(336, 339, 342))
);
    }

    private static void init67() {
data.map(
    336, map("id", 336, "talk", "我倒是不信一把剑就能让人武艺精进了，这样的话岂不是我也可以当剑圣了？", "char", 40026, "name", "玩家", "talking", -1, "next", list(337), "lovefeel", "90", "intimacyn", 10, "end", 1),
    337, map("id", 337, "talk", "果然你也是这么想的吗？神兵锋利，确实能助人克敌制胜。", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(338)),
    338, map("id", 338, "talk", "只是难免众口铄金，将其过度神话。", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(345)),
    339, map("id", 339, "talk", "我倒是觉得借着这个名号卖了赚点钱花花不错。", "char", 40026, "name", "玩家", "talking", -1, "next", list(340), "lovefeel", "60", "intimacyn", 10, "end", 1),
    340, map("id", 340, "talk", "哈哈，你总能想到意想不到的点子。", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(341))
);
    }

    private static void init68() {
data.map(
    341, map("id", 341, "talk", "只是用黄白之物衡量，岂不是浪费了这神兵利器？", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(345)),
    342, map("id", 342, "talk", "我觉得你倒不如试试那把剑，或许你的武艺就此大为精进也说不定？", "char", 40026, "name", "玩家", "talking", -1, "next", list(343), "lovefeel", "30", "intimacyn", 10, "end", 1),
    343, map("id", 343, "talk", "若真是这样，岂不是人人都可以成为武林盟主了？", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(344)),
    344, map("id", 344, "talk", "杜某虽然武艺一直难以精进，但我认为与手中所执之刃无关。", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(345)),
    345, map("id", 345, "talk", "不管怎样，宝剑既然在我手中，我还是将其暂时封存，以免落入江湖又是一番血雨腥风。", "char", 40026, "name", "杜浪", "talking", 40026)
);
    }

    private static void init69() {
data.map(
    346, map("id", 346, "talk", "哎，今日偶遇一位高人，剑法如化臻境，招招伶俐，如行云流水。和我简直是云泥之别。", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(347, 350, 353)),
    347, map("id", 347, "talk", "哦？那你有没有向他请教一番？", "char", 40026, "name", "玩家", "talking", -1, "next", list(348), "lovefeel", "90", "intimacyn", 10, "end", 1),
    348, map("id", 348, "talk", "嗯。", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(349)),
    349, map("id", 349, "talk", "这位高人叫我施展剑法给他看，他只一两句，我便如醍醐灌顶一般。", "char", 40026, "name", "杜浪", "talking", 40026),
    350, map("id", 350, "talk", "真的吗，有机会我也想见识一下。", "char", 40026, "name", "玩家", "talking", -1, "next", list(351), "lovefeel", "60", "intimacyn", 10, "end", 1)
);
    }

    private static void init70() {
data.map(
    351, map("id", 351, "talk", "我何时欺骗于你？那位高人不仅武功一等一的棒，人品也是没得说！", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(352)),
    352, map("id", 352, "talk", "不过这位高人行踪不定，不过既然你开口，我一定尽力。", "char", 40026, "name", "杜浪", "talking", 40026),
    353, map("id", 353, "talk", "别担心，你早晚会赶上他。", "char", 40026, "name", "玩家", "talking", -1, "next", list(354), "lovefeel", "30", "intimacyn", 10, "end", 1),
    354, map("id", 354, "talk", "过奖了，杜某对于自己实力还是有分寸的，或许此生都不能及这位高人功力一二。", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(355)),
    355, map("id", 355, "talk", "但是我为之奋斗过，也绝不言悔。", "char", 40026, "name", "杜浪", "talking", 40026)
);
    }

    private static void init71() {
data.map(
    356, map("id", 356, "talk", "你可听说过《洗髓经》？那是一本武功心法。", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(357, 360, 362)),
    357, map("id", 357, "talk", "听说过！听说这本心法有令习武之人脱胎换骨之奇效，仿佛重新投胎！", "char", 40026, "name", "玩家", "talking", -1, "next", list(358)),
    358, map("id", 358, "talk", "哈哈，哪有你说的这么夸张", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(359)),
    359, map("id", 359, "talk", "倒是这个心法修习之后，确实对习武之人大有增益。", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(364)),
    360, map("id", 360, "talk", "这不是那本能脱胎换骨的心法吗？要我帮忙寻找？", "char", 40026, "name", "玩家", "talking", -1, "next", list(361))
);
    }

    private static void init72() {
data.map(
    361, map("id", 361, "talk", "并非如此，这本心法难寻至极，我又怎么好意思劳烦你。", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(364)),
    362, map("id", 362, "talk", "怎么？你得到这本心法了？", "char", 40026, "name", "玩家", "talking", -1, "next", list(363)),
    363, map("id", 363, "talk", "没有，或者说……本来有这个机会。", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(364)),
    364, map("id", 364, "talk", "今天，本来能得到一本心法的，但是必须要完成一项违背原则的任务……所以我最后还是放弃了。", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(365, 369, 372)),
    365, map("id", 365, "talk", "若换做我。可能还真就会为了这个宝贝去做了，不过还好我不在乎武功心法。", "char", 40026, "name", "玩家", "talking", -1, "next", list(366), "lovefeel", "90", "intimacyn", 10, "end", 1)
);
    }

    private static void init73() {
data.map(
    366, map("id", 366, "talk", "哈哈，你说笑了！", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(367)),
    367, map("id", 367, "talk", "以你我的交情，我相信你断不会为了一己私利而做出违背自身原则之事的！", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(368)),
    368, map("id", 368, "talk", "我也因此……将你视作真心朋友。", "char", 40026, "name", "杜浪", "talking", 40026),
    369, map("id", 369, "talk", "一本心法而已，大不了以后再找！", "char", 40026, "name", "玩家", "talking", -1, "next", list(370), "lovefeel", "60", "intimacyn", 10, "end", 1),
    370, map("id", 370, "talk", "哎，若是平常心法……", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(371))
);
    }

    private static void init74() {
data.map(
    371, map("id", 371, "talk", "罢了罢了，不管多珍贵的东西，若是为了得到便放弃原则，我是无论如何也做不到的。", "char", 40026, "name", "杜浪", "talking", 40026),
    372, map("id", 372, "talk", "哎，要么说你傻。", "char", 40026, "name", "玩家", "talking", -1, "next", list(373), "lovefeel", "30", "intimacyn", 10, "end", 1),
    373, map("id", 373, "talk", "哈哈，或许，傻人有傻福？", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(374)),
    374, map("id", 374, "talk", "若是真作出违背原则之事，只怕我后半生都还活在愧疚之中……", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(375)),
    375, map("id", 375, "talk", "或许我一辈子就要这么傻傻地过下去了吧。", "char", 40026, "name", "杜浪", "talking", 40026)
);
    }

    private static void init75() {
data.map(
    376, map("id", 376, "talk", "下月初四，我会参与一场比武，到时候，你会来看吗？", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(377, 380, 383)),
    377, map("id", 377, "talk", "我在的话会不会给你带来压力？", "char", 40026, "name", "玩家", "talking", -1, "next", list(378), "lovefeel", "60", "intimacyn", 10, "end", 1),
    378, map("id", 378, "talk", "不会的不会的，只是参与的不乏很多江湖一等一的高手，我只怕输了让你难堪。", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(379)),
    379, map("id", 379, "talk", "不过，你若是不想来……我也没有强求的意思…..", "char", 40026, "name", "杜浪", "talking", 40026),
    380, map("id", 380, "talk", "求之不得！我再带上点好酒去找你。", "char", 40026, "name", "玩家", "talking", -1, "next", list(381), "lovefeel", "90", "intimacyn", 10, "end", 1)
);
    }

    private static void init76() {
data.map(
    381, map("id", 381, "talk", "呼，虽然这次比武都是江湖之中的劲敌。", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(382)),
    382, map("id", 382, "talk", "但还好有你在，我定会全力以赴。", "char", 40026, "name", "杜浪", "talking", 40026),
    383, map("id", 383, "talk", "如果到时候有时间，我会去的。", "char", 40026, "name", "玩家", "talking", -1, "next", list(384), "lovefeel", "30", "intimacyn", 10, "end", 1),
    384, map("id", 384, "talk", "果然还是会耽误你吗？若是你另有安排，不必为我费神。", "char", 40026, "name", "杜浪", "talking", 40026),
    385, map("id", 385, "talk", "你对书法，尤其是草书，可有研究？", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(386))
);
    }

    private static void init77() {
data.map(
    386, map("id", 386, "talk", "我从小修习武艺，对于琴棋书画完全是一窍不通。", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(387, 390, 393)),
    387, map("id", 387, "talk", "你这是打算变成文武双全的有为少侠啊！", "char", 40026, "name", "玩家", "talking", -1, "next", list(388)),
    388, map("id", 388, "talk", "哈哈哈，哪里，你说笑了。", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(389)),
    389, map("id", 389, "talk", "我打算研究书法确实有所目的，但可不是为了文武双全的虚名。", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(395)),
    390, map("id", 390, "talk", "草书吗？感觉就是鬼画符啊", "char", 40026, "name", "玩家", "talking", -1, "next", list(391))
);
    }

    private static void init78() {
data.map(
    391, map("id", 391, "talk", "哈哈，你是这么想的吗？", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(392)),
    392, map("id", 392, "talk", "倒是我，每次站在大师的草书作品前，总是感到深深的震撼，那种说不出来雄伟壮丽，真的让人振奋。", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(395)),
    393, map("id", 393, "talk", "我在这方面倒也是一般般……", "char", 40026, "name", "玩家", "talking", -1, "next", list(394)),
    394, map("id", 394, "talk", "哎，是这样吗？", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(395)),
    395, map("id", 395, "talk", "其实，我之所以开始执着于这些，全部是因为我听说有不少江湖人士，从书法之中悟出神奇的剑法。", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(396))
);
    }

    private static void init79() {
data.map(
    396, map("id", 396, "talk", "更有高人，能够将二者结合，自创出写意的武功招式。", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(397)),
    397, map("id", 397, "talk", "我一直迷惑怎么样才能够让自己的武艺更上一层，听到这个消息之后，我觉得或许可以作为一次契机。", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(398, 402, 405)),
    398, map("id", 398, "talk", "正好我也想学学书法，不如搭个伴？", "char", 40026, "name", "玩家", "talking", -1, "next", list(399), "lovefeel", "90", "intimacyn", 10, "end", 1),
    399, map("id", 399, "talk", "真的吗？太好了！这样的话我就不是孤身钻研了。", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(400)),
    400, map("id", 400, "talk", "两人一起学，不仅能时常交流，更能够不时切磋。对于进步大有增益啊！", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(401))
);
    }

    private static void init80() {
data.map(
    401, map("id", 401, "talk", "啊，不好意思，我说太多了，总之，万分感谢！", "char", 40026, "name", "杜浪", "talking", 40026),
    402, map("id", 402, "talk", "有点意思，回头我从宫里给你抓几个师傅过去！", "char", 40026, "name", "玩家", "talking", -1, "next", list(403), "lovefeel", "60", "intimacyn", 10, "end", 1),
    403, map("id", 403, "talk", "真的可以吗？只怕我天资愚钝，这些老师不愿意教我。", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(404)),
    404, map("id", 404, "talk", "尤其是草书，听说更是需要很扎实的功底才可以。", "char", 40026, "name", "杜浪", "talking", 40026),
    405, map("id", 405, "talk", "慢慢来，我看好你！", "char", 40026, "name", "玩家", "talking", -1, "next", list(406), "lovefeel", "30", "intimacyn", 10, "end", 1)
);
    }

    private static void init81() {
data.map(
    406, map("id", 406, "talk", "嗯，跌跌撞撞这么多年走过来，心态已比当年稳了许多。", "char", 40026, "name", "杜浪", "talking", 40026, "next", list(407)),
    407, map("id", 407, "talk", "若是前些年，我一定会因为进步缓慢而着急。", "char", 40026, "name", "杜浪", "talking", 40026),
    408, map("id", 408, "talk", "下月初三府上聚集了不少智辩之士前来辩论，我也会参加，你可有兴趣？", "char", 40028, "name", "张仪", "talking", 40028, "next", list(409, 412, 415)),
    409, map("id", 409, "talk", "我这遭出行你可负责吃喝？", "char", 40028, "name", "玩家", "talking", -1, "next", list(410), "lovefeel", "90", "intimacyn", 10, "end", 1),
    410, map("id", 410, "talk", "呵，可以，吃什么喝什么你可随意。", "char", 40028, "name", "张仪", "talking", 40028, "next", list(411))
);
    }

    private static void init82() {
data.map(
    411, map("id", 411, "talk", "不过最后可是要你自己付账。", "char", 40028, "name", "张仪", "talking", 40028),
    412, map("id", 412, "talk", "找我去是衬托你老人家的吧", "char", 40028, "name", "玩家", "talking", -1, "next", list(413), "lovefeel", "60", "intimacyn", 10, "end", 1),
    413, map("id", 413, "talk", "哼，不自量力，我的才华何须你来衬托？", "char", 40028, "name", "张仪", "talking", 40028, "next", list(414)),
    414, map("id", 414, "talk", "其实你……完全可以说来欣赏我的辩才。", "char", 40028, "name", "张仪", "talking", 40028),
    415, map("id", 415, "talk", "听一些诡辩之士强词夺理，感觉好无聊。", "char", 40028, "name", "玩家", "talking", -1, "next", list(416), "lovefeel", "30", "intimacyn", 10, "end", 1)
);
    }

    private static void init83() {
data.map(
    416, map("id", 416, "talk", "又不是街边泼妇争吵，何来强词夺理之说？", "char", 40028, "name", "张仪", "talking", 40028, "next", list(417)),
    417, map("id", 417, "talk", "辩者，在于以理服人，善者不辩，辩者不善，何需强词夺理这等下三滥招数？", "char", 40028, "name", "张仪", "talking", 40028, "next", list(418)),
    418, map("id", 418, "talk", "也罢，是我叨扰了。", "char", 40028, "name", "张仪", "talking", 40028),
    419, map("id", 419, "talk", "阁下久居宫中，可曾听说过红藤萝这位药材？", "char", 40028, "name", "张仪", "talking", 40028, "next", list(420)),
    420, map("id", 420, "talk", "此药果实猩红，枝叶翠绿，对比……十分鲜明。", "char", 40028, "name", "张仪", "talking", 40028, "next", list(421, 424, 427))
);
    }

    private static void init84() {
data.map(
    421, map("id", 421, "talk", "那不是一味毒药吗？喂，你不会想不开吧？", "char", 40028, "name", "玩家", "talking", -1, "next", list(422), "lovefeel", "90", "intimacyn", 10),
    422, map("id", 422, "talk", "何出此言？在你眼中我像是消极厌世的人吗？", "char", 40028, "name", "张仪", "talking", 40028, "next", list(423)),
    423, map("id", 423, "talk", "就算是，在那人未亲口承认才学不及我时，我岂能自寻短见？", "char", 40028, "name", "张仪", "talking", 40028, "next", list(429)),
    424, map("id", 424, "talk", "这药虽有毒性，确实宫中不少妃嫔驻颜的丹方之一，想不到你…..", "char", 40028, "name", "玩家", "talking", -1, "next", list(425), "lovefeel", "60", "intimacyn", 10),
    425, map("id", 425, "talk", "胡闹，容颜之于我，弃如泥沙。", "char", 40028, "name", "张仪", "talking", 40028, "next", list(426))
);
    }

    private static void init85() {
data.map(
    426, map("id", 426, "talk", "我寻此药另有他用，总之与驻颜无关。", "char", 40028, "name", "张仪", "talking", 40028, "next", list(429)),
    427, map("id", 427, "talk", "据我所知那是味毒药，身为谋士，应该用不到他吧", "char", 40028, "name", "玩家", "talking", -1, "next", list(428), "lovefeel", "30", "intimacyn", 10),
    428, map("id", 428, "talk", "依药性，此物剧毒。依药理，就未必了。", "char", 40028, "name", "张仪", "talking", 40028, "next", list(429)),
    429, map("id", 429, "talk", "我年幼之时曾被邪教捉去试药，因此身子常年病痛，前些日子寻得一方，其中需要这红藤萝做药引子罢了。", "char", 40028, "name", "张仪", "talking", 40028, "next", list(430)),
    430, map("id", 430, "talk", "此虽毒药，但张某不会以此行不义之举，不知你可否帮忙寻找？", "char", 40028, "name", "张仪", "talking", 40028, "next", list(431, 434, 437))
);
    }

    private static void init86() {
data.map(
    431, map("id", 431, "talk", "可以是可以，不过你用的时候可要小心些啊", "char", 40028, "name", "玩家", "talking", -1, "next", list(432), "lovefeel", "90", "intimacyn", 10, "end", 1),
    432, map("id", 432, "talk", "你这话，若是关心，我便收下了。", "char", 40028, "name", "张仪", "talking", 40028, "next", list(433)),
    433, map("id", 433, "talk", "若是觉得我会像凡夫俗子一般愚蠢，那我可要找时间与你辩驳一番了。", "char", 40028, "name", "张仪", "talking", 40028, "next", list(440)),
    434, map("id", 434, "talk", "明人不说暗话，若是找到了，你出多少金银？", "char", 40028, "name", "玩家", "talking", -1, "next", list(435), "lovefeel", "60", "intimacyn", 10, "end", 1),
    435, map("id", 435, "talk", "世间之人皆知张某字字珠玑。", "char", 40028, "name", "张仪", "talking", 40028, "next", list(436))
);
    }

    private static void init87() {
data.map(
    436, map("id", 436, "talk", "你随意开价多少银两，我便用多少我的珠玉之言等价交换。", "char", 40028, "name", "张仪", "talking", 40028, "next", list(440)),
    437, map("id", 437, "talk", "此物毒性猛烈，你还是不要轻易触碰地好。", "char", 40028, "name", "玩家", "talking", -1, "next", list(438), "lovefeel", "30", "intimacyn", 10, "end", 1),
    438, map("id", 438, "talk", "或许这世上偏偏有此等痴人，越是猛烈的毒药，越是甘之如饴。", "char", 40028, "name", "张仪", "talking", 40028, "next", list(439)),
    439, map("id", 439, "talk", "就算独享一双冷眼，又岂能阅近世间冷暖？", "char", 40028, "name", "张仪", "talking", 40028, "next", list(440)),
    440, map("id", 440, "talk", "总之，拜托了。", "char", 40028, "name", "张仪", "talking", 40028)
);
    }

    private static void init88() {
data.map(
    441, map("id", 441, "talk", "最近金陵城中白日烈日高悬，夜晚则寒风骤起，不知你那边是否也是如此情状。", "char", 40028, "name", "张仪", "talking", 40028, "next", list(442)),
    442, map("id", 442, "talk", "若是如此，记得及时更换衣物。", "char", 40028, "name", "张仪", "talking", 40028, "next", list(443, 447, 450)),
    443, map("id", 443, "talk", "难道说……你染上了风寒？", "char", 40028, "name", "玩家", "talking", -1, "next", list(444), "lovefeel", "90", "intimacyn", 10, "end", 1),
    444, map("id", 444, "talk", "咳咳，与我无关，关心好你自己便是。", "char", 40028, "name", "张仪", "talking", 40028, "next", list(445)),
    445, map("id", 445, "talk", "平日总是毫不在意，紧要关头可有的苦头吃。", "char", 40028, "name", "张仪", "talking", 40028, "next", list(446))
);
    }

    private static void init89() {
data.map(
    446, map("id", 446, "talk", "总之，照顾好你自己的身体。", "char", 40028, "name", "张仪", "talking", 40028),
    447, map("id", 447, "talk", "咦？你真的是张仪么？", "char", 40028, "name", "玩家", "talking", -1, "next", list(448), "lovefeel", "60", "intimacyn", 10, "end", 1),
    448, map("id", 448, "talk", "为何不是？在你看来真的张仪会怎样讲？", "char", 40028, "name", "张仪", "talking", 40028, "next", list(449)),
    449, map("id", 449, "talk", "“若是因此感染伤寒可有你受的”这样吗？", "char", 40028, "name", "张仪", "talking", 40028),
    450, map("id", 450, "talk", "放心吧，我没那么弱不禁风。", "char", 40028, "name", "玩家", "talking", -1, "next", list(451), "lovefeel", "30", "intimacyn", 10, "end", 1)
);
    }

    private static void init90() {
data.map(
    451, map("id", 451, "talk", "若真有个万一……我再放心又有何用？", "char", 40028, "name", "张仪", "talking", 40028, "next", list(452)),
    452, map("id", 452, "talk", "罢了罢了，总之听我的话便是。", "char", 40028, "name", "张仪", "talking", 40028),
    453, map("id", 453, "talk", "我这里有两句诗，你来品评下哪句写得好。", "char", 40028, "name", "张仪", "talking", 40028, "next", list(454)),
    454, map("id", 454, "talk", "第一句是：秋宵月色霜飞晚，池中枯荷静寂寥。", "char", 40028, "name", "张仪", "talking", 40028, "next", list(455)),
    455, map("id", 455, "talk", "第二句是：万里霜天流林外，一半秋山一半烟。", "char", 40028, "name", "张仪", "talking", 40028, "next", list(456, 459, 462))
);
    }

    private static void init91() {
data.map(
    456, map("id", 456, "talk", "哪句话是你写的？", "char", 40028, "name", "玩家", "talking", -1, "next", list(457), "lovefeel", "60", "intimacyn", 10),
    457, map("id", 457, "talk", "虽然这和品评哪句好确实无甚关系，但既然你问……", "char", 40028, "name", "张仪", "talking", 40028, "next", list(458)),
    458, map("id", 458, "talk", "第一句是我写的。", "char", 40028, "name", "张仪", "talking", 40028, "next", list(464)),
    459, map("id", 459, "talk", "一句是你写的，一句是你师兄写的吧？", "char", 40028, "name", "玩家", "talking", -1, "next", list(460), "lovefeel", "90", "intimacyn", 10),
    460, map("id", 460, "talk", "你的小聪明都体现在这种时候吗？", "char", 40028, "name", "张仪", "talking", 40028, "next", list(461))
);
    }

    private static void init92() {
data.map(
    461, map("id", 461, "talk", "没错，确实如你所言，第一句出自我手，第二句……出自他手。", "char", 40028, "name", "张仪", "talking", 40028, "next", list(464)),
    462, map("id", 462, "talk", "这两句说的是同一个场面？", "char", 40028, "name", "玩家", "talking", -1, "next", list(463), "lovefeel", "30", "intimacyn", 10),
    463, map("id", 463, "talk", "没错，都是寂秋之景。", "char", 40028, "name", "张仪", "talking", 40028, "next", list(464)),
    464, map("id", 464, "talk", "总之，无论是凭感觉还是凭什么，你选出一句你觉得好的便可。", "char", 40028, "name", "张仪", "talking", 40028, "next", list(465, 468, 471)),
    465, map("id", 465, "talk", "第一句吧，这句看了之后闭上眼睛就能浮现里面的场景。", "char", 40028, "name", "玩家", "talking", -1, "next", list(466), "end", 1)
);
    }

    private static void init93() {
data.map(
    466, map("id", 466, "talk", "此话可是真心实意？我倒觉得第一句拘泥于格式。", "char", 40028, "name", "张仪", "talking", 40028, "next", list(467)),
    467, map("id", 467, "talk", "即便如此，也是第二句远远不能企及的。", "char", 40028, "name", "张仪", "talking", 40028),
    468, map("id", 468, "talk", "第二句吧，第二句格局更大一些。", "char", 40028, "name", "玩家", "talking", -1, "next", list(469), "end", 1),
    469, map("id", 469, "talk", "你是这么认为的么……", "char", 40028, "name", "张仪", "talking", 40028, "next", list(470)),
    470, map("id", 470, "talk", "格局大又有何用，空洞无物，顶多是放到哪里都可用的废诗。", "char", 40028, "name", "张仪", "talking", 40028)
);
    }

    private static void init94() {
data.map(
    471, map("id", 471, "talk", "秋宵月色霜飞晚，一半秋山一半烟。我觉得两句合在一起更好。", "char", 40028, "name", "玩家", "talking", -1, "next", list(472), "end", 1),
    472, map("id", 472, "talk", "哼，简直胡闹", "char", 40028, "name", "张仪", "talking", 40028, "next", list(473)),
    473, map("id", 473, "talk", "一句景致尽现，一句空洞无物，怎可胡乱揉捏？", "char", 40028, "name", "张仪", "talking", 40028),
    474, map("id", 474, "talk", "你说，这世上是不是只要假意奉承，无论是否有真才实学，都会被门主赏识。", "char", 40028, "name", "张仪", "talking", 40028, "next", list(475, 478, 481)),
    475, map("id", 475, "talk", "你这是又和谁闹矛盾啦？", "char", 40028, "name", "玩家", "talking", -1, "next", list(476), "lovefeel", "90", "intimacyn", 10)
);
    }

    private static void init95() {
data.map(
    476, map("id", 476, "talk", "与他人无关。", "char", 40028, "name", "张仪", "talking", 40028, "next", list(477)),
    477, map("id", 477, "talk", "阿谀奉承之人品性已是如此，若非世间污浊，否则又岂有他容身之处。", "char", 40028, "name", "张仪", "talking", 40028, "next", list(483)),
    478, map("id", 478, "talk", "就我在宫中的经验，确实是这样", "char", 40028, "name", "玩家", "talking", -1, "next", list(479), "lovefeel", "60", "intimacyn", 10),
    479, map("id", 479, "talk", "朝堂之上阿谀奉承、两面三刀之风更甚，而这偏偏又是我深恶痛绝的。", "char", 40028, "name", "张仪", "talking", 40028, "next", list(480)),
    480, map("id", 480, "talk", "倒是你，在这方面习惯左右逢源……倒是不用我担心。", "char", 40028, "name", "张仪", "talking", 40028, "next", list(483))
);
    }

    private static void init96() {
data.map(
    481, map("id", 481, "talk", "放心吧，是金子总会发光的！", "char", 40028, "name", "玩家", "talking", -1, "next", list(482), "lovefeel", "30", "intimacyn", 10),
    482, map("id", 482, "talk", "若是举世污浊，金子再有光亮又能耐何？", "char", 40028, "name", "张仪", "talking", 40028, "next", list(483)),
    483, map("id", 483, "talk", "你说，我是不是要改变自己，也学会阿谀奉承之道？", "char", 40028, "name", "张仪", "talking", 40028, "next", list(484, 487, 490)),
    484, map("id", 484, "talk", "你觉得呢？怕是连你自己那道坎都过不去吧？", "char", 40028, "name", "玩家", "talking", -1, "next", list(485), "lovefeel", "90", "intimacyn", 10, "end", 1),
    485, map("id", 485, "talk", "我自己吗？", "char", 40028, "name", "张仪", "talking", 40028, "next", list(486))
);
    }

    private static void init97() {
data.map(
    486, map("id", 486, "talk", "还好，总归有你懂我。", "char", 40028, "name", "张仪", "talking", 40028),
    487, map("id", 487, "talk", "你可以试试，我猜坚持不到两天，哦不，两个时辰。", "char", 40028, "name", "玩家", "talking", -1, "next", list(488), "lovefeel", "60", "intimacyn", 10, "end", 1),
    488, map("id", 488, "talk", "莫说两个时辰，只是两句话……就等同于要了我的命。", "char", 40028, "name", "张仪", "talking", 40028, "next", list(489)),
    489, map("id", 489, "talk", "不过，你还算有那么一丝了解我。", "char", 40028, "name", "张仪", "talking", 40028),
    490, map("id", 490, "talk", "我看你还是老老实实做你自己吧，千万别多想。", "char", 40028, "name", "玩家", "talking", -1, "next", list(491), "lovefeel", "30", "intimacyn", 10, "end", 1)
);
    }

    private static void init98() {
data.map(
    491, map("id", 491, "talk", "是啊，走自己的路，何必屈服于这尘世。", "char", 40028, "name", "张仪", "talking", 40028, "next", list(492)),
    492, map("id", 492, "talk", "多谢开导。", "char", 40028, "name", "张仪", "talking", 40028),
    493, map("id", 493, "talk", "你可曾相信星相命理？", "char", 40028, "name", "张仪", "talking", 40028, "next", list(494, 496, 499)),
    494, map("id", 494, "talk", "怎么突然问起这个了？", "char", 40028, "name", "玩家", "talking", -1, "next", list(495)),
    495, map("id", 495, "talk", "今天，发生了一些事，让我对我自己的一些看法……产生了怀疑。", "char", 40028, "name", "张仪", "talking", 40028, "next", list(501))
);
    }

    private static void init99() {
data.map(
    496, map("id", 496, "talk", "好的就信，不好的就不信。", "char", 40028, "name", "玩家", "talking", -1, "next", list(497)),
    497, map("id", 497, "talk", "是么，我本以为我也是如此洒脱之人。", "char", 40028, "name", "张仪", "talking", 40028, "next", list(498)),
    498, map("id", 498, "talk", "只是经过今日之事，我突然有些无措。", "char", 40028, "name", "张仪", "talking", 40028, "next", list(501)),
    499, map("id", 499, "talk", "我也说不好，那东西有时候挺准的，有时候很离谱。", "char", 40028, "name", "玩家", "talking", -1, "next", list(500)),
    500, map("id", 500, "talk", "正因如此，我现在颇为迷茫。", "char", 40028, "name", "张仪", "talking", 40028, "next", list(501))
);
    }

    private static void init100() {
data.map(
    501, map("id", 501, "talk", "今日出门，被一个道士拦住，说我命宫落入七杀，今生性命不过三十六年。", "char", 40028, "name", "张仪", "talking", 40028, "next", list(502)),
    502, map("id", 502, "talk", "若在往常，我定会视为无稽之谈，只是今日回府，发现大夫开的药方失灵，那一刻，从不相信玄学术数的我竟然有了一丝动摇。", "char", 40028, "name", "张仪", "talking", 40028, "next", list(503, 506, 509)),
    503, map("id", 503, "talk", "我倒觉得这和命理无关，而是你真的热爱你的生命。", "char", 40028, "name", "玩家", "talking", -1, "next", list(504), "lovefeel", "90", "intimacyn", 10, "end", 1),
    504, map("id", 504, "talk", "因为珍惜生命所以惧怕吗。", "char", 40028, "name", "张仪", "talking", 40028, "next", list(505)),
    505, map("id", 505, "talk", "从你的这个角度看，我确实不应该再在无谓的纠结中度日。", "char", 40028, "name", "张仪", "talking", 40028)
);
    }

    private static void init101() {
data.map(
    506, map("id", 506, "talk", "不管是不是真的，你以后怕是不敢虚度时光了。", "char", 40028, "name", "玩家", "talking", -1, "next", list(507), "lovefeel", "60", "intimacyn", 10, "end", 1),
    507, map("id", 507, "talk", "我从懂事起便知时光之重要，日夜苦读，更是……", "char", 40028, "name", "张仪", "talking", 40028, "next", list(508)),
    508, map("id", 508, "talk", "不愿和无关之人废话半句……", "char", 40028, "name", "张仪", "talking", 40028),
    509, map("id", 509, "talk", "一个江湖术士而已，改日我求宫内名医为你医治。", "char", 40028, "name", "玩家", "talking", -1, "next", list(510), "lovefeel", "30", "intimacyn", 10, "end", 1),
    510, map("id", 510, "talk", "心意领了，只是你无需为我奔走。", "char", 40028, "name", "张仪", "talking", 40028)
);
    }

    private static void init102() {
data.map(
    511, map("id", 511, "talk", "你与宫廷中人打交道也有些许时日，感觉如何？", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(512)),
    512, map("id", 512, "talk", "对于宫内的各种规矩教条，可还习惯？", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(513, 516, 520)),
    513, map("id", 513, "talk", "无非就是见人说人话见鬼说鬼话，没人时候绝不废话。", "char", 40032, "name", "玩家", "talking", -1, "next", list(514), "lovefeel", "90", "intimacyn", 10, "end", 1),
    514, map("id", 514, "talk", "孺子可教。", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(515)),
    515, map("id", 515, "talk", "不过你这张没把门的嘴我还是有些担心。", "char", 40032, "name", "南鹤", "talking", 40032)
);
    }

    private static void init103() {
data.map(
    516, map("id", 516, "talk", "唔，总觉得这里人话里有话，总之就是不会好好说话。", "char", 40032, "name", "玩家", "talking", -1, "next", list(517), "lovefeel", "60", "intimacyn", 10, "end", 1),
    517, map("id", 517, "talk", "等往后你就会发现，越是身居高位之人，说话越是含糊。", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(518)),
    518, map("id", 518, "talk", "他们不但要周旋于各种势力之中，有些不能亲自处理的事情更是不能留下把柄。", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(519)),
    519, map("id", 519, "talk", "你要想领悟这些老油条的话，平时就要多注意察言观色。", "char", 40032, "name", "南鹤", "talking", 40032),
    520, map("id", 520, "talk", "打交道？我现在就像哑巴一样完全不搭话。", "char", 40032, "name", "玩家", "talking", -1, "next", list(521), "lovefeel", "30", "intimacyn", 10, "end", 1)
);
    }

    private static void init104() {
data.map(
    521, map("id", 521, "talk", "虽说和宫廷人打交道确实需要谨言慎行，思虑周到，但是什么都不说什么都不做就有些过分了。", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(522)),
    522, map("id", 522, "talk", "事到极端并不意味着万无一失，这不叫明哲保身，而叫异类。", "char", 40032, "name", "南鹤", "talking", 40032),
    523, map("id", 523, "talk", "听闻你最近不时四处奔波，可有留心关照自己的身体？", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(524, 527, 530)),
    524, map("id", 524, "talk", "唔，最近是有点熬夜，要是能有点人参、枸杞、红枣什么的补一补就好了！", "name", "玩家", "talking", -1, "next", list(525), "lovefeel", "90", "intimacyn", 10),
    525, map("id", 525, "talk", "这些可都是大补的东西啊，你可曾听过虚不受补这句话？", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(526))
);
    }

    private static void init105() {
data.map(
    526, map("id", 526, "talk", "我的意思是你奔波劳碌身体损耗大，贸然上这些大补的东西反而容易伤身体。", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(532)),
    527, map("id", 527, "talk", "吃得好，睡得香，您就放心吧！", "char", 40032, "name", "玩家", "talking", -1, "next", list(528), "lovefeel", "60", "intimacyn", 10),
    528, map("id", 528, "talk", "哦？本来还想要不要托人给你送一些滋补养身的药膳，现在看来可以不必了。", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(529)),
    529, map("id", 529, "talk", "想来也是，你这傻孩子向来心大，是我多心了。", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(532)),
    530, map("id", 530, "talk", "我还年轻，不怕，到时您老人家才要多注意身体！", "char", 40032, "name", "玩家", "talking", -1, "next", list(531), "lovefeel", "30", "intimacyn", 10)
);
    }

    private static void init106() {
data.map(
    531, map("id", 531, "talk", "老？若是比试一番还不一定谁输睡赢呢。", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(532)),
    532, map("id", 532, "talk", "总之，别自以为自己还年轻就随意糟蹋自己的身子。", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(533)),
    533, map("id", 533, "talk", "除了作息饮食都要规律，还要勤加锻炼身体，否则到了一定年纪就有你受得。", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(534, 536, 538)),
    534, map("id", 534, "talk", "放心吧，我这就出去跑几圈！", "char", 40032, "name", "玩家", "talking", -1, "next", list(535), "lovefeel", "90", "intimacyn", 10, "end", 1),
    535, map("id", 535, "talk", "这还像个样，快去吧！", "char", 40032, "name", "南鹤", "talking", 40032)
);
    }

    private static void init107() {
data.map(
    536, map("id", 536, "talk", "知道啦，您也要注意身体，我没和您开玩笑。", "char", 40032, "name", "玩家", "talking", -1, "next", list(537), "lovefeel", "60", "intimacyn", 10, "end", 1),
    537, map("id", 537, "talk", "行啦，客套话少说点，赶紧出门跑步去！", "char", 40032, "name", "南鹤", "talking", 40032),
    538, map("id", 538, "talk", "好啦好啦，一提到这事就这么啰嗦。", "char", 40032, "name", "玩家", "talking", -1, "next", list(539), "lovefeel", "30", "intimacyn", 10, "end", 1),
    539, map("id", 539, "talk", "哎，年轻人总是听不得过来人的话。", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(540)),
    540, map("id", 540, "talk", "罢了罢了，由得你去吧！", "char", 40032, "name", "南鹤", "talking", 40032)
);
    }

    private static void init108() {
data.map(
    541, map("id", 541, "talk", "昨夜入梦，梦境里你因为一时失言得罪了宫里高官，你抵死不认错，被鞭笞地遍体鳞伤，苦苦哀嚎。", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(542)),
    542, map("id", 542, "talk", "周遭人无论如何求情都无济于事。几日折磨下来，你血肉模糊，体无完肤，吓得我一身冷汗。", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(543, 546, 549)),
    543, map("id", 543, "talk", "日有所思夜有所梦，估计你是过于关心我了。", "char", 40032, "name", "玩家", "talking", -1, "next", list(544), "lovefeel", "90", "intimacyn", 10),
    544, map("id", 544, "talk", "是么？你独自一人不仅要完成宫内事务，还要应付各色人等，实在是很难让人放下心来啊！", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(545)),
    545, map("id", 545, "talk", "尤其是最近宫内恰逢多事之秋，风声鹤唳，稍有不慎就容易祸及自身。", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(552))
);
    }

    private static void init109() {
data.map(
    546, map("id", 546, "talk", "您哪来这么多恐怖的形容词……", "char", 40032, "name", "玩家", "talking", -1, "next", list(547), "lovefeel", "60", "intimacyn", 10),
    547, map("id", 547, "talk", "实在是梦境太过真切，你泪流满面，嘴角鲜血直流，大声哭喊的样子直到梦醒依旧历历在目。", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(548)),
    548, map("id", 548, "talk", "哎，只盼梦境是反的，否则……", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(552)),
    549, map("id", 549, "talk", "没事，梦是反的，你就等着我飞黄腾达的消息吧！", "char", 40032, "name", "玩家", "talking", -1, "next", list(550), "lovefeel", "30", "intimacyn", 10),
    550, map("id", 550, "talk", "你刚与这些宫内的人精打交道，不吃了暗亏就不错了，还指望短时间内飞黄腾达？", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(551))
);
    }

    private static void init110() {
data.map(
    551, map("id", 551, "talk", "不该说的不要说，处事圆滑一些，安安稳稳度日才是真的。", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(552)),
    552, map("id", 552, "talk", "我问你，若是真遇到我梦中情景，虽不是你的错，但低头认错便能免去刑罚，你是否会低头？", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(553, 555, 558)),
    553, map("id", 553, "talk", "必须低头，让我跪下都行。", "char", 40032, "name", "玩家", "talking", -1, "next", list(554), "lovefeel", "90", "intimacyn", 10, "end", 1),
    554, map("id", 554, "talk", "呵，你这孩子倒是有骨气。", "char", 40032, "name", "南鹤", "talking", 40032),
    555, map("id", 555, "talk", "放心吧，凭我的聪明才智不会有那一天的。", "char", 40032, "name", "玩家", "talking", -1, "next", list(556), "lovefeel", "30", "intimacyn", 10, "end", 1)
);
    }

    private static void init111() {
data.map(
    556, map("id", 556, "talk", "你倒是有自信，罢了罢了，未来的事情谁也说不好。", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(557)),
    557, map("id", 557, "talk", "我也就不给你徒添烦恼了。", "char", 40032, "name", "南鹤", "talking", 40032),
    558, map("id", 558, "talk", "你先说说你会怎么做？", "char", 40032, "name", "玩家", "talking", -1, "next", list(559), "lovefeel", "60", "intimacyn", 10, "end", 1),
    559, map("id", 559, "talk", "委曲求全，谋定后动。", "char", 40032, "name", "南鹤", "talking", 40032),
    560, map("id", 560, "talk", "我最近托人给你寻了些经纶古籍，内容涵盖颇为广泛。你有时间一定好好阅读一番。", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(561, 564, 567))
);
    }

    private static void init112() {
data.map(
    561, map("id", 561, "talk", "有没有传奇话本之类的，经纶书好无聊……", "char", 40032, "name", "玩家", "talking", -1, "next", list(562), "lovefeel", "30", "intimacyn", 10),
    562, map("id", 562, "talk", "你每日见识到的达官贵人之间的故事难道不比传奇话本来得精彩？", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(563)),
    563, map("id", 563, "talk", "所以，把时间用在关键之处，多看看圣贤书提升提升自己。", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(570)),
    564, map("id", 564, "talk", "能不能折算成等价的银票。", "char", 40032, "name", "玩家", "talking", -1, "next", list(565), "lovefeel", "90", "intimacyn", 10),
    565, map("id", 565, "talk", "真胡闹，知识岂能容你这么糟践？！", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(566))
);
    }

    private static void init113() {
data.map(
    566, map("id", 566, "talk", "看来你确实需要好好读读圣贤书了。每天一本，好好接受先贤的洗礼！", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(570)),
    567, map("id", 567, "talk", "太好了，最近失眠，正好需要点看着看着就能睡着的东西。", "char", 40032, "name", "玩家", "talking", -1, "next", list(568), "lovefeel", "60", "intimacyn", 10),
    568, map("id", 568, "talk", "失眠？可是最近压力太大？", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(569)),
    569, map("id", 569, "talk", "圣贤之书博大精深，好好学学人家圣贤怎么为人处世缓解压力的吧。", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(570)),
    570, map("id", 570, "talk", "下次见面，我可是会好好考问你书中内容，若是答不出来，你知道后果的。", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(571, 573, 576))
);
    }

    private static void init114() {
data.map(
    571, map("id", 571, "talk", "您老人家真会开玩笑，您哪舍得啊！", "char", 40032, "name", "玩家", "talking", -1, "next", list(572), "lovefeel", "90", "intimacyn", 10, "end", 1),
    572, map("id", 572, "talk", "有什么舍不得？你别想糊弄过去。", "char", 40032, "name", "南鹤", "talking", 40032),
    573, map("id", 573, "talk", "什么后果，您说来听听呗！", "char", 40032, "name", "玩家", "talking", -1, "next", list(574), "lovefeel", "30", "intimacyn", 10, "end", 1),
    574, map("id", 574, "talk", "后果很严重，严重到我现在还没想好。", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(575)),
    575, map("id", 575, "talk", "赶紧去看书。", "char", 40032, "name", "南鹤", "talking", 40032)
);
    }

    private static void init115() {
data.map(
    576, map("id", 576, "talk", "行，我都听您的。", "char", 40032, "name", "玩家", "talking", -1, "next", list(577), "lovefeel", "60", "intimacyn", 10, "end", 1),
    577, map("id", 577, "talk", "嘴上卖乖没用的，老老实实看书！", "char", 40032, "name", "南鹤", "talking", 40032),
    578, map("id", 578, "talk", "我掐指一算，马上就又是圣上的寿辰了。", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(579, 583, 581)),
    579, map("id", 579, "talk", "莫非是想提醒我送礼？", "char", 40032, "name", "玩家", "talking", -1, "next", list(580), "lovefeel", "90", "intimacyn", 10),
    580, map("id", 580, "talk", "你这傻孩子，皇上在宫中，什么好东西没见过？稀罕你那点？", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(585))
);
    }

    private static void init116() {
data.map(
    581, map("id", 581, "talk", "总不是要我献身于皇上吧……", "char", 40032, "name", "玩家", "talking", -1, "next", list(582), "lovefeel", "30", "intimacyn", 10),
    582, map("id", 582, "talk", "……罢了，孺子不可教也。", "char", 40032, "name", "南鹤", "talking", 40032),
    583, map("id", 583, "talk", "要不我报个节目，在寿宴上唱个歌跳个舞？", "char", 40032, "name", "玩家", "talking", -1, "next", list(584), "lovefeel", "60", "intimacyn", 10),
    584, map("id", 584, "talk", "就你那两下子，怕是要先丢了脸，再丢了人头。", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(585)),
    585, map("id", 585, "talk", "皇上坐拥天下这么多年，什么贺礼没有收到过？你那两把刷子根本就不够用。", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(586))
);
    }

    private static void init117() {
data.map(
    586, map("id", 586, "talk", "但在宫中其他人看来，你就变成了林中的出头鸟。", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(587)),
    587, map("id", 587, "talk", "到时候，不仅皇上那边讨不到好，说不定还会遭到宫内其他人的针对。这样的结果可是你能承受的？", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(588, 591, 593)),
    588, map("id", 588, "talk", "你还真是个人精啊！", "char", 40032, "name", "玩家", "talking", -1, "next", list(589), "end", 1),
    589, map("id", 589, "talk", "老话说得好，姜还是老的辣，贼还是……", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(590)),
    590, map("id", 590, "talk", "咳咳，总之你现在切记不可强出风头。", "char", 40032, "name", "南鹤", "talking", 40032)
);
    }

    private static void init118() {
data.map(
    591, map("id", 591, "talk", "听你一席话，白读十年书", "char", 40032, "name", "玩家", "talking", -1, "next", list(592), "end", 1),
    592, map("id", 592, "talk", "若是再读十年书就能保证宫内生存无忧，天底下又哪里会有那么多冤魂？", "char", 40032, "name", "南鹤", "talking", 40032),
    593, map("id", 593, "talk", "你还真是个老油条啊！", "char", 40032, "name", "玩家", "talking", -1, "next", list(594), "end", 1),
    594, map("id", 594, "talk", "这是什么口气？长辈们还不都是为了你能在宫中立得安稳。", "char", 40032, "name", "南鹤", "talking", 40032),
    595, map("id", 595, "talk", "听闻荀德妃往年因为宫人照顾不周，公子尘来在宫内玩耍时不甚被猫抓伤，一怒之下杖毙了很多人。", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(596))
);
    }

    private static void init119() {
data.map(
    596, map("id", 596, "talk", "其人如此行事，心思狠厉可想而知。你若是再见德妃，当小心谨慎！", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(597)),
    597, map("id", 597, "talk", "有些当日未当值的官也莫名其妙受牵连。", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(598, 604, 602)),
    598, map("id", 598, "talk", "放心吧，我与她八竿子打不着。", "char", 40032, "name", "玩家", "talking", -1, "next", list(599), "lovefeel", "90", "intimacyn", 10, "end", 1),
    599, map("id", 599, "talk", "谁知道天上什么时候掉下来砖头。", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(600)),
    600, map("id", 600, "talk", "小心驶得万年船，听长辈的没错。", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(601))
);
    }

    private static void init120() {
data.map(
    601, map("id", 601, "talk", "就为了这么点小事？吓得我都不敢养猫了！", "char", 40032, "name", "玩家", "talking", -1, "next", list(607), "lovefeel", "30", "intimacyn", 10, "end", 1),
    602, map("id", 602, "talk", "先养好你自己再说吧！", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(603)),
    603, map("id", 603, "talk", "宫里的情况你又不是不知道。芝麻大点的事情，一旦被位高权重的人盯上，就会被无限放大，甚至牵连无辜。", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(607)),
    604, map("id", 604, "talk", "这真是有权有势的有恃无恐啊！", "char", 40032, "name", "玩家", "talking", -1, "next", list(605), "lovefeel", "60", "intimacyn", 10, "end", 1),
    605, map("id", 605, "talk", "嘘，这话你可千万别对外乱说。", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(606))
);
    }

    private static void init121() {
data.map(
    606, map("id", 606, "talk", "据我所知到现在贤亲王还在气头上。", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(607)),
    607, map("id", 607, "talk", "德妃如此，纵然皇上睁一只眼闭一只眼一时，也未必能纵容一世。", "char", 40032, "name", "南鹤", "talking", 40032, "next", list(608)),
    608, map("id", 608, "talk", "你在宫里也切记谨言慎行，万万不可因为一时得意而忘记自己姓甚名谁！", "char", 40032, "name", "南鹤", "talking", 40032),
    609, map("id", 609, "talk", "行走江湖多年，竟遇到天大的笑柄。", "char", 40016, "name", "逍遥", "talking", 40016, "next", list(610)),
    610, map("id", 610, "talk", "前些日子一场比武，一名号称铁头无双的铁头帮帮主被我打地落花流水。后来，竟背地里说我这个后辈不懂江湖辈分。", "char", 40016, "name", "逍遥", "talking", 40016, "next", list(611))
);
    }

    private static void init122() {
data.map(
    611, map("id", 611, "talk", "说是失败是因为自己手下留情，结果我这个后辈却不知好歹。", "char", 40016, "name", "逍遥", "talking", 40016, "next", list(616, 612, 614)),
    612, map("id", 612, "talk", "打不过就拿辈分来压，也太可笑了吧。", "char", 40016, "name", "玩家", "talking", -1, "next", list(613), "lovefeel", "90", "intimacyn", 10),
    613, map("id", 613, "talk", "本来输赢、辈分这些我是毫不在乎的，在我眼中，比武只需要堂堂正正亮出真本事就好，嘴皮子上耍功夫算什么本事？", "char", 40016, "name", "逍遥", "talking", 40016, "next", list(618)),
    614, map("id", 614, "talk", "你倒是脾气好，我要是会功夫就可劲欺负他，反正他也打不过我。", "char", 40016, "name", "玩家", "talking", -1, "next", list(615), "lovefeel", "60", "intimacyn", 10),
    615, map("id", 615, "talk", "不不不，既然他要讲辈分，我就好好让他看看在我这里什么是武林辈分。", "char", 40016, "name", "逍遥", "talking", 40016, "next", list(618))
);
    }

    private static void init123() {
data.map(
    616, map("id", 616, "talk", "论资排辈什么的挺正常，反正你比他厉害大家都心知肚明。", "char", 40016, "name", "玩家", "talking", -1, "next", list(617), "lovefeel", "30", "intimacyn", 10),
    617, map("id", 617, "talk", "江湖上什么时候也学会这些规规矩矩了，失望透顶。", "char", 40016, "name", "逍遥", "talking", 40016, "next", list(618)),
    618, map("id", 618, "talk", "嘿嘿，总之我一高兴就决定下月初四去他们门派好好玩玩。", "char", 40016, "name", "逍遥", "talking", 40016, "next", list(621, 619, 624)),
    619, map("id", 619, "talk", "噗，你钻起牛角尖的样子还挺可爱。", "char", 40016, "name", "玩家", "talking", -1, "next", list(620), "lovefeel", "90", "intimacyn", 10, "end", 1),
    620, map("id", 620, "talk", "可爱？哈哈，这个词我喜欢，尤其是从你嘴里说出来的时候。", "char", 40016, "name", "逍遥", "talking", 40016)
);
    }

    private static void init124() {
data.map(
    621, map("id", 621, "talk", "嚯，你有这个时间不如请我喝喝酒什么的。", "char", 40016, "name", "玩家", "talking", -1, "next", list(622), "lovefeel", "60", "intimacyn", 10, "end", 1),
    622, map("id", 622, "talk", "那还不简单，对付这种老鬼我只需坐着用一只手就能解决。", "char", 40016, "name", "逍遥", "talking", 40016, "next", list(623)),
    623, map("id", 623, "talk", "腾出来的另一只手就用来陪你喝酒好了。", "char", 40016, "name", "逍遥", "talking", 40016),
    624, map("id", 624, "talk", "多大了还跟个孩子似得……", "char", 40016, "name", "玩家", "talking", -1, "next", list(625), "lovefeel", "30", "intimacyn", 10, "end", 1),
    625, map("id", 625, "talk", "哈哈哈，我是个孩子这话让铁头帮帮主听去了，还不要在江湖上到处说我一个孩子不知天高地厚欺负老年人。", "char", 40016, "name", "逍遥", "talking", 40016)
);
    }

}