public class Aluno {

    private String nome;
    private String matricula;
    private String curso;
    private String[] disciplinas = new String[3];
    private double[] notas = new double[3];

    private byte idade;
    private byte serie;

    public Aluno(String aluno,byte idade,byte serie, String matricula, String curso, String disciplina00, String disciplina01, String disciplina02) {

        this.nome = nome;
        this.idade = idade;
        this.serie = serie;
        this.matricula = matricula;
        this.curso = curso;

        this.disciplinas[0] = disciplina00;
        this.disciplinas[1] = disciplina01;
        this.disciplinas[2] = disciplina02;

        for (int i = 0; i < disciplinas.length; i++) {

            notas[i] = (Math.random() * 10);

        }

    }

    public boolean verificarAprovar() {

        double notasTotal = 0.0;
        for (int i = 0; i < disciplinas.length; i++) {

            System.out.println("Disciplina: "+disciplinas[i]);

            notasTotal += notas[i];

            if (notasTotal < 7) {

                System.out.println("Reprovado da disciplina: "+disciplinas[i]);

            }else {

                System.out.println("Aprovado da disciplina: "+disciplinas[i]);

            }

        }

        return true;

    }

}
