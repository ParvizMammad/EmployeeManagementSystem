package com.example.employeeManagementSystem.controller;

import com.example.employeeManagementSystem.model.Employee;
import com.example.employeeManagementSystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }

    @GetMapping("/{id}")
   public Optional<Employee> findById(@PathVariable Long id){
        return employeeService.findById(id);
   }
   @GetMapping("/all")
   public List<Employee> findAllEmployee(Employee employee){
        return employeeService.findAllEmployee(employee);
   }

    @PutMapping
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping
    public void deleteEmployeeById(@PathVariable Long id){
        employeeService.deleteEmployeeById(id);
    }


}
