package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 图鉴武将皮肤表.csv
 * 皮肤ID = id
 * 对应武将 = des
 * 武将ID = roleid
 * 皮肤名称 = skinname
 * 对应头像 = headportrait
 * 皮肤描述 = skinstory
 * 获取渠道 = channel
 * 活动id = channeid
 * 活动描述 = channe_describe
 * 导航页面 = navigation
 */
public class IllustrationsSkinData extends LData {
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
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    10000, map("id", 10000, "des", "姬长生", "roleid", 40000, "skinname", "华胥之梦", "headportrait", 40000, "skinstory", "帝君有梦，名曰华胥。", "channel", 3),
    10001, map("id", 10001, "des", "姬长生", "roleid", 40000, "skinname", "长生", "headportrait", 40000, "skinstory", "仙人抚我顶，结发受长生。", "channel", 2, "channe_describe", 1, "navigation", 1),
    10002, map("id", 10002, "des", "长雍君", "roleid", 40001, "skinname", "北斗观星", "headportrait", 40001, "skinstory", "坐忘红尘，观星北斗。", "channel", 3),
    10003, map("id", 10003, "des", "长雍君", "roleid", 40001, "skinname", "红尘秘意", "headportrait", 40001, "skinstory", "十丈软红，轻易不得出。", "channel", 4, "channe_describe", 3, "navigation", 2),
    10004, map("id", 10004, "des", "闻仲", "roleid", 40002, "skinname", "百战戏", "headportrait", 40002, "skinstory", "将军百战，华发早生。", "channel", 3)
);
    }

    private static void init1() {
data.map(
    10005, map("id", 10005, "des", "闻仲", "roleid", 40002, "skinname", "千机盏", "headportrait", 40002, "skinstory", "一杯千机，一盏华梦。", "channel", 3),
    10006, map("id", 10006, "des", "李耳", "roleid", 40003, "skinname", "杏花雨", "headportrait", 40003, "skinstory", "敬请期待", "channel", 3),
    10007, map("id", 10007, "des", "李白", "roleid", 40004, "skinname", "灼灼其华", "headportrait", 40004, "skinstory", "敬请期待", "channel", 3),
    10008, map("id", 10008, "des", "卡萨", "roleid", 40005, "skinname", "波斯猫", "headportrait", 40005, "skinstory", "敬请期待", "channel", 3),
    10009, map("id", 10009, "des", "姬重华", "roleid", 40006, "skinname", "十方艳罢", "headportrait", 40006, "skinstory", "待君十方，不若艳罢。", "channel", 3)
);
    }

    private static void init2() {
data.map(
    10010, map("id", 10010, "des", "安倍晴明", "roleid", 40007, "skinname", "六芒定天", "headportrait", 40007, "skinstory", "敬请期待", "channel", 3),
    10011, map("id", 10011, "des", "承影", "roleid", 40008, "skinname", "隐刃", "headportrait", 40008, "skinstory", "敬请期待", "channel", 3),
    10012, map("id", 10012, "des", "霍曼曼", "roleid", 40009, "skinname", "牵丝", "headportrait", 40009, "skinstory", "一丝牵情，一丝牵心。", "channel", 3),
    10013, map("id", 10013, "des", "公子尘来", "roleid", 40010, "skinname", "莲说", "headportrait", 40010, "skinstory", "濯濯青莲，细雨谁听？", "channel", 3),
    10014, map("id", 10014, "des", "南歌", "roleid", 40011, "skinname", "南来之歌", "headportrait", 40011, "skinstory", "敬请期待", "channel", 3)
);
    }

    private static void init3() {
data.map(
    10015, map("id", 10015, "des", "丽淑妃", "roleid", 40012, "skinname", "长相思", "headportrait", 40012, "skinstory", "长相思，长相恨。", "channel", 3),
    10016, map("id", 10016, "des", "胡不归", "roleid", 40013, "skinname", "潭梨", "headportrait", 40013, "skinstory", "夜照寒潭，梨落有香。", "channel", 3),
    10017, map("id", 10017, "des", "武照", "roleid", 40014, "skinname", "夜昙", "headportrait", 40014, "skinstory", "夜半优昙火裹开。", "channel", 3),
    10018, map("id", 10018, "des", "荀德妃", "roleid", 40015, "skinname", "鹤归", "headportrait", 40015, "skinstory", "千载鹤归犹有恨，一年人住岂无情。", "channel", 3),
    10019, map("id", 10019, "des", "逍遥", "roleid", 40016, "skinname", "谈笑江湖", "headportrait", 40016, "skinstory", "初心易，华发生，谈笑话江湖。", "channel", 3)
);
    }

    private static void init4() {
data.map(
    10020, map("id", 10020, "des", "鱼玄机", "roleid", 40017, "skinname", "浅水", "headportrait", 40017, "skinstory", "一拘清水，一场浅谈。", "channel", 3),
    10021, map("id", 10021, "des", "合德", "roleid", 40018, "skinname", "广寒仙", "headportrait", 40018, "skinstory", "敬请期待", "channel", 3),
    10022, map("id", 10022, "des", "飞燕", "roleid", 40019, "skinname", "凌波", "headportrait", 40019, "skinstory", "敬请期待", "channel", 3),
    10023, map("id", 10023, "des", "洗砚", "roleid", 40020, "skinname", "拒霜", "headportrait", 40020, "skinstory", "敬请期待", "channel", 3),
    10024, map("id", 10024, "des", "青湖", "roleid", 40021, "skinname", "守约", "headportrait", 40021, "skinstory", "敬请期待", "channel", 3)
);
    }

    private static void init5() {
data.map(
    10025, map("id", 10025, "des", "钟无艳", "roleid", 40022, "skinname", "霜美人", "headportrait", 40022, "skinstory", "敬请期待", "channel", 3),
    10026, map("id", 10026, "des", "范蠡", "roleid", 40023, "skinname", "玉茗", "headportrait", 40023, "skinstory", "敬请期待", "channel", 3),
    10027, map("id", 10027, "des", "姬燕来", "roleid", 40024, "skinname", "延年", "headportrait", 40024, "skinstory", "敬请期待", "channel", 3),
    10028, map("id", 10028, "des", "孙思邈", "roleid", 40025, "skinname", "活人不医", "headportrait", 40025, "skinstory", "敬请期待", "channel", 3),
    10029, map("id", 10029, "des", "杜浪", "roleid", 40026, "skinname", "江湖客", "headportrait", 40026, "skinstory", "一匹白马一杯茶，一把长剑一散客。", "channel", 3)
);
    }

    private static void init6() {
data.map(
    10030, map("id", 10030, "des", "柳如是", "roleid", 40027, "skinname", "倾国", "headportrait", 40027, "skinstory", "敬请期待", "channel", 3),
    10031, map("id", 10031, "des", "张仪", "roleid", 40028, "skinname", "金罂", "headportrait", 40028, "skinstory", "纸醉金迷，罂罂之毒。", "channel", 3),
    10032, map("id", 10032, "des", "燕青", "roleid", 40029, "skinname", "天巧", "headportrait", 40029, "skinstory", "敬请期待", "channel", 3),
    10033, map("id", 10033, "des", "要离", "roleid", 40030, "skinname", "决杀", "headportrait", 40030, "skinstory", "敬请期待", "channel", 3),
    10034, map("id", 10034, "des", "荆轲", "roleid", 40031, "skinname", "寸肠", "headportrait", 40031, "skinstory", "敬请期待", "channel", 3)
);
    }

    private static void init7() {
data.map(
    10035, map("id", 10035, "des", "南鹤", "roleid", 40032, "skinname", "青衫隐", "headportrait", 40032, "skinstory", "敬请期待", "channel", 3),
    10036, map("id", 10036, "des", "狄青", "roleid", 40033, "skinname", "天涯客", "headportrait", 40033, "skinstory", "敬请期待", "channel", 3),
    10037, map("id", 10037, "des", "公孙大娘", "roleid", 40034, "skinname", "露华浓", "headportrait", 40034, "skinstory", "敬请期待", "channel", 3),
    10038, map("id", 10038, "des", "张江陵", "roleid", 40035, "skinname", "太阿", "headportrait", 40035, "skinstory", "敬请期待", "channel", 3),
    10039, map("id", 10039, "des", "杜甫", "roleid", 40036, "skinname", "梦君", "headportrait", 40036, "skinstory", "敬请期待", "channel", 3)
);
    }

}