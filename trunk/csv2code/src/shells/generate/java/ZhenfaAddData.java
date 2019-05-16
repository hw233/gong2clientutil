package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 阵法加成.csv
 * ID = id
 * 阶段说明 = dec
 * 需要条件值 = value
 * 属性id = propId
 * 增加属性 = propValue
 */
public class ZhenfaAddData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    1000, map("id", 1000, "dec", "阵法总等级达到10", "value", 10, "propId", list(10045, 10048, 10055, 10056, 10057, 10058), "propValue", list(480.0f, 2880.0f, 0.3f, 0.3f, 0.3f, 0.3f)),
    1001, map("id", 1001, "dec", "阵法总等级达到20", "value", 20, "propId", list(10045, 10048, 10055, 10056, 10057, 10058), "propValue", list(960.0f, 5760.0f, 0.6f, 0.6f, 0.6f, 0.6f)),
    1002, map("id", 1002, "dec", "阵法总等级达到30", "value", 30, "propId", list(10045, 10048, 10055, 10056, 10057, 10058), "propValue", list(1440.0f, 8640.0f, 1.0f, 1.0f, 1.0f, 1.0f)),
    1003, map("id", 1003, "dec", "阵法总等级达到40", "value", 40, "propId", list(10045, 10048, 10055, 10056, 10057, 10058), "propValue", list(1920.0f, 11520.0f, 1.3f, 1.3f, 1.3f, 1.3f)),
    1004, map("id", 1004, "dec", "阵法总等级达到50", "value", 50, "propId", list(10045, 10048, 10055, 10056, 10057, 10058), "propValue", list(2400.0f, 14400.0f, 1.6f, 1.6f, 1.6f, 1.6f))
);
    }

}