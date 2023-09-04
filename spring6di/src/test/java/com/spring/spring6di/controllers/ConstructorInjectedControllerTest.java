package com.spring.spring6di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.spring.spring6di.services.GreetingServiceImpl;

public class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setup() {
        controller = new ConstructorInjectedController(new GreetingServiceImpl());

    }

    @Test
    void testSayHello() {
        System.out.println(controller.sayHello());
    }
}
