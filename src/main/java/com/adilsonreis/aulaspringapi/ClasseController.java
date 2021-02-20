package com.adilsonreis.aulaspringapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

    
public class ClasseController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
    
    return "Hello";
    }
}
    

