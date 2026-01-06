public class App {

    public static void main(String[] args) {

        Curso curso = new Curso("Matematica","09:00");
        curso.setProfessor(new Professor("Andre","Matematica Aplicada","profAndre@gmail.com"));
        curso.gerarAlunos(2);
        System.out.println(curso);


    }

}
