import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {CustomerModel} from '../customer.model';
import {CustomerServiceService} from '../service/customer-service.service';
import {customerTypeList} from '../customerType.model';
import {ActivatedRoute, ParamMap} from '@angular/router';

@Component({
  selector: 'app-edit-customer',
  templateUrl: './edit-customer.component.html',
  styleUrls: ['./edit-customer.component.css']
})
export class EditCustomerComponent implements OnInit {
  customerEditForm: FormGroup;
  customer: CustomerModel;
  customerTypeList = customerTypeList;
  indexOfRep: number;

  constructor(private fb: FormBuilder, private cs: CustomerServiceService, private activatedRoute: ActivatedRoute) {
  }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      const id = paramMap.get('id');
      this.customer = this.cs.findById(id);
      this.indexOfRep = this.cs.customerList.indexOf(this.customer);
    });
    console.log(this.customer);
    this.customerEditForm = this.fb.group({
      id: [this.customer.id, [Validators.required, Validators.pattern(/^(KH-)[0-9]{4}$/)]],
      name: [this.customer.name, Validators.required],
      email: [this.customer.email, [Validators.required, Validators.pattern(/^[a-zA-Z][a-zA-Z0-9]+@[a-zA-Z0-9]+\.[a-zA-Z0-9]+$/)]],
      phoneNumber: [this.customer.phoneNumber, [Validators.required, Validators.pattern(/((^|, )(090|091|\(84\)\+))+[0-9]{7}$/)]],
      idNumber: [this.customer.idNumber, [Validators.required, Validators.pattern(/^(([0-9]{9})|([0-9]{12}))$/)]],
      dateOfBirth: [this.customer.dateOfBirth, Validators.required],
      address: [this.customer.address, Validators.required],
      type: [this.customer.type, Validators.required]
    });
  }

  onSubmit(): void {
    if (this.customerEditForm.valid) {
      console.log('pass');
      this.customer = this.customerEditForm.value;
      this.cs.editCustomer(this.indexOfRep, this.customer);
    }
  }
}
