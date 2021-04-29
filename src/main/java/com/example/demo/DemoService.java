package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoService {
    @Value("${name.from.file}")
    private String nameFormFile;

    @GetMapping(name = "/getHello")
    public String getHello() {
        return String.format("Hello, %s", nameFormFile);
    }
}
