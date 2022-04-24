package com.cmps253.hiringmanager2.resource;

 import com.cmps253.hiringmanager2.model.interview;
import com.cmps253.hiringmanager2.service.interviewService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/interview")
public class interviewResource {
    private final interviewService interviewService;

    public interviewResource(interviewService interviewService) {
        this.interviewService = interviewService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<interview>> getAllInterviews () {
        List<interview> interviews = interviewService.findAllInterviews();
        return new ResponseEntity<>(interviews, HttpStatus.OK);
    }    @GetMapping("/find/{id}")
    public ResponseEntity<interview> getInterviewById(@PathVariable("id") Long id) {
        interview interview = interviewService.findInterviewById(id);
        return new ResponseEntity<>(interview, HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<interview> updateInterview(@RequestBody interview interview) {
        interview updateInterview = interviewService.updateInterview(interview);
        return new ResponseEntity<>(updateInterview, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteInterview(@PathVariable("id") Long id) {
        interviewService.deleteInterview(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}