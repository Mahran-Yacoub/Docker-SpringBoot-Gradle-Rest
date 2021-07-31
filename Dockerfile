FROM java:8
ADD ./build/libs/REST_Gradle_SpringBoot_Docker-0.0.1-SNAPSHOT.jar gradle-springboot-1.0.jar
ENTRYPOINT ["java","-jar","gradle-springboot-1.0.jar"]
