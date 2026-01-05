public class ContaCorrente {

    public static final double LIMITE = 5000;

    private byte numero;
    private double saldo;
    private boolean status;

    public ContaCorrente(double saldo,boolean status) {

        this.numero = 0;
        this.saldo = saldo;
        this.status = status;

    }

    public double sacar(double valor) {

        if (saldo == 0)
            return -1.0;

        saldo = (saldo - valor);

        return valor;

    }

    public boolean depositar(double deposito) {

        if (deposito <= 0 || saldo >= ContaCorrente.LIMITE)
            return false;

        saldo = (saldo+deposito);

        return true;

    }

    @Override
    public String toString() {

        return String.format("Check Especial: %B%nSaldo: %s",
                status,
                saldo);

    }

}
