public class Contador {

    public static int instancias = 0;

    { // Inicializador de objeto

        instancias++;

    }

    public static void zerar() {instancias = 0;}

}
