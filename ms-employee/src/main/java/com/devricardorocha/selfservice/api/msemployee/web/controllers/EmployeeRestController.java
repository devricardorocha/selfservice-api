package com.devricardorocha.selfservice.api.msemployee.web.controllers;

import com.devricardorocha.selfservice.api.msemployee.service.EmployeeService;
import com.devricardorocha.selfservice.api.msemployee.web.resources.EmployeeDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/api/v1/employees")
@RequiredArgsConstructor
public class EmployeeRestController {

    private final EmployeeService service;

    @PostMapping
    public ResponseEntity<EmployeeDTO> create(@RequestBody EmployeeDTO body) {
        EmployeeDTO responseBody = this.service.create(body);
        return ResponseEntity
                .created(toURI("/{id}", responseBody.getCode()))
                .body(responseBody);
    }

    private URI toURI(String path, Object ...params) {
        return ServletUriComponentsBuilder.fromCurrentRequest()
                .path(path)
                .buildAndExpand(params)
                .toUri();
    }

}
