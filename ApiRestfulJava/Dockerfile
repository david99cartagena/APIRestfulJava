FROM adoptopenjdk:11-jre-hotspot
MAINTAINER ApiRestJavaSpringBoot
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} demo-crud-1.0.jar
ENTRYPOINT ["java","-war","/ApiRestfulJava-0.0.1-SNAPSHOT.war"]