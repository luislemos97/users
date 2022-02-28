package com.example.users.service.impl;

import com.example.users.service.NotificationService;
import com.example.users.service.model.SendModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl implements NotificationService {

    private static final Logger log = LoggerFactory.getLogger(NotificationServiceImpl.class);

    @Override
    public void send(SendModel model) {
        log.info("Send to {}  with provider {}", model.getTo(), model.getType().name());
    }
}
