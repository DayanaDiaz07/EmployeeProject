package com.amaris.EmployeeInformation.model;

import com.amaris.EmployeeInformation.interfaces.EmployeesInformationService;

import java.util.ArrayList;
import java.util.List;


public class EmployeeUseCase {

    private final EmployeesInformationService employeesInformationService;
    private final AnualSalaryUseCase anualSalaryUseCase;

    public EmployeeUseCase(EmployeesInformationService employeesInformationService, AnualSalaryUseCase anualSalaryUseCase) {
        this.employeesInformationService = employeesInformationService;
        this.anualSalaryUseCase = anualSalaryUseCase;
    }

    public List<Employee> getEmployeesInformation(Integer id){
        if(id!=null){
            List<Employee> employeList =  new ArrayList<>();
            employeList.add(employeesInformationService.getEmployeesInformation(id));
            return  anualSalaryUseCase.setAnnualSalary(employeList);
        }
        return employeesInformationService.getEmployeesInformation();
    }
}
