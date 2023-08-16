#define base image
FROM openjdk:17
LABEL maintainer="jardeployment"
ADD target/springboot-jar-demo-0.0.1-SNAPSHOT.jar springboot-jar-demo.jar
ENTRYPOINT ["java", "-jar", "springboot-jar-demo.jar" ]