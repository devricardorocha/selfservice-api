package com.devricardorocha.selfservice.api.msuser.mapper;

import com.devricardorocha.selfservice.api.msuser.model.entities.User;
import com.devricardorocha.selfservice.api.msuser.web.resources.UserDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {
    AddressMapper.class, EmailMapper.class, PhoneNumberMapper.class, UserDocumentMapper.class
})
public interface UserMapper {
    User toEntity(UserDTO dto);
    UserDTO toDTO(User user);
}
