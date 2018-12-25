#!/bin/sh
if [ -z "$DOCKER_ACCOUNT" ]; then
    DOCKER_ACCOUNT=sudhakarlanka540
fi;
kubectl run customer --image=docker.io/$DOCKER_ACCOUNT/customer-service:latest --port=8084
kubectl expose deployment/customer --type="NodePort" --port 8084
