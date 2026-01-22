package com.projeto.model;

public class Arma {
    private String nome;
    private Carregador carregadorAcoplado;

    public Arma(String nome) { this.nome = nome; }

    public void acoplarCarregador(Carregador c) { this.carregadorAcoplado = c; }
    public Carregador desequiparCarregador() {
        Carregador aux = this.carregadorAcoplado;
        this.carregadorAcoplado = null;
        return aux;
    }

    public boolean disparar() {
        if (carregadorAcoplado != null && carregadorAcoplado.removerBala() != null) {
            System.out.println("[" + nome + "] - *BANG!*");
            return true;
        }
        System.out.println("[" + nome + "] - *CLICK* (Sem munição)");
        return false;
    }

    public String getNome() { return nome; }
    public Carregador getCarregador() { return carregadorAcoplado; }
}
