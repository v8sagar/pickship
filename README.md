# Pick And Ship Project Details

This project serves solely the task to provide a template for services to be integrated to the pickship platform.

The project consists of three modules:

* `com.pickship-api`: provides the API endpoints using open feign annotations and declarations
* `com.pickship-impl`: provides the implementation of the given api
* `com.pickship-app`: provides a spring boot starter for the application and a docker build

* Maven 3.6.1 (https://maven.apache.org/download.cgi)
* JDK 11 (Quelle: https://adoptopenjdk.net/)
* Docker


the used procedure for Jenkins may be found in the corresponding `Jenkinsfile-**`

For formatting purposes, the standard code style of IntelliJ is used.

Supported Java Versions:

* OpenJDK 11 (Quelle: https://adoptopenjdk.net/)

current compile target version: 11

For further information regarding the setup and status of the project, look into the parent project which is used to 
