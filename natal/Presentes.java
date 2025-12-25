package app.natal;

import java.util.List;
import java.util.ArrayList;

public class Presentes {

    private List<Presente> presentes = new ArrayList<>();

    public void addPresente(Presente presente) {

        this.presentes.add(presente);

    }

    public Presente readPresente(int id) {

        return this.presentes.get(id);

    }

}
