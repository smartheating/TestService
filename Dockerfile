FROM java:8-jdk-alpine
VOLUME /tmp
EXPOSE 9010
ARG JAR_FILE=target/TestService-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} testservice.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=docker","-jar","/testservice.jar"]