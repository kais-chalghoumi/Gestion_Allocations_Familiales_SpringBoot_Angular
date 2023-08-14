import { Component, OnInit, ViewChild } from '@angular/core';
import { Vassure } from '../Models/Vassure';
import { VueAF } from '../Models/VueAF';
import { NgForm } from '@angular/forms';
import { AfService } from '../Services/af.service';
import { SharedDataService } from '../Services/shared-data.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-list-beneficiaire',
  templateUrl: './list-beneficiaire.component.html',
  styleUrls: ['./list-beneficiaire.component.css'],
})
export class ListBeneficiaireComponent implements OnInit {
  assMat!: number;
  assCle!: number;
  found: boolean = false;
  vassure!: Vassure;
  vueAf!: VueAF[];
  errorMessage: string = '';
  @ViewChild('f') myForm!: NgForm;
  constructor(
    private services: AfService,
    private SD: SharedDataService,
    private route: Router
  ) {}

  ngOnInit(): void {
    this.vassure = new Vassure();
  }

  search() {
    this.services
      .findByAssMatAndAssCle(this.assMat, this.assCle)
      .subscribe((result: Vassure) => {
        if (
          (result && result.assDerreg == 100) ||
          (result && result.assDerreg == 280) ||
          (result && result.assDerreg == 19) ||
          (result && result.assDerreg == 21) ||
          (result && result.assDerreg == 22) ||
          (result && result.assDerreg == 30)
        ) {
          this.vassure = result;
          this.SD.setAssMat(this.vassure.assMat);
          this.SD.setAssCle(this.vassure.assCle);
          this.found = true;
          this.services
            .getAllByAssMatOrderByRangBen(this.vassure.assMat)
            .subscribe((res: VueAF[]) => {
              console.log(res);
              this.vueAf = res;
            });
        } else if (result == null) {
          this.errorMessage = 'الرجاء التثبت في رقم المستعمل';
          // Fermeture automatique de l'alerte
          setTimeout(() => {
            this.errorMessage = '';
          }, 2000);
        } else {
          this.errorMessage =
            'النظام المسجل لا يخول لك التمتع بالمنافع العائلية';
          // Fermeture automatique de l'alerte
          setTimeout(() => {
            this.errorMessage = '';
          }, 2000);
        }
      });
  }

  cancel() {
    this.vassure.assIu = '';
    this.vassure.assNom = '';
    this.vassure.assPrenom = '';
    this.vassure.adresse = '';
    this.found = false;
    this.myForm.reset();
  }
}
