package com.cmps253.hiringmanager2.service;

import com.cmps253.hiringmanager2.exception.UserNotFoundException;
import com.cmps253.hiringmanager2.model.employee;
import com.cmps253.hiringmanager2.repo.employeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class employeeService {
    private final employeeRepo employeeRepo;

    @Autowired
    public employeeService(employeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }
    public List<employee> findAllEmployees() {
        return  employeeRepo.findAll();
    }
    public employee updateEmployee(employee employee) {
        return employeeRepo.save(employee);
    }
    public employee findEmployeeById(Long id) {
        return employeeRepo.findEmployeeById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }
    public void addEmployee(employee employee) {
        employee employee1 = employeeRepo.
                save(new employee(employee.getName(),
                        employee.getVacancy(),
                        employee.getEmail(),
                        employee.getPhone()));
    }

    public void deleteEmployee(Long id){
        employeeRepo.deleteEmployeeById(id);
    }
}
