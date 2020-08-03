import {Component, OnInit} from '@angular/core';
import {ServiceVilla} from '../service.model';
import {villaList} from '../service.model';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-add-villa',
  templateUrl: './add-villa.component.html',
  styleUrls: ['./add-villa.component.css']
})
export class AddVillaComponent implements OnInit {
  villaForm: FormGroup;
  newVilla: ServiceVilla;

  constructor(private fb: FormBuilder) {
  }

  ngOnInit(): void {
    this.villaForm = this.fb.group({
      id: ['', Validators.pattern('^(DV-)[0-9]{4}$')],
      name: ['', Validators.required],
      area: ['', Validators.min(0)],
      price: ['', Validators.min(0)],
      maxPeople: ['', Validators.min(0)],
      poolArea: ['', Validators.min(0)],
      floorNumber: ['', Validators.min(0)]
    });
  }

}
