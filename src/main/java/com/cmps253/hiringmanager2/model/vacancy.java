package com.cmps253.hiringmanager2.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class vacancy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false, unique = true)
    private long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private LocalDateTime time;

    public vacancy(){}

    public vacancy(String title, LocalDateTime time) {
        this.title = title;
        this.time = time;
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
}
