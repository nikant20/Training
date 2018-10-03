import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  // template:`<div class="content"> <h1>Welcome to {{title}}</h1></div>
  //           <div class="main">My name is :{{username}}</div>`,
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Angular';
  username="";
  isHidden = false;
  isDisabled = true;
  callMe(value:string){
    this.username = value;
    this.isHidden = true;
    console.log(value);
    
  }
  validate(v:string){
    console.log(v);
    
    if(v.length >= 3){
      this.isDisabled = false;
    }
    else{
      this.isDisabled = true;
    }
  }
}
