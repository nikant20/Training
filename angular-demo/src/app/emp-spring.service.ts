import { Emp } from './emp-spring/emp-spring.component';
import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class EmpSpringService {
  getAllURL = "http://localhost:8080/spring-eb-app/spring/showAll";
  storeURL = "http://localhost:8080/spring-eb-app/spring/webStore";
  constructor(private http:HttpClient) { }
  public getAllEmployees(){
    return this.http.get(this.getAllURL);
  }
  public storeEmp(content:Emp){
    let headers = new HttpHeaders({"Content-Type":"application/json"});
    return this.http.post(this.storeURL, content, {headers,responseType:'text'})
  }
}
