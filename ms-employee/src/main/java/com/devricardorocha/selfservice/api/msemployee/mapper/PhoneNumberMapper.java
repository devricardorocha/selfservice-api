package com.devricardorocha.selfservice.api.msemployee.mapper;

import com.devricardorocha.selfservice.api.msemployee.model.entities.PhoneNumber;
import com.devricardorocha.selfservice.api.msemployee.web.resources.PhoneNumberDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PhoneNumberMapper {
    PhoneNumber toEntity(PhoneNumberDTO dto);
    PhoneNumberDTO toDTO(PhoneNumber phoneNumber);
}
