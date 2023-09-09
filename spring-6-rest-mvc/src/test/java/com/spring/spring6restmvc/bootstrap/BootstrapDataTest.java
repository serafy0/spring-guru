package com.spring.spring6restmvc.bootstrap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.spring.spring6restmvc.repositories.BeerRepository;
import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class BootstrapDataTest {

    @Autowired
    BeerRepository beerRepository;

    BootstrapData bootstrapData;

    @BeforeEach
    void setUp() {
        bootstrapData = new BootstrapData(beerRepository);
    }

    @Test
    void testRun() throws Exception {
        bootstrapData.run(null);

        assertThat(beerRepository.count()).isEqualTo(3);

    }
}
