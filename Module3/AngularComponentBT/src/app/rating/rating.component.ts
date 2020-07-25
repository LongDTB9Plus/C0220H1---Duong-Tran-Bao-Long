import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-rating',
  templateUrl: './rating.component.html',
  styleUrls: ['./rating.component.css']
})
export class RatingComponent implements OnInit {
  rate: number;
  message: string;

  rated(rating: number): void {
    this.rate = rating;
    this.message = 'You rated ' + this.rate + ' star';
  }


  constructor() {
  }

  ngOnInit(): void {
    this.message = 'Rate Us';
  }

}
