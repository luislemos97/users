package com.example.users.controller;

import com.example.users.controller.request.UserRequest;
import com.example.users.controller.response.UserResponse;
import com.example.users.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity create(@RequestBody @Valid UserRequest request){
        service.create(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponse> findUserById(@PathVariable Long id){
        return ResponseEntity.ok(service.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removeById(@PathVariable Long id){
        service.remove(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
