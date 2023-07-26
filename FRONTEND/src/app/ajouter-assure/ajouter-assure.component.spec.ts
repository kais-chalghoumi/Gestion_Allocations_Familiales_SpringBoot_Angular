import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AjouterAssureComponent } from './ajouter-assure.component';

describe('AjouterAssureComponent', () => {
  let component: AjouterAssureComponent;
  let fixture: ComponentFixture<AjouterAssureComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AjouterAssureComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AjouterAssureComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
