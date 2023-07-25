package com.amaris.EmployeeInformation.controller.Adapters;

import com.amaris.EmployeeInformation.model.Employee;


import java.util.List;

public class EmployeesAdapterResponse {
    private List<Employee> data;
    private String Status;

    public EmployeesAdapterResponse() {
    }


    public List<Employee> getData() {
        return data;
    }

    public String getStatus() {
        return Status;
    }
}
