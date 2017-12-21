#!/bin/bash

echo "远程打包资源..."
param="$*"
sshpass -phd123 ssh handong@10.99.1.10 "security unlock-keychain -p hd123 '/Users/handong/Library/Keychains/login.keychain'; /Users/handong/Downloads/workspace/alldone_pack.sh $param"
sleep 1
echo "打包资源完毕!"