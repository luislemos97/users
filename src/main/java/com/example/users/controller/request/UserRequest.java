package com.example.users.controller.request;

import com.example.users.enums.TypeNotification;

import javax.validation.constraints.Email;
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

    private TypeNotification type;

    private String phone;

    @Email
    private String email;

    public UserRequest(){}

    public UserRequest(String name, LocalDate dateBirth, String document, String phone, String email, TypeNotification type) {
        this.name = name;
        this.dateBirth = dateBirth;
        this.document = document;
        this.email = email;
        this.phone = phone;
        this.type = type;
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

    public TypeNotification getType() {
        return type;
    }

    public void setType(TypeNotification type) {
        this.type = type;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
