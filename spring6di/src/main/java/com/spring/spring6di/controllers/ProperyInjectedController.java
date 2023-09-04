package com.spring.spring6di.controllers;

import com.spring.spring6di.services.GreetingService;

public class ProperyInjectedController {

    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
