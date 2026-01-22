package com.projeto.model;
import java.util.*;

public class Arsenal {
    // Usando Map para busca rápida por ID ou Nome (Padrão Repository)
    private Map<String, Arma> estoqueArmas = new HashMap<>();

    // CRUD - Create
    public void adicionarArma(Arma arma) {
        estoqueArmas.put(arma.getNome().toUpperCase(), arma);
    }

    // CRUD - Read
    public List<Arma> listarArmas() {
        return new ArrayList<>(estoqueArmas.values());
    }

    public Arma buscarArma(String nome) {
        return estoqueArmas.get(nome.toUpperCase());
    }

    // CRUD - Update (Ex: Customização ou reparo)
    public void atualizarArma(String nomeOriginal, Arma novaInstancia) {
        if(estoqueArmas.containsKey(nomeOriginal.toUpperCase())) {
            estoqueArmas.put(nomeOriginal.toUpperCase(), novaInstancia);
        }
    }

    // CRUD - Delete
    public boolean removerArma(String nome) {
        return estoqueArmas.remove(nome.toUpperCase()) != null;
    }
}
