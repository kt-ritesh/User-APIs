package com.example.user.rest.APIs.service;

import com.example.user.rest.APIs.model.User;
import com.example.user.rest.APIs.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    IUserRepo userRepo;

    public ResponseEntity<String> addUser(User user) {
        Long newId = user.getId();
        User existingUser = userRepo.findById(newId).orElse(null);

        if(existingUser!=null){
            return new ResponseEntity<>("User already registered with this id..", HttpStatus.BAD_REQUEST);
        }

        userRepo.save(user);
        return new ResponseEntity<>("User added successfully", HttpStatus.OK);
    }

    public ResponseEntity<User> getUser(Long userId){
        
    }
}
