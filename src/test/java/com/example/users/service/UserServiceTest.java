package com.example.users.service;

import com.example.users.controller.request.UserRequest;
import com.example.users.enums.TypeNotification;
import com.example.users.repository.UserRepository;
import com.example.users.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserRepository repository;

    @Mock
    private NotificationService notificationService;

    @InjectMocks
    private UserServiceImpl service;

    @Test
    public void create_user_with_success(){
        when(repository.save(any())).thenReturn(any());

        service.create(new UserRequest("test", LocalDate.now().minusYears(20), "0123456789", "553198234567", "teste@teste.com", TypeNotification.WHATSAPP));

        verify(repository).save(any());
        verify(notificationService).send(any());
    }
}
