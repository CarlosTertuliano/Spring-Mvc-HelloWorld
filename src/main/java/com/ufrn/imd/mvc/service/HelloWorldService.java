package com.ufrn.imd.mvc.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public String helloMessage(String name){
        name = (name == null) ? "World" : name;
        return "Hello " + name + "!";
    }
}
