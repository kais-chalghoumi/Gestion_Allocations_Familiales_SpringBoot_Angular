import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MvtDroitEnfantComponent } from './mvt-droit-enfant.component';

describe('MvtDroitEnfantComponent', () => {
  let component: MvtDroitEnfantComponent;
  let fixture: ComponentFixture<MvtDroitEnfantComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [MvtDroitEnfantComponent]
    });
    fixture = TestBed.createComponent(MvtDroitEnfantComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
