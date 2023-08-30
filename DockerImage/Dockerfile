FROM maven:3.6.3-openjdk-17-slim
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src ./src
RUN mvn clean install
CMD ["java", "-jar", "target/DockerImage.jar"]