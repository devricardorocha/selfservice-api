package com.devricardorocha.selfservice.api.msemployee.service;

import com.devricardorocha.selfservice.api.msemployee.web.resources.EmployeeDTO;

public interface EmployeeService {
    EmployeeDTO create(EmployeeDTO body);
}
