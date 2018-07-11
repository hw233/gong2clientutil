#!/bin/bash
SVN="svn --username=gong2mac --password=123456"

TOOLS_DIR=".."
WORK_DIR="$TOOLS_DIR/generate"

##########
DATA_CSV_DIR="$WORK_DIR/csv"
DATA_CLIENT_DIR="$WORK_DIR/lua"
DATA_SERVER_DIR="$WORK_DIR/java"

PROJECT_PREFIX="https://10.10.10.254/svn"
DATA_CSV_URL="$PROJECT_PREFIX/gong2design/trunk/csv"
DATA_CLIENT_URL="$PROJECT_PREFIX/gong2client/trunk/gong2/src/app/config/data"
DATA_SERVER_URL="$PROJECT_PREFIX/gong2server/trunk/gong2-game/src/main/java/com/gamejelly/gong2/config/data"


svn info $PROJECT_PREFIX/gong2client/trunk/gong2 | awk 'NR==6{print $2}'
