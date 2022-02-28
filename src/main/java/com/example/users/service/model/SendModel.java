package com.example.users.service.model;

import com.example.users.enums.TypeNotification;

public class SendModel {

    private String to;
    private TypeNotification type;

    public SendModel(String to, TypeNotification type) {
        this.to = to;
        this.type = type;
    }

    public String getTo() {
        return to;
    }

    public TypeNotification getType() {
        return type;
    }
}
