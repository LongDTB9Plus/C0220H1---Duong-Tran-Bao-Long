import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import {AddServiceComponent} from './add-service/add-service.component';
import {AddDetailContractComponent} from './add-detail-contract/add-detail-contract.component';
import {AddContractComponent} from './add-contract/add-contract.component';
import {ListServiceComponent} from './list-service/list-service.component';
import {AddEmployeeComponent} from './add-employee/add-employee.component';
import {ListCustomerComponent} from './list-customer/list-customer.component';
import {ListContractComponent} from './list-contract/list-contract.component';
import {ListEmployeeComponent} from './list-employee/list-employee.component';
import {AddCustomerComponent} from './add-customer/add-customer.component';
import {ReactiveFormsModule} from '@angular/forms';
import { AddVillaComponent } from './add-villa/add-villa.component';
import { AddRoomComponent } from './add-room/add-room.component';
import { AddHouseComponent } from './add-house/add-house.component';

@NgModule({
  declarations: [
    AppComponent,
    ListCustomerComponent,
    ListEmployeeComponent,
    ListServiceComponent,
    ListContractComponent,
    AddEmployeeComponent,
    AddCustomerComponent,
    AddContractComponent,
    AddServiceComponent,
    AddDetailContractComponent,
    AddVillaComponent,
    AddRoomComponent,
    AddHouseComponent
  ],
    imports: [
        BrowserModule,
        ReactiveFormsModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
