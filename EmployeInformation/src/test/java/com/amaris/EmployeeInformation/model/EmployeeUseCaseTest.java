package com.amaris.EmployeeInformation.model;

import com.amaris.EmployeeInformation.interfaces.EmployeesInformationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class EmployeeUseCaseTest {

    EmployeeUseCase employeeUseCase;
    EmployeesInformationService employeesInformationService;
    AnnualSalaryUseCase annualSalaryUseCase;

    Employee employee;



    @BeforeEach
    void setUp() {
        employeesInformationService = mock(EmployeesInformationService.class);
        annualSalaryUseCase = mock(AnnualSalaryUseCase.class);
        employeeUseCase = new EmployeeUseCase(employeesInformationService, annualSalaryUseCase);
        employee = new Employee();
        employee.setEmployeeAge("2");
        employee.setEmployeeSalary("1000");
        employee.setEmployeeName("Dayana");
        employee.setId(1);
        employee.setProfileImage("");
    }

    @Test
    void getEmployeesInformation() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        when(employeesInformationService.getEmployeesInformation(anyInt())).thenReturn(employee);
        when(annualSalaryUseCase.setAnnualSalary(anyList())).thenReturn(employeeList);
        List<Employee> res = employeeUseCase.getEmployeesInformation(1);


        assertEquals(employeeList, res);
    }

}