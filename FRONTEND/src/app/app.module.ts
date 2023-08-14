import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AcceuilComponent } from './acceuil/acceuil.component';
import { AuthentificationComponent } from './authentification/authentification.component';
import { FooterComponent } from './footer/footer.component';
import { HeadComponent } from './head/head.component';
import { ListBeneficiaireComponent } from './list-beneficiaire/list-beneficiaire.component';
import { MvtDroitEnfantComponent } from './mvt-droit-enfant/mvt-droit-enfant.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { NotFoundComponent } from './not-found/not-found.component';
import { UpdateBeneficiaireComponent } from './update-beneficiaire/update-beneficiaire.component';
import { TestComponent } from './test/test.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    AcceuilComponent,
    AuthentificationComponent,
    FooterComponent,
    HeadComponent,
    ListBeneficiaireComponent,
    MvtDroitEnfantComponent,
    NavBarComponent,
    NotFoundComponent,
    UpdateBeneficiaireComponent,
    TestComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    BrowserModule,
    FormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
