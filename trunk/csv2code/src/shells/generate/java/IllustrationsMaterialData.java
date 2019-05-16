package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 图鉴武将资料表.csv
 * 武将名称 = id
 * 对应武将 = des
 * 武将ID = roleid
 * 身高 = height
 * 体重 = weight
 * 年龄 = age
 * 性格 = character
 * 星宿 = stars
 * 羁绊武将 = bestfriend
 * 羁绊头像id = headportraitid
 * 信念 = belief
 * 简介 = briefintroduction
 */
public class IllustrationsMaterialData extends LData {
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
    10000, map("id", 10000, "des", "姬长生", "roleid", 40000, "height", "182cm", "weight", "75kg", "age", "30", "character", "沉稳", "stars", "紫薇", "bestfriend", 40001, "headportraitid", "head_40001", "belief", "敬请期待", "briefintroduction", "敬请期待"),
    10001, map("id", 10001, "des", "长雍君", "roleid", 40001, "height", "180cm", "weight", "75kg", "age", "30", "character", "沉稳", "stars", "天机", "bestfriend", 40001, "headportraitid", "head_40001", "belief", "诸天星辰，变幻莫测。", "briefintroduction", "天鹤山上最为神秘之人，听闻其料事如神，能观星象变幻，预知未来。"),
    10002, map("id", 10002, "des", "闻仲", "roleid", 40002, "height", "180cm", "weight", "75kg", "age", "30", "character", "沉稳", "stars", "紫薇", "bestfriend", 40001, "headportraitid", "head_40001", "belief", "敬请期待", "briefintroduction", "敬请期待"),
    10003, map("id", 10003, "des", "李耳", "roleid", 40003, "height", "180cm", "weight", "75kg", "age", "30", "character", "沉稳", "stars", "紫薇", "bestfriend", 40001, "headportraitid", "head_40001", "belief", "敬请期待", "briefintroduction", "敬请期待"),
    10004, map("id", 10004, "des", "李白", "roleid", 40004, "height", "180cm", "weight", "75kg", "age", "30", "character", "沉稳", "stars", "紫薇", "bestfriend", 40001, "headportraitid", "head_40001", "belief", "敬请期待", "briefintroduction", "敬请期待")
);
    }

    private static void init1() {
data.map(
    10005, map("id", 10005, "des", "卡萨", "roleid", 40005, "height", "180cm", "weight", "75kg", "age", "25", "character", "沉稳", "stars", "紫薇", "bestfriend", 40001, "headportraitid", "head_40001", "belief", "敬请期待", "briefintroduction", "敬请期待"),
    10006, map("id", 10006, "des", "姬重华", "roleid", 40006, "height", "174cm", "weight", "57kg", "age", "31", "character", "嚣张", "stars", "天梁", "bestfriend", 40009, "headportraitid", "head_40001", "belief", "我想做什么事，可无人能拦！", "briefintroduction", "折梅山庄庄主重华。嚣张霸道，性烈如火，平生最烦有人称道其容貌，却因美貌著称于金陵之中。"),
    10007, map("id", 10007, "des", "安倍晴明", "roleid", 40007, "height", "180cm", "weight", "75kg", "age", "30", "character", "沉稳", "stars", "紫薇", "bestfriend", 40001, "headportraitid", "head_40001", "belief", "敬请期待", "briefintroduction", "敬请期待"),
    10008, map("id", 10008, "des", "承影", "roleid", 40008, "height", "184cm", "weight", "76kg", "age", "25", "character", "沉稳", "stars", "七杀", "bestfriend", 40021, "headportraitid", "head_40001", "belief", "与光同尘。", "briefintroduction", "南府暗卫之首，武功高绝，性格冷淡，沉默寡言。传闻江湖中曾有一位令人闻风丧胆也名唤‘承影’，不知二者之间有何关联……"),
    10009, map("id", 10009, "des", "霍曼曼", "roleid", 40009, "height", "163cm", "weight", "46kg", "age", "16", "character", "浪漫", "stars", "文曲", "bestfriend", 40025, "headportraitid", "head_40001", "belief", "每个人都应该能够充分的认识自己，不给别人带来麻烦才是。", "briefintroduction", "名门霍家之女，高贵典雅，优雅大方。七弦琴起，高山流水，不过如是。")
);
    }

    private static void init2() {
data.map(
    10010, map("id", 10010, "des", "公子尘来", "roleid", 40010, "height", "180cm", "weight", "70kg", "age", "15", "character", "霸道", "stars", "太阳", "bestfriend", 40015, "headportraitid", "head_40001", "belief", "我与你，无话可说。", "briefintroduction", "天鹤山二公子，公子尘来。性格沉稳果决，隐隐有问鼎下届武林之势。"),
    10011, map("id", 10011, "des", "南歌", "roleid", 40011, "height", "180cm", "weight", "75kg", "age", "30", "character", "沉稳", "stars", "紫薇", "bestfriend", 40001, "headportraitid", "head_40001", "belief", "敬请期待", "briefintroduction", "敬请期待"),
    10012, map("id", 10012, "des", "丽淑妃", "roleid", 40012, "height", "162cm", "weight", "48kg", "age", "26", "character", "温柔", "stars", "文曲", "bestfriend", 40001, "headportraitid", "head_40001", "belief", "相濡以沫，不如相忘于江湖", "briefintroduction", "曾经名满金陵的才女，性格温和又具有才气。善棋，曾布下珍珑棋局"),
    10013, map("id", 10013, "des", "胡不归", "roleid", 40013, "height", "168cm", "weight", "52kg", "age", "17", "character", "沉稳", "stars", "七杀", "bestfriend", 40009, "headportraitid", "head_40001", "belief", "等待是这世上最无用的东西！", "briefintroduction", "名门胡家之旁系女，温柔小意，妩媚多情。一曲箜篌，天下无双。"),
    10014, map("id", 10014, "des", "武照", "roleid", 40014, "height", "181cm", "weight", "75kg", "age", "22", "character", "沉稳", "stars", "武曲", "bestfriend", 40026, "headportraitid", "head_40001", "belief", "……", "briefintroduction", "江湖上有名的散客，无门无派，不知从何处来，也不知从何处去，可谓是江湖上最神秘之人之一。")
);
    }

    private static void init3() {
data.map(
    10015, map("id", 10015, "des", "荀德妃", "roleid", 40015, "height", "171cm", "weight", "55kg", "age", "29", "character", "妩媚", "stars", "禄存", "bestfriend", 40010, "headportraitid", "head_40001", "belief", "聪明的女人学会掠夺，而不是祈求。", "briefintroduction", "名门荀家之女，十五年前以美貌名动金陵。善画技，传其牡丹图可引百蝶环绕。"),
    10016, map("id", 10016, "des", "逍遥", "roleid", 40016, "height", "180cm", "weight", "75kg", "age", "30", "character", "沉稳", "stars", "紫薇", "bestfriend", 40001, "headportraitid", "head_40001", "belief", "今朝有酒今朝醉，什么，你说明日……？那就明天再想好了！", "briefintroduction", "江湖上有名的剑客，无门无派，剑术极为高超。喜好饮酒，经常出没在有好酒的地方。"),
    10017, map("id", 10017, "des", "鱼玄机", "roleid", 40017, "height", "167cm", "weight", "53kg", "age", "18", "character", "沉稳", "stars", "文曲", "bestfriend", 40023, "headportraitid", "head_40001", "belief", "世人笑我太疯癫，我笑世人看不穿。", "briefintroduction", "名满金陵的才女，性格淡薄，厌恶世人愚昧，故而出家为女冠。于文采一道上颇有成就。"),
    10018, map("id", 10018, "des", "合德", "roleid", 40018, "height", "180cm", "weight", "75kg", "age", "30", "character", "沉稳", "stars", "紫薇", "bestfriend", 40001, "headportraitid", "head_40001", "belief", "敬请期待", "briefintroduction", "敬请期待"),
    10019, map("id", 10019, "des", "飞燕", "roleid", 40019, "height", "180cm", "weight", "75kg", "age", "30", "character", "沉稳", "stars", "紫薇", "bestfriend", 40001, "headportraitid", "head_40001", "belief", "敬请期待", "briefintroduction", "敬请期待")
);
    }

    private static void init4() {
data.map(
    10020, map("id", 10020, "des", "洗砚", "roleid", 40020, "height", "180cm", "weight", "75kg", "age", "30", "character", "沉稳", "stars", "紫薇", "bestfriend", 40001, "headportraitid", "head_40001", "belief", "敬请期待", "briefintroduction", "敬请期待"),
    10021, map("id", 10021, "des", "青湖", "roleid", 40021, "height", "180cm", "weight", "75kg", "age", "30", "character", "沉稳", "stars", "紫薇", "bestfriend", 40001, "headportraitid", "head_40001", "belief", "敬请期待", "briefintroduction", "敬请期待"),
    10022, map("id", 10022, "des", "钟无艳", "roleid", 40022, "height", "180cm", "weight", "75kg", "age", "27", "character", "沉稳", "stars", "紫薇", "bestfriend", 40001, "headportraitid", "head_40001", "belief", "敬请期待", "briefintroduction", "敬请期待"),
    10023, map("id", 10023, "des", "范蠡", "roleid", 40023, "height", "180cm", "weight", "75kg", "age", "30", "character", "沉稳", "stars", "紫薇", "bestfriend", 40001, "headportraitid", "head_40001", "belief", "敬请期待", "briefintroduction", "敬请期待"),
    10024, map("id", 10024, "des", "姬燕来", "roleid", 40024, "height", "180cm", "weight", "75kg", "age", "30", "character", "沉稳", "stars", "紫薇", "bestfriend", 40001, "headportraitid", "head_40001", "belief", "敬请期待", "briefintroduction", "敬请期待")
);
    }

    private static void init5() {
data.map(
    10025, map("id", 10025, "des", "孙思邈", "roleid", 40025, "height", "180cm", "weight", "75kg", "age", "30", "character", "沉稳", "stars", "紫薇", "bestfriend", 40001, "headportraitid", "head_40001", "belief", "敬请期待", "briefintroduction", "敬请期待"),
    10026, map("id", 10026, "des", "杜浪", "roleid", 40026, "height", "178cm", "weight", "66kg", "age", "25", "character", "沉稳", "stars", "天同", "bestfriend", 40014, "headportraitid", "head_40001", "belief", "我在这里等你。", "briefintroduction", "江湖上有名的剑客，似是来自一个神秘的组织。经常出现在出人意料的地方，可谓是江湖上最神秘之人之一。"),
    10027, map("id", 10027, "des", "柳如是", "roleid", 40027, "height", "180cm", "weight", "75kg", "age", "30", "character", "沉稳", "stars", "紫薇", "bestfriend", 40001, "headportraitid", "head_40001", "belief", "敬请期待", "briefintroduction", "敬请期待"),
    10028, map("id", 10028, "des", "张仪", "roleid", 40028, "height", "173cm", "weight", "63kg", "age", "30", "character", "温和", "stars", "天同", "bestfriend", 40013, "headportraitid", "head_40001", "belief", "终归……会找到她的。", "briefintroduction", "金陵中颇有才名之人，关于他的传闻猜测从未停止。只是他本人似乎并不在意。"),
    10029, map("id", 10029, "des", "燕青", "roleid", 40029, "height", "180cm", "weight", "75kg", "age", "30", "character", "沉稳", "stars", "紫薇", "bestfriend", 40001, "headportraitid", "head_40001", "belief", "敬请期待", "briefintroduction", "敬请期待")
);
    }

    private static void init6() {
data.map(
    10030, map("id", 10030, "des", "要离", "roleid", 40030, "height", "180cm", "weight", "75kg", "age", "30", "character", "沉稳", "stars", "紫薇", "bestfriend", 40001, "headportraitid", "head_40001", "belief", "敬请期待", "briefintroduction", "敬请期待"),
    10031, map("id", 10031, "des", "荆轲", "roleid", 40031, "height", "180cm", "weight", "75kg", "age", "30", "character", "沉稳", "stars", "紫薇", "bestfriend", 40001, "headportraitid", "head_40001", "belief", "敬请期待", "briefintroduction", "敬请期待"),
    10032, map("id", 10032, "des", "南鹤", "roleid", 40032, "height", "180cm", "weight", "75kg", "age", "30", "character", "沉稳", "stars", "紫薇", "bestfriend", 40001, "headportraitid", "head_40001", "belief", "敬请期待", "briefintroduction", "敬请期待"),
    10033, map("id", 10033, "des", "狄青", "roleid", 40033, "height", "180cm", "weight", "75kg", "age", "30", "character", "沉稳", "stars", "紫薇", "bestfriend", 40001, "headportraitid", "head_40001", "belief", "敬请期待", "briefintroduction", "敬请期待"),
    10034, map("id", 10034, "des", "公孙大娘", "roleid", 40034, "height", "180cm", "weight", "75kg", "age", "30", "character", "沉稳", "stars", "紫薇", "bestfriend", 40001, "headportraitid", "head_40001", "belief", "敬请期待", "briefintroduction", "敬请期待")
);
    }

    private static void init7() {
data.map(
    10035, map("id", 10035, "des", "张江陵", "roleid", 40035, "height", "180cm", "weight", "75kg", "age", "30", "character", "沉稳", "stars", "紫薇", "bestfriend", 40001, "headportraitid", "head_40001", "belief", "敬请期待", "briefintroduction", "敬请期待"),
    10036, map("id", 10036, "des", "杜甫", "roleid", 40036, "height", "180cm", "weight", "75kg", "age", "30", "character", "沉稳", "stars", "紫薇", "bestfriend", 40001, "headportraitid", "head_40001", "belief", "敬请期待", "briefintroduction", "敬请期待")
);
    }

}