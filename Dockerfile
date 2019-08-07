FROM openjdk:8-jdk-alpine

COPY target/gateway-0.0.1-SNAPSHOT.jar /app/gateway.jar

ENTRYPOINT ["java", "-jar", "/app/gateway.jar"]