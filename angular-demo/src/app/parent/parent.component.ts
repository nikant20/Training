import { Employee } from './../employee';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
  title:string="Parent Component";
  singleUser = "Prabhudeep";
  multipleUser:string[] = ["John", "Jennifer", "Mathew", "David"];
  empParent = new Employee(101,"Nikant",35000,"Male",new Date(1993,7,1));
  constructor() { }

  ngOnInit() {
  }

}
