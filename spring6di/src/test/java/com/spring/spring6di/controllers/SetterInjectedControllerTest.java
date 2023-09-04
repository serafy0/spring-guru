package com.spring.spring6di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.spring.spring6di.services.GreetingServiceImpl;

public class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new GreetingServiceImpl());

    }

    @Test
    void testSayHello() {
        System.out.println(setterInjectedController.sayHello());
    }
}
