#!/usr/bin/env bash

mvn clean clean package

docker build -t course-service:latest .

#docker run -it course-service:latest mysql.address=192.168.0.5 zookeeper.address=192.168.0.5



