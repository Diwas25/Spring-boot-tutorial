package com.springmasterclass.Springboot.tutorial.service;

import com.springmasterclass.Springboot.tutorial.entity.Department;
import com.springmasterclass.Springboot.tutorial.repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
class DepartmentServiceTest {

    @Autowired
    private DepartmentService departmentService;

    @MockBean
    private DepartmentRepository departmentRepository;

    @BeforeEach
    void setUp() {
        Department department = Department.builder()
                .departmentName("EEE")
                .departmentAddress("Pune")
                .departmentCode("EEE-07")
                .departmentId(3L)
                .build();
        when(departmentRepository.findByDepartmentNameIgnoreCase("EEE"))
                .thenReturn(department);
    }

    @Test
    @DisplayName("Get Data based on Valid Department Name")
    public void testFetchDepartmentbyName(){
        String departmentName = "EEE";
        Department found = departmentService.fetchDepartmentbyName(departmentName);
        assertEquals(departmentName,found.getDepartmentName());
    }
}