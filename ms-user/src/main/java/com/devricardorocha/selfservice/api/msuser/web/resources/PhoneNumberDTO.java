package com.devricardorocha.selfservice.api.msuser.web.resources;

import lombok.Data;

@Data
public class PhoneNumberDTO {
    private Long id;
    private String countryCode;
    private String rawNumber;
    private String displayNumber;
    private String label;
    private Boolean principal;
}
