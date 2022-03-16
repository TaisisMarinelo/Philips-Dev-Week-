import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Faixaetaria } from '../model/faixaetaria';

@Injectable({
  providedIn: 'root'
})
export class FaixaetariaService {

  constructor(
    private http:HttpClient
  ) { }

  listFaixa() : Observable<Faixaetaria[]>{
    const url = '/api/faixa-etaria';
    return this.http.get<Faixaetaria[]>(url);
  }
}

//[
 // {id:1, faixaI:5, faixaN:8, descricao:'exame'}
//]