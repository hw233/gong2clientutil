#!/bin/bash

export JAVA_HOME=/usr/java/jdk1.8.0_152
export JRE_HOME=$JAVA_HOME/jre
export CLASSPATH=.:$JAVA_HOME/lib:$JRE_HOME/lib:$CLASSPATH
export PATH=$JAVA_HOME/bin:$JRE_HOME/bin:$PATH
java -version

echo "更新安卓测试服务器..."
cd /home/sa/gong2server/trunk/gong2-game
svn up


echo "编译game..."

cd /home/sa/gong2server/trunk/gong2-game/tools
chmod +x *.sh
./build-release.sh

sleep 1

echo "更新发布安卓测试..."


rsync -az --exclude-from="/root/exclude.list" /gamejelly_gong2/repo-server/deploy_gong2_game_release/ rsync://106.15.225.73:8173/gong2code/deploy_gong2_game_release/ ;
echo "game更新完毕！";
rsync -az --exclude-from="/root/exclude.list" /gamejelly_gong2/repo-server/deploy_gong2_global_release/ rsync://106.15.225.73:8173/gong2code/deploy_gong2_global_release/ ;
echo "game更新完毕！";

#rsync -az --delete --exclude-from="/root/exclude.list" /gamejelly_gong2/repo-server/deploy_gong2_global_release/ rsync://106.15.225.73:8173/gong2code/deploy_gong2_global_release/ ;
#echo "game更新完毕！";


echo "正在重启..."
ssh root@106.15.225.73 "/home/sa/deploy_gong2_global_release/global-linux.sh stop;/home/sa/deploy_gong2_game_release/run-linux.sh stop;/home/sa/deploy_gong2_global_release/global-linux.sh start;/home/sa/deploy_gong2_game_release/run-linux.sh start;"
