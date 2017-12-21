#!/bin/bash

echo "远程编译完整客户端..."
param="$*"

client="gongclient"
tools="gongtools"
sdk="$1"
if [ "$sdk" != "test" ]; then
    if [ "${sdk%_beta}_beta" == "$sdk" ]; then
        client="gongclient_beta"
        tools="gongtools_beta"
    else
        client="gongclient_public"
        tools="gongtools_public"
    fi
fi

# script_file="/Users/handong/Downloads/workspace/${client}/tools/fstools/tools/alldone.sh"
# sshpass -phd123 ssh handong@10.99.1.10 "security unlock-keychain -p hd123 '/Users/handong/Library/Keychains/login.keychain'; $script_file app $param"
cd /Users/wangchengcheng/Documents/GameJelly/gongclient/trunk/gongtools/tools
./alldone.sh app $param

# sleep 1
# echo "生成下载页面..."
# cd ~/tools/$tools
# echo "cd $(pwd)"
# svn up
# chmod +x *.sh
# cd tools
# chmod +x *.sh
# chmod +x sdk/*.sh

# ./gen-installer.sh $param
# sleep 1

echo "打包完整客户端完毕!"
