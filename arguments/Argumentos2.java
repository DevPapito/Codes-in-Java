public class Argumentos2 {

    public static void main(String[] args) {

        String frase = olaMundo("Ola mundo",args);
        System.out.println(frase);

    }

    public static String olaMundo(String frase, String[] args) {

        String fraseCompleta = "";

        if (args.length > 0)
            return fraseCompleta = frase+" "+args[0];

        fraseCompleta = frase+" apenas";

        return fraseCompleta;


    }

}
