#!/bin/bash

tools="gongtools"
category="$1"
if [ "$category" == "beta" ]; then
    tools="gongtools_beta"
elif [ "$category" == "public" ]; then
    tools="gongtools_public"
fi

cd ~/Documents/gong2client/trunk/gongtools/tools/sdk
for file in *.sh; do
    sdk=$(basename $file .sh)
    if [ "$sdk" != "test" ]; then
        if [ "$category" == "beta" ]; then
            if [ "${sdk%_beta}_beta" == "$sdk" ]; then
                . $file
                echo $sdk,$BUILD_TARGET_NAME,$BUILD_TARGET_DISABLED
            fi
        elif [ "$category" == "public" ]; then
            if [ "${sdk%_beta}_beta" != "$sdk" ]; then
                . $file
                echo $sdk,$BUILD_TARGET_NAME,$BUILD_TARGET_DISABLED
            fi
        fi
    fi
done
