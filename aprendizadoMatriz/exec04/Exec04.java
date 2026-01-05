import java.util.Scanner;

class Exec04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[][][] agendaPessoal = new String[12][367][8];

        boolean runtime = true;
        while(runtime) {

            int mes = 0;
            int dia = 0;
            int hora = 0;
            String compromisso = "";

            System.out.println("1 registar | 2 ver agenda | 3 dia e hora | 4 sair");

            int op = Integer.parseInt(scanner.next());

            switch (op) {

                case 1:

                    System.out.println("Forneca o mes abaixo(NUMERO)");
                    System.out.print(": ");
                    mes = scanner.nextInt();

                    System.out.println("Forneca o dia do mes abaixo");
                    System.out.print(": ");
                    dia = scanner.nextInt();

                    System.out.println("Forneca a hora do dia");
                    System.out.print(": ");
                    hora = scanner.nextInt();

                    System.out.println("Digite o compromisso");
                    System.out.print(": ");
                    compromisso = scanner.next();

                    agendaPessoal[mes][dia][hora] = compromisso;

                    break;

                case 2:
                    showAgenda(agendaPessoal);
                    break;

                case 3:

                    System.out.println("Forneca o mes abaixo(NUMERO)");
                    System.out.print(": ");
                    mes = scanner.nextInt();

                    System.out.println("Forneca o dia do mes abaixo");
                    System.out.print(": ");
                    dia = scanner.nextInt();

                    System.out.println("Forneca a hora do dia");
                    System.out.print(": ");
                    hora = scanner.nextInt();

                    System.out.println("Compromisso marcado de dia: "+dia+" as "+hora+" horas");
                    System.out.println("Compromisso: "+agendaPessoal[mes][dia][hora]);

                    break;

                case 4:
                    runtime = false;
                    break;

            }

        }
        System.out.println("Good Bye :D");


    }

    //int hora = 0;
    public static void showAgenda(String[][][] agenda) {

        for (int i = 0; i < agenda.length; i++) {

            System.out.println("Mes: "+(i)+"\n\n");

            for (int j = 0; i < agenda[i].length; j++) {

                if (j == 366) return ;

                System.out.println("Dia: "+(j)+"\n\n");

                for (int k = 0; k < agenda[i][j].length; k++) {

                    if (k % 2 != 0)
                        System.out.println("\n");


                    System.out.print("hora - "+(k+1)+" "+agenda[i][j][k]+"\n");

                }
                System.out.println("\n");

            }

        }

    }

}
