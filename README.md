# gRPC Spring Boot Example

This is a simple example project demonstrating how to use gRPC with Spring Boot in a Maven project.

## Project Structure

- `src/main/proto`: Contains the Protocol Buffers (protobuf) file defining the gRPC service.
- `src/main/java`: Java source code for the Spring Boot application and the gRPC service implementation.
- `pom.xml`: Maven project configuration file.
  

## BloomRPC can be used aas xclient for grpc p4roject

## Prerequisites

- Java 8 or later
- Maven

## Getting Started

1. Clone the repository:

    ```bash
    git clone https://github.com/yourusername/grpc-spring-example.git
    cd grpc-spring-example
    ```

2. Build the project:

    ```bash
    mvn clean install
    ```

3. Run the Spring Boot application:

    ```bash
    mvn spring-boot:run
    ```

   The gRPC server will start at `localhost:6565`.

4. Test the gRPC service using a tool like BloomRPC or gRPCurl.

## gRPC Service

The gRPC service is defined in the `src/main/proto/example.proto` file. It includes a simple `Greeter` service with a `SayHello` RPC method.

## Implementation Details

- The gRPC code is generated during the Maven build using the `protobuf-maven-plugin`.
- The `GreeterService` class in `src/main/java/com/example/grpc` implements the gRPC service.

## Additional Notes

- Update the protobuf file (`example.proto`) to define additional services or modify the existing ones.
- Customize the Spring Boot application to fit your requirements.

## Dependencies

- [gRPC](https://grpc.io/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Maven](https://maven.apache.org/)

## Contributing

Feel free to contribute to this project by opening issues or submitting pull requests.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
