public class Professor {

    private String nome;
    private String departamento;
    private String email;

    public Professor(String nome, String departamento, String email) {

        this.nome = nome;
        this.departamento = departamento;
        this.email = email;

    }

    @Override
    public String toString() {

        return String.format(" -- Professor info --\n Nome: %s\n departamento: %s\n email: %s",nome, departamento, email);

    }

}
