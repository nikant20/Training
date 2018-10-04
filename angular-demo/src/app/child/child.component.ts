import { Component, OnInit, Input } from '@angular/core';
import { Employee } from '../employee';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit {
  @Input()
  name:string;

  @Input()
  emp:Employee;

  constructor() {
    this.name = "Nikant";
    this.emp = new Employee(101, "JDJDJ", 39393, "Male", new Date());
   }

  ngOnInit() {
  }

}
