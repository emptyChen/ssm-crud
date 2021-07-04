package com.example.dao;


import com.example.bean.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper {

    void addEmp(Employee employee);

}
