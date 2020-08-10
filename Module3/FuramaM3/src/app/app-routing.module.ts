import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {ListCustomerComponent} from './customer/list-customer/list-customer.component';
import {AddCustomerComponent} from './customer/add-customer/add-customer.component';
import {ListEmployeeComponent} from './employee/list-employee/list-employee.component';
import {AddEmployeeComponent} from './employee/add-employee/add-employee.component';
import {ListContractComponent} from './contract/list-contract/list-contract.component';
import {AddContractComponent} from './contract/add-contract/add-contract.component';
import {ListServiceComponent} from './service/list-service/list-service.component';
import {AddVillaComponent} from './service/add-villa/add-villa.component';
import {AddRoomComponent} from './service/add-room/add-room.component';
import {AddHouseComponent} from './service/add-house/add-house.component';
import {AddServiceComponent} from './service/add-service/add-service.component';
import {AddDetailContractComponent} from './contract/add-detail-contract/add-detail-contract.component';
import {EditCustomerComponent} from './customer/edit-customer/edit-customer.component';
import {DeleteCustomerComponent} from './customer/delete-customer/delete-customer.component';

const routes: Routes = [
  {
    path: 'customer-list',
    children: [
      {path: '', component: ListCustomerComponent},
      {path: 'edit/:id', component: EditCustomerComponent},
      {path: 'delete/:id', component: DeleteCustomerComponent}
    ]
  },
  {
    path: 'customer-add', component: AddCustomerComponent
  },
  {
    path: 'employee-add', component: AddEmployeeComponent
  },
  {
    path: 'contract-add', component: AddContractComponent
  },
  {
    path: 'detail-contract-add', component: AddDetailContractComponent
  },
  {
    path: 'service-add',
    children: [
      {path: 'villa', component: AddVillaComponent},
      {path: 'room', component: AddRoomComponent},
      {path: 'house', component: AddHouseComponent}
    ]
  }
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
