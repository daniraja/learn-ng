import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.scss']
})
export class RegistrationComponent {
  registration = new FormGroup({

  firstName: new FormControl(''),
  lastName: new FormControl(''),
  email: new FormControl(''),
  phone: new FormControl(''),
  password: new FormControl(''),
  confirmPassword: new FormControl(''),
});
onSubmit() {
  // TODO: Use EventEmitter with form value
  console.warn(this.registration.value);
}
}
