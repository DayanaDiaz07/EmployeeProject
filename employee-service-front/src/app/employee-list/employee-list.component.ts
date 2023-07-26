import { Component } from '@angular/core';
import { EmployeeService, Employee } from '../employee.service';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent {
  employees: Employee[] = [];
  errorMessage: string | null = null;
  employeeId: number | undefined;

  constructor(private employeeService: EmployeeService) {}

  searchEmployees() {
    if (this.employeeId) {
      this.getEmployeesById(this.employeeId);
    } else {
      this.getAllEmployees();
    }
  }

  getEmployeesById(id: number) {
    this.employeeService.getEmployeeById(id).subscribe(
      response => {
        this.employees = response.data;
        this.errorMessage = response.error;
      },
      error => {
        this.errorMessage = 'Error al obtener los empleados';
      }
    );
  }

  getAllEmployees() {
    this.employeeService.getEmployees().subscribe(
      response => {
        this.employees = response.data;
        this.errorMessage = response.error;
      },
      error => {
        this.errorMessage = 'Error al obtener los empleados';
      }
    );
  }
}
