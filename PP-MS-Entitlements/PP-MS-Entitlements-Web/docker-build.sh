#!/bin/bash

CURR_DIR=$(dirname $0)

${CURR_DIR}/mvnw spring-boot:build-image -Dspring-boot.build-image.imageName=provider-portal/ms-entitlements