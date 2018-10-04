import { Component, OnInit } from '@angular/core';
import{Router} from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  username:string;
  password:string;

  login(formvalues){
    console.log(formvalues);
    console.log(formvalues.user);
    console.log(formvalues.password);
    this.username = "";
    this.password = "";
    if(formvalues.user=="admin" && formvalues.password =="admin"){
      this.router.navigate(['employee']) 
    }else{
      this.router.navigate(['login'])
    }
    
  }
  constructor(private router:Router) { }

  ngOnInit() {
  }

}
