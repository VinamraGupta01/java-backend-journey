package com.vinamra.employee.management.service;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    public void addEmployee() {
        System.out.println("Employee added using Dependency Injection");
    }
}
