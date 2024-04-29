package com.example;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "HelloController", description = "Endpoint para saludo")
public class HelloController {

    @GetMapping("/hello")
    @Operation(summary = "Saluda al mundo", description = "Retorna un saludo simple")
    public String sayHello() {
        return "Hello, world!";
    }
}
