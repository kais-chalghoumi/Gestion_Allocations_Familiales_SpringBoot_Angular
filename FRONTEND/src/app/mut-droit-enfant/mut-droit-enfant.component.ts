import { Component, OnInit } from '@angular/core';
import { Agtcnss } from '../Models/Agtcnss';
import { SharedDataService } from '../Services/shared-data.service';
import { AFService } from '../Services/af.service';

@Component({
  selector: 'app-mut-droit-enfant',
  templateUrl: './mut-droit-enfant.component.html',
  styleUrls: ['./mut-droit-enfant.component.css'],
})
export class MutDroitEnfantComponent implements OnInit {
  login!: number;
  agtcnss!: Agtcnss;

  constructor(private SD: SharedDataService, private services: AFService) {
    this.login = this.SD.getUserLogin();
  }

  ngOnInit(): void {
    this.services.findByIdtMatag(this.login).subscribe((res: Agtcnss) => {
      this.agtcnss = res;
    });
  }
}
