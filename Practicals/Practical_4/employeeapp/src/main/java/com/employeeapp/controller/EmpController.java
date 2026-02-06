package com.employeeapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeeapp.dto.DeptEmpResponse;
import com.employeeapp.entities.Employee;
import com.employeeapp.service.DepartmentService;
import com.employeeapp.service.EmployeeService;

@RequestMapping("employees")
@RestController
public class EmpController {
    @Autowired
    private final EmployeeService employeeService;
    
    @Autowired
    private final DepartmentService departmentService;

    public EmpController(EmployeeService employeeService, DepartmentService departmentService) {
        this.employeeService = employeeService;
        this.departmentService = departmentService;
    }

    @GetMapping(path = "allemployees")
    public List<Employee> getAllEmp(){
        return employeeService.getAllEmployees();
    }

    @GetMapping(path = "employeesdata")
    public List<DeptEmpResponse> getAllEmpSelectedData(){
        return departmentService.getDeptEmployeeData();
    }
}
