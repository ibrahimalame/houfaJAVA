package com.cmps253.hiringmanager2.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
public class interview implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false, unique = true)
    private Integer id;
    private LocalDateTime time;

    @Column(name = "vacancy_id")
    private Integer vacancyId;
    @Column(name = "candidate_id")
    private Integer candidateId;

    public interview() {
    }

    public interview(LocalDateTime time, String name, Integer vacancyId, Integer candidateId) {
        this.time = time;
        this.vacancyId = vacancyId;
        this.candidateId = candidateId;
    }


    public Integer getVacancyId() {
        return vacancyId;
    }

    public void setVacancyId(Integer vacancyId) {
        this.vacancyId = vacancyId;
    }

    public Integer getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(Integer candidateId) {
        this.candidateId = candidateId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
