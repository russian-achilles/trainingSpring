package com.example.trainingspring.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class HelloController {
    @GetMapping("/hello")
    public String hello(Model model) {
        return "hello";
    }
}
