package com.example.users.service.impl;

import com.example.users.controller.request.UserRequest;
import com.example.users.controller.response.UserResponse;
import com.example.users.entity.UserEntity;
import com.example.users.exception.UserNotFoundException;
import com.example.users.repository.UserRepository;
import com.example.users.service.NotificationService;
import com.example.users.service.UserService;
import com.example.users.service.model.SendModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    private final UserRepository userRepository;
    private final NotificationService notificationService;

    public UserServiceImpl(UserRepository userRepository, NotificationService notificationService) {
        this.userRepository = userRepository;
        this.notificationService = notificationService;
    }

    @Override
    public void create(UserRequest request) {
        var sendModel = buildSendModel(request);
        userRepository.save(new UserEntity(request.getName(), request.getDateBirth(), request.getDocument(), request.getPhone(), request.getEmail(), request.getType()));
        notificationService.send(sendModel);
        log.info("User {} created with success!", request.getName().split(" ")[0]);
    }

    private SendModel buildSendModel(UserRequest request){
       return switch (request.getType()){
            case SMS, WHATSAPP ->  new SendModel(request.getPhone(), request.getType());
            default -> new SendModel(request.getEmail(), request.getType());
        };
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
