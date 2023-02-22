FROM openjdk:8-jre-alpine
WORKDIR /opt/jar
COPY radio-0.0.1-SNAPSHOT.jar .
CMD ["java", "-jar", "-Dserver.port=8080", "-Xms256m", "-Dserver.contextPath=/RADIOBACK", "-Xmx256m", "radio-0.0.1-SNAPSHOT.jar"]
