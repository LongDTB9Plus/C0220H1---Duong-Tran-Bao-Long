import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import {AppRoutingModule} from './app-routing.module';
import {YoutubeModule} from './youtube/youtube.module';
import {LifeTimeCalculatorModule} from './lifeTimeCalculator/life-time-calculator.module';
import {DictionaryModule} from './dictionary/dictionary.module';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    YoutubeModule,
    LifeTimeCalculatorModule,
    DictionaryModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
