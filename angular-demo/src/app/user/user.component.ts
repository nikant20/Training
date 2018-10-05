import { EmpSpringService } from './../emp-spring.service';
import { Component, OnInit } from '@angular/core';
import { Router } from '../../../node_modules/@angular/router';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  id:number;
  name:string;
  gender:string;
  phoneNumber:string;
  
  constructor(private empService: EmpSpringService, private router:Router) {
    
   }

  ngOnInit() {
  }
  store(formValues){
    this.empService.storeEmp(formValues).subscribe(r => console.log("Status: "+r));
    this.router.navigate(["empAll"]);
  }

}
