import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewtapesComponent } from './viewtapes.component';

describe('ViewtapesComponent', () => {
  let component: ViewtapesComponent;
  let fixture: ComponentFixture<ViewtapesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ViewtapesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewtapesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
