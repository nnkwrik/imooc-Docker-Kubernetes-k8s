FROM hub.nnkwrik.com/micro-service/openjdk:8-jre
MAINTAINER nnkwrik nnkwrik@gmail.com

COPY target/course-edge-service-1.0-SNAPSHOT.jar /course-edge-service.jar

ENTRYPOINT ["java","-jar","/course-edge-service.jar"]