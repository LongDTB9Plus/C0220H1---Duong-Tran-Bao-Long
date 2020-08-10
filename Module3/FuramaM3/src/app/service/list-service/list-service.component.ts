import {Component, Input, OnInit} from '@angular/core';
import {villaList} from '../service.model';
import {roomList} from '../service.model';
import {houseList} from '../service.model';

@Component({
  selector: 'app-list-service',
  templateUrl: './list-service.component.html',
  styleUrls: ['./list-service.component.css']
})
export class ListServiceComponent implements OnInit {
  @Input() villaList = villaList;
  @Input() roomList = roomList;
  @Input() houseList = houseList;

  constructor() {
  }

  ngOnInit(): void {
  }

}
