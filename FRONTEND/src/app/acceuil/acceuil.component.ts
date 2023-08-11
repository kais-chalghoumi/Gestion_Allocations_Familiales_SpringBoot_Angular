import { Component, OnInit } from '@angular/core';
import { SharedDataService } from '../Services/shared-data.service';
import { Agtcnss } from '../Models/Agtcnss';
import { AFService } from '../Services/af.service';

@Component({
  selector: 'app-acceuil',
  templateUrl: './acceuil.component.html',
  styleUrls: ['./acceuil.component.css'],
})
export class AcceuilComponent implements OnInit {
  login!: number;
  agtcnss!: Agtcnss;

  constructor(private SD: SharedDataService, private services: AFService) {
    this.login = this.SD.getUserLogin();
  }

  ngOnInit(): void {
    this.services.findByIdtMatag(this.login).subscribe((res:Agtcnss) => {
      this.agtcnss=res;
    } );
  }
}
