#!/usr/bin/env bash

mvn clean clean package

docker build -t course-edge-service:latest .

#docker run -it course-edge-service:latest --zookeeper.address=192.168.0.5
