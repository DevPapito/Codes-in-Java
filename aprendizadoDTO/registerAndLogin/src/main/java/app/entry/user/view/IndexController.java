package app.entry.user.view;

import app.entry.user.controller.UserController;

import java.util.Scanner;

public class IndexController {

    private UserController controller;

    private Scanner scanner = new Scanner(System.in);

    private String globalMessage = "";

    private long currentId = 0;

    public IndexController(UserController controller) {

        this.controller = controller;

    }

    public void run(boolean runtime) {

        String op = "";

        do{

            System.out.println(this.globalMessage);
            this.globalMessage = "";
            System.out.println("1 REGISTER | 2 LOGIN | 3 EXIT");
            System.out.print(": ");
            op = scanner.nextLine();
            op = op.trim();

            switch(op) {

                case "1":
                    register();
                    break;

                case "2":
                    login();
                    break;

                case "3":
                    runtime = false;
                    break;

            }

        }while(runtime);

        scanner.close();

    }

    public void register() {

        String nickname = "";
        String email = "";
        String password = "";

        System.out.println("Digite um nickname abaixo: ");
        System.out.print(": ");
        nickname = scanner.nextLine();

        System.out.println("Digite um email abaixo: ");
        System.out.print(": ");
        email = scanner.nextLine();

        System.out.println("Digite uma senha abaixo: ");
        System.out.print(": ");
        password = scanner.nextLine();

        this.globalMessage = this.controller.create(
                nickname,
                email,
                password);

    }

    public void login() {

        String nickname = "";
        String password = "";

        System.out.println("Digite o nickname cadastrado: ");
        System.out.print(": ");
        nickname = scanner.nextLine();

        System.out.println("Digite o senha cadastrada: ");
        System.out.print(": ");
        password = scanner.nextLine();

        this.currentId = this.controller.readCurrentId(password);

        this.globalMessage = this.controller.read(this.currentId);

    }

}
