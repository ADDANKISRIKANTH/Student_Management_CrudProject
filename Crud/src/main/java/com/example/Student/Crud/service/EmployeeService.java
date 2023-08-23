package com.example.Student.Crud.service;

import com.example.Student.Crud.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    void saveEmployees(Employee employee);

    public Employee getEmployeeById(long id);

    void deleteEmployeeById(long id);
}
