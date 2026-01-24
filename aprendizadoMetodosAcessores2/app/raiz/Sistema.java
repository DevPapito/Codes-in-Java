package app.raiz;

import app.lib.Calculadora;
import app.lib.CLI;

class Sistema {

    private Calculadora calculadora = new Calculadora();
    private CLI cli = new CLI();

    void run() {

        cli.showMessage("Operações: soma 1 | sub 2 | div 3 | mult 4");

        try {

        byte op = (byte) Integer.parseInteger((cli.input("Digite a operação")));


        cli.showMessage("Digite a primeira operação: ");
        int arg0 = Integer.parseInt(cli.input("> "));
        cli.showMessage("Digite a segunda operação: ");
        int arg1 = Integer.parseInt(cli.input("> "));

            switch ((byte)op) {

                case 1:
                    cli.showMessage("Resultado: "+calculadora.soma(arg0,arg1));
                    break;
                case 2:
                    cli.showMessage("Resultado: "+calculadora.sub(arg0,arg1));
                    break;
                case 3:
                    cli.showMessage("Resultado: "+calculadora.div(arg0,arg1));
                    break;
                case 4:
                    cli.showMessage("Resultado: "+calculadora.mult(arg0,arg1));
                    break;

                default:
                    cli.showMessage("Operação não válida!");

            }

        }catch(Exception e) {

            cli.showMessage("Nao e possivel usar operacao diferente de numero");
            e.printStackTrace();

        }


    }

}
