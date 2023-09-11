package com.spring.spring6restmvc.services;

import org.junit.jupiter.api.Test;
import org.springframework.util.ResourceUtils;

import com.spring.spring6restmvc.model.BeerCSVRecord;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public class BeerCsvServiceImplTest {

    BeerCsvService beerCsvService = new BeerCsvServiceImpl();

    @Test
    void testConvertCSV() throws FileNotFoundException {

        File file = ResourceUtils.getFile("classpath:csvdata/beers.csv");
        List<BeerCSVRecord> records = beerCsvService.convertCSV(file);

        System.out.println(records.size());

        assertThat(records.size()).isGreaterThan(0);

    }
}
