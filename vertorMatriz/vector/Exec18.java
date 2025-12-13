import java.util.Arrays;

class Exec18 {

    public static void main(String[] args) {

        int[] A = new int[10];

        for (int i = 0; i < A.length; i++) {

            A[i] = (int)(Math.random() * 105) + 1;
        }

        int menor = 0;
        int maior = 0;

        // Algoritmo sort
        Arrays.sort(A);

        maior = A[A.length-1];

        menor = A[0];

        int indexMenor = 0;
        int indexMaior = A.length;


        System.out.println("Maior idade: "+maior);
        System.out.println("Index maior: "+indexMaior);
        System.out.println("Menor idade: "+menor);
        System.out.println("Index menor: "+indexMenor);
    }

}
