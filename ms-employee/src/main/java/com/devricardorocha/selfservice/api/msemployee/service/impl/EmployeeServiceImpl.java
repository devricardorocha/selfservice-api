package com.devricardorocha.selfservice.api.msemployee.service.impl;

import com.devricardorocha.selfservice.api.msemployee.mapper.EmployeeMapper;
import com.devricardorocha.selfservice.api.msemployee.model.entities.Employee;
import com.devricardorocha.selfservice.api.msemployee.repository.EmployeeRepository;
import com.devricardorocha.selfservice.api.msemployee.service.EmployeeService;
import com.devricardorocha.selfservice.api.msemployee.web.resources.EmployeeDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository repository;
    private final EmployeeMapper mapper;

    @Override
    public EmployeeDTO create(EmployeeDTO body) {
        final Employee newEmployee = this.mapper.toEntity(body);
        if (newEmployee.getAddress() != null) {
            newEmployee.getAddress().setEmployee(newEmployee);
        }
        if (newEmployee.getEmployeeDocument() != null) {
            newEmployee.getEmployeeDocument().setEmployee(newEmployee);
        }
        if (newEmployee.getContactEmails() != null && !newEmployee.getContactEmails().isEmpty()) {
            newEmployee.getContactEmails().stream().forEach(e -> e.setEmployee(newEmployee));
        }
        if (newEmployee.getContactPhoneNumbers() != null && !newEmployee.getContactPhoneNumbers().isEmpty()) {
            newEmployee.getContactPhoneNumbers().stream().forEach(e -> e.setEmployee(newEmployee));
        }
        final Employee createdEmployee = this.repository.save(newEmployee);
        return this.mapper.toDTO(createdEmployee);
    }
}
