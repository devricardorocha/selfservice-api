package com.devricardorocha.selfservice.api.msuser.mapper;

import com.devricardorocha.selfservice.api.msuser.model.entities.Email;
import com.devricardorocha.selfservice.api.msuser.web.resources.EmailDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmailMapper {
    Email toEntity(EmailDTO dto);
    EmailDTO toDTO(Email email);
}
