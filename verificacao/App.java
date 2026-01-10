public class App {

    public static void main(String[] args) {

        Usuario user = new Usuario("Pedro");
        user.setIdade(17);
        Verificar ver = new Verificar(user);

    }

}
