class Exec16 {

    public static void main(String[] args) {

        int[] A = new int[10];
        boolean[] seen = new boolean[65536];

        for (int i = 0; i < A.length; i++) {

            A[i] = (int)(Math.random() * 100);

        }

        int somaInferiorQuinze = 0;
        int quantiIgualQuinze = 0;
        int quantiMediaMaiorQuinze = 0;

        for (int i = 0; i < A.length; i++) {

            if (seen[A[i]])continue;

            if (A[i] == 15) quantiIgualQuinze++;

            if (A[i] < 15)
                somaInferiorQuinze += A[i];

            if (A[i] > 15)quantiMediaMaiorQuinze += A[i];


            // setando verificação de repetição;
            seen[A[i]] = true;

        }
        quantiMediaMaiorQuinze = (quantiMediaMaiorQuinze * A.length);
        System.out.println("Media superiro a 15: "+quantiMediaMaiorQuinze);
        System.out.println("Quantidade igual a 15: "+quantiIgualQuinze);
        System.out.println("Soma dos inferiores a 15: "+somaInferiorQuinze);

    }

}
