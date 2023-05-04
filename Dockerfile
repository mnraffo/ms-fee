# Dockerfile

FROM eclipse-temurin:17-alpine
LABEL name=ms-fee

RUN apk add --no-cache bash
RUN addgroup --system javauser && adduser -S -s /bin/false -G javauser javauser
RUN mkdir -p /opt/ms-fee && chown javauser:javauser /opt/ms-fee

WORKDIR /opt/ms-fee
USER javauser

COPY target/*.jar /opt/ms-fee/

CMD ["java", "-jar", "app.jar"]
