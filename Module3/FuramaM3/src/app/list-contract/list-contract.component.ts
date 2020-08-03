import {Component, Input, OnInit} from '@angular/core';
import {contractList} from '../contract.model';

@Component({
  selector: 'app-list-contract',
  templateUrl: './list-contract.component.html',
  styleUrls: ['./list-contract.component.css']
})
export class ListContractComponent implements OnInit {
  @Input() contractList = contractList;

  constructor() {
  }

  ngOnInit(): void {
  }

}
