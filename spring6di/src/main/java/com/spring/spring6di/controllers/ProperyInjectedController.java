package com.spring.spring6di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.spring.spring6di.services.GreetingService;

@Controller
public class ProperyInjectedController {

    @Qualifier("propertyGreetingService")
    @Autowired
    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
