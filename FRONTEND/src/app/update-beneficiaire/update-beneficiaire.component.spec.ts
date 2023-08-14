import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateBeneficiaireComponent } from './update-beneficiaire.component';

describe('UpdateBeneficiaireComponent', () => {
  let component: UpdateBeneficiaireComponent;
  let fixture: ComponentFixture<UpdateBeneficiaireComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [UpdateBeneficiaireComponent]
    });
    fixture = TestBed.createComponent(UpdateBeneficiaireComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
