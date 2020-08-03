import {Component, Input, OnInit} from '@angular/core';
import {employeeList} from '../employee.model';

@Component({
  selector: 'app-list-employee',
  templateUrl: './list-employee.component.html',
  styleUrls: ['./list-employee.component.css']
})
export class ListEmployeeComponent implements OnInit {
  @Input() employeeList = employeeList;

  constructor() {
  }

  ngOnInit(): void {
  }

}
