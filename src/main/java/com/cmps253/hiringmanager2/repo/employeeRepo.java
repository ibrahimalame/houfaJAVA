package com.cmps253.hiringmanager2.repo;
import com.cmps253.hiringmanager2.model.employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface employeeRepo extends JpaRepository<employee, Long> {
    void deleteEmployeeById(Long id);
    Optional<employee> findEmployeeById(Long id);
}