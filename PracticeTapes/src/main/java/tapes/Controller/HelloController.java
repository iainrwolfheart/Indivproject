package tapes.Controller;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping
public class HelloController {
    
    public String index() {
        return "Greetings from Spring Boot!";
    }
}