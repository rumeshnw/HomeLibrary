# Home Library

This is a Simple App to Maintain Book Library

## Pre-Requisites

- Install JDK 21
- For local development install podman & podman desktop
- If using VS Code install following extensions,
    - Extension Pack for Java
    - Spring Boot Extension Pack
    - Spring Initializr Java Support
    - Language Support for Java
    - Gradle for Java
    - YAML


## Start/Stop mysql container on Podman
- Go to docker folder
- To start,
    podman-compose -f local-dev-setup.yml up -d
- To stop,
    podman-compose -f local-dev-setup.yml down

## Run liquibase
    ./gradlew update

## Start back-end
    - copy env.template & create a .env file for local development
    - update env variables with respective values
    - run command,
        ./gradlew bootRun

