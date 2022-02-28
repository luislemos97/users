package com.example.users.controller.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class UserRequest {

    @NotEmpty
    private String name;

    @NotNull
    private LocalDate dateBirth;

    @NotEmpty
    private String document;

    public UserRequest(){}

    public UserRequest(String name, LocalDate dateBirth, String document) {
        this.name = name;
        this.dateBirth = dateBirth;
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
}
