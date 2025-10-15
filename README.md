# News Backend (Spring Boot)

This is a simple Spring Boot backend for a News Aggregator frontend.

Features:
- Java 17 + Spring Boot
- MySQL (configure datasource in `application.properties`)
- CRUD for saved news articles at `/api/news`
- OpenAPI UI available at `/swagger-ui.html` (springdoc)

How to run:
1. Update `src/main/resources/application.properties` with your MySQL credentials and DB name.
2. Build: `mvn clean package`
3. Run: `java -jar target/news-backend-0.0.1-SNAPSHOT.jar`
