package com.example.restsample.controller;

import com.example.restsample.domain.SampleRequest;
import com.example.restsample.domain.SampleResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    String unUsed;

    @GetMapping("/hello")
    public String hello(){
        return "helloWorld";
    }

    @PostMapping("/test")
    public SampleResponse testRestful(@RequestBody SampleRequest req) {
        SampleResponse res = new SampleResponse();
        if(req == null){
            res.setStatusCode("null");
            return res;
        }

        System.out.println("req : " + req.toString() + " test");
        res.setStatusCode("OK");

        return res;
    }
}