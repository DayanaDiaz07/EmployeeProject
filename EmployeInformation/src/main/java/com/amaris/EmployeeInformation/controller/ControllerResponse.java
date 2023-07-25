package com.amaris.EmployeeInformation.controller;

import com.amaris.EmployeeInformation.model.Employee;
import lombok.Builder;

import java.util.List;


public class ControllerResponse {
    private List<Employee> data;
    private String message;
    private String error;

    public ControllerResponse(List<Employee> data, String message, String error) {
        this.data = data;
        this.message = message;
        this.error = error;
    }

    public List<Employee> getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }

    public String getError() {
        return error;
    }

    public void setData(List<Employee> data) {
        this.data = data;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setError(String error) {
        this.error = error;
    }
}
