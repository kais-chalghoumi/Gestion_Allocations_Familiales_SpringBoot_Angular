import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthentificationComponent } from './authentification/authentification.component';
import { NotFoundComponent } from './not-found/not-found.component';
import { GestDroitsPrestFamComponent } from './gest-droits-prest-fam/gest-droits-prest-fam.component';
import { TestComponent } from './test/test.component';
import { MutDroitEnfantComponent } from './mut-droit-enfant/mut-droit-enfant.component';

const routes: Routes = [
  { path: '', redirectTo: 'authentification', pathMatch: 'full' },
  { path: 'authentification', component: AuthentificationComponent },
  { path: 'gestion_droits_prestation_familiale', component: GestDroitsPrestFamComponent },
  { path: 'nvt', component: MutDroitEnfantComponent },
  { path: 'test', component: TestComponent },
  { path: 'test', component: TestComponent },
  { path: '**', component: NotFoundComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
