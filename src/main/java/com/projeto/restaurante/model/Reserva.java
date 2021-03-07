package com.projeto.restaurante.model;

import java.time.LocalDate;

public class Reserva {
    
    private Integer id;
    private LocalDate dataHoraReserva;
    private LocalDate expiracaoReserva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDataHoraReserva() {
        return dataHoraReserva;
    }

    public void setDataHoraReserva(LocalDate dataHoraReserva) {
        this.dataHoraReserva = dataHoraReserva;
    }

    public LocalDate getExpiracaoReserva() {
        return expiracaoReserva;
    }

    public void setExpiracaoReserva(LocalDate expiracaoReserva) {
        this.expiracaoReserva = expiracaoReserva;
    }

    

}
