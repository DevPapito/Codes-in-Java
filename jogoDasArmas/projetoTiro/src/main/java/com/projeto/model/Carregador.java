package com.projeto.model;

import java.util.*;

public class Carregador {
    private Stack<Bala> balas = new Stack<>();
    private int capacidade;

    public Carregador(int capacidade) { this.capacidade = capacidade; }

    public boolean inserirBala(Bala b) {
        if (balas.size() < capacidade) {
            balas.push(b);
            return true;
        }
        return false;
    }

    public Bala removerBala() {
        return !balas.isEmpty() ? balas.pop() : null;
    }

    public int getQuantidade() { return balas.size(); }
    public int getCapacidade() { return capacidade; }
}
