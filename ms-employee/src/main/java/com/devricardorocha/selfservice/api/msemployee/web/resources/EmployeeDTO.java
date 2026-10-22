package com.devricardorocha.selfservice.api.msemployee.web.resources;

import com.devricardorocha.selfservice.api.msemployee.model.enumerators.Gender;
import com.devricardorocha.selfservice.api.msemployee.model.enumerators.JobTitle;
import com.devricardorocha.selfservice.api.msemployee.model.enumerators.MaritalStatus;
import lombok.Data;

import java.time.LocalDate;
import java.util.Collection;

@Data
public class EmployeeDTO {
    private String externalId;
    public String code;
    private String email;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Gender gender;
    private EmployeeDocumentDTO employeeDocument;
    private String nationality;
    private MaritalStatus maritalStatus;
    private Collection<EmailDTO> contactEmails;
    private Collection<PhoneNumberDTO> contactPhoneNumbers;
    private AddressDTO address;
    private String profilePhotoURL;
    private LocalDate hiringDate;
    private JobTitle jobTitle;
    private EmployeeDTO manager;
    private Boolean active;
}
