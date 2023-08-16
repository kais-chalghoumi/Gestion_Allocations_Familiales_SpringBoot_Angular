import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthentificationComponent } from './authentification/authentification.component';
import { AcceuilComponent } from './acceuil/acceuil.component';
import { MvtDroitEnfantComponent } from './mvt-droit-enfant/mvt-droit-enfant.component';
import { NotFoundComponent } from './not-found/not-found.component';
import { TestComponent } from './test/test.component';

const routes: Routes = [
  { path: '', redirectTo: 'authentification', pathMatch: 'full' },
  { path: 'authentification', component: AuthentificationComponent },
  { path: 'acceuil', component: AcceuilComponent },
  { path: 'mvt', component: MvtDroitEnfantComponent },
  { path: 'test', component: TestComponent },
  { path: '**', component: NotFoundComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
