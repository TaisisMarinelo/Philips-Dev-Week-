package com.dio_class.devweek.Entity;

import javax.persistence.*;

@Entity
@Table(name = "faixa_etaria")
public class FaixaEtaria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(name = "faixa_i")
    private Integer faixaI;
    @Column(name = "faixa_n")
    private Integer faixaN;
    private String descricao;


    public FaixaEtaria(Integer faixaI, Integer faixaN, String descricao) {
        this.faixaI = faixaI;
        this.faixaN = faixaN;
        this.descricao = descricao;
    }

    public FaixaEtaria() {
    }

    public Long getId() {
        return id;
    }

    public Integer getFaixaI() {
        return faixaI;
    }

    public void setFaixaI(Integer faixaI) {
        this.faixaI = faixaI;
    }

    public Integer getFaixaN() {
        return faixaN;
    }

    public void setFaixaN(Integer faixaN) {
        this.faixaN = faixaN;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
