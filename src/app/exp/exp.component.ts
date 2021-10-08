import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-exp',
  templateUrl: './exp.component.html',
  styleUrls: ['./exp.component.scss']
})
export class ExpComponent implements OnInit{
   
   updateForm: FormGroup;
   
   constructor(
      private formBuilder: FormBuilder,
      ) { }

   ngOnInit() {
      
         this.updateForm = this.formBuilder.group(
            {
               name: [null, Validators.required],
            }, 
            { updateOn: 'submit' }
            );
      
   }
 
}


