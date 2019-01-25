FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY build/libs/ /
ENTRYPOINT ["java","-jar","*.jar"]