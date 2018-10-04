import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmpSpringComponent } from './emp-spring.component';

describe('EmpSpringComponent', () => {
  let component: EmpSpringComponent;
  let fixture: ComponentFixture<EmpSpringComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmpSpringComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmpSpringComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
