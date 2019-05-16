package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 新手引导表.csv
 * 编号 = id
 * 下一引导 = nextId
 * 引导步骤 = ydbz
 * 关键点 = keyStep
 * 是否是建造的步骤 = isBuild
 * 引导描述 = describe
 * 建筑id = buildId
 * 建造建筑id = haveBuildId
 * 经验 = exp
 * 开放等级 = openClass
 * 是否是功能引导 = isFunctions
 * 物品id = itemsId
 * 物品数量 = itemsNumber
 * 跳至 = jumpTo
 */
public class XsydData extends LData {
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
    10001, map("id", 10001, "ydbz", list(20001, 20002, 20003, 20004), "keyStep", 20004, "isBuild", 0),
    10002, map("id", 10002, "ydbz", list(30001, 30002, 30003), "keyStep", 30003, "isBuild", 0),
    10003, map("id", 10003, "nextId", 10002, "ydbz", list(40001, 40002, 40003, 40004, 40005, 40006, 40007, 40008, 40009, 40010), "keyStep", 40010, "isBuild", 0),
    10004, map("id", 10004, "ydbz", list(50001, 50002, 50003), "keyStep", 50003),
    10005, map("id", 10005, "ydbz", list(60001, 60002, 60003, 60004, 60005, 60006, 60007), "keyStep", 60007, "isBuild", 0)
);
    }

    private static void init1() {
data.map(
    10006, map("id", 10006, "ydbz", list(70001, 70002), "keyStep", 70002),
    10007, map("id", 10007, "ydbz", list(70003, 70004), "keyStep", 70004),
    10008, map("id", 10008, "ydbz", list(1, 5), "keyStep", 5, "openClass", 12),
    10009, map("id", 10009, "ydbz", list(90201, 6, 7, 8, 9), "keyStep", 9, "openClass", 10),
    10010, map("id", 10010, "ydbz", list(10, 11, 12), "keyStep", 12, "openClass", 7)
);
    }

    private static void init2() {
data.map(
    10011, map("id", 10011, "ydbz", list(13, 14, 15, 16), "keyStep", 16, "openClass", 9),
    10012, map("id", 10012, "nextId", 10024, "ydbz", list(17, 18, 19, 20), "keyStep", 20),
    10014, map("id", 10014, "ydbz", list(90001, 90102, 90103, 90104), "keyStep", 90104),
    10015, map("id", 10015, "ydbz", list(90201, 90202, 90203, 90204, 90205, 90206, 90207, 90208), "keyStep", 90208, "openClass", 14),
    10016, map("id", 10016, "ydbz", list(90301, 90302, 90303, 90304, 90305, 90306, 90307, 90308, 90309, 90310, 90311, 90208, 90312, 90313, 90314, 90315, 90316, 90317, 90318, 90319, 90320, 90004), "keyStep", 90004, "openClass", 18)
);
    }

    private static void init3() {
data.map(
    10017, map("id", 10017, "ydbz", list(90401, 90402, 90403, 90404, 90405, 90407), "keyStep", 90407, "openClass", 20),
    10018, map("id", 10018, "ydbz", list(90501, 90502, 90503, 90504, 90505, 90506, 90507), "keyStep", 90507, "openClass", 25),
    10019, map("id", 10019, "ydbz", list(90601, 90602, 90603, 90604, 90605, 90606), "keyStep", 90606),
    10020, map("id", 10020, "ydbz", list(90701, 90702, 90703, 90704), "keyStep", 90704),
    10021, map("id", 10021, "ydbz", list(90801, 90802, 90803, 90804, 90805, 90806), "keyStep", 90806)
);
    }

    private static void init4() {
data.map(
    10022, map("id", 10022, "ydbz", list(100001, 100002, 100003, 100004), "keyStep", 100004, "openClass", 7),
    10023, map("id", 10023, "ydbz", list(100101, 100102, 100103, 100104), "keyStep", 100104, "openClass", 16),
    10024, map("id", 10024, "ydbz", list(100201, 100202, 100203, 100204, 100205, 100206, 100207, 100208, 100209), "keyStep", 100209),
    10025, map("id", 10025, "ydbz", list(100301, 100302, 100303, 100304, 100305, 100306), "keyStep", 100306, "openClass", 11),
    10026, map("id", 10026, "ydbz", list(100401, 100402, 100403), "keyStep", 100403)
);
    }

    private static void init5() {
data.map(
    10027, map("id", 10027, "ydbz", list(80001, 80002), "keyStep", 80002),
    10028, map("id", 10028, "nextId", 10029, "ydbz", list(100404, 100405), "keyStep", 100405),
    10029, map("id", 10029, "nextId", 10022, "ydbz", list(30005, 30006, 30007), "keyStep", 30007),
    37006, map("id", 37006, "ydbz", list(90002, 90003, 90004), "keyStep", 90004)
);
    }

}