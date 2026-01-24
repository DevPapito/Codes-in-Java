public abstract class ArmaDeMao extends Arma implements ValueAmmonPistol {

    protected int sizeAmmon;

    public ArmaDeMao(String nome, double dano, int municaoPrincipal, int municaoSecundaria) {

        super(nome, dano, municaoPrincipal, municaoSecundaria);

        if (municaoPrincipal > this.MAX_FIRST_AMMON || municaoSecundaria > this.MAX_SECOND_AMMON) {

            throw new RuntimeException("Invalid size ammon values int");

        }

    }


    @Override
    public void atirar() {

        if (municaoPrincipal == 0) {

            System.out.println("Tick tick! (MUNICAO ZERADA!)");
            return ;

        }

        System.out.println("Pow! Pow!");
        municaoPrincipal = (municaoPrincipal - 1);

    }


    @Override
    public void carregar() {

        if (municaoSecundaria == 0) {

            System.out.println("Merda! Sem municao reserva!");
            return ;

        }

        System.out.println("Carregado!");
        int municaoResto = (sizeAmmon - municaoPrincipal);
        municaoSecundaria = (municaoSecundaria - municaoResto);
        municaoPrincipal = municaoPrincipal + municaoResto;

    }

    @Override
    public String toString() {

        System.out.println("Class: HandGun");
        return super.toString();

    }

}
