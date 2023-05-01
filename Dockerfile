FROM openjdk:11
LABEL maintainer ="Shilpa Bains"
ADD target/*.jar Shilpa-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","Shilpa-0.0.1-SNAPSHOT.jar"]
