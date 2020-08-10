import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddDetailContractComponent } from './add-detail-contract.component';

describe('AddDetailContractComponent', () => {
  let component: AddDetailContractComponent;
  let fixture: ComponentFixture<AddDetailContractComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddDetailContractComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddDetailContractComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
