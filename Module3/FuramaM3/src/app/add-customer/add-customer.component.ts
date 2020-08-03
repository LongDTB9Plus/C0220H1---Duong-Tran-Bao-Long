import {Component, Input, OnInit} from '@angular/core';
import {CustomerModel} from '../customer.model';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {customerTypeList} from '../customerType.model';

@Component({
  selector: 'app-add-customer',
  templateUrl: './add-customer.component.html',
  styleUrls: ['./add-customer.component.css']
})
export class AddCustomerComponent implements OnInit {
  customerSignUp: FormGroup;
  customer: CustomerModel;
  @Input() customerTypeList = customerTypeList;

  constructor(private fb: FormBuilder) {
  }

  ngOnInit(): void {
    this.customerSignUp = this.fb.group({
      id: ['', Validators.pattern('^KH-[0-9]{4}$')],
      name: ['', Validators.required],
      email: ['', Validators.pattern('^[a-zA-Z][a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$')],
      phoneNumber: ['', Validators.pattern('((^|, )(090|091|\\(84\\)\\+|\\(84\\)\\+))+[0-9]{7}$')],
      idNumber: ['', Validators.pattern('^((\\d{9})|(\\d{12}))$')],
      dateOfBirth: ['', Validators.pattern('/^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$/')],
      address: ['', Validators.required]
    });
  }

  onSubmit(): void {
    console.log(this.customerSignUp.value);
  }

  saveCustomer(init?: Partial<CustomerModel>): void {

  }

}
