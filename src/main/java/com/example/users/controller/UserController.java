package com.example.users.controller;

import com.example.users.controller.request.UserRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("users")
public class UserController {

    @PostMapping
    public ResponseEntity create(@RequestBody @Valid UserRequest request){
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
