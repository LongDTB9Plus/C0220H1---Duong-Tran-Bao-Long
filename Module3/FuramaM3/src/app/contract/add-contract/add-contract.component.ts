import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {ContractModel} from '../contract.model';


@Component({
  selector: 'app-add-contract',
  templateUrl: './add-contract.component.html',
  styleUrls: ['./add-contract.component.css']
})
export class AddContractComponent implements OnInit {
  contractForm: FormGroup;
  newContract: ContractModel;

  constructor(private fb: FormBuilder) {
  }

  ngOnInit(): void {
    this.contractForm = this.fb.group({
      id: ['', Validators.required],
      deposits: ['', Validators.min(0)],
      total: ['', Validators.min(0)]
    });
  }

  onSubmit(): void {
    console.log(this.contractForm)
  }
}
