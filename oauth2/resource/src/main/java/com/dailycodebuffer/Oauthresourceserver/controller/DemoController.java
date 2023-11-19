package com.dailycodebuffer.Oauthresourceserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class DemoController {

    // GET localhost:8082/hello
    @GetMapping("hello")
    public Map<String, String> getHello() {
        return Collections.singletonMap("get_text", "Hello ");
    }


}