package com.ufrn.imd.mvc.controllers;

import com.ufrn.imd.mvc.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @Autowired
    HelloWorldService helloWorldService;

    @GetMapping("hello")
    public String hello(@RequestParam (value = "name", required = false) String name){
        return String.format(helloWorldService.helloMessage(name));
    }
}
