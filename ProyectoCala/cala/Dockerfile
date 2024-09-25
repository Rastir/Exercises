FROM openjdk:17-jdk.slim
ARG JAR_FILE=target/cala-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} cala.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "cala.jar"]