package com.example.service;

import org.springframework.stereotype.Service;

import com.example.model.Greeting;
import com.example.repository.GreetingRepository;

import java.util.List;
import java.util.Optional;

@Service
public class GreetingService {
    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public Greeting saveGreeting(Greeting greeting) {
        return greetingRepository.save(greeting);
    }

    public Optional<Greeting> findGreetingById(Long id) {
        return greetingRepository.findById(id);
    }

    public List<Greeting> findAllGreetings() {
        return greetingRepository.findAll();
    }

    public boolean deleteGreetingById(Long id) {
        if (greetingRepository.existsById(id)) {
            greetingRepository.deleteById(id);
            return true;
        }
        return false;
    }

}
