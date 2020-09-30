import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DisplayUsersComponent } from './display-users/display-users.component';
import { RegisterComponent } from './register/register.component';
const routes: Routes = [
  {path: 'users',component: DisplayUsersComponent},
  {path: 'register', component: RegisterComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
