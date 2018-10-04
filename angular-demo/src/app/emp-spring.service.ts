import { Emp } from './emp-spring/emp-spring.component';
import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class EmpSpringService {
  employees:Emp[];
  getAllURL = "http://localhost:8080/spring-eb-app/spring/showAll";
  constructor(private http:HttpClient) { }
  public getAllEmployees(){
    return this.http.get(this.getAllURL);
  }
}
