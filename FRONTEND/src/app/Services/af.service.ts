import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Utilisateur } from '../Models/Utilisateur';
import { Agtcnss } from '../Models/Agtcnss';
import { VueAF } from '../Models/VueAF';
import { Vassure } from '../Models/Vassure';
import { Observable } from 'rxjs';
import { MvtDroitEnfant } from '../Models/MvtDroitEnfant';

@Injectable({
  providedIn: 'root',
})
export class AfService {
  URL = 'http://localhost:8083/af';

  constructor(private http: HttpClient) {}

  findByLoginAndPwd(login: number, pwd: string): Observable<Utilisateur> {
    return this.http.get<Utilisateur>(
      this.URL + '/findByLoginAndPwd/' + login + '/' + pwd
    );
  }

  findByIdtMatag(login: number): Observable<Agtcnss> {
    return this.http.get<Agtcnss>(this.URL + '/findByIdtMatag/' + login);
  }

  findByAssMatAndAssCle(assMat: number, assCle: number): Observable<Vassure> {
    return this.http.get<Vassure>(
      this.URL + '/findByAssMatAndAssCle/' + assMat + '/' + assCle
    );
  }

  getAllByAssMatOrderByRangBen(assMat: number): Observable<VueAF[]> {
    return this.http.get<VueAF[]>(
      this.URL + '/getAllByAssMatOrderByRangBen/' + assMat
    );
  }

  findByBenIduCnss(benIduCnss: number): Observable<VueAF> {
    return this.http.get<VueAF>(this.URL + '/findByBenIduCnss/' + benIduCnss);
  }

  getAge(benIduCnss: number): Observable<number> {
    return this.http.get<number>(this.URL + '/getAge/' + benIduCnss);
  }

  getAllDocumentLibellesByAge(age: number): Observable<string[]> {
    return this.http.get<string[]>(
      this.URL + '/getAllDocumentLibellesByAge/' + age
    );
  }

  updateVueAF(vueAF: VueAF, benIduCnss: number): Observable<VueAF> {
    return this.http.post<VueAF>(
      this.URL + '/updateVueAF/' + benIduCnss,
      vueAF
    );
  }

  getAllById_BenIduCnss(benIduCnss: number): Observable<MvtDroitEnfant[]> {
    return this.http.get<MvtDroitEnfant[]>(
      this.URL + '/getAllById_BenIduCnss/' + benIduCnss
    );
  }
}
