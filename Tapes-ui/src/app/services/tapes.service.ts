import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable} from 'rxjs';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
}
@Injectable({
  providedIn: 'root'
})
@Injectable()
export class TapesService {

  constructor(private http:HttpClient) { }

    getTapes(): Observable<any>{
      return this.http.get('http://localhost:3000/api/v1/tapes');
    }

    getTapeByName(songName: String) {
      return this.http.get('http://localhost:3000/api/v1/tapes/'+ songName);
    }

    addTape(tape) {
      let body = JSON.stringify(tape);
      return this.http.post('http://localhost:3000/api/v1/tapes', body, httpOptions);
    }
}
