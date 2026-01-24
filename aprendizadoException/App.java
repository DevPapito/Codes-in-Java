import java.util.Scanner;
import java.util.NoSuchElementException;

public class App {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        User user = new User();

        try {

            create(user);
        }
        catch(NoSuchElementException e) {

            System.out.println(e.getMessage());

        }
        catch(NameEmptyException | EmailEmptyException | PasswordEmptyException e) {

            System.out.println(e.getMessage());
            System.out.println("--------- log error -------\n\nError: \n");
            e.printStackTrace();

        }

    }

    public static void create(User user) throws NameEmptyException, EmailEmptyException, PasswordEmptyException, NoSuchElementException {

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu email: ");
        String email = scanner.nextLine();

        System.out.print("Digite sua senha: ");
        String password = scanner.nextLine();

        if (nome.isEmpty())
            throw new NameEmptyException();

        if (email.isEmpty())
            throw new EmailEmptyException();

        if (password.isEmpty())
            throw new PasswordEmptyException();

        user = new User(nome,email,password);

        System.out.println(user.getName()+" foi criado com sucesso!");

    }

}
