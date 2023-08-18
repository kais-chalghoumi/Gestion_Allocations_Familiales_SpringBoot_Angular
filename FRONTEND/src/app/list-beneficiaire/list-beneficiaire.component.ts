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
  beneficiaire!: VueAF;
  listVueAf!: VueAF[];
  listDocumentLibelles!: string[];
  listDroits!: string[];
  errorMessage: string = '';
  modalValue: any;
  @ViewChild('f1') myForm!: NgForm;
  constructor(
    private services: AfService,
    private SD: SharedDataService,
    private route: Router
  ) {}

  ngOnInit(): void {
    this.vassure = new Vassure();
    this.beneficiaire = new VueAF();
  }

  search(assMat: number, assCle: number) {
    this.services
      .findByAssMatAndAssCle(assMat, assCle)
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
              this.listVueAf = res;
              this.listVueAf.forEach((element) => {
                if (element.docBen == '2') {
                  element.docBen = 'مضمون وفاة الإبن المتوفي';
                } else if (element.docBen == 'A') {
                  element.docBen = 'عقد أو شهادة تدريب   ';
                } else if (element.docBen == 'D') {
                  element.docBen = 'إبن مضمون من جنسية مغربية';
                } else if (element.docBen == 'F') {
                  element.docBen = 'شهادة طبية للطفل المصاب بعجز أو بداء عضال.';
                } else if (element.docBen == 'H') {
                  element.docBen = 'بطاقة إعاقة';
                } else if (element.docBen == 'J') {
                  element.docBen = 'البنت التي تقوم مقام ربة البيت في رعاية إخوتها';
                } else if (element.docBen == 'P') {
                  element.docBen = 'إبن المنتفع بجراية شيخوخة ';
                } else if (element.docBen == 'R') {
                  element.docBen = 'إبن مضمون أجنبي مقيم بتونس';
                } else if (element.docBen == 'S') {
                  element.docBen = 'شهادة حضور مدرسية أوشهادة ترسيم بمؤسسة جامعية ';
                } else if (element.docBen == 'V') {
                  element.docBen = 'مضمون ولادة الإبن';
                } else {
                  element.docBen = 'حق متوقف في إنتضار بحث';
                }
              });
              this.listVueAf.forEach((element) => {
                if (element.droit == '0') {
                  element.droit = 'يفتح الحق في المنافع العائلية';
                } else if (element.droit == '1') {
                  element.droit = 'الحق في المنافع العائلية متوقف';
                } else if (element.droit == '3') {
                  element.droit = 'قاصر لا يفتح الحق في المنافع العائلية';
                } else if (element.droit == '4') {
                  element.droit = 'بالغ  لا يفتح الحق في المنافع العائلية';
                } else if (element.droit == '5') {
                  element.droit = 'يفتح الحق في المنافع العائلية في نظام الطلبة';
                } else if (element.droit == '6') {
                  element.droit = 'يفتح حق في المنافع العائلية للأرامل';
                } else if (element.droit == '7') {
                  element.droit = 'يفتح الحق في المنافع العائلية للمفصولين عن العمل لأسباب اقتصادية ';
                } else {
                  element.droit = 'يفتح الحق في المنافع العائلية للمصابين بعجز مستمر تفوق أو تعادل ن';
                }
              });
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

  openModal(benIduCnss: any) {
    this.modalValue = benIduCnss;
    this.services.findByBenIduCnss(benIduCnss).subscribe((res1: VueAF) => {
      this.beneficiaire = res1;
      console.log(this.beneficiaire);
    });
    this.services.getAllDocumentLibelles().subscribe((res2: string[]) => {
      console.log(res2);
      this.listDocumentLibelles = res2;
    });
  }

  update() {
    if (this.beneficiaire.docBen == 'مضمون وفاة الإبن المتوفي') {
      this.beneficiaire.docBen = '2';
    } else if (this.beneficiaire.docBen == 'عقد أو شهادة تدريب   ') {
      this.beneficiaire.docBen = 'A';
    } else if (this.beneficiaire.docBen == 'إبن مضمون من جنسية مغربية') {
      this.beneficiaire.docBen = 'D';
    } else if (this.beneficiaire.docBen == 'شهادة طبية للطفل المصاب بعجز أو بداء عضال.') {
      this.beneficiaire.docBen = 'F';
    } else if (this.beneficiaire.docBen == 'بطاقة إعاقة') {
      this.beneficiaire.docBen = 'H';
    } else if (this.beneficiaire.docBen == 'البنت التي تقوم مقام ربة البيت في رعاية إخوتها') {
      this.beneficiaire.docBen = 'J';
    } else if (this.beneficiaire.docBen == 'إبن المنتفع بجراية شيخوخة ') {
      this.beneficiaire.docBen = 'P';
    } else if (this.beneficiaire.docBen == 'إبن مضمون أجنبي مقيم بتونس') {
      this.beneficiaire.docBen = 'R';
    } else if (this.beneficiaire.docBen == 'شهادة حضور مدرسية أوشهادة ترسيم بمؤسسة جامعية ') {
      this.beneficiaire.docBen = 'S';
    } else if (this.beneficiaire.docBen == 'مضمون ولادة الإبن') {
      this.beneficiaire.docBen = 'V';
    } else if (this.beneficiaire.docBen == 'حق متوقف في إنتضار بحث') {
      this.beneficiaire.docBen = 'X';
    }
      this.services
        .updateVueAF(this.beneficiaire, this.beneficiaire.benIduCnss)
        .subscribe();
      this.search(this.SD.getAssMat(), this.SD.getAssCle());
      this.search(this.SD.getAssMat(), this.SD.getAssCle());
  }
}