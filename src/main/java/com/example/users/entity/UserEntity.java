package com.example.users.entity;

import com.example.users.enums.TypeNotification;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "user")
public class UserEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private LocalDate dateBirth;

    private String document;

    private String phone;

    private String email;

    @Enumerated(EnumType.STRING)
    private TypeNotification type;

    public UserEntity(){}

    public UserEntity(String name, LocalDate dateBirth, String document, String phone, String email, TypeNotification type) {
        this.name = name;
        this.dateBirth = dateBirth;
        this.document = document;
        this.email = email;
        this.phone = phone;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public TypeNotification getType() {
        return type;
    }

    public void setType(TypeNotification type) {
        this.type = type;
    }
}
