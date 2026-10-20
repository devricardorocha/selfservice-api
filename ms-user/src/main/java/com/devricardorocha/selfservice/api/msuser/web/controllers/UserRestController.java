package com.devricardorocha.selfservice.api.msuser.web.controllers;

import com.devricardorocha.selfservice.api.msuser.service.UserService;
import com.devricardorocha.selfservice.api.msuser.web.resources.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserRestController {

    private final UserService service;

    @PostMapping
    public ResponseEntity<UserDTO> create(@RequestBody UserDTO body) {
        UserDTO responseBody = this.service.create(body);
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
