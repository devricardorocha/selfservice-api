package com.devricardorocha.selfservice.api.msuser.web.resources;

import com.devricardorocha.selfservice.api.msuser.model.enumerators.DocumentType;
import lombok.Data;

@Data
public class UserDocumentDTO {
    private DocumentType type;
    private String rawNumber;
    private String displayNumber;
}
