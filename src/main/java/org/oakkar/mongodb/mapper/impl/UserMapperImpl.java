package org.oakkar.mongodb.mapper.impl;

import org.oakkar.mongodb.mapper.UserMapper;
import org.oakkar.mongodb.model.dto.UserDto;
import org.oakkar.mongodb.model.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapperImpl implements UserMapper {
    @Override
    public UserDto mapToDto(User savedUser) {
        return UserDto.builder()
                .id(savedUser.getId())
                .fullName(savedUser.getFullName())
                .cratedAt(savedUser.getCreatedAt())
                .updatedAt(savedUser.getUpdatedAt())
                .version(savedUser.getVersion())
                .build();
    }
}
