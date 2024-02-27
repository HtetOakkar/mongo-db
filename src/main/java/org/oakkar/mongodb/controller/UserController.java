package org.oakkar.mongodb.controller;

import lombok.RequiredArgsConstructor;
import org.oakkar.mongodb.model.dto.UserDto;
import org.oakkar.mongodb.model.payload.request.UserRequest;
import org.oakkar.mongodb.repository.UserRepository;
import org.oakkar.mongodb.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody UserRequest request) {

        UserDto createdUser = userService.createUser(request);
        return ResponseEntity.created(URI.create("/api/users/"+ createdUser.getId())).body(createdUser);

    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUser(@PathVariable String id) {
        UserDto foundUser = userService.getUser(id);
        return ResponseEntity.ok(foundUser);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> updateUsername(@PathVariable String id, @RequestBody UserRequest request) {
        UserDto updatedUser = userService.updateUsername(id, request);
        return ResponseEntity.ok(updatedUser);
    }


}
