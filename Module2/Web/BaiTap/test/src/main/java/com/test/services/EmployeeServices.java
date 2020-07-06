package com.test.services;

import com.test.entity.Employee;

import java.util.List;

public interface EmployeeServices {
    List<Employee> findAll();
    Employee findById(Integer id);
    void remove(Integer id);
    List<Employee> searchByKey(String keyword);
    void save(Employee employee);
    List<String> getListType();
}
