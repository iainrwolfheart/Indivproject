import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FindlinkComponent } from './findlink.component';

describe('FindlinkComponent', () => {
  let component: FindlinkComponent;
  let fixture: ComponentFixture<FindlinkComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FindlinkComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FindlinkComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
