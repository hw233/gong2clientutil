--
-- 客户端公式表.csv
-- 函数编号 = cid
-- 函数名称 = describe
-- 函数命名 = funName
-- 公式 = formula

local data = {
    [99000] = {["cid"] = 99000, ["describe"] = "技能升级需求银两数", ["funName"] = "skillMoney", ["formula"] = "(lv-1+(lv*lv/50))*25"}
}

return data