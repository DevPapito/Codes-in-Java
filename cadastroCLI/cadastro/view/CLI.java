package cadastro.view;

import cadastro.controller.RootController;

import java.util.Scanner;

public class CLI {

    private RootController root;
    private Scanner scanner = new Scanner(System.in);

    public static String messageMenu = "register - cadastro | login - login | root - root(here)";

    public void run(boolean action) {

        String operation = "";
        while(action) {

            operation = system();
            System.out.println(operation);

        }

    }

    public String system() {

        return root.directonal(root.choocerOperation(input(messageMenu)));

    }

    public RootController getRootController() {

        return root;

    }

    public void setRootController(RootController root) {

        this.root = root;

    }

    public String input(String message) {

        System.out.print(message);
        return scanner.nextLine();

    }

}
