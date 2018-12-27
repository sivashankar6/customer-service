#!/bin/sh
DOCKER_ACCOUNT=sudhakarlanka540
docker build --tag=customer-service .
docker tag customer-service $DOCKER_ACCOUNT/customer-service:v1
docker push $DOCKER_ACCOUNT/customer-service
