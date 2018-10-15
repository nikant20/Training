import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';

import { AppComponent } from './app.component';
import {Routes, Router, RouterModule} from '@angular/router';
import {HttpClient, HttpClientModule} from '@angular/common/http';
import { SearchComponent } from './search/search.component';
import { FlightDetailsComponent } from './flight-details/flight-details.component'
import {FormsModule} from '@angular/forms'

const appRoutes:Routes= [
  {path:'search', component:FlightDetailsComponent}
]

@NgModule({
  declarations: [
    AppComponent,
    SearchComponent,
    FlightDetailsComponent,

  ],
  imports: [
    BrowserModule,HttpClientModule, RouterModule.forRoot(appRoutes), FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
