import java.util.Scanner;

public class ContinueExemple {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        String number = scanner.next();
        System.out.println("Digite o numero divisivel que deseja pular: ");
        String jump = scanner.next();

        for (int i = Integer.parseInt(number); i < Integer.parseInt(jump); i++) {

            if (i % Integer.parseInt(jump) == 0) {
                continue;
            }

            System.out.println("Numero: "+i);


        }

    }

}
