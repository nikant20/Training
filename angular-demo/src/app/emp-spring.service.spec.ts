import { TestBed } from '@angular/core/testing';

import { EmpSpringService } from './emp-spring.service';

describe('EmpSpringService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: EmpSpringService = TestBed.get(EmpSpringService);
    expect(service).toBeTruthy();
  });
});
