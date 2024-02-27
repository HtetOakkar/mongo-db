package org.oakkar.mongodb.service.impl;

import lombok.RequiredArgsConstructor;
import org.oakkar.mongodb.exception.ResourceNotFoundException;
import org.oakkar.mongodb.mapper.UserMapper;
import org.oakkar.mongodb.model.dto.UserDto;
import org.oakkar.mongodb.model.entity.Account;
import org.oakkar.mongodb.model.entity.User;
import org.oakkar.mongodb.model.payload.request.UserRequest;
import org.oakkar.mongodb.repository.AccountRepository;
import org.oakkar.mongodb.repository.UserRepository;
import org.oakkar.mongodb.service.UserService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    private final UserMapper userMapper;

    private final AccountRepository accountRepository;

    private User getUserById(String id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id : " + id));
    }

    @Override
    public UserDto createUser(UserRequest request) {
        User user = new User();
        user.setFullName(request.getFullName());
        Account account = new Account();
        account.setUsername(request.getUsername());
        account.setPassword(request.getPassword());
        Account savedAccount = accountRepository.save(account);
        user.setAccount(account);

        return userMapper.mapToDto(userRepository.save(user));
    }

    @Override
    public UserDto getUser(String id) {
        return userMapper.mapToDto(getUserById(id));
    }

    @Override
    public UserDto updateUsername(String id, UserRequest request) {
        User foundUser = getUserById(id);
        foundUser.setFullName(request.getUsername());
        return userMapper.mapToDto(userRepository.save(foundUser));
    }
}
