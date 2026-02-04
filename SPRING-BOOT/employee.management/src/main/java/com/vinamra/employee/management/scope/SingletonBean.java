package com.vinamra.employee.management.scope;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
    public SingletonBean() {
        System.out.println("SingletonBean constructor called");
    }
}
