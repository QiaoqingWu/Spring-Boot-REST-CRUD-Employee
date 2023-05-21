package com.qiaoqing.springboot.cruddemo.service;

import com.qiaoqing.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
}
