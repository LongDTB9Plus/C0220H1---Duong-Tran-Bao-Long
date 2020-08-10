import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {ListServiceComponent} from './list-service/list-service.component';
import {AddServiceComponent} from './add-service/add-service.component';
import {AddVillaComponent} from './add-villa/add-villa.component';
import {AddRoomComponent} from './add-room/add-room.component';
import {AddHouseComponent} from './add-house/add-house.component';
import { EditServiceComponent } from './edit-service/edit-service.component';



@NgModule({
  declarations: [
    ListServiceComponent,
    AddServiceComponent,
    AddVillaComponent,
    AddRoomComponent,
    AddHouseComponent,
    EditServiceComponent
  ],
  imports: [
    CommonModule
  ]
})
export class ServiceModule { }
