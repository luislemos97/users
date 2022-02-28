package com.example.users.service.impl;

import com.example.users.controller.request.UserRequest;
import com.example.users.controller.response.UserResponse;
import com.example.users.entity.UserEntity;
import com.example.users.exception.UserNotFoundException;
import com.example.users.repository.UserRepository;
import com.example.users.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void create(UserRequest request) {
        userRepository.save(new UserEntity(request.getName(), request.getDateBirth(), request.getDocument()));
        log.info("User {} created with success!", request.getName().split(" ")[0]);
    }

    @Override
    public UserResponse findById(Long id) {
        var entity = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not found with id: " + id));
        return new UserResponse(entity.getName(), entity.getDateBirth(), entity.getDocument());
    }

    @Override
    public void remove(Long id) {
        var entity = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not found with id: " + id));
        userRepository.delete(entity);
    }
}
