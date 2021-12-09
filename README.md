# Verificación y Validación del Software 2021
GRUPO IWT-42-6

## Instrucciones para utilizar este proyecto

* Abrir la consola en la carpeta raiz del proyecto
* Ejecutar `mvn install:install-file -Dfile=lib\SingleList.jar -DgroupId=com.cajanegra -DartifactId=singlelist -Dversion=0.1 -Dpackaging=jar` para añadir la libreria SingleList al repositorio maven
* Ejecutar `mvn test` para ejecutar todas las pruebas del proyecto
