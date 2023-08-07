import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthentificationComponent } from './authentification/authentification.component';
import { NotFoundComponent } from './not-found/not-found.component';
import { GestDroitsPrestFamComponent } from './gest-droits-prest-fam/gest-droits-prest-fam.component';
import { AjouterAssureComponent } from './ajouter-assure/ajouter-assure.component';
import { EnregistrerEnfantsComponent } from './enregistrer-enfants/enregistrer-enfants.component';

const routes: Routes = [
  { path: '', redirectTo: 'authentification', pathMatch: 'full' },
  { path: 'authentification', component: AuthentificationComponent },
  { path: 'gestion_droits_prestation_familiale', component: GestDroitsPrestFamComponent },
  { path: 'ajouter_assure', component: AjouterAssureComponent },
  { path: 'Enregistrer_Enfants', component: EnregistrerEnfantsComponent },
  { path: 'Authentification', component: AuthentificationComponent },
  { path: '**', component: NotFoundComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
