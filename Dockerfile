##FROM ubuntu:latest
#
##base image is java
#FROM openjdk:17-alpine
#LABEL authors = "pdlra"
##expost port 8080 so we can connect to container
#EXPOSE 8080
##set a docker volume
#VOLUME /backend_volume
##Add jar file that is running application
#ADD /target/VIATabloid_Assignment1-0.0.1-SNAPSHOT.jar app.jar
##start the app
#ENTRYPOINT ["java", "-jar", "/app.jar"]
#

# Build stage
FROM maven:3.8.4-openjdk-17 AS builder
LABEL authors="pdlra"
WORKDIR /app
COPY . .
RUN mvn clean package

# Final stage
FROM openjdk:17-alpine
LABEL authors="pdlra"
EXPOSE 8080
VOLUME /backend_volume
COPY --from=builder /app/target/VIATabloid_Assignment1-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]

