package com.projeto.controller;

import com.projeto.model.*;
import com.projeto.view.*;
import java.util.Scanner;

public class GameController {
    private Jogador jogador;
    private Arsenal arsenal; // O repositório central
    private TUI view;
    private Scanner scanner;

    // Sub-controllers
    private ArsenalController arsenalController;

    public GameController() {
        this.jogador = new Jogador();
        this.arsenal = new Arsenal();
        this.view = new TUI();
        this.scanner = new Scanner(System.in);

        // Inicializa o controlador do Arsenal passando a referência do Stash
        this.arsenalController = new ArsenalController(this.arsenal, this.scanner);

        inicializarCenarioEFT();
    }

    private void inicializarCenarioEFT() {
        // Mock de armas iniciais no Stash (Arsenal)
        Arma ak74 = new Arma("AK-74N");
        Arma m4a1 = new Arma("M4A1");

        arsenal.adicionarArma(ak74);
        arsenal.adicionarArma(m4a1);

        // Jogador começa com uma arma básica no slot 0
        jogador.equiparArma(0, ak74);

        // Adicionando carregadores à mochila do jogador
        Carregador mag1 = new Carregador(30);
        for(int i=0; i<30; i++) mag1.inserirBala(new Bala("5.45x39mm BT"));
        jogador.getMochila().add(mag1);
    }

    public void iniciar() {
        int opcao = -1;
        while (opcao != 0) {
            view.exibirMenu(jogador);
            try {
                opcao = Integer.parseInt(scanner.nextLine()); // Uso de nextLine + parse para evitar bugs de buffer
                processarAcao(opcao);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, insira um número válido.");
            }
        }
    }

    private void processarAcao(int op) {
        switch (op) {
            case 1 -> {
                if (jogador.getArmaAtiva() != null) jogador.getArmaAtiva().disparar();
                else System.out.println("Mãos vazias!");
            }
            case 2 -> recarregarLogica();
            case 3 -> System.out.println("Checando mag..."); // A View já faz isso no menu, mas aqui pode ser o check detalhado
            case 4 -> {
                jogador.trocarArma();
                System.out.println("Alternando slots...");
            }
            case 5 -> {
                // Transição para o sub-menu do Arsenal (RF-01)
                System.out.println("Entrando no Stash...");
                arsenalController.abrirMenu(jogador);
            }
            case 0 -> System.out.println("Saindo do simulador...");
            default -> System.out.println("Ação inválida.");
        }
    }

    private void recarregarLogica() {
        Arma ativa = jogador.getArmaAtiva();
        if (ativa == null) {
            System.out.println("Nenhuma arma em mãos.");
            return;
        }

        if (!jogador.getMochila().isEmpty()) {
            // Lógica Tarkov: Tira o atual da arma, coloca na mochila, pega o primeiro da mochila
            Carregador antigo = ativa.desequiparCarregador();
            Carregador novo = jogador.getMochila().remove(0);

            ativa.acoplarCarregador(novo);
            if (antigo != null) jogador.getMochila().add(antigo);

            System.out.println("Reload tático realizado.");
        } else {
            System.out.println("Sem carregadores na mochila!");
        }
    }
}
