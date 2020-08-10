import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {ListEmployeeComponent} from './list-employee/list-employee.component';
import {AddEmployeeComponent} from './add-employee/add-employee.component';
import {ReactiveFormsModule} from '@angular/forms';
import { EditEmployeeComponent } from './edit-employee/edit-employee.component';
import { DeleteEmployeeComponent } from './delete-employee/delete-employee.component';



@NgModule({
  declarations: [
    ListEmployeeComponent,
    AddEmployeeComponent,
    EditEmployeeComponent,
    DeleteEmployeeComponent
  ],
  exports: [
    AddEmployeeComponent
  ],
  imports: [
    CommonModule,
    ReactiveFormsModule
  ]
})
export class EmployeeModule { }
