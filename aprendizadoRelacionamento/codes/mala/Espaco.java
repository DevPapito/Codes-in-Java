import java.util.List;
import java.util.ArrayList;

public class Espaco {

    private String nome;
    private List<Iten> itens = new ArrayList<>();

    public Espaco(String nome) {

        this.nome = nome;

    }

    public String getNome() {

        return nome;

    }

    public void addIten(Iten iten) {

        this.itens.add(iten);

    }

    public void removeIten(Iten iten) {

        int index = this.itens.indexOf(iten);
        this.itens.remove(index);

    }

    @Override
    public String toString() {

        String itens = "";
        for (Iten iten : this.itens) {

            itens += iten+" \n";

        }

        return String.format("Etiqueta do espaco: %s\n--- Itens ---\n\n%s",nome,itens);

    }

}
