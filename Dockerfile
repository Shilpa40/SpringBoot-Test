FROM openjdk:11
LABEL maintainer ="Shilpa Bains"
ADD target/Shilpa-0.0.1-SNAPSHOT.jar Shilpa-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","Shilpa-0.0.1-SNAPSHOT.jar"]