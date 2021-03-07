package com.projeto.restaurante.model;

public enum TipoItem {

    EN("Entrada"),
    PP("Prato Principal"),
    SB("Sobremesa"),
    BB("Bebida"),
    BA("Bebida Alcoólica");

    public String nome;

    TipoItem(String _nome) {
        nome = _nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
