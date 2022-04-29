package com.cmps253.hiringmanager2.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class vacancy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false, unique = true)
    private long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = true)
    private String description;
    @Column(nullable =true)
    private LocalDateTime time;
    @Column(nullable = true)
    private String abst;
    @Column(nullable = true)
    private String resp;
    @Column(nullable = true)
    private String profile;
    @Column(nullable = true)
    private String duration;
    @Column(nullable = true)
    private String salary;



    public vacancy(){}

    public vacancy(String title, String description) {
        this.title = title;
        this.description = description;
    }


    public vacancy(String title, String description, LocalDateTime time, String abst, String resp, String profile, String duration, String salary) {
        this.title = title;
        this.description = description;
        this.time = time;
        this.abst = abst;
        this.resp = resp;
        this.profile = profile;
        this.duration = duration;
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAbstrac() {
        return abst;
    }

    public void setAbstrac(String abst) {
        this.abst = abst;
    }

    public String getResponsabilities() {
        return resp;
    }

    public void setResponsabilities(String resp) {
        this.resp = resp;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
