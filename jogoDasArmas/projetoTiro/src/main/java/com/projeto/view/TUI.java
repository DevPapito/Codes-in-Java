package com.projeto.view;
import com.projeto.model.*;

public class TUI {
    public void exibirMenu(Jogador j) {
        Arma ativa = j.getArmaAtiva();
        System.out.println("\n=== TACTICAL TUI (EFT STYLE) ===");
        System.out.println("ARMA ATIVA: " + (ativa != null ? ativa.getNome() : "Nenhuma"));
        System.out.println("STATUS MAG: " + checarMunição(ativa));
        System.out.println("-------------------------------");
        System.out.println("1. Atirar");
        System.out.println("2. Recarregar (Trocar Mag)");
        System.out.println("3. Checar Carregador");
        System.out.println("4. Alternar Arma");
        System.out.println("5. Abrir Arsenal (CRUD)");
        System.out.println("0. Sair");
        System.out.print("Comando: ");
    }

    private String checarMunição(Arma a) {
        if (a == null || a.getCarregador() == null) return "Vazio/Sem Mag";
        int qtd = a.getCarregador().getQuantidade();
        if (qtd == 0) return "[.....] (Vazio)";
        if (qtd < 5) return "[|....] (Quase Vazio)";
        return "[|||||] (Cheio/Quase Cheio)";
    }
}
