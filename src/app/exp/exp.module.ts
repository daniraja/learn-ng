import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ExpComponent } from './exp.component';
import { ReactiveFormsModule } from '@angular/forms';



@NgModule({
  declarations: [
    ExpComponent
  ],
  imports: [
    CommonModule,
    ReactiveFormsModule
  ]
})
export class ExpModule { }
