# Start with a base image containing Java runtime
FROM adoptopenjdk/openjdk13:latest

# Add Maintainer Info
MAINTAINER Keith Priddle<k.priddle66@gmail.com>

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8080 available to the world outside this container
EXPOSE 8080

# The application's jar file
ARG JAR_FILE=target/Spring-Unit-Testing-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} Spring-Unit-Testing-0.0.1-SNAPSHOT.jar

# Run the jar file 
ENTRYPOINT ["java","-jar","/Spring-Unit-Testing-0.0.1-SNAPSHOT.jar"]
