package app.game.sleep.model;

import java.util.List;
import java.util.ArrayList;

public class Bed {

    private long id;
    private List<Player> bedPlayers = new ArrayList<>();

    public Bed(long id) {

        this.id = id;

    }

    public void addPlayer(Player player) {

        bedPlayers.add(player);

    }

    public void removePlayer(Player player) {

        bedPlayers.remove(player);

    }

    public List<Player> getBedPlayers() {

        return bedPlayers;

    }

}
