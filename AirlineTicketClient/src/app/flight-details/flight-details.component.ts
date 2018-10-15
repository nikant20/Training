import { FlightService } from './../flight.service';
import { Component, OnInit, Input } from '@angular/core';
import { Flight } from '../flight';

@Component({
  selector: 'app-flight-details',
  templateUrl: './flight-details.component.html',
  styleUrls: ['./flight-details.component.css']
})
export class FlightDetailsComponent implements OnInit {
 //flightDetails[];
 avr:Flight[];
  constructor() { }
  ngOnInit(){
    this.avr =  JSON.parse(sessionStorage.getItem("details"));
  }
}
