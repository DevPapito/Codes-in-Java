package app.learn.methodFactory;

public abstract class User {

    protected long id;
    protected String name;
    protected boolean admin;

    public User (long id, String name, boolean admin) {

        this.id = id;
        this.name = name;
        this.admin = admin;

    }

    public User() {}

    public long getId() {

        return id;

    }

    public void setId(long id) {

        this.id = id;

    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public boolean getAdmin() {

        return admin;

    }

    public void setAdmin(boolean admin) {

        this.admin = admin;

    }

    @Override
    public String toString() {

        return String.format("{\nid: %d,\nname: %s,\nadmin: %B\n}",
                this.id,
                this.name,
                this.admin);

    }

}
