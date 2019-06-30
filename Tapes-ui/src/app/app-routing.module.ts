import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AdminComponent } from './components/admin/admin.component';
import { HomeComponent } from './components/home/home.component';
import { ViewtapesComponent } from './components/viewtapes/viewtapes.component';
import { AddtapeComponent } from './components/addtape/addtape.component';
import { FindlinkComponent } from './components/findlink/findlink.component';

const routes: Routes = [
  {
    path: 'home',
    component: HomeComponent
  },
  {
    path: 'viewtapes',
    component: ViewtapesComponent
  },
  {
    path: 'addtape',
    component: AddtapeComponent
  },
  {
    path: 'findlink',
    component: FindlinkComponent
  },
  {
    path: 'admin',
    component: AdminComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
