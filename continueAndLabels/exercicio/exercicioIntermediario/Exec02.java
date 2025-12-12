class Exec02 {

    private static int[][] matriz;

    static {

        matriz = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = (int)(Math.random() * 50) + 1;

            }

        }
    }

    public static void main(String[] args) {

        drawMatriz(matriz);

        System.out.print('\n');
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                // Erro na inversao somente deve-se mostrar pares
                // Eu dexei mostrando impares
                // troca de sinal == para !=
                if (j == i || matriz[i][j] % 2 != 0) continue;

                System.out.print(matriz[i][j]+", ");

            }

        }

    }

    public static void drawMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j]+",");

            }
            System.out.print('\n');

        }

    }

}
