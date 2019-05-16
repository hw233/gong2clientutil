--
-- 图鉴武将语音表.csv
-- 武将名称 = id
-- 武将描述 = des
-- 武将ID = roleid
-- 声音1 = voiceone
-- 声音2 = voicetwo
-- 声音3 = voicethree
-- 声音4 = voicefour
-- 声音5 = voicefive
-- 声音6 = voicesix
-- 声音7 = voiceseven
-- 声音8 = voiceeight
-- 声音9 = voicenine
-- 声音10 = voiceten

local data = {
    [10000] = {["id"] = 10000, ["des"] = "姬长生", ["roleid"] = 40000, ["voiceone"] = 10000, ["voicetwo"] = 10000, ["voicethree"] = 10000, ["voicefour"] = 10000, ["voicefive"] = 10000, ["voicesix"] = 10000, ["voiceseven"] = 10000, ["voiceeight"] = 10000, ["voicenine"] = 10000, ["voiceten"] = 10000},
    [10001] = {["id"] = 10001, ["des"] = "长雍君", ["roleid"] = 40001, ["voiceone"] = 10000, ["voicetwo"] = 10000, ["voicethree"] = 10000, ["voicefour"] = 10000, ["voicefive"] = 10000, ["voicesix"] = 10000, ["voiceseven"] = 10000, ["voiceeight"] = 10000, ["voicenine"] = 10000, ["voiceten"] = 10000},
    [10002] = {["id"] = 10002, ["des"] = "闻仲", ["roleid"] = 40002, ["voiceone"] = 10000, ["voicetwo"] = 10000, ["voicethree"] = 10000, ["voicefour"] = 10000, ["voicefive"] = 10000, ["voicesix"] = 10000, ["voiceseven"] = 10000, ["voiceeight"] = 10000, ["voicenine"] = 10000, ["voiceten"] = 10000},
    [10003] = {["id"] = 10003, ["des"] = "李耳", ["roleid"] = 40003, ["voiceone"] = 10000, ["voicetwo"] = 10000, ["voicethree"] = 10000, ["voicefour"] = 10000, ["voicefive"] = 10000, ["voicesix"] = 10000, ["voiceseven"] = 10000, ["voiceeight"] = 10000, ["voicenine"] = 10000, ["voiceten"] = 10000},
    [10004] = {["id"] = 10004, ["des"] = "李白", ["roleid"] = 40004, ["voiceone"] = 10000, ["voicetwo"] = 10000, ["voicethree"] = 10000, ["voicefour"] = 10000, ["voicefive"] = 10000, ["voicesix"] = 10000, ["voiceseven"] = 10000, ["voiceeight"] = 10000, ["voicenine"] = 10000, ["voiceten"] = 10000},
    [10005] = {["id"] = 10005, ["des"] = "卡萨", ["roleid"] = 40005, ["voiceone"] = 10000, ["voicetwo"] = 10000, ["voicethree"] = 10000, ["voicefour"] = 10000, ["voicefive"] = 10000, ["voicesix"] = 10000, ["voiceseven"] = 10000, ["voiceeight"] = 10000, ["voicenine"] = 10000, ["voiceten"] = 10000},
    [10006] = {["id"] = 10006, ["des"] = "姬重华", ["roleid"] = 40006, ["voiceone"] = 10000, ["voicetwo"] = 10000, ["voicethree"] = 10000, ["voicefour"] = 10000, ["voicefive"] = 10000, ["voicesix"] = 10000, ["voiceseven"] = 10000, ["voiceeight"] = 10000, ["voicenine"] = 10000, ["voiceten"] = 10000},
    [10007] = {["id"] = 10007, ["des"] = "安倍晴明", ["roleid"] = 40007, ["voiceone"] = 10000, ["voicetwo"] = 10000, ["voicethree"] = 10000, ["voicefour"] = 10000, ["voicefive"] = 10000, ["voicesix"] = 10000, ["voiceseven"] = 10000, ["voiceeight"] = 10000, ["voicenine"] = 10000, ["voiceten"] = 10000},
    [10008] = {["id"] = 10008, ["des"] = "承影", ["roleid"] = 40008, ["voiceone"] = 10000, ["voicetwo"] = 10000, ["voicethree"] = 10000, ["voicefour"] = 10000, ["voicefive"] = 10000, ["voicesix"] = 10000, ["voiceseven"] = 10000, ["voiceeight"] = 10000, ["voicenine"] = 10000, ["voiceten"] = 10000},
    [10009] = {["id"] = 10009, ["des"] = "霍曼曼", ["roleid"] = 40009, ["voiceone"] = 10000, ["voicetwo"] = 10000, ["voicethree"] = 10000, ["voicefour"] = 10000, ["voicefive"] = 10000, ["voicesix"] = 10000, ["voiceseven"] = 10000, ["voiceeight"] = 10000, ["voicenine"] = 10000, ["voiceten"] = 10000},
    [10010] = {["id"] = 10010, ["des"] = "公子尘来", ["roleid"] = 40010, ["voiceone"] = 10000, ["voicetwo"] = 10000, ["voicethree"] = 10000, ["voicefour"] = 10000, ["voicefive"] = 10000, ["voicesix"] = 10000, ["voiceseven"] = 10000, ["voiceeight"] = 10000, ["voicenine"] = 10000, ["voiceten"] = 10000},
    [10011] = {["id"] = 10011, ["des"] = "南歌", ["roleid"] = 40011, ["voiceone"] = 10000, ["voicetwo"] = 10000, ["voicethree"] = 10000, ["voicefour"] = 10000, ["voicefive"] = 10000, ["voicesix"] = 10000, ["voiceseven"] = 10000, ["voiceeight"] = 10000, ["voicenine"] = 10000, ["voiceten"] = 10000},
    [10012] = {["id"] = 10012, ["des"] = "丽淑妃", ["roleid"] = 40012, ["voiceone"] = 10000, ["voicetwo"] = 10000, ["voicethree"] = 10000, ["voicefour"] = 10000, ["voicefive"] = 10000, ["voicesix"] = 10000, ["voiceseven"] = 10000, ["voiceeight"] = 10000, ["voicenine"] = 10000, ["voiceten"] = 10000},
    [10013] = {["id"] = 10013, ["des"] = "胡不归", ["roleid"] = 40013, ["voiceone"] = 10000, ["voicetwo"] = 10000, ["voicethree"] = 10000, ["voicefour"] = 10000, ["voicefive"] = 10000, ["voicesix"] = 10000, ["voiceseven"] = 10000, ["voiceeight"] = 10000, ["voicenine"] = 10000, ["voiceten"] = 10000},
    [10014] = {["id"] = 10014, ["des"] = "武照", ["roleid"] = 40014, ["voiceone"] = 10000, ["voicetwo"] = 10000, ["voicethree"] = 10000, ["voicefour"] = 10000, ["voicefive"] = 10000, ["voicesix"] = 10000, ["voiceseven"] = 10000, ["voiceeight"] = 10000, ["voicenine"] = 10000, ["voiceten"] = 10000},
    [10015] = {["id"] = 10015, ["des"] = "荀德妃", ["roleid"] = 40015, ["voiceone"] = 10000, ["voicetwo"] = 10000, ["voicethree"] = 10000, ["voicefour"] = 10000, ["voicefive"] = 10000, ["voicesix"] = 10000, ["voiceseven"] = 10000, ["voiceeight"] = 10000, ["voicenine"] = 10000, ["voiceten"] = 10000},
    [10016] = {["id"] = 10016, ["des"] = "逍遥", ["roleid"] = 40016, ["voiceone"] = 10000, ["voicetwo"] = 10000, ["voicethree"] = 10000, ["voicefour"] = 10000, ["voicefive"] = 10000, ["voicesix"] = 10000, ["voiceseven"] = 10000, ["voiceeight"] = 10000, ["voicenine"] = 10000, ["voiceten"] = 10000},
    [10017] = {["id"] = 10017, ["des"] = "鱼玄机", ["roleid"] = 40017, ["voiceone"] = 10000, ["voicetwo"] = 10000, ["voicethree"] = 10000, ["voicefour"] = 10000, ["voicefive"] = 10000, ["voicesix"] = 10000, ["voiceseven"] = 10000, ["voiceeight"] = 10000, ["voicenine"] = 10000, ["voiceten"] = 10000},
    [10018] = {["id"] = 10018, ["des"] = "合德", ["roleid"] = 40018, ["voiceone"] = 10000, ["voicetwo"] = 10000, ["voicethree"] = 10000, ["voicefour"] = 10000, ["voicefive"] = 10000, ["voicesix"] = 10000, ["voiceseven"] = 10000, ["voiceeight"] = 10000, ["voicenine"] = 10000, ["voiceten"] = 10000},
    [10019] = {["id"] = 10019, ["des"] = "飞燕", ["roleid"] = 40019, ["voiceone"] = 10000, ["voicetwo"] = 10000, ["voicethree"] = 10000, ["voicefour"] = 10000, ["voicefive"] = 10000, ["voicesix"] = 10000, ["voiceseven"] = 10000, ["voiceeight"] = 10000, ["voicenine"] = 10000, ["voiceten"] = 10000},
    [10020] = {["id"] = 10020, ["des"] = "洗砚", ["roleid"] = 40020, ["voiceone"] = 10000, ["voicetwo"] = 10000, ["voicethree"] = 10000, ["voicefour"] = 10000, ["voicefive"] = 10000, ["voicesix"] = 10000, ["voiceseven"] = 10000, ["voiceeight"] = 10000, ["voicenine"] = 10000, ["voiceten"] = 10000},
    [10021] = {["id"] = 10021, ["des"] = "青湖", ["roleid"] = 40021, ["voiceone"] = 10000, ["voicetwo"] = 10000, ["voicethree"] = 10000, ["voicefour"] = 10000, ["voicefive"] = 10000, ["voicesix"] = 10000, ["voiceseven"] = 10000, ["voiceeight"] = 10000, ["voicenine"] = 10000, ["voiceten"] = 10000},
    [10022] = {["id"] = 10022, ["des"] = "钟无艳", ["roleid"] = 40022, ["voiceone"] = 10000, ["voicetwo"] = 10000, ["voicethree"] = 10000, ["voicefour"] = 10000, ["voicefive"] = 10000, ["voicesix"] = 10000, ["voiceseven"] = 10000, ["voiceeight"] = 10000, ["voicenine"] = 10000, ["voiceten"] = 10000},
    [10023] = {["id"] = 10023, ["des"] = "范蠡", ["roleid"] = 40023, ["voiceone"] = 10000, ["voicetwo"] = 10000, ["voicethree"] = 10000, ["voicefour"] = 10000, ["voicefive"] = 10000, ["voicesix"] = 10000, ["voiceseven"] = 10000, ["voiceeight"] = 10000, ["voicenine"] = 10000, ["voiceten"] = 10000},
    [10024] = {["id"] = 10024, ["des"] = "姬燕来", ["roleid"] = 40024, ["voiceone"] = 10000, ["voicetwo"] = 10000, ["voicethree"] = 10000, ["voicefour"] = 10000, ["voicefive"] = 10000, ["voicesix"] = 10000, ["voiceseven"] = 10000, ["voiceeight"] = 10000, ["voicenine"] = 10000, ["voiceten"] = 10000},
    [10025] = {["id"] = 10025, ["des"] = "孙思邈", ["roleid"] = 40025, ["voiceone"] = 10000, ["voicetwo"] = 10000, ["voicethree"] = 10000, ["voicefour"] = 10000, ["voicefive"] = 10000, ["voicesix"] = 10000, ["voiceseven"] = 10000, ["voiceeight"] = 10000, ["voicenine"] = 10000, ["voiceten"] = 10000},
    [10026] = {["id"] = 10026, ["des"] = "杜浪", ["roleid"] = 40026, ["voiceone"] = 10000, ["voicetwo"] = 10000, ["voicethree"] = 10000, ["voicefour"] = 10000, ["voicefive"] = 10000, ["voicesix"] = 10000, ["voiceseven"] = 10000, ["voiceeight"] = 10000, ["voicenine"] = 10000, ["voiceten"] = 10000},
    [10027] = {["id"] = 10027, ["des"] = "柳如是", ["roleid"] = 40027, ["voiceone"] = 10000, ["voicetwo"] = 10000, ["voicethree"] = 10000, ["voicefour"] = 10000, ["voicefive"] = 10000, ["voicesix"] = 10000, ["voiceseven"] = 10000, ["voiceeight"] = 10000, ["voicenine"] = 10000, ["voiceten"] = 10000},
    [10028] = {["id"] = 10028, ["des"] = "张仪", ["roleid"] = 40028, ["voiceone"] = 10000, ["voicetwo"] = 10000, ["voicethree"] = 10000, ["voicefour"] = 10000, ["voicefive"] = 10000, ["voicesix"] = 10000, ["voiceseven"] = 10000, ["voiceeight"] = 10000, ["voicenine"] = 10000, ["voiceten"] = 10000},
    [10029] = {["id"] = 10029, ["des"] = "燕青", ["roleid"] = 40029, ["voiceone"] = 10000, ["voicetwo"] = 10000, ["voicethree"] = 10000, ["voicefour"] = 10000, ["voicefive"] = 10000, ["voicesix"] = 10000, ["voiceseven"] = 10000, ["voiceeight"] = 10000, ["voicenine"] = 10000, ["voiceten"] = 10000},
    [10030] = {["id"] = 10030, ["des"] = "要离", ["roleid"] = 40030, ["voiceone"] = 10000, ["voicetwo"] = 10000, ["voicethree"] = 10000, ["voicefour"] = 10000, ["voicefive"] = 10000, ["voicesix"] = 10000, ["voiceseven"] = 10000, ["voiceeight"] = 10000, ["voicenine"] = 10000, ["voiceten"] = 10000},
    [10031] = {["id"] = 10031, ["des"] = "荆轲", ["roleid"] = 40031, ["voiceone"] = 10000, ["voicetwo"] = 10000, ["voicethree"] = 10000, ["voicefour"] = 10000, ["voicefive"] = 10000, ["voicesix"] = 10000, ["voiceseven"] = 10000, ["voiceeight"] = 10000, ["voicenine"] = 10000, ["voiceten"] = 10000},
    [10032] = {["id"] = 10032, ["des"] = "南鹤", ["roleid"] = 40032, ["voiceone"] = 10000, ["voicetwo"] = 10000, ["voicethree"] = 10000, ["voicefour"] = 10000, ["voicefive"] = 10000, ["voicesix"] = 10000, ["voiceseven"] = 10000, ["voiceeight"] = 10000, ["voicenine"] = 10000, ["voiceten"] = 10000},
    [10033] = {["id"] = 10033, ["des"] = "狄青", ["roleid"] = 40033, ["voiceone"] = 10000, ["voicetwo"] = 10000, ["voicethree"] = 10000, ["voicefour"] = 10000, ["voicefive"] = 10000, ["voicesix"] = 10000, ["voiceseven"] = 10000, ["voiceeight"] = 10000, ["voicenine"] = 10000, ["voiceten"] = 10000},
    [10034] = {["id"] = 10034, ["des"] = "公孙大娘", ["roleid"] = 40034, ["voiceone"] = 10000, ["voicetwo"] = 10000, ["voicethree"] = 10000, ["voicefour"] = 10000, ["voicefive"] = 10000, ["voicesix"] = 10000, ["voiceseven"] = 10000, ["voiceeight"] = 10000, ["voicenine"] = 10000, ["voiceten"] = 10000},
    [10035] = {["id"] = 10035, ["des"] = "张江陵", ["roleid"] = 40035, ["voiceone"] = 10000, ["voicetwo"] = 10000, ["voicethree"] = 10000, ["voicefour"] = 10000, ["voicefive"] = 10000, ["voicesix"] = 10000, ["voiceseven"] = 10000, ["voiceeight"] = 10000, ["voicenine"] = 10000, ["voiceten"] = 10000},
    [10036] = {["id"] = 10036, ["des"] = "杜甫", ["roleid"] = 40036, ["voiceone"] = 10000, ["voicetwo"] = 10000, ["voicethree"] = 10000, ["voicefour"] = 10000, ["voicefive"] = 10000, ["voicesix"] = 10000, ["voiceseven"] = 10000, ["voiceeight"] = 10000, ["voicenine"] = 10000, ["voiceten"] = 10000}
}

return data