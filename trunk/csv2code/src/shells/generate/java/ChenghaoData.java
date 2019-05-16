package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 称号表.csv
 * id = id
 * 称号名 = name
 * 获取渠道 = qudao
 * 属性id = propId
 * 增加属性 = propValue
 * 类型 = type
 * 重置 = czDay
 * 图标 = icon
 */
public class ChenghaoData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    90002, map("id", 90002, "name", "冠盖京华", "qudao", "贵族达到3级", "propId", list(10051, 10052, 10053, 10054), "propValue", list(125, 50, 50, 1500), "type", 2, "czDay", 1, "icon", "chenghao_vip3"),
    90009, map("id", 90009, "name", "灵舒望月", "qudao", "贵族达到10级", "propId", list(10051, 10052, 10053, 10054, 10056, 10057, 10059, 10060, 10062, 10063), "propValue", list(500.0f, 200.0f, 200.0f, 600.0f, 0.03f, 0.03f, 0.01f, 0.01f, 0.01f, 0.01f), "type", 2, "czDay", 1, "icon", "chenghao_vip10"),
    90014, map("id", 90014, "name", "惊鸿照影", "qudao", "贵族达到15级", "propId", list(10051, 10052, 10053, 10054, 10056, 10057, 10059, 10060, 10062, 10063), "propValue", list(563.0f, 225.0f, 225.0f, 6750.0f, 0.04f, 0.04f, 0.02f, 0.02f, 0.02f, 0.02f), "type", 2, "czDay", 1, "icon", "chenghao_vip15")
);
    }

}