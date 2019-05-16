package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 皇上对话表.csv
 * 编号 = id
 * 内容 = content
 */
public class HuangshangduihuaData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        init1();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    1000, map("id", 1000, "content", "少侠我累了，跪安吧！"),
    1001, map("id", 1001, "content", "少侠可是想我了，我会不好意思的？"),
    1002, map("id", 1002, "content", "少侠今日真是美若天仙！"),
    1003, map("id", 1003, "content", "少侠给你讲个笑话吧！前几日和绅考纪晓岚，出上联：树上有只鸟，鸟摇树也摇，鸟都飞走了，树还摇三摇。纪晓岚对下联：和绅去尿尿，鸟摇尿也摇，尿都尿完了，鸟还摇三摇。"),
    1004, map("id", 1004, "content", "少侠给你淫诗一手：出林杏子落金盘。齿软怕尝酸。可惜半残青紫，犹印小唇丹。南陌上，落花闲。雨斑斑。不言不语，一段伤春，都在眉间。")
);
    }

    private static void init1() {
data.map(
    1005, map("id", 1005, "content", "今日暂且放过我吧！这两日真的是折腾的朕腰酸背痛！"),
    1006, map("id", 1006, "content", "我来逗一逗少侠如何，少侠听好了，一天公牛遇见猴子就把猴子暴打了一顿，毛驴子看见了就问：你这样打猴子干吗？公牛道，这个欠揍的早晨学着人的样子，提个水桶来挤我老婆的奶！"),
    1007, map("id", 1007, "content", "有三个百岁寿星被询问，让三位寿星说一说他们的长寿之道。第一位寿星说：“吃饭少一口。”第二位寿星说：“饭后百步走。”第三位寿星很不好意思的说道：“老婆长得丑。”"),
    1008, map("id", 1008, "content", "在天愿作比翼鸟，在地愿为连理枝。朕愿与你做那比翼鸟，你可愿意？")
);
    }

}