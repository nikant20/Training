import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-user-item',
  templateUrl: './user-item.component.html',
  styleUrls: ['./user-item.component.css']
})
export class UserItemComponent implements OnInit {
  namesList:string[] = [
    "Nikant", "Prabhudeep", "Amulya"
  ]
  title:string="Users"
  constructor() { }

  ngOnInit() {
  }

}
