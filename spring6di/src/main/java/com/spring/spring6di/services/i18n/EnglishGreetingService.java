package com.spring.spring6di.services.i18n;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.spring.spring6di.services.GreetingService;

@Profile("EN")
@Service("i18nService")
public class EnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
