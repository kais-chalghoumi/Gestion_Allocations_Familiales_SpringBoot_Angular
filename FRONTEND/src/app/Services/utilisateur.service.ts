import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Utilisateur } from '../Models/Utilisateur';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class UtilisateurService {
  URL = 'http://localhost:8083/af';

  constructor(private http: HttpClient) {}

  findByLoginAndPwd(login: number, pwd: string): Observable<Utilisateur> {
    return this.http.get<Utilisateur>(
      this.URL + '/findByLoginAndPwd/' + login + '/' + pwd
    );
  }
}
