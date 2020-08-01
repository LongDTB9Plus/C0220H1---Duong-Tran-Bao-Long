import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppComponent} from './app.component';
import {ListCustomerComponent} from './list-customer/list-customer.component';
import {ListEmployeeComponent} from './list-employee/list-employee.component';
import {ListServiceComponent} from './list-service/list-service.component';
import {ListContractComponent} from './list-contract/list-contract.component';
import {AddEmployeeComponent} from './add-employee/add-employee.component';
import {AddCustomerComponent} from './add-customer/add-customer.component';
import {AddContractComponent} from './add-contract/add-contract.component';
import {AddServiceComponent} from './add-service/add-service.component';
import {AddDetailContractComponent} from './add-detail-contract/add-detail-contract.component';
import {AngularFontAwesomeModule} from 'angular-font-awesome';

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
    AddDetailContractComponent
  ],
  imports: [
    BrowserModule,
    AngularFontAwesomeModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})

export class AppModule {
}
