FROM openjdk:8-jdk-alpine
MAINTAINER Hieu Tran
VOLUME /tmp
ENV SPRING_PROFILES_ACTIVE staging
ADD /build/libs/*.jar hygeia.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/hygeia.jar"]
EXPOSE 8080