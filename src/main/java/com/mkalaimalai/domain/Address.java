package com.mkalaimalai.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * Created by kalaimam on 7/14/17.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    private String line1;


    private String line2;


    private String city;


    private String zip;


    private String country;


    private AddressType type;



}
