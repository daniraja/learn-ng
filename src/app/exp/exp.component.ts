import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, FormArray, ValidatorFn } from '@angular/forms';

@Component({
  selector: 'app-exp',
  templateUrl: './exp.component.html',
  styleUrls: ['./exp.component.scss']
})
export class ExpComponent {
   public errorMessage =service: any;
   showValidationError!: boolean;
validationError: any;
   service: any;
 ‘’;
   
   constructor(private errorNotificationService:
      ErrorNotificationService) { }

   public submitForm()
{
   this.service.sendForm()
   .pipe(catchError((e: HttpErrorResponse)=>{
      if (e.status === 422){
         this.showValidationError = true;
         this.validationError = e.error.error;
         return of(null);
      }
      // TODO: Catch other errors: cf. next section
   }))
   .subscribe(/* TODO: Handle success */);
}

   ngOnInit() {
      this.errorNotificationService.notification.subscribe({
         next: (notification) => {
               this.errorMessage = notification;
         },
      });
   }
 
}


function catchError(arg0: (e: any) => any): any {
   throw new Error('Function not implemented.');
}

function of(arg0: null) {
   throw new Error('Function not implemented.');
}

