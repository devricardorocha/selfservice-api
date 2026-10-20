package com.devricardorocha.selfservice.api.msuser.service;

import com.devricardorocha.selfservice.api.msuser.web.resources.UserDTO;

public interface UserService {
    UserDTO create(UserDTO body);
}
