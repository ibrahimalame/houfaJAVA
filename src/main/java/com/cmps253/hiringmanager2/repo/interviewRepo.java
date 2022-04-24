package com.cmps253.hiringmanager2.repo;

import com.cmps253.hiringmanager2.model.interview;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface interviewRepo extends JpaRepository<interview, Long> {
    void deleteInterviewById(Long id);

    Optional<interview> findInterviewById(Long id);
}
