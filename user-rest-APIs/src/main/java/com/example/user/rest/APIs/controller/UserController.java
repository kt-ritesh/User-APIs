package com.example.user.rest.APIs.controller;

import com.example.user.rest.APIs.model.User;
import com.example.user.rest.APIs.service.UserService;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("user")
    public ResponseEntity<String> addUser(@Valid @RequestBody User user){
        return userService.addUser(user);
    }
}
