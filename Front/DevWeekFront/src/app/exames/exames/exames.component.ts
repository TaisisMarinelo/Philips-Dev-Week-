import { Component, OnInit } from '@angular/core';
import { Faixaetaria } from '../model/faixaetaria';
import { Ocorrencias } from '../model/ocorrencias';
import { Regiao } from '../model/regiao';
import { FaixaetariaService } from '../service/faixaetaria.service';
import { OcorrenciasService } from '../service/ocorrencias.service';
import { RegiaoService } from '../service/regiao.service';

@Component({
  selector: 'app-exames',
  templateUrl: './exames.component.html',
  styleUrls: ['./exames.component.css']
})
export class ExamesComponent implements OnInit {

  /*declaração de variaveis */
  ocorrenciaExame: Ocorrencias[] = [];
  regioes: Regiao[] = [];
  faixaEtaria: Faixaetaria[] = [];

  /*Váriavel que passa o serviço para o construtor */
  constructor(
    private ocorrenciaService: OcorrenciasService,
    private regiaoSerice: RegiaoService,
    private faixaEtariaService: FaixaetariaService
    ) { }

    /*evento de inicialização dos componentes */
  ngOnInit(): void {
    this.ocorrenciaService.listOcorrencias().subscribe(ocorrencias => {this.ocorrenciaExame = ocorrencias});
    this.regiaoSerice.listRegioes().subscribe(regioes => {this.regioes = regioes});
    this.faixaEtariaService.listFaixa().subscribe(faixaetaria => {this.faixaEtaria = faixaetaria});
  }

}
