FROM mcr.microsoft.com/java/jre:8-zulu-alpine

WORKDIR /usr/app
COPY ./build/libs/compose-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8088
ENTRYPOINT ["java","-Dspring.profiles.active=docker","-jar","app.jar"]
