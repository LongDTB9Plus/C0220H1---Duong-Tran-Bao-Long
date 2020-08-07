import {Injectable} from '@angular/core';

export interface Color {
  color: string;
}

@Injectable({
  providedIn: 'root'
})
export class ChangeImageService {
  color = [{color: 'red'}, {color: 'green'}, {color: 'blue'}
  ];

  getColor(index: number): string{
    return this.color[index].color;
  }
  constructor() {
  }
}
