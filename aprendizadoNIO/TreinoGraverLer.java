import java.nio.file.Path;
import java.nio.file.Files;

import java.nio.charset.StandardCharsets;

import java.io.IOException;

import java.io.BufferedReader;

import java.util.List;

class TreinoGravarLer {

    public static void main(String[] args) throws IOException {


        Path caminhoArquivo = Path.of(System.getProperty("user.dir")+
                System.getProperty("file.separator")+"treinoGravar"+
                System.getProperty("file.separator")+"arquivo01.txt");

        Files.deleteIfExists(caminhoArquivo);

        Files.createDirectories(caminhoArquivo.getParent());
        Files.createFile(caminhoArquivo);

        // sobrescrevendo

        Files.write(caminhoArquivo, "Ola Mundo".getBytes(StandardCharsets.UTF_8));

        // formato simples com lista vetor

        List<String> lines = Files.readAllLines(caminhoArquivo);

        for (String linha : lines) {

            System.out.println(linha);

        }

        //BufferedReader reader = Files.newBufferedReader(caminhoArquivo);

        //String linha = "";
        //while((linha = reader.readLine()) != null) {

         //   System.out.println("-> "+linha);

        //}
        //reader.close();

        // Formato otimizado sem fazamento de memoria
        // Também pode ser feito com o for

        //try(BufferedReader reader = Files.newBufferedReader(caminhoArquivo)) {

            //String linha = "";
           // while((linha = reader.readLine()) != null) {

          //      System.out.println("->"+linha);

         //   }

        //}

    }

}
