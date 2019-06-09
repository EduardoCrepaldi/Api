import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListarComponent } from './Mae/listar/listar.component';
import { AddComponent } from './Mae/add/add.component';
import { EditComponent } from './Mae/edit/edit.component';
import { FormsModule }from '@angular/forms'
import { ServiceService } from '../app/Service/service.service'
import {HttpClientModule } from '@angular/common/http'

@NgModule({
  declarations: [
    AppComponent,
    ListarComponent,
    AddComponent,
    EditComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [ServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
