package com.spring.spring6restmvc.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.spring.spring6restmvc.model.BeerDTO;

public interface BeerService {

    Optional<BeerDTO> getBeerById(UUID id);

    List<BeerDTO> listBeers();

    BeerDTO saveNewBeer(BeerDTO beer);

    void updateBeerById(UUID beerId, BeerDTO beer);

    void deleteById(UUID beerId);

    void patchBeerById(UUID beerId, BeerDTO beer);
}
