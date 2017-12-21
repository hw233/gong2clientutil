#!/bin/bash

echo "更新发布工具..."

tools="fstools"
if [ "$1" == "beta" ]; then
    tools="fstools_beta"
elif [ "$1" == "public" ]; then
    tools="fstools_public"
fi

cd ~/tools/$tools
echo "cd $(pwd)"
svn up
chmod +x *.sh
cd tools
chmod +x *.sh
chmod +x sdk/*.sh

echo "更新发布工具完毕!请重新刷新页面!"
