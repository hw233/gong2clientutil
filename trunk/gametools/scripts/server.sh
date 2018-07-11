#!/bin/bash

export JAVA_HOME=/usr/java/jdk1.8.0_152
export JRE_HOME=$JAVA_HOME/jre
export CLASSPATH=.:$JAVA_HOME/lib:$JRE_HOME/lib:$CLASSPATH
export PATH=$JAVA_HOME/bin:$JRE_HOME/bin:$PATH
java -version

sleep 1
echo "更新服务器..."
cd /home/sa/gong2server/trunk/gong2-game
svn up
echo "编译Gas..."

ant
if [ $? -gt 0 ]; then
    echo 'ant 执行错误!'
    exit
fi

sleep 1
cd /gamejelly_gong2/test/deploy_gong2_game_test

chmod +x *.sh
echo "关闭gas..."
./run-linux-gas.sh stop
sleep 10
echo "关闭dbs..."
./run-linux-dbs.sh stop
sleep 10
echo "开启dbs..."
./run-linux-dbs.sh start
sleep 10
echo "开启gas..."
./run-linux-gas.sh start
sleep 10
echo "game重启完毕!"


echo "编译Global..."
cd /home/sa/gong2server/trunk/gong2-game/tools
chmod +x *.sh
./build-global.sh
sleep 1


sleep 1
echo "重启Global..."
cd /gamejelly_gong2/test/deploy_gong2_global_test
chmod +x *.sh
echo "关闭Global gas..."
./global-linux-app.sh stop
sleep 3
echo "关闭Global dbs..."
./global-linux-dbs.sh stop
sleep 3
echo "开启Global dbs..."
./global-linux-dbs.sh start
sleep 3
echo "开启Global gas..."
./global-linux-app.sh start
sleep 3
echo "重启Global完毕!"
