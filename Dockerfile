#FROM openjdk:11 means run the jar file in java version 11
FROM openjdk:11
EXPOSE 8080

ADD target/demo.jar demo.jar
ENTRYPOINT ["java","-jar","/demo.jar"]