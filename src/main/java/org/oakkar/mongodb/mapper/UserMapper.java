package org.oakkar.mongodb.mapper;

import org.oakkar.mongodb.model.dto.UserDto;
import org.oakkar.mongodb.model.entity.User;

public interface UserMapper {
    UserDto mapToDto(User savedUser);
}
