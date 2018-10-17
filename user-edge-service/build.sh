#!/usr/bin/env bash

mvn clean clean package

docker build -t hub.nnkwrik.com/micro-service/user-edge-service:latest .

docker push hub.nnkwrik.com/micro-service/user-edge-service:latest

#docker run -it user-edge-service:latest --redis.address=192.168.0.5
