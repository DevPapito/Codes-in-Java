import java.nio.file.Path;
import java.nio.file.Paths;

class TreinoPath {

    public static void main(String[] args) {

        Path arquivo = Paths.get("Arquivo.txt");
        Path caminho = arquivo.toAbsolutePath();
        //Path caminho2 = Paths.get(System.getProperty("user.home"));

        // Retorna o caminho JVM Semelhante ao System.getProperty("user.home");
        System.out.println(caminho);
        // nome do arquivo / ultimo elemento de string
        System.out.println(caminho.getFileName());
        // Captura o ultimo elemento o root
        System.out.println(caminho.getRoot());
        // Substring de caminhos
        //System.out.println(caminho.subPath(0,2));
        System.out.println(caminho.getName(0));

    }

}
