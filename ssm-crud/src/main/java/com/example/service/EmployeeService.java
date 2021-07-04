package com.example.service;

import com.example.bean.Employee;
import com.example.dao.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @PROJECT_NAME: ssm-crud
 * @DESCRIPTION:
 * @USER: 冰淇淋分你一半
 * @DATE: 2021/7/1 22:59
 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    public void addEmp(Employee employee) {
        employeeMapper.addEmp(employee);
    }

}
