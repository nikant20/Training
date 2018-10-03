import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
  firstname:string = "";
  lastname:string="";
  fullname:string="";
  isDisabled = true;
  join(v1:string, v2:string){
     this.fullname = v1+" "+v2;
  }
  constructor() {
   
   }

  ngOnInit() {
  }

}
