import { Component, OnInit } from '@angular/core';
import { Utilisateur } from '../Models/Utilisateur';
import { UtilisateurService } from '../Services/utilisateur.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-authentification',
  templateUrl: './authentification.component.html',
  styleUrls: ['./authentification.component.css'],
})
export class AuthentificationComponent implements OnInit {
  found: boolean = false;
  utilisateur!: Utilisateur;
  errorMessage: string = '';
  constructor(private US: UtilisateurService, private router: Router) {}

  ngOnInit(): void {
    this.utilisateur = new Utilisateur;
  }

  Check() {
    this.US.findByLoginAndPwd(
      this.utilisateur.login,
      this.utilisateur.pwd
    ).subscribe((result: Utilisateur) => {
      if (result) {
        this.found = true;
        this.utilisateur = result;
        this.router.navigate(['/acceuil']);
      } else {
        this.found = false;
        this.errorMessage = 'Login ou mot de passe incorrect';
        // Fermeture automatique de l'alerte après 10 secondes
        setTimeout(() => {
          this.errorMessage = '';
        }, 2000);
      }
    });
  }
}
