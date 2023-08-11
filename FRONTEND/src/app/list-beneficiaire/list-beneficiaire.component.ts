import { Component, OnInit } from '@angular/core';
import { AFService } from '../Services/af.service';
import { Vassure } from '../Models/Vassure';

@Component({
  selector: 'app-list-beneficiaire',
  templateUrl: './list-beneficiaire.component.html',
  styleUrls: ['./list-beneficiaire.component.css'],
})
export class ListBeneficiaireComponent implements OnInit {
  assMat!: number;
  assCle!: number;
  vassure!: Vassure;
  constructor(private services: AFService) {}

  ngOnInit(): void {
    this.vassure = new Vassure ;
  }

  search() {
    this.services
      .findByAssMatAndAssCle(this.assMat, this.assCle)
      .subscribe((result: Vassure) => {
        if(result){
          this.vassure = result;
        }
      });
  }
}
