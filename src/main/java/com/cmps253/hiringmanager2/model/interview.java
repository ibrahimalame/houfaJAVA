package com.cmps253.hiringmanager2.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class interview implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false, unique = true)
    private long id;
    private String time;

    public interview() {
    }

    public interview(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
