#!/bin/bash

export JAVA_HOME=/usr/java/jdk1.8.0_152
export JRE_HOME=$JAVA_HOME/jre
export CLASSPATH=.:$JAVA_HOME/lib:$JRE_HOME/lib:$CLASSPATH
export PATH=$JAVA_HOME/bin:$JRE_HOME/bin:$PATH
java -version



sleep 1
echo "更新服务器..."
cd /home/sa/gong2server/trunk/gong2-login
svn up
echo "编译Login..."
ant
if [ $? -gt 0 ]; then
    echo 'ant 执行错误!'
    exit
fi
sleep 1


echo "更新GMS..."

cd /home/sa/gong2-gms/trunk
svn up




echo "编译Gms..."

cd /home/sa/gong2-gms/trunk/tools
chmod +x *.sh
./build-test.sh

sleep 1


echo "重启..."
service tomcat stop ;
ps -ef | grep -v grep | grep "/usr/local/tomcat" | awk '{print $2}' | xargs kill -9;
service tomcat start
