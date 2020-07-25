import {Component, Input, OnInit} from '@angular/core';

@Component({
  selector: 'app-countdown',
  templateUrl: './countdown.component.html',
  styleUrls: ['./countdown.component.css']
})
export class CountdownComponent implements OnInit {
  message: string;
  intervalID = 0;
  second: number;
  @Input() remainingTime: number;

  clearTimer(): void {
    clearInterval(this.intervalID);
  }


  start(): void {
    this.second = this.remainingTime;
    this.countDown();
  }

  stop(): void {
    this.clearTimer();
    this.message = `Giữ Tại Giây Thứ-${this.second - this.remainingTime}`;
  }

  reset(): void {
    this.clearTimer();
    this.remainingTime = 0;
    this.message = 'Xin Nhập Thời Gian (giây)';
  }

  countDown(): void {
    this.clearTimer();
    this.intervalID = window.setInterval(() => {
      this.remainingTime -= 1;
      if (this.remainingTime === 0) {
        this.message = 'Hết Giờ!';
        this.clearTimer();
      } else {
        this.message = `${this.second - this.remainingTime} giây đã qua`;
      }
    }, 1000);

  }

  constructor() {
  }

  ngOnInit(): void {
    this.reset();
  }

}
