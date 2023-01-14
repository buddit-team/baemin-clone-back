FROM openjdk:11
EXPOSE 8080
ARG JAR_FILE=./baeminCloneProject-*.jar
COPY ${JAR_FILE} baemin-server.jar
ENTRYPOINT ["java","-jar","/baemin-server.jar"]