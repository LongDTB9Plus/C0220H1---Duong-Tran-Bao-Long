import {Component, Input, OnInit} from '@angular/core';
import {CustomerModel} from '../customer.model';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {customerTypeList} from '../customerType.model';
import {CustomerServiceService} from '../service/customer-service.service';


@Component({
  selector: 'app-add-customer',
  templateUrl: './add-customer.component.html',
  styleUrls: ['./add-customer.component.css']
})
export class AddCustomerComponent implements OnInit {
  customerSignUp: FormGroup;
  customer: CustomerModel;
  customerTypeList = customerTypeList;

  constructor(private fb: FormBuilder, private cs: CustomerServiceService) {
  }

  ngOnInit(): void {
    this.customerSignUp = this.fb.group({
      id: ['', [Validators.required, Validators.pattern(/^(KH-)[0-9]{4}$/)]],
      name: ['', Validators.required],
      email: ['', [Validators.required, Validators.pattern(/^[a-zA-Z][a-zA-Z0-9]+@[a-zA-Z0-9]+\.[a-zA-Z0-9]+$/)]],
      phoneNumber: ['', [Validators.required, Validators.pattern(/((^|, )(090|091|\(84\)\+))+[0-9]{7}$/)]],
      idNumber: ['', [Validators.required, Validators.pattern(/^(([0-9]{9})|([0-9]{12}))$/)]],
      dateOfBirth: ['', Validators.required],
      address: ['', Validators.required],
      type: ['', Validators.required]
    });
  }

  onSubmit(): void {
    if (this.customerSignUp.valid) {
      this.customer = this.customerSignUp.value;
      console.log(this.customer);
      this.cs.saveCustomer(this.customer);
    }
    // this.customer.type = customerTypeList.find(value => value.id === Number(this.customerSignUp.value.type));
  }
}
