package in.ashokit.controller;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                title = "Product REST endpoints",
                version = "1.0",
                description = "API for managing products",
                license = @License(name = "Shayan Arshi", url = "https://www.linkedin.com/in/shayanarshi/")
        ),
        servers = @Server(url = "http://localhost:8080")
)
public class MyConfig {
}
