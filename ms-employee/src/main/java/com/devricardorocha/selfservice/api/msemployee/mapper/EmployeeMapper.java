package com.devricardorocha.selfservice.api.msemployee.mapper;

import com.devricardorocha.selfservice.api.msemployee.model.entities.Employee;
import com.devricardorocha.selfservice.api.msemployee.web.resources.EmployeeDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {
    AddressMapper.class, EmailMapper.class, PhoneNumberMapper.class, EmployeeDocumentMapper.class
})
public interface EmployeeMapper {
    Employee toEntity(EmployeeDTO dto);
    EmployeeDTO toDTO(Employee entity);
}
