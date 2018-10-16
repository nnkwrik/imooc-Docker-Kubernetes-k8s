#!/bin/bash
cur_dir=`pwd`
docker stop imooc-mysql
docker rm imooc-mysql
docker run -d --name imooc-mysql -v ${cur_dir}/conf:/etc/mysql/conf.d -v ${cur_dir}/data:/var/lib/mysql -p 3307:3306 -e MYSQL_ROOT_PASSWORD=aA111111  mysql:5.7
#docker run --name imooc-mysql  -p 3307:3306 -e MYSQL_ROOT_PASSWORD=aA111111  mysql:5.7

