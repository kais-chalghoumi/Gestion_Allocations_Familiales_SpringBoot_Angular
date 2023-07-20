import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AuthentificationComponent } from './authentification/authentification.component';
import { FooterComponent } from './footer/footer.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { HeadComponent } from './head/head.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { MutDroitEnfantComponent } from './mut-droit-enfant/mut-droit-enfant.component';

@NgModule({
  declarations: [
    AppComponent,
    AuthentificationComponent,
    FooterComponent,
    NavBarComponent,
    HeadComponent,
    WelcomeComponent,
    MutDroitEnfantComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
