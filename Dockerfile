FROM openjdk
COPY ./target/*.jar docker-thymeleaf-server.jar
ENTRYPOINT [ "java","-jar","docker-thymeleaf-server.jar" ]




