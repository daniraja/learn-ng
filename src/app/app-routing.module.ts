import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RegistrationComponent } from './registration/registration.component';
import { ExpComponent } from './exp/exp.component';


const routes: Routes = [
  { path: 'registration', component: RegistrationComponent },
  { path: 'exp', component: ExpComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
