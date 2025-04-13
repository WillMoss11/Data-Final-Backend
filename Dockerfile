# Use a lightweight Java runtime as the base image
FROM eclipse-temurin:17-jre-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the Spring Boot application JAR file into the container
# Replace 'your-project-name-0.0.1-SNAPSHOT.jar' with the actual name of your JAR file
COPY target/Airports-0.1.jar app.jar

# Expose the port your Spring Boot application runs on (default is 8080)
EXPOSE 8080

# Define the command to run your Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]