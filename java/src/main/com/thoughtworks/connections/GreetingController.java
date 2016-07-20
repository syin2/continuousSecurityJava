package com.thoughtworks.connections;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost/")
@RestController
public class GreetingController {
    @RequestMapping("/greeting")
    public Greeting greeting() {
        return new Greeting();
    }
}

