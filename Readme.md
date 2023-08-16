# Spring Boot Jar Deployment Demo

This is a simple Spring Boot application demonstrating how to deploy a JAR file using Docker and Kubernetes.

## Prerequisites

Before you begin, ensure you have the following tools installed:
- Git
- Java Development Kit (JDK) 17 or higher
- Maven
- Docker
- Kubernetes (optional, for Kubernetes deployment)

## Getting Started

1. Clone this repository to your local machine:

   git clone https://github.com/kalpanaIronbanda/springboot-jar.git
   cd springboot-jar

2. Build the Spring Boot application:
   mvn clean package
The above will creates the target folder which contains the jar file

3. Run the application locally:
   java -jar target/demo-0.0.1-SNAPSHOT.jar
Open your browser and navigate to http://localhost:8080/Welcome to see the welcome message.


Docker Deployment

To deploy the application using Docker:

1. Build the Docker image:
    docker build -t springboot-jar-demo .

2. Run the Docker container:
    docker run -d -p 8080:8080 springboot-jar-demo
Open your browser and navigate to http://localhost:8080/Welcome to see the welcome message.
