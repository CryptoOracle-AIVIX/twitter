FROM openjdk:17-jdk-slim
COPY spring-boot-full-stack-1.0-SNAPSHOT.jar /app.jar
CMD ["java", "-jar", "/app.jar"]
EXPOSE 8080
