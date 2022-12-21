package com.springmasterclass.Springboot.tutorial.service;

import com.springmasterclass.Springboot.tutorial.entity.Department;
import com.springmasterclass.Springboot.tutorial.error.DepartmentNotFound;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();

    Department fetchDepartmentbyId(Long departmentId) throws DepartmentNotFound;

    void deleteDepartmentbyId(Long departmentId);

    Department updateDepartment(Long departmentId, Department department);

    Department fetchDepartmentbyName(String departmentName);
}
