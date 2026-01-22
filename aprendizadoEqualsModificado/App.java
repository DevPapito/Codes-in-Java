public class App {

    public static void main(String[] args) {

        Carro carro01 = new Carro();
        carro01.marca = "Fiat";
        carro01.modelo = "Uno";
        Carro carro02 = new Carro();
        carro02.marca = "Reno";
        carro02.modelo = "Uno";

        if (carro01.equals(carro02)) {

            System.out.println("Modelo igual!");

        }else {

            System.out.println("Modelo diferente!");

        }

    }

}
