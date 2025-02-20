package dev.springsecurity.learnSpringSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {
    @GetMapping("/")
    public String home() {
        return "index";
    }
    @GetMapping("/login")
    public String login() {
        return "login";
    }
//    @GetMapping("/user")
//    public String user() {
//        return "user";
//    }
    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }
}