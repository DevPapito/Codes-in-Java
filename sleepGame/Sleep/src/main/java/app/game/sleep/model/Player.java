package app.game.sleep.model;

import app.game.sleep.model.vo.Name;

public class Player {

    private long id;
    private Name name;
    private boolean statuSleep;

    public Player(long id, String name, boolean statuSleep) {

        this.id = id;
        this.name = new Name(name);
        this.statuSleep = statuSleep;

    }

    public Player(String name) {

        this(0,name,false);

    }

    public long getId() {

        return id;

    }

    public void setId(long id) {

        this.id = id;

    }

    public String getName() {

        return name.name();

    }

    public void setName(String name) {

        this.name = new Name(name);

    }

    public boolean getStatuSleep() {

        return statuSleep;

    }

    public void setStatuSleep(boolean statuSleep) {

        this.statuSleep = statuSleep;

    }

}
