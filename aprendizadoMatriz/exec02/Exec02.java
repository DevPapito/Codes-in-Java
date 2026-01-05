class Exec02 {

    public static void main(String[] args) {

        int[][] M = new int[10][10];

        for (int i = 0; i < M.length; i++) {

            M[i][0] = (int)(Math.random() * 10);

            for (int y = 0; y < M.length; y++) {

                M[i][y] = (int)(Math.random() * 10);

            }

        }

        // Maior menor linha 5
        int menor = 1;
        int numero = 0;
        int maior = 0;
        for (int columns = 0; columns < M.length; columns++) {

            numero = M[4][columns];
            System.out.println(numero);

            if (numero < menor) {
                menor = numero;

            }

            if (numero > maior) {

                maior = numero;

            }


        }
        System.out.println("Linha 5 | Menor valor: "+menor+" Maior valor: "+maior);

        for (int lines = 0; lines < M.length; lines++) {


            numero = M[lines][6];
            System.out.println(numero);

            if (numero < menor) {
                menor = numero;

            }

            if (numero > maior) {

                maior = numero;

            }

        }
        System.out.println("Coluna 7 | Menor valor: "+menor+" Maior valor: "+maior);

    }

}
