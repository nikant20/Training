import { Component, OnInit } from '@angular/core';
import { EmpSpringService } from '../emp-spring.service';

@Component({
  selector: 'app-emp-spring',
  templateUrl: './emp-spring.component.html',
  styleUrls: ['./emp-spring.component.css']
})
export class EmpSpringComponent implements OnInit {
    empList:Emp[];
    constructor(private springService:EmpSpringService){}
  ngOnInit() {
    //all HTTP methods of angular return Observable, you need to call subscribe method to initiate the request & get Data
    this.springService.getAllEmployees().subscribe((data:Emp[]) => this.empList = data);
    // .subscribe(function(data:Emp[]){this.empList = data})
  }

}
//TO store coming json through webservice
export class Emp{
  constructor(private id:number, private name:string, private gender:string, private phoneNumber:string){}
}
