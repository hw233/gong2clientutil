package com.gamejelly.gong2.config.data;

import com.gamejelly.gong2.config.data.base.LData;
import com.gamejelly.gong2.config.data.base.LMap;

/**
 * 武将介绍表.csv
 * 编号 = id
 * 武将id = servantid
 */
public class ServantidInformationData extends LData {
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
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    10000, map("id", 10000, "servantid", 40000),
    10001, map("id", 10001, "servantid", 40001),
    10002, map("id", 10002, "servantid", 40002),
    10003, map("id", 10003, "servantid", 40003),
    10004, map("id", 10004, "servantid", 40004)
);
    }

    private static void init1() {
data.map(
    10005, map("id", 10005, "servantid", 40005),
    10006, map("id", 10006, "servantid", 40006),
    10007, map("id", 10007, "servantid", 40007),
    10008, map("id", 10008, "servantid", 40008),
    10009, map("id", 10009, "servantid", 40009)
);
    }

    private static void init2() {
data.map(
    10010, map("id", 10010, "servantid", 40010),
    10011, map("id", 10011, "servantid", 40011),
    10012, map("id", 10012, "servantid", 40012),
    10013, map("id", 10013, "servantid", 40013),
    10014, map("id", 10014, "servantid", 40014)
);
    }

    private static void init3() {
data.map(
    10015, map("id", 10015, "servantid", 40015),
    10016, map("id", 10016, "servantid", 40016),
    10017, map("id", 10017, "servantid", 40017),
    10018, map("id", 10018, "servantid", 40018),
    10019, map("id", 10019, "servantid", 40019)
);
    }

    private static void init4() {
data.map(
    10020, map("id", 10020, "servantid", 40020),
    10021, map("id", 10021, "servantid", 40021),
    10022, map("id", 10022, "servantid", 40022),
    10023, map("id", 10023, "servantid", 40023),
    10024, map("id", 10024, "servantid", 40024)
);
    }

    private static void init5() {
data.map(
    10025, map("id", 10025, "servantid", 40025),
    10026, map("id", 10026, "servantid", 40026),
    10027, map("id", 10027, "servantid", 40027),
    10028, map("id", 10028, "servantid", 40028),
    10029, map("id", 10029, "servantid", 40029)
);
    }

    private static void init6() {
data.map(
    10030, map("id", 10030, "servantid", 40030),
    10031, map("id", 10031, "servantid", 40031),
    10032, map("id", 10032, "servantid", 40032),
    10033, map("id", 10033, "servantid", 40033),
    10034, map("id", 10034, "servantid", 40034)
);
    }

    private static void init7() {
data.map(
    10035, map("id", 10035, "servantid", 40035),
    10036, map("id", 10036, "servantid", 40036),
    20000, map("id", 20000, "servantid", 40018),
    20001, map("id", 20001, "servantid", 40024),
    20002, map("id", 20002, "servantid", 40001)
);
    }

    private static void init8() {
data.map(
    20003, map("id", 20003, "servantid", 40010),
    20004, map("id", 20004, "servantid", 40028),
    20005, map("id", 20005, "servantid", 40024),
    20006, map("id", 20006, "servantid", 40024),
    20007, map("id", 20007, "servantid", 40029)
);
    }

    private static void init9() {
data.map(
    20008, map("id", 20008, "servantid", 40005),
    20009, map("id", 20009, "servantid", 40014)
);
    }

}