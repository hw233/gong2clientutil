#!/bin/bash
WEB_URL=("http://10.10.10.32:8080/gametools/design/index")

function check_url(){
# define url
	
# check network
	NET_ALIVE=$(ping -c 5 8.8.8.8 |grep 'received'|awk 'BEGIN {FS=","} {print $2}'|awk '{print $1}')
	if [ $NET_ALIVE == 0 ]; then
   	 echo "Network is not active,please check your network configuration!"
   	 exit 0
	fi
	# check url
	for((i=0; i!=${#WEB_URL[@]}; ++i))
	{
 	 	ALIVE=$(curl -o /dev/null -s -m 10 -connect-timeout 10 -w %{http_code} ${WEB_URL[i]} |grep "000000")
  		if [ "$ALIVE" == "000000" ]; then
   			 echo "'${WEB_URL[i]}' can not be open,please check!" | mail -s "Website Notification to ${WEB_URL[i]}" yourname@example.com
   			 echo "failed"
   			 
         open -a Terminal.app /Users/gong2mac/Documents/gong2clientutil/trunk/macshell/macstart2.sh
   	     sleep 90
  		else
  	 		 echo "'${WEB_URL[i]}' is OK!"
  	 		 sleep 30
  		fi
	}

}


until false  
do    
 check_url
done 
