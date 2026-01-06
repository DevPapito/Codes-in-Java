public class Aluno {

    private String nome;
    private String matricula;
    private double[] notas = new double[4];

    public Aluno(String nome, String matricula) {

        this.nome = nome;
        this.matricula = matricula;

    }

    public String getNome() {

        return nome;

    }

    public String getMatricula() {

        return matricula;

    }

    public double[] getNotas() {

        return notas;

    }

    public void setNotas(double[] notas) {

        this.notas = notas;

    }

    @Override
    public String toString() {

        String strNota = "";
        for (double nota : notas) {

            strNota = nota+" ";

        }

        return String.format("-- Aluno Info --\n Nome: %s\n matricula: %s\nNotas: %s",nome,matricula,strNota);

    }

}
