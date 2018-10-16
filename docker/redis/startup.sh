#!/bin/bash
cur_dir=`pwd`
docker stop imooc-redis
docker rm imooc-redis
docker run -idt --name imooc-redis -v ${cur_dir}/data:/data -p 6378:6379 redis:3.2
#docker run -idt --name imooc-redis -v ${cur_dir}/data:/data -v ${cur_dir}/redis.conf:/etc/redis/redis_default.conf -p 6378:6379 redis:2.8.4
