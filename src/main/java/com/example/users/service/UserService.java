package com.example.users.service;

import com.example.users.controller.request.UserRequest;
import com.example.users.controller.response.UserResponse;

public interface UserService {

    void create(UserRequest request);

    UserResponse findById(Long id);

    void remove(Long id);
}
