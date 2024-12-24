package com.example.greeting;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

    @GetMapping("/")
    @ResponseBody
    public String greeting() {
        return "<h1>Добро пожаловать в наше веб-приложение!</h1>";
    }
}
