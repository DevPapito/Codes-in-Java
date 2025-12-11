public class Cozinha {

    private String nome;
    private static float tempoReceita = 12;
    private float tempo;

    public Cozinha(String nome, float tempo) {

        this.nome = nome;
        this.tempo = tempo;
    }

    public boolean estaPronto(float tempo, float tempoRestante) {

        return (tempo > tempoRestante) ? true : false;

    }

    public static float getTempoReceita() {

        return tempoReceita;

    }

    public float getTempo() {

        return tempo;

    }

    public void setTempo(float tempo) {

        this.tempo = tempo;

    }

    public String getNome() {

        return nome;

    }

    public void setNome(String nome) {

        this.nome = nome;

    }

}
