package com.cmps253.hiringmanager2.resource;
import com.cmps253.hiringmanager2.model.candidate;
import com.cmps253.hiringmanager2.service.candidateService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/candidate")
public class candidateResource {
    private final candidateService candidateService;

    public candidateResource(candidateService candidateService) {
        this.candidateService = candidateService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<candidate>> getAllCandidates () {
        List<candidate> candidates = candidateService.findAllCandidates();
        return new ResponseEntity<>(candidates, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<candidate> getEmployeeById(@PathVariable("id") Long id) {
        candidate candidate = candidateService.findCandidateById(id);
        return new ResponseEntity<>(candidate, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<candidate> addCandidate(@RequestBody candidate candidate){
        candidate newCandidate = candidateService.addCandidate(candidate);
        return new ResponseEntity<>(newCandidate, HttpStatus.CREATED);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<candidate> updateCandidate(@RequestBody candidate candidate) {
        candidate updateCandidate = candidateService.updateCandidate(candidate);
        return new ResponseEntity<>(updateCandidate, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteCandidate(@PathVariable("id") Long id) {
        candidateService.deleteCandidate(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
