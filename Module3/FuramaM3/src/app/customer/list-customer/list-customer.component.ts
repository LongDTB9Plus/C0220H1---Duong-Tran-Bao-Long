import {Component, Input, OnInit} from '@angular/core';
import {CustomerServiceService} from '../service/customer-service.service';
import {CustomerModel} from '../customer.model';

@Component({
  selector: 'app-list-customer',
  templateUrl: './list-customer.component.html',
  styleUrls: ['./list-customer.component.css']
})
export class ListCustomerComponent implements OnInit {
  customerList: CustomerModel[];
  constructor(private cs: CustomerServiceService) {
    this.customerList = cs.customerList;
  }

  ngOnInit(): void {
  }

}
