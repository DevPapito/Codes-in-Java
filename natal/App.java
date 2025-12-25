package app.natal;

public class App {

    public static void main(String[] args) {

        GerenciarPresentes gp = new GerenciarPresentes();
        int index = 0;
        while (index <= 5) {

            gp.generatePresentes(5);
            double value = gp.readPresente(index).getValue();
            if (value > 50.0) {

                System.out.println("Deu sorte ai, obrigado papais!");

            }
            gp.showPresente(index);
            index++;

        }
    }

}
