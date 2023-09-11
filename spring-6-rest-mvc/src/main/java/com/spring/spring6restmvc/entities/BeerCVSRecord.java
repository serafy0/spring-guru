package com.spring.spring6restmvc.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
// "1",1,0.05,NA,1436,"Pub Beer","American Pale Lager",
// 408,12,NA,409,"10 Barrel Brewing Company","Bend",
// "OR","Pub Beer (10 Barrel Brewing Company)"

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BeerCVSRecord {

    private Integer row;
    private Integer count;
    private String abv;
    private String ibu;
    private Integer id;
    private String beer;
    private String style;
    private Integer breweryId;
    private Float ounces;
    private String style2;
    private String count_y;
    private String city;
    private String state;
    private String label;

}
