#!/bin/bash

APP_NAME=gametools
APP_HOME=/Users/gong2mac/Documents/gong2clientutil/trunk/gametools
TMP_DIR=/var/tmp
LOG_DIR=$APP_HOME/target

##########
if [ ! -d $LOG_DIR ]; then
    mkdir $LOG_DIR
fi

##########
DAEMON=/usr/local/bin/start-stop-daemon

APP_CMDS="grails \
-Dserver.port=8090 \
run-app"

DAEMON_OPTS="--name=$APP_NAME \
--chdir=$APP_HOME \
--pidfile=$APP_HOME/$APP_NAME.pid"

##########
start () {
    if [ -f $APP_PID ]; then
        return 1
    fi 
    $DAEMON --start --background $DAEMON_OPTS --exec $JAVA_HOME/jre/bin/java -- $APP_CMDS
};

stop () {
    $DAEMON --stop --quiet --pidfile $APP_PID --retry 15
    rm -f $APP_PID
};

##########
case "$1" in
    start)
        echo -n 'Starting App Server: ';
        start;
        echo 'done.';
        ;;
    stop)
        echo -n 'Stoping App Server: ';
        stop;
        echo 'done.';
        ;;
    restart)
        echo -n 'Restarting App Server: ';
        stop;
        sleep 3s;
        start;
        echo 'done.';
        ;;
    *)
        echo "Usage $0 start|stop|restart"
        exit 1;
        ;;
esac;
