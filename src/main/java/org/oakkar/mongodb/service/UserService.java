package org.oakkar.mongodb.service;

import org.oakkar.mongodb.model.dto.UserDto;
import org.oakkar.mongodb.model.payload.request.UserRequest;

public interface UserService {
    UserDto createUser(UserRequest request);

    UserDto getUser(String id);

    UserDto updateUsername(String id, UserRequest request);
}
