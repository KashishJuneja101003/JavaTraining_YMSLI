package com.employeeapp.service;

import com.employeeapp.dto.DeptEmpResponse;
import com.employeeapp.entities.Department;
import com.employeeapp.exceptions.ResouceNotFoundException;
import com.employeeapp.repo.DepartmentRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepo departmentRepo;

    public DepartmentServiceImpl(DepartmentRepo departmentRepo) {
        this.departmentRepo = departmentRepo;
    }

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepo.findAllWithEmployees();
    }

    @Override
    public Department getDepartmentById(int id) {
        return departmentRepo.findById(id)
                .orElseThrow(() -> new ResouceNotFoundException("Department not found"));
    }

    @Override
    public List<DeptEmpResponse> getDeptEmployeeData() {
        return departmentRepo.deptEmployeeData();
    }
}
