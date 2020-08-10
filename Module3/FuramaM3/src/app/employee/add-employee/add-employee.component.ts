import {Component, Input, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {departmentList} from '../department.model';
import {literacyList} from '../literacy.model';
import {positionList} from '../position.model';
import {EmployeeModel} from '../employee.model';

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent implements OnInit {
  employeeForm: FormGroup;
  newEmployee: EmployeeModel;
  @Input() departmentList = departmentList;
  @Input() literacyList = literacyList;
  @Input() positionList = positionList;

  constructor(private fb: FormBuilder) {
  }

  ngOnInit(): void {
    this.employeeForm = this.fb.group({
      name: ['', Validators.required],
      email: ['', [Validators.required, Validators.pattern('^[a-zA-Z][a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$')]],
      phoneNumber: ['', [Validators.required, Validators.pattern('((^|, )(090|091|\\(84\\)\\+|\\(84\\)\\+))+[0-9]{7}$')]],
      idNumber: ['', [Validators.required, Validators.pattern('^((\\d{9})|(\\d{12}))$')]],
      dateOfBirth: ['', Validators.required],
      address: ['', Validators.required],
      salary: ['', Validators.min(0)],
      department: ['', Validators.required],
      position: ['', Validators.required],
      literacy: ['', Validators.required]
    });
  }

  onSubmit(): void {
    console.log(this.employeeForm);
  }
}
