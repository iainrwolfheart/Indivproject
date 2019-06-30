import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddtapeComponent } from './addtape.component';

describe('AddtapeComponent', () => {
  let component: AddtapeComponent;
  let fixture: ComponentFixture<AddtapeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddtapeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddtapeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
