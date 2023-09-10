package com.spring.spring6restmvc.repositories;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;

import com.spring.spring6restmvc.entities.Beer;
import com.spring.spring6restmvc.model.BeerStyle;

import jakarta.validation.ConstraintViolationException;

@DataJpaTest
public class BeerRepositoryTest {

    @Autowired
    BeerRepository beerRepository;

    @Test
    void testSaveBeerNameTooLong() {

        assertThrows(ConstraintViolationException.class, () -> {
            String beerString = "Beer Name";
            String LongBeerName = beerString + " ".repeat(60 - beerString.length());
            Beer savedBeer = beerRepository.save(Beer.builder()
                    .beerName(LongBeerName)
                    .beerStyle(BeerStyle.PALE_ALE)
                    .upc("234234234")
                    .price(new BigDecimal("11.9"))

                    .build());

            beerRepository.flush();
            assertThat(savedBeer).isNotNull();
            assertThat(savedBeer.getId()).isNotNull();

        });
    }

    @Test
    void testSaveBeer() {
        Beer savedBeer = beerRepository.save(Beer.builder().beerName("My beer")
                .beerStyle(BeerStyle.PALE_ALE)
                .upc("234234234")
                .price(new BigDecimal("11.9"))

                .build());

        beerRepository.flush();
        assertThat(savedBeer).isNotNull();
        assertThat(savedBeer.getId()).isNotNull();
    }
}
