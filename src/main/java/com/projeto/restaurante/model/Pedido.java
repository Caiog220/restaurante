package com.projeto.restaurante.model;

import java.time.LocalDate;
import java.util.List;

public class Pedido {
    
    private Integer id;
    private LocalDate dataHoraPedido;
    private LocalDate previsaoEntrega;
    private List<Item> Itens;
    private Boolean paraEntrega;
    private Double valorTotal;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDataHoraPedido() {
        return dataHoraPedido;
    }

    public void setDataHoraPedido(LocalDate dataHoraPedido) {
        this.dataHoraPedido = dataHoraPedido;
    }

    public LocalDate getPrevisaoEntrega() {
        return previsaoEntrega;
    }

    public void setPrevisaoEntrega(LocalDate previsaoEntrega) {
        this.previsaoEntrega = previsaoEntrega;
    }

    public List<Item> getItens() {
        return Itens;
    }

    public void setItens(List<Item> itens) {
        Itens = itens;
    }

    public Boolean getParaEntrega() {
        return paraEntrega;
    }

    public void setParaEntrega(Boolean paraEntrega) {
        this.paraEntrega = paraEntrega;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }


}
