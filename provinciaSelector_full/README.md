# Instructivo de Ejecución del Proyecto

Este es el instructivo para ejecutar el proyecto de ProvinciaSelector usando Spring Boot en tu máquina local. El proyecto utiliza Maven y depende de Java 8 o superior.

# Requisitos previos

Asegúrate de tener instaladas las siguientes herramientas en tu computadora:

1. Java 8 o superior  
   Puedes verificar si tienes Java instalado ejecutando el siguiente comando en tu terminal o línea de comandos:
   ```bash
   java -version
   
   Si no tienes Java instalado, puedes descargarlo desde [aquí](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

2. Maven  
   Para verificar si Maven está instalado, usa el siguiente comando:
   ```bash
   mvn -v
   
   Si no tienes Maven instalado, puedes descargarlo desde [aquí](https://maven.apache.org/download.cgi).

3. IDE (NetBeans, IntelliJ IDEA o similar)  
   Asegúrate de tener un IDE de desarrollo como NetBeans 8.1 o superior. En este caso, el proyecto es compatible con NetBeans.

---

# Pasos para ejecutar el proyecto

# 1. Descomprimir el archivo
Descomprime el archivo ZIP que contiene el proyecto en una ubicación de tu preferencia.

# 2. Abrir el proyecto en NetBeans

1. Abre NetBeans IDE.
2. En NetBeans, selecciona File > Open Project....
3. Navega hasta la carpeta donde descomprimiste el archivo y selecciona la carpeta del proyecto.
4. Haz clic en Open Project.

# 3. Configurar el JDK y Maven

Si es la primera vez que abres un proyecto de Maven en NetBeans, asegúrate de que esté configurado para usar el JDK 1.8 y el Maven adecuado:

1. En NetBeans, ve a Tools > Options.
2. En la pestaña Java, selecciona el JDK 1.8 en la sección Installed JDKs.
3. En la pestaña Maven, asegúrate de que el Maven Home esté configurado correctamente.

# 4. Ejecutar el proyecto

1. En NetBeans, haz clic derecho sobre el proyecto y selecciona Clean and Build. Esto descargará todas las dependencias necesarias y construirá el proyecto.
2. Luego, haz clic derecho nuevamente sobre el proyecto y selecciona Run. Esto ejecutará el servidor Spring Boot y deberías ver algo similar a lo siguiente en la consola de NetBeans:
   ```bash
   Tomcat started on port(s): 8080 (http) with context path ''

   Esto significa que el servidor se está ejecutando correctamente en tu máquina local.

# 5. Acceder a la aplicación

Una vez que el servidor Spring Boot esté en funcionamiento, abre tu navegador web y visita la siguiente URL para ver la aplicación:

http://localhost:8080

---

# Estructura del Proyecto

- src/main/java: Contiene el código fuente en Java (clases, controladores, etc.).
- src/main/resources: Contiene los recursos de la aplicación, como los archivos de configuración.
- pom.xml: Archivo de configuración de Maven que gestiona las dependencias del proyecto.

---

# Notas adicionales

- Si tienes problemas con la conexión SSL (por ejemplo, un error relacionado con certificados), asegúrate de que tu Java tenga los certificados de seguridad actualizados.
- En caso de que quieras modificar el diseño o comportamiento del frontend, puedes hacerlo directamente en la carpeta src/main/resources/static.

---

# Problemas comunes

1. Error: "Maven dependencies not found"  
   Asegúrate de que Maven esté correctamente configurado y de que hayas ejecutado el comando "Clean and Build" en NetBeans para descargar las dependencias necesarias.

2. Problemas con SSL (error `unable to find valid certification path`)  
   Este error puede ocurrir si Java no puede verificar el certificado SSL del servidor. Una solución es deshabilitar la verificación SSL temporalmente (no recomendado para producción).
