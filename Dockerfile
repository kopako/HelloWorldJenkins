FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY build/libs/hellojenkins-0.0.1-SNAPSHOT.jar hellojenkins.jar
ENTRYPOINT ["java","-jar","hellojenkins.jar"]