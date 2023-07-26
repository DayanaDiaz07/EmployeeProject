import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

export interface Employee {
  id: number;
  employee_name: string;
  employee_salary: string;
  employee_age: string;
  employee_annual_salary: string;
  profile_image: string;
}

interface EmployeeResponse {
  data: Employee[];
  error: string | null;
}

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  apiUrl = 'http://localhost:8080/employees';

  constructor(private http: HttpClient) {}

  getEmployees() {
    return this.http.get<EmployeeResponse>(this.apiUrl);
  }

  getEmployeeById(id: number) {
    return this.http.get<EmployeeResponse>(`${this.apiUrl}?id=${id}`);
  }
}
