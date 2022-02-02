package com.example.employeesystemapi.services;

import com.example.employeesystemapi.model.Employee;

import java.util.List;


public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getEmployees();

    boolean deleteEmployee(Long id);

    Employee getEmployeeById(Long id);

    Employee updateEmployee(Long id, Employee employee);
}
