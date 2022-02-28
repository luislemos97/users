package com.example.users.controller.response;

import java.time.LocalDate;

public class UserResponse {

    private String name;
    private LocalDate dateBirth;
    private String document;

    public UserResponse(String name, LocalDate dateBirth, String document) {
        this.name = name;
        this.dateBirth = dateBirth;
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public String getDocument() {
        return document;
    }
}
