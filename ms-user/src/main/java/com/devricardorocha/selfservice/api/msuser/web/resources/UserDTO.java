package com.devricardorocha.selfservice.api.msuser.web.resources;

import com.devricardorocha.selfservice.api.msuser.model.enumerators.Gender;
import com.devricardorocha.selfservice.api.msuser.model.enumerators.JobTitle;
import com.devricardorocha.selfservice.api.msuser.model.enumerators.MaritalStatus;
import lombok.Data;

import java.time.LocalDate;
import java.util.Collection;

@Data
public class UserDTO {
    private String externalId;
    public String code;
    private String email;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Gender gender;
    private UserDocumentDTO userDocument;
    private String nationality;
    private MaritalStatus maritalStatus;
    private Collection<EmailDTO> contactEmails;
    private Collection<PhoneNumberDTO> contactPhoneNumbers;
    private AddressDTO address;
    private String profilePhotoURL;
    private LocalDate hiringDate;
    private JobTitle jobTitle;
    private UserDTO manager;
    private Boolean active;
}
