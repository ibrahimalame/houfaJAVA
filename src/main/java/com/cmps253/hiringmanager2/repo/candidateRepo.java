package com.cmps253.hiringmanager2.repo;

import com.cmps253.hiringmanager2.model.candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface candidateRepo extends JpaRepository<candidate, Long> {
    void deleteCandidateById(Long id);

    Optional<candidate> findCandidateById(Long id);
}

