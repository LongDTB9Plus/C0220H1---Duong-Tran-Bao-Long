import {Injectable} from '@angular/core';

export interface IWord {
  ENG: string;
  VIE: string;
}

@Injectable({
  providedIn: 'root'
})
export class DictionaryService {

  private words: IWord[] = [
    {
      ENG: 'service',
      VIE: 'dịch vụ'
    }, {
      ENG: 'service provider',
      VIE: 'nhà cung cấp dịch vụ'
    }, {
      ENG: 'provide',
      VIE: 'cung cấp'
    }, {
      ENG: 'efficient',
      VIE: 'hiệu quả'
    }, {
      ENG: 'snow',
      VIE: 'tuyết'
    }
  ];

  search(word: string): string {
    if (!word) {
      return '';
    }
    const result = this.words.find(item => item.ENG === word.toLowerCase());
    if (result){
      return result.VIE;
    }
    return  'Not Found';
  }

  constructor() {
  }
}
