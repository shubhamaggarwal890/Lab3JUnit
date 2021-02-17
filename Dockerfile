FROM openjdk:8
COPY ./target/Lab3Junit-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "Lab3Junit-1.0-SNAPSHOT.jar", "Main"]