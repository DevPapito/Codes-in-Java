public class Sorteio {

    public static void main(String[] args) {

        boolean[] seen = new boolean[65536];
        int[] numbers = new int[16];

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = (int)(Math.random() * 100);

        }

        int a = 0;
        for (int i = 0; i < numbers.length; i++) {

            System.out.print(numbers[i]+" ");

            if (seen[numbers[i]]) {

                System.out.println("Numero: "+numbers[i]+" ja apareceu!");
                continue;

            }

            System.out.println("Não repetidos\n");
            System.out.println(numbers[i]+" ");
            a = numbers[i];

            seen[i] = true;
            // Setado para ficar marcado

        }

    }

}
