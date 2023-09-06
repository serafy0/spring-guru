package com.spring.spring6di.services.i18n;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.spring.spring6di.services.GreetingService;

@Profile("ES")
@Service("i18nService")
public class SpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
