import java.nio.file.Path;
import java.nio.file.Paths;


class TreinoPath2 {

    public static void main(String[] args) {

        String separator = System.getProperty("file.separator");

        Path defaultDir = Paths.get(System.getProperty("user.home")+separator+"Documents");

        // Criar diretorio em formato recursivo
        Path modManagerDir = Paths.get(defaultDir+separator+"modManager"+
                separator+"repository");

        Path minecraftDir = Paths.get(System.getenv("APPDATA")+separator+".minecraft");

        System.out.println(defaultDir);
        System.out.println(modManagerDir);
        System.out.println(minecraftDir);

        // retornar o arquivo mod
        Path caminhoMod = Paths.get(minecraftDir+separator+"mods"+separator+"espadas.jar");
        System.out.println(caminhoMod);
        System.out.println("Mod: "+caminhoMod.getFileName());
        System.out.println("Raiz: "+caminhoMod.getRoot());

    }

}
