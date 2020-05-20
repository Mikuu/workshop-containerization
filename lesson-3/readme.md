Compose Exercise
---

##### Build API Image
- create Dockerfile
- create Image with Dockerfile

##### Create API Environment
- create Compose file
- create Services with Compose file

##### Try API Automation test with Containerized API Environment
- create SUT services with Compose file
- run API automation test
- stop SUT services

##### Some commands
- start API with source code

`you may need launch Redis and Mongodb locally before start the API`

```commandline
SPRING_PROFILES_ACTIVE=default ./gradlew bootRun
```
- generate SpringBoot artifact
```commandline
./gradlew assemble
```
- clean SpringBoot artifact
```commandline
./gradlew clean
```
- start API with artifact
```commandline
java -Dspring.profiles.active=default  -jar ./build/libs/compose-0.0.1-SNAPSHOT.jar 
```

##### API Swagger
once API service is up, you can find Swagger at `http://[host]:[port]/swagger-ui.html`
