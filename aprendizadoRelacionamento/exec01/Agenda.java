import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;

public class Agenda {

    private String nome;
    private List<Contato> contatos = new ArrayList<>();

    public Agenda(String nome) {

        this.nome = nome;

    }

    public void addContato(Contato contato) {

        this.contatos.add(contato);

    }

    public void criarContato(int num) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < num; i++) {

            String nome = "";
            String telefone = "";
            String email = "";

            System.out.println("Contato - "+(i+1));
            System.out.println("Digite o nome do contato abaixo: \n");
            System.out.print(": ");
            nome = scanner.nextLine();

            System.out.println("Digite o telefone do contato abaixo: \n");
            System.out.print(": ");
            telefone = scanner.nextLine();

            System.out.println("Digite o email do contato abaixo: \n");
            System.out.print(": ");
            email = scanner.nextLine();

            this.addContato(new Contato(nome,telefone,email));

        }

        scanner.close();

    }

    public String toString() {

        System.out.println("Agenda - "+nome);
        String message = "";
        for (Contato contato : contatos) {

            message += (contato +" \n");

        }

        return message;

    }

}
