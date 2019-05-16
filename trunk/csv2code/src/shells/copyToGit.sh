#!/usr/bin/env bash

echo "----  dev start  ----"

TOOLS_DIR=".."
WORK_DIR="$TOOLS_DIR/generate"

DATA_SERVER_DIR="$WORK_DIR/java/"

TO_DIR="/home/sa/git/gong2game/src/main/java/com/gamejelly/gong2/config/data"

pwd=`pwd`

cd ${TO_DIR}
git checkout dev
git pull

cd ${pwd}
rsync -a --exclude-from=".svn/" --exclude '.svn/' --delete ${DATA_SERVER_DIR}* ${TO_DIR}
cd ${TO_DIR}

git add .

git commit -m 'update data to dev'
git push

echo "----  dev end  ----"
