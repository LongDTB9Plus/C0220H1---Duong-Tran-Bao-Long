import { TestBed } from '@angular/core/testing';

import { DateUntilService } from './date-ultil.service';

describe('DateUltilService', () => {
  let service: DateUntilService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DateUntilService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
