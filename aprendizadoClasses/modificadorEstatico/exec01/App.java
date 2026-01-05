public class App {

    public static void main(String[] args) {

        Contador cont01 = new Contador();
        System.out.println(cont01.instancias);

        Contador cont02 = new Contador();
        System.out.println(cont02.instancias);

        Contador cont03 = new Contador();
        System.out.println(cont03.instancias);
        cont03.zerar();
        System.out.println(cont03.instancias);

    }

}
