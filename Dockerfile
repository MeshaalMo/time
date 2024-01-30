FROM maven:3.9.0-eclipse-temurin-17-alpine
COPY . \app
EXPOSE 8090:8090
WORKDIR \app
RUN mvn clean install
ENTRYPOINT ["java", "-jar", "./target/time-0.0.1-SNAPSHOT.jar"]