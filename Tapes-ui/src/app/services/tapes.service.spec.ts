import { TestBed } from '@angular/core/testing';

import { TapesService } from './tapes.service';

describe('TapesService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: TapesService = TestBed.get(TapesService);
    expect(service).toBeTruthy();
  });
});
