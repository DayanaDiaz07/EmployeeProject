package com.amaris.EmployeeInformation.model;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AnnualSalaryUseCase {

    public List<Employee> setAnnualSalary(List<Employee> employees){
        for (Employee employee : employees) {
            Integer annualSalary = Integer.parseInt(employee.getEmployeeSalary()) * 12;
            employee.setEmployeeAnnualSalary(String.valueOf(annualSalary));
        }
        return employees;
    }
}
