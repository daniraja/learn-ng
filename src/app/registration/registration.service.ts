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
    
    public uploadImage(image: File): Observable<Response> {
      const formData = new FormData();
  
      formData.append('image', image);
  
      return this.http.post('/api/v1/image-upload', formData);
    }
}
