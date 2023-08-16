import { Component, OnInit } from '@angular/core';
import { Agtcnss } from '../Models/Agtcnss';
import { SharedDataService } from '../Services/shared-data.service';
import { AfService } from '../Services/af.service';

@Component({
  selector: 'app-mvt-droit-enfant',
  templateUrl: './mvt-droit-enfant.component.html',
  styleUrls: ['./mvt-droit-enfant.component.css'],
})
export class MvtDroitEnfantComponent implements OnInit {
  login!: number;
  agtcnss!: Agtcnss;

  constructor(private SD: SharedDataService, private services: AfService) {
    this.login = this.SD.getUserLogin();
  }

  ngOnInit(): void {
    this.agtcnss = new Agtcnss;
    this.services.findByIdtMatag(this.login).subscribe((res: Agtcnss) => {
      this.agtcnss = res;
    });
  }
}
