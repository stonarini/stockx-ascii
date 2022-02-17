FROM maven:3.8.4-openjdk-11-slim AS build

WORKDIR /home/app

COPY src src
COPY pom.xml pom.xml
RUN mvn -f /home/app/pom.xml clean package -q

FROM openjdk:11.0-jre-slim-buster

LABEL "edu.poniperro.stockx-ascii"="stockx-ascii"
LABEL version=1.0
LABEL mantainer="stonarini@cifpfbmoll.eu"

COPY --from=build /home/app/target/stockx-ascii-1.0.jar /usr/local/lib/stockx-ascii.jar
CMD ["java","-jar","/usr/local/lib/stockx-ascii.jar"]
