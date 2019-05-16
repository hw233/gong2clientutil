--
-- 宠物表.csv
-- 编号 = id
-- 宠物ID = PetId
-- 宠物名称 = Name
-- 宠物介绍 = synopsis
-- 所属阶段 = stage
-- 升阶年龄 = age
-- 宠物形象 = image
-- 饱食度上限 = Satiate
-- 饱食度速度 = SatSpeed
-- 健康值上限 = Healthy
-- 健康值速度 = HeaSpeed
-- 心情值上限 = mood
-- 心情值速度 = MoodSpeed

local data = {
    [70001] = {["id"] = 70001, ["PetId"] = 10001, ["Name"] = "牡丹豆豆", ["synopsis"] = "111", ["stage"] = 1, ["age"] = 1, ["image"] = 70001, ["Satiate"] = 100, ["SatSpeed"] = 5, ["Healthy"] = 100, ["HeaSpeed"] = 5, ["mood"] = 100, ["MoodSpeed"] = 5},
    [70002] = {["id"] = 70002, ["PetId"] = 10001, ["Name"] = "牡丹花花", ["synopsis"] = "111", ["stage"] = 2, ["age"] = 10, ["image"] = 70002, ["Satiate"] = 100, ["SatSpeed"] = 5, ["Healthy"] = 100, ["HeaSpeed"] = 5, ["mood"] = 100, ["MoodSpeed"] = 5},
    [70003] = {["id"] = 70003, ["PetId"] = 10002, ["Name"] = "小小幽灵", ["synopsis"] = "222", ["stage"] = 1, ["age"] = 1, ["image"] = 70003, ["Satiate"] = 100, ["SatSpeed"] = 5, ["Healthy"] = 100, ["HeaSpeed"] = 5, ["mood"] = 100, ["MoodSpeed"] = 5},
    [70004] = {["id"] = 70004, ["PetId"] = 10002, ["Name"] = "调皮幽灵", ["synopsis"] = "222", ["stage"] = 2, ["age"] = 10, ["image"] = 70004, ["Satiate"] = 100, ["SatSpeed"] = 5, ["Healthy"] = 100, ["HeaSpeed"] = 5, ["mood"] = 100, ["MoodSpeed"] = 5},
    [70005] = {["id"] = 70005, ["PetId"] = 10003, ["Name"] = "贱贱狐", ["synopsis"] = "111", ["stage"] = 1, ["age"] = 1, ["image"] = 70001, ["Satiate"] = 100, ["SatSpeed"] = 5, ["Healthy"] = 100, ["HeaSpeed"] = 5, ["mood"] = 100, ["MoodSpeed"] = 5},
    [70006] = {["id"] = 70006, ["PetId"] = 10003, ["Name"] = "大耳狐", ["synopsis"] = "111", ["stage"] = 2, ["age"] = 10, ["image"] = 70002, ["Satiate"] = 100, ["SatSpeed"] = 5, ["Healthy"] = 100, ["HeaSpeed"] = 5, ["mood"] = 100, ["MoodSpeed"] = 5},
    [70007] = {["id"] = 70007, ["PetId"] = 10004, ["Name"] = "鸡蛋壳壳", ["synopsis"] = "222", ["stage"] = 1, ["age"] = 1, ["image"] = 70003, ["Satiate"] = 100, ["SatSpeed"] = 5, ["Healthy"] = 100, ["HeaSpeed"] = 5, ["mood"] = 100, ["MoodSpeed"] = 5},
    [70008] = {["id"] = 70008, ["PetId"] = 10004, ["Name"] = "贱贱鸡", ["synopsis"] = "222", ["stage"] = 2, ["age"] = 10, ["image"] = 70004, ["Satiate"] = 100, ["SatSpeed"] = 5, ["Healthy"] = 100, ["HeaSpeed"] = 5, ["mood"] = 100, ["MoodSpeed"] = 5},
    [70009] = {["id"] = 70009, ["PetId"] = 10005, ["Name"] = "凶凶喵", ["synopsis"] = "111", ["stage"] = 1, ["age"] = 1, ["image"] = 70001, ["Satiate"] = 100, ["SatSpeed"] = 5, ["Healthy"] = 100, ["HeaSpeed"] = 5, ["mood"] = 100, ["MoodSpeed"] = 5},
    [70010] = {["id"] = 70010, ["PetId"] = 10005, ["Name"] = "呆呆喵", ["synopsis"] = "111", ["stage"] = 2, ["age"] = 10, ["image"] = 70002, ["Satiate"] = 100, ["SatSpeed"] = 5, ["Healthy"] = 100, ["HeaSpeed"] = 5, ["mood"] = 100, ["MoodSpeed"] = 5},
    [70011] = {["id"] = 70011, ["PetId"] = 10006, ["Name"] = "大头菇", ["synopsis"] = "222", ["stage"] = 1, ["age"] = 1, ["image"] = 70003, ["Satiate"] = 100, ["SatSpeed"] = 5, ["Healthy"] = 100, ["HeaSpeed"] = 5, ["mood"] = 100, ["MoodSpeed"] = 5},
    [70012] = {["id"] = 70012, ["PetId"] = 10006, ["Name"] = "帽子菇", ["synopsis"] = "222", ["stage"] = 2, ["age"] = 10, ["image"] = 70004, ["Satiate"] = 100, ["SatSpeed"] = 5, ["Healthy"] = 100, ["HeaSpeed"] = 5, ["mood"] = 100, ["MoodSpeed"] = 5},
    [70013] = {["id"] = 70013, ["PetId"] = 10007, ["Name"] = "呆天马", ["synopsis"] = "111", ["stage"] = 1, ["age"] = 1, ["image"] = 70001, ["Satiate"] = 100, ["SatSpeed"] = 5, ["Healthy"] = 100, ["HeaSpeed"] = 5, ["mood"] = 100, ["MoodSpeed"] = 5},
    [70014] = {["id"] = 70014, ["PetId"] = 10007, ["Name"] = "小呆马", ["synopsis"] = "111", ["stage"] = 2, ["age"] = 10, ["image"] = 70002, ["Satiate"] = 100, ["SatSpeed"] = 5, ["Healthy"] = 100, ["HeaSpeed"] = 5, ["mood"] = 100, ["MoodSpeed"] = 5},
    [70015] = {["id"] = 70015, ["PetId"] = 10008, ["Name"] = "粉红猪", ["synopsis"] = "222", ["stage"] = 1, ["age"] = 1, ["image"] = 70003, ["Satiate"] = 100, ["SatSpeed"] = 5, ["Healthy"] = 100, ["HeaSpeed"] = 5, ["mood"] = 100, ["MoodSpeed"] = 5},
    [70016] = {["id"] = 70016, ["PetId"] = 10008, ["Name"] = "长草猪", ["synopsis"] = "222", ["stage"] = 2, ["age"] = 10, ["image"] = 70004, ["Satiate"] = 100, ["SatSpeed"] = 5, ["Healthy"] = 100, ["HeaSpeed"] = 5, ["mood"] = 100, ["MoodSpeed"] = 5},
    [70017] = {["id"] = 70017, ["PetId"] = 10009, ["Name"] = "金金鱼", ["synopsis"] = "111", ["stage"] = 1, ["age"] = 1, ["image"] = 70001, ["Satiate"] = 100, ["SatSpeed"] = 5, ["Healthy"] = 100, ["HeaSpeed"] = 5, ["mood"] = 100, ["MoodSpeed"] = 5},
    [70018] = {["id"] = 70018, ["PetId"] = 10009, ["Name"] = "大眼金鱼", ["synopsis"] = "111", ["stage"] = 2, ["age"] = 10, ["image"] = 70002, ["Satiate"] = 100, ["SatSpeed"] = 5, ["Healthy"] = 100, ["HeaSpeed"] = 5, ["mood"] = 100, ["MoodSpeed"] = 5},
    [70019] = {["id"] = 70019, ["PetId"] = 10010, ["Name"] = "残疾竹", ["synopsis"] = "222", ["stage"] = 1, ["age"] = 1, ["image"] = 70003, ["Satiate"] = 100, ["SatSpeed"] = 5, ["Healthy"] = 100, ["HeaSpeed"] = 5, ["mood"] = 100, ["MoodSpeed"] = 5},
    [70020] = {["id"] = 70020, ["PetId"] = 10010, ["Name"] = "愤怒竹", ["synopsis"] = "222", ["stage"] = 2, ["age"] = 10, ["image"] = 70004, ["Satiate"] = 100, ["SatSpeed"] = 5, ["Healthy"] = 100, ["HeaSpeed"] = 5, ["mood"] = 100, ["MoodSpeed"] = 5}
}

return data