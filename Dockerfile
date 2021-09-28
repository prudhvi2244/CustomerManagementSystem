FROM openjdk:8
EXPOSE 9090
ADD target/cms.jar cms.jar
ENTRYPOINT ["java","-jar","/cms.jar"]