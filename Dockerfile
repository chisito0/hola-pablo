# Imagen base con JDK 17 (compatible con Spring Boot 3)
FROM eclipse-temurin:21-jdk-alpine

# Carpeta dentro del contenedor
WORKDIR /app

# Copiar el jar generado por Maven/Gradle
COPY target/hola-pablo-0.0.1-SNAPSHOT.jar app.jar

# Puerto que expone Spring Boot
EXPOSE 8080

# Comando de arranque
ENTRYPOINT ["java", "-jar", "app.jar"]