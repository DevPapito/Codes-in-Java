package com.projeto.model;

import java.util.*;

public class Jogador {

    private Arma[] armasEquipadas = new Arma[2];
    private List<Carregador> mochilaCarregadores = new ArrayList<>();
    private int armaAtivaIndex = 0;

    public void equiparArma(int slot, Arma a) { armasEquipadas[slot] = a; }
    public Arma getArmaAtiva() { return armasEquipadas[armaAtivaIndex]; }
    public void trocarArma() { armaAtivaIndex = (armaAtivaIndex == 0) ? 1 : 0; }
    public List<Carregador> getMochila() { return mochilaCarregadores; }

}
