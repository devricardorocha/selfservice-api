package com.devricardorocha.selfservice.api.msemployee.mapper;

import com.devricardorocha.selfservice.api.msemployee.model.entities.Email;
import com.devricardorocha.selfservice.api.msemployee.web.resources.EmailDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmailMapper {
    Email toEntity(EmailDTO dto);
    EmailDTO toDTO(Email email);
}
