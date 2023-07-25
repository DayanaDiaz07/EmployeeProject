package com.amaris.EmployeeInformation.model;

import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class AnualSalaryUseCase {

    public List<Employee> setAnnualSalary(List<Employee> employees){
        for (Employee employee : employees) {
            Integer annualSalary = Integer.parseInt(employee.getEmployeeSalary()) * 12;
            employee.setEmployeeAnualSalary(String.valueOf(annualSalary));
        }
        return employees;
    }
}
