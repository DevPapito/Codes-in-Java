package app.lib;

import java.util.Scanner;

public class CLI {

    private Scanner scanner = new Scanner(System.in);

    public String input(String message) {

        System.out.print(message);
        return scanner.nextLine()+"\n";

    }

    public void showMessage(String message) {

        System.out.println(message);

    }

}
