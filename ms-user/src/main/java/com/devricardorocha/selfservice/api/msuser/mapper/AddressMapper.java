package com.devricardorocha.selfservice.api.msuser.mapper;

import com.devricardorocha.selfservice.api.msuser.model.entities.Address;
import com.devricardorocha.selfservice.api.msuser.web.resources.AddressDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressMapper {
    Address toEntity(AddressDTO dto);
    AddressDTO toDTO(Address address);
}
