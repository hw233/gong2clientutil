#!/bin/bash

sleep 1
echo "更新服务器..."
cd /Users/gong2mac/Documents/gong2server/trunk/gong2-login
svn up
echo "编译Login..."
ant
if [ $? -gt 0 ]; then
    echo 'ant 执行错误!'
    exit
fi
sleep 1


echo "更新GMS..."

cd /Users/gong2mac/Documents/gong2-gms/trunk
svn up




echo "编译Gms..."

cd /Users/gong2mac/Documents/gong2-gms/trunk/tools
chmod +x *.sh
./build-test.sh

sleep 1


echo "重启..."
shutdown.sh
startup.sh
