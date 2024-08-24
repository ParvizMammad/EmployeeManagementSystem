package com.example.employeeManagementSystem.service;


import com.example.employeeManagementSystem.model.Employee;
import com.example.employeeManagementSystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

   public Optional<Employee> findById(Long id){
    return employeeRepository.findById(id);
   }

   public List<Employee> findAllEmployee(Employee employee){
        return employeeRepository.findAll();
   }

    public Employee updateEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public void deleteEmployeeById(Long id){
        employeeRepository.deleteById(id);
    }


}
