import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Utilisateur } from '../Models/Utilisateur';
import { Agtcnss } from '../Models/Agtcnss';
import { Vassure } from '../Models/Vassure';

@Injectable({
  providedIn: 'root',
})
export class AFService {
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
}
