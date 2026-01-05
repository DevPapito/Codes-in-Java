class Exec01 {

    public static void main(String[] args) {

        int[][] M = new int[4][4];

        for (int i = 0; i < M.length; i++) {

            M[i][0] = (int)(Math.random() * 10);

            System.out.print("Linha: "+i+"| ");
            for (int j = 0; j < M.length; j++) {

                M[i][j] = (int)(Math.random() * 9);
                System.out.print(M[i][j]);

            }
            System.out.println("\n");

        }

        int atual = 0;
        int valorOld = 0;
        int coluna = 0;
        int linha = 0;

        // i = 0
        for (int i = 0; i < M.length; i++) {

            // j = 0
            for (int j = 0; j < M.length; j++) {

                // valor de linha 0 colunha 0
                atual = M[i][j]; // 2

                // se 2 < 0(atual)
                // 0(atual) vira 2
                // se n < 2
                if (atual > valorOld) {
                    valorOld = atual;
                    coluna = j;
                    linha = i;

                }

            }

        }

        System.out.println("Maior valor: "+valorOld+" na linha: "+linha+" na coluna: "+coluna);

    }

}
