package com.cmps253.hiringmanager2.resource;


import com.cmps253.hiringmanager2.model.vacancy;
import com.cmps253.hiringmanager2.service.vacancyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@CrossOrigin(origins = "http://localhost:3000")
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
    /*@PutMapping("/update/{id}")
    public ResponseEntity<vacancy> updateVacancy(@RequestBody vacancy vacancy) {
        vacancy updateVacancy = vacancyservice.updateVacancy(vacancy);
        return new ResponseEntity<>(updateVacancy, HttpStatus.OK);
    }*/
    @PostMapping(path="/add")
    //@RequestMapping(value="/add/{id}",method = RequestMethod.POST)
    public ResponseEntity<vacancy> addVacancy(@RequestBody vacancy vac) {//  @RequestParam String title,@RequestParam LocalDateTime date) {
        vac.setTime(LocalDateTime.now());
        vacancy updateVacancy = vacancyservice.updateVacancy(vac);//LocalDateTime.now()));
        return new ResponseEntity<>(updateVacancy, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteVacancy(@PathVariable("id") Long id) {
        vacancyservice.deleteVacancy(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    public static void main(String[] str){
        String titre="mbaied";
        LocalDateTime date = LocalDateTime.now();
        vacancy myvacancy = new vacancy(titre,date);

    }
}
