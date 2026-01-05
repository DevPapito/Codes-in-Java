import java.util.Scanner;

class Exec03 {

    private static Scanner scanner;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);

        int[][] M = new int[3][3];

        for (int i = 0; i < M.length; i++) {

            M[i][0] = scanner.nextInt();

            for (int j = 0; j < M.length; j++) {

                M[i][j] = scanner.nextInt();

            }

        }

        int pares = 0;
        int impares = 0;
        for (int i = 0; i < M.length; i++) {

            for (int j = 0; j < M.length; j++) {

                if (M[i][j] % 2 == 0) {

                    pares++;

                }else {

                    impares++;

                }

            }

        }

        System.out.println("Pares: "+pares+" \nImpares: "+impares);
        //System.out.println("Pares: "+((pares * M.length)/100.0)*100.0+"%"+
         //       "\n"+
          //      "Impares: "+((impares * M.length)/100.0)*100.0+"%");

    }

}
