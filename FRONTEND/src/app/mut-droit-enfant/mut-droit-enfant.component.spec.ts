import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MutDroitEnfantComponent } from './mut-droit-enfant.component';

describe('MutDroitEnfantComponent', () => {
  let component: MutDroitEnfantComponent;
  let fixture: ComponentFixture<MutDroitEnfantComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MutDroitEnfantComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MutDroitEnfantComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
