package com.employeeapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employeeapp.dto.DeptEmpResponse;
import com.employeeapp.entities.Employee;
import com.employeeapp.repo.DepartmentRepo;
import com.employeeapp.repo.EmployeeRepo;

@RestController
public class EmpController {
    @Autowired
    private final EmployeeRepo employeeRepo;
    
    @Autowired
    private final DepartmentRepo departmentRepo;


    public EmpController(EmployeeRepo employeeRepo, DepartmentRepo departmentRepo) {
		super();
		this.employeeRepo = employeeRepo;
		this.departmentRepo = departmentRepo;
	}

    @GetMapping(path = "employees")
    public List<Employee> getAllEmp(
            @RequestParam(name = "dName", required = false) String dName) {

        if (dName == null || dName.isEmpty()) {
            return employeeRepo.findAll();
        }
        return employeeRepo.findByDepartmentDname(dName);
    }


    @GetMapping(path = "employeesdata")
    public List<DeptEmpResponse> getAllEmpSelectedData(){
        return departmentRepo.deptEmployeeData();
    }
}
