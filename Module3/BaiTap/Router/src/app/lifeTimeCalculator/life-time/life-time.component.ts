import { Component, OnInit } from '@angular/core';
import {DateUtilService} from '../date-ultil.service';

@Component({
  selector: 'app-life-time',
  templateUrl: './life-time.component.html',
  styleUrls: ['./life-time.component.css']
})
export class LifeTimeComponent implements OnInit {

  output = '';
  constructor(private dateUtilService: DateUtilService) { }

  // tslint:disable-next-line:typedef
  ngOnInit() {
  }

  // tslint:disable-next-line:typedef
  onChange(value) {
    this.output = this.dateUtilService.getDiffToNow(value);
  }
}
