package com.cmps253.hiringmanager2.resource;


import com.cmps253.hiringmanager2.model.vacancy;
import com.cmps253.hiringmanager2.service.vacancyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vacancy")
public class vacancyResource {
    private final vacancyService vacancyservice;

    public vacancyResource(vacancyService vacancyservice){this.vacancyservice = vacancyservice;}
    @GetMapping("/all")
    public ResponseEntity<List<vacancy>> getAllVacancies () {
        List<vacancy> vacancies = vacancyservice.findAllVacancies();
        return new ResponseEntity<>(vacancies, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<vacancy> getVacancyById(@PathVariable("id") Long id) {
        vacancy getVacancy = vacancyservice.findVacancyById(id);
        return new ResponseEntity<>(getVacancy, HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<vacancy> updateVacancy(@RequestBody vacancy vacancy) {
        vacancy updateVacancy = vacancyservice.updateVacancy(vacancy);
        return new ResponseEntity<>(updateVacancy, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteVacancy(@PathVariable("id") Long id) {
        vacancyservice.deleteVacancy(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
