import { Injectable } from '@angular/core';
import { Regiao } from '../model/regiao'; //importando a model
import { HttpClient } from '@angular/common/http' //importe do http cliente
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class RegiaoService {

  constructor(
    private http:HttpClient
    ) { }

  listRegioes() : Observable<Regiao[]>{
    const url = '/api/regioes';
    return this.http.get<Regiao[]>(url);
  }
}


/**Dados que anteriosmente estavam mokados como retorno a chamada da listRegioes**/
//[ {id: 1, regiao: 'Norte', totalExames:5}, /*mokando dados*/
  //    {id: 2, regiao: 'Nordeste', totalExames:10},
   //   {id: 2, regiao: 'Sudeste', totalExames:200},
   //   {id: 2, regiao: 'Sul', totalExames:80},
   //   {id: 2, regiao: 'Centro-Oeste', totalExames:8}]