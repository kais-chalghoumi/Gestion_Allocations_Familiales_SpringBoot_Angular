import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AuthentificationComponent } from './authentification/authentification.component';
import { FooterComponent } from './footer/footer.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { HeadComponent } from './head/head.component';
import { MutDroitEnfantComponent } from './mut-droit-enfant/mut-droit-enfant.component';
import { NotFoundComponent } from './not-found/not-found.component';
import { GestDroitsPrestFamComponent } from './gest-droits-prest-fam/gest-droits-prest-fam.component';
import { TestComponent } from './test/test.component';

@NgModule({
  declarations: [
    AppComponent,
    AuthentificationComponent,
    FooterComponent,
    NavBarComponent,
    HeadComponent,
    MutDroitEnfantComponent,
    NotFoundComponent,
    GestDroitsPrestFamComponent,
    TestComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
