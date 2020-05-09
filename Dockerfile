FROM openjdk:8-alpine

RUN apk update
RUN apk add  maven
COPY pom.xml devops_calculator/pom.xml
COPY src devops_calculator/src
WORKDIR devops_calculator
RUN mvn package
CMD ["java","-cp","target/devops_calulator-1.0-SNAPSHOT.jar","calculator.Calculator"]
