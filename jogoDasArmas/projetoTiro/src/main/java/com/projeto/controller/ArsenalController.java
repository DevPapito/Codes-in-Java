package com.projeto.controller;
import com.projeto.model.*;
import com.projeto.view.*;

public class ArsenalController {
    private Arsenal arsenal;
    private ArsenalView view;
    private java.util.Scanner sc;

    public ArsenalController(Arsenal arsenal, java.util.Scanner sc) {
        this.arsenal = arsenal;
        this.view = new ArsenalView();
        this.sc = sc;
    }

    public void abrirMenu(Jogador jogador) {
        int op = -1;
        while(op != 0) {
            view.exibirMenuArsenal();
            op = sc.nextInt();
            sc.nextLine(); // Limpar buffer

            switch(op) {
                case 1 -> view.mostrarListaArmas(arsenal.listarArmas());
                case 2 -> {
                    System.out.print("Nome da nova arma: ");
                    String nome = sc.nextLine();
                    arsenal.adicionarArma(new Arma(nome));
                    System.out.println("Arma cadastrada no Stash.");
                }
                case 3 -> {
                    System.out.print("Nome da arma para remover: ");
                    String nome = sc.nextLine();
                    if(arsenal.removerArma(nome)) System.out.println("Removida.");
                    else System.out.println("Não encontrada.");
                }
                case 4 -> equiparNoJogador(jogador);
            }
        }
    }

    private void equiparNoJogador(Jogador j) {
        view.mostrarListaArmas(arsenal.listarArmas());
        System.out.print("Nome da arma para equipar: ");
        String nome = sc.nextLine();
        Arma a = arsenal.buscarArma(nome);

        if(a != null) {
            System.out.print("Equipar no Slot (0 ou 1): ");
            int slot = sc.nextInt();
            if(slot >= 0 && slot <= 1) {
                j.equiparArma(slot, a);
                System.out.println(a.getNome() + " equipada no slot " + slot);
            }
        }
    }
}
