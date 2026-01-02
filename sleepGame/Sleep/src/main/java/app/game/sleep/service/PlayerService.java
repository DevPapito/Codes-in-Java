package app.game.sleep.service;

import app.game.sleep.model.Player;
import app.game.sleep.model.PlayerSleepService;

import app.game.sleep.dto.PlayerDTOResponse;

public class PlayerService implements PlayerSleepService{

    private Player player;

    public PlayerService(Player player) {

        this.player = player;

    }

    @Override
    public boolean sleep() {

        if (!this.player.getStatuSleep()) {

            this.player.setStatuSleep(true);
            return true;

        }

        return false;

    }

    @Override
    public boolean wakeUp() {

        if (this.player.getStatuSleep()) {

            this.player.setStatuSleep(false);
            return true;
        }

        return false;

    }

    public PlayerDTOResponse showInfo() {

        return new PlayerDTOResponse(
                this.player.getId(),
                this.player.getName(),
                this.player.getStatuSleep()
                );

    }

}
