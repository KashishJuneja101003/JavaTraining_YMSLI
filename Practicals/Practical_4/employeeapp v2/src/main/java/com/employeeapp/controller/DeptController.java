package com.employeeapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.employeeapp.entities.Department;
import com.employeeapp.repo.DepartmentRepo;

@RestController
public class DeptController {
    @Autowired
    private final DepartmentRepo departmentRepo;

	
	public DeptController(DepartmentRepo departmentRepo) {
		super();
		this.departmentRepo = departmentRepo;
	}

	@GetMapping(path = "departments")
    public List<Department> getAll(){
        return departmentRepo.findAllWithEmployees();
    }

    @GetMapping(path = "departments/{id}")
    public Department getById(@PathVariable("id") Integer id){
        return departmentRepo.deptEmployeeData(id);
    }


}
