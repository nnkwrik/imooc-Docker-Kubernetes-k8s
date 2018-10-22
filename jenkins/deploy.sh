#!/bin/bash

IMAGE=`cat IMAGE_NAME`
DEPLOYMENT=$1
MODULE=$2
PATH=$PATH:/root/bin
export PATH
echo "update image to:${IMAGE}"
kubectl set image deployments/${DEPLOYMENT} ${MODULE}=${IMAGE}
