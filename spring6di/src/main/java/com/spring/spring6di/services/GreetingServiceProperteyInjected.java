package com.spring.spring6di.services;

import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class GreetingServiceProperteyInjected implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Friends don't let friends do property injection";
    }

}
