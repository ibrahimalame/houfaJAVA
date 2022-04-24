package com.cmps253.hiringmanager2.repo;

import com.cmps253.hiringmanager2.model.vacancy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface vacancyRepo extends JpaRepository<vacancy, Long> {
    void deleteVacancyById(Long id);

    Optional<vacancy> findVacancyById(Long id);
}
