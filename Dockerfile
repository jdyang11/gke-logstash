FROM openjdk:8-jre-alpine

LABEL maintainer = "Danny Yang"

WORKDIR /app

ADD target/gke-logstash-0.0.1-SNAPSHOT.jar /app/gke-logstash.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/gke-logstash.jar"]