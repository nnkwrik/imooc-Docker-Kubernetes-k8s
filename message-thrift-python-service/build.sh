#!/usr/bin/env bash

docker build -t hub.nnkwrik.com/micro-service/message-service:latest .

docker push hub.nnkwrik.com/micro-service/message-service:latest

#docker run -it message-service:latest

