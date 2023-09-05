package com.spring.spring6di.services;

import org.springframework.stereotype.Service;

@Service("setterGreatingBean")
public class GreetingServiceSetterInjection implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hey I'm Setting a Greeting!!";
    }

}
