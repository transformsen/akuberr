package com.learning.akuber.web;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloWorldResource {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }
}
