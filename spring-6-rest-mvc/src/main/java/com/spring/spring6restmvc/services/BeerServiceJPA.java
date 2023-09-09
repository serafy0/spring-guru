package com.spring.spring6restmvc.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.spring.spring6restmvc.mappers.BeerMapper;
import com.spring.spring6restmvc.model.BeerDTO;
import com.spring.spring6restmvc.repositories.BeerRepository;

import lombok.RequiredArgsConstructor;

@Service
@Primary
@RequiredArgsConstructor
public class BeerServiceJPA implements BeerService {

    private final BeerRepository beerRepository;
    private final BeerMapper beerMapper;

    @Override
    public void deleteById(UUID beerId) {
        // TODO Auto-generated method stub

    }

    @Override
    public Optional<BeerDTO> getBeerById(UUID id) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public List<BeerDTO> listBeers() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void patchBeerById(UUID beerId, BeerDTO beer) {
        // TODO Auto-generated method stub

    }

    @Override
    public BeerDTO saveNewBeer(BeerDTO beer) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void updateBeerById(UUID beerId, BeerDTO beer) {
        // TODO Auto-generated method stub

    }

}
