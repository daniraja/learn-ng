import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root'
})
export class RegistrationService {
url = 'http://localhost:8080/addRegis'
  constructor(
    private http: HttpClient) {}
    addRegistration(user:any){
    return this.http.post(this.url, user).toPromise();
    
    }
    
}
