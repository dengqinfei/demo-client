package com.client.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hello")
    public String hello(){
       ResponseEntity<String> result = restTemplate.getForEntity("http://127.0.0.1:8099/demo/hello",String.class);
       String body = result.getBody();
       return body;

    }

}
