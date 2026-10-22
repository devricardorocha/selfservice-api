package com.devricardorocha.selfservice.api.msemployee.web.resources;

import com.devricardorocha.selfservice.api.msemployee.model.enumerators.DocumentType;
import lombok.Data;

@Data
public class EmployeeDocumentDTO {
    private DocumentType type;
    private String rawNumber;
    private String displayNumber;
}
