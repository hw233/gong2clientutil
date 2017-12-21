#!/bin/bash

sleep 1
echo "更新服务器..."
cd /Users/gong2mac/Documents/gong2server/trunk/gong2-game
svn up
echo "编译Gas..."
ant
if [ $? -gt 0 ]; then
    echo 'ant 执行错误!'
    exit
fi
sleep 1
cd /gamejelly_gong2/deploy_gong2_game
chmod +x *.sh
echo "关闭gas..."
./run-gas.sh stop
sleep 10
echo "关闭dbs..."
./run-dbs.sh stop
sleep 10
echo "开启dbs..."
./run-dbs.sh start
sleep 10
echo "开启gas..."
./run-gas.sh start
sleep 10
echo "重启完毕!"

echo "编译Global..."
cd /Users/gong2mac/Documents/gong2server/trunk/gong2-game/tools
chmod +x *.sh
./build-global.sh
sleep 1
echo "重启Global..."
cd /gamejelly_gong2/deploy_global
chmod +x *.sh
echo "关闭Global gas..."
./run-global-app.sh stop
sleep 3
echo "关闭Global dbs..."
./run-global-dbs.sh stop
sleep 3
echo "开启Global dbs..."
./run-global-dbs.sh start
sleep 3
echo "开启Global gas..."
./run-global-app.sh start
sleep 3
echo "重启Global完毕!"