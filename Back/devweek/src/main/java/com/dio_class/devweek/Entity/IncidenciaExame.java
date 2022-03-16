package com.dio_class.devweek.Entity;

import javax.persistence.*;

@Entity
@Table(name = "incidencia_exame")
public class IncidenciaExame {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(name = "regiao_id")
    private Integer regiaoId;
    private Integer mes;
    @Column(name = "faixa_id")
    private Long faixaId;
    @Column(name = "qnt_exames")
    private Integer qntExames;


    public IncidenciaExame(Integer regiaoId, Integer mes, Long faixaId, Integer qntExames) {
        this.regiaoId = regiaoId;
        this.mes = mes;
        this.faixaId = faixaId;
        this.qntExames = qntExames;
    }

    public IncidenciaExame() {
    }

    public Long getId() {
        return id;
    }

    public Integer getRegiaoId() {
        return regiaoId;
    }

    public void setRegiaoId(Integer regiaoId) {
        this.regiaoId = regiaoId;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Long getFaixaId() {
        return faixaId;
    }

    public void setFaixaId(Long faixaId) {
        this.faixaId = faixaId;
    }

    public Integer getQntExames() {
        return qntExames;
    }

    public void setQntExames(Integer qntExames) {
        this.qntExames = qntExames;
    }
}
