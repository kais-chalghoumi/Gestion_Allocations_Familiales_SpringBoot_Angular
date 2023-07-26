import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GestDroitsPrestFamComponent } from './gest-droits-prest-fam.component';

describe('GestDroitsPrestFamComponent', () => {
  let component: GestDroitsPrestFamComponent;
  let fixture: ComponentFixture<GestDroitsPrestFamComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GestDroitsPrestFamComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(GestDroitsPrestFamComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
