#!/bin/bash

echo "远程编译客户端脚本..."
param="$*"

client="gong2client"
tools="gongtools"
sdk="$1"

# script_file="/Users/gong2mac/Documents/gong2client/trunk/gongtools/tools/alldone.sh"
# ssh pass -p 22 gong2!@# ssh gong2mac@10.10.10.39 "security unlock-keychain -p gong2!@# '/Users/gong2mac/Library/Keychains/login.keychain'; $script_file script $param"

cd ~/Documents/gong2client/trunk/gongtools/tools
./alldone.sh script $param

sleep 1
echo "客户端脚本更新完毕，可以直接打开手机APP更新!"
