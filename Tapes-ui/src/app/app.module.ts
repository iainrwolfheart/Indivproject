import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { ReactiveFormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TapesService } from './services/tapes.service';
import { AdminComponent } from './components/admin/admin.component';
import { HomeComponent } from './components/home/home.component';
import { ViewtapesComponent } from './components/viewtapes/viewtapes.component';
import { FindlinkComponent } from './components/findlink/findlink.component';
import { AddtapeComponent } from './components/addtape/addtape.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    AdminComponent,
    HomeComponent,
    ViewtapesComponent,
    FindlinkComponent,
    AddtapeComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [TapesService],
  bootstrap: [AppComponent]
})
export class AppModule { }
