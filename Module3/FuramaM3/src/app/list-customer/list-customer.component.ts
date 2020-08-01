import {Component, Input, OnInit} from '@angular/core';
import {customerList} from '../customer.model';

@Component({
  selector: 'app-list-customer',
  templateUrl: './list-customer.component.html',
  styleUrls: ['./list-customer.component.css']
})
export class ListCustomerComponent implements OnInit {
  @Input() customerList = customerList;

  constructor() {
  }

  ngOnInit(): void {
  }

}
