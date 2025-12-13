class Exec15 {

    public static void main(String[] args) {

        int[] A = new int[50];

        for (int i = 0; i < A.length; i++) {

            A[i] = (int)(Math.random() * 155);

        }

        int pares = 0;
        int inpares = 0;

        for (int i = 0; i < A.length; i++) {

            if (A[i] % 2 == 0) pares++;

            if (A[i] % 2 != 0) inpares++;

        }

        System.out.println(pares);
        System.out.println(inpares);

        // Calculo de porcentagem para descobrir os % em base de um total
        float newPar = ((pares / 100.0f) * A.length);
        float newInpar = ((inpares / 100.0f) * A.length);

        System.out.printf("Par: %.2f\nInpar: %.2f",newPar,newInpar);


    }


}
