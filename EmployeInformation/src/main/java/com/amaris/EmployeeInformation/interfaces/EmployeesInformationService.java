package com.amaris.EmployeeInformation.interfaces;

import com.amaris.EmployeeInformation.model.Employee;

import java.util.List;

public interface EmployeesInformationService {
    Employee getEmployeesInformation(Integer id);
    List<Employee> getEmployeesInformation();
}
