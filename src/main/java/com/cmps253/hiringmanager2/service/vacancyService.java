package com.cmps253.hiringmanager2.service;

import com.cmps253.hiringmanager2.exception.UserNotFoundException;
import com.cmps253.hiringmanager2.model.vacancy;
import com.cmps253.hiringmanager2.repo.vacancyRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class vacancyService {
    private final vacancyRepo vacancyrepo;

    public vacancyService(vacancyRepo vacancyrepo){ this.vacancyrepo = vacancyrepo;}
    public List<vacancy> findAllVacancies(){ return vacancyrepo.findAll();}
    public vacancy updateVacancy(vacancy vacancy){ return vacancyrepo.save(vacancy);}
    public vacancy findVacancyById(Long id){
        return vacancyrepo.findVacancyById(id)
                .orElseThrow(() ->new UserNotFoundException("The Vacancy by id " + id + " was not found"));
    }
    public void deleteVacancy(Long id){ vacancyrepo.deleteVacancyById(id);}
}
