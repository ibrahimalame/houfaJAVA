package com.cmps253.hiringmanager2.resource;

import com.cmps253.hiringmanager2.model.employee;
import com.cmps253.hiringmanager2.service.employeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/employee")
public class employeeResource {
    private final employeeService employeeService;

    public employeeResource(employeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<employee>> getAllEmployees () {
        List<employee> employees = employeeService.findAllEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public employee getEmployeeById(@PathVariable("id") Long id) { //ResponseEntity<employee>
        employee employee = employeeService.findEmployeeById(id);
        return employee;// new ResponseEntity<>(employee, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<employee> addEmployee(@RequestBody employee employee){
        employeeService.addEmployee(employee);
        return new ResponseEntity<>(employee, HttpStatus.ACCEPTED);
    }
    @PutMapping("/update")
    public ResponseEntity<employee> updateEmployee(@RequestBody employee employee) {
        employee updateEmployee = employeeService.updateEmployee(employee);
        return new ResponseEntity<>(updateEmployee, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Long id) {
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
