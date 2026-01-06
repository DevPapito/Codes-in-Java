import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Curso {

    private String nome;
    private String horario;

    private Professor professor;
    private List<Aluno> alunos = new ArrayList<>();

    private Scanner scanner = new Scanner(System.in);

    public Curso(String nome, String horario) {

        this.nome = nome;
        this.horario = horario;

    }

    public void setProfessor(Professor professor) {

        this.professor = professor;

    }

    public void gerarAlunos(int num) {

        double[] mediaTurma = new double[num];

        double media = 0;
        for (int i = 0; i < num; i++) {

            String nome = "";
            String matricula = "";

            System.out.println("Digite o nome do aluno abaixo: ");
            System.out.print(": ");
            nome = scanner.next();

            System.out.println("Digite a matricula do aluno abaixo: ");
            System.out.print(": ");
            matricula = scanner.next();

            Aluno local = new Aluno(nome, matricula);

            alunos.add(local);

            entrarNota(local);

            media = mediaAluno(local);
            mediaTurma[i] = media;

            if (media < 7) {

                System.out.println(local.getNome()+" está reprovado!");
                continue;

            }

            System.out.println(local.getNome()+" está aprovado!");

        }

        media = mediaTurma(mediaTurma);

        if (media < 7) {

            System.out.println("A turma do curso "+nome+" está reprovada!");

        }else {

            System.out.println("A turma do curso "+nome+" está aprovada!");

        }

        System.out.println("Media da turma: "+(int)media);

    }

    public void entrarNota(Aluno aluno) {

        int index = alunos.indexOf(aluno);

        double[] notas = alunos.get(index).getNotas();

        System.out.println("Aluno: "+aluno.getNome());
        for (int i = 0; i < 4; i++) {

            System.out.println("Digite a nota: ");
            notas[i] = Double.parseDouble(scanner.next());

        }

        aluno.setNotas(notas);

    }

    public double mediaAluno(Aluno aluno) {

        int index = alunos.indexOf(aluno);

        double[] notas = alunos.get(index).getNotas();

        double media = 0;
        for (int i = 0; i < notas.length; i++) {

            media += notas[i];

        }

        media = (media / (notas.length));

        return media;

    }

    public double mediaTurma(double[] mediaTurma) {

        double media = 0;
        for (int i = 0; i < mediaTurma.length; i++) {

            media += mediaTurma[i];

        }

        media = (media / (mediaTurma.length));

        return media;

    }

    @Override
    public String toString() {

        String alunos = "";
        for (Aluno aluno : this.alunos) {

            alunos += aluno+" \n\n";

        }

        return String.format("-- Curso Info --\n Professor: "+professor+"\n Alunos: \n\n"+alunos);

    }

}
