ARG PROJECT_ID
FROM gcr.io/${PROJECT_ID}/openjdk:8-jre-alpine

LABEL maintainer = "Danny Yang"

HEALTHCHECK --interval=30s --timeout=3s --retries=10 CMD </dev/tcp/localhost/8080

WORKDIR /app

ARG JAR_FILE
ADD target/${JAR_FILE} /app/gke-logstash.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/gke-logstash.jar"]