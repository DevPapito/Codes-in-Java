import java.util.Scanner;

class Exec19 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float[] nota01 = new float[10];
        float[] nota02 = new float[10];
        float[] result = new float[10];

        int media01 = 0;
        int media02 = 0;

        for (int i = 0; i < nota01.length; i++) {

            System.out.println("Aluno: "+(i+1));
            System.out.println("Nota1: ");
            nota01[i] = Float.parseFloat(scanner.next());

            System.out.println("Nota2: ");
            nota02[i] = Float.parseFloat(scanner.next());

            result[i] = ((nota01[i] + nota02[i]) / 2);

        }

        for (int i = 0; i < result.length; i++) {

            System.out.println("Aluno: "+(i+1));
            if (result[i] < 6) {

                System.out.println("reprovado!");
                continue;

            }
            System.out.println("Result: "+result[i]);
            System.out.println("Aprovado!");

        }

    }

}
