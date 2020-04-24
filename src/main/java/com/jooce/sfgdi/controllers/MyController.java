package com.jooce.sfgdi.controllers;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hi");

        return "Hi";
    }
}
