# Usa una imagen base oficial de OpenJDK
FROM eclipse-temurin:21-jdk

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el archivo jar generado
COPY target/testPragma-0.0.1-SNAPSHOT.jar app.jar

# Expone el puerto en el que corre tu aplicación
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
