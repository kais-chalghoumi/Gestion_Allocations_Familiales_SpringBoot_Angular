import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EnregistrerEnfantsComponent } from './enregistrer-enfants.component';

describe('EnregistrerEnfantsComponent', () => {
  let component: EnregistrerEnfantsComponent;
  let fixture: ComponentFixture<EnregistrerEnfantsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EnregistrerEnfantsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EnregistrerEnfantsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
