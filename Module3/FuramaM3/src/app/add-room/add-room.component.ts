import {Component, OnInit} from '@angular/core';
import {ServiceRoom} from '../service.model';
import {roomList} from '../service.model';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-add-room',
  templateUrl: './add-room.component.html',
  styleUrls: ['./add-room.component.css']
})
export class AddRoomComponent implements OnInit {
  roomForm: FormGroup;
  newRoom: ServiceRoom;

  constructor(private fb: FormBuilder) {
  }

  ngOnInit(): void {
    this.roomForm = this.fb.group(
      {
        id: ['', Validators.pattern('^(DV-)[0-9]{4}$')],
        name: ['', Validators.required],
        area: ['', Validators.min(0)],
        price: ['', Validators.min(0)],
        maxPeople: ['', Validators.min(0)]
      }
    );
  }

}
