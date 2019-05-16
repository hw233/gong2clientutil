--
-- 场景表.csv
-- 场景编号 = id
-- 章节 = chaptername
-- 场景名称 = name
-- 场景等级 = lv
-- 场景类型 = kind
-- 星数条件 = starCon
-- 满星奖励 = dropID
-- 满星奖励掉落次数 = dropNum
-- 场景图片 = picture
-- 小图标 = icon
-- 战斗背景 = combatBackground
-- 屏数 = pictureNum
-- 场景位置 = location
-- 是否反转 = reversal
-- 音乐文件 = music
-- 剧情介绍 = story

local data = {
    [10000] = {["id"] = 10000, ["chaptername"] = "第一章", ["name"] = "南府老宅", ["lv"] = 1, ["kind"] = 1, ["starCon"] = {6, 10, 15}, ["dropID"] = {803, 804, 834}, ["dropNum"] = {1, 1, 1}, ["picture"] = 1001, ["icon"] = 2000, ["combatBackground"] = 1004, ["pictureNum"] = 2, ["location"] = 1, ["reversal"] = 0, ["music"] = 9005},
    [10001] = {["id"] = 10001, ["chaptername"] = "第二章", ["name"] = "枫山猎场", ["lv"] = 5, ["kind"] = 1, ["starCon"] = {7, 14, 21}, ["dropID"] = {803, 804, 834}, ["dropNum"] = {1, 1, 1}, ["picture"] = 1002, ["icon"] = 2001, ["combatBackground"] = 1004, ["pictureNum"] = 2, ["location"] = 2, ["reversal"] = 1, ["music"] = 9005},
    [10002] = {["id"] = 10002, ["chaptername"] = "第三章", ["name"] = "来去寺", ["lv"] = 11, ["kind"] = 1, ["starCon"] = {8, 16, 24}, ["dropID"] = {803, 804, 835}, ["dropNum"] = {1, 1, 1}, ["picture"] = 1003, ["icon"] = 2002, ["combatBackground"] = 1004, ["pictureNum"] = 2, ["location"] = 3, ["reversal"] = 0, ["music"] = 9005},
    [10003] = {["id"] = 10003, ["chaptername"] = "第四章", ["name"] = "长风别院", ["lv"] = 22, ["kind"] = 1, ["starCon"] = {10, 20, 30}, ["dropID"] = {803, 804, 836}, ["dropNum"] = {1, 1, 1}, ["picture"] = 1004, ["icon"] = 2003, ["combatBackground"] = 1004, ["pictureNum"] = 2, ["location"] = 4, ["reversal"] = 0, ["music"] = 9005},
    [10004] = {["id"] = 10004, ["chaptername"] = "第五章", ["name"] = "集贤馆", ["lv"] = 25, ["kind"] = 1, ["starCon"] = {10, 20, 30}, ["dropID"] = {803, 804, 835}, ["dropNum"] = {1, 1, 1}, ["picture"] = 1005, ["icon"] = 2004, ["combatBackground"] = 1004, ["pictureNum"] = 2, ["location"] = 5, ["reversal"] = 0, ["music"] = 9005},
    [10005] = {["id"] = 10005, ["chaptername"] = "第六章", ["name"] = "临江楼", ["lv"] = 30, ["kind"] = 1, ["starCon"] = {10, 20, 30}, ["dropID"] = {803, 804, 836}, ["dropNum"] = {1, 1, 1}, ["picture"] = 1006, ["icon"] = 2005, ["combatBackground"] = 1004, ["pictureNum"] = 2, ["location"] = 6, ["reversal"] = 0, ["music"] = 9005},
    [10006] = {["id"] = 10006, ["chaptername"] = "第七章", ["name"] = "姑苏城", ["lv"] = 40, ["kind"] = 1, ["starCon"] = {10, 20, 30}, ["dropID"] = {803, 804, 805}, ["dropNum"] = {1, 1, 1}, ["picture"] = 1007, ["icon"] = 2006, ["combatBackground"] = 1004, ["pictureNum"] = 2, ["location"] = 7, ["reversal"] = 0, ["music"] = 9005},
    [10007] = {["id"] = 10007, ["chaptername"] = "第八章", ["name"] = "虎丘塔", ["lv"] = 50, ["kind"] = 1, ["starCon"] = {10, 20, 30}, ["dropID"] = {803, 804, 805}, ["dropNum"] = {1, 1, 1}, ["picture"] = 1002, ["icon"] = 2007, ["combatBackground"] = 1004, ["pictureNum"] = 2, ["location"] = 8, ["reversal"] = 0, ["music"] = 9005},
    [10008] = {["id"] = 10008, ["chaptername"] = "第九章", ["name"] = "寒山寺", ["lv"] = 60, ["kind"] = 1, ["starCon"] = {10, 20, 30}, ["dropID"] = {803, 804, 805}, ["dropNum"] = {1, 1, 1}, ["picture"] = 1003, ["icon"] = 2008, ["combatBackground"] = 1004, ["pictureNum"] = 2, ["location"] = 9, ["reversal"] = 0, ["music"] = 9005},
    [10009] = {["id"] = 10009, ["chaptername"] = "第十章", ["name"] = "御花园", ["lv"] = 70, ["kind"] = 1, ["starCon"] = {10, 20, 30}, ["dropID"] = {803, 804, 805}, ["dropNum"] = {1, 1, 1}, ["picture"] = 1004, ["icon"] = 2009, ["combatBackground"] = 1004, ["pictureNum"] = 2, ["location"] = 10, ["reversal"] = 0, ["music"] = 9005},
    [10010] = {["id"] = 10010, ["chaptername"] = "第十一章", ["name"] = "含元殿", ["lv"] = 80, ["kind"] = 1, ["starCon"] = {10, 20, 30}, ["dropID"] = {803, 804, 805}, ["dropNum"] = {1, 1, 1}, ["picture"] = 1011, ["icon"] = 2010, ["combatBackground"] = 1004, ["pictureNum"] = 2, ["location"] = 11, ["reversal"] = 0, ["music"] = 9005},
    [10011] = {["id"] = 10011, ["chaptername"] = "第十二章", ["name"] = "紫宸殿", ["lv"] = 90, ["kind"] = 1, ["starCon"] = {10, 20, 30}, ["dropID"] = {803, 804, 805}, ["dropNum"] = {1, 1, 1}, ["picture"] = 1012, ["icon"] = 2011, ["combatBackground"] = 1004, ["pictureNum"] = 2, ["location"] = 12, ["reversal"] = 0, ["music"] = 9005},
    [20000] = {["id"] = 20000, ["chaptername"] = "第一章", ["name"] = "南府老宅", ["lv"] = 1, ["kind"] = 2, ["starCon"] = {6, 12, 18}, ["dropID"] = {803, 804, 834}, ["dropNum"] = {1, 1, 1}, ["picture"] = 1001, ["icon"] = 2000, ["combatBackground"] = 1004, ["pictureNum"] = 2, ["location"] = 1, ["reversal"] = 0, ["music"] = 9005},
    [20001] = {["id"] = 20001, ["chaptername"] = "第二章", ["name"] = "枫山猎场", ["lv"] = 5, ["kind"] = 2, ["starCon"] = {7, 14, 21}, ["dropID"] = {803, 804, 834}, ["dropNum"] = {1, 1, 1}, ["picture"] = 1002, ["icon"] = 2001, ["combatBackground"] = 1004, ["pictureNum"] = 2, ["location"] = 2, ["reversal"] = 0, ["music"] = 9005},
    [20002] = {["id"] = 20002, ["chaptername"] = "第三章", ["name"] = "来去庵", ["lv"] = 11, ["kind"] = 2, ["starCon"] = {8, 16, 24}, ["dropID"] = {803, 804, 835}, ["dropNum"] = {1, 1, 1}, ["picture"] = 1003, ["icon"] = 2002, ["combatBackground"] = 1004, ["pictureNum"] = 2, ["location"] = 3, ["reversal"] = 0, ["music"] = 9005},
    [20003] = {["id"] = 20003, ["chaptername"] = "第四章", ["name"] = "太子别院", ["lv"] = 22, ["kind"] = 2, ["starCon"] = {10, 20, 30}, ["dropID"] = {803, 804, 836}, ["dropNum"] = {1, 1, 1}, ["picture"] = 1004, ["icon"] = 2003, ["combatBackground"] = 1004, ["pictureNum"] = 2, ["location"] = 4, ["reversal"] = 0, ["music"] = 9005},
    [20004] = {["id"] = 20004, ["chaptername"] = "第五章", ["name"] = "集贤馆", ["lv"] = 25, ["kind"] = 2, ["starCon"] = {10, 20, 30}, ["dropID"] = {803, 804, 835}, ["dropNum"] = {1, 1, 1}, ["picture"] = 1005, ["icon"] = 2004, ["combatBackground"] = 1004, ["pictureNum"] = 2, ["location"] = 5, ["reversal"] = 0, ["music"] = 9005},
    [20005] = {["id"] = 20005, ["chaptername"] = "第六章", ["name"] = "临江楼", ["lv"] = 30, ["kind"] = 2, ["starCon"] = {10, 20, 30}, ["dropID"] = {803, 804, 836}, ["dropNum"] = {1, 1, 1}, ["picture"] = 1006, ["icon"] = 2005, ["combatBackground"] = 1004, ["pictureNum"] = 2, ["location"] = 6, ["reversal"] = 0, ["music"] = 9005},
    [20006] = {["id"] = 20006, ["chaptername"] = "第七章", ["name"] = "姑苏城", ["lv"] = 40, ["kind"] = 2, ["starCon"] = {10, 20, 30}, ["dropID"] = {803, 804, 805}, ["dropNum"] = {1, 1, 1}, ["picture"] = 1007, ["icon"] = 2006, ["combatBackground"] = 1004, ["pictureNum"] = 2, ["location"] = 7, ["reversal"] = 0, ["music"] = 9005},
    [20007] = {["id"] = 20007, ["chaptername"] = "第八章", ["name"] = "虎丘塔", ["lv"] = 50, ["kind"] = 2, ["starCon"] = {10, 20, 30}, ["dropID"] = {803, 804, 805}, ["dropNum"] = {1, 1, 1}, ["picture"] = 1008, ["icon"] = 2007, ["combatBackground"] = 1004, ["pictureNum"] = 2, ["location"] = 8, ["reversal"] = 0, ["music"] = 9005},
    [20008] = {["id"] = 20008, ["chaptername"] = "第九章", ["name"] = "寒山寺", ["lv"] = 60, ["kind"] = 2, ["starCon"] = {10, 20, 30}, ["dropID"] = {803, 804, 805}, ["dropNum"] = {1, 1, 1}, ["picture"] = 1009, ["icon"] = 2008, ["combatBackground"] = 1004, ["pictureNum"] = 2, ["location"] = 9, ["reversal"] = 0, ["music"] = 9005},
    [20009] = {["id"] = 20009, ["chaptername"] = "第十章", ["name"] = "御花园", ["lv"] = 70, ["kind"] = 2, ["starCon"] = {10, 20, 30}, ["dropID"] = {803, 804, 805}, ["dropNum"] = {1, 1, 1}, ["picture"] = 1010, ["icon"] = 2009, ["combatBackground"] = 1004, ["pictureNum"] = 2, ["location"] = 10, ["reversal"] = 0, ["music"] = 9005},
    [20010] = {["id"] = 20010, ["chaptername"] = "第十一章", ["name"] = "含元殿", ["lv"] = 80, ["kind"] = 2, ["starCon"] = {10, 20, 30}, ["dropID"] = {803, 804, 805}, ["dropNum"] = {1, 1, 1}, ["picture"] = 1011, ["icon"] = 2010, ["combatBackground"] = 1004, ["pictureNum"] = 2, ["location"] = 11, ["reversal"] = 0, ["music"] = 9005},
    [20011] = {["id"] = 20011, ["chaptername"] = "第十二章", ["name"] = "紫宸殿", ["lv"] = 90, ["kind"] = 2, ["starCon"] = {10, 20, 30}, ["dropID"] = {803, 804, 805}, ["dropNum"] = {1, 1, 1}, ["picture"] = 1012, ["icon"] = 2011, ["combatBackground"] = 1004, ["pictureNum"] = 2, ["location"] = 12, ["reversal"] = 0, ["music"] = 9005}
}

return data