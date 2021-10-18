import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { RegistrationService } from './registration.service';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.scss']
})
export class RegistrationComponent implements OnInit {
  registration:any;
  passmsg: string | undefined; 

  constructor(private registrationService: RegistrationService){

  }
  
ngOnInit(){
  this.registration = new FormGroup({
    firstName: new FormControl('', [Validators.required, Validators.maxLength(100), Validators.minLength(4), Validators.pattern(`^[a-zA-Z]+$`)]),
    lastName: new FormControl('', [Validators.pattern(`^[a-zA-Z]+$`), Validators.required, Validators.maxLength(100), Validators.minLength(4)]),
    email: new FormControl('', [Validators.required, Validators.pattern(`^[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$`)]),
    phone: new FormControl('', [Validators.required, Validators.pattern(`^((\\+1-?)|0)?[0-9]{10}$`)]),
    password: new FormControl('', [Validators.required]),
    confirmPassword: new FormControl('', [Validators.required]),
    
});
}

checkPassSame() {
  let pass = this.registration.value.password;
  let passConf = this.registration.value.confirmPassword;
  if(pass == passConf && this.registration.valid === true) {
    this.passmsg = "";
    return false;
  }else {
    this.passmsg = "Password did not match.";
    return true;
  }
}

onSubmit() {
 // TODO: Use EventEmitter with form value
  console.warn(this.registration.value);
  this.registrationService.addRegistration(this.registration.value).then(Response=> {
    console.log("successfully Saved", Response)

  }).catch(Error=> {
    console.error("failed to save", Error)
  })
}
}


