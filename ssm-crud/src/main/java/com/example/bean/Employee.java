package com.example.bean;

import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private String id;

    @Pattern(regexp="(^[a-zA-Z0-9_-]{6,16}$)|(^[\u2E80-\u9FFF]{2,5})"
    		,message="用户名必须是2-5位中文或者6-16位英文和数字的组合")
    private String empName;

    private String gender;

    private String ip;

    @Pattern(regexp="^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$",
    		message="邮箱格式不正确")
    private String email;

    private String depId;
    
    //查询员工的同时部门信息也是查询好的
    private Department department;



}