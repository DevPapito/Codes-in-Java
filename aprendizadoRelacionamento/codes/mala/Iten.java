public class Iten {

    private String nome;

    public Iten(String nome) {

        this.nome = nome;

    }

    public String getNome() {

        return nome;

    }

    @Override
    public String toString() {

        return String.format("Iten: %s",nome);

    }

}
