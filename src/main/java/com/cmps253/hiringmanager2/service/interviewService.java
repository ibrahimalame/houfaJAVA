package com.cmps253.hiringmanager2.service;

import com.cmps253.hiringmanager2.exception.UserNotFoundException;
import com.cmps253.hiringmanager2.model.interview;
import com.cmps253.hiringmanager2.repo.interviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class interviewService {
    private final interviewRepo interviewRepo ;

    @Autowired
    public interviewService(interviewRepo interviewRepo) {
        this.interviewRepo = interviewRepo;
    }

    public List<interview> findAllInterviews() {
        return  interviewRepo.findAll();
    }
    public interview updateInterview(interview interview) {
        return interviewRepo.save(interview);
    }
    public interview findInterviewById(Long id) {
        return interviewRepo.findInterviewById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }
    public void deleteInterview(Long id){
        interviewRepo.deleteInterviewById(id);
    }

}