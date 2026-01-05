import java.util.Scanner;

class Exec06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Baseado em chars/mais otimizado em low-level
        char[][] tabuleiro = {

            {'1','2','3'},
            {'4','5','6'},
            {'7','8','9'}

        };

        int jogada = 0;
        int posicao;

        //TODO: Jogo por completo!
        while(jogada < 9) {

            desenharTabuleiro(tabuleiro);
            // primeiro jogador impar
            // Segundo jogar par

            // Usando operador ternario
            System.out.printf("Jogador %c, escolha uma posição (1-9): ", (jogada % 2 == 0) ? 'X' : 'O');
            posicao = scanner.nextInt();

            if (posicao < 1 || posicao > 9) {

                System.out.printf("Posição invalida! Escolha um numero entre 1-9\n");
                System.out.printf("Pressione Enter para continuar...");
                scanner.next();
                continue;

            }

            char jogadorAtual = (jogada % 2 == 0) ? 'X' : 'O';
            if (!jogar(tabuleiro, posicao, jogadorAtual)) {

                System.out.printf("Posição Ja ocupada! Escolha um numero entre 1-9\n");
                System.out.printf("Pressione Enter para continuar...");
                scanner.next();
                continue;


            }
            if (verificaVitoria(tabuleiro)) {

                desenharTabuleiro(tabuleiro);
                System.out.printf("Jogador %c venceu!!!%n",jogadorAtual);
                break;

            }

            jogada++;

        }

        if (jogada == 9) {
            desenharTabuleiro(tabuleiro);
            System.out.printf("Empate!");

        }
        System.out.printf("Fim do jogo! Pressione Enter para sair%n");
        System.out.flush();
        scanner.next();

    }

    //TODO: Logica verificação de vitorias!
    public static boolean verificaVitoria(char[][] tabuleiro) {

        for (int i = 0; i < 3; i++) {

            if (tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][1] == tabuleiro[i][2]) {

                return true;

            }

        }

        for (int i = 0; i < 3; i++) {

            if (tabuleiro[0][i] == tabuleiro[1][i] && tabuleiro[1][i] == tabuleiro[2][i]) {

                return true;

            }

        }

        if (tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2]) {

            return true;

        }

        if (tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0]) {

            return true;

        }

        return false;

    }

    public static void desenharTabuleiro(char[][] tabuleiro) {

        System.out.print("\033"+"[2J"+"\033"+"[H");
        System.out.printf("\n");

        for (int i = 0; i < 3; i++) {

            for(int j = 0; j < 3; j++) {

                System.out.printf(" %C ",tabuleiro[i][j]);

                if (j < 2) {

                    System.out.printf("|");

                }
            }

            System.out.printf("\n");

            if (i < 2) {

                System.out.printf("---+---+---\n");

            }


        }
        System.out.printf("\n");

    }

    // TODO: Logica de jogador, detectar qual foi a jogada e por quem
    public static boolean jogar(char[][] tabuleiro, int posicao, int jogadorAtual) {

        // Dividimos pela quantidade de linhas, isso retorna exata posicao
        // da linha
        int linha = (posicao - 1) / 3;

        // Dividimos pelo resto, isso permite retornar a exata posicao da coluna
        int coluna = (posicao - 1) % 3;

        if (tabuleiro[linha][coluna] != 'X' && tabuleiro[linha][coluna] != '0') {

            tabuleiro[linha][coluna] = (char)jogadorAtual;
            return true;

        }

        return false;

    }

}
