import java.util.Scanner;

class DesenhandoEmFor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] campo = {"nome","idade"};

        String[][] table = new String[10][2];

        for (int i = 0; i < table.length; i++) {

            for (int j = 0; j < 2; j++) {

                if (i> 0) break;

                System.out.print("Escreva o nome do campo que sera ao "+campo[j]+"s: ");
                table[i][j] = scanner.nextLine();


            }

        }

        String campoTitle = "";

        for (int i = 0; i < table.length; i++) {

            if (i == 0) continue;

            for(int j = 0; j < 2; j++) {


                campoTitle  = (j > 0 && j < 2) ? "idade" : "nome";

                System.out.print("Escreva um dado para linha de campo "+campoTitle+":  ");

                table[i][j] = scanner.nextLine();

            }

        }

        // desenhar tabela

        int id = 0;

        String message = "";

        for (int i = 0; i < table.length; i++) {

            if (i != 0)System.out.print("\nid "+(id)+" ");

            for (int j = 0; j < 2; j++) {

                if (i == 0) {

                    System.out.print(table[i][j]+" | ");
                    continue;

                }

                System.out.print(table[i][j]+" ");

            }
            id++;

        }

    }

}
