package com.spring.spring6restmvc.services;

import java.io.File;
import java.util.List;

import com.spring.spring6restmvc.model.BeerCSVRecord;

public interface BeerCsvService {
    List<BeerCSVRecord> convertCSV(File csvFile);
}
