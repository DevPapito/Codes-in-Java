import java.util.Scanner;

class App {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Cozinha cozinha = new Cozinha("Bolo",5);
        float tempo = cozinha.getTempo();

        do {

            System.out.println("tempo durando>>  "+tempo++);

        }while(Cozinha.getTempoReceita() > tempo);

        cozinha.setTempo(tempo);
        System.out.println("Receita "+cozinha.getNome()+" tempo: "+cozinha.getTempo());

    }

}
