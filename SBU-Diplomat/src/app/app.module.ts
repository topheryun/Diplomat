import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { LoginComponent } from './login/login.component';

import { RouterModule } from '@angular/router';
import { Form1Component } from './form1/form1.component';
import { Form2Component } from './form2/form2.component';
import { User1Component } from './user1/user1.component';
import { MediatorComponent } from './mediator/mediator.component';
import { UserDashboardComponent } from './user-dashboard/user-dashboard.component';
import { UserDiplomatMiniFormComponent } from './user-diplomat-mini-form/user-diplomat-mini-form.component';
import { MediatorDashboardComponent } from './mediator-dashboard/mediator-dashboard.component';
import { MediatorDiplomatMiniFormComponent } from './mediator-diplomat-mini-form/mediator-diplomat-mini-form.component';

import { DisplayUsersComponent } from './display-users/display-users.component';
import { TestComponent } from './test/test.component';
import { UserService } from './user-service.service';
import { HttpClientModule } from '@angular/common/http';
import { RegisterComponent } from './register/register.component';
import { HomeComponent } from './home/home.component';

@NgModule({
  declarations: [
    AppComponent,
    NavBarComponent,
    LoginComponent,
    Form1Component,
    Form2Component,
    User1Component,
    MediatorComponent,
    UserDashboardComponent,
    UserDiplomatMiniFormComponent,
    MediatorDashboardComponent,
    MediatorDiplomatMiniFormComponent,
    DisplayUsersComponent,
    TestComponent,
    RegisterComponent,
    HomeComponent
  ],

  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule.forRoot([
      { path: '', component:HomeComponent },
      { path: 'login', component: LoginComponent},
      { path: 'form1', component: Form1Component},
      { path: 'form2', component: Form2Component},
      { path: 'user-dashboard', component: UserDashboardComponent},
      { path: 'mediator-dashboard', component: MediatorDashboardComponent},
      { path: 'mediator', component: MediatorComponent}
    ])
  ],
  providers: [UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
