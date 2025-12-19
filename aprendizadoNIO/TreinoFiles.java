import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

import java.io.IOException;

class TreinoFiles {

    public static void main(String[] args) throws IOException {

        String separator = System.getProperty("file.separator");

        Path n = Paths.get(System.getProperty("user.home")+separator+"treinoNIOpratico");

        System.out.println(n);

        // verificar se o caminh path representa um diretorio

        System.out.println(Files.isDirectory(n));

        Path arquivoVerificar = n.resolve("arquivoN.txt");

        // Verifica se caminho path de arquivo/diretorio existe
        System.out.println(Files.exists(arquivoVerificar));

        // Retorna a quantidade de bytes do arquivo, caso ele não exista retorna
        // um IOException tipo java.nio.file.NoSuchFileException
        // isso não reflete uma verificação, sendo ideal utilizar .exists();
        // Dependente do IOException legacy
        //
        //System.out.println(Files.size(arquivoVerificar));

        // Verificadores de propriedades de execucao
        System.out.println("=== Verificação de propriedades de arquivo ====");
        System.out.println(Files.isReadable(arquivoVerificar));
        System.out.println(Files.isWritable(arquivoVerificar));
        System.out.println(Files.isExecutable(arquivoVerificar));
        System.out.println(Files.isHidden(arquivoVerificar));

    }

}
