FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/news-backend-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["sh","-c","java -jar /app/app.jar"]
