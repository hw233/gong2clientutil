package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 羁绊表.csv
 * 编号 = id
 * 武将id = servant_id
 * 羁绊关系 = fetter
 * 属性提升 = attribute
 * 提升属性 = attribute_up
 * 羁绊描述 = fetter_describe
 */
public class FetterData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        init1();
        init2();
        init3();
        init4();
        init5();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    40000, map("id", 40000, "servant_id", 40000, "fetter", list(40014), "attribute", list(10055, 10056, 10057, 10058), "attribute_up", list(0.035f, 0.025f, 0.025f, 0.045f), "fetter_describe", "日月明空"),
    40001, map("id", 40001, "servant_id", 40001, "fetter", list(40000), "attribute", list(10055, 10056, 10057, 10058), "attribute_up", list(0.055f, 0.03f, 0.03f, 0.01f), "fetter_describe", "虚舟难覆"),
    40005, map("id", 40005, "servant_id", 40005, "fetter", list(40022), "attribute", list(10055, 10056, 10057, 10058), "attribute_up", list(0.075f, 0.01f, 0.01f, 0.01f), "fetter_describe", "向风靡然"),
    40006, map("id", 40006, "servant_id", 40006, "fetter", list(40009), "attribute", list(10055, 10056, 10057, 10058), "attribute_up", list(0.06f, 0.01f, 0.01f, 0.03f), "fetter_describe", "芝兰之交"),
    40008, map("id", 40008, "servant_id", 40008, "fetter", list(40021), "attribute", list(10055, 10056, 10057, 10058), "attribute_up", list(0.01f, 0.05f, 0.05f, 0.075f), "fetter_describe", "丹心不易")
);
    }

    private static void init1() {
data.map(
    40009, map("id", 40009, "servant_id", 40009, "fetter", list(40025), "attribute", list(10055, 10056, 10057, 10058), "attribute_up", list(0.03f, 0.03f, 0.03f, 0.045f), "fetter_describe", "妙手仁心"),
    40010, map("id", 40010, "servant_id", 40010, "fetter", list(40015), "attribute", list(10055, 10056, 10057, 10058), "attribute_up", list(0.035f, 0.025f, 0.025f, 0.045f), "fetter_describe", "血浓于水"),
    40011, map("id", 40011, "servant_id", 40011, "fetter", list(40016), "attribute", list(10055, 10056, 10057, 10058), "attribute_up", list(0.055f, 0.03f, 0.03f, 0.01f), "fetter_describe", "柔情侠骨"),
    40012, map("id", 40012, "servant_id", 40012, "fetter", list(40001), "attribute", list(10055, 10056, 10057, 10058), "attribute_up", list(0.035f, 0.025f, 0.025f, 0.045f), "fetter_describe", "天道循环"),
    40013, map("id", 40013, "servant_id", 40013, "fetter", list(40009), "attribute", list(10055, 10056, 10057, 10058), "attribute_up", list(0.055f, 0.03f, 0.03f, 0.01f), "fetter_describe", "桃李争妍")
);
    }

    private static void init2() {
data.map(
    40014, map("id", 40014, "servant_id", 40014, "fetter", list(40026), "attribute", list(10055, 10056, 10057, 10058), "attribute_up", list(0.01f, 0.05f, 0.05f, 0.075f), "fetter_describe", "唇齿相依"),
    40015, map("id", 40015, "servant_id", 40015, "fetter", list(40010), "attribute", list(10055, 10056, 10057, 10058), "attribute_up", list(0.03f, 0.03f, 0.03f, 0.045f), "fetter_describe", "舐犊情深"),
    40016, map("id", 40016, "servant_id", 40016, "fetter", list(40008), "attribute", list(10055, 10056, 10057, 10058), "attribute_up", list(0.06f, 0.01f, 0.01f, 0.03f), "fetter_describe", "江湖相忘"),
    40017, map("id", 40017, "servant_id", 40017, "fetter", list(40023), "attribute", list(10055, 10056, 10057, 10058), "attribute_up", list(0.055f, 0.03f, 0.03f, 0.01f), "fetter_describe", "朝花夕拾"),
    40018, map("id", 40018, "servant_id", 40018, "fetter", list(40019), "attribute", list(10055, 10056, 10057, 10058), "attribute_up", list(0.035f, 0.025f, 0.025f, 0.045f), "fetter_describe", "祸水红颜")
);
    }

    private static void init3() {
data.map(
    40019, map("id", 40019, "servant_id", 40019, "fetter", list(40018), "attribute", list(10055, 10056, 10057, 10058), "attribute_up", list(0.055f, 0.03f, 0.03f, 0.01f), "fetter_describe", "姐妹情深"),
    40020, map("id", 40020, "servant_id", 40020, "fetter", list(40036), "attribute", list(10055, 10056, 10057, 10058), "attribute_up", list(0.01f, 0.05f, 0.05f, 0.075f), "fetter_describe", "想望风采"),
    40021, map("id", 40021, "servant_id", 40021, "fetter", list(40020), "attribute", list(10055, 10056, 10057, 10058), "attribute_up", list(0.03f, 0.03f, 0.03f, 0.045f), "fetter_describe", "赤子心肠"),
    40022, map("id", 40022, "servant_id", 40022, "fetter", list(40023), "attribute", list(10055, 10056, 10057, 10058), "attribute_up", list(0.06f, 0.01f, 0.01f, 0.03f), "fetter_describe", "笑谈春秋"),
    40023, map("id", 40023, "servant_id", 40023, "fetter", list(40028), "attribute", list(10055, 10056, 10057, 10058), "attribute_up", list(0.075f, 0.01f, 0.01f, 0.01f), "fetter_describe", "算无遗策")
);
    }

    private static void init4() {
data.map(
    40025, map("id", 40025, "servant_id", 40025, "fetter", list(40036), "attribute", list(10055, 10056, 10057, 10058), "attribute_up", list(0.01f, 0.05f, 0.05f, 0.075f), "fetter_describe", "清风高谊"),
    40026, map("id", 40026, "servant_id", 40026, "fetter", list(40014), "attribute", list(10055, 10056, 10057, 10058), "attribute_up", list(0.075f, 0.01f, 0.01f, 0.01f), "fetter_describe", "风雨同舟"),
    40028, map("id", 40028, "servant_id", 40028, "fetter", list(40013), "attribute", list(10055, 10056, 10057, 10058), "attribute_up", list(0.055f, 0.03f, 0.03f, 0.01f), "fetter_describe", "塞上江南"),
    40029, map("id", 40029, "servant_id", 40029, "fetter", list(40016), "attribute", list(10055, 10056, 10057, 10058), "attribute_up", list(0.01f, 0.05f, 0.05f, 0.075f), "fetter_describe", "山长水阔"),
    40030, map("id", 40030, "servant_id", 40030, "fetter", list(40011), "attribute", list(10055, 10056, 10057, 10058), "attribute_up", list(0.035f, 0.025f, 0.025f, 0.045f), "fetter_describe", "江湖夜雨")
);
    }

    private static void init5() {
data.map(
    40032, map("id", 40032, "servant_id", 40032, "fetter", list(40011), "attribute", list(10055, 10056, 10057, 10058), "attribute_up", list(0.06f, 0.01f, 0.01f, 0.03f), "fetter_describe", "同气连枝"),
    40033, map("id", 40033, "servant_id", 40033, "fetter", list(40029), "attribute", list(10055, 10056, 10057, 10058), "attribute_up", list(0.06f, 0.01f, 0.01f, 0.03f), "fetter_describe", "平生豪举"),
    40036, map("id", 40036, "servant_id", 40036, "fetter", list(40017), "attribute", list(10055, 10056, 10057, 10058), "attribute_up", list(0.075f, 0.01f, 0.01f, 0.01f), "fetter_describe", "倾盖如故")
);
    }

}