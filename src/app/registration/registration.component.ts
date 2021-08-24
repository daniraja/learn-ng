import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { Validators } from '@angular/forms';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.scss']
})
export class RegistrationComponent {
  registration = new FormGroup({
  firstName: new FormControl('', Validators.required),
  lastName: new FormControl('', Validators.required),
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


