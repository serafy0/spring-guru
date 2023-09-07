package com.spring.spring6restmvc.services;

import java.util.UUID;

import com.spring.spring6restmvc.model.Beer;

public interface BeerService {
    Beer getBeerById(UUID id);
}
