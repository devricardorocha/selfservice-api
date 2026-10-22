package com.devricardorocha.selfservice.api.msemployee.mapper;

import com.devricardorocha.selfservice.api.msemployee.model.entities.EmployeeDocument;
import com.devricardorocha.selfservice.api.msemployee.web.resources.EmployeeDocumentDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeDocumentMapper {
    EmployeeDocument toEntity(EmployeeDocumentDTO dto);
    EmployeeDocumentDTO toDTO(EmployeeDocument entity);
}
