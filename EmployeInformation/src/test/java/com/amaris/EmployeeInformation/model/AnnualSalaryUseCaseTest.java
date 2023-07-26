package com.amaris.EmployeeInformation.model;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AnnualSalaryUseCaseTest {

    AnnualSalaryUseCase annualSalaryUseCase;
    private Employee employee;


    @BeforeEach
    void setUp() {
        annualSalaryUseCase = new AnnualSalaryUseCase();
        employee = new Employee();
        employee.setEmployeeAge("2");
        employee.setEmployeeSalary("1000");
        employee.setEmployeeName("Dayana");
        employee.setId(1);
        employee.setProfileImage("");
    }

    @Test
    void setAnnualSalary() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        List<Employee> res = annualSalaryUseCase.setAnnualSalary(employeeList);
        assertEquals("12000", res.get(0).getEmployeeAnnualSalary());
    }
}