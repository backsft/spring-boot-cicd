# Use Java 21 base image
FROM eclipse-temurin:21-jdk

EXPOSE 8080

ADD target/spring-boot-docker.jar spring-boot-docker.jar

# Run the jar file
ENTRYPOINT ["java", "-jar", "spring-boot-docker.jar"]
