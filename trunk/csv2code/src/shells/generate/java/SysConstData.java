package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 系统常量表.csv
 */
public class SysConstData extends LData {
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
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    "MAX_LV", 100, // 当前版本等级上限
    "GOLD", 999999999, // 元宝
    "MONEY", 999999999, // 银两
    "ROLE_NAME_MIN_LEN", 2, // 名字最短2个字
    "ROLE_NAME_MAX_LEN", 7 // 名字最长7个字
);
    }

    private static void init1() {
data.map(
    "ITEM_KIND_1", 1, // 装备
    "ITEM_KIND_2", 2, // 消耗品
    "ITEM_KIND_3", 3, // 装扮
    "ITEM_KIND_4", 4, // 阵法
    "ITEM_KIND_5", 5 // 宝石
);
    }

    private static void init2() {
data.map(
    "ITEM_KIND_7", 7, // 技能
    "ITEM_KIND_8", 8, // 货币
    "ITEM_KIND_9", 9, // 武将碎片
    "ITEM_KIND_10", 10, // 鲜花
    "ITEM_KIND_11", 11 // 头像
);
    }

    private static void init3() {
data.map(
    "ITEM_KIND_12", 12, // 头像框
    "ITEM_KIND_13", 13, // 红叶
    "ITEM_KIND_14", 14, // 宠物
    "ITEM_KIND_15", 15, // 宠物食物
    "ITEM_KIND_16", 16 // 宠物玩具
);
    }

    private static void init4() {
data.map(
    "ITEM_KIND_17", 17, // 宠物蛋
    "COMBAT_TIME", 30, // 战斗跳过等级
    "JOB_DEFAULT_SERVANT_0", 1000, // 初始女
    "JOB_DEFAULT_SERVANT_1", 1001, // 初始男
    "AVATAR_DRESS_DEFAULT_GIRL_0", list(29501) // 女初始衣服
);
    }

    private static void init5() {
data.map(
    "AVATAR_DRESS_DEFAULT_GIRL_1", list(29502), // 女初始脸型
    "AVATAR_DRESS_DEFAULT_GIRL_2", list(29500), // 女初始发型
    "AVATAR_DRESS_DEFAULT_GOY_0", list(29005), // 男初始衣服
    "AVATAR_DRESS_DEFAULT_GOY_1", list(29006), // 男初始脸型
    "AVATAR_DRESS_DEFAULT_GOY_2", list(29004) // 男初始发型
);
    }

    private static void init6() {
data.map(
    "AVATAR_ICON_DEFAULT_0", 10008, // 女初始头像
    "AVATAR_ICON_DEFAULT_1", 10000, // 男初始头像
    "AVATAR_FIGHT_INIT_POS", 2, // 角色初始阵法位置
    "LV_KIND_GD", 1, // 等级固定
    "LV_KIND_SJ", 2 // 等级随机
);
    }

    private static void init7() {
data.map(
    "FB_KIND_1", 1, // 主动技能
    "FB_KIND_2", 2, // 被动技能
    "FB_KIND_3", 3, // 普通攻击
    "SIGNATURE", 50, // 签名
    "MAX_CP", 100 // 怒气值上限值
);
    }

    private static void init8() {
data.map(
    "OPT_TYPE_QRLB", 1, // 开服七日礼包
    "OPT_TYPE_LXDL", 2, // 每星期签到
    "OPT_TYPE_ZXJL", 3, // 在线奖励
    "OPT_TYPE_CHONGZHI", 4, // 充值活动
    "OPT_TYPE_ZLPH", 5 // 战力排行
);
    }

    private static void init9() {
data.map(
    "OPT_TYPE_DBLC", 6, // 单日单笔
    "OPT_TYPE_DRLC", 7, // 单日累充
    "OPT_TYPE_DHM", 8, // 兑换码
    "OPT_TYPE_CZJJ", 9, // 成长基金
    "OPT_TYPE_SC", 10 // 首充
);
    }

    private static void init10() {
data.map(
    "OPT_TYPE_LBSC", 11, // 礼包商城
    "OPT_TYPE_CJLC", 12, // 多日累充
    "OPT_TYPE_ZKYK", 13, // 周卡月卡
    "OPT_TYPE_DHHD", 14, // 兑换活动
    "OPT_TYPE_LTL", 15 // 领体力
);
    }

    private static void init11() {
data.map(
    "OPT_TYPE_ZLJL", 16, // 战力排行奖励
    "RANGE_KIND_1", 1, // 单体
    "RANGE_KIND_2", 2, // 直线
    "RANGE_KIND_3", 3, // 前排
    "RANGE_KIND_4", 4 // 后排
);
    }

    private static void init12() {
data.map(
    "RANGE_KIND_5", 5, // 随机
    "RANGE_KIND_6", 6, // 当前血量最少的前N名
    "RANGE_KIND_7", 7, // 当前血量最多的前N名
    "RANGE_KIND_8", 8, // 怒气值最高的N个
    "BUFF_KIND_1", 1 // 眩晕
);
    }

    private static void init13() {
data.map(
    "BUFF_KIND_2", 2, // 护盾
    "BUFF_KIND_3", 3, // 中毒/持续恢复
    "BUFF_KIND_4", 4, // 属性提升
    "BUFF_KIND_5", 5, // 提高/降低怒气
    "BUFF_TGT_1", 1 // 自身
);
    }

    private static void init14() {
data.map(
    "BUFF_TGT_2", 2, // 己方全体
    "BUFF_TGT_3", 3, // 受击方
    "BUFF_TGT_4", 4, // 敌方全体
    "BUFF_TGT_5", 5, // 随机敌方
    "BUFF_TGT_6", 6 // 随机己方
);
    }

    private static void init15() {
data.map(
    "BUFF_TGT_7", 7, // 己方血量最少
    "FRONT_OPEN", 70, // 阵法开启等级
    "SERVANT_UPGRADE_NEED_ITEMS", list(12000, 12001, 12002, 12003), // 人物升级丹
    "AMULET_UPGRADE_NEED_ITEMS", list(12059, 12060), // 护符升级道具
    "AMULET_INTEN_MAX", 50 // 护符升级最高等级
);
    }

    private static void init16() {
data.map(
    "AMULET_MOVE_MAX", 10, // 护符进阶最高等级
    "MAIOR_CITY", list(1000, 1001, 1002, 1003, 1004, 1005, 1006, 1007, 1008, 1009, 1010, 1011, 1012, 1013, 1014, 1015, 1016, 1017, 1018, 1019), // 主城
    "WOOD_CITY", list(1400, 1401, 1402, 1403, 1404, 1405, 1406, 1407, 1408, 1409, 1410, 1411, 1412, 1413, 1414, 1415, 1416, 1417, 1418, 1419), // 伐木场
    "BUILDING_OUTPUT", 172800, // 建筑产出限制
    "SEC_LIANG_REN_FREE_NUM", 5 // 抽良人每日最大免费次数
);
    }

    private static void init17() {
data.map(
    "SEC_TIAN_REN_FREE_NUM", 1, // 抽天人每日最大免费次数
    "SEC_LIANG_REN_CD_TIME", 300, // 抽良人CD时间(秒)
    "SEC_SERVANT_TYPE_1", 1, // 低级免费，随一次
    "SEC_SERVANT_TYPE_2", 2, // 低级道具，随一次
    "SEC_SERVANT_TYPE_3", 3 // 高级免费，随一次
);
    }

    private static void init18() {
data.map(
    "SEC_SERVANT_TYPE_4", 4, // 高级道具，随一次
    "SEC_SERVANT_TYPE_5", 5, // 高级单抽，随一次
    "SEC_SERVANT_TYPE_6", 6, // 高级6连抽,3个库
    "SEC_SERVANT_TYPE_9", 9, // 第一次抽假随机库ID
    "SEC_SERVANT_TYPE_11", 11 // 抽取宠物
);
    }

    private static void init19() {
data.map(
    "SEC_SERVAN_COUNT_BAODI", 10, // 满多少次后，下一次必出
    "SEC_SERVAN_DROP_PIECE", 40, // 重复武将转化为碎片的数量
    "EQUIP_SUBKIND_1", 1, // 武器
    "EQUIP_SUBKIND_2", 2, // 头
    "EQUIP_SUBKIND_3", 3 // 手
);
    }

    private static void init20() {
data.map(
    "EQUIP_SUBKIND_4", 4, // 胸
    "EQUIP_SUBKIND_5", 5, // 护符
    "EQUIP_SUBKIND_6", 6, // 战马
    "LB_SUBKIND_1", 1, // 普通消耗品
    "LB_SUBKIND_2", 2 // 礼包商城
);
    }

    private static void init21() {
data.map(
    "STONE_CITY", list(1300, 1301, 1302, 1303, 1304, 1305, 1306, 1307, 1308, 1309, 1310, 1311, 1312, 1313, 1314, 1315, 1316, 1317, 1318, 1319), // 采石场
    "FLOWER_CITY", list(1100, 1101, 1102, 1103, 1104, 1105, 1106, 1107, 1108, 1109, 1110, 1111, 1112, 1113, 1114, 1115, 1116, 1117, 1118, 1119), // 鲜花房
    "VOW_CITY", list(1200, 1201, 1202, 1203, 1204, 1205, 1206, 1207, 1208, 1209, 1210, 1211, 1212, 1213, 1214, 1215, 1216, 1217, 1218, 1219), // 许愿池
    "CHAT_SAVE_NUM_MAX", 30, // 聊天行数
    "MAIL_TIME", 1296000 // 邮件时间
);
    }

    private static void init22() {
data.map(
    "BUILD_FUN", list(104, 105), // 庄园背包，家具制造
    "MISSION_TYPE_RW", 1, // 成就（任务类型）
    "MISSION_TYPE_MR", 2, // 每日（任务类型）
    "MISSION_TYPE_ZX", 3, // 主线（任务类型）
    "MISSION_TYPE_ZIX", 4 // 支线（任务类型）
);
    }

    private static void init23() {
data.map(
    "MISSION_TYPE_PX", 5, // 派系（任务类型）
    "MISSION_TYPE_TXK", 11, // 头像框（任务类型）
    "MISSION_TYPE_HD", 12, // 创角七天（任务类型）
    "FACTIONS_OUTTIME", 43200, // 离开帮派后多少时间不能再次申请入帮（秒）
    "FACTIONS_COST", 200 // 建派系消耗的元宝值
);
    }

    private static void init24() {
data.map(
    "FACTIONS_IMPEACH", 360, // 派系弹劾首领响应时间（秒）
    "FACTIONS_START", list(10, 10, 12), // 弹劾发起者条件（等级，累计帮贡，入帮时间(小时)，）
    "FACTIONS_RESPOOD", list(10, 10, 12), // 弹劾响应者条件（等级，累计帮贡，入帮时间，）
    "FACTIONS_LEADER", 72, // 弹劾首领不上线时间，单位：小时
    "FACTIONS_PEOPLENUM", 3 // 弹劾人数
);
    }

    private static void init25() {
data.map(
    "SHUTUP_TIME_1", 600, // 禁言时间
    "SHUTUP_TIME_2", 3600, // 禁言时间
    "SHUTUP_TIME_3", 86400, // 禁言时间
    "WORLD_TALK_TIME", 10, // 聊天间隔
    "GONGHUI_TALK_TIME", 1 // 派系聊天时间
);
    }

    private static void init26() {
data.map(
    "GONGHUI_TALK_NUM", 25, // 派系聊天数量
    "GONGHUI_APPLY_TIME", 21600, // 退出派系后再次加入的时间
    "SHIJIE_TALK_NUM", 30, // 世界聊天数量
    "CHAT_SYS_NUM_MAX", 50, // 聊天系统频道记录保存条目
    "FACTIONS_DONAE_NUM", 5 // 每日派系捐献次数
);
    }

    private static void init27() {
data.map(
    "FRIENDS_NUM", 80, // 好友人数
    "BLACK_NUM", 50, // 黑名单人数
    "RECENTLY_NUM", 10, // 最近联系人数
    "BAG_START_GRID", 75, // 背包初始格子
    "BAG_MAX_GRID", 200 // 背包最大格子
);
    }

    private static void init28() {
data.map(
    "GONGHUI_FIGHT_TIME", 10, // 每日派系争斗次数
    "GONGHUI_FIGHT_APPLYTIME", 2, // 派系争斗，每日战利品申请次数
    "GONGHUI_FIGH_REST", 2, // 每日派系争斗，重置次数限制
    "FACTIONS_BIGWIGS", 7200, // 派系权贵更新时间
    "ENERGY_BUY_NUM", 90 // 体力购买1次的增加值
);
    }

    private static void init29() {
data.map(
    "ENERGY_RECOVER_NUM", 1, // 体力恢复一次的值
    "ENERGY_RECOVER_TIME", 360, // 体力恢复一次的间隔时间
    "ENERGY_LIMIT", 3000, // 体力极限上限值
    "ENERGY_LVUP_NUM", 30, // 玩家升级获得的体力的量
    "FLOWER_RECORD", 20 // 收花送花记录
);
    }

    private static void init30() {
data.map(
    "QUEUE_STAR_NUM", 1, // 初始队列数量
    "QUEUE_NUM", 3, // 队列最大数量
    "DROP_STORE_TYPE_1", 1, // 掉落库按概率随机1个
    "DROP_STORE_TYPE_2", 2, // 掉落库按概率依次判断掉落
    "DROP_STORE_TYPE_3", 3 // 掉落库不判断全部发
);
    }

    private static void init31() {
data.map(
    "DROP_STORE_KIND_1", 1, // 掉落库类型（道具）
    "DROP_STORE_KIND_2", 2, // 掉落库类型（武将）
    "DROP_STORE_KIND_3", 3, // 掉落库类型（掉落库）
    "GRADE_TIME", 5, // 官场每次初始能挑战的次数
    "GIVE_POWER", 5 // 每次赠送体力
);
    }

    private static void init32() {
data.map(
    "TACTICAL_OPEN", 10, // 阵法开启等级
    "WORSHIP_NUM", 3, // 每日膜拜次数
    "WORSHIP_AWARD", 600, // 膜拜获得的银两
    "RANK_NUM", 50, // 排行榜人数
    "BUILDING_HOUSE", 1 // 建筑
);
    }

    private static void init33() {
data.map(
    "BUILDING_PATH", 2, // 小路
    "BUILDING_DESK", 3, // 桌凳
    "BUILDING_FURN", 4, // 摆设
    "BUILDING_THEME", 5, // 主题
    "BOSS_MINI", 35 // BOSS保底奖励
);
    }

    private static void init34() {
data.map(
    "WANTED_NUM", 6, // 悬赏数量上限
    "WANTED_TIME", 2400, // 出现新悬赏的间隔时间（秒）
    "WANTED_MISSION", list(3, 4, 5, 7, 8, 12), // 悬赏初始任务列表
    "CLIMBING_TOWER_TIME", 5, // 每层爬塔时间
    "MAKE_BUILDING_1", 1 // 房屋
);
    }

    private static void init35() {
data.map(
    "MAKE_BUILDING_2", 2, // 装饰
    "MAKE_BUILDING_3", 3, // 绿植
    "MAKE_BUILDING_4", 4, // 水域
    "FLOWERS_LIKEUP", 5, // 赠送武将鲜花次数
    "ZJ_NUM", 12 // 传记次数
);
    }

    private static void init36() {
data.map(
    "SEC_TIAN_REN_MAX_NUM_TYPE_1", 20, // 招募天人最大次数
    "SEC_TIAN_REN_MAX_NUM_TYPE_2", 5, // 招募十次天人最大次数
    "FIGHT_SCALE", "0.8", // 战斗模型整体比例
    "TITIE_TASK", 9, // 成就称号
    "SYSTEM_AHEAD_TIME", 180 // 系统公告提前播放时间
);
    }

    private static void init37() {
data.map(
    "TILED_SIDE_LEN", 60, // 地图边长
    "TILED_CAN_BUILD", 3, // 可建造标识
    "FIGHT_MAX_ROUND", 30, // 战斗回合数
    "ADD_ENERGY", 50, // 每日吃鸡补充体力
    "STONE_ADD", 1800 // 采石场时间消耗货币
);
    }

    private static void init38() {
data.map(
    "DEFAULT_MUSIC_VOLUME", 1, // 音乐类型音量
    "DEFAULT_SOUND_VOLUME", 1, // 音效类型音量
    "XSYD_NUM_0", 10003, // 女新手引导起始
    "XSYD_NUM_1", 10003, // 男新手引导起始
    "APPSTORE_ZK", 2 // 周卡
);
    }

    private static void init39() {
data.map(
    "APPSTORE_YK", 3, // 月卡
    "CZJJ_VIP", 2, // 成长基金VIP限制
    "CZJJ_LIMIT_LV", 10, // 成长基金关闭限制
    "CURRENCY_ID", list(10000, 10001, 10002, 10004, 10007, 10008, 10016), // 背包显示的货币类型
    "ANSWER_TIME", 600 // 答题时间限制
);
    }

    private static void init40() {
data.map(
    "ANSWER_NUM", 10, // 答题数目
    "GIVE_FLOWER_NUM", 5, // 每日赠送客卿道具上线
    "KING_ID", "99999", // 皇帝ID
    "PLAYER_RANDOM_N", 10, // 随机官职最高的玩家
    "PLAYER_RANDOM_M", 20 // 随机等级相近的玩家
);
    }

    private static void init41() {
data.map(
    "PLAYER_RANDOM_LV", 2, // 随机等级区间，比玩家高的等级值
    "MARRIED_EVERY_NEWNUM", 5, // 招亲每日刷新次数
    "MARRIED_PRAISE_NUM", 5, // 招亲最多点赞人数
    "MARRIED_SIGN", 5, // 招亲牌子
    "MARRIED_CHAT", 5 // 聊天增加亲密度
);
    }

    private static void init42() {
data.map(
    "MARRIED_INTIMACY", 100, // 亲密度达到值可以结婚
    "MARRIED_NUM", 5, // 暧昧期最大人数
    "MARRIED_TIME", 300, // 请求交友或者结婚时间
    "FRIEND_SIGN_NUM", 5, // 每日最多摘取牌子的次数
    "FRIEND_CHAT", 1000 // 好友达到亲密度可交往
);
    }

    private static void init43() {
data.map(
    "MARRIED_LV", 30, // 结婚等级
    "MARRIED_SUITED", 15, // 征婚缘分匹配
    "MARRIED_LV_COND", list(30, 50, 80, 100, 120), // 高级牌子等级需求
    "MARRIED_MIL_COND", list(10000, 30000, 50000, 100000, 200000, 500000), // 高级牌子战力需求
    "MARRIED_MONEY_COND", list(10, 20, 50, 100) // 高级牌子元宝需求
);
    }

    private static void init44() {
data.map(
    "DALY_SCENE_TIME", 3, // 每日副本每日挑战次数
    "PET_TOUCH_TIME", 600, // 宠物蛋抚摸间隔
    "PET_TOUCH_NUM", 100, // 宠物蛋抚摸数值
    "PET_TOUCH_TOTAL", 800, // 宠物蛋抚摸总量
    "PET_ACTION_1", 1 // 宠物行为类型（吃）
);
    }

    private static void init45() {
data.map(
    "PET_ACTION_2", 2, // 宠物行为类型（玩）
    "PET_ACTION_3", 3, // 宠物行为类型（清洁）
    "PET_BAG_NUM", 20, // 宠物背包格子
    "PET_EGG_0", 0, // 初始蛋
    "PET_EGG_1", 1 // 普通蛋
);
    }

    private static void init46() {
data.map(
    "BOARD_ACTION_1", 10, // 触摸看板武将增加好感度
    "LOVEFEEL_ACTION_1", 10, // 触摸看板武将次数
    "ARENA_TIME", 5, // 每日可以挑战的初始次数
    "ARENA_REPORT_NUM", 20, // 战报保留数量
    "ARENA_REPORT_TIME", 7 // 战报保留时间（天）
);
    }

    private static void init47() {
data.map(
    "HOMELAND_DEB_TIME", 1, // 家园解锁耗时消耗元宝1分钟/元宝
    "ARENA_AWARD_TIME", "21:00", // 奖励发放时间
    "MARRIED_UNDAY", 7 // 未上线超过7天
);
    }

}