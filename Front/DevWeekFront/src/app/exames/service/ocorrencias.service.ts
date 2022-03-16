import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Ocorrencias } from '../model/ocorrencias';

@Injectable({
  providedIn: 'root'
})
export class OcorrenciasService {

  constructor(
    private http:HttpClient
  ) { }

  listOcorrencias() : Observable<Ocorrencias[]>{
    const url = '/api/ocorrencias';
    return this.http.get<Ocorrencias[]>(url);
  }
}

//[
//  {id:1, regiaoId:1, mes:4, faixaId:5, qntExames:3}
//]

