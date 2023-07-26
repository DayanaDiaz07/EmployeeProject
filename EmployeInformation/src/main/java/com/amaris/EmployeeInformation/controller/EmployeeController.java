package com.amaris.EmployeeInformation.controller;

import com.amaris.EmployeeInformation.model.Employee;
import com.amaris.EmployeeInformation.model.EmployeeUseCase;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@Slf4j
public class EmployeeController {

    private final EmployeeUseCase employeeUseCase;

    private Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    public EmployeeController(EmployeeUseCase employeeUseCase) {
        this.employeeUseCase = employeeUseCase;
    }

    @GetMapping("/employees")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<ControllerResponse> getEmployeeById(@RequestParam(required = false) Integer id) {
        try{
            return createResponse(employeeUseCase.getEmployeesInformation(id));
        }catch (Exception e){
            return createError(e);
        }
    }

    private ResponseEntity<ControllerResponse> createResponse(List<Employee> employees){
        if(employees == null){
            return ResponseEntity
                    .status(400)
                    .body(new ControllerResponse(null, null, "No se encuentran datos para la consulta"));
        }


        return ResponseEntity
                .status(200)
                .body(new ControllerResponse(employees, "SUCCESS", null));
    }

    private ResponseEntity<ControllerResponse> createError(Exception e) {
        logger.error("Error en el servicio: {}", e.getMessage());
        return ResponseEntity
                .status(500)
                .body(new ControllerResponse(null, null, "Error desconocido"));
    }

}
