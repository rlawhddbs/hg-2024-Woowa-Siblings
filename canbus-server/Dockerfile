FROM amazoncorretto:17-alpine

WORKDIR /app

COPY . .

RUN chmod +x ./gradlew
RUN ./gradlew clean build

ENV JAR_PATH=/app/build/libs
RUN mv ${JAR_PATH}/canbus-server-0.0.1-SNAPSHOT.jar /app/app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
