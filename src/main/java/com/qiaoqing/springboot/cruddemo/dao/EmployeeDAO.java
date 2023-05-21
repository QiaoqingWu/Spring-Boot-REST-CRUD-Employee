package com.qiaoqing.springboot.cruddemo.dao;

import com.qiaoqing.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    // return a list of employees
    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}
