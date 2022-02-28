package com.example.users.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
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

    public UserEntity(){}

    public UserEntity(String name, LocalDate dateBirth, String document) {
        this.name = name;
        this.dateBirth = dateBirth;
        this.document = document;
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
}
