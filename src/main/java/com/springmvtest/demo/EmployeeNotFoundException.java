package com.springmvtest.demo;

public class EmployeeNotFoundException extends RuntimeException {
    EmployeeNotFoundException(){
        super("Employee Not Found");
    }
    EmployeeNotFoundException(Long id){
        super("Employee ID " + id + " cannot be found");
    }
}
