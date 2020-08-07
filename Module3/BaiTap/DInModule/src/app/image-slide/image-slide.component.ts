import {Component, OnInit} from '@angular/core';
import {ChangeImageService} from '../change-image.service';

@Component({
  selector: 'app-image-slide',
  templateUrl: './image-slide.component.html',
  styleUrls: ['./image-slide.component.css']
})
export class ImageSlideComponent implements OnInit {
  index = 0;
  color = 'red';

  constructor(private changeImageService: ChangeImageService) {
  }

  ngOnInit(): void {

  }

  changeImageNext(): void {
    this.index += 1;
    if (this.index === 3) {
      this.index = 0;
    }
    this.color = this.changeImageService.getColor(this.index);
  }
  changeImagePrevious(): void {
    this.index -= 1;
    if (this.index === -1) {
      this.index = 2;
    }
    this.color = this.changeImageService.getColor(this.index);
  }
}
