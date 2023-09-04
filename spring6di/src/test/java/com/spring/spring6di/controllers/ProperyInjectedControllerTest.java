package com.spring.spring6di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.spring.spring6di.services.GreetingServiceImpl;

public class ProperyInjectedControllerTest {
    ProperyInjectedController properyInjectedController;

    @BeforeEach
    void setup() {
        properyInjectedController = new ProperyInjectedController();
        properyInjectedController.greetingService = new GreetingServiceImpl();

    }

    @Test
    void testSayHello() {
        System.out.println(properyInjectedController.sayHello());
    }
}
