public class Verificar {

    public static final int IDADE_MINIMA = 18;

    public Verificar(Usuario usuario) {

        System.out.println("Verificado usuario: "+usuario.getNome());

        if (!verify(usuario.getIdade())) {

            System.out.println("Idade inválida!");
            System.out.println("Passagem não válida cai fora mlk!");

        }else {

            System.out.println("Idade válida!");
            System.out.println("Pode entrar bro!");

        }

    }

    public boolean verify(int idade) {

        if (idade < Verificar.IDADE_MINIMA)
            return false;
        return true;

    }

}
