import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {contractList} from '../contract.model';
import {ContractModel} from '../contract.model';
import {customerList} from '../customer.model';
import {employeeList} from '../employee.model';

@Component({
  selector: 'app-add-contract',
  templateUrl: './add-contract.component.html',
  styleUrls: ['./add-contract.component.css']
})
export class AddContractComponent implements OnInit {
  contractForm: FormGroup;


  constructor(private fb: FormBuilder) {
  }

  ngOnInit(): void {
    this.contractForm = this.fb.group({
      id: ['', Validators.required],
      deposits: ['', Validators.min(0)],
      total: ['', Validators.min(0)]
    });
  }

}
