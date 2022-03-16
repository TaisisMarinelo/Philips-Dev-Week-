package com.dio_class.devweek.Entity;

import javax.persistence.*;

@Entity
@Table(name = "regiao")
public class Regiao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String regiao;
    @Column(name = "total_exames")
    private Integer totalExames;


    public Regiao(String regiao, Integer totalExames) {
        this.regiao = regiao;
        this.totalExames = totalExames;
    }

    public Regiao() {
    }

    public Long getId() {
        return id;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public Integer getTotalExames() {
        return totalExames;
    }

    public void setTotalExames(Integer totalExames) {
        this.totalExames = totalExames;
    }
}
