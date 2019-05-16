--
-- 派系权贵表.csv
-- 权贵编号 = id
-- 名称 = name
-- 立绘资源 = picture
-- 头像资源 = head
-- 己方派系BUFF = factionsbuff
-- 己方阵营BUFF = campbuff
-- 敌对权贵 = hostile
-- 建筑解锁等级 = limit
-- 初始势力 = initial
-- 初始势力的友好度 = friend

local data = {
    [1] = {["id"] = 1, ["name"] = "白凤", ["picture"] = 1000, ["head"] = "1000", ["factionsbuff"] = {2001}, ["campbuff"] = {2017}, ["hostile"] = {5}, ["limit"] = 1, ["initial"] = 1, ["friend"] = 20000},
    [2] = {["id"] = 2, ["name"] = "平山丘", ["picture"] = 1001, ["head"] = "1001", ["factionsbuff"] = {2002}, ["campbuff"] = {2018}, ["hostile"] = {6}, ["limit"] = 1, ["initial"] = 1, ["friend"] = 20000},
    [3] = {["id"] = 3, ["name"] = "杏林生", ["picture"] = 40014, ["head"] = "40014", ["factionsbuff"] = {2003}, ["campbuff"] = {2019}, ["hostile"] = {7}, ["limit"] = 1, ["initial"] = 2, ["friend"] = 20000},
    [4] = {["id"] = 4, ["name"] = "青松道人", ["picture"] = 40004, ["head"] = "40004", ["factionsbuff"] = {2004}, ["campbuff"] = {2020}, ["hostile"] = {8}, ["limit"] = 1, ["initial"] = 2, ["friend"] = 20000},
    [5] = {["id"] = 5, ["name"] = "白芷散人", ["picture"] = 40008, ["head"] = "40008", ["factionsbuff"] = {2005}, ["campbuff"] = {2021}, ["hostile"] = {1}, ["limit"] = 2, ["initial"] = 3, ["friend"] = 20000},
    [6] = {["id"] = 6, ["name"] = "长风君", ["picture"] = 40001, ["head"] = "40001", ["factionsbuff"] = {2006}, ["campbuff"] = {2022}, ["hostile"] = {2}, ["limit"] = 2, ["initial"] = 3, ["friend"] = 20000},
    [7] = {["id"] = 7, ["name"] = "惊玄君", ["picture"] = 40004, ["head"] = "40004", ["factionsbuff"] = {2007}, ["campbuff"] = {2023}, ["hostile"] = {3}, ["limit"] = 3, ["initial"] = 4, ["friend"] = 20000},
    [8] = {["id"] = 8, ["name"] = "松柏老人", ["picture"] = 40010, ["head"] = "40010", ["factionsbuff"] = {2008}, ["campbuff"] = {2024}, ["hostile"] = {4}, ["limit"] = 3, ["initial"] = 4, ["friend"] = 20000},
    [9] = {["id"] = 9, ["name"] = "青竹客", ["picture"] = 1000, ["head"] = "1000", ["factionsbuff"] = {2009}, ["campbuff"] = {2025}, ["hostile"] = {13}, ["limit"] = 3, ["initial"] = 5, ["friend"] = 20000},
    [10] = {["id"] = 10, ["name"] = "凌波仙子", ["picture"] = 40017, ["head"] = "40017", ["factionsbuff"] = {2010}, ["campbuff"] = {2026}, ["hostile"] = {14}, ["limit"] = 4, ["initial"] = 5, ["friend"] = 20000},
    [11] = {["id"] = 11, ["name"] = "蓬莱山主", ["picture"] = 40023, ["head"] = "40023", ["factionsbuff"] = {2011}, ["campbuff"] = {2027}, ["hostile"] = {15}, ["limit"] = 4, ["initial"] = 6, ["friend"] = 20000},
    [12] = {["id"] = 12, ["name"] = "血罗刹", ["picture"] = 40004, ["head"] = "40004", ["factionsbuff"] = {2012}, ["campbuff"] = {2028}, ["hostile"] = {16}, ["limit"] = 4, ["initial"] = 6, ["friend"] = 20000},
    [13] = {["id"] = 13, ["name"] = "璎珞女", ["picture"] = 40008, ["head"] = "40008", ["factionsbuff"] = {2013}, ["campbuff"] = {2029}, ["hostile"] = {9}, ["limit"] = 5, ["initial"] = 7, ["friend"] = 20000},
    [14] = {["id"] = 14, ["name"] = "萍水剑客", ["picture"] = 40009, ["head"] = "40009", ["factionsbuff"] = {2014}, ["campbuff"] = {2030}, ["hostile"] = {10}, ["limit"] = 5, ["initial"] = 7, ["friend"] = 20000},
    [15] = {["id"] = 15, ["name"] = "丘道人", ["picture"] = 40009, ["head"] = "40009", ["factionsbuff"] = {2015}, ["campbuff"] = {2031}, ["hostile"] = {11}, ["limit"] = 6, ["initial"] = 8, ["friend"] = 20000},
    [16] = {["id"] = 16, ["name"] = "落雁客", ["picture"] = 40016, ["head"] = "40016", ["factionsbuff"] = {2016}, ["campbuff"] = {2032}, ["hostile"] = {12}, ["limit"] = 6, ["initial"] = 8, ["friend"] = 20000}
}

return data