package com.example.controller;

import org.springframework.web.bind.annotation.*;

import com.example.model.Greeting;
import com.example.service.GreetingService;

import java.util.List;

@RestController
@RequestMapping("/greetings")
public class GreetingController {
    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @PostMapping
    public Greeting addGreeting(@RequestBody Greeting greeting) {
        return greetingService.saveGreeting(greeting);
    }

    @GetMapping
    public List<Greeting> getGreetings() {
        return greetingService.getAllGreetings();
    }
}
