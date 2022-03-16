import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatSortModule } from '@angular/material/sort';
import { MatCardModule } from '@angular/material/card';
import { HttpClientModule } from '@angular/common/http';

import { ExamesRoutingModule } from './exames-routing.module';
import { ExamesComponent } from './exames/exames.component';
import { OcorrenciasService } from './service/ocorrencias.service';



@NgModule({
  declarations: [
    ExamesComponent
  ],
  imports: [
    CommonModule,
    ExamesRoutingModule,
    MatSortModule,
    MatCardModule,
    HttpClientModule
  ],
  providers:[
    OcorrenciasService
  ]
})
export class ExamesModule { }
