import { TestBed } from '@angular/core/testing';

import { ChangeImageService } from './change-image.service';

describe('ChangeImageService', () => {
  let service: ChangeImageService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ChangeImageService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
