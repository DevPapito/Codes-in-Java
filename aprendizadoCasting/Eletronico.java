public abstract class Eletronico extends Item {

    protected double forcaEletrica;

    public Eletronica(String nome, double peso, double forcaEletrica) {

        super(nome, peso);
        this.forcaEletrica = forcaEletrica;

    }

    public double getForcaEletrica() {

        return forcaEletrica;

    }

}
