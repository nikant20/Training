import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { UserItemComponent } from './user-item/user-item.component';
import { EmployeeComponent } from './employee/employee.component';
import { NameFormatter, DetailFormatter } from './employee';
import { UserComponent } from './user/user.component';
import {FormsModule}from "@angular/forms";
import { LoginComponent } from './login/login.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import {Routes, RouterModule} from '@angular/router';
import { EmpSpringComponent } from './emp-spring/emp-spring.component';
import {HttpClient, HttpClientModule} from '@angular/common/http'

const appRoutes:Routes = [
  {path:'employee', component:EmployeeComponent},
  {path:'users', component:UserItemComponent},
  {path:'login', component:LoginComponent},
  {path:'register',component:UserComponent},
  {path:'parent',component:ParentComponent},
  {path:'', component:AppComponent},
  {path:'empAll', component:EmpSpringComponent}
]

@NgModule({
  declarations: [
    AppComponent,
    UserItemComponent,
    EmployeeComponent,
    NameFormatter,
    DetailFormatter,
    UserComponent,
    LoginComponent,
    ParentComponent,
    ChildComponent,
    EmpSpringComponent
  ],
  imports: [
    BrowserModule, FormsModule, RouterModule.forRoot(appRoutes), HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }



