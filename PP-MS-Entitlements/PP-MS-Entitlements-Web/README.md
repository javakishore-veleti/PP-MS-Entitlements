# About Entitlements-Web Project

```sh

mvn -N io.takari:maven:wrapper

```

# Docker Image creation and Docker Run command

Below is a very good article
- https://spring.io/guides/gs/spring-boot-docker/

```sh
./docker-build.sh
docker run -p 8080:8080 -t provider-portal/ms-entitlements

```