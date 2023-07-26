package com.amaris.EmployeeInformation.model;

import com.amaris.EmployeeInformation.interfaces.EmployeesInformationService;

import java.util.ArrayList;
import java.util.List;


public class EmployeeUseCase {

    private final EmployeesInformationService employeesInformationService;
    private final AnnualSalaryUseCase annualSalaryUseCase;

    public EmployeeUseCase(EmployeesInformationService employeesInformationService, AnnualSalaryUseCase annualSalaryUseCase) {
        this.employeesInformationService = employeesInformationService;
        this.annualSalaryUseCase = annualSalaryUseCase;
    }

    public List<Employee> getEmployeesInformation(Integer id){
        if(id!=null){
            List<Employee> employeList =  new ArrayList<>();
            employeList.add(employeesInformationService.getEmployeesInformation(id));
            return  annualSalaryUseCase.setAnnualSalary(employeList);
        }
        return annualSalaryUseCase.setAnnualSalary(employeesInformationService.getEmployeesInformation());
    }
}
