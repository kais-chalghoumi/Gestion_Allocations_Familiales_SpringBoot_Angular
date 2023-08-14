import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListBeneficiaireComponent } from './list-beneficiaire.component';

describe('ListBeneficiaireComponent', () => {
  let component: ListBeneficiaireComponent;
  let fixture: ComponentFixture<ListBeneficiaireComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ListBeneficiaireComponent]
    });
    fixture = TestBed.createComponent(ListBeneficiaireComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
