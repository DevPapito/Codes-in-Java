import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

import java.nio.charset.StandardCharsets;

import java.io.IOException;

class TreinoFiles2 {

    public static void main(String[] args) throws IOException {

        // Criação de arquivo vazio

        Path arquivoLocal = Path.of("Script.sh");

        if (Files.exists(arquivoLocal)) {

            System.out.println("Arquivo já existe");
            return ;

        }

        Files.createFile(arquivoLocal);

        // Cria caminho com diretorios ainda não existentes e arquivi

        Path modManager = Path.of("modManager","repository","hello.jar");
        // Diferente de createDirectory usando directorys criamos de forma
        // recursiva
        Files.createDirectories(modManager.getParent());

        // cria arquivo final, ordem diferente ira ser incorreto
        Files.createFile(modManager);

        // Criando arquivo com escrita POR PADRÃO SEMPRE SOBREESCREVE

        Path scriptSH = Path.of("script.bat");
        Files.write(scriptSH, "echo Hello Mundo".getBytes(StandardCharsets.UTF_8));

        // Criar por linhas
        // import java.util.List;
        //Files.write(scriptSH, List.of("Linha 1"," Linha 2"));

    }

}
