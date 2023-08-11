import { TestBed } from '@angular/core/testing';

import { AFService } from './af.service';

describe('AFService', () => {
  let service: AFService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AFService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
