package com.projeto.view;

public class ArsenalView {
    public void exibirMenuArsenal() {
        System.out.println("\n=== ARSENAL (STASH) - GERENCIAMENTO ===");
        System.out.println("1. Listar Armas no Stash");
        System.out.println("2. Adicionar Nova Arma (Cadastrar)");
        System.out.println("3. Remover Arma do Estoque");
        System.out.println("4. Equipar Arma no Jogador");
        System.out.println("0. Voltar ao Menu Principal");
        System.out.print("Comando Stash: ");
    }

    public void mostrarListaArmas(java.util.List<com.projeto.model.Arma> armas) {
        System.out.println("\n--- ARMAS DISPONÍVEIS ---");
        if(armas.isEmpty()) System.out.println("Stash vazio.");
        for(com.projeto.model.Arma a : armas) {
            String magStatus = (a.getCarregador() != null) ? "Com Mag" : "Sem Mag";
            System.out.println("- " + a.getNome() + " [" + magStatus + "]");
        }
    }
}
