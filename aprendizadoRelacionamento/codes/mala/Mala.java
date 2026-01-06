import java.util.List;
import java.util.ArrayList;

public class Mala {

    // Composicao ciclo de vida unico e aclopado
    private final Espaco espacoFixo;

    // Agregado, em formato adicional e removivel em conteiner
    private List<Espaco> espacos = new ArrayList<>();

    public Mala(Espaco espaco) {

        espacoFixo = espaco;

    }

    public Espaco getEspacoFixo() {

        return espacoFixo;

    }

    public void addEspacoAdicional(Espaco espaco) {

        this.espacos.add(espaco);

    }

    public void removeEspacoAdicional(Espaco espaco) {

        int index = this.espacos.indexOf(espaco);

        this.espacos.remove(index);

    }

    public void verEspacoEItens() {

        String espacos = "";
        for (Espaco i : this.espacos) {

            espacos += i;

        }
        System.out.println(this.espacoFixo+"\n"+espacos);

    }

}
