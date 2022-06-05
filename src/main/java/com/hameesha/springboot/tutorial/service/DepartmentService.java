package com.hameesha.springboot.tutorial.service;

import java.util.List;

import com.hameesha.springboot.tutorial.entity.Department;

public interface DepartmentService {

    Department saveDepartment(Department department);

    List<Department> fetchAllDepartments();

    Department fetchDepartmentById(Long departmentId);

    void deleteDepartmentById(Long departmentId);

    Department updateDepartment(Long departmentId, Department department);

    Department fetchDepartmentByName(String departmentName);
    
}
