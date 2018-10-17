#!/usr/bin/env bash

mvn clean clean package

docker build -t hub.nnkwrik.com/micro-service/user-service:latest .

docker push hub.nnkwrik.com/micro-service/user-service:latest

#docker run -it user-service:latest --mysql.address=192.168.0.5
