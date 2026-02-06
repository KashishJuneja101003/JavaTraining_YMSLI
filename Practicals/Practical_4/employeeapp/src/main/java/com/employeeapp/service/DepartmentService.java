package com.employeeapp.service;

import com.employeeapp.dto.DeptEmpResponse;
import com.employeeapp.entities.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> getAllDepartments();
    Department getDepartmentById(int id);
    List<DeptEmpResponse> getDeptEmployeeData();
}
