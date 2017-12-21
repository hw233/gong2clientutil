#!/bin/bash

if [ $# -lt 2 ]; then 
    echo "USAGE: ./execute.sh log_file job &"
    exit 1
fi

log_file_name=$1
shift
task=$1
shift

#extra params to be passed into task
params=$@

pid_file_name='pid.id'
pid=$$

function do_job() {
    if [ -e $pid_file_name ]; then
        pid=`cat $pid_file_name`
        exists=`ps aux | grep $pid | grep -v 'grep' | wc -l`
        if [ $exists -gt 0 ]; then
            echo '===========================================' >> $log_file_name
            echo 'program is running, please try again later!' >> $log_file_name
            echo '===========================================' >> $log_file_name
            echo 'pid = '$pid >> $log_file_name
        else
            rm $pid_file_name
            do_job
        fi
    else
        echo $pid > $pid_file_name
        ./$task $params >> $log_file_name 2>&1
        rm $pid_file_name
    fi
}

do_job
