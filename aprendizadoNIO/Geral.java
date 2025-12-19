import java.nio.file.Path; // Classe que representa um caminho abstrado
import java.nio.file.Paths; // que builda um caminho novo

import java.io.IOException;

// Manipulação de arquivos

import java.nio.file.Files;

class Geral {

    public static void main(String[] args) throws IOException {

        Path dir = Paths.get("C:\\Temp");
        Path file = Paths.get("file.txt");

        // Contatena vindo do diretorio para o arquivo
        // Concatenação mais simples e dinamica
        Path fullDir = dir.resolve(file);

        Path arquivoMod = Paths.get("fuzil.jar");
        Path pastaMods = Paths.get("C:\\mods");
        Path caminhoFull = pastaMods.resolve(arquivoMod);

        System.out.println(fullDir);
        System.out.println(caminhoFull);

        // Criar um caminho abstrado
        Path path = Paths.get(System.getProperty("user.home")+"\\"+"Documents");
        Path arquivoN = Paths.get("arquivoN.java");
        Path full = path.resolve(arquivoN);
        System.out.println(full);

        // verifica se arquivo existe

        // para acessar o arquivo ele precisa saber o caminho todo e no final o arquivo
        // como nos os
        // exists se o caminho existe
        System.out.println(Files.exists(full));
        // Verificando se Documents existe em caminho sem arquivo declarado
        System.out.println(Files.isDirectory(path));
        // Retorna o tamanho do diretorio/arquivo em bytes
        System.out.println(Files.size(path));

    }

}
