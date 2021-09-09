import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, FormArray, ValidatorFn } from '@angular/forms';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.scss']
})
export class RegistrationComponent {
  registration = new FormGroup({
    firstName: new FormControl([Validators.required, Validators.maxLength(100), Validators.minLength(2), Validators.pattern(`^(?=.{2,100}$)[a-zA-Z]+(?:['_.\\s][a-zA-Z]+)*$`)]),
    lastName: new FormControl([Validators.pattern(`^[a-zA-Z]+$`), Validators.maxLength(100)]),
      
  email: new FormControl('', Validators.required),
  phone: new FormControl('', [Validators.required, Validators.pattern("^((\\+1-?)|0)?[0-9]{10}$")]),
  password: new FormControl('', Validators.required),
  confirmPassword: new FormControl('', Validators.required),
});
onSubmit() {
 // TODO: Use EventEmitter with form value
  console.warn(this.registration.value);
}
}


