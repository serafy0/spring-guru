package com.spring.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProperyInjectedControllerTest {
    @Autowired
    ProperyInjectedController properyInjectedController;

    @Test
    void testSayHello() {
        System.out.println(properyInjectedController.sayHello());
    }
}
