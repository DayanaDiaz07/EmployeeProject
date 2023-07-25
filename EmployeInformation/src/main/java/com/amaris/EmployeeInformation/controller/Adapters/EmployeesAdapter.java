package com.amaris.EmployeeInformation.controller.Adapters;

import com.amaris.EmployeeInformation.interfaces.EmployeesInformationService;
import com.amaris.EmployeeInformation.model.Employee;
import lombok.var;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import java.util.List;
import java.util.Objects;

@Service
public class EmployeesAdapter implements EmployeesInformationService {

    private final RestTemplate restTemplate;
    private static final String baseUrl = "https://dummy.restapiexample.com/api/v1";
    public EmployeesAdapter(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Employee getEmployeesInformation(Integer id) {

        String url = baseUrl + "/employee/" + id;

        EmployeeAdapterResponse adapterResponse = restTemplate.getForObject(url, EmployeeAdapterResponse.class);
        return adapterResponse.getData();

    }

    @Override
    public List<Employee> getEmployeesInformation() {
        String url = baseUrl + "/employees";

        EmployeesAdapterResponse adapterResponse = restTemplate.getForObject(url, EmployeesAdapterResponse.class);
        return adapterResponse.getData();
    }


}

