package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@RestController
public class ClientApp {

    @GetMapping
    public String welcome() {
        return "Welcome to Google !!";
    }

    @GetMapping("/user1")
    public Principal user(Principal principal) {
        System.out.println("username : " + principal.getName());
        return principal;
    }


    public static void main(String[] args) {
        SpringApplication.run(ClientApp.class, args);
    }

}