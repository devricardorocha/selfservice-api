package com.devricardorocha.selfservice.api.msuser.service.impl;

import com.devricardorocha.selfservice.api.msuser.mapper.UserMapper;
import com.devricardorocha.selfservice.api.msuser.model.entities.User;
import com.devricardorocha.selfservice.api.msuser.repository.UserRepository;
import com.devricardorocha.selfservice.api.msuser.service.UserService;
import com.devricardorocha.selfservice.api.msuser.web.resources.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    private final UserMapper mapper;

    @Override
    public UserDTO create(UserDTO body) {
        final User newUser = this.mapper.toEntity(body);
        if (newUser.getAddress() != null) {
            newUser.getAddress().setUser(newUser);
        }
        if (newUser.getUserDocument() != null) {
            newUser.getUserDocument().setUser(newUser);
        }
        if (newUser.getContactEmails() != null && !newUser.getContactEmails().isEmpty()) {
            newUser.getContactEmails().stream().forEach(e -> e.setUser(newUser));
        }
        if (newUser.getContactPhoneNumbers() != null && !newUser.getContactPhoneNumbers().isEmpty()) {
            newUser.getContactPhoneNumbers().stream().forEach(e -> e.setUser(newUser));
        }
        final User createdUser = this.repository.save(newUser);
        return this.mapper.toDTO(createdUser);
    }
}
