package com.spring.spring6restmvc.mappers;

import org.mapstruct.Mapper;

import com.spring.spring6restmvc.entities.Beer;
import com.spring.spring6restmvc.model.BeerDTO;

@Mapper
public interface BeerMapper {
    Beer beerDtoToBeer(BeerDTO dto);

    BeerDTO beerToBeerDto(Beer beer);
}
