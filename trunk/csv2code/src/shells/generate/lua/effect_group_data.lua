--
-- 特效组表.csv
-- 特效组编号 = id
-- 特效组数 = effectGroup
-- 特效标记 = effectSign
-- 特效层级 = effectOrder

local data = {
    [30000] = {["id"] = 30000, ["effectGroup"] = {20000, 20001}, ["effectSign"] = {0, 0}, ["effectOrder"] = {1, 1}},
    [30001] = {["id"] = 30001, ["effectGroup"] = {20009, 20010}, ["effectSign"] = {1, 1}},
    [30002] = {["id"] = 30002, ["effectGroup"] = {20014, 20017, 20018}, ["effectSign"] = {0, 0, 0}},
    [30003] = {["id"] = 30003, ["effectGroup"] = {20035, 20034}, ["effectSign"] = {0, 0}},
    [30004] = {["id"] = 30004, ["effectGroup"] = {20010, 21000, 21001}, ["effectSign"] = {1, 1, 1}},
    [30005] = {["id"] = 30005, ["effectGroup"] = {20038, 20042}, ["effectSign"] = {0, 0}, ["effectOrder"] = {0, 1}},
    [30006] = {["id"] = 30006, ["effectGroup"] = {20036, 20043}, ["effectSign"] = {0, 0}, ["effectOrder"] = {0, 1}},
    [30007] = {["id"] = 30007, ["effectGroup"] = {20041, 20044}, ["effectSign"] = {0, 0}, ["effectOrder"] = {0, 1}},
    [30008] = {["id"] = 30008, ["effectGroup"] = {20026, 20045}, ["effectSign"] = {0, 0}, ["effectOrder"] = {0, 1}},
    [30009] = {["id"] = 30009, ["effectGroup"] = {20025, 20046}, ["effectSign"] = {0, 0}, ["effectOrder"] = {0, 1}},
    [30010] = {["id"] = 30010, ["effectGroup"] = {20030, 20047}, ["effectSign"] = {0, 0}, ["effectOrder"] = {0, 1}},
    [30011] = {["id"] = 30011, ["effectGroup"] = {20022, 20048}, ["effectSign"] = {0, 0}, ["effectOrder"] = {0, 1}},
    [30012] = {["id"] = 30012, ["effectGroup"] = {20049, 20003}, ["effectSign"] = {0, 0}, ["effectOrder"] = {1, 1}},
    [30013] = {["id"] = 30013, ["effectGroup"] = {23019, 23018, 23020}, ["effectSign"] = {0, 0, 0}, ["effectOrder"] = {0, 0, 0}},
    [51001] = {["id"] = 51001, ["effectGroup"] = {510011, 510012, 510013}, ["effectSign"] = {0, 0, 0}, ["effectOrder"] = {1, 1, 1}},
    [51009] = {["id"] = 51009, ["effectGroup"] = {510091, 510092}, ["effectSign"] = {0, 0}, ["effectOrder"] = {1, 1}},
    [51017] = {["id"] = 51017, ["effectGroup"] = {510171, 510172, 510173}, ["effectSign"] = {0, 0, 0}, ["effectOrder"] = {0, 0, 0}},
    [52002] = {["id"] = 52002, ["effectGroup"] = {520021, 520022, 520023}, ["effectSign"] = {0, 0, 0}, ["effectOrder"] = {1, 1, 1}},
    [52009] = {["id"] = 52009, ["effectGroup"] = {520091, 520092, 520093, 520094}, ["effectSign"] = {0, 0, 0, 0}, ["effectOrder"] = {1, 1, 1, 1}},
    [52012] = {["id"] = 52012, ["effectGroup"] = {520121, 520122}, ["effectSign"] = {0, 0}, ["effectOrder"] = {1, 1}},
    [52017] = {["id"] = 52017, ["effectGroup"] = {520171, 520172, 520173}, ["effectSign"] = {0, 0}, ["effectOrder"] = {1, 1}},
    [52019] = {["id"] = 52019, ["effectGroup"] = {520191, 520192}, ["effectSign"] = {0, 0}, ["effectOrder"] = {1, 1}},
    [52055] = {["id"] = 52055, ["effectGroup"] = {520551, 520552, 520553, 520554}, ["effectSign"] = {0, 0, 0, 0}, ["effectOrder"] = {1, 1, 1, 1}},
    [52058] = {["id"] = 52058, ["effectGroup"] = {520581, 520582}, ["effectSign"] = {0, 0}, ["effectOrder"] = {1, 1}},
    [53008] = {["id"] = 53008, ["effectGroup"] = {530081, 530082}, ["effectSign"] = {0, 0}, ["effectOrder"] = {1, 1}},
    [53012] = {["id"] = 53012, ["effectGroup"] = {53012, 53012}, ["effectSign"] = {0, 0}, ["effectOrder"] = {1, 1}},
    [53016] = {["id"] = 53016, ["effectGroup"] = {530161, 530162}, ["effectSign"] = {0, 0}, ["effectOrder"] = {1, 1}},
    [53019] = {["id"] = 53019, ["effectGroup"] = {530191, 530194, 530195, 530196, 530192, 530193}, ["effectSign"] = {0, 0, 0, 0, 0, 0}, ["effectOrder"] = {0, 0, 0, 0, 0, 0}},
    [53053] = {["id"] = 53053, ["effectGroup"] = {530531, 530532}, ["effectSign"] = {0, 0}, ["effectOrder"] = {1, 1}},
    [53055] = {["id"] = 53055, ["effectGroup"] = {530551, 530552, 530553}, ["effectSign"] = {0, 0, 0}, ["effectOrder"] = {1, 1, 1}},
    [53056] = {["id"] = 53056, ["effectGroup"] = {530561, 530562, 530563, 530564, 530565}, ["effectSign"] = {0, 0, 0, 0, 0}, ["effectOrder"] = {0, 0, 0, 0, 0}},
    [53064] = {["id"] = 53064, ["effectGroup"] = {530641, 530642, 530643, 530644, 530645, 530646, 530647}, ["effectSign"] = {0, 0, 0, 0, 0, 0, 0}, ["effectOrder"] = {0, 0, 0, 0, 0, 0, 0}},
    [54056] = {["id"] = 54056, ["effectGroup"] = {520131, 520132, 520133, 520134, 520135, 520136, 520137}, ["effectSign"] = {0, 0, 0, 0, 0, 0, 0}, ["effectOrder"] = {0, 0, 0, 0, 0, 0, 0}},
    [54057] = {["id"] = 54057, ["effectGroup"] = {530231, 530232}, ["effectSign"] = {0, 0}, ["effectOrder"] = {0, 0}},
    [54058] = {["id"] = 54058, ["effectGroup"] = {530601, 530602, 530603}, ["effectSign"] = {0, 0, 0}, ["effectOrder"] = {0, 0, 0}},
    [54059] = {["id"] = 54059, ["effectGroup"] = {500111, 500112}, ["effectSign"] = {0, 0}, ["effectOrder"] = {0, 0}},
    [54060] = {["id"] = 54060, ["effectGroup"] = {520111, 520112, 520113}, ["effectSign"] = {0, 0, 0}, ["effectOrder"] = {0, 0, 0}},
    [54061] = {["id"] = 54061, ["effectGroup"] = {510281, 510282}, ["effectSign"] = {0, 0}, ["effectOrder"] = {0, 0}}
}

return data