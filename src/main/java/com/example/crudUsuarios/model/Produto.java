package com.example.crudUsuarios.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Produto {
    private Long id;
    private String name;
    private Long qtd;

    

    public Produto() {
    }

    public Produto(Long id, String name, Long qtd) {
        this.id = id;
        this.name = name;
        this.qtd = qtd;
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getQtd() {
        return qtd;
    }

    public void setQtd(Long qtd) {
        this.qtd = qtd;
    }

    
    
}
