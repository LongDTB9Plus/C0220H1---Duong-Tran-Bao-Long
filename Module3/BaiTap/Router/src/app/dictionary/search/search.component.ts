import {Component, OnInit} from '@angular/core';
import {DictionaryService} from '../dictionary.service';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {
  keyword: string;
  result: string;

  constructor(private service: DictionaryService) {
  }

  ngOnInit(): void {

  }

  onChange(): void {
    console.log(this.keyword);
    this.result = this.service.search(this.keyword);
    console.log(this.result);
    console.log(this.keyword);
  }
}
