package com.devricardorocha.selfservice.api.msemployee.web.resources;

import lombok.Data;

@Data
public class AddressDTO {
    private String region;
    private String city;
    private String timezone;
    private String zipCode;
    private String line1;
    private String line2;
}
