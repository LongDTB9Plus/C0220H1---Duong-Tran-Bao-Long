import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {LifeTimeComponent} from './life-time/life-time.component';
import {AppRoutingModule} from '../app-routing.module';



@NgModule({
  declarations: [LifeTimeComponent],
  imports: [
    CommonModule,
    AppRoutingModule
  ]
})
export class LifeTimeCalculatorModule { }
