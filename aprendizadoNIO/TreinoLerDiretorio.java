import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.DirectoryStream;

import java.io.IOException;

class TreinoLerDiretorio {

    public static void main(String[] args) throws IOException {

        String separator = System.getProperty("file.separator");

        Path full = Path.of(System.getProperty("user.dir")+
                separator+"lerDir"+
                separator+"A"+
                separator+"B"+
                separator+"arquivoOla.txt");

        Path dir = Path.of(System.getProperty("user.dir")+separator+"lerDir"+separator+"A"+separator+"B");

        Files.deleteIfExists(full);

        Files.createDirectories(full.getParent());
        Files.createFile(full);

        try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir,"*.txt")) {

            // Conjunto de Paths
            for (Path path : stream) {

                if (Files.isDirectory(path)) {

                    System.out.println("Directory: "+path.getFileName());

                }else {

                    System.out.println("File: "+path.getFileName());

                }

            }

        }

    }

}
