package com.qiaoqing.springboot.cruddemo.service;

import com.qiaoqing.springboot.cruddemo.dao.EmployeeDAO;
import com.qiaoqing.springboot.cruddemo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDAO employeeDAO;

    public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO) {
        employeeDAO = theEmployeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return null;
    }
}
