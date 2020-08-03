import {Component, OnInit} from '@angular/core';
import {ServiceHouse} from '../service.model';
import {houseList} from '../service.model';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-add-house',
  templateUrl: './add-house.component.html',
  styleUrls: ['./add-house.component.css']
})
export class AddHouseComponent implements OnInit {
  formHouse: FormGroup;
  newHouse: ServiceHouse;

  constructor(private fb: FormBuilder) {
  }

  ngOnInit(): void {
    this.formHouse = this.fb.group({
      id: ['', Validators.pattern('^(DV-)[0-9]{4}$')],
      name: ['', Validators.required],
      area: ['', Validators.min(0)],
      price: ['', Validators.min(0)],
      maxPeople: ['', Validators.min(0)],
      floorNumber: ['', Validators.min(0)]
    });
  }

}
