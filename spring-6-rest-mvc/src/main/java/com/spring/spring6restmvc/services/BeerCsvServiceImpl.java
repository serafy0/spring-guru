package com.spring.spring6restmvc.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import com.opencsv.bean.CsvToBeanBuilder;
import com.spring.spring6restmvc.model.BeerCSVRecord;

public class BeerCsvServiceImpl implements BeerCsvService {

    @Override
    public List<BeerCSVRecord> convertCSV(File csvFile) {

        try {
            List<BeerCSVRecord> beerCSVRecords = new CsvToBeanBuilder<BeerCSVRecord>(new FileReader(csvFile))
                    .withType(BeerCSVRecord.class)
                    .build().parse();

            return beerCSVRecords;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
