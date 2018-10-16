#!/usr/bin/env bash

mvn clean clean package

docker build -t api-gateway-zuul:latest .

#docker run -it api-gateway-zuul:latest
