package com.devricardorocha.selfservice.api.msuser.mapper;

import com.devricardorocha.selfservice.api.msuser.model.entities.PhoneNumber;
import com.devricardorocha.selfservice.api.msuser.web.resources.PhoneNumberDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PhoneNumberMapper {
    PhoneNumber toEntity(PhoneNumberDTO dto);
    PhoneNumberDTO toDTO(PhoneNumber phoneNumber);
}
