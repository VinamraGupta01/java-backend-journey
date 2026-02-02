package com.vinamra.employee.management.controller;

import com.vinamra.employee.management.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/test")
    public String testDI() {
        employeeService.addEmployee();
        return "Dependency Injection working!";
    }
}
