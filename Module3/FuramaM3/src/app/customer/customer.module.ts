import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {ListCustomerComponent} from './list-customer/list-customer.component';
import {AddCustomerComponent} from './add-customer/add-customer.component';
import {ReactiveFormsModule} from '@angular/forms';
import {CustomerServiceService} from './service/customer-service.service';
import {RouterModule} from '@angular/router';
import { EditCustomerComponent } from './edit-customer/edit-customer.component';
import { DeleteCustomerComponent } from './delete-customer/delete-customer.component';


@NgModule({
  declarations: [
    ListCustomerComponent,
    AddCustomerComponent,
    EditCustomerComponent,
    DeleteCustomerComponent
  ],
  exports: [
    AddCustomerComponent,
    ListCustomerComponent
  ],
  imports: [
    CommonModule,
    ReactiveFormsModule,
    RouterModule,
  ],
  providers: [CustomerServiceService]
})
export class CustomerModule { }
