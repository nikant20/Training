import { FlightService } from './../flight.service';
import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import { Flight } from '../flight';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
  
})
export class SearchComponent implements OnInit {
  source:string;
  destination:string;
  date:string;
  flight:Flight[];

  getFlightDetails(values){
   
    this.service.getFlightDetails(values.source, values.destination, values.date).
      subscribe((data:Flight[])=> {this.flight=data
        console.log(this.flight);
        console.log(JSON.stringify(this.flight));
        sessionStorage.setItem("details",JSON.stringify(this.flight)); 
           this.router.navigate(['/search'])
      } );
      
  }

  constructor(private router:Router, private service:FlightService) { 
  }

  ngOnInit() {
  }

}
