package com.amaris.EmployeeInformation.config;

import com.amaris.EmployeeInformation.interfaces.EmployeesInformationService;
import com.amaris.EmployeeInformation.model.AnualSalaryUseCase;
import com.amaris.EmployeeInformation.model.EmployeeUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {
    @Bean
    public EmployeeUseCase employeeUseCase(EmployeesInformationService employeesInformationService, AnualSalaryUseCase anualSalaryUseCase){
        return new EmployeeUseCase(employeesInformationService, anualSalaryUseCase);
    }
}
