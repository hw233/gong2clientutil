package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 图鉴主表.csv
 * 武将名称 = id
 * 武将ID = roleid
 * 武将图片id = pictureid
 * 武将描述 = destxt
 * 图鉴分类 = illustrations
 * 喜好道具 = like
 * 获取渠道 = jump
 * 跳转描述 = jumptxt
 * 好感度增加 = likeup
 * 好感度上限 = feelmax
 */
public class IllustrationsData extends LData {
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
    10000, map("id", 10000, "des", "姬长生", "roleid", 40000, "destxt", "%s的碎片。凑齐一定的数量可以召唤出%s，也是%s升星的必需品。", "illustrations", 1, "like", list(24000), "jump", list(1013, 1004, 1021), "jumptxt", "招募#活动#传记#", "likeup", list(3), "feelmax", 4000),
    10001, map("id", 10001, "des", "长雍君", "roleid", 40001, "destxt", "%s的碎片。凑齐一定的数量可以召唤出%s，也是%s升星的必需品。", "illustrations", 1, "like", list(24000), "jump", list(1013, 1004, 1021), "jumptxt", "招募#活动#传记#", "likeup", list(3), "feelmax", 4000),
    10002, map("id", 10002, "des", "闻仲", "roleid", 40002, "destxt", "%s的碎片。凑齐一定的数量可以召唤出%s，也是%s升星的必需品。", "illustrations", 2, "like", list(24000), "jump", list(1013, 1004, 1021), "jumptxt", "招募#活动#传记#", "likeup", list(3), "feelmax", 4000),
    10003, map("id", 10003, "des", "李耳", "roleid", 40003, "destxt", "%s的碎片。凑齐一定的数量可以召唤出%s，也是%s升星的必需品。", "illustrations", 2, "like", list(24000), "jump", list(1013, 1004, 1021), "jumptxt", "招募#活动#传记#", "likeup", list(3), "feelmax", 4000),
    10004, map("id", 10004, "des", "李白", "roleid", 40004, "pictureid", "character_LB", "destxt", "%s的碎片。凑齐一定的数量可以召唤出%s，也是%s升星的必需品。", "illustrations", 1, "like", list(24000), "jump", list(1013, 1004, 1021), "jumptxt", "招募#活动#传记#", "likeup", list(3), "feelmax", 4000)
);
    }

    private static void init1() {
data.map(
    10005, map("id", 10005, "des", "卡萨", "roleid", 40005, "pictureid", "character_KS", "destxt", "%s的碎片。凑齐一定的数量可以召唤出%s，也是%s升星的必需品。", "illustrations", 1, "like", list(24000), "jump", list(1013, 1004, 1021), "jumptxt", "招募#活动#传记#", "likeup", list(3), "feelmax", 4000),
    10006, map("id", 10006, "des", "姬重华", "roleid", 40006, "destxt", "%s的碎片。凑齐一定的数量可以召唤出%s，也是%s升星的必需品。", "illustrations", 1, "like", list(24000), "jump", list(1013, 1004, 1021), "jumptxt", "招募#活动#传记#", "likeup", list(3), "feelmax", 4000),
    10007, map("id", 10007, "des", "安倍晴明", "roleid", 40007, "destxt", "%s的碎片。凑齐一定的数量可以召唤出%s，也是%s升星的必需品。", "illustrations", 1, "like", list(24000), "jump", list(1013, 1004, 1021), "jumptxt", "招募#活动#传记#", "likeup", list(3), "feelmax", 4000),
    10008, map("id", 10008, "des", "承影", "roleid", 40008, "destxt", "%s的碎片。凑齐一定的数量可以召唤出%s，也是%s升星的必需品。", "illustrations", 1, "like", list(24000), "jump", list(1013, 1004, 1021), "jumptxt", "招募#活动#传记#", "likeup", list(3), "feelmax", 4000),
    10009, map("id", 10009, "des", "霍曼曼", "roleid", 40009, "pictureid", "character_YY", "destxt", "%s的碎片。凑齐一定的数量可以召唤出%s，也是%s升星的必需品。", "illustrations", 2, "like", list(24000), "jump", list(1013, 1004, 1021), "jumptxt", "招募#活动#传记#", "likeup", list(3), "feelmax", 4000)
);
    }

    private static void init2() {
data.map(
    10010, map("id", 10010, "des", "公子尘来", "roleid", 40010, "destxt", "%s的碎片。凑齐一定的数量可以召唤出%s，也是%s升星的必需品。", "illustrations", 1, "like", list(24000), "jump", list(1013, 1004, 1021), "jumptxt", "招募#活动#传记#", "likeup", list(3), "feelmax", 4000),
    10011, map("id", 10011, "des", "南歌", "roleid", 40011, "destxt", "%s的碎片。凑齐一定的数量可以召唤出%s，也是%s升星的必需品。", "illustrations", 2, "like", list(24000), "jump", list(1013, 1004, 1021), "jumptxt", "招募#活动#传记#", "likeup", list(3), "feelmax", 4000),
    10012, map("id", 10012, "des", "贾南风", "roleid", 40012, "destxt", "%s的碎片。凑齐一定的数量可以召唤出%s，也是%s升星的必需品。", "illustrations", 2, "like", list(24000), "jump", list(1013, 1004, 1021), "jumptxt", "招募#活动#传记#", "likeup", list(3), "feelmax", 4000),
    10013, map("id", 10013, "des", "胡不归", "roleid", 40013, "destxt", "%s的碎片。凑齐一定的数量可以召唤出%s，也是%s升星的必需品。", "illustrations", 2, "like", list(24000), "jump", list(1013, 1004, 1021), "jumptxt", "招募#活动#传记#", "likeup", list(3), "feelmax", 4000),
    10014, map("id", 10014, "des", "武照", "roleid", 40014, "pictureid", "character_WZ", "destxt", "%s的碎片。凑齐一定的数量可以召唤出%s，也是%s升星的必需品。", "illustrations", 2, "like", list(24000), "jump", list(1013, 1004, 1021), "jumptxt", "招募#活动#传记#", "likeup", list(3), "feelmax", 4000)
);
    }

    private static void init3() {
data.map(
    10015, map("id", 10015, "des", "许穆夫人", "roleid", 40015, "pictureid", "character_XDF", "destxt", "%s的碎片。凑齐一定的数量可以召唤出%s，也是%s升星的必需品。", "illustrations", 2, "like", list(24000), "jump", list(1013, 1004, 1021), "jumptxt", "招募#活动#传记#", "likeup", list(3), "feelmax", 4000),
    10016, map("id", 10016, "des", "逍遥", "roleid", 40016, "pictureid", "character_XY", "destxt", "%s的碎片。凑齐一定的数量可以召唤出%s，也是%s升星的必需品。", "illustrations", 2, "like", list(24000), "jump", list(1013, 1004, 1021), "jumptxt", "招募#活动#传记#", "likeup", list(3), "feelmax", 4000),
    10017, map("id", 10017, "des", "鱼玄机", "roleid", 40017, "pictureid", "character_YXJ", "destxt", "%s的碎片。凑齐一定的数量可以召唤出%s，也是%s升星的必需品。", "illustrations", 2, "like", list(24000), "jump", list(1013, 1004, 1021), "jumptxt", "招募#活动#传记#", "likeup", list(3), "feelmax", 4000),
    10018, map("id", 10018, "des", "合德", "roleid", 40018, "destxt", "%s的碎片。凑齐一定的数量可以召唤出%s，也是%s升星的必需品。", "illustrations", 2, "like", list(24000), "jump", list(1013, 1004, 1021), "jumptxt", "招募#活动#传记#", "likeup", list(3), "feelmax", 4000),
    10019, map("id", 10019, "des", "飞燕", "roleid", 40019, "destxt", "%s的碎片。凑齐一定的数量可以召唤出%s，也是%s升星的必需品。", "illustrations", 2, "like", list(24000), "jump", list(1013, 1004, 1021), "jumptxt", "招募#活动#传记#", "likeup", list(3), "feelmax", 4000)
);
    }

    private static void init4() {
data.map(
    10020, map("id", 10020, "des", "洗砚", "roleid", 40020, "destxt", "%s的碎片。凑齐一定的数量可以召唤出%s，也是%s升星的必需品。", "illustrations", 2, "like", list(24000), "jump", list(1013, 1004, 1021), "jumptxt", "招募#活动#传记#", "likeup", list(3), "feelmax", 4000),
    10021, map("id", 10021, "des", "青湖", "roleid", 40021, "destxt", "%s的碎片。凑齐一定的数量可以召唤出%s，也是%s升星的必需品。", "illustrations", 2, "like", list(24000), "jump", list(1013, 1004, 1021), "jumptxt", "招募#活动#传记#", "likeup", list(3), "feelmax", 4000),
    10022, map("id", 10022, "des", "钟无艳", "roleid", 40022, "destxt", "%s的碎片。凑齐一定的数量可以召唤出%s，也是%s升星的必需品。", "illustrations", 2, "like", list(24000), "jump", list(1013, 1004, 1021), "jumptxt", "招募#活动#传记#", "likeup", list(3), "feelmax", 4000),
    10023, map("id", 10023, "des", "范蠡", "roleid", 40023, "destxt", "%s的碎片。凑齐一定的数量可以召唤出%s，也是%s升星的必需品。", "illustrations", 2, "like", list(24000), "jump", list(1013, 1004, 1021), "jumptxt", "招募#活动#传记#", "likeup", list(3), "feelmax", 4000),
    10024, map("id", 10024, "des", "姬燕来", "roleid", 40024, "destxt", "%s的碎片。凑齐一定的数量可以召唤出%s，也是%s升星的必需品。", "illustrations", 1, "like", list(24000), "jump", list(1013, 1004, 1021), "jumptxt", "招募#活动#传记#", "likeup", list(3), "feelmax", 4000)
);
    }

    private static void init5() {
data.map(
    10025, map("id", 10025, "des", "孙思邈", "roleid", 40025, "destxt", "%s的碎片。凑齐一定的数量可以召唤出%s，也是%s升星的必需品。", "illustrations", 1, "like", list(24000), "jump", list(1013, 1004, 1021), "jumptxt", "招募#活动#传记#", "likeup", list(3), "feelmax", 4000),
    10026, map("id", 10026, "des", "杜浪", "roleid", 40026, "pictureid", "character_DL", "destxt", "%s的碎片。凑齐一定的数量可以召唤出%s，也是%s升星的必需品。", "illustrations", 3, "like", list(24000), "jump", list(1013, 1004, 1021), "jumptxt", "招募#活动#传记#", "likeup", list(3), "feelmax", 4000),
    10027, map("id", 10027, "des", "柳如是", "roleid", 40027, "destxt", "%s的碎片。凑齐一定的数量可以召唤出%s，也是%s升星的必需品。", "illustrations", 3, "like", list(24000), "jump", list(1013, 1004, 1021), "jumptxt", "招募#活动#传记#", "likeup", list(3), "feelmax", 4000),
    10028, map("id", 10028, "des", "张仪", "roleid", 40028, "destxt", "%s的碎片。凑齐一定的数量可以召唤出%s，也是%s升星的必需品。", "illustrations", 3, "like", list(24000), "jump", list(1013, 1004, 1021), "jumptxt", "招募#活动#传记#", "likeup", list(3), "feelmax", 4000),
    10029, map("id", 10029, "des", "燕青", "roleid", 40029, "destxt", "%s的碎片。凑齐一定的数量可以召唤出%s，也是%s升星的必需品。", "illustrations", 3, "like", list(24000), "jump", list(1013, 1004, 1021), "jumptxt", "招募#活动#传记#", "likeup", list(3), "feelmax", 4000)
);
    }

    private static void init6() {
data.map(
    10030, map("id", 10030, "des", "要离", "roleid", 40030, "destxt", "%s的碎片。凑齐一定的数量可以召唤出%s，也是%s升星的必需品。", "illustrations", 3, "like", list(24000), "jump", list(1013, 1004, 1021), "jumptxt", "招募#活动#传记#", "likeup", list(3), "feelmax", 4000),
    10031, map("id", 10031, "des", "荆轲", "roleid", 40031, "destxt", "%s的碎片。凑齐一定的数量可以召唤出%s，也是%s升星的必需品。", "illustrations", 3, "like", list(24000), "jump", list(1013, 1004, 1021), "jumptxt", "招募#活动#传记#", "likeup", list(3), "feelmax", 4000),
    10032, map("id", 10032, "des", "南鹤", "roleid", 40032, "destxt", "%s的碎片。凑齐一定的数量可以召唤出%s，也是%s升星的必需品。", "illustrations", 3, "like", list(24000), "jump", list(1013, 1004, 1021), "jumptxt", "招募#活动#传记#", "likeup", list(3), "feelmax", 4000),
    10033, map("id", 10033, "des", "狄青", "roleid", 40033, "destxt", "%s的碎片。凑齐一定的数量可以召唤出%s，也是%s升星的必需品。", "illustrations", 3, "like", list(24000), "jump", list(1013, 1004, 1021), "jumptxt", "招募#活动#传记#", "likeup", list(3), "feelmax", 4000),
    10034, map("id", 10034, "des", "公孙大娘", "roleid", 40034, "destxt", "%s的碎片。凑齐一定的数量可以召唤出%s，也是%s升星的必需品。", "illustrations", 2, "like", list(24000), "jump", list(1013, 1004, 1021), "jumptxt", "招募#活动#传记#", "likeup", list(3), "feelmax", 4000)
);
    }

    private static void init7() {
data.map(
    10035, map("id", 10035, "des", "张江陵", "roleid", 40035, "destxt", "%s的碎片。凑齐一定的数量可以召唤出%s，也是%s升星的必需品。", "illustrations", 2, "like", list(24000), "jump", list(1013, 1004, 1021), "jumptxt", "招募#活动#传记#", "likeup", list(3), "feelmax", 4000),
    10036, map("id", 10036, "des", "杜甫", "roleid", 40036, "destxt", "%s的碎片。凑齐一定的数量可以召唤出%s，也是%s升星的必需品。", "illustrations", 2, "like", list(24000), "jump", list(1013, 1004, 1021), "jumptxt", "招募#活动#传记#", "likeup", list(3), "feelmax", 4000)
);
    }

}