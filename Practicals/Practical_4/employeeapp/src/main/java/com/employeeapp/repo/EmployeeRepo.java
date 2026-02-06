package com.employeeapp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.employeeapp.entities.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	@Query("SELECT DISTINCT e FROM Employee e JOIN e.department d WHERE d.dname = :dname")		
	List<Employee> findByDepartmentDname(@Param("dname") String dname);
}
