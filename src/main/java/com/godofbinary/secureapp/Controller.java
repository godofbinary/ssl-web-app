package com.godofbinary.secureapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @GetMapping(path = "/hello")
    public String hello(){
        return "Hello, this is a secured HTTP connexion, so it is an HTTPS";
    }
}
