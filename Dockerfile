FROM openjdk:21-jdk-slim
COPY target/apiPerson-0.0.1-SNAPSHOT.jar /app/app.jar
CMD ["java", "-jar", "/app/app.jar"]