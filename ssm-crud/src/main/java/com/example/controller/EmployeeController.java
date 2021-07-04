package com.example.controller;

import com.example.bean.Employee;
import com.example.result.Msg;
import com.example.service.EmployeeService;
import com.example.util.UUIDUtil;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * @PROJECT_NAME: ssm-crud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2021/7/1 22:56
 */
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(path = "/emp", method = RequestMethod.POST)
    public Msg addEmp(@Valid Employee employee) {
        System.out.println("----");
        employee.setId(UUIDUtil.uuid2());
        employee.setIp(UUIDUtil.getIP());
        employee.setDepId("1");
        employeeService.getData();
        employeeService.addEmp(employee);
        return Msg.success();
    }

}
