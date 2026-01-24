public class Pistola extends ArmaDeMao {

    public Pistola(String nome, double dano) {

        super(nome, dano, MAX_FIRST_AMMON-10, MAX_SECOND_AMMON);

        sizeAmmon = MAX_FIRST_AMMON-10;

    }

}
