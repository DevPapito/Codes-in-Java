import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.DirectoryStream;

import java.nio.charset.StandardCharsets;

import java.io.IOException;
import java.io.BufferedWriter;

class App {

    public static final String SEPARATOR = System.getProperty("file.separator");

    public static String defaultDir = System.getProperty("user.dir");

    public static void main(String[] args) throws IOException {

        try {

        String name = args[1];

        if (args[0].equals("create")) {

            if (args[2].equals("-file")) {

                boolean verify = createFile(name);

                if (!verify) {

                    fatalError("Arquivo já existe");

                }

                System.out.println("Arquivo: "+name+" criado com sucesso!");

            }else if (args[2].equals("-dir")) {

                boolean verify = createDirectory(name);

                if (!verify) {

                    fatalError("Diretório já existe");

                }

                System.out.println("Diretorio: "+name+" criado com sucesso!");

            }else if (!args[2].equals("")) {

                System.out.println("flag invalida!");
                return ;

            }

        }

        if (args[0].equals("update")) {

            if (!args[2].isEmpty()) {

                boolean verify = update(name,args[2]);

                if (!verify) {

                    fatalError("Arquivo não encontrado");

                    return ;

                }

                System.out.println("Alteração de conteudo bem sucessidade!");

                return ;

            }

            fatalError("Campo de update de conteudo vazio!");

        }

        if (args[0].equals("delete")) {

            boolean verify = delete(name);

            if (!verify) {

                fatalError("Campo de update de conteudo vazio!");

                return ;

            }

            System.out.println("Remoção de conteudo bem sucedida!");

        }

        if (args[0].equals("move")) {

            if (!args[1].isEmpty()) {

                boolean verify = move(name, args[2]);

                System.out.println("Move de conteudo bem sucedida!");


            }

        }

        }catch(ArrayIndexOutOfBoundsException e) {

            System.out.println("Im possivel processeguir com comandos vazios ou incorretos!");
        }

    }

    private static Path verifyAndTransform(String name) {

        Path newFile = Path.of(defaultDir+SEPARATOR+name);

        if (Files.exists(newFile)) return null;

        return newFile;

    }

    public static boolean move(String name, String newDir) throws IOException {

        Path path = Path.of(defaultDir+SEPARATOR+name);
        Path dir = Path.of(defaultDir+SEPARATOR+newDir+SEPARATOR+name);

        Files.move(path,dir);

        return true;

    }

    public static boolean delete(String name) throws IOException {

        Path path = Path.of(defaultDir+SEPARATOR+name);

        return (Files.deleteIfExists(path)) ? true : false;

    }

    public static boolean update(String name, String newContent) throws IOException {

        try(DirectoryStream<Path> stream = Files.newDirectoryStream(Path.of(System.getProperty("user.dir")))) {

            for (Path path : stream) {

                if (path.toString().contains(name) && !Files.isDirectory(path)) {

                    try(BufferedWriter writer = Files.newBufferedWriter(path)) {

                        writer.write(newContent);

                    }

                    return true;
                }

            }

        }

        return false;

    }

    public static boolean createFile(String name) throws IOException {

        Path path = verifyAndTransform(name);

        if (path == null) return false;

        Files.createFile(path);

        return true;

    }

    public static boolean createDirectory(String name) throws IOException {

        Path path = verifyAndTransform(name);

        if (path == null) return false;

        Files.createDirectory(path);

        return true;

    }

    public static void fatalError(String message) {

        System.out.println(message);
        return ;

    }

}
