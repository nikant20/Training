import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { UserItemComponent } from './user-item/user-item.component';
import { EmployeeComponent } from './employee/employee.component';
import { NameFormatter, DetailFormatter } from './employee';

@NgModule({
  declarations: [
    AppComponent,
    UserItemComponent,
    EmployeeComponent,
    NameFormatter,
    DetailFormatter
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
