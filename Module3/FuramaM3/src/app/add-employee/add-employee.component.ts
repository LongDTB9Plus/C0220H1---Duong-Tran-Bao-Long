import {Component, OnInit} from '@angular/core';
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

  constructor(private fb: FormBuilder) {
  }

  ngOnInit(): void {
    this.employeeForm = this.fb.group({
      id: ['', Validators.required],
      name: ['', Validators.required],
      email: ['', Validators.pattern('^[a-zA-Z][a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$')],
      phoneNumber: ['', Validators.pattern('((^|, )(090|091|\\(84\\)\\+|\\(84\\)\\+))+[0-9]{7}$')],
      idNumber: ['', Validators.pattern('^((\\d{9})|(\\d{12}))$')],
      dateOfBirth: ['', Validators.pattern('/^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$/')],
      address: ['', Validators.required],
      salary: ['', Validators.min(0)]
    });
  }

}
