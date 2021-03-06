#!/bin/bash

JAVA_HOME=/usr/java/jdk1.7.0_67/
JRE_HOME=$JAVA_HOME/jre
GRAILS_HOME=/usr/local/grails
PATH=$PATH:$JAVA_HOME/bin:$JRE_HOME/bin:$ANT_HOME/bin:$GROOVY_HOME/bin:$M2_HOME/bin:$GRAILS_HOME/bin
CLASSPATH=.:$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar:$JRE_HOME/lib
CATALINA_HOME=/usr/local/tomcat
export JAVA_HOME JRE_HOME PATH CLASSPATH

APP_NAME=gametools
APP_HOME=/home/sa/gong2clientutil/trunk/gametools/
TMP_DIR=/var/tmp
LOG_DIR=$APP_HOME/target
GRAILS_HOME=/usr/local/grails
##########
if [ ! -d $LOG_DIR ]; then
    mkdir $LOG_DIR
fi

##########
DAEMON=/usr/local/bin/start-stop-daemon

APP_CMDS="-Dserver.port=8080 \
run-app"

DAEMON_OPTS="--name $APP_NAME \
--chdir $APP_HOME \
--pidfile $APP_HOME/$APP_NAME.pid --make-pidfile"
##########
start () {
      $DAEMON --start --background $DAEMON_OPTS --exec $GRAILS_HOME/bin/grails  -- $APP_CMDS
};

stop () {
      $DAEMON --stop --quiet --pidfile $APP_HOME/$APP_NAME.pid --retry 15
      rm -f $APP_HOME/$APP_NAME.pid

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

