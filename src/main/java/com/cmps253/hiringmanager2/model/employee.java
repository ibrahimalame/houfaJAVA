package com.cmps253.hiringmanager2.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private long id;
    @Column(name = "first_name")
    private String name;
    @Column(name = "last_name")
    private String vacancy;
    @Column(unique = true)
    private String email;
    @Column(name="phone_number", unique = true)
    private String phone;

    public employee() {}

    public employee(String name, String vacancy, String email, String phone) {
        this.name = name;
        this.vacancy = vacancy;
        this.email = email;
        this.phone = phone;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVacancy() {
        return vacancy;
    }

    public void setVacancy(String vacancy) {
        this.vacancy = vacancy;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", vacancy='" + vacancy + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
