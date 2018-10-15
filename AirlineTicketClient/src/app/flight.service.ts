import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class FlightService {
  getFlightDetailsURL = "http://localhost:8080/AirlineTicketBookingApp/spring/query/"
  constructor(private http:HttpClient) { }
  public getFlightDetails(source:string, destination:string,date:string){
      let URL = this.getFlightDetailsURL;
      URL = URL + source + "/"+destination+"/"+date; 
      console.log(URL);
      return this.http.get(URL);
  }
}
