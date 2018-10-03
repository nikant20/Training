import { EMPLOYEES } from './../mock';
import { Employee } from './../employee';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {
  titile:string;
  emp:Employee;
  empDetails:Employee[]=EMPLOYEES;
  constructor() {
    this.titile = "Employee Information" 
    this.emp = new Employee(101,"Nikant",35000,"Male",new Date(1993,7,1));
  }

  ngOnInit() {
  }

}
