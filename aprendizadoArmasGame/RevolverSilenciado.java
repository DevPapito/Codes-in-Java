public class RevolverSilenciado extends Revolver implements ArmaSilenciada {

    public RevolverSilenciado(String nome, double dano) {

        super(nome, dano-2);

    }

    @Override
    public void atirarSilenciado() {

        if (municaoPrincipal == 0) {

            System.out.println("Tick tick! (MUNICAO ZERADA!)");
            return ;

        }

        System.out.println("Piwss! Piwss!");
        municaoPrincipal = (municaoPrincipal - 1);

    }

}
