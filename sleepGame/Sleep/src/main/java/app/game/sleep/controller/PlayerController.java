package app.game.sleep.controller;

import app.game.sleep.service.PlayerService;

import app.game.sleep.dto.PlayerDTOResponse;

import app.game.sleep.model.PlayerSleepService;
import app.game.sleep.model.Player;

public class PlayerController {

    // TODO:Somente os metodos de sleep estanciados
    private Player player;
    private final PlayerService playerService;

    public PlayerController(String name) {

        this.player = new Player(name);
        this.playerService = new PlayerService(player);

    }

    public String sleep() {

        boolean verify = playerService.sleep();

        if (!verify)
            return "Não foi possivel dormir, já está em estado de dormir!";

        return "Dormido com sucesso!";

    }

    public String wakeUp() {

        boolean verify = playerService.wakeUp();

        if (!verify)
            return "Não foi possivel acordar, já está acordado!";

        return "Acordado com sucesso!";

    }

    public String showInfo() {

        PlayerDTOResponse response = playerService.showInfo();


        return String.format("{\nid: %d\nname: %s\nsleep: %B\n}",
                response.id(),
                response.name(),
                response.statuSleep());

    }

}
