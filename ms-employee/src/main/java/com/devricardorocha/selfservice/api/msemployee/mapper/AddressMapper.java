package com.devricardorocha.selfservice.api.msemployee.mapper;

import com.devricardorocha.selfservice.api.msemployee.model.entities.Address;
import com.devricardorocha.selfservice.api.msemployee.web.resources.AddressDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressMapper {
    Address toEntity(AddressDTO dto);
    AddressDTO toDTO(Address address);
}
