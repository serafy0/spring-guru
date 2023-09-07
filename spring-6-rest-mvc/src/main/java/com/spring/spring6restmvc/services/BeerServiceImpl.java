package com.spring.spring6restmvc.services;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import com.spring.spring6restmvc.model.Beer;
import com.spring.spring6restmvc.model.BeerStyle;

public class BeerServiceImpl implements BeerService {
    @Override
    public Beer getBeerById(UUID id) {
        return Beer.builder()
                .id(id)
                .version(1)
                .beerName("Galaxy cat")
                .BeerStyle(BeerStyle.PALE_ALE)
                .upc("123456")
                .price(new BigDecimal("12.99"))
                .quantityOnHand(122)
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();
    }
}
