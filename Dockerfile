FROM openjdk:19-jdk-slim

WORKDIR /app

COPY target/microservicios-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
