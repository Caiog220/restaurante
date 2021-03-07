package com.projeto.restaurante.model;

public enum Uf {
    AC("Acre"),
    AL("Alagoas"),
    AP("Amapá"),
    AM("Amazonas"),
    BA("Bahia"),
    CE("Ceará"),
    DF("Distrito Federal"),
    ES("Espírito Santo"),
    GO("Goiás"),
    MA("Maranhão"),
    MT("Mato Grosso"),
    MS("Mato Grosso do Sul"),
    MG("Minas Gerais"),
    PA("Pará"),
    PB("Paraíba"),
    PR("Paraná"),
    PE("Pernambuco"),
    RJ("Rio de Janeiro"),
    SP("São Paulo");
    
    private String nome;
    
    Uf(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
}
