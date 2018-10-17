#!/usr/bin/env bash

mvn clean clean package

docker build -t hub.nnkwrik.com/micro-service/api-gateway-zuul:latest .

docker push hub.nnkwrik.com/micro-service/api-gateway-zuul:latest
#docker run -it api-gateway-zuul:latest
