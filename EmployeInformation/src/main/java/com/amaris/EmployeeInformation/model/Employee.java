package com.amaris.EmployeeInformation.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Employee {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("employee_name")
    private String employeeName;

    @JsonProperty("employee_salary")
    private String employeeSalary;

    @JsonProperty("employee_age")
    private String employeeAge;

    @JsonProperty("profile_image")
    private String profileImage;
    @JsonProperty("employee_annual_salary")
    private String employeeAnnualSalary;


    public Employee() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(String employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(String employeeAge) {
        this.employeeAge = employeeAge;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getEmployeeAnnualSalary() {
        return employeeAnnualSalary;
    }

    public void setEmployeeAnnualSalary(String employeeAnnualSalary) {
        this.employeeAnnualSalary = employeeAnnualSalary;
    }
}
