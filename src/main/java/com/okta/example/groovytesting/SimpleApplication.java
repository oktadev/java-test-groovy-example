package com.okta.example.groovytesting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@SpringBootApplication
@RestController
public class SimpleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleApplication.class, args);
    }

    @GetMapping("/")
    private String welcome() {
        return "Hello";
    }

    @GetMapping("/add")
    public int add(@RequestParam("a") int a, @RequestParam("b") int b) {
        return a + b;
    }

    @GetMapping("/concat")
    public String concat(@RequestParam("a") String a, @RequestParam("b") String b) {
        return Objects.toString(a, "") + Objects.toString(b, "");
    }
}
