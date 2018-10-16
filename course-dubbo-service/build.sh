#!/usr/bin/env bash

mvn clean clean package

docker build -t course-service:latest .

#docker run -it course-service:latest --mysql.address=123 --zookeeper.address=124


