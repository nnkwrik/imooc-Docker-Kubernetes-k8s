FROM openjdk:8-jre
MAINTAINER nnkwrik nnkwrik@gmail.com

COPY target/api-gateway-zuul-1.0-SNAPSHOT.jar /api-gateway-zuul.jar

ENTRYPOINT ["java","-jar","/api-gateway-zuul.jar"]