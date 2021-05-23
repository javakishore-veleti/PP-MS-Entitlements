#!/bin/bash

CURR_DIR=$(dirname $0)

APP_PORT_NO=7000
CONTAINER_NAME="PP-MS-Entitlements-Web"

mkdir -p /tmp/provider-portal/ms-entitlements

docker run -d --name ${CONTAINER_NAME} -p ${APP_PORT_NO}:7000 provider-portal/ms-entitlements > /tmp/provider-portal/ms-entitlements/docker-container.log 2&>1

echo ""
echo "Provider Portal - Entitlements Web URL -> http://localhost:${APP_PORT_NO}"
echo ""
echo "Docker commands are:"
echo "#####################"
echo "docker ps -a 	${CONTAINER_NAME}"
echo "docker stop 	${CONTAINER_NAME}	OR ./docker-stop.sh"
echo "docker rm 	${CONTAINER_NAME}	OR ./docker-remove.sh"
echo ""
