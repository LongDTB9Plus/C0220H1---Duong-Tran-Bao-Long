import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {ListContractComponent} from './list-contract/list-contract.component';
import {AddContractComponent} from './add-contract/add-contract.component';
import {AddDetailContractComponent} from './add-detail-contract/add-detail-contract.component';
import {AppRoutingModule} from '../app-routing.module';



@NgModule({
  declarations: [
    ListContractComponent,
    AddContractComponent,
    AddDetailContractComponent
  ],
  imports: [
    CommonModule,
    AppRoutingModule
  ]
})
export class ContractModule { }
