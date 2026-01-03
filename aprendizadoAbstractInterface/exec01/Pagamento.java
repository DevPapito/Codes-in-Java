public abstract class Pagamento {

    protected double valor;

    public Pagamento(double valor) {

        this.valor = valor;

    }


    public double getValor() {

        return valor;

    }

    public abstract void processar(double valor);


}
