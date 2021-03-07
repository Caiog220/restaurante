package com.projeto.restaurante.model;

public class Mesa {
    
    private Integer id;
    private Integer qtdCadeiras;
    private Boolean reservada;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQtdCadeiras() {
        return qtdCadeiras;
    }

    public void setQtdCadeiras(Integer qtdCadeiras) {
        this.qtdCadeiras = qtdCadeiras;
    }

    public Boolean getReservada() {
        return reservada;
    }

    public void setReservada(Boolean reservada) {
        this.reservada = reservada;
    }

    

}
