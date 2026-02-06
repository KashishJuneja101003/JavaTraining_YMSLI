package com.employeeapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.employeeapp.entities.Department;
import com.employeeapp.service.DepartmentService;

@RestController
public class DeptController {
    @Autowired
    private final DepartmentService departmentService;

    public DeptController(DepartmentService departmentService) {
		super();
		this.departmentService = departmentService;
	}

	@GetMapping(path = "departments")
    public List<Department> getAll(){
        return departmentService.getAllDepartments();
    }

    @GetMapping(path = "departments/{id}")
    public Department getById(@PathVariable int id){
        return departmentService.getDepartmentById(id);
    }


}
