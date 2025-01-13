FROM openjdk:11-jdk-slim
WORKDIR /app
COPY target/akuber-0.0.1-SNAPSHOT.jar akuber.jar
ENTRYPOINT ["java","-jar","akuber.jar"]