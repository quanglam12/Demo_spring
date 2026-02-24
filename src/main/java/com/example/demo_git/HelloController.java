package com.example.demo_git;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String sayHello() {
        int randomInt = (int)(Math.random() * 10);
        if(randomInt + 5 <= 10)
            return "Hello world. Good afternoon.";
        else
            return "Good bye world!";
    }
}
