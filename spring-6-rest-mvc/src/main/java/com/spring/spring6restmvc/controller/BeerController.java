package com.spring.spring6restmvc.controller;

import java.util.UUID;

import org.springframework.stereotype.Controller;

import com.spring.spring6restmvc.model.Beer;
import com.spring.spring6restmvc.services.BeerService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@Controller
public class BeerController {
    private final BeerService beerService;

    public Beer getBeerById(UUID id) {
        log.debug("Get Beer by Id - in controller");
        return beerService.getBeerById(id);
    }

}
