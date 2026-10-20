package com.devricardorocha.selfservice.api.msuser.mapper;

import com.devricardorocha.selfservice.api.msuser.model.entities.UserDocument;
import com.devricardorocha.selfservice.api.msuser.web.resources.UserDocumentDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserDocumentMapper {
    UserDocument toEntity(UserDocumentDTO dto);
    UserDocumentDTO toDTO(UserDocument userDocument);
}
