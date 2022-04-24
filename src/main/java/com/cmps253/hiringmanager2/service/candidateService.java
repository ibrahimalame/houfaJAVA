package com.cmps253.hiringmanager2.service;

import com.cmps253.hiringmanager2.exception.UserNotFoundException;
import com.cmps253.hiringmanager2.model.candidate;
import com.cmps253.hiringmanager2.repo.candidateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class candidateService {
    private final candidateRepo candidateRepo;

    @Autowired
    public candidateService(candidateRepo candidateRepo) {this.candidateRepo = candidateRepo;}
    public List<candidate> findAllCandidates() {
        return candidateRepo.findAll();
    }
    public candidate addCandidate(candidate candidate){ return candidateRepo.save(candidate);}
    public candidate updateCandidate(candidate candidate) {return candidateRepo.save(candidate);}
    public candidate findCandidateById(Long id) {
        return candidateRepo.findCandidateById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    public void deleteCandidate(Long id) {
        candidateRepo.deleteCandidateById(id);
    }
}
